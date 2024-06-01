package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGModel_CandidateStatus {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue ModelCandidate = eg.addEnumValue("Model Candidate");
    public static final EnumValue CandidateAwaitingConfirmation = eg.addEnumValue("Candidate- Awaiting Confirmation");
    public static final EnumValue Rejected = eg.addEnumValue("Rejected");
    public static final EnumValue Confirmed = eg.addEnumValue("Confirmed");

    protected MRGModel_CandidateStatus() {
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
