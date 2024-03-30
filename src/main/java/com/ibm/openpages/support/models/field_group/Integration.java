package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.models.enum_value.Integration_Application;
import com.ibm.openpages.support.util.FieldType;
import com.ibm.openpages.support.util.EnumFieldType;

public interface Integration {
    FieldGroup fg_Integration = new FieldGroup("Integration");

    Field AdditionalInformation = fg_Integration.addField("Additional Information", FieldType.String);
    Field Application = fg_Integration.addField("Application", EnumFieldType.from(Integration_Application.instance()));
    Field ExternalId = fg_Integration.addField("External ID", FieldType.String);
    Field LastUpdate = fg_Integration.addField("Last Update", FieldType.Date);
    Field ThirdPartyLink = fg_Integration.addField("Third Party Link", FieldType.Date);
}
