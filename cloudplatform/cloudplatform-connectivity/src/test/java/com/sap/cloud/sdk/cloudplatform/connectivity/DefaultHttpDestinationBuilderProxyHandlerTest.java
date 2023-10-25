package com.sap.cloud.sdk.cloudplatform.connectivity;

import static com.sap.cloud.sdk.cloudplatform.connectivity.ServiceBindingDestinationOptions.Options.ProxyOptions;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;

import java.net.URI;

import javax.annotation.Nonnull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mockito;

import com.google.common.collect.ImmutableMap;
import com.sap.cloud.environment.servicebinding.api.DefaultServiceBindingBuilder;
import com.sap.cloud.environment.servicebinding.api.ServiceBinding;
import com.sap.cloud.environment.servicebinding.api.ServiceIdentifier;
import com.sap.cloud.sdk.cloudplatform.security.AuthToken;
import com.sap.cloud.sdk.cloudplatform.security.AuthTokenAccessor;
import com.sap.cloud.sdk.cloudplatform.security.BasicCredentials;

import io.vavr.control.Try;

public class DefaultHttpDestinationBuilderProxyHandlerTest
{
    private static final AuthToken token1 = mock(AuthToken.class, Answers.RETURNS_DEEP_STUBS);
    private static final ServiceBinding connectivityService =
        new DefaultServiceBindingBuilder()
            .withServiceIdentifier(ServiceIdentifier.CONNECTIVITY)
            .withCredentials(
                ImmutableMap
                    .<String, Object> builder()
                    .put("clientid", "CLIENT_ID")
                    .put("clientsecret", "CLIENT_SECRET")
                    .put("url", "http://localhost:8888/xsuaa")
                    .put("onpremise_proxy_host", "localhost")
                    .put("onpremise_proxy_port", "8888")
                    .build())
            .build();

    private final ServiceBindingDestinationLoader destinationLoader = spy(new ServiceBindingDestinationLoader()
    {
        @Nonnull
        @Override
        public Try<HttpDestination> tryGetDestination( @Nonnull ServiceBindingDestinationOptions options )
        {
            return Try.success(mock(DefaultHttpDestination.class));
        }
    });

    @Before
    @After
    public void clean()
    {
        AuthTokenAccessor.setAuthTokenFacade(null);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(null);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(null);
    }

    @Test
    public void testNoProxy()
    {
        final DefaultHttpDestination.Builder builder = DefaultHttpDestination.builder("http://foo");

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNull();
        verifyNoInteractions(destinationLoader);
    }

    @Test
    public void testNoOnProxy()
    {
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination.builder("http://foo").proxyType(ProxyType.INTERNET);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNull();
        verifyNoInteractions(destinationLoader);
    }

    @Test
    public void testNoConnectivity()
    {
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination.builder("http://foo").proxyType(ProxyType.ON_PREMISE);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNull();
        verifyNoInteractions(destinationLoader);
    }

    @Test
    public void testNoAuth()
    {
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination.builder(uri).proxyType(ProxyType.ON_PREMISE);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNotNull();
        verify(destinationLoader).tryGetDestination(argThat(options -> {
            return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                && options.getServiceBinding() == connectivityService
                && uri.equals(options.getOption(ProxyOptions.class).get().getUri())
                && options.getOption(ProxyOptions.class).get().getHeaders().isEmpty();
        }));
    }

    @Test
    public void testNotPrincipalPropagation()
    {
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final BasicCredentials basicCredentials = new BasicCredentials("foo", "bar");
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination.builder(uri).proxyType(ProxyType.ON_PREMISE).basicCredentials(basicCredentials);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNotNull();
        verify(destinationLoader).tryGetDestination(argThat(options -> {
            final Header basicHeader = new Header("Authorization", basicCredentials.getHttpHeaderValue());
            return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                && options.getServiceBinding() == connectivityService
                && uri.equals(options.getOption(ProxyOptions.class).get().getUri())
                && options.getOption(ProxyOptions.class).get().getHeaders().contains(basicHeader);
        }));
    }

    @Test
    public void testPrincipalPropagationDefault()
    {
        AuthTokenAccessor.setAuthTokenFacade(() -> Try.success(token1));
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination
                .builder(uri)
                .proxyType(ProxyType.ON_PREMISE)
                .authenticationType(AuthenticationType.PRINCIPAL_PROPAGATION);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNotNull();
        verify(destinationLoader).tryGetDestination(argThat(options -> {
            final HttpDestination proxied = options.getOption(ProxyOptions.class).get();
            final String expectedHeader = "SAP-Connectivity-Authentication";
            return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                && options.getServiceBinding() == connectivityService
                && uri.equals(proxied.getUri())
                && proxied.getHeaders().stream().anyMatch(h -> h.getName().equalsIgnoreCase(expectedHeader));
        }));
    }

    @Test
    public void testPrincipalPropagationCompatibility()
    {
        AuthTokenAccessor.setAuthTokenFacade(() -> Try.success(token1));
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination
                .builder(uri)
                .proxyType(ProxyType.ON_PREMISE)
                .authenticationType(AuthenticationType.PRINCIPAL_PROPAGATION)
                .property(DestinationProperty.PRINCIPAL_PROPAGATION_MODE, PrincipalPropagationMode.COMPATIBILITY);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNotNull();
        verify(destinationLoader).tryGetDestination(argThat(options -> {
            final HttpDestination proxied = options.getOption(ProxyOptions.class).get();
            final String expectedHeader = "SAP-Connectivity-Authentication";
            return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                && options.getServiceBinding() == connectivityService
                && uri.equals(options.getOption(ProxyOptions.class).get().getUri())
                && proxied.getHeaders().stream().anyMatch(h -> h.getName().equalsIgnoreCase(expectedHeader));
        }));
    }

