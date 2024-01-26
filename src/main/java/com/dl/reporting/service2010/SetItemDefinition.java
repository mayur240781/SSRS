
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
 *         &lt;element name="ItemPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfProperty" minOccurs="0"/&gt;
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
    "itemPath",
    "definition",
    "properties"
})
@XmlRootElement(name = "SetItemDefinition")
public class SetItemDefinition {

    @XmlElement(name = "ItemPath")
    protected String itemPath;
    @XmlElement(name = "Definition")
    protected byte[] definition;
    @XmlElement(name = "Properties")
    protected ArrayOfProperty properties;

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
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDefinition(byte[] value) {
        this.definition = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProperty }
     *     
     */
    public ArrayOfProperty getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProperty }
     *     
     */
    public void setProperties(ArrayOfProperty value) {
        this.properties = value;
    }

}
