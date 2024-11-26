//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package io.openepcis.model.gs1webvocab;

import io.openepcis.model.interfaces.OrganizationStatusHistory;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDateTime;


/**
 * <p>Java class for OrganizationStatusHistory complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganizationStatusHistory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="organizationStatus" type="{}StatusType"/>
 *         <element name="statusTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationStatusHistory", propOrder = {
    "organizationStatus",
    "statusTimestamp"
})
public class OrganizationStatusHistoryXMLImpl implements OrganizationStatusHistory {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusType organizationStatus;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime statusTimestamp;

    /**
     * Gets the value of the organizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    @Override
    public StatusType getOrganizationStatus() {
        return organizationStatus;
    }

    /**
     * Sets the value of the organizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    @Override
    public void setOrganizationStatus(StatusType value) {
        this.organizationStatus = value;
    }

    /**
     * Gets the value of the statusTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public LocalDateTime getStatusTimestamp() {
        return statusTimestamp;
    }

    /**
     * Sets the value of the statusTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    @Override
    public void setStatusTimestamp(LocalDateTime value) {
        this.statusTimestamp = value;
    }

}
