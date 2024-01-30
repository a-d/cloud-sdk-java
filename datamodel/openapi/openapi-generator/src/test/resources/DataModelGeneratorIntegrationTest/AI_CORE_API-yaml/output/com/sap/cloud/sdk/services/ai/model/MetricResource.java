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
import com.sap.cloud.sdk.services.ai.model.CustomInfoObject;
import com.sap.cloud.sdk.services.ai.model.ExecutionId2;
import com.sap.cloud.sdk.services.ai.model.Metric;
import com.sap.cloud.sdk.services.ai.model.Tag;
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
 * Collection of various metrics/tags/labels associated against some execution/deployment
 */

// CHECKSTYLE:OFF
public class MetricResource 
// CHECKSTYLE:ON
{
  @JsonProperty("executionId")
  private ExecutionId2 executionId;

  @JsonProperty("metrics")
  private List<Metric> metrics;

  @JsonProperty("tags")
  private List<Tag> tags;

  @JsonProperty("customInfo")
  private List<CustomInfoObject> customInfo;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the executionId of this {@link MetricResource} instance and return the same instance.
   *
   * @param executionId  The executionId of this {@link MetricResource}
   * @return The same instance of this {@link MetricResource} class
   */
   @Nonnull public MetricResource executionId(@Nonnull final ExecutionId2 executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * Get executionId
   * @return executionId  The executionId of this {@link MetricResource} instance.
  **/
  @Nonnull public ExecutionId2 getExecutionId() {
    return executionId;
  }

  /**
  * Set the executionId of this {@link MetricResource} instance.
  *
  * @param executionId  The executionId of this {@link MetricResource}
  */
  public void setExecutionId( @Nonnull final ExecutionId2 executionId) {
    this.executionId = executionId;
  }

   /**
   * Set the metrics of this {@link MetricResource} instance and return the same instance.
   *
   * @param metrics  Array of Metric items
   * @return The same instance of this {@link MetricResource} class
   */
   @Nonnull public MetricResource metrics(@Nonnull final List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }
  /**
  * Add one Metrics instance to this {@link MetricResource}.
  * @param metricsItem The Metrics that should be added
  * @return The same instance of type {@link MetricResource}
  */
  @Nonnull public MetricResource addMetricsItem( @Nonnull final Metric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Array of Metric items
   * @return metrics  The metrics of this {@link MetricResource} instance.
  **/
  @Nonnull public List<Metric> getMetrics() {
    return metrics;
  }

  /**
  * Set the metrics of this {@link MetricResource} instance.
  *
  * @param metrics  Array of Metric items
  */
  public void setMetrics( @Nonnull final List<Metric> metrics) {
    this.metrics = metrics;
  }

   /**
   * Set the tags of this {@link MetricResource} instance and return the same instance.
   *
   * @param tags  a list of name-value object pairs associated with the execution/deployment. Tags are queryable.
   * @return The same instance of this {@link MetricResource} class
   */
   @Nonnull public MetricResource tags(@Nonnull final List<Tag> tags) {
    this.tags = tags;
    return this;
  }
  /**
  * Add one Tags instance to this {@link MetricResource}.
  * @param tagsItem The Tags that should be added
  * @return The same instance of type {@link MetricResource}
  */
  @Nonnull public MetricResource addTagsItem( @Nonnull final Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * a list of name-value object pairs associated with the execution/deployment. Tags are queryable.
   * @return tags  The tags of this {@link MetricResource} instance.
  **/
  @Nonnull public List<Tag> getTags() {
    return tags;
  }

  /**
  * Set the tags of this {@link MetricResource} instance.
  *
  * @param tags  a list of name-value object pairs associated with the execution/deployment. Tags are queryable.
  */
  public void setTags( @Nonnull final List<Tag> tags) {
    this.tags = tags;
  }

   /**
   * Set the customInfo of this {@link MetricResource} instance and return the same instance.
   *
   * @param customInfo  The customInfo of this {@link MetricResource}
   * @return The same instance of this {@link MetricResource} class
   */
   @Nonnull public MetricResource customInfo(@Nonnull final List<CustomInfoObject> customInfo) {
    this.customInfo = customInfo;
    return this;
  }
  /**
  * Add one CustomInfo instance to this {@link MetricResource}.
  * @param customInfoItem The CustomInfo that should be added
  * @return The same instance of type {@link MetricResource}
  */
  @Nonnull public MetricResource addCustomInfoItem( @Nonnull final CustomInfoObject customInfoItem) {
    if (this.customInfo == null) {
      this.customInfo = new ArrayList<>();
    }
    this.customInfo.add(customInfoItem);
    return this;
  }

   /**
   * Get customInfo
   * @return customInfo  The customInfo of this {@link MetricResource} instance.
  **/
  @Nonnull public List<CustomInfoObject> getCustomInfo() {
    return customInfo;
  }

  /**
  * Set the customInfo of this {@link MetricResource} instance.
  *
  * @param customInfo  The customInfo of this {@link MetricResource}
  */
  public void setCustomInfo( @Nonnull final List<CustomInfoObject> customInfo) {
    this.customInfo = customInfo;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link MetricResource}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link MetricResource} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("MetricResource has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link MetricResource} instance. If the map previously contained a mapping
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
    final MetricResource metricResource = (MetricResource) o;
    return Objects.equals(this.cloudSdkCustomFields, metricResource.cloudSdkCustomFields) &&
        Objects.equals(this.executionId, metricResource.executionId) &&
        Objects.equals(this.metrics, metricResource.metrics) &&
        Objects.equals(this.tags, metricResource.tags) &&
        Objects.equals(this.customInfo, metricResource.customInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionId, metrics, tags, customInfo, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class MetricResource {\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customInfo: ").append(toIndentedString(customInfo)).append("\n");
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

