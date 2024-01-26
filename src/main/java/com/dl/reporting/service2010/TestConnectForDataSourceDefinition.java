
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
 *         &lt;element name="DataSourceDefinition" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}DataSourceDefinition" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "dataSourceDefinition",
    "userName",
    "password"
})
@XmlRootElement(name = "TestConnectForDataSourceDefinition")
public class TestConnectForDataSourceDefinition {

    @XmlElement(name = "DataSourceDefinition")
    protected DataSourceDefinition dataSourceDefinition;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Password")
    protected String password;

    /**
     * Gets the value of the dataSourceDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceDefinition }
     *     
     */
    public DataSourceDefinition getDataSourceDefinition() {
        return dataSourceDefinition;
    }

    /**
     * Sets the value of the dataSourceDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceDefinition }
     *     
     */
    public void setDataSourceDefinition(DataSourceDefinition value) {
        this.dataSourceDefinition = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
