package com.ibm.openpages.support.models.enum_value;

import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class OPLCStd_LCUpdateAssignee {
    protected static final EnumGroup eg = new EnumGroup();

    public static final EnumValue Yes = eg.addEnumValue("Yes");

    protected OPLCStd_LCUpdateAssignee() {
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
