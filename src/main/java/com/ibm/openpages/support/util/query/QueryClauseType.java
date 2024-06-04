package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ResultValue;

public class QueryClauseType {

    private final IObjectType type;

    protected QueryClauseType(IObjectType type) {
        this.type = type;
    }

    public static QueryClauseType on(IObjectType type) {
        return new QueryClauseType(type);
    }

    public QueryClause where(ResultValue field, Operation operation, ResultValue value) {
        return where(field, operation, value.value());
    }
    public QueryClause where(ResultValue field, Operation operation, Object value) {
        return new SimpleQueryClause(type, field, operation, value);
    }

}
