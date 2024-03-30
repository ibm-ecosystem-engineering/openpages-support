package com.ibm.openpages.models;

import com.ibm.openpages.support.util.FieldType;

public class Field implements FieldMetadata, ResultLabel {
    final private FieldGroup fieldGroup;
    final private String value;
    final private String label;
    final private FieldType<?> fieldType;

    public Field(FieldGroup fieldGroup, String fieldName, FieldType<?> fieldType) {
        this(fieldGroup, fieldName, fieldName, fieldType);
    }

    public Field(FieldGroup fieldGroup, String value, String label, FieldType<?> fieldType) {
        this.fieldGroup = fieldGroup;
        this.value = fieldGroup.fieldName(value);
        this.label = label;
        this.fieldType = fieldType;
    }

    @Override
    public boolean isEnumField() {
        return fieldType.isEnumField();
    }

    @Override
    public boolean isStringField() {
        return fieldType.isStringField();
    }

    @Override
    public boolean isIntegerField() {
        return fieldType.isIntegerField();
    }

    @Override
    public boolean isDecimalField() {
        return fieldType.isDecimalField();
    }

    @Override
    public boolean isDateField() {
        return fieldType.isDateField();
    }

    @Override
    public boolean isUserField() {
        return fieldType.isUserField();
    }

    @Override
    public boolean isBooleanField() {
        return fieldType.isBooleanField();
    }

    @Override
    public boolean isCurrencyField() {
        return fieldType.isCurrencyField();
    }

    @Override
    public FieldType fieldType() {
        return fieldType;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String label() {
        return label;
    }
}
