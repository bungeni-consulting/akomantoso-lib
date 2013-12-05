//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 04:40:32 PM EAT 
//


package org.akomantoso._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;judicialArguments&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The complex type judicialArguments is a list of all the judicial analysis elements that can be used on the analysis of a judgement&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for judicialArguments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="judicialArguments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.akomantoso.org/2.0}result"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.akomantoso.org/2.0}supports"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}isAnalogTo"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}applies"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}extends"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}restricts"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}derogates"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}contrasts"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}overrules"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}dissentsFrom"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}putsInQuestion"/>
 *           &lt;element ref="{http://www.akomantoso.org/2.0}distinguishes"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "judicialArguments", propOrder = {
    "result",
    "supportsOrIsAnalogToOrApplies"
})
public class JudicialArguments {

    @XmlElement(required = true)
    protected Result result;
    @XmlElementRefs({
        @XmlElementRef(name = "distinguishes", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dissentsFrom", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "overrules", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "supports", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contrasts", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isAnalogTo", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "derogates", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extends", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "putsInQuestion", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "restricts", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "applies", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<JudicialArgumentType>> supportsOrIsAnalogToOrApplies;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the supportsOrIsAnalogToOrApplies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportsOrIsAnalogToOrApplies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportsOrIsAnalogToOrApplies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * {@link JAXBElement }{@code <}{@link JudicialArgumentType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<JudicialArgumentType>> getSupportsOrIsAnalogToOrApplies() {
        if (supportsOrIsAnalogToOrApplies == null) {
            supportsOrIsAnalogToOrApplies = new ArrayList<JAXBElement<JudicialArgumentType>>();
        }
        return this.supportsOrIsAnalogToOrApplies;
    }

}
