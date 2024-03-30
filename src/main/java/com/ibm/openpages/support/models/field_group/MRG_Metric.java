package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_Metric {
    FieldGroup fg_MRGMetric = new FieldGroup("MRG-Metric");

    Field CollectionStartDate = fg_MRGMetric.addField("Collection Start Date", FieldType.Date);
    Field DataSource = fg_MRGMetric.addField("Data Source", FieldType.String);
    Field Frequency = fg_MRGMetric.addField("Frequency", FieldType.Enum);
    Field FrequencyOffsetDays = fg_MRGMetric.addField("Frequency Offset Days", FieldType.Integer);
    Field IndicatorTrend = fg_MRGMetric.addField("Indicator Trend", FieldType.Enum);
    Field MeasurementRules = fg_MRGMetric.addField("Measurement Rules", FieldType.String);
    Field MetricValueApprovalRequired = fg_MRGMetric.addField("Metric Value Approval Required", FieldType.Enum);
    Field Nature = fg_MRGMetric.addField("Nature", FieldType.Enum);
    Field NextCollectionDate = fg_MRGMetric.addField("Next Collection Date", FieldType.Date);
    Field Owner = fg_MRGMetric.addField("Owner", FieldType.User);
    Field Status = fg_MRGMetric.addField("Status", FieldType.Enum);
    Field UnitOfMeasure = fg_MRGMetric.addField("Unit of Measure", FieldType.Enum);
    Field Value = fg_MRGMetric.addField("Value", FieldType.Decimal);
    Field ValueDate = fg_MRGMetric.addField("Value Date", FieldType.Date);
    Field ValueRange = fg_MRGMetric.addField("Value Range", FieldType.String);
}
