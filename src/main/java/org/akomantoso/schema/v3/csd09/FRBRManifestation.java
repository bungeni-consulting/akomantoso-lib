//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:58:34 AM IST 
//


package org.akomantoso.schema.v3.csd09;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}coreProperties">
 *       &lt;sequence>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}manifProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frbRformat"
})
@XmlRootElement(name = "FRBRManifestation")
public class FRBRManifestation
    extends CoreProperties
{

    @XmlElement(name = "FRBRformat")
    protected ValueType frbRformat;

    /**
     * Gets the value of the frbRformat property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRformat() {
        return frbRformat;
    }

    /**
     * Sets the value of the frbRformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRformat(ValueType value) {
        this.frbRformat = value;
    }

}
