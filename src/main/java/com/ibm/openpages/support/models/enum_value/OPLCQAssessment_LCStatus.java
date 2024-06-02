package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class OPLCQAssessment_LCStatus {
    protected static final EnumGroup eg = new EnumGroup("LCStatus");

    public static final EnumValue Complete = eg.addEnumValue("Complete");
    public static final EnumValue InReview = eg.addEnumValue("InReview");
    public static final EnumValue Rejected = eg.addEnumValue("Rejected");
    public static final EnumValue InApproval = eg.addEnumValue("InApproval");
    public static final EnumValue ReviewRejected  = eg.addEnumValue("Review Rejected");
    public static final EnumValue Approved = eg.addEnumValue("Approved");
    public static final EnumValue ApprovalRejected = eg.addEnumValue("Approval Rejected");

    protected OPLCQAssessment_LCStatus() {
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
