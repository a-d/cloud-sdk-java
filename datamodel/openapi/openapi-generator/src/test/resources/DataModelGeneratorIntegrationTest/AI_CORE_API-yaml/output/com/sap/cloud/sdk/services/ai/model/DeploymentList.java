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
import com.sap.cloud.sdk.services.ai.model.Deployment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * DeploymentList
 */

// CHECKSTYLE:OFF
public class DeploymentList 
// CHECKSTYLE:ON
{
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("resources")
  private List<Deployment> resources = new ArrayList<>();

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the count of this {@link DeploymentList} instance and return the same instance.
   *
   * @param count  Number of the resource instances in the list
   * @return The same instance of this {@link DeploymentList} class
   */
   @Nonnull public DeploymentList count(@Nonnull final Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of the resource instances in the list
   * @return count  The count of this {@link DeploymentList} instance.
  **/
  @Nonnull public Integer getCount() {
    return count;
  }

  /**
  * Set the count of this {@link DeploymentList} instance.
  *
  * @param count  Number of the resource instances in the list
  */
  public void setCount( @Nonnull final Integer count) {
    this.count = count;
  }

   /**
   * Set the resources of this {@link DeploymentList} instance and return the same instance.
   *
   * @param resources  The resources of this {@link DeploymentList}
   * @return The same instance of this {@link DeploymentList} class
   */
   @Nonnull public DeploymentList resources(@Nonnull final List<Deployment> resources) {
    this.resources = resources;
    return this;
  }
  /**
  * Add one Resources instance to this {@link DeploymentList}.
  * @param resourcesItem The Resources that should be added
  * @return The same instance of type {@link DeploymentList}
  */
  @Nonnull public DeploymentList addResourcesItem( @Nonnull final Deployment resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources  The resources of this {@link DeploymentList} instance.
  **/
  @Nonnull public List<Deployment> getResources() {
    return resources;
  }

  /**
  * Set the resources of this {@link DeploymentList} instance.
  *
  * @param resources  The resources of this {@link DeploymentList}
  */
  public void setResources( @Nonnull final List<Deployment> resources) {
    this.resources = resources;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link DeploymentList}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link DeploymentList} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("DeploymentList has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link DeploymentList} instance. If the map previously contained a mapping
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
    final DeploymentList deploymentList = (DeploymentList) o;
    return Objects.equals(this.cloudSdkCustomFields, deploymentList.cloudSdkCustomFields) &&
        Objects.equals(this.count, deploymentList.count) &&
        Objects.equals(this.resources, deploymentList.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, resources, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentList {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

