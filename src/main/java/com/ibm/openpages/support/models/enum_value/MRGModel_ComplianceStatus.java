package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class MRGModel_ComplianceStatus {
    protected static final EnumGroup eg = new EnumGroup("ComplianceStatus");

    public static final EnumValue Compliant = eg.addEnumValue("Compliant");
    public static final EnumValue PartiallyCompliant = eg.addEnumValue("Partially Compliant");
    public static final EnumValue NonCompliant = eg.addEnumValue("Non-Compliant");

    protected MRGModel_ComplianceStatus() {
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
