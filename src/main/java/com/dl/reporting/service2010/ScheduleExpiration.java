
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleExpiration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleExpiration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ExpirationDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ScheduleDefinition" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ScheduleDefinition" minOccurs="0"/&gt;
 *           &lt;element name="ScheduleReference" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ScheduleReference" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleExpiration", propOrder = {
    "scheduleDefinition",
    "scheduleReference"
})
public class ScheduleExpiration
    extends ExpirationDefinition
{

    @XmlElement(name = "ScheduleDefinition")
    protected ScheduleDefinition scheduleDefinition;
    @XmlElement(name = "ScheduleReference")
    protected ScheduleReference scheduleReference;

    /**
     * Gets the value of the scheduleDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDefinition }
     *     
     */
    public ScheduleDefinition getScheduleDefinition() {
        return scheduleDefinition;
    }

    /**
     * Sets the value of the scheduleDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDefinition }
     *     
     */
    public void setScheduleDefinition(ScheduleDefinition value) {
        this.scheduleDefinition = value;
    }

    /**
     * Gets the value of the scheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleReference }
     *     
     */
    public ScheduleReference getScheduleReference() {
        return scheduleReference;
    }

    /**
     * Sets the value of the scheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleReference }
     *     
     */
    public void setScheduleReference(ScheduleReference value) {
        this.scheduleReference = value;
    }

}
