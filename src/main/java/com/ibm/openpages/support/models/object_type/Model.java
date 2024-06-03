package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.*;

public interface Model extends SystemFields, Integration, IntegrationWKC, MRG_AIFacts_Model, MRG_Model, MRG_MTS_Shared, MRG_UserFact_Model {
    IObjectType type = new ObjectType("Model");
}
