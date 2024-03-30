package com.ibm.openpages.models;

import com.ibm.openpages.support.util.FieldType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FieldGroup {
    private final List<Field> fields;
    private final String value;

    public FieldGroup(final String value) {
        this.value = value;
        fields = new ArrayList<>();
    }

    public List<Field> fields() {
        return Collections.unmodifiableList(fields);
    }

    public Field addField(String value, FieldType<?> fieldType) {
        final Field field = new Field(this, value, fieldType);

        fields.add(field);

        return field;
    }

    public Field addField(String value, String label, FieldType<?> fieldType) {
        final Field field = new Field(this, value, label, fieldType);

        fields.add(field);

        return field;
    }

    public Field field(String name) {
        return fields.stream()
                .filter(field -> field.value().equals(fieldName(name)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Field " + name + " not found"));
    }

    public String fieldName(String name) {
        return value + ":" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldGroup that = (FieldGroup) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
