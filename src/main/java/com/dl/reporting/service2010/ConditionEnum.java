
package com.dl.reporting.service2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConditionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Contains"/&gt;
 *     &lt;enumeration value="Equals"/&gt;
 *     &lt;enumeration value="In"/&gt;
 *     &lt;enumeration value="Between"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConditionEnum")
@XmlEnum
public enum ConditionEnum {

    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("In")
    IN("In"),
    @XmlEnumValue("Between")
    BETWEEN("Between");
    private final String value;

    ConditionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionEnum fromValue(String v) {
        for (ConditionEnum c: ConditionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
