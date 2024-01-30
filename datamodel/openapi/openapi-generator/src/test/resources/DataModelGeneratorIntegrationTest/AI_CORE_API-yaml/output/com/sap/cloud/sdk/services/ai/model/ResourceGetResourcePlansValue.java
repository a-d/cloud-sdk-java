/*
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models. 
 *
 * The version of the OpenAPI document: 2.26.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.cloud.sdk.services.ai.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * ResourceGetResourcePlansValue
 */

// CHECKSTYLE:OFF
public class ResourceGetResourcePlansValue 
// CHECKSTYLE:ON
{
  @JsonProperty("provisioned")
  private Integer provisioned;

  @JsonProperty("requested")
  private Integer requested;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the provisioned of this {@link ResourceGetResourcePlansValue} instance and return the same instance.
   *
   * @param provisioned  The provisioned of this {@link ResourceGetResourcePlansValue}
   * @return The same instance of this {@link ResourceGetResourcePlansValue} class
   */
   @Nonnull public ResourceGetResourcePlansValue provisioned(@Nonnull final Integer provisioned) {
    this.provisioned = provisioned;
    return this;
  }

   /**
   * Get provisioned
   * @return provisioned  The provisioned of this {@link ResourceGetResourcePlansValue} instance.
  **/
  @Nonnull public Integer getProvisioned() {
    return provisioned;
  }

  /**
  * Set the provisioned of this {@link ResourceGetResourcePlansValue} instance.
  *
  * @param provisioned  The provisioned of this {@link ResourceGetResourcePlansValue}
  */
  public void setProvisioned( @Nonnull final Integer provisioned) {
    this.provisioned = provisioned;
  }

   /**
   * Set the requested of this {@link ResourceGetResourcePlansValue} instance and return the same instance.
   *
   * @param requested  The requested of this {@link ResourceGetResourcePlansValue}
   * @return The same instance of this {@link ResourceGetResourcePlansValue} class
   */
   @Nonnull public ResourceGetResourcePlansValue requested(@Nonnull final Integer requested) {
    this.requested = requested;
    return this;
  }

   /**
   * Get requested
   * @return requested  The requested of this {@link ResourceGetResourcePlansValue} instance.
  **/
  @Nonnull public Integer getRequested() {
    return requested;
  }

  /**
  * Set the requested of this {@link ResourceGetResourcePlansValue} instance.
  *
  * @param requested  The requested of this {@link ResourceGetResourcePlansValue}
  */
  public void setRequested( @Nonnull final Integer requested) {
    this.requested = requested;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ResourceGetResourcePlansValue}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ResourceGetResourcePlansValue} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ResourceGetResourcePlansValue has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ResourceGetResourcePlansValue} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
      cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }


  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final ResourceGetResourcePlansValue resourceGetResourcePlansValue = (ResourceGetResourcePlansValue) o;
    return Objects.equals(this.cloudSdkCustomFields, resourceGetResourcePlansValue.cloudSdkCustomFields) &&
        Objects.equals(this.provisioned, resourceGetResourcePlansValue.provisioned) &&
        Objects.equals(this.requested, resourceGetResourcePlansValue.requested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provisioned, requested, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ResourceGetResourcePlansValue {\n");
    sb.append("    provisioned: ").append(toIndentedString(provisioned)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

