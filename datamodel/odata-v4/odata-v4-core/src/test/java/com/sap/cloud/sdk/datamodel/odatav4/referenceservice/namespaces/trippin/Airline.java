/*
 * Copyright (c) 2024 SAP SE or an SAP affiliate company. All rights reserved.
 */

/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 4.21.0
 */

package com.sap.cloud.sdk.datamodel.odatav4.referenceservice.namespaces.trippin;

import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.sap.cloud.sdk.datamodel.odata.client.request.ODataEntityKey;
import com.sap.cloud.sdk.datamodel.odatav4.core.SimpleProperty;
import com.sap.cloud.sdk.datamodel.odatav4.core.VdmEntity;
import com.sap.cloud.sdk.datamodel.odatav4.core.VdmEntitySet;
import com.sap.cloud.sdk.datamodel.odatav4.referenceservice.services.TrippinService;
import com.sap.cloud.sdk.result.ElementName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * Original entity name from the Odata EDM: <b>Airline</b>
 * </p>
 *
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString( doNotUseGetters = true, callSuper = true )
@EqualsAndHashCode( doNotUseGetters = true, callSuper = true )
@JsonAdapter( com.sap.cloud.sdk.datamodel.odatav4.adapter.GsonVdmAdapterFactory.class )
@JsonSerialize( using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectSerializer.class )
@JsonDeserialize( using = com.sap.cloud.sdk.datamodel.odatav4.adapter.JacksonVdmObjectDeserializer.class )
public class Airline extends VdmEntity<Airline> implements VdmEntitySet
{

    @Getter
    private final java.lang.String odataType = "Trippin.Airline";
    /**
     * Selector for all available fields of Airline.
     *
     */
    public final static SimpleProperty<Airline> ALL_FIELDS = all();
    /**
     * (Key Field) Constraints: Not nullable
     * <p>
     * Original property name from the Odata EDM: <b>AirlineCode</b>
     * </p>
     *
     * @return The airlineCode contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName( "AirlineCode" )
    private java.lang.String airlineCode;
    public final static SimpleProperty.String<Airline> AIRLINE_CODE =
        new SimpleProperty.String<Airline>(Airline.class, "AirlineCode");
    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>Name</b>
     * </p>
     *
     * @return The name contained in this {@link VdmEntity}.
     */
    @Nullable
    @ElementName( "Name" )
    private java.lang.String name;
    public final static SimpleProperty.String<Airline> NAME = new SimpleProperty.String<Airline>(Airline.class, "Name");

    @Nonnull
    @Override
    public Class<Airline> getType()
    {
        return Airline.class;
    }

    /**
     * (Key Field) Constraints: Not nullable
     * <p>
     * Original property name from the Odata EDM: <b>AirlineCode</b>
     * </p>
     *
     * @param airlineCode
     *            The airlineCode to set.
     */
    public void setAirlineCode( @Nullable final java.lang.String airlineCode )
    {
        rememberChangedField("AirlineCode", this.airlineCode);
        this.airlineCode = airlineCode;
    }

    /**
     * Constraints: Nullable
     * <p>
     * Original property name from the Odata EDM: <b>Name</b>
     * </p>
     *
     * @param name
     *            The name to set.
     */
    public void setName( @Nullable final java.lang.String name )
    {
        rememberChangedField("Name", this.name);
        this.name = name;
    }

    @Override
    protected java.lang.String getEntityCollection()
    {
        return "Airlines";
    }

    @Nonnull
    @Override
    protected ODataEntityKey getKey()
    {
        final ODataEntityKey entityKey = super.getKey();
        entityKey.addKeyProperty("AirlineCode", getAirlineCode());
        return entityKey;
    }

    @Nonnull
    @Override
    protected Map<java.lang.String, Object> toMapOfFields()
    {
        final Map<java.lang.String, Object> values = super.toMapOfFields();
        values.put("AirlineCode", getAirlineCode());
        values.put("Name", getName());
        return values;
    }

    @Override
    protected void fromMap( final Map<java.lang.String, Object> inputValues )
    {
        final Map<java.lang.String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if( values.containsKey("AirlineCode") ) {
                final Object value = values.remove("AirlineCode");
                if( (value == null) || (!value.equals(getAirlineCode())) ) {
                    setAirlineCode(((java.lang.String) value));
                }
            }
            if( values.containsKey("Name") ) {
                final Object value = values.remove("Name");
                if( (value == null) || (!value.equals(getName())) ) {
                    setName(((java.lang.String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    @Override
    protected java.lang.String getDefaultServicePath()
    {
        return TrippinService.DEFAULT_SERVICE_PATH;
    }

}