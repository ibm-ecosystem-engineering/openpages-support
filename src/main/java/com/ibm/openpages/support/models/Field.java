package com.ibm.openpages.support.models;

import com.ibm.openpages.support.util.FieldType;

public class Field extends BaseField<Field> {

    protected Field(FieldGroup fieldGroup, String value, FieldType<?> fieldType) {
        super(fieldGroup, value, value, fieldType);
    }

    protected Field(FieldGroup fieldGroup, String value, String label, FieldType<?> fieldType) {
        super(fieldGroup, value, label, fieldType);
    }

    protected Field withFieldGroup(FieldGroup fieldGroup) {
        return new Field(fieldGroup, this.originalValue, this.label, this.fieldType);
    }

    public String toString() {
        return "[Field: value=" + value + ", label=" + label + ", fieldType=" + fieldType + "]";
    }
}
