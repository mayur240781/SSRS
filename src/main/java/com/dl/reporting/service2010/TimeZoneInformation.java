
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeZoneInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StandardBias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StandardDate" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}SYSTEMTIME" minOccurs="0"/&gt;
 *         &lt;element name="DaylightBias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DaylightDate" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}SYSTEMTIME" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneInformation", propOrder = {
    "bias",
    "standardBias",
    "standardDate",
    "daylightBias",
    "daylightDate"
})
public class TimeZoneInformation {

    @XmlElement(name = "Bias")
    protected int bias;
    @XmlElement(name = "StandardBias")
    protected int standardBias;
    @XmlElement(name = "StandardDate")
    protected SYSTEMTIME standardDate;
    @XmlElement(name = "DaylightBias")
    protected int daylightBias;
    @XmlElement(name = "DaylightDate")
    protected SYSTEMTIME daylightDate;

    /**
     * Gets the value of the bias property.
     * 
     */
    public int getBias() {
        return bias;
    }

    /**
     * Sets the value of the bias property.
     * 
     */
    public void setBias(int value) {
        this.bias = value;
    }

    /**
     * Gets the value of the standardBias property.
     * 
     */
    public int getStandardBias() {
        return standardBias;
    }

    /**
     * Sets the value of the standardBias property.
     * 
     */
    public void setStandardBias(int value) {
        this.standardBias = value;
    }

    /**
     * Gets the value of the standardDate property.
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMTIME }
     *     
     */
    public SYSTEMTIME getStandardDate() {
        return standardDate;
    }

    /**
     * Sets the value of the standardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMTIME }
     *     
     */
    public void setStandardDate(SYSTEMTIME value) {
        this.standardDate = value;
    }

    /**
     * Gets the value of the daylightBias property.
     * 
     */
    public int getDaylightBias() {
        return daylightBias;
    }

    /**
     * Sets the value of the daylightBias property.
     * 
     */
    public void setDaylightBias(int value) {
        this.daylightBias = value;
    }

    /**
     * Gets the value of the daylightDate property.
     * 
     * @return
     *     possible object is
     *     {@link SYSTEMTIME }
     *     
     */
    public SYSTEMTIME getDaylightDate() {
        return daylightDate;
    }

    /**
     * Sets the value of the daylightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SYSTEMTIME }
     *     
     */
    public void setDaylightDate(SYSTEMTIME value) {
        this.daylightDate = value;
    }

}
