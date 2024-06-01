package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_MetricVal {
    FieldGroup fg_MRG_MetricVal = new FieldGroup("MRG-MetricVal");

    Field ApproveReject = fg_MRG_MetricVal.addField("Approve Reject", "Approve / Reject", FieldType.Enum);
    Field ExpectedCollectionDate = fg_MRG_MetricVal.addField("Expected Collection Date", "Expected Collection Date", FieldType.Date);
    Field MetricOwner = fg_MRG_MetricVal.addField("Metric Owner", FieldType.User);
    Field MetricValueApprovalRequired = fg_MRG_MetricVal.addField("Metric Value Approval Required", "Metric Value Approval Required", FieldType.Enum);
    Field Value = fg_MRG_MetricVal.addField("Value", FieldType.Decimal);
    Field ValueDate = fg_MRG_MetricVal.addField("Value Date", FieldType.Date);
}
