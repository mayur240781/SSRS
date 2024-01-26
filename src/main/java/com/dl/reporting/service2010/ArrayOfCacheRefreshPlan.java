
package com.dl.reporting.service2010;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCacheRefreshPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCacheRefreshPlan"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CacheRefreshPlan" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}CacheRefreshPlan" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCacheRefreshPlan", propOrder = {
    "cacheRefreshPlan"
})
public class ArrayOfCacheRefreshPlan {

    @XmlElement(name = "CacheRefreshPlan", nillable = true)
    protected List<CacheRefreshPlan> cacheRefreshPlan;

    /**
     * Gets the value of the cacheRefreshPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cacheRefreshPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCacheRefreshPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CacheRefreshPlan }
     * 
     * 
     */
    public List<CacheRefreshPlan> getCacheRefreshPlan() {
        if (cacheRefreshPlan == null) {
            cacheRefreshPlan = new ArrayList<CacheRefreshPlan>();
        }
        return this.cacheRefreshPlan;
    }

}
