package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface SystemFields {
    FieldGroup fg_SystemFields = new FieldGroup("System Fields");

    Field Name = fg_SystemFields.addField("Name", FieldType.String);
}
