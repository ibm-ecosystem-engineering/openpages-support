package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_Qtemp_Config {
    FieldGroup fg_OPSS_Qtemp_Config = new FieldGroup("OPSS-Qtemp-Config");

    Field EnableAutoNumbering = fg_OPSS_Qtemp_Config.addField("EnableAutoNumbering", FieldType.Boolean);
    Field EnableTitles = fg_OPSS_Qtemp_Config.addField("EnableTitles", FieldType.Boolean);
    Field EnableWeightScore = fg_OPSS_Qtemp_Config.addField("EnableWeightScore", FieldType.Boolean);
    Field QuestionnaireDepth = fg_OPSS_Qtemp_Config.addField("QuestionnaireDepth", FieldType.Integer);
    Field Required = fg_OPSS_Qtemp_Config.addField("Required", FieldType.Boolean);
}
