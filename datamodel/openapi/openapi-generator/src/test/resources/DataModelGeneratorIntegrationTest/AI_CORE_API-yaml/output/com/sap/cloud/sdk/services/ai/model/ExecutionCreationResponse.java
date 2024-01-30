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
import com.sap.cloud.sdk.services.ai.model.ExecutionCreationResponseMessage;
import com.sap.cloud.sdk.services.ai.model.ExecutionStatus;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * ExecutionCreationResponse
 */

// CHECKSTYLE:OFF
public class ExecutionCreationResponse 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("message")
  private ExecutionCreationResponseMessage message;

  @JsonProperty("status")
  private ExecutionStatus status;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link ExecutionCreationResponse} instance and return the same instance.
   *
   * @param id  Generic ID
   * @return The same instance of this {@link ExecutionCreationResponse} class
   */
   @Nonnull public ExecutionCreationResponse id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * Generic ID
   * @return id  The id of this {@link ExecutionCreationResponse} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link ExecutionCreationResponse} instance.
  *
  * @param id  Generic ID
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the message of this {@link ExecutionCreationResponse} instance and return the same instance.
   *
   * @param message  The message of this {@link ExecutionCreationResponse}
   * @return The same instance of this {@link ExecutionCreationResponse} class
   */
   @Nonnull public ExecutionCreationResponse message(@Nonnull final ExecutionCreationResponseMessage message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message  The message of this {@link ExecutionCreationResponse} instance.
  **/
  @Nonnull public ExecutionCreationResponseMessage getMessage() {
    return message;
  }

  /**
  * Set the message of this {@link ExecutionCreationResponse} instance.
  *
  * @param message  The message of this {@link ExecutionCreationResponse}
  */
  public void setMessage( @Nonnull final ExecutionCreationResponseMessage message) {
    this.message = message;
  }

   /**
   * Set the status of this {@link ExecutionCreationResponse} instance and return the same instance.
   *
   * @param status  The status of this {@link ExecutionCreationResponse}
   * @return The same instance of this {@link ExecutionCreationResponse} class
   */
   @Nonnull public ExecutionCreationResponse status(@Nonnull final ExecutionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status  The status of this {@link ExecutionCreationResponse} instance.
  **/
  @Nonnull public ExecutionStatus getStatus() {
    return status;
  }

  /**
  * Set the status of this {@link ExecutionCreationResponse} instance.
  *
  * @param status  The status of this {@link ExecutionCreationResponse}
  */
  public void setStatus( @Nonnull final ExecutionStatus status) {
    this.status = status;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ExecutionCreationResponse}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ExecutionCreationResponse} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ExecutionCreationResponse has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ExecutionCreationResponse} instance. If the map previously contained a mapping
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
    final ExecutionCreationResponse executionCreationResponse = (ExecutionCreationResponse) o;
    return Objects.equals(this.cloudSdkCustomFields, executionCreationResponse.cloudSdkCustomFields) &&
        Objects.equals(this.id, executionCreationResponse.id) &&
        Objects.equals(this.message, executionCreationResponse.message) &&
        Objects.equals(this.status, executionCreationResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, status, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionCreationResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

