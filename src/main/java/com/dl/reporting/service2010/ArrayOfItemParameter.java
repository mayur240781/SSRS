
package com.dl.reporting.service2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItemParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemParameter" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ItemParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemParameter", propOrder = {
    "itemParameter"
})
public class ArrayOfItemParameter {

    @XmlElement(name = "ItemParameter", nillable = true)
    protected List<ItemParameter> itemParameter;

    /**
     * Gets the value of the itemParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemParameter }
     * 
     * 
     */
    public List<ItemParameter> getItemParameter() {
        if (itemParameter == null) {
            itemParameter = new ArrayList<ItemParameter>();
        }
        return this.itemParameter;
    }

}
