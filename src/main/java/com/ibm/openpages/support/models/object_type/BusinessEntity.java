package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.field_group.MRG_BusEnt;
import com.ibm.openpages.support.models.field_group.OPSS_BE;
import com.ibm.openpages.support.models.field_group.OPSS_BusEnt;
import com.ibm.openpages.support.models.field_group.SystemFields;

public interface BusinessEntity extends SystemFields, MRG_BusEnt, OPSS_BE, OPSS_BusEnt {
}
