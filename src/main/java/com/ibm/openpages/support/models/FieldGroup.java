package com.ibm.openpages.support.models;

import com.ibm.openpages.support.util.FieldType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FieldGroup {
    private final List<? super BaseField<?>> fields;
    private final String value;
    private final boolean systemFieldGroup;

    public FieldGroup(final String value) {
        this(value, false);
    }
    public FieldGroup(final String value, final boolean systemFields) {
        this.value = value;
        this.systemFieldGroup = systemFields;

        fields = new ArrayList<>();
    }

    public boolean isSystemFieldGroup() {
        return systemFieldGroup;
    }

    public List<? super BaseField<?>> fields() {
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

    public <T extends BaseField<T>> T addField(T field) {
        final T groupedField = field.withFieldGroup(this);

        fields.add(groupedField);

        return groupedField;
    }

    public BaseField<?> field(String name) {
        return fields.stream()
                .map(field -> (BaseField<?>)field)
                .filter(field -> field.value().equals(fieldName(name)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Field " + name + " not found"));
    }

    public String fieldName(String name) {
        return value + ":" + name;
    }

    public String value() {
        return value;
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
