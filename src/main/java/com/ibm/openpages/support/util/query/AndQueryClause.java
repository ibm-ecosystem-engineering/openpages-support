package com.ibm.openpages.support.util.query;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AndQueryClause extends GroupQueryClause {
    private final List<QueryClause> clauses;

    protected AndQueryClause() {
        this(new ArrayList<>());
    }
    protected AndQueryClause(QueryClause... clauses) {
        this(Arrays.asList(clauses));
    }
    protected AndQueryClause(List<QueryClause> clauses) {
        this.clauses = clauses;
    }

    @Override
    public boolean isAnd() {
        return true;
    }

    @Override
    public void add(QueryClause clause) {
        clauses.add(clause);
    }

    @Override
    public String toClause() {
        return "(" + clauses.stream().map(QueryClause::toClause).collect(Collectors.joining(" AND ")) + ")";
    }
}
