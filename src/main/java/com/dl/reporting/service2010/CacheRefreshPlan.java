
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CacheRefreshPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CacheRefreshPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CacheRefreshPlanID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}CacheRefreshPlanState" minOccurs="0"/&gt;
 *         &lt;element name="LastExecuted" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastRunStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CacheRefreshPlan", propOrder = {
    "cacheRefreshPlanID",
    "itemPath",
    "description",
    "state",
    "lastExecuted",
    "modifiedDate",
    "modifiedBy",
    "lastRunStatus"
})
public class CacheRefreshPlan {

    @XmlElement(name = "CacheRefreshPlanID")
    protected String cacheRefreshPlanID;
    @XmlElement(name = "ItemPath")
    protected String itemPath;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "State")
    protected CacheRefreshPlanState state;
    @XmlElement(name = "LastExecuted", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastExecuted;
    @XmlElement(name = "ModifiedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "ModifiedBy")
    protected String modifiedBy;
    @XmlElement(name = "LastRunStatus")
    protected String lastRunStatus;

    /**
     * Gets the value of the cacheRefreshPlanID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheRefreshPlanID() {
        return cacheRefreshPlanID;
    }

    /**
     * Sets the value of the cacheRefreshPlanID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheRefreshPlanID(String value) {
        this.cacheRefreshPlanID = value;
    }

    /**
     * Gets the value of the itemPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemPath() {
        return itemPath;
    }

    /**
     * Sets the value of the itemPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemPath(String value) {
        this.itemPath = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link CacheRefreshPlanState }
     *     
     */
    public CacheRefreshPlanState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link CacheRefreshPlanState }
     *     
     */
    public void setState(CacheRefreshPlanState value) {
        this.state = value;
    }

    /**
     * Gets the value of the lastExecuted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExecuted() {
        return lastExecuted;
    }

    /**
     * Sets the value of the lastExecuted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExecuted(XMLGregorianCalendar value) {
        this.lastExecuted = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedBy(String value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the lastRunStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRunStatus() {
        return lastRunStatus;
    }

    /**
     * Sets the value of the lastRunStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRunStatus(String value) {
        this.lastRunStatus = value;
    }

}
