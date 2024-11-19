package io.openepcis.model.interfaces;

public interface TextileMaterialDetails<QV extends QuantitativeValue> {
    String getTextileMaterialDescription();

    void setTextileMaterialDescription(String value);

    String getTextileMaterialPercentage();

    void setTextileMaterialPercentage(String value);

    String getTextileMaterialThreadCount();

    void setTextileMaterialThreadCount(String value);

    QV getTextileMaterialWeight();

    void setTextileMaterialWeight(QV value);
}
