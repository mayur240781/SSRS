
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CacheItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TimeExpiration" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}TimeExpiration" minOccurs="0"/&gt;
 *           &lt;element name="ScheduleExpiration" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ScheduleExpiration" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cacheItem",
    "timeExpiration",
    "scheduleExpiration"
})
@XmlRootElement(name = "GetCacheOptionsResponse")
public class GetCacheOptionsResponse {

    @XmlElement(name = "CacheItem")
    protected boolean cacheItem;
    @XmlElement(name = "TimeExpiration")
    protected TimeExpiration timeExpiration;
    @XmlElement(name = "ScheduleExpiration")
    protected ScheduleExpiration scheduleExpiration;

    /**
     * Gets the value of the cacheItem property.
     * 
     */
    public boolean isCacheItem() {
        return cacheItem;
    }

    /**
     * Sets the value of the cacheItem property.
     * 
     */
    public void setCacheItem(boolean value) {
        this.cacheItem = value;
    }

    /**
     * Gets the value of the timeExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link TimeExpiration }
     *     
     */
    public TimeExpiration getTimeExpiration() {
        return timeExpiration;
    }

    /**
     * Sets the value of the timeExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeExpiration }
     *     
     */
    public void setTimeExpiration(TimeExpiration value) {
        this.timeExpiration = value;
    }

    /**
     * Gets the value of the scheduleExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleExpiration }
     *     
     */
    public ScheduleExpiration getScheduleExpiration() {
        return scheduleExpiration;
    }

    /**
     * Sets the value of the scheduleExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleExpiration }
     *     
     */
    public void setScheduleExpiration(ScheduleExpiration value) {
        this.scheduleExpiration = value;
    }

}
