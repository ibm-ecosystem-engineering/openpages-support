package com.ibm.openpages.support.util.query;

public enum Operation {
    EQUAL("=");

    private final String value;

    Operation(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
