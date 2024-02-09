package org.com;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;
import java.util.Map;
public class GenerateModels {
    public static void main(String[] args) {
       try {
           // Swagger first JSON file path
            String swaggerJsonPath = "/Users/uday/Downloads/Temelio/swagger1.json";
            String outputFilePath = "/Users/uday/Downloads/Temelio/copilot.java";

           // Swagger second JSON file path
//           String swaggerJsonPath = "/Users/uday/Downloads/Temelio/swagger2.json";
//           String outputFilePath = "/Users/uday/Downloads/Temelio/copilot.java";

            // Read the swagger.json file and generate the models
            String swaggerJson = readSwaggerJson(swaggerJsonPath);

            // Parse the swagger.json and generate the models
            String models = generateJavaModels(swaggerJson);

            // Write the models to a file
           writeToFile(outputFilePath, models);

           System.out.println("Models generated successfully");

       } catch (IOException e) {
           System.err.println("Error: " + e.getMessage());
       }

    }
    /**
     * Reads the content of a JSON file and returns it as a string.
     *
     * @param filePath The path to the JSON file.
     * @return The content of the JSON file as a string.
     * @throws IOException If there is an issue reading the file.
     */
    private static String readSwaggerJson(String filePath) throws IOException {
        return new String(Files.readAllBytes(new File(filePath).toPath()));
    }

    private static String generateJavaModels(String swaggerJson) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(swaggerJson);

        // Parse the swagger.json and generate the models
        StringBuilder models = new StringBuilder();

