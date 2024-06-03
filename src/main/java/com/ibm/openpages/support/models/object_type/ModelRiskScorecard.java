package com.ibm.openpages.support.models.object_type;

import com.ibm.openpages.support.models.IObjectType;
import com.ibm.openpages.support.models.ObjectType;
import com.ibm.openpages.support.models.field_group.MRG_MTS;
import com.ibm.openpages.support.models.field_group.MRG_MTS_Shared;
import com.ibm.openpages.support.models.field_group.SystemFields;

public interface ModelRiskScorecard extends SystemFields, MRG_MTS, MRG_MTS_Shared {
    IObjectType type = new ObjectType("ModelRiskScorecard");
}
