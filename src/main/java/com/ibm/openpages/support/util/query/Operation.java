package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ResultValue;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public enum Operation {
    EQUALS("="),
    IN("IN", inValue -> (inValue instanceof List<?>) ? inValue : Collections.singletonList(inValue));

    private final String value;
    private final Function<Object, Object> valueFormatter;

    Operation(String value) {
        this(value, in -> in);
    }

    Operation(String value, Function<Object, Object> valueFormatter) {
        this.value = value;
        this.valueFormatter = valueFormatter;
    }

    public String value() {
        return value;
    }

    public String toClause(IObjectType type, ResultValue field, Object inValue) {
        final Object value = valueFormatter.apply(inValue);

        return "[" + type.name() + "].[" + field.baseValue() + "] " + this.value() + " " + value;
    }
}
