package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.models.enum_value.WatsonxQAssessment_AIAssessmentType;
import com.ibm.openpages.support.util.EnumFieldType;

public interface Watsonx_QAssessment {
    FieldGroup fg_watsonx_QAssessment = new FieldGroup("watsonx-QAssessment");

    Field AIAssessmentType = fg_watsonx_QAssessment.addField("AIAssessmentType", "AI Assessment Type", EnumFieldType.from(WatsonxQAssessment_AIAssessmentType.instance()));
}
