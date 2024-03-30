package com.ibm.openpages.support.util;

import com.ibm.openpages.api.resource.*;

import java.util.Objects;

public class FieldType<T> {
    public static final FieldType<IIdField> User = new FieldType<>(IIdField.class);
    public static final FieldType<IIntegerField> Integer = new FieldType<>(IIntegerField.class);
    public static final FieldType<IFloatField> Decimal = new FieldType<>(IFloatField.class);
    public static final FieldType<IDateField> Date = new FieldType<>(IDateField.class);
    public static final FieldType<IStringField> String = new FieldType<>(IStringField.class);
    public static final FieldType<IEnumField> Enum = new FieldType<>(IEnumField.class);
    public static final FieldType<IBooleanField> Boolean = new FieldType<>(IBooleanField.class);
    public static final FieldType<ICurrencyField> Currency = new FieldType<>(ICurrencyField.class);

    private final Class<T> type;
    protected FieldType(Class<T> type) {
        this.type = type;
    }

    public Class<T> type() {
        return type;
    }

    public boolean isEnumField() {
        return FieldType.Enum.equals(this);
    }
    public boolean isStringField() {
        return FieldType.String.equals(this);
    }
    public boolean isIntegerField() {
        return FieldType.Integer.equals(this);
    }
    public boolean isDecimalField() {
        return FieldType.Decimal.equals(this);
    }
    public boolean isDateField() {
        return FieldType.Date.equals(this);
    }
    public boolean isUserField() {
        return FieldType.User.equals(this);
    }
    public boolean isBooleanField() {
        return FieldType.Boolean.equals(this);
    }
    public boolean isCurrencyField() {
        return FieldType.Currency.equals(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FieldType)) return false;
        FieldType<?> fieldType = (FieldType<?>) o;
        return Objects.equals(type, fieldType.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }
}
