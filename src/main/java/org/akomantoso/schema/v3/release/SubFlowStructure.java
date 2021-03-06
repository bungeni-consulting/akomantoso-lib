//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.20 at 03:05:24 PM IST 
//


package org.akomantoso.schema.v3.release;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;subFlowStructure&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type subFlowStructure specifies the overall content model of the elements that are subFlows&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for subFlowStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subFlowStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}documentType"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}blockElements"/>
 *           &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}containerElements"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}tr"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}th"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}td"/>
 *           &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}hierElements"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}content"/>
 *           &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}ANcontainers"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}formula"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}recitals"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}citations"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}longTitle"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}recital"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}citation"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}componentRef"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}documentRef"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}intro"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}wrapUp"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}heading"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}subheading"/>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}num"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0}corereq"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subFlowStructure", propOrder = {
    "amendmentList",
    "officialGazette",
    "documentCollection",
    "act",
    "bill",
    "debateReport",
    "debate",
    "statement",
    "amendment",
    "judgment",
    "portion",
    "doc",
    "blockListOrBlockContainerOrTblock"
})
@XmlSeeAlso({
    Note.class,
    QuotedStructure.class,
    SubFlow.class,
    AuthorialNote.class,
    EmbeddedStructure.class
})
public class SubFlowStructure {

    protected CollectionStructure amendmentList;
    protected CollectionStructure officialGazette;
    protected CollectionStructure documentCollection;
    protected HierarchicalStructure act;
    protected HierarchicalStructure bill;
    protected OpenStructure debateReport;
    protected DebateStructure debate;
    protected OpenStructure statement;
    protected AmendmentStructure amendment;
    protected JudgmentStructure judgment;
    protected PortionStructure portion;
    protected OpenStructure doc;
    @XmlElementRefs({
        @XmlElementRef(name = "declarationOfVote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "foreign", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tr", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Tr.class, required = false),
        @XmlElementRef(name = "wrapUp", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "level", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subchapter", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "debateSection", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = DebateSection.class, required = false),
        @XmlElementRef(name = "division", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rollCall", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subrule", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Table.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "speechGroup", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = SpeechGroup.class, required = false),
        @XmlElementRef(name = "ministerialStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proceduralMotions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "other", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "narrative", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "papers", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointOfOrder", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subsection", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rule", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tome", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chapter", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "componentRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockContainer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "intro", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "heading", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "citations", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "documentRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subdivision", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paragraph", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "longTitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personalStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "block", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Block.class, required = false),
        @XmlElementRef(name = "noticesOfMotion", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "container", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "citation", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "td", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Td.class, required = false),
        @XmlElementRef(name = "recital", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resolutions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "adjournment", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "formula", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Formula.class, required = false),
        @XmlElementRef(name = "questions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "summary", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "answer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recitals", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "content", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "administrationOfOath", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "section", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "communication", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oralStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subparagraph", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "book", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alinea", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hcontainer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Hcontainer.class, required = false),
        @XmlElementRef(name = "petitions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subheading", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clause", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tblock", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sublist", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "speech", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "toc", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Toc.class, required = false),
        @XmlElementRef(name = "proviso", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockList", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "article", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prayers", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "writtenStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transitional", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nationalInterest", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subpart", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "scene", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subclause", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "part", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "num", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indent", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "th", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = Th.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "point", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "question", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0", type = JAXBElement.class, required = false)
    })
    protected List<Object> blockListOrBlockContainerOrTblock;
    @XmlAttribute(name = "alternativeTo")
    protected String alternativeTo;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "refersTo")
    protected List<String> refersTo;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAttribute(name = "eId")
    protected String eId;
    @XmlAttribute(name = "wId")
    protected String wId;
    @XmlAttribute(name = "GUID")
    protected String guid;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    protected String period;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the amendmentList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getAmendmentList() {
        return amendmentList;
    }

    /**
     * Sets the value of the amendmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setAmendmentList(CollectionStructure value) {
        this.amendmentList = value;
    }

    /**
     * Gets the value of the officialGazette property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getOfficialGazette() {
        return officialGazette;
    }

    /**
     * Sets the value of the officialGazette property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setOfficialGazette(CollectionStructure value) {
        this.officialGazette = value;
    }

    /**
     * Gets the value of the documentCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getDocumentCollection() {
        return documentCollection;
    }

    /**
     * Sets the value of the documentCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setDocumentCollection(CollectionStructure value) {
        this.documentCollection = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setAct(HierarchicalStructure value) {
        this.act = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setBill(HierarchicalStructure value) {
        this.bill = value;
    }

    /**
     * Gets the value of the debateReport property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDebateReport() {
        return debateReport;
    }

    /**
     * Sets the value of the debateReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDebateReport(OpenStructure value) {
        this.debateReport = value;
    }

    /**
     * Gets the value of the debate property.
     * 
     * @return
     *     possible object is
     *     {@link DebateStructure }
     *     
     */
    public DebateStructure getDebate() {
        return debate;
    }

    /**
     * Sets the value of the debate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebateStructure }
     *     
     */
    public void setDebate(DebateStructure value) {
        this.debate = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setStatement(OpenStructure value) {
        this.statement = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentStructure }
     *     
     */
    public AmendmentStructure getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentStructure }
     *     
     */
    public void setAmendment(AmendmentStructure value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the judgment property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentStructure }
     *     
     */
    public JudgmentStructure getJudgment() {
        return judgment;
    }

    /**
     * Sets the value of the judgment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentStructure }
     *     
     */
    public void setJudgment(JudgmentStructure value) {
        this.judgment = value;
    }

    /**
     * Gets the value of the portion property.
     * 
     * @return
     *     possible object is
     *     {@link PortionStructure }
     *     
     */
    public PortionStructure getPortion() {
        return portion;
    }

    /**
     * Sets the value of the portion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortionStructure }
     *     
     */
    public void setPortion(PortionStructure value) {
        this.portion = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDoc(OpenStructure value) {
        this.doc = value;
    }

    /**
     * Gets the value of the blockListOrBlockContainerOrTblock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockListOrBlockContainerOrTblock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockListOrBlockContainerOrTblock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyOtherType }{@code >}
     * {@link Tr }
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link DebateSection }
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link Table }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link SpeechGroup }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link SrcType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockContainerType }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereq }{@code >}
     * {@link JAXBElement }{@code <}{@link CitationHierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link Block }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ContainerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link Td }
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link Formula }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link SpeechType }{@code >}
     * {@link JAXBElement }{@code <}{@link RecitalHierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Blocksreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link Hcontainer }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereq }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link SpeechType }{@code >}
     * {@link Toc }
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockListType }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link Th }
     * {@link JAXBElement }{@code <}{@link ListItems }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link SpeechType }{@code >}
     * 
     * 
     */
    public List<Object> getBlockListOrBlockContainerOrTblock() {
        if (blockListOrBlockContainerOrTblock == null) {
            blockListOrBlockContainerOrTblock = new ArrayList<Object>();
        }
        return this.blockListOrBlockContainerOrTblock;
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
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
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
     * Gets the value of the refersTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refersTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefersTo() {
        if (refersTo == null) {
            refersTo = new ArrayList<String>();
        }
        return this.refersTo;
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
     * Gets the value of the eId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEId() {
        return eId;
    }

    /**
     * Sets the value of the eId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEId(String value) {
        this.eId = value;
    }

    /**
     * Gets the value of the wId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWId() {
        return wId;
    }

    /**
     * Sets the value of the wId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWId(String value) {
        this.wId = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
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
