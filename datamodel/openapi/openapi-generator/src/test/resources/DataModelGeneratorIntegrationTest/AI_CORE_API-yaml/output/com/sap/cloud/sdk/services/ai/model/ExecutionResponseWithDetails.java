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
import com.sap.cloud.sdk.services.ai.model.Artifact;
import com.sap.cloud.sdk.services.ai.model.ConfigurationId;
import com.sap.cloud.sdk.services.ai.model.ConfigurationName;
import com.sap.cloud.sdk.services.ai.model.ExecutionId;
import com.sap.cloud.sdk.services.ai.model.ExecutionScheduleId;
import com.sap.cloud.sdk.services.ai.model.ExecutionStatus;
import com.sap.cloud.sdk.services.ai.model.ExecutionStatusMessage;
import com.sap.cloud.sdk.services.ai.model.ScenarioId;
import java.time.OffsetDateTime;
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
 * ExecutionResponseWithDetails
 */

// CHECKSTYLE:OFF
public class ExecutionResponseWithDetails 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private ExecutionId id;

  @JsonProperty("configurationId")
  private ConfigurationId configurationId;

  @JsonProperty("configurationName")
  private ConfigurationName configurationName;

  @JsonProperty("scenarioId")
  private ScenarioId scenarioId;

  /**
   * Target status of the execution
   */
  public enum TargetStatusEnum {
    /**
    * The COMPLETED option of this ExecutionResponseWithDetails
    */
    COMPLETED("COMPLETED"),
    
    /**
    * The RUNNING option of this ExecutionResponseWithDetails
    */
    RUNNING("RUNNING"),
    
    /**
    * The STOPPED option of this ExecutionResponseWithDetails
    */
    STOPPED("STOPPED"),
    
    /**
    * The DELETED option of this ExecutionResponseWithDetails
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
    * @return The enum value of type ExecutionResponseWithDetails
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

  @JsonProperty("status")
  private ExecutionStatus status;

  @JsonProperty("statusMessage")
  private ExecutionStatusMessage statusMessage;

  @JsonProperty("outputArtifacts")
  private List<Artifact> outputArtifacts;

  @JsonProperty("executionScheduleId")
  private ExecutionScheduleId executionScheduleId;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt;

  @JsonProperty("submissionTime")
  private OffsetDateTime submissionTime;

  @JsonProperty("startTime")
  private OffsetDateTime startTime;

  @JsonProperty("completionTime")
  private OffsetDateTime completionTime;

  @JsonProperty("statusDetails")
  private Object statusDetails;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param id  The id of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails id(@Nonnull final ExecutionId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id  The id of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ExecutionId getId() {
    return id;
  }

  /**
  * Set the id of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param id  The id of this {@link ExecutionResponseWithDetails}
  */
  public void setId( @Nonnull final ExecutionId id) {
    this.id = id;
  }

   /**
   * Set the configurationId of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param configurationId  The configurationId of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails configurationId(@Nonnull final ConfigurationId configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId  The configurationId of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ConfigurationId getConfigurationId() {
    return configurationId;
  }

  /**
  * Set the configurationId of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param configurationId  The configurationId of this {@link ExecutionResponseWithDetails}
  */
  public void setConfigurationId( @Nonnull final ConfigurationId configurationId) {
    this.configurationId = configurationId;
  }

   /**
   * Set the configurationName of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param configurationName  The configurationName of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails configurationName(@Nonnull final ConfigurationName configurationName) {
    this.configurationName = configurationName;
    return this;
  }

   /**
   * Get configurationName
   * @return configurationName  The configurationName of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ConfigurationName getConfigurationName() {
    return configurationName;
  }

  /**
  * Set the configurationName of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param configurationName  The configurationName of this {@link ExecutionResponseWithDetails}
  */
  public void setConfigurationName( @Nonnull final ConfigurationName configurationName) {
    this.configurationName = configurationName;
  }

   /**
   * Set the scenarioId of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param scenarioId  The scenarioId of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails scenarioId(@Nonnull final ScenarioId scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * Get scenarioId
   * @return scenarioId  The scenarioId of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ScenarioId getScenarioId() {
    return scenarioId;
  }

  /**
  * Set the scenarioId of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param scenarioId  The scenarioId of this {@link ExecutionResponseWithDetails}
  */
  public void setScenarioId( @Nonnull final ScenarioId scenarioId) {
    this.scenarioId = scenarioId;
  }

   /**
   * Set the targetStatus of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param targetStatus  Target status of the execution
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails targetStatus(@Nonnull final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
    return this;
  }

   /**
   * Target status of the execution
   * @return targetStatus  The targetStatus of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public TargetStatusEnum getTargetStatus() {
    return targetStatus;
  }

  /**
  * Set the targetStatus of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param targetStatus  Target status of the execution
  */
  public void setTargetStatus( @Nonnull final TargetStatusEnum targetStatus) {
    this.targetStatus = targetStatus;
  }

   /**
   * Set the status of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param status  The status of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails status(@Nonnull final ExecutionStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status  The status of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ExecutionStatus getStatus() {
    return status;
  }

  /**
  * Set the status of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param status  The status of this {@link ExecutionResponseWithDetails}
  */
  public void setStatus( @Nonnull final ExecutionStatus status) {
    this.status = status;
  }

   /**
   * Set the statusMessage of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param statusMessage  The statusMessage of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails statusMessage(@Nonnull final ExecutionStatusMessage statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * Get statusMessage
   * @return statusMessage  The statusMessage of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ExecutionStatusMessage getStatusMessage() {
    return statusMessage;
  }

  /**
  * Set the statusMessage of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param statusMessage  The statusMessage of this {@link ExecutionResponseWithDetails}
  */
  public void setStatusMessage( @Nonnull final ExecutionStatusMessage statusMessage) {
    this.statusMessage = statusMessage;
  }

   /**
   * Set the outputArtifacts of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param outputArtifacts  The outputArtifacts of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails outputArtifacts(@Nonnull final List<Artifact> outputArtifacts) {
    this.outputArtifacts = outputArtifacts;
    return this;
  }
  /**
  * Add one OutputArtifacts instance to this {@link ExecutionResponseWithDetails}.
  * @param outputArtifactsItem The OutputArtifacts that should be added
  * @return The same instance of type {@link ExecutionResponseWithDetails}
  */
  @Nonnull public ExecutionResponseWithDetails addOutputArtifactsItem( @Nonnull final Artifact outputArtifactsItem) {
    if (this.outputArtifacts == null) {
      this.outputArtifacts = new ArrayList<>();
    }
    this.outputArtifacts.add(outputArtifactsItem);
    return this;
  }

   /**
   * Get outputArtifacts
   * @return outputArtifacts  The outputArtifacts of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public List<Artifact> getOutputArtifacts() {
    return outputArtifacts;
  }

  /**
  * Set the outputArtifacts of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param outputArtifacts  The outputArtifacts of this {@link ExecutionResponseWithDetails}
  */
  public void setOutputArtifacts( @Nonnull final List<Artifact> outputArtifacts) {
    this.outputArtifacts = outputArtifacts;
  }

   /**
   * Set the executionScheduleId of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param executionScheduleId  The executionScheduleId of this {@link ExecutionResponseWithDetails}
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails executionScheduleId(@Nonnull final ExecutionScheduleId executionScheduleId) {
    this.executionScheduleId = executionScheduleId;
    return this;
  }

   /**
   * Get executionScheduleId
   * @return executionScheduleId  The executionScheduleId of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public ExecutionScheduleId getExecutionScheduleId() {
    return executionScheduleId;
  }

  /**
  * Set the executionScheduleId of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param executionScheduleId  The executionScheduleId of this {@link ExecutionResponseWithDetails}
  */
  public void setExecutionScheduleId( @Nonnull final ExecutionScheduleId executionScheduleId) {
    this.executionScheduleId = executionScheduleId;
  }

   /**
   * Set the createdAt of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param createdAt  Timestamp of resource creation
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of resource creation
   * @return createdAt  The createdAt of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
  * Set the createdAt of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param createdAt  Timestamp of resource creation
  */
  public void setCreatedAt( @Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

   /**
   * Set the modifiedAt of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param modifiedAt  Timestamp of latest resource modification
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails modifiedAt(@Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Timestamp of latest resource modification
   * @return modifiedAt  The modifiedAt of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  /**
  * Set the modifiedAt of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param modifiedAt  Timestamp of latest resource modification
  */
  public void setModifiedAt( @Nonnull final OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

   /**
   * Set the submissionTime of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param submissionTime  Timestamp of job submitted
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails submissionTime(@Nonnull final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * Timestamp of job submitted
   * @return submissionTime  The submissionTime of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public OffsetDateTime getSubmissionTime() {
    return submissionTime;
  }

  /**
  * Set the submissionTime of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param submissionTime  Timestamp of job submitted
  */
  public void setSubmissionTime( @Nonnull final OffsetDateTime submissionTime) {
    this.submissionTime = submissionTime;
  }

   /**
   * Set the startTime of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param startTime  Timestamp of job status changed to RUNNING
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails startTime(@Nonnull final OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp of job status changed to RUNNING
   * @return startTime  The startTime of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public OffsetDateTime getStartTime() {
    return startTime;
  }

  /**
  * Set the startTime of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param startTime  Timestamp of job status changed to RUNNING
  */
  public void setStartTime( @Nonnull final OffsetDateTime startTime) {
    this.startTime = startTime;
  }

   /**
   * Set the completionTime of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param completionTime  Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails completionTime(@Nonnull final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Timestamp of job status changed to COMPLETED/DEAD/STOPPED
   * @return completionTime  The completionTime of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  /**
  * Set the completionTime of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param completionTime  Timestamp of job status changed to COMPLETED/DEAD/STOPPED
  */
  public void setCompletionTime( @Nonnull final OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }

   /**
   * Set the statusDetails of this {@link ExecutionResponseWithDetails} instance and return the same instance.
   *
   * @param statusDetails  Current status details of the execution
   * @return The same instance of this {@link ExecutionResponseWithDetails} class
   */
   @Nonnull public ExecutionResponseWithDetails statusDetails(@Nonnull final Object statusDetails) {
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Current status details of the execution
   * @return statusDetails  The statusDetails of this {@link ExecutionResponseWithDetails} instance.
  **/
  @Nonnull public Object getStatusDetails() {
    return statusDetails;
  }

  /**
  * Set the statusDetails of this {@link ExecutionResponseWithDetails} instance.
  *
  * @param statusDetails  Current status details of the execution
  */
  public void setStatusDetails( @Nonnull final Object statusDetails) {
    this.statusDetails = statusDetails;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ExecutionResponseWithDetails}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ExecutionResponseWithDetails} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ExecutionResponseWithDetails has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ExecutionResponseWithDetails} instance. If the map previously contained a mapping
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
    final ExecutionResponseWithDetails executionResponseWithDetails = (ExecutionResponseWithDetails) o;
    return Objects.equals(this.cloudSdkCustomFields, executionResponseWithDetails.cloudSdkCustomFields) &&
        Objects.equals(this.id, executionResponseWithDetails.id) &&
        Objects.equals(this.configurationId, executionResponseWithDetails.configurationId) &&
        Objects.equals(this.configurationName, executionResponseWithDetails.configurationName) &&
        Objects.equals(this.scenarioId, executionResponseWithDetails.scenarioId) &&
        Objects.equals(this.targetStatus, executionResponseWithDetails.targetStatus) &&
        Objects.equals(this.status, executionResponseWithDetails.status) &&
        Objects.equals(this.statusMessage, executionResponseWithDetails.statusMessage) &&
        Objects.equals(this.outputArtifacts, executionResponseWithDetails.outputArtifacts) &&
        Objects.equals(this.executionScheduleId, executionResponseWithDetails.executionScheduleId) &&
        Objects.equals(this.createdAt, executionResponseWithDetails.createdAt) &&
        Objects.equals(this.modifiedAt, executionResponseWithDetails.modifiedAt) &&
        Objects.equals(this.submissionTime, executionResponseWithDetails.submissionTime) &&
        Objects.equals(this.startTime, executionResponseWithDetails.startTime) &&
        Objects.equals(this.completionTime, executionResponseWithDetails.completionTime) &&
        Objects.equals(this.statusDetails, executionResponseWithDetails.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurationId, configurationName, scenarioId, targetStatus, status, statusMessage, outputArtifacts, executionScheduleId, createdAt, modifiedAt, submissionTime, startTime, completionTime, statusDetails, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionResponseWithDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    configurationName: ").append(toIndentedString(configurationName)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    targetStatus: ").append(toIndentedString(targetStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    outputArtifacts: ").append(toIndentedString(outputArtifacts)).append("\n");
    sb.append("    executionScheduleId: ").append(toIndentedString(executionScheduleId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

