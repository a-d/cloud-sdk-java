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
import com.sap.cloud.sdk.services.ai.model.ResourcesDetails;
import com.sap.cloud.sdk.services.ai.model.ScalingDetails;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Detail information about a deployment (including predefined sections: &#x60;scaling&#x60; and &#x60;resources&#x60;). JSON String representation of this object is limited to 5000 characters 
 */

// CHECKSTYLE:OFF
public class DeploymentDetails 
// CHECKSTYLE:ON
{
  @JsonProperty("scaling")
  private ScalingDetails scaling;

  @JsonProperty("resources")
  private ResourcesDetails resources;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the scaling of this {@link DeploymentDetails} instance and return the same instance.
   *
   * @param scaling  The scaling of this {@link DeploymentDetails}
   * @return The same instance of this {@link DeploymentDetails} class
   */
   @Nonnull public DeploymentDetails scaling(@Nonnull final ScalingDetails scaling) {
    this.scaling = scaling;
    return this;
  }

   /**
   * Get scaling
   * @return scaling  The scaling of this {@link DeploymentDetails} instance.
  **/
  @Nonnull public ScalingDetails getScaling() {
    return scaling;
  }

  /**
  * Set the scaling of this {@link DeploymentDetails} instance.
  *
  * @param scaling  The scaling of this {@link DeploymentDetails}
  */
  public void setScaling( @Nonnull final ScalingDetails scaling) {
    this.scaling = scaling;
  }

   /**
   * Set the resources of this {@link DeploymentDetails} instance and return the same instance.
   *
   * @param resources  The resources of this {@link DeploymentDetails}
   * @return The same instance of this {@link DeploymentDetails} class
   */
   @Nonnull public DeploymentDetails resources(@Nonnull final ResourcesDetails resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources  The resources of this {@link DeploymentDetails} instance.
  **/
  @Nonnull public ResourcesDetails getResources() {
    return resources;
  }

  /**
  * Set the resources of this {@link DeploymentDetails} instance.
  *
  * @param resources  The resources of this {@link DeploymentDetails}
  */
  public void setResources( @Nonnull final ResourcesDetails resources) {
    this.resources = resources;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link DeploymentDetails}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link DeploymentDetails} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("DeploymentDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link DeploymentDetails} instance. If the map previously contained a mapping
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
    final DeploymentDetails deploymentDetails = (DeploymentDetails) o;
    return Objects.equals(this.cloudSdkCustomFields, deploymentDetails.cloudSdkCustomFields) &&
        Objects.equals(this.scaling, deploymentDetails.scaling) &&
        Objects.equals(this.resources, deploymentDetails.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaling, resources, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDetails {\n");
    sb.append("    scaling: ").append(toIndentedString(scaling)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

