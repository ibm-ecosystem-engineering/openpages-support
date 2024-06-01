package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface OPSS_BusEnt {
    FieldGroup fg_OPSS_BusEnt = new FieldGroup("OPSS-BusEnt");

    Field BCManagers = fg_OPSS_BusEnt.addField("BCManagers", "Business Continuity Managers", FieldType.User);
    Field ComplianceOwner = fg_OPSS_BusEnt.addField("Compliance Owner", FieldType.User);
    Field EntityType = fg_OPSS_BusEnt.addField("Entity Type", FieldType.Enum);
    Field ExecutiveOwner = fg_OPSS_BusEnt.addField("Executive Owner", FieldType.User);
    Field InRSCAScope = fg_OPSS_BusEnt.addField("In RSCA Scope", FieldType.Enum);
    Field InScope = fg_OPSS_BusEnt.addField("In Scope", FieldType.Enum);
    Field Jurisdiction = fg_OPSS_BusEnt.addField("Jurisdiction", FieldType.Enum);
    Field LogoURL = fg_OPSS_BusEnt.addField("Logo URL", FieldType.String);
    Field RiskAppetite = fg_OPSS_BusEnt.addField("Risk Appetite", FieldType.Currency);
}
