//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 04:40:32 PM EAT 
//


package org.akomantoso._2_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;maincontent&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://www.akomantoso.org/2.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;the complex type maincontent is used by container elements that can contain basically any other Akoma Ntoso structure&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for maincontent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maincontent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.akomantoso.org/2.0}componentRef"/>
 *         &lt;group ref="{http://www.akomantoso.org/2.0}hierElements"/>
 *         &lt;group ref="{http://www.akomantoso.org/2.0}blockElements"/>
 *         &lt;group ref="{http://www.akomantoso.org/2.0}containerElements"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}coreopt"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maincontent", propOrder = {
    "componentRefOrClauseOrSection"
})
public class Maincontent {

    @XmlElementRefs({
        @XmlElementRef(name = "division", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "debateSection", namespace = "http://www.akomantoso.org/2.0", type = DebateSection.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.akomantoso.org/2.0", type = Table.class, required = false),
        @XmlElementRef(name = "block", namespace = "http://www.akomantoso.org/2.0", type = Block.class, required = false),
        @XmlElementRef(name = "blockList", namespace = "http://www.akomantoso.org/2.0", type = BlockList.class, required = false),
        @XmlElementRef(name = "subpart", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "componentRef", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subchapter", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subsection", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indent", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "part", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resolutions", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "book", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paragraph", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "communication", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alinea", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "noticesOfMotion", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subclause", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "writtenStatements", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "section", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "article", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proceduralMotions", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ministerialStatements", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subparagraph", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tome", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "questions", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oralStatements", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "container", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "foreign", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tblock", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rollCall", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chapter", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "point", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nationalInterest", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "administrationOfOath", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "papers", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "toc", namespace = "http://www.akomantoso.org/2.0", type = Toc.class, required = false),
        @XmlElementRef(name = "adjournment", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointOfOrder", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sublist", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prayers", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hcontainer", namespace = "http://www.akomantoso.org/2.0", type = Hcontainer.class, required = false),
        @XmlElementRef(name = "declarationOfVote", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clause", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "petitions", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personalStatements", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false)
    })
    protected List<Object> componentRefOrClauseOrSection;
    @XmlAttribute(name = "refersTo")
    @XmlSchemaType(name = "anyURI")
    protected String refersTo;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected String period;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "evolvingId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String evolvingId;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the componentRefOrClauseOrSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRefOrClauseOrSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRefOrClauseOrSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link DebateSection }
     * {@link Table }
     * {@link Block }
     * {@link BlockList }
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link SrcType }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ContainerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyOtherType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link Toc }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link Hcontainer }
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * 
     * 
     */
    public List<Object> getComponentRefOrClauseOrSection() {
        if (componentRefOrClauseOrSection == null) {
            componentRefOrClauseOrSection = new ArrayList<Object>();
        }
        return this.componentRefOrClauseOrSection;
    }

    /**
     * Gets the value of the refersTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefersTo() {
        return refersTo;
    }

    /**
     * Sets the value of the refersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefersTo(String value) {
        this.refersTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the titleAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttr() {
        return titleAttr;
    }

    /**
     * Sets the value of the titleAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttr(String value) {
        this.titleAttr = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the evolvingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvolvingId() {
        return evolvingId;
    }

    /**
     * Sets the value of the evolvingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvolvingId(String value) {
        this.evolvingId = value;
    }

    /**
     * Gets the value of the alternativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeTo() {
        return alternativeTo;
    }

    /**
     * Sets the value of the alternativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeTo(String value) {
        this.alternativeTo = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
