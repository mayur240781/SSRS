
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
 *         &lt;element name="ItemReferences" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfItemReference" minOccurs="0"/&gt;
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
    "itemReferences"
})
@XmlRootElement(name = "SetItemReferences")
public class SetItemReferences {

    @XmlElement(name = "ItemPath")
    protected String itemPath;
    @XmlElement(name = "ItemReferences")
    protected ArrayOfItemReference itemReferences;

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
     * Gets the value of the itemReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemReference }
     *     
     */
    public ArrayOfItemReference getItemReferences() {
        return itemReferences;
    }

    /**
     * Sets the value of the itemReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemReference }
     *     
     */
    public void setItemReferences(ArrayOfItemReference value) {
        this.itemReferences = value;
    }

}
