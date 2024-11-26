//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.PriceSpecification;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDateTime;


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
 *         <element name="dutyFeeTaxAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="dutyFeeTaxDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="dutyFeeTaxRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="eligibleQuantity" type="{}QuantitativeValue"/>
 *         <element name="eligibleQuantityMaximum" type="{}QuantitativeValue"/>
 *         <element name="eligibleQuantityMinimum" type="{}QuantitativeValue"/>
 *         <element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="minPrice" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="priceCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="validThrough" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
public class PriceSpecificationXMLImpl implements PriceSpecification<QuantitativeValueXMLImpl> {

    protected float dutyFeeTaxAmount;
    @XmlElement(required = true)
    protected String dutyFeeTaxDescription;
    protected float dutyFeeTaxRate;
    @XmlElement(required = true)
    protected QuantitativeValueXMLImpl eligibleQuantity;
    @XmlElement(required = true)
    protected QuantitativeValueXMLImpl eligibleQuantityMaximum;
    @XmlElement(required = true)
    protected QuantitativeValueXMLImpl eligibleQuantityMinimum;
    protected float maxPrice;
    protected float minPrice;
    protected float price;
    @XmlElement(required = true)
    protected String priceCurrency;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime validFrom;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime validThrough;

    /**
     * Gets the value of the dutyFeeTaxAmount property.
     */
    @Override
    public float getDutyFeeTaxAmount() {
        return dutyFeeTaxAmount;
    }

    /**
     * Sets the value of the dutyFeeTaxAmount property.
     */
    @Override
    public void setDutyFeeTaxAmount(float value) {
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
    @Override
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
    @Override
    public void setDutyFeeTaxDescription(String value) {
        this.dutyFeeTaxDescription = value;
    }

    /**
     * Gets the value of the dutyFeeTaxRate property.
     */
    @Override
    public float getDutyFeeTaxRate() {
        return dutyFeeTaxRate;
    }

    /**
     * Sets the value of the dutyFeeTaxRate property.
     */
    @Override
    public void setDutyFeeTaxRate(float value) {
        this.dutyFeeTaxRate = value;
    }

    /**
     * Gets the value of the eligibleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public QuantitativeValueXMLImpl getEligibleQuantity() {
        return eligibleQuantity;
    }

    /**
     * Sets the value of the eligibleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public void setEligibleQuantity(QuantitativeValueXMLImpl value) {
        this.eligibleQuantity = value;
    }

    /**
     * Gets the value of the eligibleQuantityMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public QuantitativeValueXMLImpl getEligibleQuantityMaximum() {
        return eligibleQuantityMaximum;
    }

    /**
     * Sets the value of the eligibleQuantityMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public void setEligibleQuantityMaximum(QuantitativeValueXMLImpl value) {
        this.eligibleQuantityMaximum = value;
    }

    /**
     * Gets the value of the eligibleQuantityMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public QuantitativeValueXMLImpl getEligibleQuantityMinimum() {
        return eligibleQuantityMinimum;
    }

    /**
     * Sets the value of the eligibleQuantityMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public void setEligibleQuantityMinimum(QuantitativeValueXMLImpl value) {
        this.eligibleQuantityMinimum = value;
    }

    /**
     * Gets the value of the maxPrice property.
     */
    @Override
    public float getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     */
    @Override
    public void setMaxPrice(float value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the minPrice property.
     */
    @Override
    public float getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     */
    @Override
    public void setMinPrice(float value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the price property.
     */
    @Override
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     */
    @Override
    public void setPrice(float value) {
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
    @Override
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
    @Override
    public void setPriceCurrency(String value) {
        this.priceCurrency = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public void setValidFrom(LocalDateTime value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validThrough property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public LocalDateTime getValidThrough() {
        return validThrough;
    }

    /**
     * Sets the value of the validThrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public void setValidThrough(LocalDateTime value) {
        this.validThrough = value;
    }

}
