package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface Watsonx_UseCaseChecklist {
    FieldGroup fg_watsonx_UseCaseChecklist = new FieldGroup("watsonx-UseCaseChecklist");

    Field DataGatheringCompletionDate = fg_watsonx_UseCaseChecklist.addField("Data Gathering Completion Date", FieldType.Date);
    Field RegulatoryApplicabilityAssessmentCompletionDate = fg_watsonx_UseCaseChecklist.addField("Regulatory Applicability Assessment Completion Date", FieldType.Date);
    Field RiskAssessmentCompletionDate = fg_watsonx_UseCaseChecklist.addField("Risk Assessment Completion Date", FieldType.Date);
    Field RiskIdentificationCompletionDate = fg_watsonx_UseCaseChecklist.addField("Risk Identification Completion Date", FieldType.Date);
    Field StakeholderApprovalCompletionDate = fg_watsonx_UseCaseChecklist.addField("Stakeholder Approval Completion Date", FieldType.Date);
}
