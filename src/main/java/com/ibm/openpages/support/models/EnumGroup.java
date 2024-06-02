package com.ibm.openpages.support.models;

import com.ibm.openpages.support.util.EnumUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EnumGroup implements IEnumGroup {
    private final List<EnumValue> values;
    private final String name;

    @Deprecated
    public EnumGroup() {
        this("<Unknown>");
    }

    public EnumGroup(String name) {
        this.name = name;
        this.values = new ArrayList<EnumValue>();
    }

    public EnumValue addEnumValue(String value) {
        final EnumValue enumValue = new EnumValue(this, value);

        this.values.add(enumValue);

        return enumValue;
    }

    public EnumValue addEnumValue(String value, String label) {
        final EnumValue enumValue = new EnumValue(this, value, label);

        this.values.add(enumValue);

        return enumValue;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public List<EnumValue> values() {
        return Collections.unmodifiableList(values);
    }

    @Override
    public EnumValue[] valuesArray() {
        return Collections.unmodifiableList(values)
                .toArray(new EnumValue[values.size()]);
    }

    @Override
    public Optional<EnumValue> lookup(String value) {
        return EnumUtil.lookup(valuesArray(), value);
    }

    public String toString() {
        return "[EnumGroup: " + name + "]";
    }
}
