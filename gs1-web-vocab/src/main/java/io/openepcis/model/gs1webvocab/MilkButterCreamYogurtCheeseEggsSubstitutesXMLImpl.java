//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.MilkButterCreamYogurtCheeseEggsSubstitutes;
import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for MilkButterCreamYogurtCheeseEggsSubstitutes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MilkButterCreamYogurtCheeseEggsSubstitutes">
 *   <complexContent>
 *     <extension base="{}FoodBeverageTobaccoProduct">
 *       <sequence>
 *         <element name="cheeseFirmness" type="{}CheeseFirmnessCode"/>
 *         <element name="cheeseMaturationPeriodDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fatInMilkContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fatpercentageInDryMatter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="isHomogenised" type="{}NonbinaryLogicCode"/>
 *         <element name="isRindEdible" type="{}NonbinaryLogicCode"/>
 *         <element name="sharpnessOfCheese" type="{}SharpnessOfCheeseCode"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilkButterCreamYogurtCheeseEggsSubstitutes", propOrder = {
    "cheeseFirmness",
    "cheeseMaturationPeriodDescription",
    "fatInMilkContent",
    "fatpercentageInDryMatter",
    "isHomogenised",
    "isRindEdible",
    "sharpnessOfCheese"
})
public class MilkButterCreamYogurtCheeseEggsSubstitutesXMLImpl
    extends FoodBeverageTobaccoProductXMLImpl implements MilkButterCreamYogurtCheeseEggsSubstitutes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CheeseFirmnessCode cheeseFirmness;
    @XmlElement(required = true)
    protected String cheeseMaturationPeriodDescription;
    protected float fatInMilkContent;
    protected float fatpercentageInDryMatter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NonbinaryLogicCode isHomogenised;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NonbinaryLogicCode isRindEdible;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SharpnessOfCheeseCode sharpnessOfCheese;

    /**
     * Gets the value of the cheeseFirmness property.
     * 
     * @return
     *     possible object is
     *     {@link CheeseFirmnessCode }
     *     
     */
    @Override
    public CheeseFirmnessCode getCheeseFirmness() {
        return cheeseFirmness;
    }

    /**
     * Sets the value of the cheeseFirmness property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheeseFirmnessCode }
     *     
     */
    @Override
    public void setCheeseFirmness(CheeseFirmnessCode value) {
        this.cheeseFirmness = value;
    }

    /**
     * Gets the value of the cheeseMaturationPeriodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Override
    public String getCheeseMaturationPeriodDescription() {
        return cheeseMaturationPeriodDescription;
    }

    /**
     * Sets the value of the cheeseMaturationPeriodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Override
    public void setCheeseMaturationPeriodDescription(String value) {
        this.cheeseMaturationPeriodDescription = value;
    }

    /**
     * Gets the value of the fatInMilkContent property.
     * 
     * @return
     *     possible object is
     *     {@link float }
     *     
     */
    @Override
    public float getFatInMilkContent() {
        return fatInMilkContent;
    }

    /**
     * Sets the value of the fatInMilkContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link float }
     *     
     */
    @Override
    public void setFatInMilkContent(float value) {
        this.fatInMilkContent = value;
    }

    /**
     * Gets the value of the fatpercentageInDryMatter property.
     * 
     * @return
     *     possible object is
     *     {@link float }
     *     
     */
    @Override
    public float getFatpercentageInDryMatter() {
        return fatpercentageInDryMatter;
    }

    /**
     * Sets the value of the fatpercentageInDryMatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link float }
     *     
     */
    @Override
    public void setFatpercentageInDryMatter(float value) {
        this.fatpercentageInDryMatter = value;
    }

    /**
     * Gets the value of the isHomogenised property.
     * 
     * @return
     *     possible object is
     *     {@link NonbinaryLogicCode }
     *     
     */
    @Override
    public NonbinaryLogicCode getIsHomogenised() {
        return isHomogenised;
    }

    /**
     * Sets the value of the isHomogenised property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonbinaryLogicCode }
     *     
     */
    @Override
    public void setIsHomogenised(NonbinaryLogicCode value) {
        this.isHomogenised = value;
    }

    /**
     * Gets the value of the isRindEdible property.
     * 
     * @return
     *     possible object is
     *     {@link NonbinaryLogicCode }
     *     
     */
    @Override
    public NonbinaryLogicCode getIsRindEdible() {
        return isRindEdible;
    }

    /**
     * Sets the value of the isRindEdible property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonbinaryLogicCode }
     *     
     */
    @Override
    public void setIsRindEdible(NonbinaryLogicCode value) {
        this.isRindEdible = value;
    }

    /**
     * Gets the value of the sharpnessOfCheese property.
     * 
     * @return
     *     possible object is
     *     {@link SharpnessOfCheeseCode }
     *     
     */
    @Override
    public SharpnessOfCheeseCode getSharpnessOfCheese() {
        return sharpnessOfCheese;
    }

    /**
     * Sets the value of the sharpnessOfCheese property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharpnessOfCheeseCode }
     *     
     */
    @Override
    public void setSharpnessOfCheese(SharpnessOfCheeseCode value) {
        this.sharpnessOfCheese = value;
    }

}
