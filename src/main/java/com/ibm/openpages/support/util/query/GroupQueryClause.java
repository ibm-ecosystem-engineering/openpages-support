package com.ibm.openpages.support.util.query;

public abstract class GroupQueryClause extends QueryClause {

    public boolean isAnd() {
        return false;
    }
    public boolean isOr() {
        return false;
    }

    public abstract void add(QueryClause clause);
}
