package com.ibm.openpages.support.models.enum_value;


import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGAIFactsModelUseCase_RiskLevel {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue High = eg.addEnumValue("High");
    public static final EnumValue Medium = eg.addEnumValue("Medium");
    public static final EnumValue Low = eg.addEnumValue("Low");
    public static final EnumValue NotAvailable = eg.addEnumValue("Not available");

    protected MRGAIFactsModelUseCase_RiskLevel() {
    }

    public static List<EnumValue> values() {
        return eg.values();
    }

    public static Optional<EnumValue> lookup(String value) {
        return eg.lookup(value);
    }

    public static IEnumGroup instance() {
        return eg;
    }
}
