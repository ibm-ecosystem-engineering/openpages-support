package com.ibm.openpages.models.enum_value;

import com.ibm.openpages.models.EnumGroup;
import com.ibm.openpages.models.EnumValue;
import com.ibm.openpages.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class OPLCQAssessment_LCStage {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue TwoStageInfo = eg.addEnumValue("2Stage-Info", "Information Gathering");
    public static final EnumValue TwoStageClose = eg.addEnumValue("2Stage-Close", "Close");
    public static final EnumValue ThreeStageInfo = eg.addEnumValue("3Stage-Info", "Information Gathering");
    public static final EnumValue ThreeStageReview = eg.addEnumValue("3Stage-Review", "Review");
    public static final EnumValue ThreeStageClose = eg.addEnumValue("3Stage-Close", "Closed");
    public static final EnumValue FourStageInfo = eg.addEnumValue("4Stage-Info", "Information Gathering");
    public static final EnumValue FourStageReview = eg.addEnumValue("4Stage-Review", "Review");
    public static final EnumValue FourStageApproval = eg.addEnumValue("4Stage-Approval", "Approval");
    public static final EnumValue FourStageClose = eg.addEnumValue("4Stage-Close", "Closed");

    protected OPLCQAssessment_LCStage() {
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
