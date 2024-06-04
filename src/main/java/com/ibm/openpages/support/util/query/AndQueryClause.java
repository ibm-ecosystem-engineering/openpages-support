package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AndQueryClause extends GroupQueryClause {
    protected AndQueryClause(IObjectType type) {
        this(type, new ArrayList<>());
    }

    protected AndQueryClause(IObjectType type, QueryClause... clauses) {
        this(type, Arrays.asList(clauses));
    }

    protected AndQueryClause(IObjectType type, List<QueryClause> clauses) {
        super(true, type, clauses);
    }
}
