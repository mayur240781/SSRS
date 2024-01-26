
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
 *         &lt;element name="EditSessionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Warnings" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfWarning" minOccurs="0"/&gt;
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
    "editSessionID",
    "warnings"
})
@XmlRootElement(name = "CreateReportEditSessionResponse")
public class CreateReportEditSessionResponse {

    @XmlElement(name = "EditSessionID")
    protected String editSessionID;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;

    /**
     * Gets the value of the editSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditSessionID() {
        return editSessionID;
    }

    /**
     * Sets the value of the editSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditSessionID(String value) {
        this.editSessionID = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

}
