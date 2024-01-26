
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
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterValues" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfParameterValueOrFieldReference" minOccurs="0"/&gt;
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
    "extension",
    "parameterValues",
    "siteUrl"
})
@XmlRootElement(name = "ValidateExtensionSettings")
public class ValidateExtensionSettings {

    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "ParameterValues")
    protected ArrayOfParameterValueOrFieldReference parameterValues;
    @XmlElement(name = "SiteUrl")
    protected String siteUrl;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the parameterValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameterValueOrFieldReference }
     *     
     */
    public ArrayOfParameterValueOrFieldReference getParameterValues() {
        return parameterValues;
    }

    /**
     * Sets the value of the parameterValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameterValueOrFieldReference }
     *     
     */
    public void setParameterValues(ArrayOfParameterValueOrFieldReference value) {
        this.parameterValues = value;
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