        // Get the classes from the swagger.json
        String[] classNames = {
                "Nonprofit", "Address", "FiscalSponsor", "NonprofitAdditionalInfo", "NonprofitIRSData", "NonprofitMetadata",
                "OfacFlags", "OfacSdn", "PlaidData", "DeleteFileInfo", "Foundation", "FoundationUser", "NonprofitUser",
                "PresignedFile", "UploadedFile", "UserFoundationRole", "UserNonprofitRole", "AppUser", "NylasSyncRequest",
                "AdditionalContact", "FoundationNonprofitInteraction", "IRS990Details", "InteractionAdditionalInfo",
                "QBVendorDetails", "AnvilPDFAdditionalInfo", "AnvilPDFField", "Budget", "BudgetAllocation",
                "CRMConfiguration", "CRMConfigurationField", "CRMExternalConfigProperty", "ConfigurationSettings",
                "CustomEmailTemplate", "CustomGrantType", "DefaultDateSetting", "DisplayCondition", "DocumentItem",
                "ExternalReviewerConfiguration", "ExternalReviewerTableConfiguration", "FeatureSet", "FormItem",
                "FormItemOptions", "FormItemValue", "FormOptionEntity", "FoundationCRMField", "FoundationMailSettings",
                "FoundationMetadata", "FoundationMetadataTag", "FoundationQuickbooksSetting", "FoundationReviewerUser",
                "FoundationSalesforceConfiguration", "GrantStage", "GrantStageWorkflow", "GrantTypeConfiguration",
                "GranteeProfileUpdate", "GranteeProfileUpdateConfiguration", "MailChimpFoundationConfiguration",
                "MetabaseConfiguration", "MetabaseDashboardUrl", "Pipeline", "QBPaymentDestination", "QBPaymentSource",
                "QBPaymentSyncSetting", "SalesforceEntityToUpdate", "SalesforceSyncRequest", "SalesforceTokenResponse",
                "ScoringCriteria", "StageTaskTemplate", "TableDisplayCell", "TableDisplayContent", "TableDisplayRow",
                "TaskTemplateAdditionalInfo", "TemelioSalesforceFieldMapping", "NonprofitIRSUpdateRequest",
                "FormComponentSubmission", "FormItemResponseEntity", "FormPDFResponseData", "TableResponseCell",
                "TableSubmissionRow", "FoundationNonprofitCreateRequest", "UpdateAppUserRequest", "DocusignTokenResponse",
                "DocusignUserFoundationSettings", "NotificationSetting", "NylasAccessToken", "NylasUserFoundationSettings",
                "SystemNotifications", "UserBrandingSettings", "UserFoundationSettings", "UserPipelineSettings", "Faceting",
                "Pagination", "SwapIndexesParams", "Task", "TaskDetails", "TaskError", "TypoTolerance", "CandidEntityResponse",
                "DemographicsCategory", "DemographicsData", "DemographicsDetails", "DemographicsResponse",
                "DemographicsStaffLevelTotals", "DemographicsSubcategory", "DemographicsSummary", "PremierAccountingRatio",
                "PremierAccreditation", "PremierAddress", "PremierAnnualReport", "PremierBalanceSheetComposition",
                "PremierBoardLeadershipPractice", "PremierBoardOfDirector", "PremierBusinessModelIndicators",
                "PremierCapitalStructureIndicators", "PremierCategory", "PremierCharitycheck", "PremierChartingImpactAnswer",
                "PremierContractor", "PremierData", "PremierDemographics", "PremierEquityStrategies",
                "PremierExpenseComposition", "PremierF990Financial", "PremierFeedbackResponse", "PremierFinancialDocument",
                "PremierFinancialStatement", "PremierFinancialTrendsAnalysis", "PremierFinancials",
                "PremierFormerlyKnownA", "PremierForms990T", "PremierFullCostComponents", "PremierFundingSource",
                "PremierHighestPaidEmployee", "PremierKeyDataChecks", "PremierLettersOfDetermination", "PremierLiquidity",
                "PremierMostRecentYearFinancials", "PremierNaicsCode", "PremierNteeCode", "PremierOfficersDirectorsKeyEmployee",
                "PremierOperations", "PremierOrgDoesNotCollectFor", "PremierOrganizationDemographics",
                "PremierOrganizationType", "PremierOtherDocument", "PremierOtherStaff", "PremierPart10BalanceSheet",
                "PremierPart8Revenue", "PremierPart9Expenses", "PremierPcsCode", "PremierPhoto", "PremierPlatinumEvaluationDocument",
                "PremierProfileDataChangeDates", "PremierProfileSdgCode", "PremierProfitability", "PremierProgram",
                "PremierProgramPlatinumMetric", "PremierPrograms", "PremierResponse", "PremierRevenueComposition", "PremierSdg",
                "PremierSicCode", "PremierStaffLevel", "PremierStaffLevelTotals", "PremierSubcategory", "PremierSummary",
                "PremierTelephoneNumber", "PremierVideo", "PremierYear", "Exception", "Function0", "Function0Object",
                "LongRunningTask", "LongRunningTaskObject", "StackTraceElement", "Throwable", "IndexRequest",
                "AggregateDashboardResponse", "AggregateFoundationProposalSummary", "AggregateGrantAnalysis",
                "AnvilPDFFieldResponse", "AnvilPDFFieldResponses", "AnvilPaymentDetails", "Currency", "DonorActivity",
                "DonorActivityAdditionalInfo", "DonorContribution", "DonorContributionComment", "DonorData", "DonorEntity",
                "DonorRelationship", "DonorTag", "EntityDetails", "FirstFormDetails", "FormBuilder",
                "FoundationProposalSummary", "GrantAdditionalInfo", "GrantAdditionalInfoEntity", "GrantAmount",
                "GrantDuration", "GrantEligibility", "GrantFormAdditionalInfo", "GrantFormProposal", "GrantPayment",
                "GrantPaymentSummary", "GrantProposalSubmission", "GrantRefereeConfig", "GrantRefereeInfo",
                "GrantRefereeRequestConfig", "GrantRefereeRequestDetail", "GrantSubmissionSearchResponse",
                "MultiFormResponse", "MultipleFormInfo", "PaymentAdditionalInfo", "PipelineProposalSummary",
                "ProposalStageResult", "QBPaymentDetails", "SignatureOrder", "SignatureStatusDetails", "TaskAdditionalInfo",
                "TaskSourceEntity", "TaskTemplate", "TaskTemplateAssignee", "TaskTemplateResponse", "TipTapAttrs",
                "TipTapTextBlock", "UserDetails", "AggregateDashboardRequest", "DataColumn", "DataRow",
                "DataSearchResponse", "SubmissionTableResponseRetriever", "AggregateDataSearchRequest", "AwardStatistics",
                "BudgetCategoryAllocation", "BudgetCategoryYOYData", "CustomGrantTypeAllocation", "CustomGrantTypeYOYData",
                "DashboardResponse", "FiscalRange", "FiscalYearData", "FoundationTagAllocation", "GrantTypeAllocation",
                "GrantTypeYOYData", "NonprofitAmount", "TagYOYData", "YOYData", "YearlyData", "AggregateExecDashboardRequest",
                "AggregateUniversalFoundationSearchResponse", "AggregateUniversalSearchResponse", "CRMSubmissionDetails",
                "FoundationNonprofitMetadata", "FoundationSearchResponseEntity", "AggregateUniversalSearchQuery",
                "AggregateContactResponse", "AggregateFoundationCRMResponse", "AggregateContactSearchRequest", "BoardBook",
                "BoardBookSummarySheet", "BoardGrantProposal", "BoardGeneratorRequest", "BoardProposalValues",
                "DocumentFieldResponse", "BoardProposalSearchResponse", "BoardProposalSearchQuery", "AnalyticsField",
                "AnalyticsFieldSubmissionInfo", "DataSearchQuery", "AnalyticsFieldPaymentResponse", "AnalyticsFieldValue",
                "AnalyticsFieldYOYData", "AnalyticsResponse", "AnalyticsRequest", "DocumentTemplate",
                "DocumentTemplateAdditionalInfo", "AccountInfo", "DocusignSenderViewResponse", "EnvelopeRecipient",
                "EnvelopeSendRequest", "DocusignAdditionalInfo", "DocusignEnvelope", "Envelope", "Recipients", "Sender",
                "Signer", "DocusignLoginURL", "DocusignLoginRequest", "DonorRelationshipType", "DonorEntityType",
                "EligibilityConfiguration", "EligibilityEmailTemplate", "EligibilityForm", "UniversalForm",
                "ExternalReviewerDashboard", "TaskSubmission", "AssignExternalReviewerRequest", "FileMeta", "FileCopyPair",
                "Folder", "AdditionalFilterInfo", "FilterView", "FilterViewCondition", "FilterViewFilter",
                "FilterViewRename", "FilterViewSettings", "FilterViewSorting", "FilterViewVisibility",
                "EligibilityFormResponses", "NonprofitGrantPair", "NonprofitGrantSubmission", "GrantEligibilityResponse",
                "GetFoundationNonprofitUsersResponse", "FoundationPaymentField", "FoundationProposals",
                "FilteredProposalCell", "FilteredProposalColumn", "FilteredProposalRow", "GetFilteredProposalsResponse",
                "GetFilteredBulkProposalsResponse", "BulkFilterProposalsRequest", "CreateTaskReviewerRequest",
                "CRMSearchResponse", "CRMSearchQuery", "FilterOption", "SortOption", "LandingPage", "ContactsResponse",
                "ContactsRequest", "PaymentSearchResponse", "PaymentSearchQuery", "BankInfoDownloadRequest",
                "NonprofitMergeRequest", "FoundationNonprofitGrantSummary", "FoundationNonprofitPaymentSummary", "NumbersACH",
                "FoundationNotes", "AccountBasedExpenseLineDetail", "AttachableRef", "Bill", "ContactInfo", "CustomField",
                "DepositLineDetail", "DescriptionLineDetail", "DiscountLineDetail", "DiscountOverride", "EmailAddress",
                "EntityTypeRef", "GenericContactType", "GroupLineDetail", "IntuitAnyType", "ItemAdjustmentLineDetail",
                "ItemBasedExpenseLineDetail", "ItemReceiptLineDetail", "JournalEntryLineDetail", "Line", "LinkedTxn",
                "MarkupInfo", "ModificationMetaData", "PaymentLineDetail", "PhysicalAddress", "PurchaseOrderItemLineDetail",
                "QBSearchResponse", "QBSearchResponseBill", "QuickbooksNonprofitDetails", "RecurringInfo",
                "RecurringScheduleInfo", "ReferenceType", "ReimburseLineDetail", "SalesItemLineDetail",
                "SalesOrderItemLineDetail", "SubTotalLineDetail", "TDSLineDetail", "Tag", "TaxLineDetail",
                "TelephoneNumber", "TxnApprovalInfo", "TxnTaxDetail", "UOMRef", "Vendor", "VendorBankAccountDetail",
                "WebSiteAddress", "AccountBalance", "AccountBase", "AuthMetadata", "AuthSupportedMethods",
                "BankAccountDetail", "HealthIncident", "IncidentUpdate", "Institution", "InstitutionStatus",
                "PaymentInitiationMetadata", "PaymentInitiationStandingOrderMetadata", "ProductStatus",
                "ProductStatusBreakdown", "BulkNonprofitUserUpdate", "FoundationNonprofitActivity",
                "GrantSubmissionStatusChange", "NylasFolder", "NylasLabel", "NylasParticipant", "NylasThread",
                "NylasThreadGroup", "StatusChangeData", "PostmarkMessage", "PostmarkMessageEvent",
                "PostmarkMessageEventDetails", "PostmarkOutboundSearchResponse", "PostmarkRecipient", "HTMLRequest",
                "SubmissionRequest", "GrantTemplate", "BulkActionRequest", "BulkCreatePaymentRequest",
                "BulkCreateReminderRequest", "BulkCreateReportRequest", "SubmissionGranteePair",
                "GrantSubmissionSearchQuery", "SubmissionComment", "ReviewEntity", "ReviewScores", "UserReviewResponse",
                "BulkDownloadRequest", "GrantProposalSubmissionDeltaResponse", "GrantSubmissionChange", "SubmissionTasks",
                "ManualGrantLog", "GrantProposalSubmissionReminder", "NonprofitGrantRefereeStatus",
                "EntitySuggestionResponse", "ResponseEntitySuggestion", "SubmissionSuggestionResponses",
                "SuggestionResponseSource", "QuestionAnswerPair", "SuggestedResponsesRequest", "MailChimpAuthUrl",
                "MailChimpAddress", "MailChimpCampaign", "MailChimpList", "NonprofitCreateRequest", "Notification",
                "NotificationContent", "NotificationResponse", "NotificationUser", "NotificationQuery", "NylasFile",
                "NylasMessage", "NylasLoginURL", "NylasFileRequest", "PlaidLinkTokenResponse", "PlaidTokenExchangeResponse",
                "PlaidTokenExchangeRequest", "QuickbooksLoginURL", "QuickbooksLoginRequest", "Account", "QBSearchResponseAccount",
                "QBBillSearchRequest", "QBSearchResponseVendor", "QBVendorSearchRequest", "Report", "ReportSubmission",
                "SubmissionEntity", "SubmissionResponse", "CommunicationEmailTemplate", "CommunicationPortalEmail",
                "CommunicationPortalEmailNonprofit", "CommunicationPortalEmailRecipients", "CommunicationPortalGetFoundationEmailsResponse",
                "CommunicationPortalGetFoundationEmailsRequest", "CommunicationPortalGetFoundationEmailResponse",
                "DocumentItemResponse", "TaskWithSubmission", "SalesforceLoginURL", "SalesforceLoginRequest", "FoundationSearchResponse",
                "FoundationSearchQuery", "NonprofitSearchEntity", "NonprofitSearchResponse", "NonprofitSearchQuery",
                "UniversalSearchDocument", "UniversalSearchResponse", "UniversalSearchQuery", "FoundationSearchBarQuery",
                "TaskSearchResponse", "TaskSearchQuery", "TaskComment", "BulkTaskSubmissionRequest", "UserBearer",
                "GetNonprofitResult", "GetNonprofitMetadataResult", "GetNonprofitUserResult"
        };

