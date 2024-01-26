
package com.dl.reporting.execution2005;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParametersGridCellDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParametersGridCellDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParametersGridCellDefinition" type="{http://schemas.microsoft.com/sqlserver/2005/06/30/reporting/reportingservices}ParametersGridCellDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParametersGridCellDefinition", propOrder = {
    "parametersGridCellDefinition"
})
public class ArrayOfParametersGridCellDefinition {

    @XmlElement(name = "ParametersGridCellDefinition", nillable = true)
    protected List<ParametersGridCellDefinition> parametersGridCellDefinition;

    /**
     * Gets the value of the parametersGridCellDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametersGridCellDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametersGridCellDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametersGridCellDefinition }
     * 
     * 
     */
    public List<ParametersGridCellDefinition> getParametersGridCellDefinition() {
        if (parametersGridCellDefinition == null) {
            parametersGridCellDefinition = new ArrayList<ParametersGridCellDefinition>();
        }
        return this.parametersGridCellDefinition;
    }

}
