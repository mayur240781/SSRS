
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
 *         &lt;element name="ListParentsResult" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfCatalogItem" minOccurs="0"/&gt;
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
    "listParentsResult"
})
@XmlRootElement(name = "ListParentsResponse")
public class ListParentsResponse {

    @XmlElement(name = "ListParentsResult")
    protected ArrayOfCatalogItem listParentsResult;

    /**
     * Gets the value of the listParentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCatalogItem }
     *     
     */
    public ArrayOfCatalogItem getListParentsResult() {
        return listParentsResult;
    }

    /**
     * Sets the value of the listParentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCatalogItem }
     *     
     */
    public void setListParentsResult(ArrayOfCatalogItem value) {
        this.listParentsResult = value;
    }

}
