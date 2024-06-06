package com.ibm.openpages.support.util.query;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public abstract class QueryValueFormatters {
    public static String formatListValue(Object inValue) {
        final Collection<?> value = (inValue instanceof Collection<?>) ? (Collection<?>) inValue : Collections.singletonList(inValue);

        final String valueList = value
                .stream()
                .map(QueryValueFormatters::formatSimpleValue)
                .collect(Collectors.joining(","));

        return "[" + valueList + "]";
    }

    public static String formatSimpleValue(Object current) {
        return (current instanceof Number) ? current.toString() : "'" + current.toString() + "'"
    }
}
