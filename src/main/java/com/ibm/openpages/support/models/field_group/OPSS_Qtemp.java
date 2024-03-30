package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_Qtemp {
    FieldGroup fg_OPSS_Qtemp = new FieldGroup("OPSS-Qtemp");

    Field CompletionRequired = fg_OPSS_Qtemp.addField("CompletionRequired", "Completion Required", FieldType.Boolean);
    Field Scoring = fg_OPSS_Qtemp.addField("Scoring", "Questionnaire Scoring Method", FieldType.Enum);
    Field Type = fg_OPSS_Qtemp.addField("Type", FieldType.Enum);
}
