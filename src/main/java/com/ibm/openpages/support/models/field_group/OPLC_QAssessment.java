package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.models.enum_value.OPLCQAssessment_LCName;
import com.ibm.openpages.models.enum_value.OPLCQAssessment_LCStage;
import com.ibm.openpages.models.enum_value.OPLCQAssessment_LCStatus;
import com.ibm.openpages.models.enum_value.OPLCQAssessment_LCTransition;
import com.ibm.openpages.support.util.EnumFieldType;

public interface OPLC_QAssessment {
    FieldGroup fg_OPLC_QAssessment = new FieldGroup("OPLC-QAssessment");

    Field LCName = fg_OPLC_QAssessment.addField("LCName", "Lifecycle", EnumFieldType.from(OPLCQAssessment_LCName.instance()));
    Field LCStatus = fg_OPLC_QAssessment.addField("LCStatus", "Lifecycle Status", EnumFieldType.from(OPLCQAssessment_LCStatus.instance()));
    Field LCStage = fg_OPLC_QAssessment.addField("LCStage", "Stage", EnumFieldType.from(OPLCQAssessment_LCStage.instance()));
    Field LCTransition = fg_OPLC_QAssessment.addField("LCTransition", "Transition", EnumFieldType.from(OPLCQAssessment_LCTransition.instance()));
}
