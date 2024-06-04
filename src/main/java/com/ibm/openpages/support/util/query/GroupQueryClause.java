package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GroupQueryClause extends QueryClause {
    private final boolean and;
    private final List<QueryClause> clauses;

    protected GroupQueryClause(boolean and, IObjectType type) {
        this(and, type, new ArrayList<>());
    }
    protected GroupQueryClause(boolean and, IObjectType type, QueryClause... clauses) {
        this(and, type, Arrays.asList(clauses));
    }
    protected GroupQueryClause(boolean and, IObjectType type, List<QueryClause> clauses) {
        super(type);

        this.and = and;
        this.clauses = clauses;
    }

    public boolean isAnd() {
        return and;
    }
    public boolean isOr() {
        return !and;
    }

    public void add(QueryClause clause) {
        clauses.add(clause);
    }

    @Override
    public String toClause() {
        final String delimiter = and ? " AND " : " OR ";

        return "(" + clauses.stream().map(QueryClause::toClause).collect(Collectors.joining(delimiter)) + ")";
    }
}
