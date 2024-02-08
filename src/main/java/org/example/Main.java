package org.example;/*
String[] classNames = {
        // List of class names goes here
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
 */
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        try {

            // Swagger JSON file
//            String swaggerJsonPath = "/Users/uday/Downloads/Temelio/swagger.json";
//            String outputFilePath = "/Users/uday/Downloads/Temelio/output.java";

            String swaggerJsonPath = "/Users/uday/Downloads/Temelio/problem2-swagger.json";
            String outputFilePath = "/Users/uday/Downloads/Temelio/output2.java";

            // Read Swagger JSON
            String swaggerJson = readSwaggerJson(swaggerJsonPath);

            // Parse Swagger JSON and generate Java models
            String javaModels = generateJavaModels(swaggerJson);

            // Write Java models to a file
            writeToFile(outputFilePath, javaModels);

            System.out.println("Java models generated successfully.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static String readSwaggerJson(String filePath) throws IOException {
        return new String(java.nio.file.Files.readAllBytes(new File(filePath).toPath()));
    }

    private static void writeToFile(String filePath, String content) throws IOException {
        java.nio.file.Files.write(new File(filePath).toPath(), content.getBytes());
    }

    private static String generateJavaModels(String swaggerJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(swaggerJson);

        // Generate Java models for specified classes
        StringBuilder javaModels = new StringBuilder();

        String[] classNames1 = {
                // List of class names goes here
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
        String[] classNames2 = {"Address", "Duration", "GrantSubmission", "Nonprofit"};

        for (String className : classNames2) {
            generateClassModel(rootNode, className, javaModels);
        }

        return javaModels.toString();
    }

    private static void generateClassModel(JsonNode rootNode, String className, StringBuilder javaModels) {
        JsonNode definitionNode = rootNode.path("definitions").path(className);
//        System.out.println(definitionNode);

        if (definitionNode.isMissingNode()) {
            System.err.println("Definition for class " + className + " not found.");
            return;
        }

        // Generate class declaration
        javaModels.append("public class ").append(className).append(" {\n");

        // Generate fields for each property
        JsonNode propertiesNode = definitionNode.path("properties");
        Iterator<Map.Entry<String, JsonNode>> properties = propertiesNode.fields();

        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();
            JsonNode propertyDetails = property.getValue();

            // Determine the type of the property
            String propertyType;
            if (propertyDetails.has("type")) {
                propertyType = mapJsonSchemaTypeToJava(propertyDetails.path("type"));
                if (Objects.equals(propertyName, "role")) {
                    System.out.println("propertyName : " + propertyName  + " \n" + "propertyDetails :" + propertyDetails + " \n" + "propertyType :" + propertyType);
                }

            } else if (propertyDetails.has("$ref")) {
                // Handle the case where the property type is another class
                String ref = propertyDetails.path("$ref").asText();
                propertyType = ref.substring(ref.lastIndexOf('/') + 1);
            } else {
                propertyType = "Object"; // Default to Object if type is not found
            }

            // Check if the property is an array
            if (propertyDetails.has("items")) {
                JsonNode itemsNode = propertyDetails.path("items");
                if (itemsNode.has("$ref")) {
                    // Handle the case where the array items are of another class
                    String ref = itemsNode.path("$ref").asText();
                    propertyType = "List<" + ref.substring(ref.lastIndexOf('/') + 1) + ">";
                } else if (itemsNode.has("type")) {
                    // Handle array of primitive types
                    propertyType = "List<" + mapJsonSchemaTypeToJava(itemsNode.path("type")) + ">";
                }
            }

            // Check if the property is an enum
            boolean isEnumProperty = propertyDetails.has("enum");

            // Generate field declaration
            if (isEnumProperty) {
                // Handle enum type
                javaModels.append("    public enum ").append(propertyName).append(" {\n");

                // Generate enum values
                JsonNode enumValuesNode = propertyDetails.path("enum");
                for (JsonNode enumValue : enumValuesNode) {
                    javaModels.append("        ").append(enumValue.asText()).append(",\n");
                }

                // Close enum declaration
                javaModels.append("    }\n");
            } else {
                // Generate regular field declaration
                javaModels.append("    private ").append(propertyType).append(" ").append(propertyName).append(";\n");
            }
        }

        // Generate default constructor
        javaModels.append("\n    public ").append(className).append("() {\n    }\n");

        // Generate parameterized constructor
        javaModels.append("\n    public ").append(className).append("(");

        Iterator<Map.Entry<String, JsonNode>> propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();
            String propertyType;
            if (property.getValue().has("type")) {
                propertyType = mapJsonSchemaTypeToJava(property.getValue().path("type"));
            } else {
                propertyType = "Object"; // Default to Object if type is not found
            }

            // Check if the property is an array
            if (property.getValue().has("items")) {
                JsonNode itemsNode = property.getValue().path("items");
                if (itemsNode.has("$ref")) {
                    // Handle the case where the array items are of another class
                    String ref = itemsNode.path("$ref").asText();
                    propertyType = "List<" + ref.substring(ref.lastIndexOf('/') + 1) + ">";
                } else if (itemsNode.has("type")) {
                    // Handle array of primitive types
                    propertyType = "List<" + mapJsonSchemaTypeToJava(itemsNode.path("type")) + ">";
                }
            }

            // Generate constructor parameters
            javaModels.append(propertyType).append(" ").append(propertyName);

            if (propertiesConstructor.hasNext()) {
                javaModels.append(", ");
            }
        }

        javaModels.append(") {\n");

        // Generate constructor assignments
        propertiesConstructor = propertiesNode.fields();

        while (propertiesConstructor.hasNext()) {
            Map.Entry<String, JsonNode> property = propertiesConstructor.next();
            String propertyName = property.getKey();

            // Generate constructor assignments
            javaModels.append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n");
        }

        // Close constructor
        javaModels.append("    }\n");

        // Generate getters and setters for each field
        properties = propertiesNode.fields();

        while (properties.hasNext()) {
            Map.Entry<String, JsonNode> property = properties.next();
            String propertyName = property.getKey();
            String propertyType;
            if (property.getValue().has("type")) {
                propertyType = mapJsonSchemaTypeToJava(property.getValue().path("type"));
            } else {
                propertyType = "Object"; // Default to Object if type is not found
            }

            // Check if the property is an array
            if (property.getValue().has("items")) {
                JsonNode itemsNode = property.getValue().path("items");
                if (itemsNode.has("$ref")) {
                    // Handle the case where the array items are of another class
                    String ref = itemsNode.path("$ref").asText();
                    propertyType = "List<" + ref.substring(ref.lastIndexOf('/') + 1) + ">";
                } else if (itemsNode.has("type")) {
                    // Handle array of primitive types
                    propertyType = "List<" + mapJsonSchemaTypeToJava(itemsNode.path("type")) + ">";
                }
            }

            // Generate getter
            javaModels.append("\n    public ").append(propertyType).append(" get").append(capitalize(propertyName)).append("() {\n")
                    .append("        return ").append(propertyName).append(";\n")
                    .append("    }\n");

            // Generate setter
            javaModels.append("\n    public void set").append(capitalize(propertyName)).append("(").append(propertyType).append(" ").append(propertyName).append(") {\n")
                    .append("        this.").append(propertyName).append(" = ").append(propertyName).append(";\n")
                    .append("    }\n");
        }

        // Close class
        javaModels.append("}\n\n");
    }

    private static String mapJsonSchemaTypeToJava(JsonNode typeNode) {
        assert typeNode != null;
        String type = typeNode.textValue();
        return switch (type) {
            case "string" -> "String";
            case "integer" -> "int";
            case "number" -> "double";
            case "boolean" -> "boolean";
            case "array" -> "List"; // Assuming array type will be a list
            // Handle other types as needed
            default -> "Object";
        };
    }

    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
