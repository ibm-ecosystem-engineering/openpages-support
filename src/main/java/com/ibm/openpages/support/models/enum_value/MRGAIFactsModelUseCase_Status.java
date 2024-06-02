package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGAIFactsModelUseCase_Status {
    protected static final EnumGroup eg = new EnumGroup("Status");

    public static final EnumValue Proposed = eg.addEnumValue("Proposed");
    public static final EnumValue AwaitingApproval = eg.addEnumValue("Awaiting Approval");
    public static final EnumValue Approved = eg.addEnumValue("Approved");
    public static final EnumValue Rejected = eg.addEnumValue("Rejected");
    public static final EnumValue Decommissioned = eg.addEnumValue("Decommissioned");
    public static final EnumValue UnderReview = eg.addEnumValue("Under Review");

    protected MRGAIFactsModelUseCase_Status() {
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
