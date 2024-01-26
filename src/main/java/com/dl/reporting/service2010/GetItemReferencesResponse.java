
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
 *         &lt;element name="ItemReferences" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfItemReferenceData" minOccurs="0"/&gt;
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
    "itemReferences"
})
@XmlRootElement(name = "GetItemReferencesResponse")
public class GetItemReferencesResponse {

    @XmlElement(name = "ItemReferences")
    protected ArrayOfItemReferenceData itemReferences;

    /**
     * Gets the value of the itemReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemReferenceData }
     *     
     */
    public ArrayOfItemReferenceData getItemReferences() {
        return itemReferences;
    }

    /**
     * Sets the value of the itemReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemReferenceData }
     *     
     */
    public void setItemReferences(ArrayOfItemReferenceData value) {
        this.itemReferences = value;
    }

}
