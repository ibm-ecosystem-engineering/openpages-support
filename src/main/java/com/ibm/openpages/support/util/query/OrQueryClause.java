package com.ibm.openpages.support.util.query;

import com.ibm.openpages.support.models.IObjectType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrQueryClause extends GroupQueryClause {
    protected OrQueryClause(IObjectType type) {
        this(type, new ArrayList<>());
    }

    protected OrQueryClause(IObjectType type, QueryClause... clauses) {
        this(type, Arrays.asList(clauses));
    }

    protected OrQueryClause(IObjectType type, List<QueryClause> clauses) {
        super(false, type, clauses);
    }
}
