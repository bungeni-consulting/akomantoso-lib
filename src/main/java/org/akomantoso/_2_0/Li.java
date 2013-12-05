//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 04:40:32 PM EAT 
//


package org.akomantoso._2_0;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.akomantoso.org/2.0}inlineCM"/>
 *         &lt;element ref="{http://www.akomantoso.org/2.0}ul"/>
 *         &lt;element ref="{http://www.akomantoso.org/2.0}ol"/>
 *         &lt;element ref="{http://www.akomantoso.org/2.0}p"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}coreopt"/>
 *       &lt;attGroup ref="{http://www.akomantoso.org/2.0}optvalue"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "li")
public class Li {

    @XmlElementRefs({
        @XmlElementRef(name = "relatedDocument", namespace = "http://www.akomantoso.org/2.0", type = RelatedDocument.class, required = false),
        @XmlElementRef(name = "change", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "popup", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "omissis", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "opinion", namespace = "http://www.akomantoso.org/2.0", type = Opinion.class, required = false),
        @XmlElementRef(name = "courtType", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docNumber", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "def", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shortTitle", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "authorialNote", namespace = "http://www.akomantoso.org/2.0", type = AuthorialNote.class, required = false),
        @XmlElementRef(name = "mmod", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordedTime", namespace = "http://www.akomantoso.org/2.0", type = RecordedTime.class, required = false),
        @XmlElementRef(name = "vote", namespace = "http://www.akomantoso.org/2.0", type = Vote.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docProponent", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docketNumber", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rmod", namespace = "http://www.akomantoso.org/2.0", type = Rmod.class, required = false),
        @XmlElementRef(name = "lawyer", namespace = "http://www.akomantoso.org/2.0", type = Lawyer.class, required = false),
        @XmlElementRef(name = "process", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "noteRef", namespace = "http://www.akomantoso.org/2.0", type = NoteRef.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extractStructure", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://www.akomantoso.org/2.0", type = Remark.class, required = false),
        @XmlElementRef(name = "docJurisdiction", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://www.akomantoso.org/2.0", type = Date.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "session", namespace = "http://www.akomantoso.org/2.0", type = Session.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.akomantoso.org/2.0", type = Img.class, required = false),
        @XmlElementRef(name = "fillIn", namespace = "http://www.akomantoso.org/2.0", type = FillIn.class, required = false),
        @XmlElementRef(name = "entity", namespace = "http://www.akomantoso.org/2.0", type = Entity.class, required = false),
        @XmlElementRef(name = "mref", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docStage", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "event", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "role", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rref", namespace = "http://www.akomantoso.org/2.0", type = Rref.class, required = false),
        @XmlElementRef(name = "docIntroducer", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "party", namespace = "http://www.akomantoso.org/2.0", type = Party.class, required = false),
        @XmlElementRef(name = "marker", namespace = "http://www.akomantoso.org/2.0", type = Marker.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://www.akomantoso.org/2.0", type = Ref.class, required = false),
        @XmlElementRef(name = "docPurpose", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docType", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcome", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.akomantoso.org/2.0", type = A.class, required = false),
        @XmlElementRef(name = "docCommittee", namespace = "http://www.akomantoso.org/2.0", type = DocCommittee.class, required = false),
        @XmlElementRef(name = "docStatus", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eop", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "term", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "signature", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "placeholder", namespace = "http://www.akomantoso.org/2.0", type = Placeholder.class, required = false),
        @XmlElementRef(name = "inline", namespace = "http://www.akomantoso.org/2.0", type = ElementInline.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mod", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "legislature", namespace = "http://www.akomantoso.org/2.0", type = Legislature.class, required = false),
        @XmlElementRef(name = "organization", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "concept", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "judge", namespace = "http://www.akomantoso.org/2.0", type = Judge.class, required = false),
        @XmlElementRef(name = "neutralCitation", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "affectedDocument", namespace = "http://www.akomantoso.org/2.0", type = AffectedDocument.class, required = false),
        @XmlElementRef(name = "quantity", namespace = "http://www.akomantoso.org/2.0", type = Quantity.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://www.akomantoso.org/2.0", type = Person.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extractText", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docTitle", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docDate", namespace = "http://www.akomantoso.org/2.0", type = DocDate.class, required = false),
        @XmlElementRef(name = "eol", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "u", namespace = "http://www.akomantoso.org/2.0", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
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
    @XmlAttribute(name = "value")
    protected String value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedDocument }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link PopupStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Opinion }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link AuthorialNote }
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link RecordedTime }
     * {@link Vote }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Rmod }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link Lawyer }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link NoteRef }
     * {@link JAXBElement }{@code <}{@link PopupStructure }{@code >}
     * {@link Remark }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Date }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Session }
     * {@link FillIn }
     * {@link Img }
     * {@link Entity }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Rref }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Party }
     * {@link Marker }
     * {@link String }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Ref }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link A }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link DocCommittee }
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Placeholder }
     * {@link ElementInline }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link Legislature }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link Judge }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Quantity }
     * {@link AffectedDocument }
     * {@link Person }
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link DocDate }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
