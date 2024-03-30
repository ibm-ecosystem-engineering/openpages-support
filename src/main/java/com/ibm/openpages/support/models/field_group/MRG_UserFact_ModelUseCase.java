package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_UserFact_ModelUseCase {
    FieldGroup fg_MRG_UserFact_ModelUseCase = new FieldGroup("MRG-UserFact-ModelUseCase");

    Field AdditionalDetails = fg_MRG_UserFact_ModelUseCase.addField("Additional Details", FieldType.String);
}
