package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class OPLCQAssessment_LCTransition {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue TwoStageInfoSubmit = eg.addEnumValue("2Stage-Info-Submit", "Submit and Close");
    public static final EnumValue ThreeStageInfoSubmit = eg.addEnumValue("3Stage-Info-Submit", "Submit");
    public static final EnumValue ThreeStageReviewApprove = eg.addEnumValue("3Stage-Review-Approve", "Approve and Close");
    public static final EnumValue ThreeStageReviewReject = eg.addEnumValue("3Stage-Review-Reject", "Reject");
    public static final EnumValue FourStageInfoSubmit = eg.addEnumValue("4Stage-Info-Submit", "Submit");
    public static final EnumValue FourStageReviewApproval = eg.addEnumValue("4Stage-Review-Approval", "Submit for Approval");
    public static final EnumValue FourStageReviewReject = eg.addEnumValue("4Stage-Review-Reject", "Reject");
    public static final EnumValue FourStageApprovalApprove = eg.addEnumValue("4Stage-Approval-Approve", "Approve");
    public static final EnumValue FourStageApprovalReject = eg.addEnumValue("4Stage-Approval-Reject", "Reject");

    protected OPLCQAssessment_LCTransition() {
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
