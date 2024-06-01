package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_UserFact_Model {
    FieldGroup fg_MRG_UserFact_Model = new FieldGroup("MRG-UserFact-Model");

    Field AdditionalDetails = fg_MRG_UserFact_Model.addField("Additional Details", FieldType.String);
}
