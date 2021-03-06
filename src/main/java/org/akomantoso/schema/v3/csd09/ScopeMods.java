//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:58:34 AM IST 
//


package org.akomantoso.schema.v3.csd09;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopeMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exceptionOfScope"/>
 *     &lt;enumeration value="extensionOfScope"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScopeMods")
@XmlEnum
public enum ScopeMods {

    @XmlEnumValue("exceptionOfScope")
    EXCEPTION_OF_SCOPE("exceptionOfScope"),
    @XmlEnumValue("extensionOfScope")
    EXTENSION_OF_SCOPE("extensionOfScope");
    private final String value;

    ScopeMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeMods fromValue(String v) {
        for (ScopeMods c: ScopeMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
