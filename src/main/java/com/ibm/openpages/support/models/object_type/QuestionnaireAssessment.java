package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.*;

public interface QuestionnaireAssessment extends SystemFields, OPLC_QAssessment, OPLC_Std, OPSS_QAssessment, Watsonx_QAssessment {
    IObjectType type = new ObjectType("QuestionnaireAssessment");
}
