package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGModelUseCase_UseCaseType {
    protected static final EnumGroup eg = new EnumGroup("UseCaseType");

    public static final EnumValue AI = eg.addEnumValue("AI");
    public static final EnumValue NonAI = eg.addEnumValue("Non-AI");

    protected MRGModelUseCase_UseCaseType() {
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
