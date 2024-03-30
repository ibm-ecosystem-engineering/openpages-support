package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_Metric_Shared {
    FieldGroup fg_MRG_Metric_Shared = new FieldGroup("MRG-Metric-Shared");

    Field BreachStatus = fg_MRG_Metric_Shared.addField("Breach Status", FieldType.Enum);
    Field CollectionStatus = fg_MRG_Metric_Shared.addField("Collection Status", FieldType.Enum);
    Field DirectionInformation = fg_MRG_Metric_Shared.addField("Direction Information", FieldType.Enum);
    Field LowerThreshold = fg_MRG_Metric_Shared.addField("Lower Threshold", FieldType.Decimal);
    Field MetricCapturer = fg_MRG_Metric_Shared.addField("Metric Capturer", FieldType.User);
    Field MetricType = fg_MRG_Metric_Shared.addField("Metric Type", FieldType.Enum);
    Field RedThreshold = fg_MRG_Metric_Shared.addField("Red Threshold", FieldType.Decimal);
    Field UpperThreshold = fg_MRG_Metric_Shared.addField("Upper Threshold", FieldType.Decimal);
    Field OpenScaleCategory = fg_MRG_Metric_Shared.addField("OpenScale Category", "Watson OpenScale Category", FieldType.Enum);
    Field OpenScaleDescription = fg_MRG_Metric_Shared.addField("OpenScale Description", "Watson OpenScale Description", FieldType.String);
    Field OpenScaleMetric = fg_MRG_Metric_Shared.addField("OpenScale Metric", "Watson OpenScale Metric", FieldType.String);
    Field OpenScaleMetricValue = fg_MRG_Metric_Shared.addField("OpenScale Metric Value", "Watson OpenScale Metric Value", FieldType.String);
    Field OpenScaleSubcategory = fg_MRG_Metric_Shared.addField("OpenScale Subcategory", "Watson OpenScale Sub-Category", FieldType.String);
    Field OpenScaleSubscriptionName = fg_MRG_Metric_Shared.addField("OpenScale Subscription Name", "Watson OpenScale Subscription Name", FieldType.String);
    Field OpenScaleSubscriptionType = fg_MRG_Metric_Shared.addField("OpenScale Subscription Type", "Watson OpenScale Subscription Type", FieldType.String);
    Field YellowThreshold = fg_MRG_Metric_Shared.addField("Yellow Threshold", FieldType.Decimal);
}
