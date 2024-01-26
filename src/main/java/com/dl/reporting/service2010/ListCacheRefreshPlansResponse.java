
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
 *         &lt;element name="CacheRefreshPlans" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfCacheRefreshPlan" minOccurs="0"/&gt;
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
    "cacheRefreshPlans"
})
@XmlRootElement(name = "ListCacheRefreshPlansResponse")
public class ListCacheRefreshPlansResponse {

    @XmlElement(name = "CacheRefreshPlans")
    protected ArrayOfCacheRefreshPlan cacheRefreshPlans;

    /**
     * Gets the value of the cacheRefreshPlans property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCacheRefreshPlan }
     *     
     */
    public ArrayOfCacheRefreshPlan getCacheRefreshPlans() {
        return cacheRefreshPlans;
    }

    /**
     * Sets the value of the cacheRefreshPlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCacheRefreshPlan }
     *     
     */
    public void setCacheRefreshPlans(ArrayOfCacheRefreshPlan value) {
        this.cacheRefreshPlans = value;
    }

}
