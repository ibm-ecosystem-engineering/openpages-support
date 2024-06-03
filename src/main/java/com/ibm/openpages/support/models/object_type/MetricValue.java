package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.MRG_MetricVal;
import com.ibm.openpages.support.models.field_group.MRG_Metric_Shared;
import com.ibm.openpages.support.models.field_group.SystemFields;

public interface MetricValue extends SystemFields, MRG_Metric_Shared, MRG_MetricVal {
    IObjectType type = new ObjectType("MetricValue");
}
