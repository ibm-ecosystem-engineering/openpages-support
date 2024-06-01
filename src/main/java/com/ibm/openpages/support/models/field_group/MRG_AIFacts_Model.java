package com.ibm.openpages.support.models.field_group;

import com.ibm.openpages.support.models.Field;
import com.ibm.openpages.support.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_AIFacts_Model {
    FieldGroup fg_MRG_AIFacts_Model = new FieldGroup("MRG-AIFacts-Model");

    Field Algorithm = fg_MRG_AIFacts_Model.addField("Algorithm", FieldType.String);
    Field ApproachDescription = fg_MRG_AIFacts_Model.addField("Approach Description", FieldType.String);
    Field ApproachName = fg_MRG_AIFacts_Model.addField("Approach Name", FieldType.String);
    Field HybridPipeline = fg_MRG_AIFacts_Model.addField("Hybrid Pipeline", FieldType.String);
    Field Hyperparameters = fg_MRG_AIFacts_Model.addField("Hyperparameters", FieldType.String);
    Field Input_Schema = fg_MRG_AIFacts_Model.addField("Input Schema", FieldType.String);
    Field InputSchema = fg_MRG_AIFacts_Model.addField("InputSchema", "Input Schema", FieldType.String);
    Field InputType = fg_MRG_AIFacts_Model.addField("Input Type", FieldType.String);
    Field ModelType = fg_MRG_AIFacts_Model.addField("Model Type", "Model Asset Type", FieldType.String);
    Field CreatedBy = fg_MRG_AIFacts_Model.addField("Created By", "Model Created By", FieldType.String);
    Field ModelParameters = fg_MRG_AIFacts_Model.addField("Model Parameters", FieldType.String);
    Field NumberOfFeatures = fg_MRG_AIFacts_Model.addField("Number of Features", FieldType.Integer);
    Field Output_Schema = fg_MRG_AIFacts_Model.addField("Output Schema", FieldType.String);
    Field OutputSchema = fg_MRG_AIFacts_Model.addField("OutputSchema", "Output Schema", FieldType.String);
    Field PredictionType = fg_MRG_AIFacts_Model.addField("Prediction Type", FieldType.String);
    Field Prompt = fg_MRG_AIFacts_Model.addField("Prompt", FieldType.String);
    Field PromptVariables = fg_MRG_AIFacts_Model.addField("Prompt Variables", FieldType.String);
    Field SoftwareSpecification = fg_MRG_AIFacts_Model.addField("Software Specification", FieldType.String);
    Field Tier = fg_MRG_AIFacts_Model.addField("Tier", FieldType.String);
    Field Training_Data = fg_MRG_AIFacts_Model.addField("Training Data", FieldType.String);
    Field TrainingData = fg_MRG_AIFacts_Model.addField("TrainingData", "Training Data", FieldType.String);
    Field Training_Parameters = fg_MRG_AIFacts_Model.addField("Training Parameters", FieldType.String);
    Field TrainingParameters = fg_MRG_AIFacts_Model.addField("TrainingParameters", "Training Parameters", FieldType.String);
    Field Training_Tags = fg_MRG_AIFacts_Model.addField("Training Tags", FieldType.String);
    Field TrainingTags = fg_MRG_AIFacts_Model.addField("TrainingTags", "Training Tags", FieldType.String);
}
