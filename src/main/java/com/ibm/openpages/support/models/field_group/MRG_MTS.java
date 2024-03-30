package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_MTS {
    FieldGroup fg_MRG_MTS = new FieldGroup("MRG-MTS");

    Field ComplexityComp1 = fg_MRG_MTS.addField("ComplexityComp1", "Complexity Component 1", FieldType.Enum);
    Field ComplexityComp1Score = fg_MRG_MTS.addField("ComplexityComp1Score", "Complexity Component 1 Score", FieldType.Decimal);
    Field ComplexityComp1WScore = fg_MRG_MTS.addField("ComplexityComp1WScore", "Complexity Component 1 Weighted Score", FieldType.Decimal);
    Field ComplexityComp2 = fg_MRG_MTS.addField("ComplexityComp2", "Complexity Component 2", FieldType.Enum);
    Field ComplexityComp2Score = fg_MRG_MTS.addField("ComplexityComp2Score", "Complexity Component 2 Score", FieldType.Decimal);
    Field ComplexityComp2WScore = fg_MRG_MTS.addField("ComplexityComp2WScore", "Complexity Component 2 Weighted Score", FieldType.Decimal);
    Field ComplexityComp3 = fg_MRG_MTS.addField("ComplexityComp3", "Complexity Component 3", FieldType.Enum);
    Field ComplexityComp3Score = fg_MRG_MTS.addField("ComplexityComp3Score", "Complexity Component 3 Score", FieldType.Decimal);
    Field ComplexityComp3WScore = fg_MRG_MTS.addField("ComplexityComp3WScore", "Complexity Component 3 Weighted Score", FieldType.Decimal);
    Field MatComp1 = fg_MRG_MTS.addField("MatComp1", "Materiality Component 1", FieldType.Decimal);
    Field MatComp1Score = fg_MRG_MTS.addField("MatComp1Score", "Materiality Component 1 Score", FieldType.Enum);
    Field MatComp1WScore = fg_MRG_MTS.addField("MatComp1WScore", "Materiality Component 1 Weighted Score", FieldType.Decimal);
    Field MatComp2 = fg_MRG_MTS.addField("MatComp2", "Materiality Component 2", FieldType.Decimal);
    Field MatComp2Score = fg_MRG_MTS.addField("MatComp2Score", "Materiality Component 2 Score", FieldType.Enum);
    Field MatComp2WScore = fg_MRG_MTS.addField("MatComp2WScore", "Materiality Component 2 Weighted Score", FieldType.Decimal);
    Field MatComp3 = fg_MRG_MTS.addField("MatComp3", "Materiality Component 3", FieldType.Decimal);
    Field MatComp3Score = fg_MRG_MTS.addField("MatComp3Score", "Materiality Component 3 Score", FieldType.Enum);
    Field MatComp3WScore = fg_MRG_MTS.addField("MatComp3WScore", "Materiality Component 3 Weighted Score", FieldType.Decimal);
    Field OperationalComp1 = fg_MRG_MTS.addField("OperationalComp1", "Operational Component 1", FieldType.Enum);
    Field OperationalComp1Score = fg_MRG_MTS.addField("OperationalComp1Score", "Operational Component 1 Score", FieldType.Decimal);
    Field OperationalComp1WScore = fg_MRG_MTS.addField("OperationalComp1WScore", "Operational Component 1 Weighted Score", FieldType.Decimal);
    Field OperationalComp2 = fg_MRG_MTS.addField("OperationalComp2", "Operational Component 2", FieldType.Enum);
    Field OperationalComp2Score = fg_MRG_MTS.addField("OperationalComp2Score", "Operational Component 2 Score", FieldType.Decimal);
    Field OperationalComp2WScore = fg_MRG_MTS.addField("OperationalComp2WScore", "Operational Component 2 Weighted Score", FieldType.Decimal);
    Field OperationalComp3 = fg_MRG_MTS.addField("OperationalComp3", "Operational Component 3", FieldType.Enum);
    Field OperationalComp3Score = fg_MRG_MTS.addField("OperationalComp3Score", "Operational Component 3 Score", FieldType.Decimal);
    Field OperationalComp3WScore = fg_MRG_MTS.addField("OperationalComp3WScore", "Operational Component 3 Weighted Score", FieldType.Decimal);
    Field RegComp1 = fg_MRG_MTS.addField("RegComp1", "Regulatory Component 1", FieldType.Enum);
    Field RegComp1Score = fg_MRG_MTS.addField("RegComp1Score", "Regulatory Component 1 Score", FieldType.Decimal);
    Field RegComp1WScore = fg_MRG_MTS.addField("RegComp1WScore", "Regulatory Component 1 Weighted Score", FieldType.Decimal);
    Field RegComp2 = fg_MRG_MTS.addField("RegComp2", "Regulatory Component 2", FieldType.Enum);
    Field RegComp2Score = fg_MRG_MTS.addField("RegComp2Score", "Regulatory Component 2 Score", FieldType.Decimal);
    Field RegComp2WScore = fg_MRG_MTS.addField("RegComp2WScore", "Regulatory Component 2 Weighted Score", FieldType.Decimal);
    Field RegComp3 = fg_MRG_MTS.addField("RegComp3", "Regulatory Component 3", FieldType.Enum);
    Field RegComp3Score = fg_MRG_MTS.addField("RegComp3Score", "Regulatory Component 3 Score", FieldType.Decimal);
    Field RegComp3WScore = fg_MRG_MTS.addField("RegComp3WScore", "Regulatory Component 3 Weighted Score", FieldType.Decimal);
}
