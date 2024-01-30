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
 * Information about the ArgoCD application itself
 */

// CHECKSTYLE:OFF
public class ArgoCDApplicationStatusSource 
// CHECKSTYLE:ON
{
  @JsonProperty("repoURL")
  private String repoURL;

  @JsonProperty("path")
  private String path;

  @JsonProperty("revision")
  private String revision;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the repoURL of this {@link ArgoCDApplicationStatusSource} instance and return the same instance.
   *
   * @param repoURL  URL of the repository
   * @return The same instance of this {@link ArgoCDApplicationStatusSource} class
   */
   @Nonnull public ArgoCDApplicationStatusSource repoURL(@Nonnull final String repoURL) {
    this.repoURL = repoURL;
    return this;
  }

   /**
   * URL of the repository
   * @return repoURL  The repoURL of this {@link ArgoCDApplicationStatusSource} instance.
  **/
  @Nonnull public String getRepoURL() {
    return repoURL;
  }

  /**
  * Set the repoURL of this {@link ArgoCDApplicationStatusSource} instance.
  *
  * @param repoURL  URL of the repository
  */
  public void setRepoURL( @Nonnull final String repoURL) {
    this.repoURL = repoURL;
  }

   /**
   * Set the path of this {@link ArgoCDApplicationStatusSource} instance and return the same instance.
   *
   * @param path  Path of the repository
   * @return The same instance of this {@link ArgoCDApplicationStatusSource} class
   */
   @Nonnull public ArgoCDApplicationStatusSource path(@Nonnull final String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the repository
   * @return path  The path of this {@link ArgoCDApplicationStatusSource} instance.
  **/
  @Nonnull public String getPath() {
    return path;
  }

  /**
  * Set the path of this {@link ArgoCDApplicationStatusSource} instance.
  *
  * @param path  Path of the repository
  */
  public void setPath( @Nonnull final String path) {
    this.path = path;
  }

   /**
   * Set the revision of this {@link ArgoCDApplicationStatusSource} instance and return the same instance.
   *
   * @param revision  Revision number of the ArgoCD application
   * @return The same instance of this {@link ArgoCDApplicationStatusSource} class
   */
   @Nonnull public ArgoCDApplicationStatusSource revision(@Nonnull final String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision number of the ArgoCD application
   * @return revision  The revision of this {@link ArgoCDApplicationStatusSource} instance.
  **/
  @Nonnull public String getRevision() {
    return revision;
  }

  /**
  * Set the revision of this {@link ArgoCDApplicationStatusSource} instance.
  *
  * @param revision  Revision number of the ArgoCD application
  */
  public void setRevision( @Nonnull final String revision) {
    this.revision = revision;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link ArgoCDApplicationStatusSource}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link ArgoCDApplicationStatusSource} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("ArgoCDApplicationStatusSource has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link ArgoCDApplicationStatusSource} instance. If the map previously contained a mapping
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
    final ArgoCDApplicationStatusSource argoCDApplicationStatusSource = (ArgoCDApplicationStatusSource) o;
    return Objects.equals(this.cloudSdkCustomFields, argoCDApplicationStatusSource.cloudSdkCustomFields) &&
        Objects.equals(this.repoURL, argoCDApplicationStatusSource.repoURL) &&
        Objects.equals(this.path, argoCDApplicationStatusSource.path) &&
        Objects.equals(this.revision, argoCDApplicationStatusSource.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoURL, path, revision, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class ArgoCDApplicationStatusSource {\n");
    sb.append("    repoURL: ").append(toIndentedString(repoURL)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

