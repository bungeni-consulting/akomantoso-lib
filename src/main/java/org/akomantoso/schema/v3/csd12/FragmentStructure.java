//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;fragmentStructure&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type fragmentStructure specifies the overall content model of the document type that is a fragment of another document&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for fragmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fragmentStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}meta"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}fragmentBody"/>
 *       &lt;/sequence>
 *       &lt;attribute name="includedIn" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fragmentStructure", propOrder = {
    "meta",
    "fragmentBody"
})
public class FragmentStructure {

    @XmlElement(required = true)
    protected Meta meta;
    @XmlElement(required = true)
    protected FragmentBodyType fragmentBody;
    @XmlAttribute(name = "includedIn", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String includedIn;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the fragmentBody property.
     * 
     * @return
     *     possible object is
     *     {@link FragmentBodyType }
     *     
     */
    public FragmentBodyType getFragmentBody() {
        return fragmentBody;
    }

    /**
     * Sets the value of the fragmentBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link FragmentBodyType }
     *     
     */
    public void setFragmentBody(FragmentBodyType value) {
        this.fragmentBody = value;
    }

    /**
     * Gets the value of the includedIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedIn() {
        return includedIn;
    }

    /**
     * Sets the value of the includedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedIn(String value) {
        this.includedIn = value;
    }

}
