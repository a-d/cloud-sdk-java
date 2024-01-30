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
 * Service
 */

// CHECKSTYLE:OFF
public class Service 
// CHECKSTYLE:ON
{
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("url")
  private String url;

  /**
   * aggregated status of the service
   */
  public enum StatusEnum {
    /**
    * The PROVISIONED option of this Service
    */
    PROVISIONED("PROVISIONED"),
    
    /**
    * The ERROR option of this Service
    */
    ERROR("ERROR"),
    
    /**
    * The PROVISIONING option of this Service
    */
    PROVISIONING("PROVISIONING"),
    
    /**
    * The DEPROVISIONING option of this Service
    */
    DEPROVISIONING("DEPROVISIONING");

    private String value;

    StatusEnum(String value) {
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
    * @return The enum value of type Service
    */
    @JsonCreator
    @Nonnull public static StatusEnum fromValue(@Nonnull final String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("statusMessage")
  private String statusMessage;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the name of this {@link Service} instance and return the same instance.
   *
   * @param name  service name
   * @return The same instance of this {@link Service} class
   */
   @Nonnull public Service name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * service name
   * @return name  The name of this {@link Service} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link Service} instance.
  *
  * @param name  service name
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
   * Set the description of this {@link Service} instance and return the same instance.
   *
   * @param description  service description
   * @return The same instance of this {@link Service} class
   */
   @Nonnull public Service description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * service description
   * @return description  The description of this {@link Service} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link Service} instance.
  *
  * @param description  service description
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
   * Set the url of this {@link Service} instance and return the same instance.
   *
   * @param url  service broker url
   * @return The same instance of this {@link Service} class
   */
   @Nonnull public Service url(@Nonnull final String url) {
    this.url = url;
    return this;
  }

   /**
   * service broker url
   * @return url  The url of this {@link Service} instance.
  **/
  @Nonnull public String getUrl() {
    return url;
  }

  /**
  * Set the url of this {@link Service} instance.
  *
  * @param url  service broker url
  */
  public void setUrl( @Nonnull final String url) {
    this.url = url;
  }

   /**
   * Set the status of this {@link Service} instance and return the same instance.
   *
   * @param status  aggregated status of the service
   * @return The same instance of this {@link Service} class
   */
   @Nonnull public Service status(@Nonnull final StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * aggregated status of the service
   * @return status  The status of this {@link Service} instance.
  **/
  @Nonnull public StatusEnum getStatus() {
    return status;
  }

  /**
  * Set the status of this {@link Service} instance.
  *
  * @param status  aggregated status of the service
  */
  public void setStatus( @Nonnull final StatusEnum status) {
    this.status = status;
  }

   /**
   * Set the statusMessage of this {@link Service} instance and return the same instance.
   *
   * @param statusMessage  status message
   * @return The same instance of this {@link Service} class
   */
   @Nonnull public Service statusMessage(@Nonnull final String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * status message
   * @return statusMessage  The statusMessage of this {@link Service} instance.
  **/
  @Nonnull public String getStatusMessage() {
    return statusMessage;
  }

  /**
  * Set the statusMessage of this {@link Service} instance.
  *
  * @param statusMessage  status message
  */
  public void setStatusMessage( @Nonnull final String statusMessage) {
    this.statusMessage = statusMessage;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link Service}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link Service} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("Service has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link Service} instance. If the map previously contained a mapping
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
    final Service service = (Service) o;
    return Objects.equals(this.cloudSdkCustomFields, service.cloudSdkCustomFields) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.url, service.url) &&
        Objects.equals(this.status, service.status) &&
        Objects.equals(this.statusMessage, service.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, url, status, statusMessage, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

