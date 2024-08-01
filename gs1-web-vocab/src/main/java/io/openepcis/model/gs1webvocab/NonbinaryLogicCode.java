//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NonbinaryLogicCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NonbinaryLogicCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FALSE"/>
 *     <enumeration value="NOT_APPLICABLE"/>
 *     <enumeration value="TRUE"/>
 *     <enumeration value="UNSPECIFIED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonbinaryLogicCode")
@XmlEnum
public enum NonbinaryLogicCode {

    FALSE,
    NOT_APPLICABLE,
    TRUE,
    UNSPECIFIED;

    public String value() {
        return name();
    }

    public static NonbinaryLogicCode fromValue(String v) {
        return valueOf(v);
    }

}
