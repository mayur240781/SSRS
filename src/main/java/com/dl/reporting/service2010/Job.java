
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Machine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="JobActionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "jobID",
    "name",
    "path",
    "description",
    "machine",
    "user",
    "startDateTime",
    "jobActionName",
    "jobTypeName",
    "jobStatusName"
})
public class Job {

    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Path")
    protected String path;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Machine")
    protected String machine;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "StartDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "JobActionName")
    protected String jobActionName;
    @XmlElement(name = "JobTypeName")
    protected String jobTypeName;
    @XmlElement(name = "JobStatusName")
    protected String jobStatusName;

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
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
     * Gets the value of the machine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachine(String value) {
        this.machine = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
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
     * Gets the value of the jobActionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobActionName() {
        return jobActionName;
    }

    /**
     * Sets the value of the jobActionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobActionName(String value) {
        this.jobActionName = value;
    }

    /**
     * Gets the value of the jobTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTypeName() {
        return jobTypeName;
    }

    /**
     * Sets the value of the jobTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTypeName(String value) {
        this.jobTypeName = value;
    }

    /**
     * Gets the value of the jobStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatusName() {
        return jobStatusName;
    }

    /**
     * Sets the value of the jobStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatusName(String value) {
        this.jobStatusName = value;
    }

}
