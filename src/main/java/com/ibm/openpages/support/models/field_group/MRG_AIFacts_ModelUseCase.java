package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.models.enum_value.MRGAIFactsModelUseCase_RiskLevel;
import com.ibm.openpages.models.enum_value.MRGAIFactsModelUseCase_Status;
import com.ibm.openpages.support.util.EnumFieldType;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_AIFacts_ModelUseCase {
    FieldGroup fg_MRG_AIFacts_ModelUseCase = new FieldGroup("MRG-AIFacts-ModelUseCase");

    Field Documentation = fg_MRG_AIFacts_ModelUseCase.addField("Documentation", FieldType.String);
    Field Purpose = fg_MRG_AIFacts_ModelUseCase.addField("Purpose", FieldType.String);
    Field RiskLevel = fg_MRG_AIFacts_ModelUseCase.addField("Risk Level", EnumFieldType.from(MRGAIFactsModelUseCase_RiskLevel.instance()));
    Field Status = fg_MRG_AIFacts_ModelUseCase.addField("Status", EnumFieldType.from(MRGAIFactsModelUseCase_Status.instance()));
}
