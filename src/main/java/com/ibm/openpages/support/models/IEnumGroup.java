package com.ibm.openpages.support.models;

import java.util.List;
import java.util.Optional;

public interface IEnumGroup {
    String name();

    List<EnumValue> values();

    EnumValue[] valuesArray();

    Optional<EnumValue> lookup(String value);
}
