
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
 *         &lt;element name="ItemHistory" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfItemHistorySnapshot" minOccurs="0"/&gt;
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
    "itemHistory"
})
@XmlRootElement(name = "ListItemHistoryResponse")
public class ListItemHistoryResponse {

    @XmlElement(name = "ItemHistory")
    protected ArrayOfItemHistorySnapshot itemHistory;

    /**
     * Gets the value of the itemHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemHistorySnapshot }
     *     
     */
    public ArrayOfItemHistorySnapshot getItemHistory() {
        return itemHistory;
    }

    /**
     * Sets the value of the itemHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemHistorySnapshot }
     *     
     */
    public void setItemHistory(ArrayOfItemHistorySnapshot value) {
        this.itemHistory = value;
    }

}
