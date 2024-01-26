
package com.dl.reporting.service2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItemHistorySnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemHistorySnapshot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemHistorySnapshot" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ItemHistorySnapshot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemHistorySnapshot", propOrder = {
    "itemHistorySnapshot"
})
public class ArrayOfItemHistorySnapshot {

    @XmlElement(name = "ItemHistorySnapshot", nillable = true)
    protected List<ItemHistorySnapshot> itemHistorySnapshot;

    /**
     * Gets the value of the itemHistorySnapshot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemHistorySnapshot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemHistorySnapshot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemHistorySnapshot }
     * 
     * 
     */
    public List<ItemHistorySnapshot> getItemHistorySnapshot() {
        if (itemHistorySnapshot == null) {
            itemHistorySnapshot = new ArrayList<ItemHistorySnapshot>();
        }
        return this.itemHistorySnapshot;
    }

}
