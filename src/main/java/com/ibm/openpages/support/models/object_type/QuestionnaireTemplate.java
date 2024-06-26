package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.*;

public interface QuestionnaireTemplate extends SystemFields, OPLC_Owners, OPSS_Qtemp, OPSS_Qtemp_Config, OPSS_Qtemp_Shared {
    IObjectType type = new ObjectType("QuestionnaireTemplate");
}
