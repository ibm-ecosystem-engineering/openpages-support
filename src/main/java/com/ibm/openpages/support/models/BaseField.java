package com.ibm.openpages.support.models;

import com.ibm.openpages.support.util.FieldType;

public abstract class BaseField<T> implements FieldMetadata, ResultLabel  {
    final protected String originalValue;
    final protected String value;
    final protected String label;
    final protected FieldType<?> fieldType;

    protected BaseField(FieldGroup fieldGroup, String value, FieldType<?> fieldType) {
        this(fieldGroup, value, value, fieldType);
    }

    protected BaseField(FieldGroup fieldGroup, String value, String label, FieldType<?> fieldType) {
        this.originalValue = value;
        this.value = fieldGroup != null ? fieldGroup.fieldName(value) : value;
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
    public FieldType<?> fieldType() {
        return fieldType;
    }

    @Override
    public String baseValue() {
        return originalValue;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public String label() {
        return label;
    }

    abstract protected T withFieldGroup(FieldGroup fieldGroup);
}
