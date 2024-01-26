
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
 *         &lt;element name="ListDatabaseCredentialRetrievalOptionsResult" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfString1" minOccurs="0"/&gt;
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
    "listDatabaseCredentialRetrievalOptionsResult"
})
@XmlRootElement(name = "ListDatabaseCredentialRetrievalOptionsResponse")
public class ListDatabaseCredentialRetrievalOptionsResponse {

    @XmlElement(name = "ListDatabaseCredentialRetrievalOptionsResult")
    protected ArrayOfString1 listDatabaseCredentialRetrievalOptionsResult;

    /**
     * Gets the value of the listDatabaseCredentialRetrievalOptionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getListDatabaseCredentialRetrievalOptionsResult() {
        return listDatabaseCredentialRetrievalOptionsResult;
    }

    /**
     * Sets the value of the listDatabaseCredentialRetrievalOptionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setListDatabaseCredentialRetrievalOptionsResult(ArrayOfString1 value) {
        this.listDatabaseCredentialRetrievalOptionsResult = value;
    }

}
