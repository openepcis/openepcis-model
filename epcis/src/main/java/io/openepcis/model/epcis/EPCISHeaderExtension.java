package io.openepcis.model.epcis;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "EPCISHeaderExtensionType",
    namespace = "urn:epcglobal:epcis:xsd:2",
    propOrder = {"any"})
public class EPCISHeaderExtension {

  @XmlAnyElement(lax = true)
  protected List<Object> any;

  @XmlAnyAttribute private Map<QName, String> otherAttributes = new HashMap<>();
}
