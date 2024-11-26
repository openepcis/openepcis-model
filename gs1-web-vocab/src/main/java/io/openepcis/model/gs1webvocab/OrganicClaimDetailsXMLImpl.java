//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.OrganicClaimDetails;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for OrganicClaimDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganicClaimDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="organicClaimAgency" type="{}OrganicClaimAgencyCode"/>
 *         <element name="organicPercentClaim" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganicClaimDetails", propOrder = {
    "organicClaimAgency",
    "organicPercentClaim"
})
public class OrganicClaimDetailsXMLImpl implements OrganicClaimDetails {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OrganicClaimAgencyCode organicClaimAgency;
    protected float organicPercentClaim;


    /**
     * Gets the value of the organicClaimAgency property.
     * 
     * @return
     *     possible object is
     *     {@link OrganicClaimAgencyCode }
     *     
     */
    @Override
    public OrganicClaimAgencyCode getOrganicClaimAgency() {
        return organicClaimAgency;
    }

    /**
     * Sets the value of the organicClaimAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganicClaimAgencyCode }
     *     
     */
    @Override
    public void setOrganicClaimAgency(OrganicClaimAgencyCode value) {
        this.organicClaimAgency = value;
    }

    /**
     * Gets the value of the organicPercentClaim property.
     */
    @Override
    public float getOrganicPercentClaim() {
        return organicPercentClaim;
    }

    /**
     * Sets the value of the organicPercentClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setOrganicPercentClaim(float value) {
        this.organicPercentClaim = value;
    }

}
