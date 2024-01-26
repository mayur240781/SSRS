
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SYSTEMTIME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SYSTEMTIME"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="dayOfWeek" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="hour" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="minute" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="milliseconds" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SYSTEMTIME", propOrder = {
    "year",
    "month",
    "dayOfWeek",
    "day",
    "hour",
    "minute",
    "second",
    "milliseconds"
})
public class SYSTEMTIME {

    protected short year;
    protected short month;
    protected short dayOfWeek;
    protected short day;
    protected short hour;
    protected short minute;
    protected short second;
    protected short milliseconds;

    /**
     * Gets the value of the year property.
     * 
     */
    public short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(short value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public short getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(short value) {
        this.month = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     */
    public short getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     */
    public void setDayOfWeek(short value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public short getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(short value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     * 
     */
    public short getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     */
    public void setHour(short value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     * 
     */
    public short getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     * 
     */
    public void setMinute(short value) {
        this.minute = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public short getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(short value) {
        this.second = value;
    }

    /**
     * Gets the value of the milliseconds property.
     * 
     */
    public short getMilliseconds() {
        return milliseconds;
    }

    /**
     * Sets the value of the milliseconds property.
     * 
     */
    public void setMilliseconds(short value) {
        this.milliseconds = value;
    }

}
