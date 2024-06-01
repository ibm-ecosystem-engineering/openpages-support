package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class WatsonxQAssessment_AIAssessmentType {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue NotDetermined = eg.addEnumValue("Not Determined");
    public static final EnumValue DataGathering = eg.addEnumValue("Data Gathering");
    public static final EnumValue RiskIdentification = eg.addEnumValue("Data Identification");
    public static final EnumValue RegulatoryApplicability = eg.addEnumValue("Regulatory Applicability");
    public static final EnumValue ThirdParty = eg.addEnumValue("Third Party");

    protected WatsonxQAssessment_AIAssessmentType() {
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
