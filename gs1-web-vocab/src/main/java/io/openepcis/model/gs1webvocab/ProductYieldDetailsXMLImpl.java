//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.ProductYieldDetails;
import io.openepcis.model.interfaces.QuantitativeValue;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for ProductYieldDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProductYieldDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="productYield" type="{}QuantitativeValue"/>
 *         <element name="productYieldType" type="{}ProductYieldTypeCode"/>
 *         <element name="productYieldVariationPercentage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductYieldDetails", propOrder = {
    "productYield",
    "productYieldType",
    "productYieldVariationPercentage"
})
public class ProductYieldDetailsXMLImpl implements ProductYieldDetails<QuantitativeValueXMLImpl> {

    @XmlElement(required = true)
    protected QuantitativeValueXMLImpl productYield;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ProductYieldTypeCode productYieldType;
    protected float productYieldVariationPercentage;


    /**
     * Gets the value of the productYield property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public QuantitativeValueXMLImpl getProductYield() {
        return productYield;
    }

    /**
     * Sets the value of the productYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeValueXMLImpl }
     *     
     */
    @Override
    public void setProductYield(QuantitativeValueXMLImpl value) {
        this.productYield = value;
    }

    /**
     * Gets the value of the productYieldType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductYieldTypeCode }
     *     
     */
    @Override
    public ProductYieldTypeCode getProductYieldType() {
        return productYieldType;
    }

    /**
     * Sets the value of the productYieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductYieldTypeCode }
     *     
     */
    @Override
    public void setProductYieldType(ProductYieldTypeCode value) {
        this.productYieldType = value;
    }

    /**
     * Gets the value of the productYieldVariationPercentage property.
     */
    @Override
    public float getProductYieldVariationPercentage() {
        return productYieldVariationPercentage;
    }

    /**
     * Sets the value of the productYieldVariationPercentage property.
     */
    @Override
    public void setProductYieldVariationPercentage(float value) {
        this.productYieldVariationPercentage = value;
    }

}
