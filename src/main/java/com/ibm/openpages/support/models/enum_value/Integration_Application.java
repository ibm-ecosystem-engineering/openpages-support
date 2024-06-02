package com.ibm.openpages.support.models.enum_value;


import com.ibm.openpages.support.models.EnumGroup;
import com.ibm.openpages.support.models.EnumValue;
import com.ibm.openpages.support.models.IEnumGroup;

import java.util.List;
import java.util.Optional;

public class Integration_Application {
    protected static final EnumGroup eg = new EnumGroup("Application");

    public static final EnumValue QRadar = eg.addEnumValue("QRadar");
    public static final EnumValue WatsonKnowledgeCatalog = eg.addEnumValue("Watson Knowledge Catalog");

    protected Integration_Application() {}

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
