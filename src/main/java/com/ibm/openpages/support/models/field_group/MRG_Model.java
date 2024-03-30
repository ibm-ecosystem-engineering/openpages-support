package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.models.enum_value.*;
import com.ibm.openpages.support.util.EnumFieldType;
import com.ibm.openpages.support.util.FieldType;

public interface MRG_Model {
    FieldGroup fg_MRG_Model = new FieldGroup("MRG-Model");

    Field AdditionalDescription = fg_MRG_Model.addField("Additional Description", FieldType.String);
    Field ApprovalClosureDate = fg_MRG_Model.addField("Approval Closure Date", FieldType.Date);
    Field ApprovalExpectedDate = fg_MRG_Model.addField("Approval Expected Date", FieldType.Date);
    Field ApprovalOriginalDate = fg_MRG_Model.addField("Approval Original Date", FieldType.Date);
    Field ApprovalPresentDueDate = fg_MRG_Model.addField("Approval Present Due Date", FieldType.Date);
    Field ApprovedTasks = fg_MRG_Model.addField("Approved Tasks", EnumFieldType.from(MRGModel_ApprovedTasks.instance()));
    Field BaselModel = fg_MRG_Model.addField("Basel Model", EnumFieldType.from(MRGModel_BaselModel.instance()));
    Field CandidateAssessmentDate = fg_MRG_Model.addField("Candidate Assessment Date", FieldType.Date);
    Field CandidateComment = fg_MRG_Model.addField("Candidate Comment", FieldType.String);
    Field CandidateStatus = fg_MRG_Model.addField("Candidate Status", EnumFieldType.from(MRGModel_CandidateStatus.instance()));
    Field ComplianceStatus = fg_MRG_Model.addField("Compliance Status", EnumFieldType.from(MRGModel_ComplianceStatus.instance()));
    Field DataEngineer = fg_MRG_Model.addField("Data Engineer", FieldType.User);
    Field DataInputs = fg_MRG_Model.addField("Data Inputs", FieldType.String);
    Field DataQuality = fg_MRG_Model.addField("Data Quality", FieldType.Decimal);
    Field DefinitionClosureDate = fg_MRG_Model.addField("Definition Closure Date", FieldType.Date);
    Field DefinitionExpectedDate = fg_MRG_Model.addField("Definition Expected Date", FieldType.Date);
    Field DefinitionOriginalDate = fg_MRG_Model.addField("Definition Original Date", FieldType.Date);
    Field DefinitionPresentDueDate = fg_MRG_Model.addField("Definition Present Due Date", FieldType.Date);
    Field Developer = fg_MRG_Model.addField("Developer", FieldType.User);
    Field DevelopmentClosureDate = fg_MRG_Model.addField("Development Closure Date", FieldType.Date);
    Field DevelopmentExpectedDate = fg_MRG_Model.addField("Development Expected Date", FieldType.Date);
    Field DevelopmentOriginalDate = fg_MRG_Model.addField("Development Original Date", FieldType.Date);
    Field DevelopmentPresentDueDate = fg_MRG_Model.addField("Development Present Due Date", FieldType.Date);
    Field DevelopmentSystem = fg_MRG_Model.addField("Development System", FieldType.String);
    Field ExternalModel = fg_MRG_Model.addField("External Model", "Hosting Location", EnumFieldType.from(MRGModel_ExternalModel.instance()));
    Field HumanAlternative = fg_MRG_Model.addField("Human Alternative", FieldType.User);
    Field InitialImplementationDate = fg_MRG_Model.addField("Initial Implementation Date", FieldType.Date);
    Field License = fg_MRG_Model.addField("License", FieldType.String);
    Field MachineLearningModel = fg_MRG_Model.addField("Machine Learning Model", EnumFieldType.from(MRGModel_MachineLearningModel.instance()));
    Field MeasureType = fg_MRG_Model.addField("MeasureType", "Measurement Type", EnumFieldType.from(MRGModel_MeasurementType.instance()));
    Field ModelApprover = fg_MRG_Model.addField("Model Approver", FieldType.User);
    Field ModelCategory = fg_MRG_Model.addField("Model Category", FieldType.Enum);
    Field ModelClass = fg_MRG_Model.addField("Model Class", FieldType.Enum);
    Field ModelDelegate = fg_MRG_Model.addField("Model Delegate", FieldType.User);
    Field ModelDeployer = fg_MRG_Model.addField("Model Deployer", FieldType.User);
    Field ModelLimitations = fg_MRG_Model.addField("Model Limitations", FieldType.Enum);
    Field ModelManager = fg_MRG_Model.addField("Model Manager", FieldType.User);
    Field ModelMonitor = fg_MRG_Model.addField("Model Monitor", FieldType.Enum);
    Field ModelNonModel = fg_MRG_Model.addField("Model Non Model", "Model or Non-Model", FieldType.Enum);
    Field ModelOwner = fg_MRG_Model.addField("Model Owner", FieldType.User);
    Field ModelProvider = fg_MRG_Model.addField("Model Provider", FieldType.Enum);
    Field Status = fg_MRG_Model.addField("Status", FieldType.Enum);
    Field ModelTrainingQuality = fg_MRG_Model.addField("Model Training Fairness", "Model Training Accuracy", FieldType.Decimal);
    Field ModelTrainingFairness = fg_MRG_Model.addField("Model Training Fairness", FieldType.Decimal);
    Field ModelType = fg_MRG_Model.addField("Model Type", FieldType.Enum);
    Field ModelValidator = fg_MRG_Model.addField("Model Validator", FieldType.User);
    Field ModelVersion = fg_MRG_Model.addField("Model Version", FieldType.String);
    Field OpenScaleMonitor = fg_MRG_Model.addField("OpenScale Monitor", "Monitored with Watson OpenScale", FieldType.Enum);
    Field Online = fg_MRG_Model.addField("Online", FieldType.Enum);
    Field OtherProv = fg_MRG_Model.addField("OtherProv", "Other Provider", FieldType.String);
    Field ProposalClosureDate = fg_MRG_Model.addField("Proposal Closure Date", FieldType.Date);
    Field ProposalExpectedDate = fg_MRG_Model.addField("Proposal Expected Date", FieldType.Date);
    Field ProposalOriginalDate = fg_MRG_Model.addField("Proposal Original Date", FieldType.Date);
    Field ProposalPresentDueDate = fg_MRG_Model.addField("Proposal Present Due Date", FieldType.Date);
    Field Publisher = fg_MRG_Model.addField("Publisher", FieldType.String);
    Field Source = fg_MRG_Model.addField("Source", FieldType.String);
    Field SupportingTasks = fg_MRG_Model.addField("Supporting Tasks", FieldType.Enum);
    Field TaskType = fg_MRG_Model.addField("Task Type", FieldType.Enum);
    Field Version = fg_MRG_Model.addField("Version", FieldType.Integer);
    Field VersionComment = fg_MRG_Model.addField("Version Comment", FieldType.String);


}
