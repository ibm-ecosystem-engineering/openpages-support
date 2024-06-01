package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_MTS_Shared {
    FieldGroup fg_MRG_MTS_Shared = new FieldGroup("MRG-MTS-Shared");

    Field Assessor = fg_MRG_MTS_Shared.addField("Assessor", FieldType.User);
    Field ComputedTier = fg_MRG_MTS_Shared.addField("ComputedTier", "Computed Tier", FieldType.Integer);
    Field FinalTier = fg_MRG_MTS_Shared.addField("FinalTier", "Final Tier", FieldType.Integer);
    Field OverallComplexityScore = fg_MRG_MTS_Shared.addField("OverallComplexityScore", "Overall Complexity Score", FieldType.Decimal);
    Field OverallComplexityWScore = fg_MRG_MTS_Shared.addField("OverallComplexityWScore", "Overall Complexity Weighted Score", FieldType.Decimal);
    Field OverallMatScore = fg_MRG_MTS_Shared.addField("OverallMatScore", "Overall Materiality Score", FieldType.Decimal);
    Field OverallMatWScore = fg_MRG_MTS_Shared.addField("OverallMatWScore", "Overall Materiality Weighted Score", FieldType.Decimal);
    Field OverallOperationalScore = fg_MRG_MTS_Shared.addField("OverallOperationalScore", "Overall Operational Score", FieldType.Decimal);
    Field OverallOperationalWScore = fg_MRG_MTS_Shared.addField("OverallOperationalWScore", "Overall Operational Weighted Score", FieldType.Decimal);
    Field OverallRegScore = fg_MRG_MTS_Shared.addField("OverallRegScore", "Overall Regulatory Score", FieldType.Decimal);
    Field OverallRegWScore = fg_MRG_MTS_Shared.addField("OverallRegWScore", "Overall Regulatory Weighted Score", FieldType.Decimal);
    Field OverrideTier = fg_MRG_MTS_Shared.addField("OverrideTier", "Override", FieldType.Enum);
    Field Status = fg_MRG_MTS_Shared.addField("Status", FieldType.Enum);
    Field TieringDate = fg_MRG_MTS_Shared.addField("Tiering Date", FieldType.Date);
    Field TotalComputedScore = fg_MRG_MTS_Shared.addField("TotalComputedScore", "Total Computed Score", FieldType.Decimal);
}
