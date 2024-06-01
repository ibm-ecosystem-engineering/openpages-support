package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_BusEnt {
    FieldGroup fg_MRG_BusEnt = new FieldGroup("MRG-BusEnt");

    Field AdditionalDescription = fg_MRG_BusEnt.addField("Additional Description", FieldType.String);
    Field CatalogId = fg_MRG_BusEnt.addField("Catalog ID", FieldType.String);
}
