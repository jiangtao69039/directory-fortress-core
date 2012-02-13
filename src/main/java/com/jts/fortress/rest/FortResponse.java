/*
 * Copyright (c) 2009-2012. Joshua Tree Software, LLC.  All Rights Reserved.
 */
package com.jts.fortress.rest;

import com.jts.fortress.FortEntity;
import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.Set;

@XmlRootElement(name = "FortResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fortResponse", propOrder =
{
    "errorCode",
    "errorMessage",
    "entity",
    "entities",
    "values",
    "valueSet",
    "isAuthorized"
})
public class FortResponse
{
    private int errorCode;
    @XmlElement(nillable = true)
    private Boolean isAuthorized;
    private String errorMessage;
    @XmlElement(nillable = true)
    private FortEntity entity;
    @XmlElement(nillable = true)
    private List<FortEntity> entities;
    @XmlElement(nillable = true)
    private List<String> values;
    @XmlElement(nillable = true)
    private Set<String> valueSet;

    public FortEntity getEntity()
    {
        return entity;
    }

    public void setEntity(FortEntity entity)
    {
        this.entity = entity;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public Boolean getAuthorized()
    {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized)
    {
        isAuthorized = authorized;
    }

    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }

    public <T extends FortEntity> List<T> getEntities()
    {
        return (List<T>)entities;
    }

    public <T extends FortEntity> void setEntities(List<T> entities)
    {
        this.entities = (List<FortEntity>)entities;
    }

    public List<String> getValues()
    {
        return values;
    }

    public void setValues(List<String> values)
    {
        this.values = values;
    }

    public Set<String> getValueSet()
    {
        return valueSet;
    }

    public void setValueSet(Set<String> valueSet)
    {
        this.valueSet = valueSet;
    }
}

