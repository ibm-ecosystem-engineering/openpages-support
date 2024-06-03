package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.MRG_Metric;
import com.ibm.openpages.support.models.field_group.MRG_Metric_Shared;
import com.ibm.openpages.support.models.field_group.OPSS_Shared_Lib;
import com.ibm.openpages.support.models.field_group.SystemFields;

public interface Metric extends SystemFields, MRG_Metric, MRG_Metric_Shared, OPSS_Shared_Lib {
    IObjectType type = new ObjectType("Metric");
}
