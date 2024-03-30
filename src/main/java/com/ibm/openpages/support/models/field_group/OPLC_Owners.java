package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPLC_Owners {
    FieldGroup fg_OPLC_Owners = new FieldGroup("OPLC-Owners");

    Field AdditionalOwners = fg_OPLC_Owners.addField("AdditionalOwners", "Additional Owners", FieldType.String);
    Field Approver = fg_OPLC_Owners.addField("Approver", FieldType.User);
    Field BusinessOwner = fg_OPLC_Owners.addField("BusinessOwner", "Business Owner", FieldType.String);
    Field ControlAttester = fg_OPLC_Owners.addField("Control Attester", FieldType.String);
    Field PrimaryOwner = fg_OPLC_Owners.addField("PrimaryOwner", "Primary Owner", FieldType.User);
    Field Reviewer = fg_OPLC_Owners.addField("Reviewer", FieldType.User);
}
