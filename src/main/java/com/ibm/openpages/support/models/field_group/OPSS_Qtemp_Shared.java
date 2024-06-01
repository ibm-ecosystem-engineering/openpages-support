package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_Qtemp_Shared {
    FieldGroup fg_OPSS_Qtemp_Shared = new FieldGroup("OPSS-Qtemp-Shared");

    Field Metadata = fg_OPSS_Qtemp_Shared.addField("Metadata", "Authoring Metadata", FieldType.String);
    Field Order = fg_OPSS_Qtemp_Shared.addField("Order", FieldType.Integer);
    Field Rationale = fg_OPSS_Qtemp_Shared.addField("Rationale", FieldType.String);
    Field Reference = fg_OPSS_Qtemp_Shared.addField("Reference", FieldType.String);
    Field ReportId = fg_OPSS_Qtemp_Shared.addField("ReportID", "Report Identifier", FieldType.String);
    Field Title = fg_OPSS_Qtemp_Shared.addField("Title", FieldType.String);
    Field Weight = fg_OPSS_Qtemp_Shared.addField("Weight", FieldType.Integer);
}
