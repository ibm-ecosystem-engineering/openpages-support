package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.models.enum_value.OPLCStd_LCUpdateAssignee;
import com.ibm.openpages.support.util.EnumFieldType;
import com.ibm.openpages.support.util.FieldType;

public interface OPLC_Std {
    FieldGroup fg_OPLC_Std = new FieldGroup("OPLC-Std");

    Field LCAssignee = fg_OPLC_Std.addField("LCAssignee", "Assignee", FieldType.User);
    Field LCInReview = fg_OPLC_Std.addField("LCInReview", "In Review", FieldType.Boolean);
    Field LCComment = fg_OPLC_Std.addField("LCComment", "Lifecycle Comment", FieldType.String);
    Field LCDueDate = fg_OPLC_Std.addField("LCDueDate", "Lifecycle Due Date", FieldType.Date);
    Field LCReadOnly = fg_OPLC_Std.addField("LCReadOnly", "Read Only", FieldType.Boolean);
    Field LCUpdateAssignee = fg_OPLC_Std.addField("LCUpdateAssignee", "Update Assignee", EnumFieldType.from(OPLCStd_LCUpdateAssignee.instance()));
}
