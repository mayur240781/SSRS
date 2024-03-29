
package com.dl.reporting.execution2005;

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
 *         &lt;element name="ExecutionInfo" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ExecutionInfo3" minOccurs="0"/&gt;
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
    "executionInfo"
})
@XmlRootElement(name = "LoadDrillthroughTarget3Response")
public class LoadDrillthroughTarget3Response {

    @XmlElement(name = "ExecutionInfo")
    protected ExecutionInfo3 executionInfo;

    /**
     * Gets the value of the executionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionInfo3 }
     *     
     */
    public ExecutionInfo3 getExecutionInfo() {
        return executionInfo;
    }

    /**
     * Sets the value of the executionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionInfo3 }
     *     
     */
    public void setExecutionInfo(ExecutionInfo3 value) {
        this.executionInfo = value;
    }

}
