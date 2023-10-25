/*
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * SodaStore API
 * API for managing soda products and orders in SodaStore.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.cloud.sdk.datamodel.openapi.sample.model;

import java.time.OffsetDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderWithTimestampAllOf
 */

// CHECKSTYLE:OFF
public class OrderWithTimestampAllOf
// CHECKSTYLE:ON
{
    @JsonProperty( "timestamp" )
    private OffsetDateTime timestamp;

    @JsonAnySetter
    private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

    /**
     * Set the timestamp of this {@link OrderWithTimestampAllOf} instance and return the same instance.
     *
     * @param timestamp
     *            The timestamp of this {@link OrderWithTimestampAllOf}
     * @return The same instance of this {@link OrderWithTimestampAllOf} class
     */
    @Nonnull
    public OrderWithTimestampAllOf timestamp( @Nonnull final OffsetDateTime timestamp )
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp The timestamp of this {@link OrderWithTimestampAllOf} instance.
     **/
    @Nonnull
    public OffsetDateTime getTimestamp()
    {
        return timestamp;
    }

    /**
     * Set the timestamp of this {@link OrderWithTimestampAllOf} instance.
     *
     * @param timestamp
     *            The timestamp of this {@link OrderWithTimestampAllOf}
     */
    public void setTimestamp( @Nonnull final OffsetDateTime timestamp )
    {
        this.timestamp = timestamp;
    }

    /**
     * Get the names of the unrecognizable properties of the {@link OrderWithTimestampAllOf}.
     *
     * @return The set of properties names
     */
    @Nonnull
    public Set<String> getCustomFieldNames()
    {
        return cloudSdkCustomFields.keySet();
    }

    /**
     * Get the value of an unrecognizable property of the {@link OrderWithTimestampAllOf}.
     *
     * @param name
     *            The name of the property
     * @return The value of the property
     * @throws NoSuchElementException
     *             If no property with the given name could be found.
     */
    @Nullable
    public Object getCustomField( @Nonnull final String name )
        throws NoSuchElementException
    {
        if( !cloudSdkCustomFields.containsKey(name) ) {
            throw new NoSuchElementException("OrderWithTimestampAllOf has no field with name '" + name + "'.");
        }
        return cloudSdkCustomFields.get(name);
    }

    @Override
    public boolean equals( @Nullable final java.lang.Object o )
    {
        if( this == o ) {
            return true;
        }
        if( o == null || getClass() != o.getClass() ) {
            return false;
        }
        final OrderWithTimestampAllOf orderWithTimestampAllOf = (OrderWithTimestampAllOf) o;
        return Objects.equals(this.cloudSdkCustomFields, orderWithTimestampAllOf.cloudSdkCustomFields)
            && Objects.equals(this.timestamp, orderWithTimestampAllOf.timestamp);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(timestamp, cloudSdkCustomFields);
    }

    @Override
    @Nonnull
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append("class OrderWithTimestampAllOf {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        cloudSdkCustomFields
            .forEach(( k, v ) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString( final java.lang.Object o )
    {
        if( o == null ) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}