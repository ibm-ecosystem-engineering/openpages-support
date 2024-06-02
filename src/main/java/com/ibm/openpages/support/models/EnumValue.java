package com.ibm.openpages.support.models;

public class EnumValue implements ResultValueAndLabel {
    private final IEnumGroup enumGroup;
    private final String value;
    private final String label;

    public EnumValue(IEnumGroup eg, String value) {
        this(eg, value, value);
    }
    public EnumValue(IEnumGroup eg, String value, String label) {
        this.enumGroup = eg;
        this.value = value;
        this.label = label;
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public String value() {
        return value;
    }

    public IEnumGroup enumGroup() {
        return enumGroup;
    }

    public String toString() {
        return "[EnumValue: " + enumGroup + "." + value + " (" + label + ")]";
    }
}
