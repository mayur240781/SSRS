
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
 *         &lt;element name="TestConnectForDataSourceDefinitionResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ConnectError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "testConnectForDataSourceDefinitionResult",
    "connectError"
})
@XmlRootElement(name = "TestConnectForDataSourceDefinitionResponse")
public class TestConnectForDataSourceDefinitionResponse {

    @XmlElement(name = "TestConnectForDataSourceDefinitionResult")
    protected boolean testConnectForDataSourceDefinitionResult;
    @XmlElement(name = "ConnectError")
    protected String connectError;

    /**
     * Gets the value of the testConnectForDataSourceDefinitionResult property.
     * 
     */
    public boolean isTestConnectForDataSourceDefinitionResult() {
        return testConnectForDataSourceDefinitionResult;
    }

    /**
     * Sets the value of the testConnectForDataSourceDefinitionResult property.
     * 
     */
    public void setTestConnectForDataSourceDefinitionResult(boolean value) {
        this.testConnectForDataSourceDefinitionResult = value;
    }

    /**
     * Gets the value of the connectError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectError() {
        return connectError;
    }

    /**
     * Sets the value of the connectError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectError(String value) {
        this.connectError = value;
    }

}
