
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CacheRefreshPlanState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CacheRefreshPlanState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MissingParameterValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="InvalidParameterValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UnknownItemParameter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CachingNotEnabledOnItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CacheRefreshPlanState", propOrder = {
    "missingParameterValue",
    "invalidParameterValue",
    "unknownItemParameter",
    "cachingNotEnabledOnItem"
})
public class CacheRefreshPlanState {

    @XmlElement(name = "MissingParameterValue")
    protected boolean missingParameterValue;
    @XmlElement(name = "InvalidParameterValue")
    protected boolean invalidParameterValue;
    @XmlElement(name = "UnknownItemParameter")
    protected boolean unknownItemParameter;
    @XmlElement(name = "CachingNotEnabledOnItem")
    protected boolean cachingNotEnabledOnItem;

    /**
     * Gets the value of the missingParameterValue property.
     * 
     */
    public boolean isMissingParameterValue() {
        return missingParameterValue;
    }

    /**
     * Sets the value of the missingParameterValue property.
     * 
     */
    public void setMissingParameterValue(boolean value) {
        this.missingParameterValue = value;
    }

    /**
     * Gets the value of the invalidParameterValue property.
     * 
     */
    public boolean isInvalidParameterValue() {
        return invalidParameterValue;
    }

    /**
     * Sets the value of the invalidParameterValue property.
     * 
     */
    public void setInvalidParameterValue(boolean value) {
        this.invalidParameterValue = value;
    }

    /**
     * Gets the value of the unknownItemParameter property.
     * 
     */
    public boolean isUnknownItemParameter() {
        return unknownItemParameter;
    }

    /**
     * Sets the value of the unknownItemParameter property.
     * 
     */
    public void setUnknownItemParameter(boolean value) {
        this.unknownItemParameter = value;
    }

    /**
     * Gets the value of the cachingNotEnabledOnItem property.
     * 
     */
    public boolean isCachingNotEnabledOnItem() {
        return cachingNotEnabledOnItem;
    }

    /**
     * Sets the value of the cachingNotEnabledOnItem property.
     * 
     */
    public void setCachingNotEnabledOnItem(boolean value) {
        this.cachingNotEnabledOnItem = value;
    }

}
