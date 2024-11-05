//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.Country;
import io.openepcis.model.interfaces.PostalAddress;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PostalAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="addressCountry" type="{}Country"/>
 *         <element name="addressLocality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="addressRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="addressSuburb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="crossStreet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postOfficeBoxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="postalName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="streetAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="streetAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="streetAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="streetAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress", propOrder = {
    "addressCountry",
    "addressLocality",
    "addressRegion",
    "addressSuburb",
    "countyCode",
    "crossStreet",
    "organizationName",
    "postOfficeBoxNumber",
    "postalCode",
    "postalName",
    "streetAddress",
    "streetAddressLine2",
    "streetAddressLine3",
    "streetAddressLine4"
})
public class PostalAddressXMLImpl implements PostalAddress<CountryXMLImpl> {

    @XmlElement(required = true)
    protected CountryXMLImpl addressCountry;
    @XmlElement(required = true)
    protected String addressLocality;
    @XmlElement(required = true)
    protected String addressRegion;
    @XmlElement(required = true)
    protected String addressSuburb;
    @XmlElement(required = true)
    protected String countyCode;
    @XmlElement(required = true)
    protected String crossStreet;
    @XmlElement(required = true)
    protected String organizationName;
    @XmlElement(required = true)
    protected String postOfficeBoxNumber;
    @XmlElement(required = true)
    protected String postalCode;
    @XmlElement(required = true)
    protected String postalName;
    @XmlElement(required = true)
    protected String streetAddress;
    @XmlElement(required = true)
    protected String streetAddressLine2;
    @XmlElement(required = true)
    protected String streetAddressLine3;
    @XmlElement(required = true)
    protected String streetAddressLine4;

    /**
     * Gets the value of the addressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryXMLImpl }
     *     
     */
    @Override
    public CountryXMLImpl getAddressCountry() {
        return addressCountry;
    }

    /**
     * Sets the value of the addressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryXMLImpl }
     *     
     */
    @Override
    public void setAddressCountry(CountryXMLImpl value) {
        this.addressCountry = value;
    }

    /**
     * Gets the value of the addressLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getAddressLocality() {
        return addressLocality;
    }

    /**
     * Sets the value of the addressLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setAddressLocality(String value) {
        this.addressLocality = value;
    }

    /**
     * Gets the value of the addressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setAddressRegion(String value) {
        this.addressRegion = value;
    }

    /**
     * Gets the value of the addressSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getAddressSuburb() {
        return addressSuburb;
    }

    /**
     * Sets the value of the addressSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setAddressSuburb(String value) {
        this.addressSuburb = value;
    }

    /**
     * Gets the value of the countyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the value of the countyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setCountyCode(String value) {
        this.countyCode = value;
    }

    /**
     * Gets the value of the crossStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * Sets the value of the crossStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setCrossStreet(String value) {
        this.crossStreet = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the postOfficeBoxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    /**
     * Sets the value of the postOfficeBoxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setPostOfficeBoxNumber(String value) {
        this.postOfficeBoxNumber = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getPostalName() {
        return postalName;
    }

    /**
     * Sets the value of the postalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setPostalName(String value) {
        this.postalName = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the streetAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getStreetAddressLine2() {
        return streetAddressLine2;
    }

    /**
     * Sets the value of the streetAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setStreetAddressLine2(String value) {
        this.streetAddressLine2 = value;
    }

    /**
     * Gets the value of the streetAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getStreetAddressLine3() {
        return streetAddressLine3;
    }

    /**
     * Sets the value of the streetAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setStreetAddressLine3(String value) {
        this.streetAddressLine3 = value;
    }

    /**
     * Gets the value of the streetAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getStreetAddressLine4() {
        return streetAddressLine4;
    }

    /**
     * Sets the value of the streetAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setStreetAddressLine4(String value) {
        this.streetAddressLine4 = value;
    }

}
