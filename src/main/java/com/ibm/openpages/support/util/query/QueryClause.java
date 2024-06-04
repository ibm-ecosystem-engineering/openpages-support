package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ResultValue;

public abstract class QueryClause {

    protected final IObjectType type;

    protected QueryClause(IObjectType type) {
        this.type = type;
    }

    public static QueryClauseType forType(IObjectType type) {
        return new QueryClauseType(type);
    }

    public static QueryClause where(IObjectType type, ResultValue field, Operation operation, ResultValue value) {
        return where(type, field, operation, value.value());
    }
    public static QueryClause where(IObjectType type, ResultValue field, Operation operation, Object value) {
        return new SimpleQueryClause(type, field, operation, value);
    }

    public QueryClause and(ResultValue field, Operation operation, ResultValue value) {
        return and(type, field, operation, value);
    }
    public QueryClause and(ResultValue field, Operation operation, Object value) {
        return and(type, field, operation, value);
    }
    public QueryClause and(IObjectType type, ResultValue field, Operation operation, ResultValue value) {
        return and(type, field, operation, value.value());
    }
    public QueryClause and(IObjectType type, ResultValue field, Operation operation, Object value) {
        return and(new SimpleQueryClause(type, field, operation, value));
    }

    public QueryClause and(QueryClause clause) {
        if (this instanceof GroupQueryClause && ((GroupQueryClause)this).isAnd()) {
            final GroupQueryClause groupClause = (GroupQueryClause)this;

            groupClause.add(clause);

            return this;
        }

        return new AndQueryClause(this.type, this, clause);
    }

    public QueryClause or(ResultValue field, Operation operation, ResultValue value) {
        return or(type, field, operation, value);
    }
    public QueryClause or(ResultValue field, Operation operation, Object value) {
        return or(type, field, operation, value);
    }
    public QueryClause or(IObjectType type, ResultValue field, Operation operation, ResultValue value) {
        return or(type, field, operation, value.value());
    }
    public QueryClause or(IObjectType type, ResultValue field, Operation operation, Object value) {
        return or(new SimpleQueryClause(type, field, operation, value));
    }

    public QueryClause or(QueryClause clause) {
        if (this instanceof GroupQueryClause && ((GroupQueryClause)this).isOr()) {
            final GroupQueryClause groupClause = (GroupQueryClause)this;

            groupClause.add(clause);

            return this;
        }

        return new OrQueryClause(this.type, this, clause);
    }

    public abstract String toClause();
}
