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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * StatusTransitionTime
 */

// CHECKSTYLE:OFF
public class StatusTransitionTime 
// CHECKSTYLE:ON
{
  @JsonProperty("submissionTime")
  private OffsetDateTime submissionTime;

  @JsonProperty("startTime")
  private OffsetDateTime startTime;

  @JsonProperty("completionTime")
  private OffsetDateTime completionTime;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the submissionTime of this {@link StatusTransitionTime} instance and return the same instance.
   *
   * @param submissionTime  Timestamp of job submitted
   * @return The same instance of this {@link StatusTransitionTime} class
   */
   @Nonnull public StatusTransitionTime submissionTime(@Nonnull final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * Timestamp of job submitted
   * @return submissionTime  The submissionTime of this {@link StatusTransitionTime} instance.
  **/
  @Nonnull public OffsetDateTime getSubmissionTime() {
    return submissionTime;
  }

  /**
  * Set the submissionTime of this {@link StatusTransitionTime} instance.
  *
  * @param submissionTime  Timestamp of job submitted
  */
  public void setSubmissionTime( @Nonnull final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

   /**
   * Set the startTime of this {@link StatusTransitionTime} instance and return the same instance.
   *
   * @param startTime  Timestamp of job status changed to RUNNING
   * @return The same instance of this {@link StatusTransitionTime} class
   */
   @Nonnull public StatusTransitionTime startTime(@Nonnull final OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp of job status changed to RUNNING
   * @return startTime  The startTime of this {@link StatusTransitionTime} instance.
  **/
  @Nonnull public OffsetDateTime getStartTime() {
    return startTime;
  }

  /**
  * Set the startTime of this {@link StatusTransitionTime} instance.
  *
  * @param startTime  Timestamp of job status changed to RUNNING
  */
  public void setStartTime( @Nonnull final OffsetDateTime startTime) {
    this.startTime = startTime;
  }

   /**
   * Set the completionTime of this {@link StatusTransitionTime} instance and return the same instance.
   *
   * @param completionTime  Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   * @return The same instance of this {@link StatusTransitionTime} class
   */
   @Nonnull public StatusTransitionTime completionTime(@Nonnull final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   * @return completionTime  The completionTime of this {@link StatusTransitionTime} instance.
  **/
  @Nonnull public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  /**
  * Set the completionTime of this {@link StatusTransitionTime} instance.
  *
  * @param completionTime  Timestamp of job status changed to COMPLETED/DEAD/STOPPED
  */
  public void setCompletionTime( @Nonnull final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link StatusTransitionTime}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link StatusTransitionTime} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("StatusTransitionTime has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link StatusTransitionTime} instance. If the map previously contained a mapping
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
    final StatusTransitionTime statusTransitionTime = (StatusTransitionTime) o;
    return Objects.equals(this.cloudSdkCustomFields, statusTransitionTime.cloudSdkCustomFields) &&
        Objects.equals(this.submissionTime, statusTransitionTime.submissionTime) &&
        Objects.equals(this.startTime, statusTransitionTime.startTime) &&
        Objects.equals(this.completionTime, statusTransitionTime.completionTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionTime, startTime, completionTime, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class StatusTransitionTime {\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
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

