package com.ibm.openpages.models;

import java.util.List;
import java.util.Optional;

public interface IEnumGroup {
    List<EnumValue> values();

    EnumValue[] valuesArray();

    Optional<EnumValue> lookup(String value);
}
