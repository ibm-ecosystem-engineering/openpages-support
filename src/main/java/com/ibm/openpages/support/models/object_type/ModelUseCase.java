package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.*;

public interface ModelUseCase extends SystemFields, Integration, IntegrationWKC, MRG_AIFacts_ModelUseCase, MRG_ModelUseCase, MRG_UserFact_ModelUseCase, Watsonx_UseCaseChecklist {
    IObjectType type = new ObjectType("ModelUseCase");
}