        // for second swagger.json file
        String[] classNames2= {"Address", "Duration", "GrantSubmission", "Nonprofit"};

        for (String className : classNames) {
            generateClassModels(jsonNode, className, models);
        }
        return models.toString();
    }

    private static void generateClassModels(JsonNode jsonNode, String className, StringBuilder models) {
        JsonNode definitionNode = jsonNode.get("definitions").path(className);

        // Check if the definition for the class is missing
        if (definitionNode.isMissingNode()) {
            System.err.println("Definition for Class " + className + " not found");
            return;
        }

        // Generate class declaration
        models.append("public class ").append(className).append(" {\n");

        // Generate fields for each property
        JsonNode propertiesNode = definitionNode.path("properties");
        Iterator<Map.Entry<String, JsonNode>> properties = propertiesNode.fields();

        // Iterate through the properties
        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();
            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate the field declaration
            generateFieldDeclaration(models, propertyName, propertyType, propertyDetails);
        }


        // Generate default constructor
        models.append("\n    public ").append(className).append("() {}\n");

        // Generate constructor with all fields
        models.append("\n    public ").append(className).append("(");

        // Iterate through the properties
        Iterator<Map.Entry<String, JsonNode>> propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();
            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate the constructor parameters
            models.append(propertyType).append(" ").append(propertyName);

            // Add a comma if there are more parameters
            if (propertiesConstructor.hasNext()) {
                models.append(", ");
            }
        }

        // Close the constructor declaration
        models.append(") {\n");

        // Generate the constructor assignments
        propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();

            // Generate the constructor body
            models.append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n");
        }

        // Close the constructor declaration
        models.append("    }\n");

        // Generate getters and setters for each property

        properties = propertiesNode.fields();

        // Iterate through the properties

        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();
            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType = determinePropertyType(propertyName, propertyDetails);

            // Generate getter
            models.append("\n    public ").append(propertyType).append(" get")
                    .append(capitalize(propertyName)).append("() {\n")
                    .append("        return ").append(propertyName).append(";\n")
                    .append("    }\n");

            // Generate setter
            models.append("\n    public void set").append(capitalize(propertyName))
                    .append("(").append(propertyType).append(" ").append(propertyName).append(") {\n")
                    .append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n")
                    .append("    }\n");
        }

        // Close the class declaration
        models.append("}\n\n");
    }
    /**
     * Determines the type of the property based on the JSON schema.
     *
     * @param propertyDetails JSON node containing property details.
     * @return The type of the property.
     */
    /**
     * Determines the type of the property based on the JSON schema.
     *
     * @param propertyDetails JSON node containing property details.
     * @return The type of the property.
     */
    private static String determinePropertyType(String propertyName, JsonNode propertyDetails) {
        // Check if the property is a reference type
        if (propertyDetails.has("$ref")) {
            String ref = propertyDetails.get("$ref").asText();
            return mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
        }

        // Check if the property has a defined type
        if (propertyDetails.has("type")) {
            String propertyType = propertyDetails.get("type").asText();
            propertyType = mapJsonSchemaTypeToJava(propertyType);

            // Check for additional properties in the case of an Object type
            if (propertyType.equals("Object") && propertyDetails.has("additionalProperties")) {
                JsonNode additionalProperties = propertyDetails.get("additionalProperties");

                // Check if additional properties are of a reference type
                if (additionalProperties.has("$ref")) {
                    String ref = additionalProperties.get("$ref").asText();
                    return mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
                }
            }

            // Check if the property is an array
            if (propertyType.equals("List") && propertyDetails.has("items")) {
                JsonNode itemsNode = propertyDetails.path("items");

                // Handle the case where the array items are of another class
                if (itemsNode.has("$ref")) {
                    String ref = itemsNode.get("$ref").asText();
                    return "List<" + mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1)) + ">";
                } else if (itemsNode.has("type")) {
                    // Handle the case where the array items are of a primitive type
                    String itemType = itemsNode.get("type").asText();
                    return "List<" + mapJsonSchemaTypeToJava(itemType) + ">";
                }
            }

            // Check if the property is an enum
            if (propertyDetails.has("enum")) {
                return capitalize(propertyName);
            }

            return propertyType;
        }

        // Default to Object type if no type is specified
        return "Object";
    }

    /**
     * Generates the field declaration for a property and appends it to the StringBuilder.
     *
     * @param models           StringBuilder to append the field declaration.
     * @param propertyName     Name of the property.
     * @param propertyType     Type of the property.
     * @param propertyDetails  JSON node containing property details.
     */
    private static void generateFieldDeclaration(StringBuilder models, String propertyName, String propertyType, JsonNode propertyDetails) {
        // Check for array type
        if (propertyDetails.has("items")) {
            JsonNode itemsNode = propertyDetails.path("items");

            // Handle the case where the array items are of another class
            if (itemsNode.has("$ref")) {
                String ref = itemsNode.get("$ref").asText();
                String type = mapJsonSchemaTypeToJava(ref.substring(ref.lastIndexOf("/") + 1));
                propertyType = "List<" + type + ">";
            } else {
                // Handle the case where the array items are of a primitive type
                String type = itemsNode.get("type").asText();
                propertyType = "List<" + mapJsonSchemaTypeToJava(type) + ">";
            }
        }

        // Check for enum type
        boolean isEnumProperty = propertyDetails.has("enum");

        // Generate the field declaration
        if (isEnumProperty) {
            // Handle the case where the property is an enum
            generateEnumDeclaration(models, propertyName, propertyDetails);
        } else {
            // Handle the case where the property is not an enum
            models.append("    private ").append(propertyType).append(" ").append(propertyName).append(";\n");
        }
    }
    /**
     * Generates the enum declaration for a property and appends it to the StringBuilder.
     *
     * @param models           StringBuilder to append the enum declaration.
     * @param propertyName     Name of the enum property.
     * @param propertyDetails  JSON node containing property details.
     */
    private static String generateEnumDeclaration(StringBuilder models, String propertyName, JsonNode propertyDetails) {
        // Handle the case where the property is an enum
        String enumType = capitalize(propertyName);
        models.append("    public enum ").append(enumType).append(" {\n");

        // Iterate through the enum values
        for (JsonNode enumValue : propertyDetails.get("enum")) {
            models.append("        ").append(enumValue.asText()).append(",\n");
        }

        // Close the enum declaration
        models.append("    }\n");

        // change the propertyType to enumType
        models.append("    private ").append(enumType).append(" ").append(propertyName).append(";\n");

        // make return type so it can be used in the constructor

        return enumType;

    }
    /**
     * Maps JSON schema types to Java types.
     *
     * @param str JSON schema type to be mapped.
     * @return Corresponding Java type.
     */
    private static String mapJsonSchemaTypeToJava(String str) {
        // Use switch expression to map JSON schema types to Java types
        String javaType = switch (str) {
            case "string" -> "String";
            case "integer" -> "int";
            case "number" -> "double";
            case "boolean" -> "boolean";
            case "array" -> "List";
            default -> str;
        };

        // Special case for "object" type
        if (str.equals("object")) {
            return "Object";
        }

        return javaType;
    }

    /**
     * Writes content to a file at the specified filePath.
     *
     * @param filePath Path to the file where content should be written.
     * @param content  Content to be written to the file.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    private static void writeToFile(String filePath, String content) throws IOException {
        // Use Files.write to write content to the specified file path
        Files.write(new File(filePath).toPath(), content.getBytes());
    }

    /**
     * Capitalizes the first letter of a string.
     *
     * @param str The input string to be capitalized.
     * @return The string with the first letter capitalized.
     */
    private static String capitalize(String str) {
        // Capitalize the first letter using substring
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
