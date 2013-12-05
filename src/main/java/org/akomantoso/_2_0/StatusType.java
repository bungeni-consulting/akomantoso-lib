//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 04:40:32 PM EAT 
//


package org.akomantoso._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="omissis"/>
 *     &lt;enumeration value="repealed"/>
 *     &lt;enumeration value="suspended"/>
 *     &lt;enumeration value="editorial"/>
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="translated"/>
 *     &lt;enumeration value="edited"/>
 *     &lt;enumeration value="verbatim"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("omissis")
    OMISSIS("omissis"),
    @XmlEnumValue("repealed")
    REPEALED("repealed"),
    @XmlEnumValue("suspended")
    SUSPENDED("suspended"),
    @XmlEnumValue("editorial")
    EDITORIAL("editorial"),
    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("translated")
    TRANSLATED("translated"),
    @XmlEnumValue("edited")
    EDITED("edited"),
    @XmlEnumValue("verbatim")
    VERBATIM("verbatim");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
