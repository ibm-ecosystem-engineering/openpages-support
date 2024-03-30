package com.ibm.openpages.models.enum_value;

import com.ibm.openpages.models.EnumGroup;
import com.ibm.openpages.models.EnumValue;
import com.ibm.openpages.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class OPLCQAssessment_LCName {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue TwoStage = eg.addEnumValue("2Stage", "2 Stage Lifecycle (no review)");
    public static final EnumValue ThreeStage = eg.addEnumValue("3Stage", "3 Stage Lifecycle (with review)");
    public static final EnumValue FourStage = eg.addEnumValue("4Stage", "4 Stage Lifecycle (with review and approval)");

    protected OPLCQAssessment_LCName() {
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
