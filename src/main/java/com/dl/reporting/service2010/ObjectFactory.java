
package com.dl.reporting.service2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dl.reporting.service2010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TrustedUserHeader_QNAME = new QName("http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", "TrustedUserHeader");
    private final static QName _ServerInfoHeader_QNAME = new QName("http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", "ServerInfoHeader");
    private final static QName _ItemNamespaceHeader_QNAME = new QName("http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", "ItemNamespaceHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dl.reporting.service2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCatalogItem }
     * 
     */
    public CreateCatalogItem createCreateCatalogItem() {
        return new CreateCatalogItem();
    }

    /**
     * Create an instance of {@link ArrayOfProperty }
     * 
     */
    public ArrayOfProperty createArrayOfProperty() {
        return new ArrayOfProperty();
    }

    /**
     * Create an instance of {@link CreateCatalogItemResponse }
     * 
     */
    public CreateCatalogItemResponse createCreateCatalogItemResponse() {
        return new CreateCatalogItemResponse();
    }

    /**
     * Create an instance of {@link CatalogItem }
     * 
     */
    public CatalogItem createCatalogItem() {
        return new CatalogItem();
    }

    /**
     * Create an instance of {@link ArrayOfWarning }
     * 
     */
    public ArrayOfWarning createArrayOfWarning() {
        return new ArrayOfWarning();
    }

    /**
     * Create an instance of {@link TrustedUserHeader }
     * 
     */
    public TrustedUserHeader createTrustedUserHeader() {
        return new TrustedUserHeader();
    }

    /**
     * Create an instance of {@link ServerInfoHeader }
     * 
     */
    public ServerInfoHeader createServerInfoHeader() {
        return new ServerInfoHeader();
    }

    /**
     * Create an instance of {@link SetItemDefinition }
     * 
     */
    public SetItemDefinition createSetItemDefinition() {
        return new SetItemDefinition();
    }

    /**
     * Create an instance of {@link SetItemDefinitionResponse }
     * 
     */
    public SetItemDefinitionResponse createSetItemDefinitionResponse() {
        return new SetItemDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetItemDefinition }
     * 
     */
    public GetItemDefinition createGetItemDefinition() {
        return new GetItemDefinition();
    }

    /**
     * Create an instance of {@link GetItemDefinitionResponse }
     * 
     */
    public GetItemDefinitionResponse createGetItemDefinitionResponse() {
        return new GetItemDefinitionResponse();
    }

    /**
     * Create an instance of {@link GetItemType }
     * 
     */
    public GetItemType createGetItemType() {
        return new GetItemType();
    }

    /**
     * Create an instance of {@link GetItemTypeResponse }
     * 
     */
    public GetItemTypeResponse createGetItemTypeResponse() {
        return new GetItemTypeResponse();
    }

    /**
     * Create an instance of {@link DeleteItem }
     * 
     */
    public DeleteItem createDeleteItem() {
        return new DeleteItem();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link MoveItem }
     * 
     */
    public MoveItem createMoveItem() {
        return new MoveItem();
    }

    /**
     * Create an instance of {@link MoveItemResponse }
     * 
     */
    public MoveItemResponse createMoveItemResponse() {
        return new MoveItemResponse();
    }

    /**
     * Create an instance of {@link InheritParentSecurity }
     * 
     */
    public InheritParentSecurity createInheritParentSecurity() {
        return new InheritParentSecurity();
    }

    /**
     * Create an instance of {@link InheritParentSecurityResponse }
     * 
     */
    public InheritParentSecurityResponse createInheritParentSecurityResponse() {
        return new InheritParentSecurityResponse();
    }

    /**
     * Create an instance of {@link ListItemHistory }
     * 
     */
    public ListItemHistory createListItemHistory() {
        return new ListItemHistory();
    }

    /**
     * Create an instance of {@link ListItemHistoryResponse }
     * 
     */
    public ListItemHistoryResponse createListItemHistoryResponse() {
        return new ListItemHistoryResponse();
    }

    /**
     * Create an instance of {@link ArrayOfItemHistorySnapshot }
     * 
     */
    public ArrayOfItemHistorySnapshot createArrayOfItemHistorySnapshot() {
        return new ArrayOfItemHistorySnapshot();
    }

    /**
     * Create an instance of {@link ListChildren }
     * 
     */
    public ListChildren createListChildren() {
        return new ListChildren();
    }

    /**
     * Create an instance of {@link ListChildrenResponse }
     * 
     */
    public ListChildrenResponse createListChildrenResponse() {
        return new ListChildrenResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCatalogItem }
     * 
     */
    public ArrayOfCatalogItem createArrayOfCatalogItem() {
        return new ArrayOfCatalogItem();
    }

    /**
     * Create an instance of {@link ListDependentItems }
     * 
     */
    public ListDependentItems createListDependentItems() {
        return new ListDependentItems();
    }

    /**
     * Create an instance of {@link ListDependentItemsResponse }
     * 
     */
    public ListDependentItemsResponse createListDependentItemsResponse() {
        return new ListDependentItemsResponse();
    }

    /**
     * Create an instance of {@link FindItems }
     * 
     */
    public FindItems createFindItems() {
        return new FindItems();
    }

    /**
     * Create an instance of {@link ArrayOfSearchCondition }
     * 
     */
    public ArrayOfSearchCondition createArrayOfSearchCondition() {
        return new ArrayOfSearchCondition();
    }

    /**
     * Create an instance of {@link FindItemsResponse }
     * 
     */
    public FindItemsResponse createFindItemsResponse() {
        return new FindItemsResponse();
    }

    /**
     * Create an instance of {@link ListParents }
     * 
     */
    public ListParents createListParents() {
        return new ListParents();
    }

    /**
     * Create an instance of {@link ListParentsResponse }
     * 
     */
    public ListParentsResponse createListParentsResponse() {
        return new ListParentsResponse();
    }

    /**
     * Create an instance of {@link CreateFolder }
     * 
     */
    public CreateFolder createCreateFolder() {
        return new CreateFolder();
    }

    /**
     * Create an instance of {@link CreateFolderResponse }
     * 
     */
    public CreateFolderResponse createCreateFolderResponse() {
        return new CreateFolderResponse();
    }

    /**
     * Create an instance of {@link SetProperties }
     * 
     */
    public SetProperties createSetProperties() {
        return new SetProperties();
    }

    /**
     * Create an instance of {@link SetPropertiesResponse }
     * 
     */
    public SetPropertiesResponse createSetPropertiesResponse() {
        return new SetPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetProperties }
     * 
     */
    public GetProperties createGetProperties() {
        return new GetProperties();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link ItemNamespaceHeader }
     * 
     */
    public ItemNamespaceHeader createItemNamespaceHeader() {
        return new ItemNamespaceHeader();
    }

    /**
     * Create an instance of {@link SetItemReferences }
     * 
     */
    public SetItemReferences createSetItemReferences() {
        return new SetItemReferences();
    }

    /**
     * Create an instance of {@link ArrayOfItemReference }
     * 
     */
    public ArrayOfItemReference createArrayOfItemReference() {
        return new ArrayOfItemReference();
    }

    /**
     * Create an instance of {@link SetItemReferencesResponse }
     * 
     */
    public SetItemReferencesResponse createSetItemReferencesResponse() {
        return new SetItemReferencesResponse();
    }

    /**
     * Create an instance of {@link GetItemReferences }
     * 
     */
    public GetItemReferences createGetItemReferences() {
        return new GetItemReferences();
    }

    /**
     * Create an instance of {@link GetItemReferencesResponse }
     * 
     */
    public GetItemReferencesResponse createGetItemReferencesResponse() {
        return new GetItemReferencesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfItemReferenceData }
     * 
     */
    public ArrayOfItemReferenceData createArrayOfItemReferenceData() {
        return new ArrayOfItemReferenceData();
    }

    /**
     * Create an instance of {@link ListItemTypes }
     * 
     */
    public ListItemTypes createListItemTypes() {
        return new ListItemTypes();
    }

    /**
     * Create an instance of {@link ListItemTypesResponse }
     * 
     */
    public ListItemTypesResponse createListItemTypesResponse() {
        return new ListItemTypesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link SetSubscriptionProperties }
     * 
     */
    public SetSubscriptionProperties createSetSubscriptionProperties() {
        return new SetSubscriptionProperties();
    }

    /**
     * Create an instance of {@link ExtensionSettings }
     * 
     */
    public ExtensionSettings createExtensionSettings() {
        return new ExtensionSettings();
    }

    /**
     * Create an instance of {@link ArrayOfParameterValue }
     * 
     */
    public ArrayOfParameterValue createArrayOfParameterValue() {
        return new ArrayOfParameterValue();
    }

    /**
     * Create an instance of {@link SetSubscriptionPropertiesResponse }
     * 
     */
    public SetSubscriptionPropertiesResponse createSetSubscriptionPropertiesResponse() {
        return new SetSubscriptionPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetSubscriptionProperties }
     * 
     */
    public GetSubscriptionProperties createGetSubscriptionProperties() {
        return new GetSubscriptionProperties();
    }

    /**
     * Create an instance of {@link GetSubscriptionPropertiesResponse }
     * 
     */
    public GetSubscriptionPropertiesResponse createGetSubscriptionPropertiesResponse() {
        return new GetSubscriptionPropertiesResponse();
    }

    /**
     * Create an instance of {@link ActiveState }
     * 
     */
    public ActiveState createActiveState() {
        return new ActiveState();
    }

    /**
     * Create an instance of {@link SetDataDrivenSubscriptionProperties }
     * 
     */
    public SetDataDrivenSubscriptionProperties createSetDataDrivenSubscriptionProperties() {
        return new SetDataDrivenSubscriptionProperties();
    }

    /**
     * Create an instance of {@link DataRetrievalPlan }
     * 
     */
    public DataRetrievalPlan createDataRetrievalPlan() {
        return new DataRetrievalPlan();
    }

    /**
     * Create an instance of {@link ArrayOfParameterValueOrFieldReference }
     * 
     */
    public ArrayOfParameterValueOrFieldReference createArrayOfParameterValueOrFieldReference() {
        return new ArrayOfParameterValueOrFieldReference();
    }

    /**
     * Create an instance of {@link SetDataDrivenSubscriptionPropertiesResponse }
     * 
     */
    public SetDataDrivenSubscriptionPropertiesResponse createSetDataDrivenSubscriptionPropertiesResponse() {
        return new SetDataDrivenSubscriptionPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetDataDrivenSubscriptionProperties }
     * 
     */
    public GetDataDrivenSubscriptionProperties createGetDataDrivenSubscriptionProperties() {
        return new GetDataDrivenSubscriptionProperties();
    }

    /**
     * Create an instance of {@link GetDataDrivenSubscriptionPropertiesResponse }
     * 
     */
    public GetDataDrivenSubscriptionPropertiesResponse createGetDataDrivenSubscriptionPropertiesResponse() {
        return new GetDataDrivenSubscriptionPropertiesResponse();
    }

    /**
     * Create an instance of {@link DisableSubscription }
     * 
     */
    public DisableSubscription createDisableSubscription() {
        return new DisableSubscription();
    }

    /**
     * Create an instance of {@link DisableSubscriptionResponse }
     * 
     */
    public DisableSubscriptionResponse createDisableSubscriptionResponse() {
        return new DisableSubscriptionResponse();
    }

    /**
     * Create an instance of {@link EnableSubscription }
     * 
     */
    public EnableSubscription createEnableSubscription() {
        return new EnableSubscription();
    }

    /**
     * Create an instance of {@link EnableSubscriptionResponse }
     * 
     */
    public EnableSubscriptionResponse createEnableSubscriptionResponse() {
        return new EnableSubscriptionResponse();
    }

    /**
     * Create an instance of {@link DeleteSubscription }
     * 
     */
    public DeleteSubscription createDeleteSubscription() {
        return new DeleteSubscription();
    }

    /**
     * Create an instance of {@link DeleteSubscriptionResponse }
     * 
     */
    public DeleteSubscriptionResponse createDeleteSubscriptionResponse() {
        return new DeleteSubscriptionResponse();
    }

    /**
     * Create an instance of {@link CreateSubscription }
     * 
     */
    public CreateSubscription createCreateSubscription() {
        return new CreateSubscription();
    }

    /**
     * Create an instance of {@link CreateSubscriptionResponse }
     * 
     */
    public CreateSubscriptionResponse createCreateSubscriptionResponse() {
        return new CreateSubscriptionResponse();
    }

    /**
     * Create an instance of {@link CreateDataDrivenSubscription }
     * 
     */
    public CreateDataDrivenSubscription createCreateDataDrivenSubscription() {
        return new CreateDataDrivenSubscription();
    }

    /**
     * Create an instance of {@link CreateDataDrivenSubscriptionResponse }
     * 
     */
    public CreateDataDrivenSubscriptionResponse createCreateDataDrivenSubscriptionResponse() {
        return new CreateDataDrivenSubscriptionResponse();
    }

    /**
     * Create an instance of {@link GetExtensionSettings }
     * 
     */
    public GetExtensionSettings createGetExtensionSettings() {
        return new GetExtensionSettings();
    }

    /**
     * Create an instance of {@link GetExtensionSettingsResponse }
     * 
     */
    public GetExtensionSettingsResponse createGetExtensionSettingsResponse() {
        return new GetExtensionSettingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExtensionParameter }
     * 
     */
    public ArrayOfExtensionParameter createArrayOfExtensionParameter() {
        return new ArrayOfExtensionParameter();
    }

    /**
     * Create an instance of {@link ValidateExtensionSettings }
     * 
     */
    public ValidateExtensionSettings createValidateExtensionSettings() {
        return new ValidateExtensionSettings();
    }

    /**
     * Create an instance of {@link ValidateExtensionSettingsResponse }
     * 
     */
    public ValidateExtensionSettingsResponse createValidateExtensionSettingsResponse() {
        return new ValidateExtensionSettingsResponse();
    }

    /**
     * Create an instance of {@link ListSubscriptions }
     * 
     */
    public ListSubscriptions createListSubscriptions() {
        return new ListSubscriptions();
    }

    /**
     * Create an instance of {@link ListSubscriptionsResponse }
     * 
     */
    public ListSubscriptionsResponse createListSubscriptionsResponse() {
        return new ListSubscriptionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubscription }
     * 
     */
    public ArrayOfSubscription createArrayOfSubscription() {
        return new ArrayOfSubscription();
    }

    /**
     * Create an instance of {@link ListMySubscriptions }
     * 
     */
    public ListMySubscriptions createListMySubscriptions() {
        return new ListMySubscriptions();
    }

    /**
     * Create an instance of {@link ListMySubscriptionsResponse }
     * 
     */
    public ListMySubscriptionsResponse createListMySubscriptionsResponse() {
        return new ListMySubscriptionsResponse();
    }

    /**
     * Create an instance of {@link ListSubscriptionsUsingDataSource }
     * 
     */
    public ListSubscriptionsUsingDataSource createListSubscriptionsUsingDataSource() {
        return new ListSubscriptionsUsingDataSource();
    }

    /**
     * Create an instance of {@link ListSubscriptionsUsingDataSourceResponse }
     * 
     */
    public ListSubscriptionsUsingDataSourceResponse createListSubscriptionsUsingDataSourceResponse() {
        return new ListSubscriptionsUsingDataSourceResponse();
    }

    /**
     * Create an instance of {@link ChangeSubscriptionOwner }
     * 
     */
    public ChangeSubscriptionOwner createChangeSubscriptionOwner() {
        return new ChangeSubscriptionOwner();
    }

    /**
     * Create an instance of {@link ChangeSubscriptionOwnerResponse }
     * 
     */
    public ChangeSubscriptionOwnerResponse createChangeSubscriptionOwnerResponse() {
        return new ChangeSubscriptionOwnerResponse();
    }

    /**
     * Create an instance of {@link CreateDataSource }
     * 
     */
    public CreateDataSource createCreateDataSource() {
        return new CreateDataSource();
    }

    /**
     * Create an instance of {@link DataSourceDefinition }
     * 
     */
    public DataSourceDefinition createDataSourceDefinition() {
        return new DataSourceDefinition();
    }

    /**
     * Create an instance of {@link CreateDataSourceResponse }
     * 
     */
    public CreateDataSourceResponse createCreateDataSourceResponse() {
        return new CreateDataSourceResponse();
    }

    /**
     * Create an instance of {@link PrepareQuery }
     * 
     */
    public PrepareQuery createPrepareQuery() {
        return new PrepareQuery();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link DataSetDefinition }
     * 
     */
    public DataSetDefinition createDataSetDefinition() {
        return new DataSetDefinition();
    }

    /**
     * Create an instance of {@link PrepareQueryResponse }
     * 
     */
    public PrepareQueryResponse createPrepareQueryResponse() {
        return new PrepareQueryResponse();
    }

    /**
     * Create an instance of {@link EnableDataSource }
     * 
     */
    public EnableDataSource createEnableDataSource() {
        return new EnableDataSource();
    }

    /**
     * Create an instance of {@link EnableDataSourceResponse }
     * 
     */
    public EnableDataSourceResponse createEnableDataSourceResponse() {
        return new EnableDataSourceResponse();
    }

    /**
     * Create an instance of {@link DisableDataSource }
     * 
     */
    public DisableDataSource createDisableDataSource() {
        return new DisableDataSource();
    }

    /**
     * Create an instance of {@link DisableDataSourceResponse }
     * 
     */
    public DisableDataSourceResponse createDisableDataSourceResponse() {
        return new DisableDataSourceResponse();
    }

    /**
     * Create an instance of {@link SetDataSourceContents }
     * 
     */
    public SetDataSourceContents createSetDataSourceContents() {
        return new SetDataSourceContents();
    }

    /**
     * Create an instance of {@link SetDataSourceContentsResponse }
     * 
     */
    public SetDataSourceContentsResponse createSetDataSourceContentsResponse() {
        return new SetDataSourceContentsResponse();
    }

    /**
     * Create an instance of {@link GetDataSourceContents }
     * 
     */
    public GetDataSourceContents createGetDataSourceContents() {
        return new GetDataSourceContents();
    }

    /**
     * Create an instance of {@link GetDataSourceContentsResponse }
     * 
     */
    public GetDataSourceContentsResponse createGetDataSourceContentsResponse() {
        return new GetDataSourceContentsResponse();
    }

    /**
     * Create an instance of {@link ListDatabaseCredentialRetrievalOptions }
     * 
     */
    public ListDatabaseCredentialRetrievalOptions createListDatabaseCredentialRetrievalOptions() {
        return new ListDatabaseCredentialRetrievalOptions();
    }

    /**
     * Create an instance of {@link ListDatabaseCredentialRetrievalOptionsResponse }
     * 
     */
    public ListDatabaseCredentialRetrievalOptionsResponse createListDatabaseCredentialRetrievalOptionsResponse() {
        return new ListDatabaseCredentialRetrievalOptionsResponse();
    }

    /**
     * Create an instance of {@link SetItemDataSources }
     * 
     */
    public SetItemDataSources createSetItemDataSources() {
        return new SetItemDataSources();
    }

    /**
     * Create an instance of {@link ArrayOfDataSource }
     * 
     */
    public ArrayOfDataSource createArrayOfDataSource() {
        return new ArrayOfDataSource();
    }

    /**
     * Create an instance of {@link SetItemDataSourcesResponse }
     * 
     */
    public SetItemDataSourcesResponse createSetItemDataSourcesResponse() {
        return new SetItemDataSourcesResponse();
    }

    /**
     * Create an instance of {@link GetItemDataSources }
     * 
     */
    public GetItemDataSources createGetItemDataSources() {
        return new GetItemDataSources();
    }

    /**
     * Create an instance of {@link GetItemDataSourcesResponse }
     * 
     */
    public GetItemDataSourcesResponse createGetItemDataSourcesResponse() {
        return new GetItemDataSourcesResponse();
    }

    /**
     * Create an instance of {@link TestConnectForDataSourceDefinition }
     * 
     */
    public TestConnectForDataSourceDefinition createTestConnectForDataSourceDefinition() {
        return new TestConnectForDataSourceDefinition();
    }

    /**
     * Create an instance of {@link TestConnectForDataSourceDefinitionResponse }
     * 
     */
    public TestConnectForDataSourceDefinitionResponse createTestConnectForDataSourceDefinitionResponse() {
        return new TestConnectForDataSourceDefinitionResponse();
    }

    /**
     * Create an instance of {@link TestConnectForItemDataSource }
     * 
     */
    public TestConnectForItemDataSource createTestConnectForItemDataSource() {
        return new TestConnectForItemDataSource();
    }

    /**
     * Create an instance of {@link TestConnectForItemDataSourceResponse }
     * 
     */
    public TestConnectForItemDataSourceResponse createTestConnectForItemDataSourceResponse() {
        return new TestConnectForItemDataSourceResponse();
    }

    /**
     * Create an instance of {@link CreateRole }
     * 
     */
    public CreateRole createCreateRole() {
        return new CreateRole();
    }

    /**
     * Create an instance of {@link CreateRoleResponse }
     * 
     */
    public CreateRoleResponse createCreateRoleResponse() {
        return new CreateRoleResponse();
    }

    /**
     * Create an instance of {@link SetRoleProperties }
     * 
     */
    public SetRoleProperties createSetRoleProperties() {
        return new SetRoleProperties();
    }

    /**
     * Create an instance of {@link SetRolePropertiesResponse }
     * 
     */
    public SetRolePropertiesResponse createSetRolePropertiesResponse() {
        return new SetRolePropertiesResponse();
    }

    /**
     * Create an instance of {@link GetRoleProperties }
     * 
     */
    public GetRoleProperties createGetRoleProperties() {
        return new GetRoleProperties();
    }

    /**
     * Create an instance of {@link GetRolePropertiesResponse }
     * 
     */
    public GetRolePropertiesResponse createGetRolePropertiesResponse() {
        return new GetRolePropertiesResponse();
    }

    /**
     * Create an instance of {@link DeleteRole }
     * 
     */
    public DeleteRole createDeleteRole() {
        return new DeleteRole();
    }

    /**
     * Create an instance of {@link DeleteRoleResponse }
     * 
     */
    public DeleteRoleResponse createDeleteRoleResponse() {
        return new DeleteRoleResponse();
    }

    /**
     * Create an instance of {@link ListRoles }
     * 
     */
    public ListRoles createListRoles() {
        return new ListRoles();
    }

    /**
     * Create an instance of {@link ListRolesResponse }
     * 
     */
    public ListRolesResponse createListRolesResponse() {
        return new ListRolesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRole }
     * 
     */
    public ArrayOfRole createArrayOfRole() {
        return new ArrayOfRole();
    }

    /**
     * Create an instance of {@link ListTasks }
     * 
     */
    public ListTasks createListTasks() {
        return new ListTasks();
    }

    /**
     * Create an instance of {@link ListTasksResponse }
     * 
     */
    public ListTasksResponse createListTasksResponse() {
        return new ListTasksResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTask }
     * 
     */
    public ArrayOfTask createArrayOfTask() {
        return new ArrayOfTask();
    }

    /**
     * Create an instance of {@link SetPolicies }
     * 
     */
    public SetPolicies createSetPolicies() {
        return new SetPolicies();
    }

    /**
     * Create an instance of {@link ArrayOfPolicy }
     * 
     */
    public ArrayOfPolicy createArrayOfPolicy() {
        return new ArrayOfPolicy();
    }

    /**
     * Create an instance of {@link SetPoliciesResponse }
     * 
     */
    public SetPoliciesResponse createSetPoliciesResponse() {
        return new SetPoliciesResponse();
    }

    /**
     * Create an instance of {@link GetPolicies }
     * 
     */
    public GetPolicies createGetPolicies() {
        return new GetPolicies();
    }

    /**
     * Create an instance of {@link GetPoliciesResponse }
     * 
     */
    public GetPoliciesResponse createGetPoliciesResponse() {
        return new GetPoliciesResponse();
    }

    /**
     * Create an instance of {@link GetItemDataSourcePrompts }
     * 
     */
    public GetItemDataSourcePrompts createGetItemDataSourcePrompts() {
        return new GetItemDataSourcePrompts();
    }

    /**
     * Create an instance of {@link GetItemDataSourcePromptsResponse }
     * 
     */
    public GetItemDataSourcePromptsResponse createGetItemDataSourcePromptsResponse() {
        return new GetItemDataSourcePromptsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDataSourcePrompt }
     * 
     */
    public ArrayOfDataSourcePrompt createArrayOfDataSourcePrompt() {
        return new ArrayOfDataSourcePrompt();
    }

    /**
     * Create an instance of {@link GenerateModel }
     * 
     */
    public GenerateModel createGenerateModel() {
        return new GenerateModel();
    }

    /**
     * Create an instance of {@link GenerateModelResponse }
     * 
     */
    public GenerateModelResponse createGenerateModelResponse() {
        return new GenerateModelResponse();
    }

    /**
     * Create an instance of {@link GetModelItemPermissions }
     * 
     */
    public GetModelItemPermissions createGetModelItemPermissions() {
        return new GetModelItemPermissions();
    }

    /**
     * Create an instance of {@link GetModelItemPermissionsResponse }
     * 
     */
    public GetModelItemPermissionsResponse createGetModelItemPermissionsResponse() {
        return new GetModelItemPermissionsResponse();
    }

    /**
     * Create an instance of {@link SetModelItemPolicies }
     * 
     */
    public SetModelItemPolicies createSetModelItemPolicies() {
        return new SetModelItemPolicies();
    }

    /**
     * Create an instance of {@link SetModelItemPoliciesResponse }
     * 
     */
    public SetModelItemPoliciesResponse createSetModelItemPoliciesResponse() {
        return new SetModelItemPoliciesResponse();
    }

    /**
     * Create an instance of {@link GetModelItemPolicies }
     * 
     */
    public GetModelItemPolicies createGetModelItemPolicies() {
        return new GetModelItemPolicies();
    }

    /**
     * Create an instance of {@link GetModelItemPoliciesResponse }
     * 
     */
    public GetModelItemPoliciesResponse createGetModelItemPoliciesResponse() {
        return new GetModelItemPoliciesResponse();
    }

    /**
     * Create an instance of {@link GetUserModel }
     * 
     */
    public GetUserModel createGetUserModel() {
        return new GetUserModel();
    }

    /**
     * Create an instance of {@link GetUserModelResponse }
     * 
     */
    public GetUserModelResponse createGetUserModelResponse() {
        return new GetUserModelResponse();
    }

    /**
     * Create an instance of {@link InheritModelItemParentSecurity }
     * 
     */
    public InheritModelItemParentSecurity createInheritModelItemParentSecurity() {
        return new InheritModelItemParentSecurity();
    }

    /**
     * Create an instance of {@link InheritModelItemParentSecurityResponse }
     * 
     */
    public InheritModelItemParentSecurityResponse createInheritModelItemParentSecurityResponse() {
        return new InheritModelItemParentSecurityResponse();
    }

    /**
     * Create an instance of {@link SetModelDrillthroughReports }
     * 
     */
    public SetModelDrillthroughReports createSetModelDrillthroughReports() {
        return new SetModelDrillthroughReports();
    }

    /**
     * Create an instance of {@link ArrayOfModelDrillthroughReport }
     * 
     */
    public ArrayOfModelDrillthroughReport createArrayOfModelDrillthroughReport() {
        return new ArrayOfModelDrillthroughReport();
    }

    /**
     * Create an instance of {@link SetModelDrillthroughReportsResponse }
     * 
     */
    public SetModelDrillthroughReportsResponse createSetModelDrillthroughReportsResponse() {
        return new SetModelDrillthroughReportsResponse();
    }

    /**
     * Create an instance of {@link ListModelDrillthroughReports }
     * 
     */
    public ListModelDrillthroughReports createListModelDrillthroughReports() {
        return new ListModelDrillthroughReports();
    }

    /**
     * Create an instance of {@link ListModelDrillthroughReportsResponse }
     * 
     */
    public ListModelDrillthroughReportsResponse createListModelDrillthroughReportsResponse() {
        return new ListModelDrillthroughReportsResponse();
    }

    /**
     * Create an instance of {@link ListModelItemChildren }
     * 
     */
    public ListModelItemChildren createListModelItemChildren() {
        return new ListModelItemChildren();
    }

    /**
     * Create an instance of {@link ListModelItemChildrenResponse }
     * 
     */
    public ListModelItemChildrenResponse createListModelItemChildrenResponse() {
        return new ListModelItemChildrenResponse();
    }

    /**
     * Create an instance of {@link ArrayOfModelItem }
     * 
     */
    public ArrayOfModelItem createArrayOfModelItem() {
        return new ArrayOfModelItem();
    }

    /**
     * Create an instance of {@link ListModelItemTypes }
     * 
     */
    public ListModelItemTypes createListModelItemTypes() {
        return new ListModelItemTypes();
    }

    /**
     * Create an instance of {@link ListModelItemTypesResponse }
     * 
     */
    public ListModelItemTypesResponse createListModelItemTypesResponse() {
        return new ListModelItemTypesResponse();
    }

    /**
     * Create an instance of {@link ListModelPerspectives }
     * 
     */
    public ListModelPerspectives createListModelPerspectives() {
        return new ListModelPerspectives();
    }

    /**
     * Create an instance of {@link ListModelPerspectivesResponse }
     * 
     */
    public ListModelPerspectivesResponse createListModelPerspectivesResponse() {
        return new ListModelPerspectivesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfModelCatalogItem }
     * 
     */
    public ArrayOfModelCatalogItem createArrayOfModelCatalogItem() {
        return new ArrayOfModelCatalogItem();
    }

    /**
     * Create an instance of {@link RegenerateModel }
     * 
     */
    public RegenerateModel createRegenerateModel() {
        return new RegenerateModel();
    }

    /**
     * Create an instance of {@link RegenerateModelResponse }
     * 
     */
    public RegenerateModelResponse createRegenerateModelResponse() {
        return new RegenerateModelResponse();
    }

    /**
     * Create an instance of {@link RemoveAllModelItemPolicies }
     * 
     */
    public RemoveAllModelItemPolicies createRemoveAllModelItemPolicies() {
        return new RemoveAllModelItemPolicies();
    }

    /**
     * Create an instance of {@link RemoveAllModelItemPoliciesResponse }
     * 
     */
    public RemoveAllModelItemPoliciesResponse createRemoveAllModelItemPoliciesResponse() {
        return new RemoveAllModelItemPoliciesResponse();
    }

    /**
     * Create an instance of {@link CreateSchedule }
     * 
     */
    public CreateSchedule createCreateSchedule() {
        return new CreateSchedule();
    }

    /**
     * Create an instance of {@link ScheduleDefinition }
     * 
     */
    public ScheduleDefinition createScheduleDefinition() {
        return new ScheduleDefinition();
    }

    /**
     * Create an instance of {@link CreateScheduleResponse }
     * 
     */
    public CreateScheduleResponse createCreateScheduleResponse() {
        return new CreateScheduleResponse();
    }

    /**
     * Create an instance of {@link DeleteSchedule }
     * 
     */
    public DeleteSchedule createDeleteSchedule() {
        return new DeleteSchedule();
    }

    /**
     * Create an instance of {@link DeleteScheduleResponse }
     * 
     */
    public DeleteScheduleResponse createDeleteScheduleResponse() {
        return new DeleteScheduleResponse();
    }

    /**
     * Create an instance of {@link ListSchedules }
     * 
     */
    public ListSchedules createListSchedules() {
        return new ListSchedules();
    }

    /**
     * Create an instance of {@link ListSchedulesResponse }
     * 
     */
    public ListSchedulesResponse createListSchedulesResponse() {
        return new ListSchedulesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSchedule }
     * 
     */
    public ArrayOfSchedule createArrayOfSchedule() {
        return new ArrayOfSchedule();
    }

    /**
     * Create an instance of {@link GetScheduleProperties }
     * 
     */
    public GetScheduleProperties createGetScheduleProperties() {
        return new GetScheduleProperties();
    }

    /**
     * Create an instance of {@link GetSchedulePropertiesResponse }
     * 
     */
    public GetSchedulePropertiesResponse createGetSchedulePropertiesResponse() {
        return new GetSchedulePropertiesResponse();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ListScheduleStates }
     * 
     */
    public ListScheduleStates createListScheduleStates() {
        return new ListScheduleStates();
    }

    /**
     * Create an instance of {@link ListScheduleStatesResponse }
     * 
     */
    public ListScheduleStatesResponse createListScheduleStatesResponse() {
        return new ListScheduleStatesResponse();
    }

    /**
     * Create an instance of {@link PauseSchedule }
     * 
     */
    public PauseSchedule createPauseSchedule() {
        return new PauseSchedule();
    }

    /**
     * Create an instance of {@link PauseScheduleResponse }
     * 
     */
    public PauseScheduleResponse createPauseScheduleResponse() {
        return new PauseScheduleResponse();
    }

    /**
     * Create an instance of {@link ResumeSchedule }
     * 
     */
    public ResumeSchedule createResumeSchedule() {
        return new ResumeSchedule();
    }

    /**
     * Create an instance of {@link ResumeScheduleResponse }
     * 
     */
    public ResumeScheduleResponse createResumeScheduleResponse() {
        return new ResumeScheduleResponse();
    }

    /**
     * Create an instance of {@link SetScheduleProperties }
     * 
     */
    public SetScheduleProperties createSetScheduleProperties() {
        return new SetScheduleProperties();
    }

    /**
     * Create an instance of {@link SetSchedulePropertiesResponse }
     * 
     */
    public SetSchedulePropertiesResponse createSetSchedulePropertiesResponse() {
        return new SetSchedulePropertiesResponse();
    }

    /**
     * Create an instance of {@link ListScheduledItems }
     * 
     */
    public ListScheduledItems createListScheduledItems() {
        return new ListScheduledItems();
    }

    /**
     * Create an instance of {@link ListScheduledItemsResponse }
     * 
     */
    public ListScheduledItemsResponse createListScheduledItemsResponse() {
        return new ListScheduledItemsResponse();
    }

    /**
     * Create an instance of {@link SetItemParameters }
     * 
     */
    public SetItemParameters createSetItemParameters() {
        return new SetItemParameters();
    }

    /**
     * Create an instance of {@link ArrayOfItemParameter }
     * 
     */
    public ArrayOfItemParameter createArrayOfItemParameter() {
        return new ArrayOfItemParameter();
    }

    /**
     * Create an instance of {@link SetItemParametersResponse }
     * 
     */
    public SetItemParametersResponse createSetItemParametersResponse() {
        return new SetItemParametersResponse();
    }

    /**
     * Create an instance of {@link GetItemParameters }
     * 
     */
    public GetItemParameters createGetItemParameters() {
        return new GetItemParameters();
    }

    /**
     * Create an instance of {@link ArrayOfDataSourceCredentials }
     * 
     */
    public ArrayOfDataSourceCredentials createArrayOfDataSourceCredentials() {
        return new ArrayOfDataSourceCredentials();
    }

    /**
     * Create an instance of {@link GetItemParametersResponse }
     * 
     */
    public GetItemParametersResponse createGetItemParametersResponse() {
        return new GetItemParametersResponse();
    }

    /**
     * Create an instance of {@link ListParameterTypes }
     * 
     */
    public ListParameterTypes createListParameterTypes() {
        return new ListParameterTypes();
    }

    /**
     * Create an instance of {@link ListParameterTypesResponse }
     * 
     */
    public ListParameterTypesResponse createListParameterTypesResponse() {
        return new ListParameterTypesResponse();
    }

    /**
     * Create an instance of {@link ListParameterStates }
     * 
     */
    public ListParameterStates createListParameterStates() {
        return new ListParameterStates();
    }

    /**
     * Create an instance of {@link ListParameterStatesResponse }
     * 
     */
    public ListParameterStatesResponse createListParameterStatesResponse() {
        return new ListParameterStatesResponse();
    }

    /**
     * Create an instance of {@link CreateReportEditSession }
     * 
     */
    public CreateReportEditSession createCreateReportEditSession() {
        return new CreateReportEditSession();
    }

    /**
     * Create an instance of {@link CreateReportEditSessionResponse }
     * 
     */
    public CreateReportEditSessionResponse createCreateReportEditSessionResponse() {
        return new CreateReportEditSessionResponse();
    }

    /**
     * Create an instance of {@link CreateLinkedItem }
     * 
     */
    public CreateLinkedItem createCreateLinkedItem() {
        return new CreateLinkedItem();
    }

    /**
     * Create an instance of {@link CreateLinkedItemResponse }
     * 
     */
    public CreateLinkedItemResponse createCreateLinkedItemResponse() {
        return new CreateLinkedItemResponse();
    }

    /**
     * Create an instance of {@link SetItemLink }
     * 
     */
    public SetItemLink createSetItemLink() {
        return new SetItemLink();
    }

    /**
     * Create an instance of {@link SetItemLinkResponse }
     * 
     */
    public SetItemLinkResponse createSetItemLinkResponse() {
        return new SetItemLinkResponse();
    }

    /**
     * Create an instance of {@link GetItemLink }
     * 
     */
    public GetItemLink createGetItemLink() {
        return new GetItemLink();
    }

    /**
     * Create an instance of {@link GetItemLinkResponse }
     * 
     */
    public GetItemLinkResponse createGetItemLinkResponse() {
        return new GetItemLinkResponse();
    }

    /**
     * Create an instance of {@link ListExecutionSettings }
     * 
     */
    public ListExecutionSettings createListExecutionSettings() {
        return new ListExecutionSettings();
    }

    /**
     * Create an instance of {@link ListExecutionSettingsResponse }
     * 
     */
    public ListExecutionSettingsResponse createListExecutionSettingsResponse() {
        return new ListExecutionSettingsResponse();
    }

    /**
     * Create an instance of {@link SetExecutionOptions }
     * 
     */
    public SetExecutionOptions createSetExecutionOptions() {
        return new SetExecutionOptions();
    }

    /**
     * Create an instance of {@link ScheduleReference }
     * 
     */
    public ScheduleReference createScheduleReference() {
        return new ScheduleReference();
    }

    /**
     * Create an instance of {@link NoSchedule }
     * 
     */
    public NoSchedule createNoSchedule() {
        return new NoSchedule();
    }

    /**
     * Create an instance of {@link SetExecutionOptionsResponse }
     * 
     */
    public SetExecutionOptionsResponse createSetExecutionOptionsResponse() {
        return new SetExecutionOptionsResponse();
    }

    /**
     * Create an instance of {@link GetExecutionOptions }
     * 
     */
    public GetExecutionOptions createGetExecutionOptions() {
        return new GetExecutionOptions();
    }

    /**
     * Create an instance of {@link GetExecutionOptionsResponse }
     * 
     */
    public GetExecutionOptionsResponse createGetExecutionOptionsResponse() {
        return new GetExecutionOptionsResponse();
    }

    /**
     * Create an instance of {@link UpdateItemExecutionSnapshot }
     * 
     */
    public UpdateItemExecutionSnapshot createUpdateItemExecutionSnapshot() {
        return new UpdateItemExecutionSnapshot();
    }

    /**
     * Create an instance of {@link UpdateItemExecutionSnapshotResponse }
     * 
     */
    public UpdateItemExecutionSnapshotResponse createUpdateItemExecutionSnapshotResponse() {
        return new UpdateItemExecutionSnapshotResponse();
    }

    /**
     * Create an instance of {@link SetCacheOptions }
     * 
     */
    public SetCacheOptions createSetCacheOptions() {
        return new SetCacheOptions();
    }

    /**
     * Create an instance of {@link TimeExpiration }
     * 
     */
    public TimeExpiration createTimeExpiration() {
        return new TimeExpiration();
    }

    /**
     * Create an instance of {@link ScheduleExpiration }
     * 
     */
    public ScheduleExpiration createScheduleExpiration() {
        return new ScheduleExpiration();
    }

    /**
     * Create an instance of {@link SetCacheOptionsResponse }
     * 
     */
    public SetCacheOptionsResponse createSetCacheOptionsResponse() {
        return new SetCacheOptionsResponse();
    }

    /**
     * Create an instance of {@link GetCacheOptions }
     * 
     */
    public GetCacheOptions createGetCacheOptions() {
        return new GetCacheOptions();
    }

    /**
     * Create an instance of {@link GetCacheOptionsResponse }
     * 
     */
    public GetCacheOptionsResponse createGetCacheOptionsResponse() {
        return new GetCacheOptionsResponse();
    }

    /**
     * Create an instance of {@link FlushCache }
     * 
     */
    public FlushCache createFlushCache() {
        return new FlushCache();
    }

    /**
     * Create an instance of {@link FlushCacheResponse }
     * 
     */
    public FlushCacheResponse createFlushCacheResponse() {
        return new FlushCacheResponse();
    }

    /**
     * Create an instance of {@link CreateItemHistorySnapshot }
     * 
     */
    public CreateItemHistorySnapshot createCreateItemHistorySnapshot() {
        return new CreateItemHistorySnapshot();
    }

    /**
     * Create an instance of {@link CreateItemHistorySnapshotResponse }
     * 
     */
    public CreateItemHistorySnapshotResponse createCreateItemHistorySnapshotResponse() {
        return new CreateItemHistorySnapshotResponse();
    }

    /**
     * Create an instance of {@link DeleteItemHistorySnapshot }
     * 
     */
    public DeleteItemHistorySnapshot createDeleteItemHistorySnapshot() {
        return new DeleteItemHistorySnapshot();
    }

    /**
     * Create an instance of {@link DeleteItemHistorySnapshotResponse }
     * 
     */
    public DeleteItemHistorySnapshotResponse createDeleteItemHistorySnapshotResponse() {
        return new DeleteItemHistorySnapshotResponse();
    }

    /**
     * Create an instance of {@link SetItemHistoryLimit }
     * 
     */
    public SetItemHistoryLimit createSetItemHistoryLimit() {
        return new SetItemHistoryLimit();
    }

    /**
     * Create an instance of {@link SetItemHistoryLimitResponse }
     * 
     */
    public SetItemHistoryLimitResponse createSetItemHistoryLimitResponse() {
        return new SetItemHistoryLimitResponse();
    }

    /**
     * Create an instance of {@link GetItemHistoryLimit }
     * 
     */
    public GetItemHistoryLimit createGetItemHistoryLimit() {
        return new GetItemHistoryLimit();
    }

    /**
     * Create an instance of {@link GetItemHistoryLimitResponse }
     * 
     */
    public GetItemHistoryLimitResponse createGetItemHistoryLimitResponse() {
        return new GetItemHistoryLimitResponse();
    }

    /**
     * Create an instance of {@link SetItemHistoryOptions }
     * 
     */
    public SetItemHistoryOptions createSetItemHistoryOptions() {
        return new SetItemHistoryOptions();
    }

    /**
     * Create an instance of {@link SetItemHistoryOptionsResponse }
     * 
     */
    public SetItemHistoryOptionsResponse createSetItemHistoryOptionsResponse() {
        return new SetItemHistoryOptionsResponse();
    }

    /**
     * Create an instance of {@link GetItemHistoryOptions }
     * 
     */
    public GetItemHistoryOptions createGetItemHistoryOptions() {
        return new GetItemHistoryOptions();
    }

    /**
     * Create an instance of {@link GetItemHistoryOptionsResponse }
     * 
     */
    public GetItemHistoryOptionsResponse createGetItemHistoryOptionsResponse() {
        return new GetItemHistoryOptionsResponse();
    }

    /**
     * Create an instance of {@link GetReportServerConfigInfo }
     * 
     */
    public GetReportServerConfigInfo createGetReportServerConfigInfo() {
        return new GetReportServerConfigInfo();
    }

    /**
     * Create an instance of {@link GetReportServerConfigInfoResponse }
     * 
     */
    public GetReportServerConfigInfoResponse createGetReportServerConfigInfoResponse() {
        return new GetReportServerConfigInfoResponse();
    }

    /**
     * Create an instance of {@link IsSSLRequired }
     * 
     */
    public IsSSLRequired createIsSSLRequired() {
        return new IsSSLRequired();
    }

    /**
     * Create an instance of {@link IsSSLRequiredResponse }
     * 
     */
    public IsSSLRequiredResponse createIsSSLRequiredResponse() {
        return new IsSSLRequiredResponse();
    }

    /**
     * Create an instance of {@link SetSystemProperties }
     * 
     */
    public SetSystemProperties createSetSystemProperties() {
        return new SetSystemProperties();
    }

    /**
     * Create an instance of {@link SetSystemPropertiesResponse }
     * 
     */
    public SetSystemPropertiesResponse createSetSystemPropertiesResponse() {
        return new SetSystemPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetSystemProperties }
     * 
     */
    public GetSystemProperties createGetSystemProperties() {
        return new GetSystemProperties();
    }

    /**
     * Create an instance of {@link GetSystemPropertiesResponse }
     * 
     */
    public GetSystemPropertiesResponse createGetSystemPropertiesResponse() {
        return new GetSystemPropertiesResponse();
    }

    /**
     * Create an instance of {@link SetUserSettings }
     * 
     */
    public SetUserSettings createSetUserSettings() {
        return new SetUserSettings();
    }

    /**
     * Create an instance of {@link SetUserSettingsResponse }
     * 
     */
    public SetUserSettingsResponse createSetUserSettingsResponse() {
        return new SetUserSettingsResponse();
    }

    /**
     * Create an instance of {@link GetUserSettings }
     * 
     */
    public GetUserSettings createGetUserSettings() {
        return new GetUserSettings();
    }

    /**
     * Create an instance of {@link GetUserSettingsResponse }
     * 
     */
    public GetUserSettingsResponse createGetUserSettingsResponse() {
        return new GetUserSettingsResponse();
    }

    /**
     * Create an instance of {@link SetSystemPolicies }
     * 
     */
    public SetSystemPolicies createSetSystemPolicies() {
        return new SetSystemPolicies();
    }

    /**
     * Create an instance of {@link SetSystemPoliciesResponse }
     * 
     */
    public SetSystemPoliciesResponse createSetSystemPoliciesResponse() {
        return new SetSystemPoliciesResponse();
    }

    /**
     * Create an instance of {@link GetSystemPolicies }
     * 
     */
    public GetSystemPolicies createGetSystemPolicies() {
        return new GetSystemPolicies();
    }

    /**
     * Create an instance of {@link GetSystemPoliciesResponse }
     * 
     */
    public GetSystemPoliciesResponse createGetSystemPoliciesResponse() {
        return new GetSystemPoliciesResponse();
    }

    /**
     * Create an instance of {@link ListExtensions }
     * 
     */
    public ListExtensions createListExtensions() {
        return new ListExtensions();
    }

    /**
     * Create an instance of {@link ListExtensionsResponse }
     * 
     */
    public ListExtensionsResponse createListExtensionsResponse() {
        return new ListExtensionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExtension }
     * 
     */
    public ArrayOfExtension createArrayOfExtension() {
        return new ArrayOfExtension();
    }

    /**
     * Create an instance of {@link ListExtensionTypes }
     * 
     */
    public ListExtensionTypes createListExtensionTypes() {
        return new ListExtensionTypes();
    }

    /**
     * Create an instance of {@link ListExtensionTypesResponse }
     * 
     */
    public ListExtensionTypesResponse createListExtensionTypesResponse() {
        return new ListExtensionTypesResponse();
    }

    /**
     * Create an instance of {@link ListEvents }
     * 
     */
    public ListEvents createListEvents() {
        return new ListEvents();
    }

    /**
     * Create an instance of {@link ListEventsResponse }
     * 
     */
    public ListEventsResponse createListEventsResponse() {
        return new ListEventsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEvent }
     * 
     */
    public ArrayOfEvent createArrayOfEvent() {
        return new ArrayOfEvent();
    }

    /**
     * Create an instance of {@link FireEvent }
     * 
     */
    public FireEvent createFireEvent() {
        return new FireEvent();
    }

    /**
     * Create an instance of {@link FireEventResponse }
     * 
     */
    public FireEventResponse createFireEventResponse() {
        return new FireEventResponse();
    }

    /**
     * Create an instance of {@link ListJobs }
     * 
     */
    public ListJobs createListJobs() {
        return new ListJobs();
    }

    /**
     * Create an instance of {@link ListJobsResponse }
     * 
     */
    public ListJobsResponse createListJobsResponse() {
        return new ListJobsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfJob }
     * 
     */
    public ArrayOfJob createArrayOfJob() {
        return new ArrayOfJob();
    }

    /**
     * Create an instance of {@link ListJobTypes }
     * 
     */
    public ListJobTypes createListJobTypes() {
        return new ListJobTypes();
    }

    /**
     * Create an instance of {@link ListJobTypesResponse }
     * 
     */
    public ListJobTypesResponse createListJobTypesResponse() {
        return new ListJobTypesResponse();
    }

    /**
     * Create an instance of {@link ListJobActions }
     * 
     */
    public ListJobActions createListJobActions() {
        return new ListJobActions();
    }

    /**
     * Create an instance of {@link ListJobActionsResponse }
     * 
     */
    public ListJobActionsResponse createListJobActionsResponse() {
        return new ListJobActionsResponse();
    }

    /**
     * Create an instance of {@link ListJobStates }
     * 
     */
    public ListJobStates createListJobStates() {
        return new ListJobStates();
    }

    /**
     * Create an instance of {@link ListJobStatesResponse }
     * 
     */
    public ListJobStatesResponse createListJobStatesResponse() {
        return new ListJobStatesResponse();
    }

    /**
     * Create an instance of {@link CancelJob }
     * 
     */
    public CancelJob createCancelJob() {
        return new CancelJob();
    }

    /**
     * Create an instance of {@link CancelJobResponse }
     * 
     */
    public CancelJobResponse createCancelJobResponse() {
        return new CancelJobResponse();
    }

    /**
     * Create an instance of {@link CreateCacheRefreshPlan }
     * 
     */
    public CreateCacheRefreshPlan createCreateCacheRefreshPlan() {
        return new CreateCacheRefreshPlan();
    }

    /**
     * Create an instance of {@link CreateCacheRefreshPlanResponse }
     * 
     */
    public CreateCacheRefreshPlanResponse createCreateCacheRefreshPlanResponse() {
        return new CreateCacheRefreshPlanResponse();
    }

    /**
     * Create an instance of {@link SetCacheRefreshPlanProperties }
     * 
     */
    public SetCacheRefreshPlanProperties createSetCacheRefreshPlanProperties() {
        return new SetCacheRefreshPlanProperties();
    }

    /**
     * Create an instance of {@link SetCacheRefreshPlanPropertiesResponse }
     * 
     */
    public SetCacheRefreshPlanPropertiesResponse createSetCacheRefreshPlanPropertiesResponse() {
        return new SetCacheRefreshPlanPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetCacheRefreshPlanProperties }
     * 
     */
    public GetCacheRefreshPlanProperties createGetCacheRefreshPlanProperties() {
        return new GetCacheRefreshPlanProperties();
    }

    /**
     * Create an instance of {@link GetCacheRefreshPlanPropertiesResponse }
     * 
     */
    public GetCacheRefreshPlanPropertiesResponse createGetCacheRefreshPlanPropertiesResponse() {
        return new GetCacheRefreshPlanPropertiesResponse();
    }

    /**
     * Create an instance of {@link CacheRefreshPlanState }
     * 
     */
    public CacheRefreshPlanState createCacheRefreshPlanState() {
        return new CacheRefreshPlanState();
    }

    /**
     * Create an instance of {@link DeleteCacheRefreshPlan }
     * 
     */
    public DeleteCacheRefreshPlan createDeleteCacheRefreshPlan() {
        return new DeleteCacheRefreshPlan();
    }

    /**
     * Create an instance of {@link DeleteCacheRefreshPlanResponse }
     * 
     */
    public DeleteCacheRefreshPlanResponse createDeleteCacheRefreshPlanResponse() {
        return new DeleteCacheRefreshPlanResponse();
    }

    /**
     * Create an instance of {@link ListCacheRefreshPlans }
     * 
     */
    public ListCacheRefreshPlans createListCacheRefreshPlans() {
        return new ListCacheRefreshPlans();
    }

    /**
     * Create an instance of {@link ListCacheRefreshPlansResponse }
     * 
     */
    public ListCacheRefreshPlansResponse createListCacheRefreshPlansResponse() {
        return new ListCacheRefreshPlansResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCacheRefreshPlan }
     * 
     */
    public ArrayOfCacheRefreshPlan createArrayOfCacheRefreshPlan() {
        return new ArrayOfCacheRefreshPlan();
    }

    /**
     * Create an instance of {@link LogonUser }
     * 
     */
    public LogonUser createLogonUser() {
        return new LogonUser();
    }

    /**
     * Create an instance of {@link LogonUserResponse }
     * 
     */
    public LogonUserResponse createLogonUserResponse() {
        return new LogonUserResponse();
    }

    /**
     * Create an instance of {@link Logoff }
     * 
     */
    public Logoff createLogoff() {
        return new Logoff();
    }

    /**
     * Create an instance of {@link LogoffResponse }
     * 
     */
    public LogoffResponse createLogoffResponse() {
        return new LogoffResponse();
    }

    /**
     * Create an instance of {@link GetPermissions }
     * 
     */
    public GetPermissions createGetPermissions() {
        return new GetPermissions();
    }

    /**
     * Create an instance of {@link GetPermissionsResponse }
     * 
     */
    public GetPermissionsResponse createGetPermissionsResponse() {
        return new GetPermissionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString3 }
     * 
     */
    public ArrayOfString3 createArrayOfString3() {
        return new ArrayOfString3();
    }

    /**
     * Create an instance of {@link GetSystemPermissions }
     * 
     */
    public GetSystemPermissions createGetSystemPermissions() {
        return new GetSystemPermissions();
    }

    /**
     * Create an instance of {@link GetSystemPermissionsResponse }
     * 
     */
    public GetSystemPermissionsResponse createGetSystemPermissionsResponse() {
        return new GetSystemPermissionsResponse();
    }

    /**
     * Create an instance of {@link ListSecurityScopes }
     * 
     */
    public ListSecurityScopes createListSecurityScopes() {
        return new ListSecurityScopes();
    }

    /**
     * Create an instance of {@link ListSecurityScopesResponse }
     * 
     */
    public ListSecurityScopesResponse createListSecurityScopesResponse() {
        return new ListSecurityScopesResponse();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link TimeZoneInformation }
     * 
     */
    public TimeZoneInformation createTimeZoneInformation() {
        return new TimeZoneInformation();
    }

    /**
     * Create an instance of {@link SYSTEMTIME }
     * 
     */
    public SYSTEMTIME createSYSTEMTIME() {
        return new SYSTEMTIME();
    }

    /**
     * Create an instance of {@link ItemHistorySnapshot }
     * 
     */
    public ItemHistorySnapshot createItemHistorySnapshot() {
        return new ItemHistorySnapshot();
    }

    /**
     * Create an instance of {@link SearchCondition }
     * 
     */
    public SearchCondition createSearchCondition() {
        return new SearchCondition();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ItemReference }
     * 
     */
    public ItemReference createItemReference() {
        return new ItemReference();
    }

    /**
     * Create an instance of {@link ItemReferenceData }
     * 
     */
    public ItemReferenceData createItemReferenceData() {
        return new ItemReferenceData();
    }

    /**
     * Create an instance of {@link ArrayOfChoice1 }
     * 
     */
    public ArrayOfChoice1 createArrayOfChoice1() {
        return new ArrayOfChoice1();
    }

    /**
     * Create an instance of {@link ParameterFieldReference }
     * 
     */
    public ParameterFieldReference createParameterFieldReference() {
        return new ParameterFieldReference();
    }

    /**
     * Create an instance of {@link ParameterValueOrFieldReference }
     * 
     */
    public ParameterValueOrFieldReference createParameterValueOrFieldReference() {
        return new ParameterValueOrFieldReference();
    }

    /**
     * Create an instance of {@link ParameterValue }
     * 
     */
    public ParameterValue createParameterValue() {
        return new ParameterValue();
    }

    /**
     * Create an instance of {@link DataSourceDefinitionOrReference }
     * 
     */
    public DataSourceDefinitionOrReference createDataSourceDefinitionOrReference() {
        return new DataSourceDefinitionOrReference();
    }

    /**
     * Create an instance of {@link InvalidDataSourceReference }
     * 
     */
    public InvalidDataSourceReference createInvalidDataSourceReference() {
        return new InvalidDataSourceReference();
    }

    /**
     * Create an instance of {@link DataSourceReference }
     * 
     */
    public DataSourceReference createDataSourceReference() {
        return new DataSourceReference();
    }

    /**
     * Create an instance of {@link ArrayOfField }
     * 
     */
    public ArrayOfField createArrayOfField() {
        return new ArrayOfField();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link QueryDefinition }
     * 
     */
    public QueryDefinition createQueryDefinition() {
        return new QueryDefinition();
    }

    /**
     * Create an instance of {@link ExtensionParameter }
     * 
     */
    public ExtensionParameter createExtensionParameter() {
        return new ExtensionParameter();
    }

    /**
     * Create an instance of {@link ArrayOfValidValue }
     * 
     */
    public ArrayOfValidValue createArrayOfValidValue() {
        return new ArrayOfValidValue();
    }

    /**
     * Create an instance of {@link ValidValue }
     * 
     */
    public ValidValue createValidValue() {
        return new ValidValue();
    }

    /**
     * Create an instance of {@link Subscription }
     * 
     */
    public Subscription createSubscription() {
        return new Subscription();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link DataSourcePrompt }
     * 
     */
    public DataSourcePrompt createDataSourcePrompt() {
        return new DataSourcePrompt();
    }

    /**
     * Create an instance of {@link ModelDrillthroughReport }
     * 
     */
    public ModelDrillthroughReport createModelDrillthroughReport() {
        return new ModelDrillthroughReport();
    }

    /**
     * Create an instance of {@link ModelItem }
     * 
     */
    public ModelItem createModelItem() {
        return new ModelItem();
    }

    /**
     * Create an instance of {@link ModelCatalogItem }
     * 
     */
    public ModelCatalogItem createModelCatalogItem() {
        return new ModelCatalogItem();
    }

    /**
     * Create an instance of {@link ArrayOfModelPerspective }
     * 
     */
    public ArrayOfModelPerspective createArrayOfModelPerspective() {
        return new ArrayOfModelPerspective();
    }

    /**
     * Create an instance of {@link ModelPerspective }
     * 
     */
    public ModelPerspective createModelPerspective() {
        return new ModelPerspective();
    }

    /**
     * Create an instance of {@link ScheduleDefinitionOrReference }
     * 
     */
    public ScheduleDefinitionOrReference createScheduleDefinitionOrReference() {
        return new ScheduleDefinitionOrReference();
    }

    /**
     * Create an instance of {@link MinuteRecurrence }
     * 
     */
    public MinuteRecurrence createMinuteRecurrence() {
        return new MinuteRecurrence();
    }

    /**
     * Create an instance of {@link RecurrencePattern }
     * 
     */
    public RecurrencePattern createRecurrencePattern() {
        return new RecurrencePattern();
    }

    /**
     * Create an instance of {@link MonthlyDOWRecurrence }
     * 
     */
    public MonthlyDOWRecurrence createMonthlyDOWRecurrence() {
        return new MonthlyDOWRecurrence();
    }

    /**
     * Create an instance of {@link DaysOfWeekSelector }
     * 
     */
    public DaysOfWeekSelector createDaysOfWeekSelector() {
        return new DaysOfWeekSelector();
    }

    /**
     * Create an instance of {@link MonthsOfYearSelector }
     * 
     */
    public MonthsOfYearSelector createMonthsOfYearSelector() {
        return new MonthsOfYearSelector();
    }

    /**
     * Create an instance of {@link MonthlyRecurrence }
     * 
     */
    public MonthlyRecurrence createMonthlyRecurrence() {
        return new MonthlyRecurrence();
    }

    /**
     * Create an instance of {@link WeeklyRecurrence }
     * 
     */
    public WeeklyRecurrence createWeeklyRecurrence() {
        return new WeeklyRecurrence();
    }

    /**
     * Create an instance of {@link DailyRecurrence }
     * 
     */
    public DailyRecurrence createDailyRecurrence() {
        return new DailyRecurrence();
    }

    /**
     * Create an instance of {@link ItemParameter }
     * 
     */
    public ItemParameter createItemParameter() {
        return new ItemParameter();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link ArrayOfValidValue1 }
     * 
     */
    public ArrayOfValidValue1 createArrayOfValidValue1() {
        return new ArrayOfValidValue1();
    }

    /**
     * Create an instance of {@link DataSourceCredentials }
     * 
     */
    public DataSourceCredentials createDataSourceCredentials() {
        return new DataSourceCredentials();
    }

    /**
     * Create an instance of {@link ExpirationDefinition }
     * 
     */
    public ExpirationDefinition createExpirationDefinition() {
        return new ExpirationDefinition();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link CacheRefreshPlan }
     * 
     */
    public CacheRefreshPlan createCacheRefreshPlan() {
        return new CacheRefreshPlan();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustedUserHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrustedUserHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", name = "TrustedUserHeader")
    public JAXBElement<TrustedUserHeader> createTrustedUserHeader(TrustedUserHeader value) {
        return new JAXBElement<TrustedUserHeader>(_TrustedUserHeader_QNAME, TrustedUserHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerInfoHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServerInfoHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", name = "ServerInfoHeader")
    public JAXBElement<ServerInfoHeader> createServerInfoHeader(ServerInfoHeader value) {
        return new JAXBElement<ServerInfoHeader>(_ServerInfoHeader_QNAME, ServerInfoHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemNamespaceHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemNamespaceHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/sqlserver/reporting/2010/03/01/ReportServer", name = "ItemNamespaceHeader")
    public JAXBElement<ItemNamespaceHeader> createItemNamespaceHeader(ItemNamespaceHeader value) {
        return new JAXBElement<ItemNamespaceHeader>(_ItemNamespaceHeader_QNAME, ItemNamespaceHeader.class, null, value);
    }

}
