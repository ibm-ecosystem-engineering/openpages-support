package com.ibm.openpages.models;

import com.ibm.openpages.support.util.FieldType;

public interface FieldMetadata extends ResultValue {
    boolean isEnumField();
    boolean isStringField();
    boolean isIntegerField();
    boolean isDecimalField();
    boolean isDateField();
    boolean isUserField();
    boolean isBooleanField();
    boolean isCurrencyField();
    FieldType fieldType();
}
