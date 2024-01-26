
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nullable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AllowBlank" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MultiValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="QueryParameter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PromptUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Dependencies" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfString2" minOccurs="0"/&gt;
 *         &lt;element name="ValidValuesQueryBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ValidValues" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfValidValue1" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValuesQueryBased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultValues" type="{http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="ParameterStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemParameter", propOrder = {
    "name",
    "parameterTypeName",
    "nullable",
    "allowBlank",
    "multiValue",
    "queryParameter",
    "prompt",
    "promptUser",
    "dependencies",
    "validValuesQueryBased",
    "validValues",
    "defaultValuesQueryBased",
    "defaultValues",
    "parameterStateName",
    "errorMessage"
})
public class ItemParameter {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ParameterTypeName")
    protected String parameterTypeName;
    @XmlElement(name = "Nullable")
    protected Boolean nullable;
    @XmlElement(name = "AllowBlank")
    protected Boolean allowBlank;
    @XmlElement(name = "MultiValue")
    protected Boolean multiValue;
    @XmlElement(name = "QueryParameter")
    protected Boolean queryParameter;
    @XmlElement(name = "Prompt")
    protected String prompt;
    @XmlElement(name = "PromptUser")
    protected Boolean promptUser;
    @XmlElement(name = "Dependencies")
    protected ArrayOfString2 dependencies;
    @XmlElement(name = "ValidValuesQueryBased")
    protected Boolean validValuesQueryBased;
    @XmlElement(name = "ValidValues")
    protected ArrayOfValidValue1 validValues;
    @XmlElement(name = "DefaultValuesQueryBased")
    protected Boolean defaultValuesQueryBased;
    @XmlElement(name = "DefaultValues")
    protected ArrayOfString defaultValues;
    @XmlElement(name = "ParameterStateName")
    protected String parameterStateName;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parameterTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterTypeName() {
        return parameterTypeName;
    }

    /**
     * Sets the value of the parameterTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterTypeName(String value) {
        this.parameterTypeName = value;
    }

    /**
     * Gets the value of the nullable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the value of the nullable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNullable(Boolean value) {
        this.nullable = value;
    }

    /**
     * Gets the value of the allowBlank property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowBlank() {
        return allowBlank;
    }

    /**
     * Sets the value of the allowBlank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowBlank(Boolean value) {
        this.allowBlank = value;
    }

    /**
     * Gets the value of the multiValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiValue() {
        return multiValue;
    }

    /**
     * Sets the value of the multiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiValue(Boolean value) {
        this.multiValue = value;
    }

    /**
     * Gets the value of the queryParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryParameter() {
        return queryParameter;
    }

    /**
     * Sets the value of the queryParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryParameter(Boolean value) {
        this.queryParameter = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the promptUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptUser() {
        return promptUser;
    }

    /**
     * Sets the value of the promptUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptUser(Boolean value) {
        this.promptUser = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setDependencies(ArrayOfString2 value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the validValuesQueryBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidValuesQueryBased() {
        return validValuesQueryBased;
    }

    /**
     * Sets the value of the validValuesQueryBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidValuesQueryBased(Boolean value) {
        this.validValuesQueryBased = value;
    }

    /**
     * Gets the value of the validValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidValue1 }
     *     
     */
    public ArrayOfValidValue1 getValidValues() {
        return validValues;
    }

    /**
     * Sets the value of the validValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidValue1 }
     *     
     */
    public void setValidValues(ArrayOfValidValue1 value) {
        this.validValues = value;
    }

    /**
     * Gets the value of the defaultValuesQueryBased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultValuesQueryBased() {
        return defaultValuesQueryBased;
    }

    /**
     * Sets the value of the defaultValuesQueryBased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultValuesQueryBased(Boolean value) {
        this.defaultValuesQueryBased = value;
    }

    /**
     * Gets the value of the defaultValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getDefaultValues() {
        return defaultValues;
    }

    /**
     * Sets the value of the defaultValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setDefaultValues(ArrayOfString value) {
        this.defaultValues = value;
    }

    /**
     * Gets the value of the parameterStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterStateName() {
        return parameterStateName;
    }

    /**
     * Sets the value of the parameterStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterStateName(String value) {
        this.parameterStateName = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
