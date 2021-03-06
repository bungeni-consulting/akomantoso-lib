//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:58:34 AM IST 
//


package org.akomantoso.schema.v3.csd09;

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
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}markeropt">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}link"/>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}notes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "noteRef")
public class NoteRef
    extends Markeropt
{

    @XmlAttribute(name = "href", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "marker")
    protected String marker;
    @XmlAttribute(name = "placement")
    protected PlacementType placement;
    @XmlAttribute(name = "placementBase")
    @XmlSchemaType(name = "anyURI")
    protected String placementBase;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the marker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarker() {
        return marker;
    }

    /**
     * Sets the value of the marker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarker(String value) {
        this.marker = value;
    }

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link PlacementType }
     *     
     */
    public PlacementType getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementType }
     *     
     */
    public void setPlacement(PlacementType value) {
        this.placement = value;
    }

    /**
     * Gets the value of the placementBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementBase() {
        return placementBase;
    }

    /**
     * Sets the value of the placementBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementBase(String value) {
        this.placementBase = value;
    }

}
