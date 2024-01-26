
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ScheduleDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ScheduleDefinitionOrReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="MinuteRecurrence" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}MinuteRecurrence" minOccurs="0"/&gt;
 *           &lt;element name="DailyRecurrence" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}DailyRecurrence" minOccurs="0"/&gt;
 *           &lt;element name="WeeklyRecurrence" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}WeeklyRecurrence" minOccurs="0"/&gt;
 *           &lt;element name="MonthlyRecurrence" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}MonthlyRecurrence" minOccurs="0"/&gt;
 *           &lt;element name="MonthlyDOWRecurrence" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}MonthlyDOWRecurrence" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleDefinition", propOrder = {
    "minuteRecurrence",
    "dailyRecurrence",
    "weeklyRecurrence",
    "monthlyRecurrence",
    "monthlyDOWRecurrence",
    "startDateTime",
    "endDate"
})
public class ScheduleDefinition
    extends ScheduleDefinitionOrReference
{

    @XmlElement(name = "MinuteRecurrence")
    protected MinuteRecurrence minuteRecurrence;
    @XmlElement(name = "DailyRecurrence")
    protected DailyRecurrence dailyRecurrence;
    @XmlElement(name = "WeeklyRecurrence")
    protected WeeklyRecurrence weeklyRecurrence;
    @XmlElement(name = "MonthlyRecurrence")
    protected MonthlyRecurrence monthlyRecurrence;
    @XmlElement(name = "MonthlyDOWRecurrence")
    protected MonthlyDOWRecurrence monthlyDOWRecurrence;
    @XmlElement(name = "StartDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the minuteRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteRecurrence }
     *     
     */
    public MinuteRecurrence getMinuteRecurrence() {
        return minuteRecurrence;
    }

    /**
     * Sets the value of the minuteRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteRecurrence }
     *     
     */
    public void setMinuteRecurrence(MinuteRecurrence value) {
        this.minuteRecurrence = value;
    }

    /**
     * Gets the value of the dailyRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link DailyRecurrence }
     *     
     */
    public DailyRecurrence getDailyRecurrence() {
        return dailyRecurrence;
    }

    /**
     * Sets the value of the dailyRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyRecurrence }
     *     
     */
    public void setDailyRecurrence(DailyRecurrence value) {
        this.dailyRecurrence = value;
    }

    /**
     * Gets the value of the weeklyRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyRecurrence }
     *     
     */
    public WeeklyRecurrence getWeeklyRecurrence() {
        return weeklyRecurrence;
    }

    /**
     * Sets the value of the weeklyRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyRecurrence }
     *     
     */
    public void setWeeklyRecurrence(WeeklyRecurrence value) {
        this.weeklyRecurrence = value;
    }

    /**
     * Gets the value of the monthlyRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyRecurrence }
     *     
     */
    public MonthlyRecurrence getMonthlyRecurrence() {
        return monthlyRecurrence;
    }

    /**
     * Sets the value of the monthlyRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyRecurrence }
     *     
     */
    public void setMonthlyRecurrence(MonthlyRecurrence value) {
        this.monthlyRecurrence = value;
    }

    /**
     * Gets the value of the monthlyDOWRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link MonthlyDOWRecurrence }
     *     
     */
    public MonthlyDOWRecurrence getMonthlyDOWRecurrence() {
        return monthlyDOWRecurrence;
    }

    /**
     * Sets the value of the monthlyDOWRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyDOWRecurrence }
     *     
     */
    public void setMonthlyDOWRecurrence(MonthlyDOWRecurrence value) {
        this.monthlyDOWRecurrence = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