    @Test
    public void testPrincipalPropagationRecommended()
    {
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestination.Builder builder =
            DefaultHttpDestination
                .builder(uri)
                .proxyType(ProxyType.ON_PREMISE)
                .authenticationType(AuthenticationType.PRINCIPAL_PROPAGATION)
                .property(DestinationProperty.PRINCIPAL_PROPAGATION_MODE, PrincipalPropagationMode.RECOMMENDED);

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNotNull();
        verify(destinationLoader).tryGetDestination(argThat(options -> {
            return OnBehalfOf.NAMED_USER_CURRENT_TENANT == options.getOnBehalfOf()
                && options.getServiceBinding() == connectivityService
                && uri.equals(options.getOption(ProxyOptions.class).get().getUri())
                && options.getOption(ProxyOptions.class).get().getHeaders().isEmpty();
        }));
    }

    @Test
    public void testNoAuthWithTenantId()
    {
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestinationBuilderProxyHandler sut = new DefaultHttpDestinationBuilderProxyHandler();

        // provider tenant
        {
            final DefaultHttpDestination.Builder builder =
                DefaultHttpDestination
                    .builder(uri)
                    .proxyType(ProxyType.ON_PREMISE)
                    .property(DestinationProperty.TENANT_ID, ""); // "" = provider

            // test
            final DefaultHttpDestination result = sut.handle(builder);

            assertThat(result).isNotNull();
            verify(destinationLoader).tryGetDestination(argThat(options -> {
                return OnBehalfOf.TECHNICAL_USER_PROVIDER == options.getOnBehalfOf()
                    && options.getServiceBinding() == connectivityService
                    && uri.equals(options.getOption(ProxyOptions.class).get().getUri());
            }));
        }

        Mockito.clearInvocations(destinationLoader);

        // subscriber tenant
        {
            final DefaultHttpDestination.Builder builder =
                DefaultHttpDestination
                    .builder(uri)
                    .proxyType(ProxyType.ON_PREMISE)
                    .property(DestinationProperty.TENANT_ID, "subscriber"); // "" = provider

            // test
            final DefaultHttpDestination result = sut.handle(builder);

            assertThat(result).isNotNull();
            verify(destinationLoader).tryGetDestination(argThat(options -> {
                return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                    && options.getServiceBinding() == connectivityService
                    && uri.equals(options.getOption(ProxyOptions.class).get().getUri());
            }));
        }
    }

    @Test
    public void testPrincipalPropagationWithTenantId()
    {
        AuthTokenAccessor.setAuthTokenFacade(() -> Try.success(token1));
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingDestinationLoader(destinationLoader);
        DefaultHttpDestinationBuilderProxyHandler.setServiceBindingConnectivity(connectivityService);

        final URI uri = URI.create("http://foo");
        final DefaultHttpDestinationBuilderProxyHandler sut = new DefaultHttpDestinationBuilderProxyHandler();

        // provider tenant
        {
            final DefaultHttpDestination.Builder builder =
                DefaultHttpDestination
                    .builder(uri)
                    .proxyType(ProxyType.ON_PREMISE)
                    .authenticationType(AuthenticationType.PRINCIPAL_PROPAGATION)
                    .property(DestinationProperty.TENANT_ID, ""); // "" = provider

            // test
            final DefaultHttpDestination result = sut.handle(builder);

            assertThat(result).isNotNull();
            verify(destinationLoader).tryGetDestination(argThat(options -> {
                return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                    && options.getServiceBinding() == connectivityService
                    && uri.equals(options.getOption(ProxyOptions.class).get().getUri());
            }));
        }

        Mockito.clearInvocations(destinationLoader);

        // subscriber tenant
        {
            final DefaultHttpDestination.Builder builder =
                DefaultHttpDestination
                    .builder(uri)
                    .proxyType(ProxyType.ON_PREMISE)
                    .authenticationType(AuthenticationType.PRINCIPAL_PROPAGATION)
                    .property(DestinationProperty.TENANT_ID, "subscriber"); // "" = provider

            // test
            final DefaultHttpDestination result = sut.handle(builder);

            assertThat(result).isNotNull();
            verify(destinationLoader).tryGetDestination(argThat(options -> {
                return OnBehalfOf.TECHNICAL_USER_CURRENT_TENANT == options.getOnBehalfOf()
                    && options.getServiceBinding() == connectivityService
                    && uri.equals(options.getOption(ProxyOptions.class).get().getUri());
            }));
        }
    }

    @Test
    public void testNotProxyTheProxy()
    {
        final DefaultHttpDestination.Builder builder1 = DefaultHttpDestination.builder("http://foo");
        final DefaultHttpDestination.Builder builder = DefaultHttpDestination.fromDestination(builder1.build());

        // test
        final DefaultHttpDestination result = new DefaultHttpDestinationBuilderProxyHandler().handle(builder);

        assertThat(result).isNull();
        verifyNoInteractions(destinationLoader);
    }

}