package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_QAssessment {
    FieldGroup fg_OPSS_QAssessment = new FieldGroup("OPSS-QAssessment");

    Field ComplianceScore = fg_OPSS_QAssessment.addField("ComplianceScore", "Compliance Score (%)", FieldType.Integer);
    Field MaxRiskScore = fg_OPSS_QAssessment.addField("MaxRiskScore", "Max Risk Score", FieldType.Integer);
    Field Progress = fg_OPSS_QAssessment.addField("Progress", "Progress (%)", FieldType.Integer);
    Field RespQuest = fg_OPSS_QAssessment.addField("RespQuest", "Questionnaire UI", FieldType.String);
    Field RiskScore = fg_OPSS_QAssessment.addField("RiskScore", "Risk Score", FieldType.Integer);
    Field Score = fg_OPSS_QAssessment.addField("Score", FieldType.Integer);
}
