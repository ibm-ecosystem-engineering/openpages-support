package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ResultValue;

public class SimpleQueryClause extends QueryClause {
    private final IObjectType type;
    private final ResultValue field;
    private final Operation operation;
    private final Object value;

    protected SimpleQueryClause(IObjectType type, ResultValue field, Operation operation, Object value) {
        this.type = type;
        this.field = field;
        this.operation = operation;
        this.value = value;
    }

    @Override
    public String toClause() {
        return operation.toClause(type, field, value);
    }
}
