
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Folder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BooleanOperator" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}BooleanOperatorEnum"/&gt;
 *         &lt;element name="SearchOptions" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfProperty" minOccurs="0"/&gt;
 *         &lt;element name="SearchConditions" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfSearchCondition" minOccurs="0"/&gt;
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
    "folder",
    "booleanOperator",
    "searchOptions",
    "searchConditions"
})
@XmlRootElement(name = "FindItems")
public class FindItems {

    @XmlElement(name = "Folder")
    protected String folder;
    @XmlElement(name = "BooleanOperator", required = true)
    @XmlSchemaType(name = "string")
    protected BooleanOperatorEnum booleanOperator;
    @XmlElement(name = "SearchOptions")
    protected ArrayOfProperty searchOptions;
    @XmlElement(name = "SearchConditions")
    protected ArrayOfSearchCondition searchConditions;

    /**
     * Gets the value of the folder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Sets the value of the folder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolder(String value) {
        this.folder = value;
    }

    /**
     * Gets the value of the booleanOperator property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanOperatorEnum }
     *     
     */
    public BooleanOperatorEnum getBooleanOperator() {
        return booleanOperator;
    }

    /**
     * Sets the value of the booleanOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanOperatorEnum }
     *     
     */
    public void setBooleanOperator(BooleanOperatorEnum value) {
        this.booleanOperator = value;
    }

    /**
     * Gets the value of the searchOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProperty }
     *     
     */
    public ArrayOfProperty getSearchOptions() {
        return searchOptions;
    }

    /**
     * Sets the value of the searchOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProperty }
     *     
     */
    public void setSearchOptions(ArrayOfProperty value) {
        this.searchOptions = value;
    }

    /**
     * Gets the value of the searchConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchCondition }
     *     
     */
    public ArrayOfSearchCondition getSearchConditions() {
        return searchConditions;
    }

    /**
     * Sets the value of the searchConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchCondition }
     *     
     */
    public void setSearchConditions(ArrayOfSearchCondition value) {
        this.searchConditions = value;
    }

}
