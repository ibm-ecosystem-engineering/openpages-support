package com.ibm.openpages.models.field_group;

import com.ibm.openpages.models.Field;
import com.ibm.openpages.models.FieldGroup;
import com.ibm.openpages.support.util.FieldType;

public interface IntegrationWKC {
    FieldGroup fg_IntegrationWKC = new FieldGroup("IntegrationWKC");

    Field AssetId = fg_IntegrationWKC.addField("Asset ID", FieldType.String);
    Field AssetName = fg_IntegrationWKC.addField("Asset Name", FieldType.String);
    Field BusinessTerms = fg_IntegrationWKC.addField("Business Terms", FieldType.Enum);
    Field CatalogId = fg_IntegrationWKC.addField("Catalog ID", FieldType.String);
    Field CatalogName = fg_IntegrationWKC.addField("Catalog Name", FieldType.String);
    Field ContainerId = fg_IntegrationWKC.addField("Container ID", FieldType.String);
    Field ContainerType = fg_IntegrationWKC.addField("Container Type", FieldType.String);
    Field HoldoutDataAssetName = fg_IntegrationWKC.addField("Holdout Data Asset Name", FieldType.String);
    Field Jurisdiction = fg_IntegrationWKC.addField("Jurisdiction", FieldType.Enum);
    Field LMID = fg_IntegrationWKC.addField("LMID", FieldType.String);
    Field PhysicalLocation = fg_IntegrationWKC.addField("Physical Location", FieldType.Enum);
    Field ProjectId = fg_IntegrationWKC.addField("Project ID", FieldType.String);
    Field ProjectName = fg_IntegrationWKC.addField("Project Name", FieldType.String);
    Field RowCount = fg_IntegrationWKC.addField("Row Count", FieldType.Integer);
    Field SpaceId = fg_IntegrationWKC.addField("Space ID", FieldType.String);
    Field SpaceName = fg_IntegrationWKC.addField("Space Name", FieldType.String);
    Field TenantId = fg_IntegrationWKC.addField("Tenant ID", FieldType.String);
    Field WkcClassification = fg_IntegrationWKC.addField("WKC Classification", FieldType.Enum);
    Field WkcCreationDate = fg_IntegrationWKC.addField("WKC Creation Date", FieldType.Date);
    Field WkcDescription = fg_IntegrationWKC.addField("WKC Description", FieldType.String);
    Field WkcName = fg_IntegrationWKC.addField("WKC Name", FieldType.String);
    Field WkcStatus = fg_IntegrationWKC.addField("WKC Status", FieldType.Enum);
    Field WkcTags = fg_IntegrationWKC.addField("WKC Tags", FieldType.Enum);
}
