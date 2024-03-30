package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_Shared_Lib {
    FieldGroup fg_OPSS_Shared_Lib = new FieldGroup("OPSS-Shared-Lib");

    Field LibraryId = fg_OPSS_Shared_Lib.addField("Library ID", FieldType.String);
}
