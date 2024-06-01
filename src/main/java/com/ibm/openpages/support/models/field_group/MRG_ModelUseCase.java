package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.models.enum_value.MRGModelUseCase_ExternallyFacing;
import com.ibm.openpages.support.models.enum_value.MRGModelUseCase_UseCaseType;
import com.ibm.openpages.support.models.enum_value.MRGModelUseCase_UsesFoundationModels;
import com.ibm.openpages.support.util.EnumFieldType;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_ModelUseCase {
    FieldGroup fg_MRG_ModelUseCase = new FieldGroup("MRG-ModelUseCase");

    Field ExternalFacing = fg_MRG_ModelUseCase.addField("Externally Facing", EnumFieldType.from(MRGModelUseCase_ExternallyFacing.instance()));
    Field Owner = fg_MRG_ModelUseCase.addField("Owner", FieldType.User);
    Field ProposedSolution = fg_MRG_ModelUseCase.addField("Proposed Solution", FieldType.String);
    Field TargetImplementationDate = fg_MRG_ModelUseCase.addField("Target Implementation Date", FieldType.Date);
    Field UseCaseType = fg_MRG_ModelUseCase.addField("Use Case Type", EnumFieldType.from(MRGModelUseCase_UseCaseType.instance()));
    Field UsesFoundationModels = fg_MRG_ModelUseCase.addField("Uses Foundation Models", EnumFieldType.from(MRGModelUseCase_UsesFoundationModels.instance()));
}