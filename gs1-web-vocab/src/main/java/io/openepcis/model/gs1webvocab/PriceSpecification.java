//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSpecification complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceSpecification">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dutyFeeTaxAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dutyFeeTaxDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dutyFeeTaxRate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="eligibleQuantity" type="{}QuantitativeValue"/>
 *         <element name="eligibleQuantityMaximum" type="{}QuantitativeValue"/>
 *         <element name="eligibleQuantityMinimum" type="{}QuantitativeValue"/>
 *         <element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="priceCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="validThrough" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSpecification", propOrder = {
    "dutyFeeTaxAmount",
    "dutyFeeTaxDescription",
    "dutyFeeTaxRate",
    "eligibleQuantity",
    "eligibleQuantityMaximum",
    "eligibleQuantityMinimum",
    "maxPrice",
    "minPrice",
    "price",
    "priceCurrency",
    "validFrom",
    "validThrough"
})
public class PriceSpecification {

    @XmlElement(required = true)
    protected String dutyFeeTaxAmount;
    @XmlElement(required = true)
    protected String dutyFeeTaxDescription;
    @XmlElement(required = true)
    protected String dutyFeeTaxRate;
    @XmlElement(required = true)
    protected QuantitativeValue eligibleQuantity;
    @XmlElement(required = true)
    protected QuantitativeValue eligibleQuantityMaximum;
    @XmlElement(required = true)
    protected QuantitativeValue eligibleQuantityMinimum;
    @XmlElement(required = true)
    protected String maxPrice;
    @XmlElement(required = true)
    protected String minPrice;
    @XmlElement(required = true)
    protected String price;
    @XmlElement(required = true)
    protected String priceCurrency;
    @XmlElement(required = true)
    protected String validFrom;
    @XmlElement(required = true)
    protected String validThrough;

    /**
     * Gets the value of the dutyFeeTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxAmount() {
        return dutyFeeTaxAmount;
    }

    /**
     * Sets the value of the dutyFeeTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxAmount(String value) {
        this.dutyFeeTaxAmount = value;
    }

    /**
     * Gets the value of the dutyFeeTaxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxDescription() {
        return dutyFeeTaxDescription;
    }

    /**
     * Sets the value of the dutyFeeTaxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxDescription(String value) {
        this.dutyFeeTaxDescription = value;
    }

    /**
     * Gets the value of the dutyFeeTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyFeeTaxRate() {
        return dutyFeeTaxRate;
    }

    /**
     * Sets the value of the dutyFeeTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyFeeTaxRate(String value) {
        this.dutyFeeTaxRate = value;
    }

    /**
     * Gets the value of the eligibleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValue }
     *     
     */
    public QuantitativeValue getEligibleQuantity() {
        return eligibleQuantity;
    }

    /**
     * Sets the value of the eligibleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValue }
     *     
     */
    public void setEligibleQuantity(QuantitativeValue value) {
        this.eligibleQuantity = value;
    }

    /**
     * Gets the value of the eligibleQuantityMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValue }
     *     
     */
    public QuantitativeValue getEligibleQuantityMaximum() {
        return eligibleQuantityMaximum;
    }

    /**
     * Sets the value of the eligibleQuantityMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValue }
     *     
     */
    public void setEligibleQuantityMaximum(QuantitativeValue value) {
        this.eligibleQuantityMaximum = value;
    }

    /**
     * Gets the value of the eligibleQuantityMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValue }
     *     
     */
    public QuantitativeValue getEligibleQuantityMinimum() {
        return eligibleQuantityMinimum;
    }

    /**
     * Sets the value of the eligibleQuantityMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValue }
     *     
     */
    public void setEligibleQuantityMinimum(QuantitativeValue value) {
        this.eligibleQuantityMinimum = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxPrice(String value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinPrice(String value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceCurrency() {
        return priceCurrency;
    }

    /**
     * Sets the value of the priceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceCurrency(String value) {
        this.priceCurrency = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidFrom(String value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validThrough property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidThrough() {
        return validThrough;
    }

    /**
     * Sets the value of the validThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidThrough(String value) {
        this.validThrough = value;
    }

}
