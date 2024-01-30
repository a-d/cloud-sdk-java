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
import com.sap.cloud.sdk.services.ai.model.ExecutionId;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Request object for changing the target status of an execution (currently STOPPED and DELETED are supported)
 */

// CHECKSTYLE:OFF
public class ExecutionModificationRequestWithIdentifier 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private ExecutionId id;

  /**
   * Desired target status of the execution (currently STOPPED and DELETED are supported)
   */
  public enum TargetStatusEnum {
    /**
    * The STOPPED option of this ExecutionModificationRequestWithIdentifier
    */
    STOPPED("STOPPED"),
    
    /**
    * The DELETED option of this ExecutionModificationRequestWithIdentifier
    */
    DELETED("DELETED");

    private String value;

    TargetStatusEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The String value
    * @return The enum value of type ExecutionModificationRequestWithIdentifier
    */
    @JsonCreator
    @Nonnull public static TargetStatusEnum fromValue(@Nonnull final String value) {
      for (TargetStatusEnum b : TargetStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("targetStatus")
  private TargetStatusEnum targetStatus;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link ExecutionModificationRequestWithIdentifier} instance and return the same instance.
   *
   * @param id  The id of this {@link ExecutionModificationRequestWithIdentifier}
   * @return The same instance of this {@link ExecutionModificationRequestWithIdentifier} class
   */
   @Nonnull public ExecutionModificationRequestWithIdentifier id(@Nonnull final ExecutionId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id  The id of this {@link ExecutionModificationRequestWithIdentifier} instance.
  **/
  @Nonnull public ExecutionId getId() {
    return id;
  }

  /**
  * Set the id of this {@link ExecutionModificationRequestWithIdentifier} instance.
  *
  * @param id  The id of this {@link ExecutionModificationRequestWithIdentifier}
  */
  public void setId( @Nonnull final ExecutionId id) {
    this.id = id;
  }

   /**
   * Set the targetStatus of this {@link ExecutionModificationRequestWithIdentifier} instance and return the same instance.
   *
   * @param targetStatus  Desired target status of the execution (currently STOPPED and DELETED are supported)
   * @return The same instance of this {@link ExecutionModificationRequestWithIdentifier} class
   */
   @Nonnull public ExecutionModificationRequestWithIdentifier targetStatus(@Nonnull final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
    return this;
  }

   /**
   * Desired target status of the execution (currently STOPPED and DELETED are supported)
   * @return targetStatus  The targetStatus of this {@link ExecutionModificationRequestWithIdentifier} instance.
  **/
  @Nonnull public TargetStatusEnum getTargetStatus() {
    return targetStatus;
  }

  /**
  * Set the targetStatus of this {@link ExecutionModificationRequestWithIdentifier} instance.
  *
  * @param targetStatus  Desired target status of the execution (currently STOPPED and DELETED are supported)
  */
  public void setTargetStatus( @Nonnull final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ExecutionModificationRequestWithIdentifier}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ExecutionModificationRequestWithIdentifier} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ExecutionModificationRequestWithIdentifier has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ExecutionModificationRequestWithIdentifier} instance. If the map previously contained a mapping
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
    final ExecutionModificationRequestWithIdentifier executionModificationRequestWithIdentifier = (ExecutionModificationRequestWithIdentifier) o;
    return Objects.equals(this.cloudSdkCustomFields, executionModificationRequestWithIdentifier.cloudSdkCustomFields) &&
        Objects.equals(this.id, executionModificationRequestWithIdentifier.id) &&
        Objects.equals(this.targetStatus, executionModificationRequestWithIdentifier.targetStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetStatus, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionModificationRequestWithIdentifier {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
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

