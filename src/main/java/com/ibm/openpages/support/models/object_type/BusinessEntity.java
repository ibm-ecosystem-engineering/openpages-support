package com.ibm.openpages.models.object_type;

import com.ibm.openpages.models.field_group.MRG_BusEnt;
import com.ibm.openpages.models.field_group.OPSS_BE;
import com.ibm.openpages.models.field_group.OPSS_BusEnt;
import com.ibm.openpages.models.field_group.SystemFields;

public interface BusinessEntity extends SystemFields, MRG_BusEnt, OPSS_BE, OPSS_BusEnt {
}
