
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
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "eventType",
    "eventData",
    "siteUrl"
})
@XmlRootElement(name = "FireEvent")
public class FireEvent {

    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "EventData")
    protected String eventData;
    @XmlElement(name = "SiteUrl")
    protected String siteUrl;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventData() {
        return eventData;
    }

    /**
     * Sets the value of the eventData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventData(String value) {
        this.eventData = value;
    }

    /**
     * Gets the value of the siteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * Sets the value of the siteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteUrl(String value) {
        this.siteUrl = value;
    }

}
