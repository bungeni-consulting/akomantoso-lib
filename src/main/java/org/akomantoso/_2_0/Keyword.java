//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 04:40:32 PM EAT 
//


package org.akomantoso._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.akomantoso.org/2.0}metaopt">
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}show"/>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}value"/>
 *       &lt;attribute name="dictionary" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "keyword")
public class Keyword
    extends Metaopt
{

    @XmlAttribute(name = "dictionary", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dictionary;
    @XmlAttribute(name = "showAs", required = true)
    protected String showAs;
    @XmlAttribute(name = "shortForm")
    protected String shortForm;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionary() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionary(String value) {
        this.dictionary = value;
    }

    /**
     * Gets the value of the showAs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAs() {
        return showAs;
    }

    /**
     * Sets the value of the showAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAs(String value) {
        this.showAs = value;
    }

    /**
     * Gets the value of the shortForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortForm() {
        return shortForm;
    }

    /**
     * Sets the value of the shortForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortForm(String value) {
        this.shortForm = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
