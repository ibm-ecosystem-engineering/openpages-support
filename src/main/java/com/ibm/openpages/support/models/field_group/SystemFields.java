package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface SystemFields {
    FieldGroup fg_SystemFields = new FieldGroup("System Fields");

    Field Name = fg_SystemFields.addField("Name", FieldType.String);
}
