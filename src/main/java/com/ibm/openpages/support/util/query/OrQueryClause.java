package com.ibm.openpages.support.util.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrQueryClause extends GroupQueryClause {
    private final List<QueryClause> clauses;

    protected OrQueryClause() {
        this(new ArrayList<>());
    }
    protected OrQueryClause(QueryClause... clauses) {
        this(Arrays.asList(clauses));
    }
    protected OrQueryClause(List<QueryClause> clauses) {
        this.clauses = clauses;
    }

    @Override
    public boolean isOr() {
        return true;
    }

    @Override
    public void add(QueryClause clause) {
        clauses.add(clause);
    }

    @Override
    public String toClause() {
        return "(" + clauses.stream().map(QueryClause::toClause).collect(Collectors.joining(" OR ")) + ")";
    }
}
