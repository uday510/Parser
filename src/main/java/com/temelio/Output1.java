package com.temelio;

import java.util.*;

public class Output1 {

public static class Nonprofit {
    private String id;
    private String legalName;
    private String ein;
    public enum EntityType {
        ORGANIZATION,
        INDIVIDUAL,
    }
    private EntityType entityType;
    private boolean active;
    private String created;

    public Nonprofit() {}

    public Nonprofit(String id, String legalName, String ein, EntityType entityType, boolean active, String created) {
        this.id = id;
        this.legalName = legalName;
        this.ein = ein;
        this.entityType = entityType;
        this.active = active;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}

public static class Address {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address() {}

    public Address(String address1, String address2, String city, String state, String zipcode, String country) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public static class FiscalSponsor {
    private String name;
    private String ein;
    private String email;
    private Address address;
    private String primaryContactName;
    private String primaryContactEmail;

    public FiscalSponsor() {}

    public FiscalSponsor(String name, String ein, String email, Address address, String primaryContactName, String primaryContactEmail) {
        this.name = name;
        this.ein = ein;
        this.email = email;
        this.address = address;
        this.primaryContactName = primaryContactName;
        this.primaryContactEmail = primaryContactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPrimaryContactName() {
        return primaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        this.primaryContactName = primaryContactName;
    }

    public String getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    public void setPrimaryContactEmail(String primaryContactEmail) {
        this.primaryContactEmail = primaryContactEmail;
    }
}

public static class NonprofitAdditionalInfo {
    private NonprofitIRSData irsData;
    private boolean completedOnboarding;
    private PlaidData plaidData;

    public NonprofitAdditionalInfo() {}

    public NonprofitAdditionalInfo(NonprofitIRSData irsData, boolean completedOnboarding, PlaidData plaidData) {
        this.irsData = irsData;
        this.completedOnboarding = completedOnboarding;
        this.plaidData = plaidData;
    }

    public NonprofitIRSData getIrsData() {
        return irsData;
    }

    public void setIrsData(NonprofitIRSData irsData) {
        this.irsData = irsData;
    }

    public boolean getCompletedOnboarding() {
        return completedOnboarding;
    }

    public void setCompletedOnboarding(boolean completedOnboarding) {
        this.completedOnboarding = completedOnboarding;
    }

    public PlaidData getPlaidData() {
        return plaidData;
    }

    public void setPlaidData(PlaidData plaidData) {
        this.plaidData = plaidData;
    }
}

public static class NonprofitIRSData {
    private String lastUpdated;
    private String latestFilingPDFURL;
    private int latestFilingYear;
    private int latestFormType;
    private int subsectionCode;
    private String irsLegalStatus;
    private String latestFormTypeFiled;

    public NonprofitIRSData() {}

    public NonprofitIRSData(String lastUpdated, String latestFilingPDFURL, int latestFilingYear, int latestFormType, int subsectionCode, String irsLegalStatus, String latestFormTypeFiled) {
        this.lastUpdated = lastUpdated;
        this.latestFilingPDFURL = latestFilingPDFURL;
        this.latestFilingYear = latestFilingYear;
        this.latestFormType = latestFormType;
        this.subsectionCode = subsectionCode;
        this.irsLegalStatus = irsLegalStatus;
        this.latestFormTypeFiled = latestFormTypeFiled;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLatestFilingPDFURL() {
        return latestFilingPDFURL;
    }

    public void setLatestFilingPDFURL(String latestFilingPDFURL) {
        this.latestFilingPDFURL = latestFilingPDFURL;
    }

    public int getLatestFilingYear() {
        return latestFilingYear;
    }

    public void setLatestFilingYear(int latestFilingYear) {
        this.latestFilingYear = latestFilingYear;
    }

    public int getLatestFormType() {
        return latestFormType;
    }

    public void setLatestFormType(int latestFormType) {
        this.latestFormType = latestFormType;
    }

    public int getSubsectionCode() {
        return subsectionCode;
    }

    public void setSubsectionCode(int subsectionCode) {
        this.subsectionCode = subsectionCode;
    }

    public String getIrsLegalStatus() {
        return irsLegalStatus;
    }

    public void setIrsLegalStatus(String irsLegalStatus) {
        this.irsLegalStatus = irsLegalStatus;
    }

    public String getLatestFormTypeFiled() {
        return latestFormTypeFiled;
    }

    public void setLatestFormTypeFiled(String latestFormTypeFiled) {
        this.latestFormTypeFiled = latestFormTypeFiled;
    }
}

public static class NonprofitMetadata {
    private String nonprofitId;
    private String description;
    private String dba;
    private String phoneNumber;
    private String mission;
    private String vision;
    private boolean hasFiscalSponsor;
    private FiscalSponsor fiscalSponsor;
    private String orgEmail;
    private String organizationLogo;
    private Address headquarters;
    private Address mailingAddress;
    private String website;
    private String facebook;
    private String twitter;
    private String instagram;
    private String linkedIn;
    private String guidestarProfile;
    private String legalStatus;
    private String foundingDate;
    private NonprofitAdditionalInfo other;
    private String irsDeterminationLetter;
    private OfacFlags ofacFlags;
    private boolean dbaSame;
    private boolean mailingAddressSame;
    public enum IrsRecipientStatus {
        PF,
        POF,
        EOF,
        PC,
        GOV,
        SO_DP,
        SO_I,
        SO_II,
        SO_III_FI,
        SO_III_NFI,
        TPS,
        NC,
        I,
    }
    private IrsRecipientStatus irsRecipientStatus;

    public NonprofitMetadata() {}

    public NonprofitMetadata(String nonprofitId, String description, String dba, String phoneNumber, String mission, String vision, boolean hasFiscalSponsor, FiscalSponsor fiscalSponsor, String orgEmail, String organizationLogo, Address headquarters, Address mailingAddress, String website, String facebook, String twitter, String instagram, String linkedIn, String guidestarProfile, String legalStatus, String foundingDate, NonprofitAdditionalInfo other, String irsDeterminationLetter, OfacFlags ofacFlags, boolean dbaSame, boolean mailingAddressSame, IrsRecipientStatus irsRecipientStatus) {
        this.nonprofitId = nonprofitId;
        this.description = description;
        this.dba = dba;
        this.phoneNumber = phoneNumber;
        this.mission = mission;
        this.vision = vision;
        this.hasFiscalSponsor = hasFiscalSponsor;
        this.fiscalSponsor = fiscalSponsor;
        this.orgEmail = orgEmail;
        this.organizationLogo = organizationLogo;
        this.headquarters = headquarters;
        this.mailingAddress = mailingAddress;
        this.website = website;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedIn = linkedIn;
        this.guidestarProfile = guidestarProfile;
        this.legalStatus = legalStatus;
        this.foundingDate = foundingDate;
        this.other = other;
        this.irsDeterminationLetter = irsDeterminationLetter;
        this.ofacFlags = ofacFlags;
        this.dbaSame = dbaSame;
        this.mailingAddressSame = mailingAddressSame;
        this.irsRecipientStatus = irsRecipientStatus;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDba() {
        return dba;
    }

    public void setDba(String dba) {
        this.dba = dba;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public boolean getHasFiscalSponsor() {
        return hasFiscalSponsor;
    }

    public void setHasFiscalSponsor(boolean hasFiscalSponsor) {
        this.hasFiscalSponsor = hasFiscalSponsor;
    }

    public FiscalSponsor getFiscalSponsor() {
        return fiscalSponsor;
    }

    public void setFiscalSponsor(FiscalSponsor fiscalSponsor) {
        this.fiscalSponsor = fiscalSponsor;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrganizationLogo() {
        return organizationLogo;
    }

    public void setOrganizationLogo(String organizationLogo) {
        this.organizationLogo = organizationLogo;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Address headquarters) {
        this.headquarters = headquarters;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGuidestarProfile() {
        return guidestarProfile;
    }

    public void setGuidestarProfile(String guidestarProfile) {
        this.guidestarProfile = guidestarProfile;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public NonprofitAdditionalInfo getOther() {
        return other;
    }

    public void setOther(NonprofitAdditionalInfo other) {
        this.other = other;
    }

    public String getIrsDeterminationLetter() {
        return irsDeterminationLetter;
    }

    public void setIrsDeterminationLetter(String irsDeterminationLetter) {
        this.irsDeterminationLetter = irsDeterminationLetter;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getDbaSame() {
        return dbaSame;
    }

    public void setDbaSame(boolean dbaSame) {
        this.dbaSame = dbaSame;
    }

    public boolean getMailingAddressSame() {
        return mailingAddressSame;
    }

    public void setMailingAddressSame(boolean mailingAddressSame) {
        this.mailingAddressSame = mailingAddressSame;
    }

    public IrsRecipientStatus getIrsRecipientStatus() {
        return irsRecipientStatus;
    }

    public void setIrsRecipientStatus(IrsRecipientStatus irsRecipientStatus) {
        this.irsRecipientStatus = irsRecipientStatus;
    }
}

public static class OfacFlags {
    private List<OfacSdn> sdn;
    private String flaggedAt;
    private String resolvedAt;

    public OfacFlags() {}

    public OfacFlags(List<OfacSdn> sdn, String flaggedAt, String resolvedAt) {
        this.sdn = sdn;
        this.flaggedAt = flaggedAt;
        this.resolvedAt = resolvedAt;
    }

    public List<OfacSdn> getSdn() {
        return sdn;
    }

    public void setSdn(List<OfacSdn> sdn) {
        this.sdn = sdn;
    }

    public String getFlaggedAt() {
        return flaggedAt;
    }

    public void setFlaggedAt(String flaggedAt) {
        this.flaggedAt = flaggedAt;
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }
}

public static class OfacSdn {
    private String reason;
    private int score;
    private List<String> names;
    private List<String> aka;
    private List<String> emails;
    private String id;
    private String type;
    private List<String> programs;
    private String list;

    public OfacSdn() {}

    public OfacSdn(String reason, int score, List<String> names, List<String> aka, List<String> emails, String id, String type, List<String> programs, String list) {
        this.reason = reason;
        this.score = score;
        this.names = names;
        this.aka = aka;
        this.emails = emails;
        this.id = id;
        this.type = type;
        this.programs = programs;
        this.list = list;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<String> getAka() {
        return aka;
    }

    public void setAka(List<String> aka) {
        this.aka = aka;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getPrograms() {
        return programs;
    }

    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}

public static class PlaidData {
    private String accessToken;
    private String itemId;
    private String created;
    private String selectedAccountId;

    public PlaidData() {}

    public PlaidData(String accessToken, String itemId, String created, String selectedAccountId) {
        this.accessToken = accessToken;
        this.itemId = itemId;
        this.created = created;
        this.selectedAccountId = selectedAccountId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSelectedAccountId() {
        return selectedAccountId;
    }

    public void setSelectedAccountId(String selectedAccountId) {
        this.selectedAccountId = selectedAccountId;
    }
}

public static class DeleteFileInfo {
    public enum DeleteFileSource {
        SUBMISSION_ADDITIONAL_FILES,
        SUBMISSION_RESPONSES,
        TASK_RESPONSES,
        SIGNATURES,
        PAYMENT_DETAILS,
        USER_UPLOAD,
    }
    private DeleteFileSource deleteFileSource;
    private String deleteFileId;

    public DeleteFileInfo() {}

    public DeleteFileInfo(DeleteFileSource deleteFileSource, String deleteFileId) {
        this.deleteFileSource = deleteFileSource;
        this.deleteFileId = deleteFileId;
    }

    public DeleteFileSource getDeleteFileSource() {
        return deleteFileSource;
    }

    public void setDeleteFileSource(DeleteFileSource deleteFileSource) {
        this.deleteFileSource = deleteFileSource;
    }

    public String getDeleteFileId() {
        return deleteFileId;
    }

    public void setDeleteFileId(String deleteFileId) {
        this.deleteFileId = deleteFileId;
    }
}

public static class Foundation {
    private String id;
    private String displayName;
    private String ein;
    private String subdomain;
    private String created;
    private PresignedFile logoFile;
    private boolean granteeMFAEnabled;
    private boolean foundationMFAEnabled;

    public Foundation() {}

    public Foundation(String id, String displayName, String ein, String subdomain, String created, PresignedFile logoFile, boolean granteeMFAEnabled, boolean foundationMFAEnabled) {
        this.id = id;
        this.displayName = displayName;
        this.ein = ein;
        this.subdomain = subdomain;
        this.created = created;
        this.logoFile = logoFile;
        this.granteeMFAEnabled = granteeMFAEnabled;
        this.foundationMFAEnabled = foundationMFAEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public PresignedFile getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(PresignedFile logoFile) {
        this.logoFile = logoFile;
    }

    public boolean getGranteeMFAEnabled() {
        return granteeMFAEnabled;
    }

    public void setGranteeMFAEnabled(boolean granteeMFAEnabled) {
        this.granteeMFAEnabled = granteeMFAEnabled;
    }

    public boolean getFoundationMFAEnabled() {
        return foundationMFAEnabled;
    }

    public void setFoundationMFAEnabled(boolean foundationMFAEnabled) {
        this.foundationMFAEnabled = foundationMFAEnabled;
    }
}

public static class FoundationUser {
    private String id;
    private String foundationId;
    private String displayName;
    private String email;
    private String created;
    private String title;
    public enum Role {
        ADMIN,
        USER,
        PAYMENTS,
        BOARD_MEMBER,
    }
    private Role role;
    private boolean active;
    private String pronouns;
    private String suffix;
    private boolean sendEmail;

    public FoundationUser() {}

    public FoundationUser(String id, String foundationId, String displayName, String email, String created, String title, Role role, boolean active, String pronouns, String suffix, boolean sendEmail) {
        this.id = id;
        this.foundationId = foundationId;
        this.displayName = displayName;
        this.email = email;
        this.created = created;
        this.title = title;
        this.role = role;
        this.active = active;
        this.pronouns = pronouns;
        this.suffix = suffix;
        this.sendEmail = sendEmail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
}

public static class NonprofitUser {
    private String id;
    private String displayName;
    private String email;
    private boolean active;
    public enum TemelioRole {
        SUPERADMIN,
        ADMIN,
        USER,
    }
    private TemelioRole temelioRole;
    private String created;
    private String suffix;
    private String pronouns;
    private OfacFlags ofacFlags;
    private boolean mfaRequired;
    private UserFoundationRole foundationRoleMap;
    private UserNonprofitRole nonprofitRoleMap;
    private List<String> associatedFoundationsFromNonprofit;
    private String nonprofitId;
    private String title;
    public enum Role {
        ADMIN,
        USER,
    }
    private Role role;
    private boolean primaryContact;
    private boolean signatory;
    private String name;
    private boolean temelioSuperuser;
    private boolean temelioAdmin;
    private boolean hasAdminAccess;

    public NonprofitUser() {}

    public NonprofitUser(String id, String displayName, String email, boolean active, TemelioRole temelioRole, String created, String suffix, String pronouns, OfacFlags ofacFlags, boolean mfaRequired, UserFoundationRole foundationRoleMap, UserNonprofitRole nonprofitRoleMap, List<String> associatedFoundationsFromNonprofit, String nonprofitId, String title, Role role, boolean primaryContact, boolean signatory, String name, boolean temelioSuperuser, boolean temelioAdmin, boolean hasAdminAccess) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.active = active;
        this.temelioRole = temelioRole;
        this.created = created;
        this.suffix = suffix;
        this.pronouns = pronouns;
        this.ofacFlags = ofacFlags;
        this.mfaRequired = mfaRequired;
        this.foundationRoleMap = foundationRoleMap;
        this.nonprofitRoleMap = nonprofitRoleMap;
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
        this.nonprofitId = nonprofitId;
        this.title = title;
        this.role = role;
        this.primaryContact = primaryContact;
        this.signatory = signatory;
        this.name = name;
        this.temelioSuperuser = temelioSuperuser;
        this.temelioAdmin = temelioAdmin;
        this.hasAdminAccess = hasAdminAccess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TemelioRole getTemelioRole() {
        return temelioRole;
    }

    public void setTemelioRole(TemelioRole temelioRole) {
        this.temelioRole = temelioRole;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getMfaRequired() {
        return mfaRequired;
    }

    public void setMfaRequired(boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
    }

    public UserFoundationRole getFoundationRoleMap() {
        return foundationRoleMap;
    }

    public void setFoundationRoleMap(UserFoundationRole foundationRoleMap) {
        this.foundationRoleMap = foundationRoleMap;
    }

    public UserNonprofitRole getNonprofitRoleMap() {
        return nonprofitRoleMap;
    }

    public void setNonprofitRoleMap(UserNonprofitRole nonprofitRoleMap) {
        this.nonprofitRoleMap = nonprofitRoleMap;
    }

    public List<String> getAssociatedFoundationsFromNonprofit() {
        return associatedFoundationsFromNonprofit;
    }

    public void setAssociatedFoundationsFromNonprofit(List<String> associatedFoundationsFromNonprofit) {
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(boolean primaryContact) {
        this.primaryContact = primaryContact;
    }

    public boolean getSignatory() {
        return signatory;
    }

    public void setSignatory(boolean signatory) {
        this.signatory = signatory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getTemelioSuperuser() {
        return temelioSuperuser;
    }

    public void setTemelioSuperuser(boolean temelioSuperuser) {
        this.temelioSuperuser = temelioSuperuser;
    }

    public boolean getTemelioAdmin() {
        return temelioAdmin;
    }

    public void setTemelioAdmin(boolean temelioAdmin) {
        this.temelioAdmin = temelioAdmin;
    }

    public boolean getHasAdminAccess() {
        return hasAdminAccess;
    }

    public void setHasAdminAccess(boolean hasAdminAccess) {
        this.hasAdminAccess = hasAdminAccess;
    }
}

public static class PresignedFile {
    private String url;
    private UploadedFile file;

    public PresignedFile() {}

    public PresignedFile(String url, UploadedFile file) {
        this.url = url;
        this.file = file;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
}

public static class UploadedFile {
    private String id;
    private String displayName;
    private String filePath;
    public enum FileViewPermission {
        FOUNDATION_ONLY,
        ALL,
    }
    private FileViewPermission fileViewPermission;
    private String folderId;
    public enum FolderType {
        SUBMISSION,
        USER_FOLDER,
    }
    private FolderType folderType;
    public enum FileSourceType {
        CRM,
        GRANT_APPLICATION,
        GRANT_FORM_PROPOSAL,
        TASK,
        SETTINGS,
    }
    private FileSourceType fileSourceType;
    private String fileSourceId;
    private String foundationId;
    private String nonprofitId;
    private String createdBy;
    private String updatedBy;
    private boolean active;
    private String created;
    private String updated;
    public enum FileType {
        FOLDER,
        FILE,
    }
    private FileType fileType;
    private String donorEntityId;
    private String submissionId;
    private int numberSubmissionForms;
    private List<UploadedFile> files;
    private boolean viewableToGrantee;
    private DeleteFileInfo deleteFileInfo;
    private FoundationUser createdByFoundationUser;
    private NonprofitUser createdByNonprofitUser;
    private FoundationUser updatedByFoundationUser;
    private boolean file;
    private boolean folder;
    private boolean grantFolder;
    private boolean deletable;

    public UploadedFile() {}

    public UploadedFile(String id, String displayName, String filePath, FileViewPermission fileViewPermission, String folderId, FolderType folderType, FileSourceType fileSourceType, String fileSourceId, String foundationId, String nonprofitId, String createdBy, String updatedBy, boolean active, String created, String updated, FileType fileType, String donorEntityId, String submissionId, int numberSubmissionForms, List<UploadedFile> files, boolean viewableToGrantee, DeleteFileInfo deleteFileInfo, FoundationUser createdByFoundationUser, NonprofitUser createdByNonprofitUser, FoundationUser updatedByFoundationUser, boolean file, boolean folder, boolean grantFolder, boolean deletable) {
        this.id = id;
        this.displayName = displayName;
        this.filePath = filePath;
        this.fileViewPermission = fileViewPermission;
        this.folderId = folderId;
        this.folderType = folderType;
        this.fileSourceType = fileSourceType;
        this.fileSourceId = fileSourceId;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.active = active;
        this.created = created;
        this.updated = updated;
        this.fileType = fileType;
        this.donorEntityId = donorEntityId;
        this.submissionId = submissionId;
        this.numberSubmissionForms = numberSubmissionForms;
        this.files = files;
        this.viewableToGrantee = viewableToGrantee;
        this.deleteFileInfo = deleteFileInfo;
        this.createdByFoundationUser = createdByFoundationUser;
        this.createdByNonprofitUser = createdByNonprofitUser;
        this.updatedByFoundationUser = updatedByFoundationUser;
        this.file = file;
        this.folder = folder;
        this.grantFolder = grantFolder;
        this.deletable = deletable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FileViewPermission getFileViewPermission() {
        return fileViewPermission;
    }

    public void setFileViewPermission(FileViewPermission fileViewPermission) {
        this.fileViewPermission = fileViewPermission;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public FolderType getFolderType() {
        return folderType;
    }

    public void setFolderType(FolderType folderType) {
        this.folderType = folderType;
    }

    public FileSourceType getFileSourceType() {
        return fileSourceType;
    }

    public void setFileSourceType(FileSourceType fileSourceType) {
        this.fileSourceType = fileSourceType;
    }

    public String getFileSourceId() {
        return fileSourceId;
    }

    public void setFileSourceId(String fileSourceId) {
        this.fileSourceId = fileSourceId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public String getDonorEntityId() {
        return donorEntityId;
    }

    public void setDonorEntityId(String donorEntityId) {
        this.donorEntityId = donorEntityId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public int getNumberSubmissionForms() {
        return numberSubmissionForms;
    }

    public void setNumberSubmissionForms(int numberSubmissionForms) {
        this.numberSubmissionForms = numberSubmissionForms;
    }

    public List<UploadedFile> getFiles() {
        return files;
    }

    public void setFiles(List<UploadedFile> files) {
        this.files = files;
    }

    public boolean getViewableToGrantee() {
        return viewableToGrantee;
    }

    public void setViewableToGrantee(boolean viewableToGrantee) {
        this.viewableToGrantee = viewableToGrantee;
    }

    public DeleteFileInfo getDeleteFileInfo() {
        return deleteFileInfo;
    }

    public void setDeleteFileInfo(DeleteFileInfo deleteFileInfo) {
        this.deleteFileInfo = deleteFileInfo;
    }

    public FoundationUser getCreatedByFoundationUser() {
        return createdByFoundationUser;
    }

    public void setCreatedByFoundationUser(FoundationUser createdByFoundationUser) {
        this.createdByFoundationUser = createdByFoundationUser;
    }

    public NonprofitUser getCreatedByNonprofitUser() {
        return createdByNonprofitUser;
    }

    public void setCreatedByNonprofitUser(NonprofitUser createdByNonprofitUser) {
        this.createdByNonprofitUser = createdByNonprofitUser;
    }

    public FoundationUser getUpdatedByFoundationUser() {
        return updatedByFoundationUser;
    }

    public void setUpdatedByFoundationUser(FoundationUser updatedByFoundationUser) {
        this.updatedByFoundationUser = updatedByFoundationUser;
    }

    public boolean getFile() {
        return file;
    }

    public void setFile(boolean file) {
        this.file = file;
    }

    public boolean getFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public boolean getGrantFolder() {
        return grantFolder;
    }

    public void setGrantFolder(boolean grantFolder) {
        this.grantFolder = grantFolder;
    }

    public boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }
}

public static class UserFoundationRole {
    private String userId;
    private String foundationId;
    private String title;
    public enum Role {
        ADMIN,
        USER,
        PAYMENTS,
        BOARD_MEMBER,
    }
    private Role role;
    private boolean active;
    private String created;
    private String updated;
    private boolean sendEmail;

    public UserFoundationRole() {}

    public UserFoundationRole(String userId, String foundationId, String title, Role role, boolean active, String created, String updated, boolean sendEmail) {
        this.userId = userId;
        this.foundationId = foundationId;
        this.title = title;
        this.role = role;
        this.active = active;
        this.created = created;
        this.updated = updated;
        this.sendEmail = sendEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
}

public static class UserNonprofitRole {
    private String userId;
    private String nonprofitId;
    private String title;
    private boolean primaryContact;
    public enum Role {
        ADMIN,
        USER,
    }
    private Role role;
    private boolean active;
    private String created;
    private String updated;
    private boolean sendEmail;
    private boolean signatory;

    public UserNonprofitRole() {}

    public UserNonprofitRole(String userId, String nonprofitId, String title, boolean primaryContact, Role role, boolean active, String created, String updated, boolean sendEmail, boolean signatory) {
        this.userId = userId;
        this.nonprofitId = nonprofitId;
        this.title = title;
        this.primaryContact = primaryContact;
        this.role = role;
        this.active = active;
        this.created = created;
        this.updated = updated;
        this.sendEmail = sendEmail;
        this.signatory = signatory;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(boolean primaryContact) {
        this.primaryContact = primaryContact;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean getSignatory() {
        return signatory;
    }

    public void setSignatory(boolean signatory) {
        this.signatory = signatory;
    }
}

public static class AppUser {
    private String id;
    private String displayName;
    private String email;
    private boolean active;
    public enum TemelioRole {
        SUPERADMIN,
        ADMIN,
        USER,
    }
    private TemelioRole temelioRole;
    private String created;
    private String suffix;
    private String pronouns;
    private OfacFlags ofacFlags;
    private boolean mfaRequired;
    private UserFoundationRole foundationRoleMap;
    private UserNonprofitRole nonprofitRoleMap;
    private List<String> associatedFoundationsFromNonprofit;
    private String name;
    private boolean temelioSuperuser;
    private boolean temelioAdmin;
    private boolean hasAdminAccess;

    public AppUser() {}

    public AppUser(String id, String displayName, String email, boolean active, TemelioRole temelioRole, String created, String suffix, String pronouns, OfacFlags ofacFlags, boolean mfaRequired, UserFoundationRole foundationRoleMap, UserNonprofitRole nonprofitRoleMap, List<String> associatedFoundationsFromNonprofit, String name, boolean temelioSuperuser, boolean temelioAdmin, boolean hasAdminAccess) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.active = active;
        this.temelioRole = temelioRole;
        this.created = created;
        this.suffix = suffix;
        this.pronouns = pronouns;
        this.ofacFlags = ofacFlags;
        this.mfaRequired = mfaRequired;
        this.foundationRoleMap = foundationRoleMap;
        this.nonprofitRoleMap = nonprofitRoleMap;
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
        this.name = name;
        this.temelioSuperuser = temelioSuperuser;
        this.temelioAdmin = temelioAdmin;
        this.hasAdminAccess = hasAdminAccess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TemelioRole getTemelioRole() {
        return temelioRole;
    }

    public void setTemelioRole(TemelioRole temelioRole) {
        this.temelioRole = temelioRole;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getMfaRequired() {
        return mfaRequired;
    }

    public void setMfaRequired(boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
    }

    public UserFoundationRole getFoundationRoleMap() {
        return foundationRoleMap;
    }

    public void setFoundationRoleMap(UserFoundationRole foundationRoleMap) {
        this.foundationRoleMap = foundationRoleMap;
    }

    public UserNonprofitRole getNonprofitRoleMap() {
        return nonprofitRoleMap;
    }

    public void setNonprofitRoleMap(UserNonprofitRole nonprofitRoleMap) {
        this.nonprofitRoleMap = nonprofitRoleMap;
    }

    public List<String> getAssociatedFoundationsFromNonprofit() {
        return associatedFoundationsFromNonprofit;
    }

    public void setAssociatedFoundationsFromNonprofit(List<String> associatedFoundationsFromNonprofit) {
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getTemelioSuperuser() {
        return temelioSuperuser;
    }

    public void setTemelioSuperuser(boolean temelioSuperuser) {
        this.temelioSuperuser = temelioSuperuser;
    }

    public boolean getTemelioAdmin() {
        return temelioAdmin;
    }

    public void setTemelioAdmin(boolean temelioAdmin) {
        this.temelioAdmin = temelioAdmin;
    }

    public boolean getHasAdminAccess() {
        return hasAdminAccess;
    }

    public void setHasAdminAccess(boolean hasAdminAccess) {
        this.hasAdminAccess = hasAdminAccess;
    }
}

public static class NylasSyncRequest {
    private String startDate;
    private List<String> userIds;

    public NylasSyncRequest() {}

    public NylasSyncRequest(String startDate, List<String> userIds) {
        this.startDate = startDate;
        this.userIds = userIds;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
}

public static class AdditionalContact {
    private String displayName;
    private String email;
    private boolean primaryContact;
    private String phoneNumber;
    private String title;
    private String startDate;
    private String endDate;
    private boolean inactive;

    public AdditionalContact() {}

    public AdditionalContact(String displayName, String email, boolean primaryContact, String phoneNumber, String title, String startDate, String endDate, boolean inactive) {
        this.displayName = displayName;
        this.email = email;
        this.primaryContact = primaryContact;
        this.phoneNumber = phoneNumber;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.inactive = inactive;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(boolean primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean getInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }
}

public static class FoundationNonprofitInteraction {
    private String foundationId;
    private String nonprofitId;
    private String foundationPOC;
    private Object customFields;
    private InteractionAdditionalInfo additionalInfo;
    private String created;

    public FoundationNonprofitInteraction() {}

    public FoundationNonprofitInteraction(String foundationId, String nonprofitId, String foundationPOC, Object customFields, InteractionAdditionalInfo additionalInfo, String created) {
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.foundationPOC = foundationPOC;
        this.customFields = customFields;
        this.additionalInfo = additionalInfo;
        this.created = created;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getFoundationPOC() {
        return foundationPOC;
    }

    public void setFoundationPOC(String foundationPOC) {
        this.foundationPOC = foundationPOC;
    }

    public Object getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Object customFields) {
        this.customFields = customFields;
    }

    public InteractionAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(InteractionAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}

public static class IRS990Details {
    private String conflictOfInterest;

    public IRS990Details() {}

    public IRS990Details(String conflictOfInterest) {
        this.conflictOfInterest = conflictOfInterest;
    }

    public String getConflictOfInterest() {
        return conflictOfInterest;
    }

    public void setConflictOfInterest(String conflictOfInterest) {
        this.conflictOfInterest = conflictOfInterest;
    }
}

public static class InteractionAdditionalInfo {
    private List<AdditionalContact> additionalContacts;
    private QBVendorDetails qbVendorDetails;
    private List<String> organizationTags;
    private IRS990Details irs990Details;

    public InteractionAdditionalInfo() {}

    public InteractionAdditionalInfo(List<AdditionalContact> additionalContacts, QBVendorDetails qbVendorDetails, List<String> organizationTags, IRS990Details irs990Details) {
        this.additionalContacts = additionalContacts;
        this.qbVendorDetails = qbVendorDetails;
        this.organizationTags = organizationTags;
        this.irs990Details = irs990Details;
    }

    public List<AdditionalContact> getAdditionalContacts() {
        return additionalContacts;
    }

    public void setAdditionalContacts(List<AdditionalContact> additionalContacts) {
        this.additionalContacts = additionalContacts;
    }

    public QBVendorDetails getQbVendorDetails() {
        return qbVendorDetails;
    }

    public void setQbVendorDetails(QBVendorDetails qbVendorDetails) {
        this.qbVendorDetails = qbVendorDetails;
    }

    public List<String> getOrganizationTags() {
        return organizationTags;
    }

    public void setOrganizationTags(List<String> organizationTags) {
        this.organizationTags = organizationTags;
    }

    public IRS990Details getIrs990Details() {
        return irs990Details;
    }

    public void setIrs990Details(IRS990Details irs990Details) {
        this.irs990Details = irs990Details;
    }
}

public static class QBVendorDetails {
    private String id;

    public QBVendorDetails() {}

    public QBVendorDetails(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public static class AnvilPDFAdditionalInfo {
    private String pdfKey;
    public enum PdfType {
        PAYMENT_INFO,
    }
    private PdfType pdfType;
    private List<AnvilPDFField> fields;

    public AnvilPDFAdditionalInfo() {}

    public AnvilPDFAdditionalInfo(String pdfKey, PdfType pdfType, List<AnvilPDFField> fields) {
        this.pdfKey = pdfKey;
        this.pdfType = pdfType;
        this.fields = fields;
    }

    public String getPdfKey() {
        return pdfKey;
    }

    public void setPdfKey(String pdfKey) {
        this.pdfKey = pdfKey;
    }

    public PdfType getPdfType() {
        return pdfType;
    }

    public void setPdfType(PdfType pdfType) {
        this.pdfType = pdfType;
    }

    public List<AnvilPDFField> getFields() {
        return fields;
    }

    public void setFields(List<AnvilPDFField> fields) {
        this.fields = fields;
    }
}

public static class AnvilPDFField {
    private String id;
    private String displayName;
    public enum Type {
        SHORT_TEXT,
        DATE,
    }
    private Type type;

    public AnvilPDFField() {}

    public AnvilPDFField(String id, String displayName, Type type) {
        this.id = id;
        this.displayName = displayName;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

public static class Budget {
    private String lastUpdateById;
    private String lastUpdateByName;
    private String lastUpdatedAt;
    private List<BudgetAllocation> allocations;
    private double yearly;

    public Budget() {}

    public Budget(String lastUpdateById, String lastUpdateByName, String lastUpdatedAt, List<BudgetAllocation> allocations, double yearly) {
        this.lastUpdateById = lastUpdateById;
        this.lastUpdateByName = lastUpdateByName;
        this.lastUpdatedAt = lastUpdatedAt;
        this.allocations = allocations;
        this.yearly = yearly;
    }

    public String getLastUpdateById() {
        return lastUpdateById;
    }

    public void setLastUpdateById(String lastUpdateById) {
        this.lastUpdateById = lastUpdateById;
    }

    public String getLastUpdateByName() {
        return lastUpdateByName;
    }

    public void setLastUpdateByName(String lastUpdateByName) {
        this.lastUpdateByName = lastUpdateByName;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public List<BudgetAllocation> getAllocations() {
        return allocations;
    }

    public void setAllocations(List<BudgetAllocation> allocations) {
        this.allocations = allocations;
    }

    public double getYearly() {
        return yearly;
    }

    public void setYearly(double yearly) {
        this.yearly = yearly;
    }
}

public static class BudgetAllocation {
    private String id;
    private String name;
    private double amount;

    public BudgetAllocation() {}

    public BudgetAllocation(String id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public static class CRMConfiguration {
    private Object nonprofitEntityTypeMap;

    public CRMConfiguration() {}

    public CRMConfiguration(Object nonprofitEntityTypeMap) {
        this.nonprofitEntityTypeMap = nonprofitEntityTypeMap;
    }

    public Object getNonprofitEntityTypeMap() {
        return nonprofitEntityTypeMap;
    }

    public void setNonprofitEntityTypeMap(Object nonprofitEntityTypeMap) {
        this.nonprofitEntityTypeMap = nonprofitEntityTypeMap;
    }
}

public static class CRMConfigurationField {
    public enum FieldType {
        DBA,
        PHONE_NUMBER,
        TEAM,
        SIGNATORY,
        ADDITIONAL_CONTACTS,
        MISSION,
        VISION,
        DESCRIPTION,
        EIN,
        FISCAL_SPONSOR,
        ENTITY_EMAIL,
        ENTITY_WEBSITE,
        TOTAL_AWARDED,
        WEBSITE,
        FOUNDATION_PRIMARY_CONTACT,
        HEADQUARTERS_ADDRESS,
        MAILING_ADDRESS,
        TAGS,
        FACEBOOK,
        TWITTER,
        INSTAGRAM,
        LINKEDIN,
        GUIDESTAR,
        LEGAL_STATUS,
        FOUNDING_DATE,
        STATUS,
        LOGO,
        IRS_DETERMINATION_LETTER,
        IRS_DATA,
        IRS_RECIPIENT_STATUS,
        CONFLICT_OF_INTEREST,
        CUSTOM,
    }
    private FieldType fieldType;
    private String displayName;
    private FoundationCRMField customCRMField;
    private CRMExternalConfigProperty crmExternalConfigProperty;

    public CRMConfigurationField() {}

    public CRMConfigurationField(FieldType fieldType, String displayName, FoundationCRMField customCRMField, CRMExternalConfigProperty crmExternalConfigProperty) {
        this.fieldType = fieldType;
        this.displayName = displayName;
        this.customCRMField = customCRMField;
        this.crmExternalConfigProperty = crmExternalConfigProperty;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FoundationCRMField getCustomCRMField() {
        return customCRMField;
    }

    public void setCustomCRMField(FoundationCRMField customCRMField) {
        this.customCRMField = customCRMField;
    }

    public CRMExternalConfigProperty getCrmExternalConfigProperty() {
        return crmExternalConfigProperty;
    }

    public void setCrmExternalConfigProperty(CRMExternalConfigProperty crmExternalConfigProperty) {
        this.crmExternalConfigProperty = crmExternalConfigProperty;
    }
}

public static class CRMExternalConfigProperty {
    private boolean disableForExternalReviewer;

    public CRMExternalConfigProperty() {}

    public CRMExternalConfigProperty(boolean disableForExternalReviewer) {
        this.disableForExternalReviewer = disableForExternalReviewer;
    }

    public boolean getDisableForExternalReviewer() {
        return disableForExternalReviewer;
    }

    public void setDisableForExternalReviewer(boolean disableForExternalReviewer) {
        this.disableForExternalReviewer = disableForExternalReviewer;
    }
}

public static class ConfigurationSettings {
    private String logoFile;
    private String color;
    private String landingPage;
    private List<Pipeline> pipelines;
    private String bannerFile;
    private FoundationMailSettings mailSettings;
    private FoundationQuickbooksSetting quickbooksSetting;
    private String replyTo;
    private String defaultPipelineName;
    private String senderEmail;
    private CRMConfiguration crmConfiguration;
    private MetabaseConfiguration metabaseConfiguration;
    private GrantTypeConfiguration grantTypeConfiguration;
    private MailChimpFoundationConfiguration mailChimpConfiguration;
    private GranteeProfileUpdateConfiguration granteeProfileUpdateConfiguration;
    private ExternalReviewerConfiguration externalReviewerConfiguration;
    private FoundationSalesforceConfiguration salesforceConfiguration;
    private boolean granteeMFAEnabled;
    private boolean foundationMFAEnabled;

    public ConfigurationSettings() {}

    public ConfigurationSettings(String logoFile, String color, String landingPage, List<Pipeline> pipelines, String bannerFile, FoundationMailSettings mailSettings, FoundationQuickbooksSetting quickbooksSetting, String replyTo, String defaultPipelineName, String senderEmail, CRMConfiguration crmConfiguration, MetabaseConfiguration metabaseConfiguration, GrantTypeConfiguration grantTypeConfiguration, MailChimpFoundationConfiguration mailChimpConfiguration, GranteeProfileUpdateConfiguration granteeProfileUpdateConfiguration, ExternalReviewerConfiguration externalReviewerConfiguration, FoundationSalesforceConfiguration salesforceConfiguration, boolean granteeMFAEnabled, boolean foundationMFAEnabled) {
        this.logoFile = logoFile;
        this.color = color;
        this.landingPage = landingPage;
        this.pipelines = pipelines;
        this.bannerFile = bannerFile;
        this.mailSettings = mailSettings;
        this.quickbooksSetting = quickbooksSetting;
        this.replyTo = replyTo;
        this.defaultPipelineName = defaultPipelineName;
        this.senderEmail = senderEmail;
        this.crmConfiguration = crmConfiguration;
        this.metabaseConfiguration = metabaseConfiguration;
        this.grantTypeConfiguration = grantTypeConfiguration;
        this.mailChimpConfiguration = mailChimpConfiguration;
        this.granteeProfileUpdateConfiguration = granteeProfileUpdateConfiguration;
        this.externalReviewerConfiguration = externalReviewerConfiguration;
        this.salesforceConfiguration = salesforceConfiguration;
        this.granteeMFAEnabled = granteeMFAEnabled;
        this.foundationMFAEnabled = foundationMFAEnabled;
    }

    public String getLogoFile() {
        return logoFile;
    }

    public void setLogoFile(String logoFile) {
        this.logoFile = logoFile;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

    public List<Pipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<Pipeline> pipelines) {
        this.pipelines = pipelines;
    }

    public String getBannerFile() {
        return bannerFile;
    }

    public void setBannerFile(String bannerFile) {
        this.bannerFile = bannerFile;
    }

    public FoundationMailSettings getMailSettings() {
        return mailSettings;
    }

    public void setMailSettings(FoundationMailSettings mailSettings) {
        this.mailSettings = mailSettings;
    }

    public FoundationQuickbooksSetting getQuickbooksSetting() {
        return quickbooksSetting;
    }

    public void setQuickbooksSetting(FoundationQuickbooksSetting quickbooksSetting) {
        this.quickbooksSetting = quickbooksSetting;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getDefaultPipelineName() {
        return defaultPipelineName;
    }

    public void setDefaultPipelineName(String defaultPipelineName) {
        this.defaultPipelineName = defaultPipelineName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public CRMConfiguration getCrmConfiguration() {
        return crmConfiguration;
    }

    public void setCrmConfiguration(CRMConfiguration crmConfiguration) {
        this.crmConfiguration = crmConfiguration;
    }

    public MetabaseConfiguration getMetabaseConfiguration() {
        return metabaseConfiguration;
    }

    public void setMetabaseConfiguration(MetabaseConfiguration metabaseConfiguration) {
        this.metabaseConfiguration = metabaseConfiguration;
    }

    public GrantTypeConfiguration getGrantTypeConfiguration() {
        return grantTypeConfiguration;
    }

    public void setGrantTypeConfiguration(GrantTypeConfiguration grantTypeConfiguration) {
        this.grantTypeConfiguration = grantTypeConfiguration;
    }

    public MailChimpFoundationConfiguration getMailChimpConfiguration() {
        return mailChimpConfiguration;
    }

    public void setMailChimpConfiguration(MailChimpFoundationConfiguration mailChimpConfiguration) {
        this.mailChimpConfiguration = mailChimpConfiguration;
    }

    public GranteeProfileUpdateConfiguration getGranteeProfileUpdateConfiguration() {
        return granteeProfileUpdateConfiguration;
    }

    public void setGranteeProfileUpdateConfiguration(GranteeProfileUpdateConfiguration granteeProfileUpdateConfiguration) {
        this.granteeProfileUpdateConfiguration = granteeProfileUpdateConfiguration;
    }

    public ExternalReviewerConfiguration getExternalReviewerConfiguration() {
        return externalReviewerConfiguration;
    }

    public void setExternalReviewerConfiguration(ExternalReviewerConfiguration externalReviewerConfiguration) {
        this.externalReviewerConfiguration = externalReviewerConfiguration;
    }

    public FoundationSalesforceConfiguration getSalesforceConfiguration() {
        return salesforceConfiguration;
    }

    public void setSalesforceConfiguration(FoundationSalesforceConfiguration salesforceConfiguration) {
        this.salesforceConfiguration = salesforceConfiguration;
    }

    public boolean getGranteeMFAEnabled() {
        return granteeMFAEnabled;
    }

    public void setGranteeMFAEnabled(boolean granteeMFAEnabled) {
        this.granteeMFAEnabled = granteeMFAEnabled;
    }

    public boolean getFoundationMFAEnabled() {
        return foundationMFAEnabled;
    }

    public void setFoundationMFAEnabled(boolean foundationMFAEnabled) {
        this.foundationMFAEnabled = foundationMFAEnabled;
    }
}

public static class CustomEmailTemplate {
    public enum CustomEmailTemplateType {
        REQUEST_TO_COMPLETE_PROPOSAL,
        FOUNDATION_ADD_USER_TO_NONPROFIT,
        REQUEST_TO_COMPLETE_REPORT,
        STAGE_CHANGE_MESSAGE,
        EXTERNAL_REVIEWER,
        TASK_COMMENT_MENTION,
        TASK_COMMENT_ADDED,
        BULK_EXTERNAL_REVIEWER,
        TASK_REMINDER,
    }
    private CustomEmailTemplateType customEmailTemplateType;
    private String subjectText;
    private String messageText;
    private String ccEmail;
    private String stageName;
    private String pipelineId;
    private String replyTo;

    public CustomEmailTemplate() {}

    public CustomEmailTemplate(CustomEmailTemplateType customEmailTemplateType, String subjectText, String messageText, String ccEmail, String stageName, String pipelineId, String replyTo) {
        this.customEmailTemplateType = customEmailTemplateType;
        this.subjectText = subjectText;
        this.messageText = messageText;
        this.ccEmail = ccEmail;
        this.stageName = stageName;
        this.pipelineId = pipelineId;
        this.replyTo = replyTo;
    }

    public CustomEmailTemplateType getCustomEmailTemplateType() {
        return customEmailTemplateType;
    }

    public void setCustomEmailTemplateType(CustomEmailTemplateType customEmailTemplateType) {
        this.customEmailTemplateType = customEmailTemplateType;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }
}

public static class CustomGrantType {
    private String id;
    private String name;
    private boolean active;

    public CustomGrantType() {}

    public CustomGrantType(String id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public static class DefaultDateSetting {
    public enum TimeUnit {
        DAYS,
        WEEKS,
        MONTHS,
        YEARS,
    }
    private TimeUnit timeUnit;
    private int quantity;

    public DefaultDateSetting() {}

    public DefaultDateSetting(TimeUnit timeUnit, int quantity) {
        this.timeUnit = timeUnit;
        this.quantity = quantity;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public static class DisplayCondition {
    private String id;
    private String comparatorId;
    public enum Comparator {
        EQUALS,
        NOT_EQUALS,
        CONTAINS,
        NOT_CONTAINS,
    }
    private Comparator comparator;
    private String comparisonValue;

    public DisplayCondition() {}

    public DisplayCondition(String id, String comparatorId, Comparator comparator, String comparisonValue) {
        this.id = id;
        this.comparatorId = comparatorId;
        this.comparator = comparator;
        this.comparisonValue = comparisonValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComparatorId() {
        return comparatorId;
    }

    public void setComparatorId(String comparatorId) {
        this.comparatorId = comparatorId;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public String getComparisonValue() {
        return comparisonValue;
    }

    public void setComparisonValue(String comparisonValue) {
        this.comparisonValue = comparisonValue;
    }
}

public static class DocumentItem {
    public enum Type {
        GRANTEE_CRM_DATA,
        GRANTEE_CRM_CUSTOM_FIELD,
        SUBMISSION_RESPONSE,
        SUBMISSION_METADATA,
        FORM_FIELDS,
        CUSTOM,
        AVG_TASK_RESPONSE,
    }
    private Type type;
    private String key;
    private String displayName;
    private String formName;
    public enum FormComponentType {
        FILE_UPLOAD,
        FILE_DOWNLOAD,
        SINGLE_RESPONSE,
        MULTI_RESPONSE,
        DROPDOWN_LIST,
        MULTI_DROPDOWN_LIST,
        RATING,
        TEXT,
        SHORT_TEXT,
        FOUNDATION_USER,
        TABLE,
        NUMBER,
        DATE,
        BUDGET_CATEGORY,
        REPORT_TEMPLATE,
        YES_NO_CHECKBOX,
        ORG_LEGAL_NAME,
        ORG_DBA,
        ORG_LEGAL_STATUS,
        ORG_EIN,
        ORG_HQ,
        ORG_HQ_ADDRESS_1,
        ORG_HQ_ADDRESS_2,
        ORG_HQ_CITY,
        ORG_HQ_STATE,
        ORG_HQ_ZIPCODE,
        ORG_HQ_COUNTRY,
        ORG_MAILING_ADDR,
        ORG_MAILING_ADDRESS_1,
        ORG_MAILING_ADDRESS_2,
        ORG_MAILING_CITY,
        ORG_MAILING_STATE,
        ORG_MAILING_ZIPCODE,
        ORG_MAILING_COUNTRY,
        ORG_PHONE_NUMBER,
        ORG_EMAIL,
        ORG_WEBSITE,
        ORG_FISCAL_SPONSOR,
        ORG_HAS_FISCAL_SPONSOR,
        ORG_FISCAL_SPONSOR_NAME,
        ORG_FISCAL_SPONSOR_EIN,
        ORG_FISCAL_SPONSOR_ADDRESS,
        ORG_MISSION,
        ORG_VISION,
        ORG_DEI,
        ORG_FOUNDED_YEAR,
        ORG_EMP_FULL_TIME,
        ORG_EMP_PART_TIME,
        ORG_PRIMARY_CONTACT,
        ORG_PRIMARY_CONTACT_NAME,
        ORG_PRIMARY_CONTACT_EMAIL,
        ORG_PROJECT_DIRECTOR,
        ORG_PROJECT_DIRECTOR_NAME,
        ORG_PROJECT_DIRECTOR_EMAIL,
        ORG_EXECUTIVE,
        ORG_EXECUTIVE_NAME,
        ORG_EXECUTIVE_EMAIL,
        ORG_BUDGET,
        ORG_BUDGET_REVENUE,
        ORG_BUDGET_EXPENDITURES,
        ORG_SOCIAL,
        ORG_SOCIAL_FACEBOOK,
        ORG_SOCIAL_INSTAGRAM,
        ORG_SOCIAL_TWITTER,
        ORG_SOCIAL_LINKEDIN,
        ORG_SOCIAL_GUIDESTAR,
        GRANT_AMOUNT_REQ,
        GRANT_TYPE,
        GRANT_PROJECT_TITLE,
        GRANT_PROJECT_BUDGET,
        GRANT_CO_FUNDING,
        GRANT_PERIOD,
        GRANT_PERIOD_START,
        GRANT_PERIOD_END,
        GRANT_PROP_TITLE,
        GRANT_RELEVANCY,
        GRANT_AREA,
        GRANT_AREA_CITY,
        GRANT_AREA_STATE,
        GRANT_AREA_COUNTRY,
        GRANT_POP_SERVED,
        PAGE_DIVIDER,
        TEXT_DESCRIPTION,
        FORMATTED_TEXT,
        CURRENCY,
        EXTERNAL_REFERENCES,
    }
    private FormComponentType formComponentType;

    public DocumentItem() {}

    public DocumentItem(Type type, String key, String displayName, String formName, FormComponentType formComponentType) {
        this.type = type;
        this.key = key;
        this.displayName = displayName;
        this.formName = formName;
        this.formComponentType = formComponentType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public FormComponentType getFormComponentType() {
        return formComponentType;
    }

    public void setFormComponentType(FormComponentType formComponentType) {
        this.formComponentType = formComponentType;
    }
}

public static class ExternalReviewerConfiguration {
    private ExternalReviewerTableConfiguration tableConfiguration;

    public ExternalReviewerConfiguration() {}

    public ExternalReviewerConfiguration(ExternalReviewerTableConfiguration tableConfiguration) {
        this.tableConfiguration = tableConfiguration;
    }

    public ExternalReviewerTableConfiguration getTableConfiguration() {
        return tableConfiguration;
    }

    public void setTableConfiguration(ExternalReviewerTableConfiguration tableConfiguration) {
        this.tableConfiguration = tableConfiguration;
    }
}

public static class ExternalReviewerTableConfiguration {
    private List<DocumentItem> visibleColumns;

    public ExternalReviewerTableConfiguration() {}

    public ExternalReviewerTableConfiguration(List<DocumentItem> visibleColumns) {
        this.visibleColumns = visibleColumns;
    }

    public List<DocumentItem> getVisibleColumns() {
        return visibleColumns;
    }

    public void setVisibleColumns(List<DocumentItem> visibleColumns) {
        this.visibleColumns = visibleColumns;
    }
}

public static class FeatureSet {
    private boolean docusignEnabled;
    private boolean landingPageEnabled;
    private boolean multiplePipelinesEnabled;
    private boolean paymentsEnabled;
    private int externalReviewersEnabled;
    private boolean quickbooksEnabled;
    private boolean boardDocumentEnabled;
    private boolean donorManagementEnabled;
    private boolean documentCenterEnabled;
    private boolean candidEnabled;
    private boolean customDashboardEnabled;
    private boolean mailChimpEnabled;
    private boolean salesforceEnabled;

    public FeatureSet() {}

    public FeatureSet(boolean docusignEnabled, boolean landingPageEnabled, boolean multiplePipelinesEnabled, boolean paymentsEnabled, int externalReviewersEnabled, boolean quickbooksEnabled, boolean boardDocumentEnabled, boolean donorManagementEnabled, boolean documentCenterEnabled, boolean candidEnabled, boolean customDashboardEnabled, boolean mailChimpEnabled, boolean salesforceEnabled) {
        this.docusignEnabled = docusignEnabled;
        this.landingPageEnabled = landingPageEnabled;
        this.multiplePipelinesEnabled = multiplePipelinesEnabled;
        this.paymentsEnabled = paymentsEnabled;
        this.externalReviewersEnabled = externalReviewersEnabled;
        this.quickbooksEnabled = quickbooksEnabled;
        this.boardDocumentEnabled = boardDocumentEnabled;
        this.donorManagementEnabled = donorManagementEnabled;
        this.documentCenterEnabled = documentCenterEnabled;
        this.candidEnabled = candidEnabled;
        this.customDashboardEnabled = customDashboardEnabled;
        this.mailChimpEnabled = mailChimpEnabled;
        this.salesforceEnabled = salesforceEnabled;
    }

    public boolean getDocusignEnabled() {
        return docusignEnabled;
    }

    public void setDocusignEnabled(boolean docusignEnabled) {
        this.docusignEnabled = docusignEnabled;
    }

    public boolean getLandingPageEnabled() {
        return landingPageEnabled;
    }

    public void setLandingPageEnabled(boolean landingPageEnabled) {
        this.landingPageEnabled = landingPageEnabled;
    }

    public boolean getMultiplePipelinesEnabled() {
        return multiplePipelinesEnabled;
    }

    public void setMultiplePipelinesEnabled(boolean multiplePipelinesEnabled) {
        this.multiplePipelinesEnabled = multiplePipelinesEnabled;
    }

    public boolean getPaymentsEnabled() {
        return paymentsEnabled;
    }

    public void setPaymentsEnabled(boolean paymentsEnabled) {
        this.paymentsEnabled = paymentsEnabled;
    }

    public int getExternalReviewersEnabled() {
        return externalReviewersEnabled;
    }

    public void setExternalReviewersEnabled(int externalReviewersEnabled) {
        this.externalReviewersEnabled = externalReviewersEnabled;
    }

    public boolean getQuickbooksEnabled() {
        return quickbooksEnabled;
    }

    public void setQuickbooksEnabled(boolean quickbooksEnabled) {
        this.quickbooksEnabled = quickbooksEnabled;
    }

    public boolean getBoardDocumentEnabled() {
        return boardDocumentEnabled;
    }

    public void setBoardDocumentEnabled(boolean boardDocumentEnabled) {
        this.boardDocumentEnabled = boardDocumentEnabled;
    }

    public boolean getDonorManagementEnabled() {
        return donorManagementEnabled;
    }

    public void setDonorManagementEnabled(boolean donorManagementEnabled) {
        this.donorManagementEnabled = donorManagementEnabled;
    }

    public boolean getDocumentCenterEnabled() {
        return documentCenterEnabled;
    }

    public void setDocumentCenterEnabled(boolean documentCenterEnabled) {
        this.documentCenterEnabled = documentCenterEnabled;
    }

    public boolean getCandidEnabled() {
        return candidEnabled;
    }

    public void setCandidEnabled(boolean candidEnabled) {
        this.candidEnabled = candidEnabled;
    }

    public boolean getCustomDashboardEnabled() {
        return customDashboardEnabled;
    }

    public void setCustomDashboardEnabled(boolean customDashboardEnabled) {
        this.customDashboardEnabled = customDashboardEnabled;
    }

    public boolean getMailChimpEnabled() {
        return mailChimpEnabled;
    }

    public void setMailChimpEnabled(boolean mailChimpEnabled) {
        this.mailChimpEnabled = mailChimpEnabled;
    }

    public boolean getSalesforceEnabled() {
        return salesforceEnabled;
    }

    public void setSalesforceEnabled(boolean salesforceEnabled) {
        this.salesforceEnabled = salesforceEnabled;
    }
}

public static class FormItem {
    public enum Type {
        FILE_UPLOAD,
        FILE_DOWNLOAD,
        SINGLE_RESPONSE,
        MULTI_RESPONSE,
        DROPDOWN_LIST,
        MULTI_DROPDOWN_LIST,
        RATING,
        TEXT,
        SHORT_TEXT,
        FOUNDATION_USER,
        TABLE,
        NUMBER,
        DATE,
        BUDGET_CATEGORY,
        REPORT_TEMPLATE,
        YES_NO_CHECKBOX,
        ORG_LEGAL_NAME,
        ORG_DBA,
        ORG_LEGAL_STATUS,
        ORG_EIN,
        ORG_HQ,
        ORG_HQ_ADDRESS_1,
        ORG_HQ_ADDRESS_2,
        ORG_HQ_CITY,
        ORG_HQ_STATE,
        ORG_HQ_ZIPCODE,
        ORG_HQ_COUNTRY,
        ORG_MAILING_ADDR,
        ORG_MAILING_ADDRESS_1,
        ORG_MAILING_ADDRESS_2,
        ORG_MAILING_CITY,
        ORG_MAILING_STATE,
        ORG_MAILING_ZIPCODE,
        ORG_MAILING_COUNTRY,
        ORG_PHONE_NUMBER,
        ORG_EMAIL,
        ORG_WEBSITE,
        ORG_FISCAL_SPONSOR,
        ORG_HAS_FISCAL_SPONSOR,
        ORG_FISCAL_SPONSOR_NAME,
        ORG_FISCAL_SPONSOR_EIN,
        ORG_FISCAL_SPONSOR_ADDRESS,
        ORG_MISSION,
        ORG_VISION,
        ORG_DEI,
        ORG_FOUNDED_YEAR,
        ORG_EMP_FULL_TIME,
        ORG_EMP_PART_TIME,
        ORG_PRIMARY_CONTACT,
        ORG_PRIMARY_CONTACT_NAME,
        ORG_PRIMARY_CONTACT_EMAIL,
        ORG_PROJECT_DIRECTOR,
        ORG_PROJECT_DIRECTOR_NAME,
        ORG_PROJECT_DIRECTOR_EMAIL,
        ORG_EXECUTIVE,
        ORG_EXECUTIVE_NAME,
        ORG_EXECUTIVE_EMAIL,
        ORG_BUDGET,
        ORG_BUDGET_REVENUE,
        ORG_BUDGET_EXPENDITURES,
        ORG_SOCIAL,
        ORG_SOCIAL_FACEBOOK,
        ORG_SOCIAL_INSTAGRAM,
        ORG_SOCIAL_TWITTER,
        ORG_SOCIAL_LINKEDIN,
        ORG_SOCIAL_GUIDESTAR,
        GRANT_AMOUNT_REQ,
        GRANT_TYPE,
        GRANT_PROJECT_TITLE,
        GRANT_PROJECT_BUDGET,
        GRANT_CO_FUNDING,
        GRANT_PERIOD,
        GRANT_PERIOD_START,
        GRANT_PERIOD_END,
        GRANT_PROP_TITLE,
        GRANT_RELEVANCY,
        GRANT_AREA,
        GRANT_AREA_CITY,
        GRANT_AREA_STATE,
        GRANT_AREA_COUNTRY,
        GRANT_POP_SERVED,
        PAGE_DIVIDER,
        TEXT_DESCRIPTION,
        FORMATTED_TEXT,
        CURRENCY,
        EXTERNAL_REFERENCES,
    }
    private Type type;
    private String id;
    private FormItemValue value;
    private String label;
    private FormItemOptions options;
    private String section;
    private String description;
    private List<String> expectedResponses;

    public FormItem() {}

    public FormItem(Type type, String id, FormItemValue value, String label, FormItemOptions options, String section, String description, List<String> expectedResponses) {
        this.type = type;
        this.id = id;
        this.value = value;
        this.label = label;
        this.options = options;
        this.section = section;
        this.description = description;
        this.expectedResponses = expectedResponses;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FormItemValue getValue() {
        return value;
    }

    public void setValue(FormItemValue value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FormItemOptions getOptions() {
        return options;
    }

    public void setOptions(FormItemOptions options) {
        this.options = options;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getExpectedResponses() {
        return expectedResponses;
    }

    public void setExpectedResponses(List<String> expectedResponses) {
        this.expectedResponses = expectedResponses;
    }
}

public static class FormItemOptions {
    private int scale;
    private boolean required;
    private boolean internal;
    private List<DisplayCondition> displayConditions;
    private String fieldBinding;
    public enum FieldBindingOverwriteRule {
        SAVE_ALL,
        SAVE_NON_BLANK,
        OVERWRITE_BLANK,
    }
    private FieldBindingOverwriteRule fieldBindingOverwriteRule;
    private int maxLength;
    private int minLength;

    public FormItemOptions() {}

    public FormItemOptions(int scale, boolean required, boolean internal, List<DisplayCondition> displayConditions, String fieldBinding, FieldBindingOverwriteRule fieldBindingOverwriteRule, int maxLength, int minLength) {
        this.scale = scale;
        this.required = required;
        this.internal = internal;
        this.displayConditions = displayConditions;
        this.fieldBinding = fieldBinding;
        this.fieldBindingOverwriteRule = fieldBindingOverwriteRule;
        this.maxLength = maxLength;
        this.minLength = minLength;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean getInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public List<DisplayCondition> getDisplayConditions() {
        return displayConditions;
    }

    public void setDisplayConditions(List<DisplayCondition> displayConditions) {
        this.displayConditions = displayConditions;
    }

    public String getFieldBinding() {
        return fieldBinding;
    }

    public void setFieldBinding(String fieldBinding) {
        this.fieldBinding = fieldBinding;
    }

    public FieldBindingOverwriteRule getFieldBindingOverwriteRule() {
        return fieldBindingOverwriteRule;
    }

    public void setFieldBindingOverwriteRule(FieldBindingOverwriteRule fieldBindingOverwriteRule) {
        this.fieldBindingOverwriteRule = fieldBindingOverwriteRule;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}

public static class FormItemValue {
    private List<String> files;
    private List<FormOptionEntity> options;
    private Object document;
    private String placeholder;
    private TableDisplayContent tableDisplayContent;

    public FormItemValue() {}

    public FormItemValue(List<String> files, List<FormOptionEntity> options, Object document, String placeholder, TableDisplayContent tableDisplayContent) {
        this.files = files;
        this.options = options;
        this.document = document;
        this.placeholder = placeholder;
        this.tableDisplayContent = tableDisplayContent;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public List<FormOptionEntity> getOptions() {
        return options;
    }

    public void setOptions(List<FormOptionEntity> options) {
        this.options = options;
    }

    public Object getDocument() {
        return document;
    }

    public void setDocument(Object document) {
        this.document = document;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public TableDisplayContent getTableDisplayContent() {
        return tableDisplayContent;
    }

    public void setTableDisplayContent(TableDisplayContent tableDisplayContent) {
        this.tableDisplayContent = tableDisplayContent;
    }
}

public static class FormOptionEntity {
    private String id;
    private String value;

    public FormOptionEntity() {}

    public FormOptionEntity(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public static class FoundationCRMField {
    private String name;
    private String key;
    private boolean visibleInTable;
    public enum Type {
        SYSTEM,
        TEXT,
        NUMBER,
        CURRENCY,
        USER,
        DATE,
        BOOLEAN,
        TAGS,
        MULTI,
    }
    private Type type;
    private List<String> options;

    public FoundationCRMField() {}

    public FoundationCRMField(String name, String key, boolean visibleInTable, Type type, List<String> options) {
        this.name = name;
        this.key = key;
        this.visibleInTable = visibleInTable;
        this.type = type;
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean getVisibleInTable() {
        return visibleInTable;
    }

    public void setVisibleInTable(boolean visibleInTable) {
        this.visibleInTable = visibleInTable;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}

public static class FoundationMailSettings {
    private List<CustomEmailTemplate> emailTemplates;

    public FoundationMailSettings() {}

    public FoundationMailSettings(List<CustomEmailTemplate> emailTemplates) {
        this.emailTemplates = emailTemplates;
    }

    public List<CustomEmailTemplate> getEmailTemplates() {
        return emailTemplates;
    }

    public void setEmailTemplates(List<CustomEmailTemplate> emailTemplates) {
        this.emailTemplates = emailTemplates;
    }
}

public static class FoundationMetadata {
    private String foundationId;
    private String fiscalStart;
    private GrantStageWorkflow stages;
    private ScoringCriteria scoringCriteria;
    private List<FoundationMetadataTag> tags;
    private Budget budget;
    private FeatureSet featureSet;
    private ConfigurationSettings configuration;
    private List<FoundationReviewerUser> reviewers;
    private List<CustomEmailTemplate> templates;

    public FoundationMetadata() {}

    public FoundationMetadata(String foundationId, String fiscalStart, GrantStageWorkflow stages, ScoringCriteria scoringCriteria, List<FoundationMetadataTag> tags, Budget budget, FeatureSet featureSet, ConfigurationSettings configuration, List<FoundationReviewerUser> reviewers, List<CustomEmailTemplate> templates) {
        this.foundationId = foundationId;
        this.fiscalStart = fiscalStart;
        this.stages = stages;
        this.scoringCriteria = scoringCriteria;
        this.tags = tags;
        this.budget = budget;
        this.featureSet = featureSet;
        this.configuration = configuration;
        this.reviewers = reviewers;
        this.templates = templates;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getFiscalStart() {
        return fiscalStart;
    }

    public void setFiscalStart(String fiscalStart) {
        this.fiscalStart = fiscalStart;
    }

    public GrantStageWorkflow getStages() {
        return stages;
    }

    public void setStages(GrantStageWorkflow stages) {
        this.stages = stages;
    }

    public ScoringCriteria getScoringCriteria() {
        return scoringCriteria;
    }

    public void setScoringCriteria(ScoringCriteria scoringCriteria) {
        this.scoringCriteria = scoringCriteria;
    }

    public List<FoundationMetadataTag> getTags() {
        return tags;
    }

    public void setTags(List<FoundationMetadataTag> tags) {
        this.tags = tags;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public FeatureSet getFeatureSet() {
        return featureSet;
    }

    public void setFeatureSet(FeatureSet featureSet) {
        this.featureSet = featureSet;
    }

    public ConfigurationSettings getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ConfigurationSettings configuration) {
        this.configuration = configuration;
    }

    public List<FoundationReviewerUser> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<FoundationReviewerUser> reviewers) {
        this.reviewers = reviewers;
    }

    public List<CustomEmailTemplate> getTemplates() {
        return templates;
    }

    public void setTemplates(List<CustomEmailTemplate> templates) {
        this.templates = templates;
    }
}

public static class FoundationMetadataTag {
    private String id;
    private String name;
    private String color;

    public FoundationMetadataTag() {}

    public FoundationMetadataTag(String id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public static class FoundationQuickbooksSetting {
    private String realmId;
    private String accessToken;
    private String refreshToken;
    private QBPaymentSyncSetting paymentSyncSettings;

    public FoundationQuickbooksSetting() {}

    public FoundationQuickbooksSetting(String realmId, String accessToken, String refreshToken, QBPaymentSyncSetting paymentSyncSettings) {
        this.realmId = realmId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.paymentSyncSettings = paymentSyncSettings;
    }

    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public QBPaymentSyncSetting getPaymentSyncSettings() {
        return paymentSyncSettings;
    }

    public void setPaymentSyncSettings(QBPaymentSyncSetting paymentSyncSettings) {
        this.paymentSyncSettings = paymentSyncSettings;
    }
}

public static class FoundationReviewerUser {
    private String id;
    private String displayName;
    private String email;
    private boolean active;
    public enum TemelioRole {
        SUPERADMIN,
        ADMIN,
        USER,
    }
    private TemelioRole temelioRole;
    private String created;
    private String suffix;
    private String pronouns;
    private OfacFlags ofacFlags;
    private boolean mfaRequired;
    private UserFoundationRole foundationRoleMap;
    private UserNonprofitRole nonprofitRoleMap;
    private List<String> associatedFoundationsFromNonprofit;
    private String role;
    private String name;
    private boolean temelioSuperuser;
    private boolean temelioAdmin;
    private boolean hasAdminAccess;

    public FoundationReviewerUser() {}

    public FoundationReviewerUser(String id, String displayName, String email, boolean active, TemelioRole temelioRole, String created, String suffix, String pronouns, OfacFlags ofacFlags, boolean mfaRequired, UserFoundationRole foundationRoleMap, UserNonprofitRole nonprofitRoleMap, List<String> associatedFoundationsFromNonprofit, String role, String name, boolean temelioSuperuser, boolean temelioAdmin, boolean hasAdminAccess) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.active = active;
        this.temelioRole = temelioRole;
        this.created = created;
        this.suffix = suffix;
        this.pronouns = pronouns;
        this.ofacFlags = ofacFlags;
        this.mfaRequired = mfaRequired;
        this.foundationRoleMap = foundationRoleMap;
        this.nonprofitRoleMap = nonprofitRoleMap;
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
        this.role = role;
        this.name = name;
        this.temelioSuperuser = temelioSuperuser;
        this.temelioAdmin = temelioAdmin;
        this.hasAdminAccess = hasAdminAccess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TemelioRole getTemelioRole() {
        return temelioRole;
    }

    public void setTemelioRole(TemelioRole temelioRole) {
        this.temelioRole = temelioRole;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getMfaRequired() {
        return mfaRequired;
    }

    public void setMfaRequired(boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
    }

    public UserFoundationRole getFoundationRoleMap() {
        return foundationRoleMap;
    }

    public void setFoundationRoleMap(UserFoundationRole foundationRoleMap) {
        this.foundationRoleMap = foundationRoleMap;
    }

    public UserNonprofitRole getNonprofitRoleMap() {
        return nonprofitRoleMap;
    }

    public void setNonprofitRoleMap(UserNonprofitRole nonprofitRoleMap) {
        this.nonprofitRoleMap = nonprofitRoleMap;
    }

    public List<String> getAssociatedFoundationsFromNonprofit() {
        return associatedFoundationsFromNonprofit;
    }

    public void setAssociatedFoundationsFromNonprofit(List<String> associatedFoundationsFromNonprofit) {
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getTemelioSuperuser() {
        return temelioSuperuser;
    }

    public void setTemelioSuperuser(boolean temelioSuperuser) {
        this.temelioSuperuser = temelioSuperuser;
    }

    public boolean getTemelioAdmin() {
        return temelioAdmin;
    }

    public void setTemelioAdmin(boolean temelioAdmin) {
        this.temelioAdmin = temelioAdmin;
    }

    public boolean getHasAdminAccess() {
        return hasAdminAccess;
    }

    public void setHasAdminAccess(boolean hasAdminAccess) {
        this.hasAdminAccess = hasAdminAccess;
    }
}

public static class FoundationSalesforceConfiguration {
    private SalesforceSyncRequest salesforceSyncRequest;
    private SalesforceTokenResponse salesforceTokenResponse;

    public FoundationSalesforceConfiguration() {}

    public FoundationSalesforceConfiguration(SalesforceSyncRequest salesforceSyncRequest, SalesforceTokenResponse salesforceTokenResponse) {
        this.salesforceSyncRequest = salesforceSyncRequest;
        this.salesforceTokenResponse = salesforceTokenResponse;
    }

    public SalesforceSyncRequest getSalesforceSyncRequest() {
        return salesforceSyncRequest;
    }

    public void setSalesforceSyncRequest(SalesforceSyncRequest salesforceSyncRequest) {
        this.salesforceSyncRequest = salesforceSyncRequest;
    }

    public SalesforceTokenResponse getSalesforceTokenResponse() {
        return salesforceTokenResponse;
    }

    public void setSalesforceTokenResponse(SalesforceTokenResponse salesforceTokenResponse) {
        this.salesforceTokenResponse = salesforceTokenResponse;
    }
}

public static class GrantStage {
    private String name;
    private String displayName;
    private String description;
    public enum Label {
        VETTING,
        DRAFT,
        SUBMITTED,
        REVIEW,
        PENDING,
        APPROVED,
        CONTRACT,
        PAYMENT,
        REPORTING,
        AWARDED,
        DENIED,
    }
    private Label label;
    private List<StageTaskTemplate> tasks;
    private boolean notifyGrantee;

    public GrantStage() {}

    public GrantStage(String name, String displayName, String description, Label label, List<StageTaskTemplate> tasks, boolean notifyGrantee) {
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.label = label;
        this.tasks = tasks;
        this.notifyGrantee = notifyGrantee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public List<StageTaskTemplate> getTasks() {
        return tasks;
    }

    public void setTasks(List<StageTaskTemplate> tasks) {
        this.tasks = tasks;
    }

    public boolean getNotifyGrantee() {
        return notifyGrantee;
    }

    public void setNotifyGrantee(boolean notifyGrantee) {
        this.notifyGrantee = notifyGrantee;
    }
}

public static class GrantStageWorkflow {
    private List<GrantStage> stages;

    public GrantStageWorkflow() {}

    public GrantStageWorkflow(List<GrantStage> stages) {
        this.stages = stages;
    }

    public List<GrantStage> getStages() {
        return stages;
    }

    public void setStages(List<GrantStage> stages) {
        this.stages = stages;
    }
}

public static class GrantTypeConfiguration {
    private List<CustomGrantType> grantTypes;

    public GrantTypeConfiguration() {}

    public GrantTypeConfiguration(List<CustomGrantType> grantTypes) {
        this.grantTypes = grantTypes;
    }

    public List<CustomGrantType> getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(List<CustomGrantType> grantTypes) {
        this.grantTypes = grantTypes;
    }
}

public static class GranteeProfileUpdate {
    public enum UpdateOptionType {
        HQ_ADDRESS,
        MAILING_ADDRESS,
    }
    private UpdateOptionType updateOptionType;

    public GranteeProfileUpdate() {}

    public GranteeProfileUpdate(UpdateOptionType updateOptionType) {
        this.updateOptionType = updateOptionType;
    }

    public UpdateOptionType getUpdateOptionType() {
        return updateOptionType;
    }

    public void setUpdateOptionType(UpdateOptionType updateOptionType) {
        this.updateOptionType = updateOptionType;
    }
}

public static class GranteeProfileUpdateConfiguration {
    private List<GranteeProfileUpdate> granteeProfileUpdates;

    public GranteeProfileUpdateConfiguration() {}

    public GranteeProfileUpdateConfiguration(List<GranteeProfileUpdate> granteeProfileUpdates) {
        this.granteeProfileUpdates = granteeProfileUpdates;
    }

    public List<GranteeProfileUpdate> getGranteeProfileUpdates() {
        return granteeProfileUpdates;
    }

    public void setGranteeProfileUpdates(List<GranteeProfileUpdate> granteeProfileUpdates) {
        this.granteeProfileUpdates = granteeProfileUpdates;
    }
}

public static class MailChimpFoundationConfiguration {
    private String accessToken;
    private String server;
    private String listId;

    public MailChimpFoundationConfiguration() {}

    public MailChimpFoundationConfiguration(String accessToken, String server, String listId) {
        this.accessToken = accessToken;
        this.server = server;
        this.listId = listId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }
}

public static class MetabaseConfiguration {
    private List<MetabaseDashboardUrl> dashboardUrls;

    public MetabaseConfiguration() {}

    public MetabaseConfiguration(List<MetabaseDashboardUrl> dashboardUrls) {
        this.dashboardUrls = dashboardUrls;
    }

    public List<MetabaseDashboardUrl> getDashboardUrls() {
        return dashboardUrls;
    }

    public void setDashboardUrls(List<MetabaseDashboardUrl> dashboardUrls) {
        this.dashboardUrls = dashboardUrls;
    }
}

public static class MetabaseDashboardUrl {
    private String url;

    public MetabaseDashboardUrl() {}

    public MetabaseDashboardUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class Pipeline {
    private String id;
    private String name;
    private String description;
    private GrantStageWorkflow workflow;

    public Pipeline() {}

    public Pipeline(String id, String name, String description, GrantStageWorkflow workflow) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.workflow = workflow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GrantStageWorkflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(GrantStageWorkflow workflow) {
        this.workflow = workflow;
    }
}

public static class QBPaymentDestination {
    private CRMConfigurationField crmFieldDestination;

    public QBPaymentDestination() {}

    public QBPaymentDestination(CRMConfigurationField crmFieldDestination) {
        this.crmFieldDestination = crmFieldDestination;
    }

    public CRMConfigurationField getCrmFieldDestination() {
        return crmFieldDestination;
    }

    public void setCrmFieldDestination(CRMConfigurationField crmFieldDestination) {
        this.crmFieldDestination = crmFieldDestination;
    }
}

public static class QBPaymentSource {
    public enum PaymentSourceType {
        BILL,
    }
    private PaymentSourceType paymentSourceType;
    private List<String> paymentSourceIdentifiers;
    public enum PaymentSourceTransformer {
        JCC,
    }
    private PaymentSourceTransformer paymentSourceTransformer;

    public QBPaymentSource() {}

    public QBPaymentSource(PaymentSourceType paymentSourceType, List<String> paymentSourceIdentifiers, PaymentSourceTransformer paymentSourceTransformer) {
        this.paymentSourceType = paymentSourceType;
        this.paymentSourceIdentifiers = paymentSourceIdentifiers;
        this.paymentSourceTransformer = paymentSourceTransformer;
    }

    public PaymentSourceType getPaymentSourceType() {
        return paymentSourceType;
    }

    public void setPaymentSourceType(PaymentSourceType paymentSourceType) {
        this.paymentSourceType = paymentSourceType;
    }

    public List<String> getPaymentSourceIdentifiers() {
        return paymentSourceIdentifiers;
    }

    public void setPaymentSourceIdentifiers(List<String> paymentSourceIdentifiers) {
        this.paymentSourceIdentifiers = paymentSourceIdentifiers;
    }

    public PaymentSourceTransformer getPaymentSourceTransformer() {
        return paymentSourceTransformer;
    }

    public void setPaymentSourceTransformer(PaymentSourceTransformer paymentSourceTransformer) {
        this.paymentSourceTransformer = paymentSourceTransformer;
    }
}

public static class QBPaymentSyncSetting {
    private QBPaymentSource billSourceId;
    private QBPaymentDestination billDestinationId;

    public QBPaymentSyncSetting() {}

    public QBPaymentSyncSetting(QBPaymentSource billSourceId, QBPaymentDestination billDestinationId) {
        this.billSourceId = billSourceId;
        this.billDestinationId = billDestinationId;
    }

    public QBPaymentSource getBillSourceId() {
        return billSourceId;
    }

    public void setBillSourceId(QBPaymentSource billSourceId) {
        this.billSourceId = billSourceId;
    }

    public QBPaymentDestination getBillDestinationId() {
        return billDestinationId;
    }

    public void setBillDestinationId(QBPaymentDestination billDestinationId) {
        this.billDestinationId = billDestinationId;
    }
}

public static class SalesforceEntityToUpdate {
    public enum SalesforceTemelioObject {
        ACCOUNT,
        CONTACT,
        PAYMENT,
    }
    private SalesforceTemelioObject salesforceTemelioObject;
    private String salesforceObjectName;
    private String salesforceRelationshipKey;
    private String salesforceTemelioFieldName;
    private List<TemelioSalesforceFieldMapping> temelioSalesforceFieldMappings;

    public SalesforceEntityToUpdate() {}

    public SalesforceEntityToUpdate(SalesforceTemelioObject salesforceTemelioObject, String salesforceObjectName, String salesforceRelationshipKey, String salesforceTemelioFieldName, List<TemelioSalesforceFieldMapping> temelioSalesforceFieldMappings) {
        this.salesforceTemelioObject = salesforceTemelioObject;
        this.salesforceObjectName = salesforceObjectName;
        this.salesforceRelationshipKey = salesforceRelationshipKey;
        this.salesforceTemelioFieldName = salesforceTemelioFieldName;
        this.temelioSalesforceFieldMappings = temelioSalesforceFieldMappings;
    }

    public SalesforceTemelioObject getSalesforceTemelioObject() {
        return salesforceTemelioObject;
    }

    public void setSalesforceTemelioObject(SalesforceTemelioObject salesforceTemelioObject) {
        this.salesforceTemelioObject = salesforceTemelioObject;
    }

    public String getSalesforceObjectName() {
        return salesforceObjectName;
    }

    public void setSalesforceObjectName(String salesforceObjectName) {
        this.salesforceObjectName = salesforceObjectName;
    }

    public String getSalesforceRelationshipKey() {
        return salesforceRelationshipKey;
    }

    public void setSalesforceRelationshipKey(String salesforceRelationshipKey) {
        this.salesforceRelationshipKey = salesforceRelationshipKey;
    }

    public String getSalesforceTemelioFieldName() {
        return salesforceTemelioFieldName;
    }

    public void setSalesforceTemelioFieldName(String salesforceTemelioFieldName) {
        this.salesforceTemelioFieldName = salesforceTemelioFieldName;
    }

    public List<TemelioSalesforceFieldMapping> getTemelioSalesforceFieldMappings() {
        return temelioSalesforceFieldMappings;
    }

    public void setTemelioSalesforceFieldMappings(List<TemelioSalesforceFieldMapping> temelioSalesforceFieldMappings) {
        this.temelioSalesforceFieldMappings = temelioSalesforceFieldMappings;
    }
}

public static class SalesforceSyncRequest {
    private String salesforceAccountName;
    private String salesforceTemelioFieldName;
    private List<SalesforceEntityToUpdate> entitiesToUpdate;
    private List<String> accountsToUpdate;

    public SalesforceSyncRequest() {}

    public SalesforceSyncRequest(String salesforceAccountName, String salesforceTemelioFieldName, List<SalesforceEntityToUpdate> entitiesToUpdate, List<String> accountsToUpdate) {
        this.salesforceAccountName = salesforceAccountName;
        this.salesforceTemelioFieldName = salesforceTemelioFieldName;
        this.entitiesToUpdate = entitiesToUpdate;
        this.accountsToUpdate = accountsToUpdate;
    }

    public String getSalesforceAccountName() {
        return salesforceAccountName;
    }

    public void setSalesforceAccountName(String salesforceAccountName) {
        this.salesforceAccountName = salesforceAccountName;
    }

    public String getSalesforceTemelioFieldName() {
        return salesforceTemelioFieldName;
    }

    public void setSalesforceTemelioFieldName(String salesforceTemelioFieldName) {
        this.salesforceTemelioFieldName = salesforceTemelioFieldName;
    }

    public List<SalesforceEntityToUpdate> getEntitiesToUpdate() {
        return entitiesToUpdate;
    }

    public void setEntitiesToUpdate(List<SalesforceEntityToUpdate> entitiesToUpdate) {
        this.entitiesToUpdate = entitiesToUpdate;
    }

    public List<String> getAccountsToUpdate() {
        return accountsToUpdate;
    }

    public void setAccountsToUpdate(List<String> accountsToUpdate) {
        this.accountsToUpdate = accountsToUpdate;
    }
}

public static class SalesforceTokenResponse {
    private String access_token;
    private String refresh_token;
    private String signature;
    private String scope;
    private String instance_url;
    private String id;
    private String token_type;
    private int issued_at;

    public SalesforceTokenResponse() {}

    public SalesforceTokenResponse(String access_token, String refresh_token, String signature, String scope, String instance_url, String id, String token_type, int issued_at) {
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.signature = signature;
        this.scope = scope;
        this.instance_url = instance_url;
        this.id = id;
        this.token_type = token_type;
        this.issued_at = issued_at;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getInstance_url() {
        return instance_url;
    }

    public void setInstance_url(String instance_url) {
        this.instance_url = instance_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public int getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(int issued_at) {
        this.issued_at = issued_at;
    }
}

public static class ScoringCriteria {
    private List<FormItem> criteriaList;
    private boolean enabled;

    public ScoringCriteria() {}

    public ScoringCriteria(List<FormItem> criteriaList, boolean enabled) {
        this.criteriaList = criteriaList;
        this.enabled = enabled;
    }

    public List<FormItem> getCriteriaList() {
        return criteriaList;
    }

    public void setCriteriaList(List<FormItem> criteriaList) {
        this.criteriaList = criteriaList;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

public static class StageTaskTemplate {
    private String id;
    private String name;
    public enum Type {
        SYSTEM,
        USER,
    }
    private Type type;
    public enum SystemLabel {
        GRANT_AGREEMENT,
        PAYMENT,
        REPORTING,
        REVIEW,
        REMINDER,
        CUSTOM_REMINDER,
        DOCUSIGN,
        PLAID_PAYMENT_DETAILS,
        EXTERNAL,
        EXTERNAL_REVIEWER,
        REFEREE,
        GRANT_UPLOAD,
        GRANT_TEMPLATE,
        MULTI_GRANT_DOCUMENT_REVIEW,
        GRANT_DOCUMENT_REVIEW,
        GRANT_SIGNATURE_REQUEST,
        PLAID_PAYMENT_SECURE_PAYMENT_STORAGE,
        SECURE_PAYMENT_STORAGE,
        PDF,
    }
    private SystemLabel systemLabel;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private List<FormItem> components;
    private TaskTemplateAdditionalInfo additionalInfo;
    private String created;
    private String updated;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;
    private List<String> defaultAssignees;
    private DefaultDateSetting defaultDeadline;
    private boolean embedInStageChange;

    public StageTaskTemplate() {}

    public StageTaskTemplate(String id, String name, Type type, SystemLabel systemLabel, String foundationId, String createdBy, String updatedBy, List<FormItem> components, TaskTemplateAdditionalInfo additionalInfo, String created, String updated, FoundationUser createdByUser, FoundationUser updatedByUser, List<String> defaultAssignees, DefaultDateSetting defaultDeadline, boolean embedInStageChange) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.systemLabel = systemLabel;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.components = components;
        this.additionalInfo = additionalInfo;
        this.created = created;
        this.updated = updated;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.defaultAssignees = defaultAssignees;
        this.defaultDeadline = defaultDeadline;
        this.embedInStageChange = embedInStageChange;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SystemLabel getSystemLabel() {
        return systemLabel;
    }

    public void setSystemLabel(SystemLabel systemLabel) {
        this.systemLabel = systemLabel;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }

    public TaskTemplateAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(TaskTemplateAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public List<String> getDefaultAssignees() {
        return defaultAssignees;
    }

    public void setDefaultAssignees(List<String> defaultAssignees) {
        this.defaultAssignees = defaultAssignees;
    }

    public DefaultDateSetting getDefaultDeadline() {
        return defaultDeadline;
    }

    public void setDefaultDeadline(DefaultDateSetting defaultDeadline) {
        this.defaultDeadline = defaultDeadline;
    }

    public boolean getEmbedInStageChange() {
        return embedInStageChange;
    }

    public void setEmbedInStageChange(boolean embedInStageChange) {
        this.embedInStageChange = embedInStageChange;
    }
}

public static class TableDisplayCell {
    private String id;
    public enum CellType {
        HEADER,
        NUMBER,
        TEXT,
    }
    private CellType cellType;
    private String displayText;
    private String placeholder;
    private boolean editable;
    private boolean required;

    public TableDisplayCell() {}

    public TableDisplayCell(String id, CellType cellType, String displayText, String placeholder, boolean editable, boolean required) {
        this.id = id;
        this.cellType = cellType;
        this.displayText = displayText;
        this.placeholder = placeholder;
        this.editable = editable;
        this.required = required;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public boolean getEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }
}

public static class TableDisplayContent {
    private List<TableDisplayRow> rows;
    private List<TableDisplayCell> rowHeaders;
    private List<TableDisplayCell> columnHeaders;

    public TableDisplayContent() {}

    public TableDisplayContent(List<TableDisplayRow> rows, List<TableDisplayCell> rowHeaders, List<TableDisplayCell> columnHeaders) {
        this.rows = rows;
        this.rowHeaders = rowHeaders;
        this.columnHeaders = columnHeaders;
    }

    public List<TableDisplayRow> getRows() {
        return rows;
    }

    public void setRows(List<TableDisplayRow> rows) {
        this.rows = rows;
    }

    public List<TableDisplayCell> getRowHeaders() {
        return rowHeaders;
    }

    public void setRowHeaders(List<TableDisplayCell> rowHeaders) {
        this.rowHeaders = rowHeaders;
    }

    public List<TableDisplayCell> getColumnHeaders() {
        return columnHeaders;
    }

    public void setColumnHeaders(List<TableDisplayCell> columnHeaders) {
        this.columnHeaders = columnHeaders;
    }
}

public static class TableDisplayRow {
    private String id;
    private List<TableDisplayCell> cells;

    public TableDisplayRow() {}

    public TableDisplayRow(String id, List<TableDisplayCell> cells) {
        this.id = id;
        this.cells = cells;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<TableDisplayCell> getCells() {
        return cells;
    }

    public void setCells(List<TableDisplayCell> cells) {
        this.cells = cells;
    }
}

public static class TaskTemplateAdditionalInfo {
    private AnvilPDFAdditionalInfo anvilPdfAdditionalInfo;

    public TaskTemplateAdditionalInfo() {}

    public TaskTemplateAdditionalInfo(AnvilPDFAdditionalInfo anvilPdfAdditionalInfo) {
        this.anvilPdfAdditionalInfo = anvilPdfAdditionalInfo;
    }

    public AnvilPDFAdditionalInfo getAnvilPdfAdditionalInfo() {
        return anvilPdfAdditionalInfo;
    }

    public void setAnvilPdfAdditionalInfo(AnvilPDFAdditionalInfo anvilPdfAdditionalInfo) {
        this.anvilPdfAdditionalInfo = anvilPdfAdditionalInfo;
    }
}

public static class TemelioSalesforceFieldMapping {
    public enum TemelioField {
        ORGANIZATION_NAME,
        ORGANIZATION_LEGAL_NAME,
        ORGANIZATION_EIN,
        ORGANIZATION_MAILING_ADDRESS_1,
        CONTACT_NAME,
        CONTACT_EMAIL,
        CONTACT_TITLE,
        PAYMENT_AMOUNT,
        PAYMENT_DUE_DATE,
    }
    private TemelioField temelioField;
    private String salesforceFieldName;

    public TemelioSalesforceFieldMapping() {}

    public TemelioSalesforceFieldMapping(TemelioField temelioField, String salesforceFieldName) {
        this.temelioField = temelioField;
        this.salesforceFieldName = salesforceFieldName;
    }

    public TemelioField getTemelioField() {
        return temelioField;
    }

    public void setTemelioField(TemelioField temelioField) {
        this.temelioField = temelioField;
    }

    public String getSalesforceFieldName() {
        return salesforceFieldName;
    }

    public void setSalesforceFieldName(String salesforceFieldName) {
        this.salesforceFieldName = salesforceFieldName;
    }
}

public static class NonprofitIRSUpdateRequest {
    private List<String> nonprofitIds;
    private String cutOffDate;

    public NonprofitIRSUpdateRequest() {}

    public NonprofitIRSUpdateRequest(List<String> nonprofitIds, String cutOffDate) {
        this.nonprofitIds = nonprofitIds;
        this.cutOffDate = cutOffDate;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public String getCutOffDate() {
        return cutOffDate;
    }

    public void setCutOffDate(String cutOffDate) {
        this.cutOffDate = cutOffDate;
    }
}

public static class FormComponentSubmission {
    private List<String> fileUploads;
    private List<String> selectedResponses;
    private int rating;
    private String response;
    private String userId;
    private List<TableSubmissionRow> rows;
    private double number;
    private String date;
    private String reportTemplateId;
    private List<List> tableResponse;

    public FormComponentSubmission() {}

    public FormComponentSubmission(List<String> fileUploads, List<String> selectedResponses, int rating, String response, String userId, List<TableSubmissionRow> rows, double number, String date, String reportTemplateId, List<List> tableResponse) {
        this.fileUploads = fileUploads;
        this.selectedResponses = selectedResponses;
        this.rating = rating;
        this.response = response;
        this.userId = userId;
        this.rows = rows;
        this.number = number;
        this.date = date;
        this.reportTemplateId = reportTemplateId;
        this.tableResponse = tableResponse;
    }

    public List<String> getFileUploads() {
        return fileUploads;
    }

    public void setFileUploads(List<String> fileUploads) {
        this.fileUploads = fileUploads;
    }

    public List<String> getSelectedResponses() {
        return selectedResponses;
    }

    public void setSelectedResponses(List<String> selectedResponses) {
        this.selectedResponses = selectedResponses;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<TableSubmissionRow> getRows() {
        return rows;
    }

    public void setRows(List<TableSubmissionRow> rows) {
        this.rows = rows;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReportTemplateId() {
        return reportTemplateId;
    }

    public void setReportTemplateId(String reportTemplateId) {
        this.reportTemplateId = reportTemplateId;
    }

    public List<List> getTableResponse() {
        return tableResponse;
    }

    public void setTableResponse(List<List> tableResponse) {
        this.tableResponse = tableResponse;
    }
}

public static class FormItemResponseEntity {
    private FormItem component;
    private FormComponentSubmission response;

    public FormItemResponseEntity() {}

    public FormItemResponseEntity(FormItem component, FormComponentSubmission response) {
        this.component = component;
        this.response = response;
    }

    public FormItem getComponent() {
        return component;
    }

    public void setComponent(FormItem component) {
        this.component = component;
    }

    public FormComponentSubmission getResponse() {
        return response;
    }

    public void setResponse(FormComponentSubmission response) {
        this.response = response;
    }
}

public static class FormPDFResponseData {
    private List<FormItemResponseEntity> responses;
    private String pageTitle;

    public FormPDFResponseData() {}

    public FormPDFResponseData(List<FormItemResponseEntity> responses, String pageTitle) {
        this.responses = responses;
        this.pageTitle = pageTitle;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
}

public static class TableResponseCell {
    private String response;

    public TableResponseCell() {}

    public TableResponseCell(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

public static class TableSubmissionRow {
    private List<FormComponentSubmission> cells;

    public TableSubmissionRow() {}

    public TableSubmissionRow(List<FormComponentSubmission> cells) {
        this.cells = cells;
    }

    public List<FormComponentSubmission> getCells() {
        return cells;
    }

    public void setCells(List<FormComponentSubmission> cells) {
        this.cells = cells;
    }
}

public static class FoundationNonprofitCreateRequest {
    private String id;
    private String legalName;
    private String ein;
    public enum EntityType {
        ORGANIZATION,
        INDIVIDUAL,
    }
    private EntityType entityType;
    private boolean hasFiscalSponsor;
    private FiscalSponsor fiscalSponsor;
    private String primaryContactEmail;
    private String primaryContactName;
    private String welcomeMessage;
    private boolean sendWelcomeMessage;
    private String created;
    private String suffix;
    private String pronouns;

    public FoundationNonprofitCreateRequest() {}

    public FoundationNonprofitCreateRequest(String id, String legalName, String ein, EntityType entityType, boolean hasFiscalSponsor, FiscalSponsor fiscalSponsor, String primaryContactEmail, String primaryContactName, String welcomeMessage, boolean sendWelcomeMessage, String created, String suffix, String pronouns) {
        this.id = id;
        this.legalName = legalName;
        this.ein = ein;
        this.entityType = entityType;
        this.hasFiscalSponsor = hasFiscalSponsor;
        this.fiscalSponsor = fiscalSponsor;
        this.primaryContactEmail = primaryContactEmail;
        this.primaryContactName = primaryContactName;
        this.welcomeMessage = welcomeMessage;
        this.sendWelcomeMessage = sendWelcomeMessage;
        this.created = created;
        this.suffix = suffix;
        this.pronouns = pronouns;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public boolean getHasFiscalSponsor() {
        return hasFiscalSponsor;
    }

    public void setHasFiscalSponsor(boolean hasFiscalSponsor) {
        this.hasFiscalSponsor = hasFiscalSponsor;
    }

    public FiscalSponsor getFiscalSponsor() {
        return fiscalSponsor;
    }

    public void setFiscalSponsor(FiscalSponsor fiscalSponsor) {
        this.fiscalSponsor = fiscalSponsor;
    }

    public String getPrimaryContactEmail() {
        return primaryContactEmail;
    }

    public void setPrimaryContactEmail(String primaryContactEmail) {
        this.primaryContactEmail = primaryContactEmail;
    }

    public String getPrimaryContactName() {
        return primaryContactName;
    }

    public void setPrimaryContactName(String primaryContactName) {
        this.primaryContactName = primaryContactName;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public boolean getSendWelcomeMessage() {
        return sendWelcomeMessage;
    }

    public void setSendWelcomeMessage(boolean sendWelcomeMessage) {
        this.sendWelcomeMessage = sendWelcomeMessage;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }
}

public static class UpdateAppUserRequest {
    private String id;
    private String displayName;
    private String email;
    private boolean active;
    public enum TemelioRole {
        SUPERADMIN,
        ADMIN,
        USER,
    }
    private TemelioRole temelioRole;
    private String created;
    private String suffix;
    private String pronouns;
    private OfacFlags ofacFlags;
    private boolean mfaRequired;
    private UserFoundationRole foundationRoleMap;
    private UserNonprofitRole nonprofitRoleMap;
    private List<String> associatedFoundationsFromNonprofit;
    private boolean sendEmail;
    private String name;
    private boolean temelioSuperuser;
    private boolean temelioAdmin;
    private boolean hasAdminAccess;

    public UpdateAppUserRequest() {}

    public UpdateAppUserRequest(String id, String displayName, String email, boolean active, TemelioRole temelioRole, String created, String suffix, String pronouns, OfacFlags ofacFlags, boolean mfaRequired, UserFoundationRole foundationRoleMap, UserNonprofitRole nonprofitRoleMap, List<String> associatedFoundationsFromNonprofit, boolean sendEmail, String name, boolean temelioSuperuser, boolean temelioAdmin, boolean hasAdminAccess) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.active = active;
        this.temelioRole = temelioRole;
        this.created = created;
        this.suffix = suffix;
        this.pronouns = pronouns;
        this.ofacFlags = ofacFlags;
        this.mfaRequired = mfaRequired;
        this.foundationRoleMap = foundationRoleMap;
        this.nonprofitRoleMap = nonprofitRoleMap;
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
        this.sendEmail = sendEmail;
        this.name = name;
        this.temelioSuperuser = temelioSuperuser;
        this.temelioAdmin = temelioAdmin;
        this.hasAdminAccess = hasAdminAccess;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TemelioRole getTemelioRole() {
        return temelioRole;
    }

    public void setTemelioRole(TemelioRole temelioRole) {
        this.temelioRole = temelioRole;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPronouns() {
        return pronouns;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getMfaRequired() {
        return mfaRequired;
    }

    public void setMfaRequired(boolean mfaRequired) {
        this.mfaRequired = mfaRequired;
    }

    public UserFoundationRole getFoundationRoleMap() {
        return foundationRoleMap;
    }

    public void setFoundationRoleMap(UserFoundationRole foundationRoleMap) {
        this.foundationRoleMap = foundationRoleMap;
    }

    public UserNonprofitRole getNonprofitRoleMap() {
        return nonprofitRoleMap;
    }

    public void setNonprofitRoleMap(UserNonprofitRole nonprofitRoleMap) {
        this.nonprofitRoleMap = nonprofitRoleMap;
    }

    public List<String> getAssociatedFoundationsFromNonprofit() {
        return associatedFoundationsFromNonprofit;
    }

    public void setAssociatedFoundationsFromNonprofit(List<String> associatedFoundationsFromNonprofit) {
        this.associatedFoundationsFromNonprofit = associatedFoundationsFromNonprofit;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getTemelioSuperuser() {
        return temelioSuperuser;
    }

    public void setTemelioSuperuser(boolean temelioSuperuser) {
        this.temelioSuperuser = temelioSuperuser;
    }

    public boolean getTemelioAdmin() {
        return temelioAdmin;
    }

    public void setTemelioAdmin(boolean temelioAdmin) {
        this.temelioAdmin = temelioAdmin;
    }

    public boolean getHasAdminAccess() {
        return hasAdminAccess;
    }

    public void setHasAdminAccess(boolean hasAdminAccess) {
        this.hasAdminAccess = hasAdminAccess;
    }
}

public static class DocusignTokenResponse {
    private String accessToken;
    private String refreshToken;

    public DocusignTokenResponse() {}

    public DocusignTokenResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}

public static class DocusignUserFoundationSettings {
    private DocusignTokenResponse accessToken;

    public DocusignUserFoundationSettings() {}

    public DocusignUserFoundationSettings(DocusignTokenResponse accessToken) {
        this.accessToken = accessToken;
    }

    public DocusignTokenResponse getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(DocusignTokenResponse accessToken) {
        this.accessToken = accessToken;
    }
}

public static class NotificationSetting {
    public enum Type {
        MENTIONS,
        TASK_ASSIGNEES,
        TASK_DUE,
        GRANTEE_TASK_DUE,
        NEW_APPLICATION,
        GRANTEE_PROFILE_UPDATE,
        PROPOSAL_STAGE_CHANGE,
        VIEWER_TASK,
        VIEWER_PROPOSAL,
    }
    private Type type;
    private boolean enabled;

    public NotificationSetting() {}

    public NotificationSetting(Type type, boolean enabled) {
        this.type = type;
        this.enabled = enabled;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

public static class NylasAccessToken {
    private String accessToken;
    private String accountId;
    private String email;
    private String provider;

    public NylasAccessToken() {}

    public NylasAccessToken(String accessToken, String accountId, String email, String provider) {
        this.accessToken = accessToken;
        this.accountId = accountId;
        this.email = email;
        this.provider = provider;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}

public static class NylasUserFoundationSettings {
    private NylasAccessToken accessToken;
    private String sharedCalendarId;

    public NylasUserFoundationSettings() {}

    public NylasUserFoundationSettings(NylasAccessToken accessToken, String sharedCalendarId) {
        this.accessToken = accessToken;
        this.sharedCalendarId = sharedCalendarId;
    }

    public NylasAccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(NylasAccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public String getSharedCalendarId() {
        return sharedCalendarId;
    }

    public void setSharedCalendarId(String sharedCalendarId) {
        this.sharedCalendarId = sharedCalendarId;
    }
}

public static class SystemNotifications {
    private List<NotificationSetting> settings;

    public SystemNotifications() {}

    public SystemNotifications(List<NotificationSetting> settings) {
        this.settings = settings;
    }

    public List<NotificationSetting> getSettings() {
        return settings;
    }

    public void setSettings(List<NotificationSetting> settings) {
        this.settings = settings;
    }
}

public static class UserBrandingSettings {
    private String avatarFile;

    public UserBrandingSettings() {}

    public UserBrandingSettings(String avatarFile) {
        this.avatarFile = avatarFile;
    }

    public String getAvatarFile() {
        return avatarFile;
    }

    public void setAvatarFile(String avatarFile) {
        this.avatarFile = avatarFile;
    }
}

public static class UserFoundationSettings {
    private SystemNotifications systemNotifications;
    private NylasUserFoundationSettings nylasSettings;
    private DocusignUserFoundationSettings docusignSettings;
    private UserBrandingSettings brandingSettings;
    private UserPipelineSettings pipelineSettings;

    public UserFoundationSettings() {}

    public UserFoundationSettings(SystemNotifications systemNotifications, NylasUserFoundationSettings nylasSettings, DocusignUserFoundationSettings docusignSettings, UserBrandingSettings brandingSettings, UserPipelineSettings pipelineSettings) {
        this.systemNotifications = systemNotifications;
        this.nylasSettings = nylasSettings;
        this.docusignSettings = docusignSettings;
        this.brandingSettings = brandingSettings;
        this.pipelineSettings = pipelineSettings;
    }

    public SystemNotifications getSystemNotifications() {
        return systemNotifications;
    }

    public void setSystemNotifications(SystemNotifications systemNotifications) {
        this.systemNotifications = systemNotifications;
    }

    public NylasUserFoundationSettings getNylasSettings() {
        return nylasSettings;
    }

    public void setNylasSettings(NylasUserFoundationSettings nylasSettings) {
        this.nylasSettings = nylasSettings;
    }

    public DocusignUserFoundationSettings getDocusignSettings() {
        return docusignSettings;
    }

    public void setDocusignSettings(DocusignUserFoundationSettings docusignSettings) {
        this.docusignSettings = docusignSettings;
    }

    public UserBrandingSettings getBrandingSettings() {
        return brandingSettings;
    }

    public void setBrandingSettings(UserBrandingSettings brandingSettings) {
        this.brandingSettings = brandingSettings;
    }

    public UserPipelineSettings getPipelineSettings() {
        return pipelineSettings;
    }

    public void setPipelineSettings(UserPipelineSettings pipelineSettings) {
        this.pipelineSettings = pipelineSettings;
    }
}

public static class UserPipelineSettings {
    private String defaultPipelineId;

    public UserPipelineSettings() {}

    public UserPipelineSettings(String defaultPipelineId) {
        this.defaultPipelineId = defaultPipelineId;
    }

    public String getDefaultPipelineId() {
        return defaultPipelineId;
    }

    public void setDefaultPipelineId(String defaultPipelineId) {
        this.defaultPipelineId = defaultPipelineId;
    }
}

public static class Faceting {
    private int maxValuesPerFacet;

    public Faceting() {}

    public Faceting(int maxValuesPerFacet) {
        this.maxValuesPerFacet = maxValuesPerFacet;
    }

    public int getMaxValuesPerFacet() {
        return maxValuesPerFacet;
    }

    public void setMaxValuesPerFacet(int maxValuesPerFacet) {
        this.maxValuesPerFacet = maxValuesPerFacet;
    }
}

public static class Pagination {
    private int maxTotalHits;

    public Pagination() {}

    public Pagination(int maxTotalHits) {
        this.maxTotalHits = maxTotalHits;
    }

    public int getMaxTotalHits() {
        return maxTotalHits;
    }

    public void setMaxTotalHits(int maxTotalHits) {
        this.maxTotalHits = maxTotalHits;
    }
}

public static class SwapIndexesParams {
    private List<String> indexes;

    public SwapIndexesParams() {}

    public SwapIndexesParams(List<String> indexes) {
        this.indexes = indexes;
    }

    public List<String> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<String> indexes) {
        this.indexes = indexes;
    }
}

public static class Task {
    private String id;
    private String name;
    private String foundationId;
    private String nonprofitId;
    private String createdBy;
    private String updatedBy;
    public enum SystemLabel {
        GRANT_AGREEMENT,
        PAYMENT,
        REPORTING,
        REVIEW,
        REMINDER,
        CUSTOM_REMINDER,
        DOCUSIGN,
        PLAID_PAYMENT_DETAILS,
        EXTERNAL,
        EXTERNAL_REVIEWER,
        REFEREE,
        GRANT_UPLOAD,
        GRANT_TEMPLATE,
        MULTI_GRANT_DOCUMENT_REVIEW,
        GRANT_DOCUMENT_REVIEW,
        GRANT_SIGNATURE_REQUEST,
        PLAID_PAYMENT_SECURE_PAYMENT_STORAGE,
        SECURE_PAYMENT_STORAGE,
        PDF,
    }
    private SystemLabel systemLabel;
    public enum TaskType {
        INTERNAL,
        EXTERNAL,
    }
    private TaskType taskType;
    public enum Status {
        DRAFT,
        OPEN,
        RESOLVED,
        CLOSED,
    }
    private Status status;
    private String description;
    public enum SourceType {
        CRM,
        GRANT_APPLICATION,
        REPORT,
        AGREEMENT_TEMPLATE,
        DONOR,
    }
    private SourceType sourceType;
    private String sourceId;
    private List<TaskSourceEntity> additionalSources;
    private TaskAdditionalInfo additionalInfo;
    private List<String> assignees;
    private List<String> watchers;
    private List<FormItem> components;
    private String deadline;
    private String created;
    private String updated;
    private List<SignatureOrder> signatureOrderList;
    private boolean disableOldSignatureWorkflow;
    private CustomEmailTemplate customEmailTemplate;
    private String documentHTML;
    private String encodedSignatureFile;
    private AnvilPaymentDetails achDetails;
    private AnvilPDFFieldResponses pdfResponses;
    private GrantProposalSubmission submission;
    private Nonprofit nonprofit;
    private Foundation foundation;
    private List<FoundationUser> foundationAssignees;
    private List<NonprofitUser> nonprofitAssignees;
    private List<FoundationUser> foundationWatchers;
    private AppUser externalReviewer;
    private List<AppUser> externalReviewers;
    private AppUser referee;
    private FoundationUser createdByUser;
    private PresignedFile documentToSign;
    private PresignedFile signedDocumentFile;
    private PresignedFile bankAccountDocumentFile;
    private DonorEntity donorEntity;

    public Task() {}

    public Task(String id, String name, String foundationId, String nonprofitId, String createdBy, String updatedBy, SystemLabel systemLabel, TaskType taskType, Status status, String description, SourceType sourceType, String sourceId, List<TaskSourceEntity> additionalSources, TaskAdditionalInfo additionalInfo, List<String> assignees, List<String> watchers, List<FormItem> components, String deadline, String created, String updated, List<SignatureOrder> signatureOrderList, boolean disableOldSignatureWorkflow, CustomEmailTemplate customEmailTemplate, String documentHTML, String encodedSignatureFile, AnvilPaymentDetails achDetails, AnvilPDFFieldResponses pdfResponses, GrantProposalSubmission submission, Nonprofit nonprofit, Foundation foundation, List<FoundationUser> foundationAssignees, List<NonprofitUser> nonprofitAssignees, List<FoundationUser> foundationWatchers, AppUser externalReviewer, List<AppUser> externalReviewers, AppUser referee, FoundationUser createdByUser, PresignedFile documentToSign, PresignedFile signedDocumentFile, PresignedFile bankAccountDocumentFile, DonorEntity donorEntity) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.systemLabel = systemLabel;
        this.taskType = taskType;
        this.status = status;
        this.description = description;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.additionalSources = additionalSources;
        this.additionalInfo = additionalInfo;
        this.assignees = assignees;
        this.watchers = watchers;
        this.components = components;
        this.deadline = deadline;
        this.created = created;
        this.updated = updated;
        this.signatureOrderList = signatureOrderList;
        this.disableOldSignatureWorkflow = disableOldSignatureWorkflow;
        this.customEmailTemplate = customEmailTemplate;
        this.documentHTML = documentHTML;
        this.encodedSignatureFile = encodedSignatureFile;
        this.achDetails = achDetails;
        this.pdfResponses = pdfResponses;
        this.submission = submission;
        this.nonprofit = nonprofit;
        this.foundation = foundation;
        this.foundationAssignees = foundationAssignees;
        this.nonprofitAssignees = nonprofitAssignees;
        this.foundationWatchers = foundationWatchers;
        this.externalReviewer = externalReviewer;
        this.externalReviewers = externalReviewers;
        this.referee = referee;
        this.createdByUser = createdByUser;
        this.documentToSign = documentToSign;
        this.signedDocumentFile = signedDocumentFile;
        this.bankAccountDocumentFile = bankAccountDocumentFile;
        this.donorEntity = donorEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public SystemLabel getSystemLabel() {
        return systemLabel;
    }

    public void setSystemLabel(SystemLabel systemLabel) {
        this.systemLabel = systemLabel;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public List<TaskSourceEntity> getAdditionalSources() {
        return additionalSources;
    }

    public void setAdditionalSources(List<TaskSourceEntity> additionalSources) {
        this.additionalSources = additionalSources;
    }

    public TaskAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(TaskAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public List<String> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<String> watchers) {
        this.watchers = watchers;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<SignatureOrder> getSignatureOrderList() {
        return signatureOrderList;
    }

    public void setSignatureOrderList(List<SignatureOrder> signatureOrderList) {
        this.signatureOrderList = signatureOrderList;
    }

    public boolean getDisableOldSignatureWorkflow() {
        return disableOldSignatureWorkflow;
    }

    public void setDisableOldSignatureWorkflow(boolean disableOldSignatureWorkflow) {
        this.disableOldSignatureWorkflow = disableOldSignatureWorkflow;
    }

    public CustomEmailTemplate getCustomEmailTemplate() {
        return customEmailTemplate;
    }

    public void setCustomEmailTemplate(CustomEmailTemplate customEmailTemplate) {
        this.customEmailTemplate = customEmailTemplate;
    }

    public String getDocumentHTML() {
        return documentHTML;
    }

    public void setDocumentHTML(String documentHTML) {
        this.documentHTML = documentHTML;
    }

    public String getEncodedSignatureFile() {
        return encodedSignatureFile;
    }

    public void setEncodedSignatureFile(String encodedSignatureFile) {
        this.encodedSignatureFile = encodedSignatureFile;
    }

    public AnvilPaymentDetails getAchDetails() {
        return achDetails;
    }

    public void setAchDetails(AnvilPaymentDetails achDetails) {
        this.achDetails = achDetails;
    }

    public AnvilPDFFieldResponses getPdfResponses() {
        return pdfResponses;
    }

    public void setPdfResponses(AnvilPDFFieldResponses pdfResponses) {
        this.pdfResponses = pdfResponses;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<FoundationUser> getFoundationAssignees() {
        return foundationAssignees;
    }

    public void setFoundationAssignees(List<FoundationUser> foundationAssignees) {
        this.foundationAssignees = foundationAssignees;
    }

    public List<NonprofitUser> getNonprofitAssignees() {
        return nonprofitAssignees;
    }

    public void setNonprofitAssignees(List<NonprofitUser> nonprofitAssignees) {
        this.nonprofitAssignees = nonprofitAssignees;
    }

    public List<FoundationUser> getFoundationWatchers() {
        return foundationWatchers;
    }

    public void setFoundationWatchers(List<FoundationUser> foundationWatchers) {
        this.foundationWatchers = foundationWatchers;
    }

    public AppUser getExternalReviewer() {
        return externalReviewer;
    }

    public void setExternalReviewer(AppUser externalReviewer) {
        this.externalReviewer = externalReviewer;
    }

    public List<AppUser> getExternalReviewers() {
        return externalReviewers;
    }

    public void setExternalReviewers(List<AppUser> externalReviewers) {
        this.externalReviewers = externalReviewers;
    }

    public AppUser getReferee() {
        return referee;
    }

    public void setReferee(AppUser referee) {
        this.referee = referee;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public PresignedFile getDocumentToSign() {
        return documentToSign;
    }

    public void setDocumentToSign(PresignedFile documentToSign) {
        this.documentToSign = documentToSign;
    }

    public PresignedFile getSignedDocumentFile() {
        return signedDocumentFile;
    }

    public void setSignedDocumentFile(PresignedFile signedDocumentFile) {
        this.signedDocumentFile = signedDocumentFile;
    }

    public PresignedFile getBankAccountDocumentFile() {
        return bankAccountDocumentFile;
    }

    public void setBankAccountDocumentFile(PresignedFile bankAccountDocumentFile) {
        this.bankAccountDocumentFile = bankAccountDocumentFile;
    }

    public DonorEntity getDonorEntity() {
        return donorEntity;
    }

    public void setDonorEntity(DonorEntity donorEntity) {
        this.donorEntity = donorEntity;
    }
}

public static class TaskDetails {
    private int receivedDocuments;
    private int indexedDocuments;
    private int deletedDocuments;
    private String primaryKey;
    private List<String> rankingRules;
    private List<String> searchableAttributes;
    private List<String> displayedAttributes;
    private List<String> filterableAttributes;
    private List<String> sortableAttributes;
    private List<String> stopWords;
    private Object synonyms;
    private String distinctAttribute;
    private TypoTolerance typoTolerance;
    private int providedIds;
    private Pagination pagination;
    private Faceting faceting;
    private String dumpUid;
    private int matchedTasks;
    private int canceledTasks;
    private String originalFilter;
    private int deletedTasks;
    private List<SwapIndexesParams> swaps;

    public TaskDetails() {}

    public TaskDetails(int receivedDocuments, int indexedDocuments, int deletedDocuments, String primaryKey, List<String> rankingRules, List<String> searchableAttributes, List<String> displayedAttributes, List<String> filterableAttributes, List<String> sortableAttributes, List<String> stopWords, Object synonyms, String distinctAttribute, TypoTolerance typoTolerance, int providedIds, Pagination pagination, Faceting faceting, String dumpUid, int matchedTasks, int canceledTasks, String originalFilter, int deletedTasks, List<SwapIndexesParams> swaps) {
        this.receivedDocuments = receivedDocuments;
        this.indexedDocuments = indexedDocuments;
        this.deletedDocuments = deletedDocuments;
        this.primaryKey = primaryKey;
        this.rankingRules = rankingRules;
        this.searchableAttributes = searchableAttributes;
        this.displayedAttributes = displayedAttributes;
        this.filterableAttributes = filterableAttributes;
        this.sortableAttributes = sortableAttributes;
        this.stopWords = stopWords;
        this.synonyms = synonyms;
        this.distinctAttribute = distinctAttribute;
        this.typoTolerance = typoTolerance;
        this.providedIds = providedIds;
        this.pagination = pagination;
        this.faceting = faceting;
        this.dumpUid = dumpUid;
        this.matchedTasks = matchedTasks;
        this.canceledTasks = canceledTasks;
        this.originalFilter = originalFilter;
        this.deletedTasks = deletedTasks;
        this.swaps = swaps;
    }

    public int getReceivedDocuments() {
        return receivedDocuments;
    }

    public void setReceivedDocuments(int receivedDocuments) {
        this.receivedDocuments = receivedDocuments;
    }

    public int getIndexedDocuments() {
        return indexedDocuments;
    }

    public void setIndexedDocuments(int indexedDocuments) {
        this.indexedDocuments = indexedDocuments;
    }

    public int getDeletedDocuments() {
        return deletedDocuments;
    }

    public void setDeletedDocuments(int deletedDocuments) {
        this.deletedDocuments = deletedDocuments;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public List<String> getRankingRules() {
        return rankingRules;
    }

    public void setRankingRules(List<String> rankingRules) {
        this.rankingRules = rankingRules;
    }

    public List<String> getSearchableAttributes() {
        return searchableAttributes;
    }

    public void setSearchableAttributes(List<String> searchableAttributes) {
        this.searchableAttributes = searchableAttributes;
    }

    public List<String> getDisplayedAttributes() {
        return displayedAttributes;
    }

    public void setDisplayedAttributes(List<String> displayedAttributes) {
        this.displayedAttributes = displayedAttributes;
    }

    public List<String> getFilterableAttributes() {
        return filterableAttributes;
    }

    public void setFilterableAttributes(List<String> filterableAttributes) {
        this.filterableAttributes = filterableAttributes;
    }

    public List<String> getSortableAttributes() {
        return sortableAttributes;
    }

    public void setSortableAttributes(List<String> sortableAttributes) {
        this.sortableAttributes = sortableAttributes;
    }

    public List<String> getStopWords() {
        return stopWords;
    }

    public void setStopWords(List<String> stopWords) {
        this.stopWords = stopWords;
    }

    public Object getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(Object synonyms) {
        this.synonyms = synonyms;
    }

    public String getDistinctAttribute() {
        return distinctAttribute;
    }

    public void setDistinctAttribute(String distinctAttribute) {
        this.distinctAttribute = distinctAttribute;
    }

    public TypoTolerance getTypoTolerance() {
        return typoTolerance;
    }

    public void setTypoTolerance(TypoTolerance typoTolerance) {
        this.typoTolerance = typoTolerance;
    }

    public int getProvidedIds() {
        return providedIds;
    }

    public void setProvidedIds(int providedIds) {
        this.providedIds = providedIds;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Faceting getFaceting() {
        return faceting;
    }

    public void setFaceting(Faceting faceting) {
        this.faceting = faceting;
    }

    public String getDumpUid() {
        return dumpUid;
    }

    public void setDumpUid(String dumpUid) {
        this.dumpUid = dumpUid;
    }

    public int getMatchedTasks() {
        return matchedTasks;
    }

    public void setMatchedTasks(int matchedTasks) {
        this.matchedTasks = matchedTasks;
    }

    public int getCanceledTasks() {
        return canceledTasks;
    }

    public void setCanceledTasks(int canceledTasks) {
        this.canceledTasks = canceledTasks;
    }

    public String getOriginalFilter() {
        return originalFilter;
    }

    public void setOriginalFilter(String originalFilter) {
        this.originalFilter = originalFilter;
    }

    public int getDeletedTasks() {
        return deletedTasks;
    }

    public void setDeletedTasks(int deletedTasks) {
        this.deletedTasks = deletedTasks;
    }

    public List<SwapIndexesParams> getSwaps() {
        return swaps;
    }

    public void setSwaps(List<SwapIndexesParams> swaps) {
        this.swaps = swaps;
    }
}

public static class TaskError {
    private String taskErrorCode;
    private String taskErrorType;
    private String taskErrorLink;

    public TaskError() {}

    public TaskError(String taskErrorCode, String taskErrorType, String taskErrorLink) {
        this.taskErrorCode = taskErrorCode;
        this.taskErrorType = taskErrorType;
        this.taskErrorLink = taskErrorLink;
    }

    public String getTaskErrorCode() {
        return taskErrorCode;
    }

    public void setTaskErrorCode(String taskErrorCode) {
        this.taskErrorCode = taskErrorCode;
    }

    public String getTaskErrorType() {
        return taskErrorType;
    }

    public void setTaskErrorType(String taskErrorType) {
        this.taskErrorType = taskErrorType;
    }

    public String getTaskErrorLink() {
        return taskErrorLink;
    }

    public void setTaskErrorLink(String taskErrorLink) {
        this.taskErrorLink = taskErrorLink;
    }
}

public static class TypoTolerance {
    private boolean enabled;
    private Object minWordSizeForTypos;
    private List<String> disableOnWords;
    private List<String> disableOnAttributes;

    public TypoTolerance() {}

    public TypoTolerance(boolean enabled, Object minWordSizeForTypos, List<String> disableOnWords, List<String> disableOnAttributes) {
        this.enabled = enabled;
        this.minWordSizeForTypos = minWordSizeForTypos;
        this.disableOnWords = disableOnWords;
        this.disableOnAttributes = disableOnAttributes;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Object getMinWordSizeForTypos() {
        return minWordSizeForTypos;
    }

    public void setMinWordSizeForTypos(Object minWordSizeForTypos) {
        this.minWordSizeForTypos = minWordSizeForTypos;
    }

    public List<String> getDisableOnWords() {
        return disableOnWords;
    }

    public void setDisableOnWords(List<String> disableOnWords) {
        this.disableOnWords = disableOnWords;
    }

    public List<String> getDisableOnAttributes() {
        return disableOnAttributes;
    }

    public void setDisableOnAttributes(List<String> disableOnAttributes) {
        this.disableOnAttributes = disableOnAttributes;
    }
}

public static class CandidEntityResponse {
    private String ein;
    private DemographicsResponse demographicsData;
    private String demographicsUpdatedAt;
    private PremierResponse premierData;
    private String premierUpdatedAt;
    private String premierPDFLink;
    private String premierPDFUpdatedAt;
    private PresignedFile premierPDFLinkFile;

    public CandidEntityResponse() {}

    public CandidEntityResponse(String ein, DemographicsResponse demographicsData, String demographicsUpdatedAt, PremierResponse premierData, String premierUpdatedAt, String premierPDFLink, String premierPDFUpdatedAt, PresignedFile premierPDFLinkFile) {
        this.ein = ein;
        this.demographicsData = demographicsData;
        this.demographicsUpdatedAt = demographicsUpdatedAt;
        this.premierData = premierData;
        this.premierUpdatedAt = premierUpdatedAt;
        this.premierPDFLink = premierPDFLink;
        this.premierPDFUpdatedAt = premierPDFUpdatedAt;
        this.premierPDFLinkFile = premierPDFLinkFile;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public DemographicsResponse getDemographicsData() {
        return demographicsData;
    }

    public void setDemographicsData(DemographicsResponse demographicsData) {
        this.demographicsData = demographicsData;
    }

    public String getDemographicsUpdatedAt() {
        return demographicsUpdatedAt;
    }

    public void setDemographicsUpdatedAt(String demographicsUpdatedAt) {
        this.demographicsUpdatedAt = demographicsUpdatedAt;
    }

    public PremierResponse getPremierData() {
        return premierData;
    }

    public void setPremierData(PremierResponse premierData) {
        this.premierData = premierData;
    }

    public String getPremierUpdatedAt() {
        return premierUpdatedAt;
    }

    public void setPremierUpdatedAt(String premierUpdatedAt) {
        this.premierUpdatedAt = premierUpdatedAt;
    }

    public String getPremierPDFLink() {
        return premierPDFLink;
    }

    public void setPremierPDFLink(String premierPDFLink) {
        this.premierPDFLink = premierPDFLink;
    }

    public String getPremierPDFUpdatedAt() {
        return premierPDFUpdatedAt;
    }

    public void setPremierPDFUpdatedAt(String premierPDFUpdatedAt) {
        this.premierPDFUpdatedAt = premierPDFUpdatedAt;
    }

    public PresignedFile getPremierPDFLinkFile() {
        return premierPDFLinkFile;
    }

    public void setPremierPDFLinkFile(PresignedFile premierPDFLinkFile) {
        this.premierPDFLinkFile = premierPDFLinkFile;
    }
}

public static class DemographicsCategory {
    private String category;
    private boolean board_members_not_collected;
    private boolean staff_not_collected;
    private boolean senior_staff_not_collected;
    private List<DemographicsSubcategory> subcategories;

    public DemographicsCategory() {}

    public DemographicsCategory(String category, boolean board_members_not_collected, boolean staff_not_collected, boolean senior_staff_not_collected, List<DemographicsSubcategory> subcategories) {
        this.category = category;
        this.board_members_not_collected = board_members_not_collected;
        this.staff_not_collected = staff_not_collected;
        this.senior_staff_not_collected = senior_staff_not_collected;
        this.subcategories = subcategories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getBoard_members_not_collected() {
        return board_members_not_collected;
    }

    public void setBoard_members_not_collected(boolean board_members_not_collected) {
        this.board_members_not_collected = board_members_not_collected;
    }

    public boolean getStaff_not_collected() {
        return staff_not_collected;
    }

    public void setStaff_not_collected(boolean staff_not_collected) {
        this.staff_not_collected = staff_not_collected;
    }

    public boolean getSenior_staff_not_collected() {
        return senior_staff_not_collected;
    }

    public void setSenior_staff_not_collected(boolean senior_staff_not_collected) {
        this.senior_staff_not_collected = senior_staff_not_collected;
    }

    public List<DemographicsSubcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<DemographicsSubcategory> subcategories) {
        this.subcategories = subcategories;
    }
}

public static class DemographicsData {
    private DemographicsSummary summary;
    private DemographicsDetails demographics;

    public DemographicsData() {}

    public DemographicsData(DemographicsSummary summary, DemographicsDetails demographics) {
        this.summary = summary;
        this.demographics = demographics;
    }

    public DemographicsSummary getSummary() {
        return summary;
    }

    public void setSummary(DemographicsSummary summary) {
        this.summary = summary;
    }

    public DemographicsDetails getDemographics() {
        return demographics;
    }

    public void setDemographics(DemographicsDetails demographics) {
        this.demographics = demographics;
    }
}

public static class DemographicsDetails {
    private DemographicsStaffLevelTotals staff_level_totals;
    private List<DemographicsCategory> categories;

    public DemographicsDetails() {}

    public DemographicsDetails(DemographicsStaffLevelTotals staff_level_totals, List<DemographicsCategory> categories) {
        this.staff_level_totals = staff_level_totals;
        this.categories = categories;
    }

    public DemographicsStaffLevelTotals getStaff_level_totals() {
        return staff_level_totals;
    }

    public void setStaff_level_totals(DemographicsStaffLevelTotals staff_level_totals) {
        this.staff_level_totals = staff_level_totals;
    }

    public List<DemographicsCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<DemographicsCategory> categories) {
        this.categories = categories;
    }
}

public static class DemographicsResponse {
    private int code;
    private String message;
    private int took;
    private List<Object> errors;
    private DemographicsData data;

    public DemographicsResponse() {}

    public DemographicsResponse(int code, String message, int took, List<Object> errors, DemographicsData data) {
        this.code = code;
        this.message = message;
        this.took = took;
        this.errors = errors;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTook() {
        return took;
    }

    public void setTook(int took) {
        this.took = took;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public DemographicsData getData() {
        return data;
    }

    public void setData(DemographicsData data) {
        this.data = data;
    }
}

public static class DemographicsStaffLevelTotals {
    private String total_board_members;
    private String total_staff;
    private String total_senior_staff;

    public DemographicsStaffLevelTotals() {}

    public DemographicsStaffLevelTotals(String total_board_members, String total_staff, String total_senior_staff) {
        this.total_board_members = total_board_members;
        this.total_staff = total_staff;
        this.total_senior_staff = total_senior_staff;
    }

    public String getTotal_board_members() {
        return total_board_members;
    }

    public void setTotal_board_members(String total_board_members) {
        this.total_board_members = total_board_members;
    }

    public String getTotal_staff() {
        return total_staff;
    }

    public void setTotal_staff(String total_staff) {
        this.total_staff = total_staff;
    }

    public String getTotal_senior_staff() {
        return total_senior_staff;
    }

    public void setTotal_senior_staff(String total_senior_staff) {
        this.total_senior_staff = total_senior_staff;
    }
}

public static class DemographicsSubcategory {
    private String subcategory;
    private int board_members;
    private int staff;
    private int senior_staff;
    private boolean reported_by_ceo;
    private boolean reported_by_coceo;

    public DemographicsSubcategory() {}

    public DemographicsSubcategory(String subcategory, int board_members, int staff, int senior_staff, boolean reported_by_ceo, boolean reported_by_coceo) {
        this.subcategory = subcategory;
        this.board_members = board_members;
        this.staff = staff;
        this.senior_staff = senior_staff;
        this.reported_by_ceo = reported_by_ceo;
        this.reported_by_coceo = reported_by_coceo;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public int getBoard_members() {
        return board_members;
    }

    public void setBoard_members(int board_members) {
        this.board_members = board_members;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public int getSenior_staff() {
        return senior_staff;
    }

    public void setSenior_staff(int senior_staff) {
        this.senior_staff = senior_staff;
    }

    public boolean getReported_by_ceo() {
        return reported_by_ceo;
    }

    public void setReported_by_ceo(boolean reported_by_ceo) {
        this.reported_by_ceo = reported_by_ceo;
    }

    public boolean getReported_by_coceo() {
        return reported_by_coceo;
    }

    public void setReported_by_coceo(boolean reported_by_coceo) {
        this.reported_by_coceo = reported_by_coceo;
    }
}

public static class DemographicsSummary {
    private String organization_name;
    private String ein;
    private String city;
    private String state;
    private String demographics_status;
    private String date_last_modified;

    public DemographicsSummary() {}

    public DemographicsSummary(String organization_name, String ein, String city, String state, String demographics_status, String date_last_modified) {
        this.organization_name = organization_name;
        this.ein = ein;
        this.city = city;
        this.state = state;
        this.demographics_status = demographics_status;
        this.date_last_modified = date_last_modified;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDemographics_status() {
        return demographics_status;
    }

    public void setDemographics_status(String demographics_status) {
        this.demographics_status = demographics_status;
    }

    public String getDate_last_modified() {
        return date_last_modified;
    }

    public void setDate_last_modified(String date_last_modified) {
        this.date_last_modified = date_last_modified;
    }
}

public static class PremierAccountingRatio {
    private int year;
    private String months_of_cash;
    private String liquidity;
    private String fringe_rate;
    private String net_gain_loss;

    public PremierAccountingRatio() {}

    public PremierAccountingRatio(int year, String months_of_cash, String liquidity, String fringe_rate, String net_gain_loss) {
        this.year = year;
        this.months_of_cash = months_of_cash;
        this.liquidity = liquidity;
        this.fringe_rate = fringe_rate;
        this.net_gain_loss = net_gain_loss;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonths_of_cash() {
        return months_of_cash;
    }

    public void setMonths_of_cash(String months_of_cash) {
        this.months_of_cash = months_of_cash;
    }

    public String getLiquidity() {
        return liquidity;
    }

    public void setLiquidity(String liquidity) {
        this.liquidity = liquidity;
    }

    public String getFringe_rate() {
        return fringe_rate;
    }

    public void setFringe_rate(String fringe_rate) {
        this.fringe_rate = fringe_rate;
    }

    public String getNet_gain_loss() {
        return net_gain_loss;
    }

    public void setNet_gain_loss(String net_gain_loss) {
        this.net_gain_loss = net_gain_loss;
    }
}

public static class PremierAccreditation {
    private String accreditation;
    private String year;

    public PremierAccreditation() {}

    public PremierAccreditation(String accreditation, String year) {
        this.accreditation = accreditation;
        this.year = year;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

public static class PremierAddress {
    private String address_line_1;
    private String address_line_2;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private String address_type;

    public PremierAddress() {}

    public PremierAddress(String address_line_1, String address_line_2, String city, String state, String postal_code, String country, String address_type) {
        this.address_line_1 = address_line_1;
        this.address_line_2 = address_line_2;
        this.city = city;
        this.state = state;
        this.postal_code = postal_code;
        this.country = country;
        this.address_type = address_type;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }
}

public static class PremierAnnualReport {
    private String doc_name;
    private String contents;
    private String year;
    private String url;

    public PremierAnnualReport() {}

    public PremierAnnualReport(String doc_name, String contents, String year, String url) {
        this.doc_name = doc_name;
        this.contents = contents;
        this.year = year;
        this.url = url;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class PremierBalanceSheetComposition {
    private int cash;
    private int investments;
    private int receivables;
    private int gross_land_buildings_and_equipment_lbe;
    private String accumulated_depreciation_as_percent_of_lbe;
    private String liabilities_as_percent_of_net_assets;
    private int unrestricted_net_assets;
    private int temporarily_restricted_net_assets;
    private int permanently_restricted_net_assets;
    private int restricted_net_assets;
    private int total_net_assets;

    public PremierBalanceSheetComposition() {}

    public PremierBalanceSheetComposition(int cash, int investments, int receivables, int gross_land_buildings_and_equipment_lbe, String accumulated_depreciation_as_percent_of_lbe, String liabilities_as_percent_of_net_assets, int unrestricted_net_assets, int temporarily_restricted_net_assets, int permanently_restricted_net_assets, int restricted_net_assets, int total_net_assets) {
        this.cash = cash;
        this.investments = investments;
        this.receivables = receivables;
        this.gross_land_buildings_and_equipment_lbe = gross_land_buildings_and_equipment_lbe;
        this.accumulated_depreciation_as_percent_of_lbe = accumulated_depreciation_as_percent_of_lbe;
        this.liabilities_as_percent_of_net_assets = liabilities_as_percent_of_net_assets;
        this.unrestricted_net_assets = unrestricted_net_assets;
        this.temporarily_restricted_net_assets = temporarily_restricted_net_assets;
        this.permanently_restricted_net_assets = permanently_restricted_net_assets;
        this.restricted_net_assets = restricted_net_assets;
        this.total_net_assets = total_net_assets;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getInvestments() {
        return investments;
    }

    public void setInvestments(int investments) {
        this.investments = investments;
    }

    public int getReceivables() {
        return receivables;
    }

    public void setReceivables(int receivables) {
        this.receivables = receivables;
    }

    public int getGross_land_buildings_and_equipment_lbe() {
        return gross_land_buildings_and_equipment_lbe;
    }

    public void setGross_land_buildings_and_equipment_lbe(int gross_land_buildings_and_equipment_lbe) {
        this.gross_land_buildings_and_equipment_lbe = gross_land_buildings_and_equipment_lbe;
    }

    public String getAccumulated_depreciation_as_percent_of_lbe() {
        return accumulated_depreciation_as_percent_of_lbe;
    }

    public void setAccumulated_depreciation_as_percent_of_lbe(String accumulated_depreciation_as_percent_of_lbe) {
        this.accumulated_depreciation_as_percent_of_lbe = accumulated_depreciation_as_percent_of_lbe;
    }

    public String getLiabilities_as_percent_of_net_assets() {
        return liabilities_as_percent_of_net_assets;
    }

    public void setLiabilities_as_percent_of_net_assets(String liabilities_as_percent_of_net_assets) {
        this.liabilities_as_percent_of_net_assets = liabilities_as_percent_of_net_assets;
    }

    public int getUnrestricted_net_assets() {
        return unrestricted_net_assets;
    }

    public void setUnrestricted_net_assets(int unrestricted_net_assets) {
        this.unrestricted_net_assets = unrestricted_net_assets;
    }

    public int getTemporarily_restricted_net_assets() {
        return temporarily_restricted_net_assets;
    }

    public void setTemporarily_restricted_net_assets(int temporarily_restricted_net_assets) {
        this.temporarily_restricted_net_assets = temporarily_restricted_net_assets;
    }

    public int getPermanently_restricted_net_assets() {
        return permanently_restricted_net_assets;
    }

    public void setPermanently_restricted_net_assets(int permanently_restricted_net_assets) {
        this.permanently_restricted_net_assets = permanently_restricted_net_assets;
    }

    public int getRestricted_net_assets() {
        return restricted_net_assets;
    }

    public void setRestricted_net_assets(int restricted_net_assets) {
        this.restricted_net_assets = restricted_net_assets;
    }

    public int getTotal_net_assets() {
        return total_net_assets;
    }

    public void setTotal_net_assets(int total_net_assets) {
        this.total_net_assets = total_net_assets;
    }
}

public static class PremierBoardLeadershipPractice {
    private String question;
    private String answer;

    public PremierBoardLeadershipPractice() {}

    public PremierBoardLeadershipPractice(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

public static class PremierBoardOfDirector {
    private String name;
    private String title;
    private String company;

    public PremierBoardOfDirector() {}

    public PremierBoardOfDirector(String name, String title, String company) {
        this.name = name;
        this.title = title;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

public static class PremierBusinessModelIndicators {
    private PremierProfitability profitability;
    private PremierRevenueComposition revenue_composition;
    private PremierExpenseComposition expense_composition;
    private PremierFullCostComponents full_cost_components;

    public PremierBusinessModelIndicators() {}

    public PremierBusinessModelIndicators(PremierProfitability profitability, PremierRevenueComposition revenue_composition, PremierExpenseComposition expense_composition, PremierFullCostComponents full_cost_components) {
        this.profitability = profitability;
        this.revenue_composition = revenue_composition;
        this.expense_composition = expense_composition;
        this.full_cost_components = full_cost_components;
    }

    public PremierProfitability getProfitability() {
        return profitability;
    }

    public void setProfitability(PremierProfitability profitability) {
        this.profitability = profitability;
    }

    public PremierRevenueComposition getRevenue_composition() {
        return revenue_composition;
    }

    public void setRevenue_composition(PremierRevenueComposition revenue_composition) {
        this.revenue_composition = revenue_composition;
    }

    public PremierExpenseComposition getExpense_composition() {
        return expense_composition;
    }

    public void setExpense_composition(PremierExpenseComposition expense_composition) {
        this.expense_composition = expense_composition;
    }

    public PremierFullCostComponents getFull_cost_components() {
        return full_cost_components;
    }

    public void setFull_cost_components(PremierFullCostComponents full_cost_components) {
        this.full_cost_components = full_cost_components;
    }
}

public static class PremierCapitalStructureIndicators {
    private PremierLiquidity liquidity;
    private PremierBalanceSheetComposition balance_sheet_composition;

    public PremierCapitalStructureIndicators() {}

    public PremierCapitalStructureIndicators(PremierLiquidity liquidity, PremierBalanceSheetComposition balance_sheet_composition) {
        this.liquidity = liquidity;
        this.balance_sheet_composition = balance_sheet_composition;
    }

    public PremierLiquidity getLiquidity() {
        return liquidity;
    }

    public void setLiquidity(PremierLiquidity liquidity) {
        this.liquidity = liquidity;
    }

    public PremierBalanceSheetComposition getBalance_sheet_composition() {
        return balance_sheet_composition;
    }

    public void setBalance_sheet_composition(PremierBalanceSheetComposition balance_sheet_composition) {
        this.balance_sheet_composition = balance_sheet_composition;
    }
}

public static class PremierCategory {
    private String category;
    private boolean board_members_not_collected;
    private boolean staff_not_collected;
    private boolean senior_staff_not_collected;
    private List<PremierSubcategory> subcategories;
    private PremierOrgDoesNotCollectFor org_does_not_collect_for;

    public PremierCategory() {}

    public PremierCategory(String category, boolean board_members_not_collected, boolean staff_not_collected, boolean senior_staff_not_collected, List<PremierSubcategory> subcategories, PremierOrgDoesNotCollectFor org_does_not_collect_for) {
        this.category = category;
        this.board_members_not_collected = board_members_not_collected;
        this.staff_not_collected = staff_not_collected;
        this.senior_staff_not_collected = senior_staff_not_collected;
        this.subcategories = subcategories;
        this.org_does_not_collect_for = org_does_not_collect_for;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean getBoard_members_not_collected() {
        return board_members_not_collected;
    }

    public void setBoard_members_not_collected(boolean board_members_not_collected) {
        this.board_members_not_collected = board_members_not_collected;
    }

    public boolean getStaff_not_collected() {
        return staff_not_collected;
    }

    public void setStaff_not_collected(boolean staff_not_collected) {
        this.staff_not_collected = staff_not_collected;
    }

    public boolean getSenior_staff_not_collected() {
        return senior_staff_not_collected;
    }

    public void setSenior_staff_not_collected(boolean senior_staff_not_collected) {
        this.senior_staff_not_collected = senior_staff_not_collected;
    }

    public List<PremierSubcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<PremierSubcategory> subcategories) {
        this.subcategories = subcategories;
    }

    public PremierOrgDoesNotCollectFor getOrg_does_not_collect_for() {
        return org_does_not_collect_for;
    }

    public void setOrg_does_not_collect_for(PremierOrgDoesNotCollectFor org_does_not_collect_for) {
        this.org_does_not_collect_for = org_does_not_collect_for;
    }
}

public static class PremierCharitycheck {
    private String organization_id;
    private String organization_info_last_modified;
    private String ein;
    private String organization_name;
    private String organization_name_aka;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String state_name;
    private String zip;
    private String filing_req_code;
    private String charity_check_last_modified;
    private Object pub78_church_message;
    private String pub78_organization_name;
    private String pub78_ein;
    private String pub78_verified;
    private String pub78_city;
    private String pub78_state;
    private String pub78_indicator;
    private List<PremierOrganizationType> organization_types;
    private String most_recent_pub78;
    private String most_recent_irb;
    private Object bmf_church_message;
    private String bmf_organization_name;
    private String bmf_ein;
    private String bmf_status;
    private String most_recent_bmf;
    private String bmf_subsection;
    private String subsection_description;
    private String foundation_code;
    private String foundation_code_description;
    private String ruling_month;
    private String ruling_year;
    private String adv_ruling_month;
    private String adv_ruling_year;
    private String group_exemption;
    private String exempt_status_code;
    private String ofac_status;
    private String revocation_code;
    private String revocation_date;
    private String reinstatement_date;
    private String irs_bmf_pub78_conflict;
    private String foundation_509a_status;
    private String irb_organization_id;
    private String bulletin_number;
    private String bulletin_url;
    private String effective_date;
    private String irb_last_modified;
    private String report_date;
    private String foundation_type_code;
    private String foundation_type_description;
    private List<Object> parent_organizations;

    public PremierCharitycheck() {}

    public PremierCharitycheck(String organization_id, String organization_info_last_modified, String ein, String organization_name, String organization_name_aka, String address_line1, String address_line2, String city, String state, String state_name, String zip, String filing_req_code, String charity_check_last_modified, Object pub78_church_message, String pub78_organization_name, String pub78_ein, String pub78_verified, String pub78_city, String pub78_state, String pub78_indicator, List<PremierOrganizationType> organization_types, String most_recent_pub78, String most_recent_irb, Object bmf_church_message, String bmf_organization_name, String bmf_ein, String bmf_status, String most_recent_bmf, String bmf_subsection, String subsection_description, String foundation_code, String foundation_code_description, String ruling_month, String ruling_year, String adv_ruling_month, String adv_ruling_year, String group_exemption, String exempt_status_code, String ofac_status, String revocation_code, String revocation_date, String reinstatement_date, String irs_bmf_pub78_conflict, String foundation_509a_status, String irb_organization_id, String bulletin_number, String bulletin_url, String effective_date, String irb_last_modified, String report_date, String foundation_type_code, String foundation_type_description, List<Object> parent_organizations) {
        this.organization_id = organization_id;
        this.organization_info_last_modified = organization_info_last_modified;
        this.ein = ein;
        this.organization_name = organization_name;
        this.organization_name_aka = organization_name_aka;
        this.address_line1 = address_line1;
        this.address_line2 = address_line2;
        this.city = city;
        this.state = state;
        this.state_name = state_name;
        this.zip = zip;
        this.filing_req_code = filing_req_code;
        this.charity_check_last_modified = charity_check_last_modified;
        this.pub78_church_message = pub78_church_message;
        this.pub78_organization_name = pub78_organization_name;
        this.pub78_ein = pub78_ein;
        this.pub78_verified = pub78_verified;
        this.pub78_city = pub78_city;
        this.pub78_state = pub78_state;
        this.pub78_indicator = pub78_indicator;
        this.organization_types = organization_types;
        this.most_recent_pub78 = most_recent_pub78;
        this.most_recent_irb = most_recent_irb;
        this.bmf_church_message = bmf_church_message;
        this.bmf_organization_name = bmf_organization_name;
        this.bmf_ein = bmf_ein;
        this.bmf_status = bmf_status;
        this.most_recent_bmf = most_recent_bmf;
        this.bmf_subsection = bmf_subsection;
        this.subsection_description = subsection_description;
        this.foundation_code = foundation_code;
        this.foundation_code_description = foundation_code_description;
        this.ruling_month = ruling_month;
        this.ruling_year = ruling_year;
        this.adv_ruling_month = adv_ruling_month;
        this.adv_ruling_year = adv_ruling_year;
        this.group_exemption = group_exemption;
        this.exempt_status_code = exempt_status_code;
        this.ofac_status = ofac_status;
        this.revocation_code = revocation_code;
        this.revocation_date = revocation_date;
        this.reinstatement_date = reinstatement_date;
        this.irs_bmf_pub78_conflict = irs_bmf_pub78_conflict;
        this.foundation_509a_status = foundation_509a_status;
        this.irb_organization_id = irb_organization_id;
        this.bulletin_number = bulletin_number;
        this.bulletin_url = bulletin_url;
        this.effective_date = effective_date;
        this.irb_last_modified = irb_last_modified;
        this.report_date = report_date;
        this.foundation_type_code = foundation_type_code;
        this.foundation_type_description = foundation_type_description;
        this.parent_organizations = parent_organizations;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getOrganization_info_last_modified() {
        return organization_info_last_modified;
    }

    public void setOrganization_info_last_modified(String organization_info_last_modified) {
        this.organization_info_last_modified = organization_info_last_modified;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getOrganization_name_aka() {
        return organization_name_aka;
    }

    public void setOrganization_name_aka(String organization_name_aka) {
        this.organization_name_aka = organization_name_aka;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getFiling_req_code() {
        return filing_req_code;
    }

    public void setFiling_req_code(String filing_req_code) {
        this.filing_req_code = filing_req_code;
    }

    public String getCharity_check_last_modified() {
        return charity_check_last_modified;
    }

    public void setCharity_check_last_modified(String charity_check_last_modified) {
        this.charity_check_last_modified = charity_check_last_modified;
    }

    public Object getPub78_church_message() {
        return pub78_church_message;
    }

    public void setPub78_church_message(Object pub78_church_message) {
        this.pub78_church_message = pub78_church_message;
    }

    public String getPub78_organization_name() {
        return pub78_organization_name;
    }

    public void setPub78_organization_name(String pub78_organization_name) {
        this.pub78_organization_name = pub78_organization_name;
    }

    public String getPub78_ein() {
        return pub78_ein;
    }

    public void setPub78_ein(String pub78_ein) {
        this.pub78_ein = pub78_ein;
    }

    public String getPub78_verified() {
        return pub78_verified;
    }

    public void setPub78_verified(String pub78_verified) {
        this.pub78_verified = pub78_verified;
    }

    public String getPub78_city() {
        return pub78_city;
    }

    public void setPub78_city(String pub78_city) {
        this.pub78_city = pub78_city;
    }

    public String getPub78_state() {
        return pub78_state;
    }

    public void setPub78_state(String pub78_state) {
        this.pub78_state = pub78_state;
    }

    public String getPub78_indicator() {
        return pub78_indicator;
    }

    public void setPub78_indicator(String pub78_indicator) {
        this.pub78_indicator = pub78_indicator;
    }

    public List<PremierOrganizationType> getOrganization_types() {
        return organization_types;
    }

    public void setOrganization_types(List<PremierOrganizationType> organization_types) {
        this.organization_types = organization_types;
    }

    public String getMost_recent_pub78() {
        return most_recent_pub78;
    }

    public void setMost_recent_pub78(String most_recent_pub78) {
        this.most_recent_pub78 = most_recent_pub78;
    }

    public String getMost_recent_irb() {
        return most_recent_irb;
    }

    public void setMost_recent_irb(String most_recent_irb) {
        this.most_recent_irb = most_recent_irb;
    }

    public Object getBmf_church_message() {
        return bmf_church_message;
    }

    public void setBmf_church_message(Object bmf_church_message) {
        this.bmf_church_message = bmf_church_message;
    }

    public String getBmf_organization_name() {
        return bmf_organization_name;
    }

    public void setBmf_organization_name(String bmf_organization_name) {
        this.bmf_organization_name = bmf_organization_name;
    }

    public String getBmf_ein() {
        return bmf_ein;
    }

    public void setBmf_ein(String bmf_ein) {
        this.bmf_ein = bmf_ein;
    }

    public String getBmf_status() {
        return bmf_status;
    }

    public void setBmf_status(String bmf_status) {
        this.bmf_status = bmf_status;
    }

    public String getMost_recent_bmf() {
        return most_recent_bmf;
    }

    public void setMost_recent_bmf(String most_recent_bmf) {
        this.most_recent_bmf = most_recent_bmf;
    }

    public String getBmf_subsection() {
        return bmf_subsection;
    }

    public void setBmf_subsection(String bmf_subsection) {
        this.bmf_subsection = bmf_subsection;
    }

    public String getSubsection_description() {
        return subsection_description;
    }

    public void setSubsection_description(String subsection_description) {
        this.subsection_description = subsection_description;
    }

    public String getFoundation_code() {
        return foundation_code;
    }

    public void setFoundation_code(String foundation_code) {
        this.foundation_code = foundation_code;
    }

    public String getFoundation_code_description() {
        return foundation_code_description;
    }

    public void setFoundation_code_description(String foundation_code_description) {
        this.foundation_code_description = foundation_code_description;
    }

    public String getRuling_month() {
        return ruling_month;
    }

    public void setRuling_month(String ruling_month) {
        this.ruling_month = ruling_month;
    }

    public String getRuling_year() {
        return ruling_year;
    }

    public void setRuling_year(String ruling_year) {
        this.ruling_year = ruling_year;
    }

    public String getAdv_ruling_month() {
        return adv_ruling_month;
    }

    public void setAdv_ruling_month(String adv_ruling_month) {
        this.adv_ruling_month = adv_ruling_month;
    }

    public String getAdv_ruling_year() {
        return adv_ruling_year;
    }

    public void setAdv_ruling_year(String adv_ruling_year) {
        this.adv_ruling_year = adv_ruling_year;
    }

    public String getGroup_exemption() {
        return group_exemption;
    }

    public void setGroup_exemption(String group_exemption) {
        this.group_exemption = group_exemption;
    }

    public String getExempt_status_code() {
        return exempt_status_code;
    }

    public void setExempt_status_code(String exempt_status_code) {
        this.exempt_status_code = exempt_status_code;
    }

    public String getOfac_status() {
        return ofac_status;
    }

    public void setOfac_status(String ofac_status) {
        this.ofac_status = ofac_status;
    }

    public String getRevocation_code() {
        return revocation_code;
    }

    public void setRevocation_code(String revocation_code) {
        this.revocation_code = revocation_code;
    }

    public String getRevocation_date() {
        return revocation_date;
    }

    public void setRevocation_date(String revocation_date) {
        this.revocation_date = revocation_date;
    }

    public String getReinstatement_date() {
        return reinstatement_date;
    }

    public void setReinstatement_date(String reinstatement_date) {
        this.reinstatement_date = reinstatement_date;
    }

    public String getIrs_bmf_pub78_conflict() {
        return irs_bmf_pub78_conflict;
    }

    public void setIrs_bmf_pub78_conflict(String irs_bmf_pub78_conflict) {
        this.irs_bmf_pub78_conflict = irs_bmf_pub78_conflict;
    }

    public String getFoundation_509a_status() {
        return foundation_509a_status;
    }

    public void setFoundation_509a_status(String foundation_509a_status) {
        this.foundation_509a_status = foundation_509a_status;
    }

    public String getIrb_organization_id() {
        return irb_organization_id;
    }

    public void setIrb_organization_id(String irb_organization_id) {
        this.irb_organization_id = irb_organization_id;
    }

    public String getBulletin_number() {
        return bulletin_number;
    }

    public void setBulletin_number(String bulletin_number) {
        this.bulletin_number = bulletin_number;
    }

    public String getBulletin_url() {
        return bulletin_url;
    }

    public void setBulletin_url(String bulletin_url) {
        this.bulletin_url = bulletin_url;
    }

    public String getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(String effective_date) {
        this.effective_date = effective_date;
    }

    public String getIrb_last_modified() {
        return irb_last_modified;
    }

    public void setIrb_last_modified(String irb_last_modified) {
        this.irb_last_modified = irb_last_modified;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getFoundation_type_code() {
        return foundation_type_code;
    }

    public void setFoundation_type_code(String foundation_type_code) {
        this.foundation_type_code = foundation_type_code;
    }

    public String getFoundation_type_description() {
        return foundation_type_description;
    }

    public void setFoundation_type_description(String foundation_type_description) {
        this.foundation_type_description = foundation_type_description;
    }

    public List<Object> getParent_organizations() {
        return parent_organizations;
    }

    public void setParent_organizations(List<Object> parent_organizations) {
        this.parent_organizations = parent_organizations;
    }
}

public static class PremierChartingImpactAnswer {
    private String question;
    private String answer;

    public PremierChartingImpactAnswer() {}

    public PremierChartingImpactAnswer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

public static class PremierContractor {
    private String name;
    private String address;
    private String compensation;
    private String service_type;

    public PremierContractor() {}

    public PremierContractor(String name, String address, String compensation, String service_type) {
        this.name = name;
        this.address = address;
        this.compensation = compensation;
        this.service_type = service_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompensation() {
        return compensation;
    }

    public void setCompensation(String compensation) {
        this.compensation = compensation;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }
}

public static class PremierData {
    private PremierSummary summary;
    private PremierPrograms programs;
    private PremierFinancials financials;
    private PremierOperations operations;
    private PremierCharitycheck charitycheck;

    public PremierData() {}

    public PremierData(PremierSummary summary, PremierPrograms programs, PremierFinancials financials, PremierOperations operations, PremierCharitycheck charitycheck) {
        this.summary = summary;
        this.programs = programs;
        this.financials = financials;
        this.operations = operations;
        this.charitycheck = charitycheck;
    }

    public PremierSummary getSummary() {
        return summary;
    }

    public void setSummary(PremierSummary summary) {
        this.summary = summary;
    }

    public PremierPrograms getPrograms() {
        return programs;
    }

    public void setPrograms(PremierPrograms programs) {
        this.programs = programs;
    }

    public PremierFinancials getFinancials() {
        return financials;
    }

    public void setFinancials(PremierFinancials financials) {
        this.financials = financials;
    }

    public PremierOperations getOperations() {
        return operations;
    }

    public void setOperations(PremierOperations operations) {
        this.operations = operations;
    }

    public PremierCharitycheck getCharitycheck() {
        return charitycheck;
    }

    public void setCharitycheck(PremierCharitycheck charitycheck) {
        this.charitycheck = charitycheck;
    }
}

public static class PremierDemographics {
    private PremierStaffLevelTotals staff_level_totals;
    private PremierEquityStrategies equity_strategies;
    private List<PremierCategory> categories;

    public PremierDemographics() {}

    public PremierDemographics(PremierStaffLevelTotals staff_level_totals, PremierEquityStrategies equity_strategies, List<PremierCategory> categories) {
        this.staff_level_totals = staff_level_totals;
        this.equity_strategies = equity_strategies;
        this.categories = categories;
    }

    public PremierStaffLevelTotals getStaff_level_totals() {
        return staff_level_totals;
    }

    public void setStaff_level_totals(PremierStaffLevelTotals staff_level_totals) {
        this.staff_level_totals = staff_level_totals;
    }

    public PremierEquityStrategies getEquity_strategies() {
        return equity_strategies;
    }

    public void setEquity_strategies(PremierEquityStrategies equity_strategies) {
        this.equity_strategies = equity_strategies;
    }

    public List<PremierCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<PremierCategory> categories) {
        this.categories = categories;
    }
}

public static class PremierEquityStrategies {
    private boolean data_compensation;
    private boolean data_disparities;
    private Object data_root_cause;
    private Object data_programming_goals;
    private boolean data_feedback;
    private Object data_demographics;
    private boolean data_strategic_plan;
    private boolean policy_standards;
    private boolean policy_promotion;
    private boolean policy_evaluation;
    private Object policy_community;
    private boolean policy_leadership;
    private boolean policy_satisfaction;
    private boolean policy_equity;
    private String equity_strategy_last_modified;

    public PremierEquityStrategies() {}

    public PremierEquityStrategies(boolean data_compensation, boolean data_disparities, Object data_root_cause, Object data_programming_goals, boolean data_feedback, Object data_demographics, boolean data_strategic_plan, boolean policy_standards, boolean policy_promotion, boolean policy_evaluation, Object policy_community, boolean policy_leadership, boolean policy_satisfaction, boolean policy_equity, String equity_strategy_last_modified) {
        this.data_compensation = data_compensation;
        this.data_disparities = data_disparities;
        this.data_root_cause = data_root_cause;
        this.data_programming_goals = data_programming_goals;
        this.data_feedback = data_feedback;
        this.data_demographics = data_demographics;
        this.data_strategic_plan = data_strategic_plan;
        this.policy_standards = policy_standards;
        this.policy_promotion = policy_promotion;
        this.policy_evaluation = policy_evaluation;
        this.policy_community = policy_community;
        this.policy_leadership = policy_leadership;
        this.policy_satisfaction = policy_satisfaction;
        this.policy_equity = policy_equity;
        this.equity_strategy_last_modified = equity_strategy_last_modified;
    }

    public boolean getData_compensation() {
        return data_compensation;
    }

    public void setData_compensation(boolean data_compensation) {
        this.data_compensation = data_compensation;
    }

    public boolean getData_disparities() {
        return data_disparities;
    }

    public void setData_disparities(boolean data_disparities) {
        this.data_disparities = data_disparities;
    }

    public Object getData_root_cause() {
        return data_root_cause;
    }

    public void setData_root_cause(Object data_root_cause) {
        this.data_root_cause = data_root_cause;
    }

    public Object getData_programming_goals() {
        return data_programming_goals;
    }

    public void setData_programming_goals(Object data_programming_goals) {
        this.data_programming_goals = data_programming_goals;
    }

    public boolean getData_feedback() {
        return data_feedback;
    }

    public void setData_feedback(boolean data_feedback) {
        this.data_feedback = data_feedback;
    }

    public Object getData_demographics() {
        return data_demographics;
    }

    public void setData_demographics(Object data_demographics) {
        this.data_demographics = data_demographics;
    }

    public boolean getData_strategic_plan() {
        return data_strategic_plan;
    }

    public void setData_strategic_plan(boolean data_strategic_plan) {
        this.data_strategic_plan = data_strategic_plan;
    }

    public boolean getPolicy_standards() {
        return policy_standards;
    }

    public void setPolicy_standards(boolean policy_standards) {
        this.policy_standards = policy_standards;
    }

    public boolean getPolicy_promotion() {
        return policy_promotion;
    }

    public void setPolicy_promotion(boolean policy_promotion) {
        this.policy_promotion = policy_promotion;
    }

    public boolean getPolicy_evaluation() {
        return policy_evaluation;
    }

    public void setPolicy_evaluation(boolean policy_evaluation) {
        this.policy_evaluation = policy_evaluation;
    }

    public Object getPolicy_community() {
        return policy_community;
    }

    public void setPolicy_community(Object policy_community) {
        this.policy_community = policy_community;
    }

    public boolean getPolicy_leadership() {
        return policy_leadership;
    }

    public void setPolicy_leadership(boolean policy_leadership) {
        this.policy_leadership = policy_leadership;
    }

    public boolean getPolicy_satisfaction() {
        return policy_satisfaction;
    }

    public void setPolicy_satisfaction(boolean policy_satisfaction) {
        this.policy_satisfaction = policy_satisfaction;
    }

    public boolean getPolicy_equity() {
        return policy_equity;
    }

    public void setPolicy_equity(boolean policy_equity) {
        this.policy_equity = policy_equity;
    }

    public String getEquity_strategy_last_modified() {
        return equity_strategy_last_modified;
    }

    public void setEquity_strategy_last_modified(String equity_strategy_last_modified) {
        this.equity_strategy_last_modified = equity_strategy_last_modified;
    }
}

public static class PremierExpenseComposition {
    private int total_expenses_before_depreciation;
    private String total_expenses_percent_change_over_prior_year;
    private String personnel;
    private String professional_fees;
    private String occupancy;
    private String interest_expense;
    private String pass_through;
    private String all_other_expenses;

    public PremierExpenseComposition() {}

    public PremierExpenseComposition(int total_expenses_before_depreciation, String total_expenses_percent_change_over_prior_year, String personnel, String professional_fees, String occupancy, String interest_expense, String pass_through, String all_other_expenses) {
        this.total_expenses_before_depreciation = total_expenses_before_depreciation;
        this.total_expenses_percent_change_over_prior_year = total_expenses_percent_change_over_prior_year;
        this.personnel = personnel;
        this.professional_fees = professional_fees;
        this.occupancy = occupancy;
        this.interest_expense = interest_expense;
        this.pass_through = pass_through;
        this.all_other_expenses = all_other_expenses;
    }

    public int getTotal_expenses_before_depreciation() {
        return total_expenses_before_depreciation;
    }

    public void setTotal_expenses_before_depreciation(int total_expenses_before_depreciation) {
        this.total_expenses_before_depreciation = total_expenses_before_depreciation;
    }

    public String getTotal_expenses_percent_change_over_prior_year() {
        return total_expenses_percent_change_over_prior_year;
    }

    public void setTotal_expenses_percent_change_over_prior_year(String total_expenses_percent_change_over_prior_year) {
        this.total_expenses_percent_change_over_prior_year = total_expenses_percent_change_over_prior_year;
    }

    public String getPersonnel() {
        return personnel;
    }

    public void setPersonnel(String personnel) {
        this.personnel = personnel;
    }

    public String getProfessional_fees() {
        return professional_fees;
    }

    public void setProfessional_fees(String professional_fees) {
        this.professional_fees = professional_fees;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getInterest_expense() {
        return interest_expense;
    }

    public void setInterest_expense(String interest_expense) {
        this.interest_expense = interest_expense;
    }

    public String getPass_through() {
        return pass_through;
    }

    public void setPass_through(String pass_through) {
        this.pass_through = pass_through;
    }

    public String getAll_other_expenses() {
        return all_other_expenses;
    }

    public void setAll_other_expenses(String all_other_expenses) {
        this.all_other_expenses = all_other_expenses;
    }
}

public static class PremierF990Financial {
    private String period_begin;
    private String period_end;
    private double membership_dues;
    private double revenue_contributions;
    private double revenue_govt_grants;
    private double revenue_program_services;
    private double revenue_investments;
    private double revenue_special_events;
    private double revenue_sales;
    private double revenue_other;
    private double revenue_total;
    private double affiliate_net_payments;
    private double expense_program_services;
    private double expense_administration;
    private double expense_fundraising;
    private double expenses_total;
    private double net_gain_loss;
    private double expense_accounting;
    private double expense_advertising_promotion;
    private double expense_info_technology;
    private double expense_insurance;
    private double expense_interest;
    private double expense_investment_management;
    private double expense_legal;
    private double expense_pension_plan;
    private double expense_publications;
    private double expense_profesional_fundraising;
    private double assets_total;
    private double unrestricted_net_assets;
    private double net_fixed_assets_LBE;
    private double net_assets_end_of_year;
    private double other_expense;
    private double notes_payable_mortgages;
    private double liabilities_total;
    private String months_of_cash;
    private PremierPart8Revenue part_8_revenue;
    private PremierPart9Expenses part_9_expenses;
    private PremierPart10BalanceSheet part_10_balance_sheet;

    public PremierF990Financial() {}

    public PremierF990Financial(String period_begin, String period_end, double membership_dues, double revenue_contributions, double revenue_govt_grants, double revenue_program_services, double revenue_investments, double revenue_special_events, double revenue_sales, double revenue_other, double revenue_total, double affiliate_net_payments, double expense_program_services, double expense_administration, double expense_fundraising, double expenses_total, double net_gain_loss, double expense_accounting, double expense_advertising_promotion, double expense_info_technology, double expense_insurance, double expense_interest, double expense_investment_management, double expense_legal, double expense_pension_plan, double expense_publications, double expense_profesional_fundraising, double assets_total, double unrestricted_net_assets, double net_fixed_assets_LBE, double net_assets_end_of_year, double other_expense, double notes_payable_mortgages, double liabilities_total, String months_of_cash, PremierPart8Revenue part_8_revenue, PremierPart9Expenses part_9_expenses, PremierPart10BalanceSheet part_10_balance_sheet) {
        this.period_begin = period_begin;
        this.period_end = period_end;
        this.membership_dues = membership_dues;
        this.revenue_contributions = revenue_contributions;
        this.revenue_govt_grants = revenue_govt_grants;
        this.revenue_program_services = revenue_program_services;
        this.revenue_investments = revenue_investments;
        this.revenue_special_events = revenue_special_events;
        this.revenue_sales = revenue_sales;
        this.revenue_other = revenue_other;
        this.revenue_total = revenue_total;
        this.affiliate_net_payments = affiliate_net_payments;
        this.expense_program_services = expense_program_services;
        this.expense_administration = expense_administration;
        this.expense_fundraising = expense_fundraising;
        this.expenses_total = expenses_total;
        this.net_gain_loss = net_gain_loss;
        this.expense_accounting = expense_accounting;
        this.expense_advertising_promotion = expense_advertising_promotion;
        this.expense_info_technology = expense_info_technology;
        this.expense_insurance = expense_insurance;
        this.expense_interest = expense_interest;
        this.expense_investment_management = expense_investment_management;
        this.expense_legal = expense_legal;
        this.expense_pension_plan = expense_pension_plan;
        this.expense_publications = expense_publications;
        this.expense_profesional_fundraising = expense_profesional_fundraising;
        this.assets_total = assets_total;
        this.unrestricted_net_assets = unrestricted_net_assets;
        this.net_fixed_assets_LBE = net_fixed_assets_LBE;
        this.net_assets_end_of_year = net_assets_end_of_year;
        this.other_expense = other_expense;
        this.notes_payable_mortgages = notes_payable_mortgages;
        this.liabilities_total = liabilities_total;
        this.months_of_cash = months_of_cash;
        this.part_8_revenue = part_8_revenue;
        this.part_9_expenses = part_9_expenses;
        this.part_10_balance_sheet = part_10_balance_sheet;
    }

    public String getPeriod_begin() {
        return period_begin;
    }

    public void setPeriod_begin(String period_begin) {
        this.period_begin = period_begin;
    }

    public String getPeriod_end() {
        return period_end;
    }

    public void setPeriod_end(String period_end) {
        this.period_end = period_end;
    }

    public double getMembership_dues() {
        return membership_dues;
    }

    public void setMembership_dues(double membership_dues) {
        this.membership_dues = membership_dues;
    }

    public double getRevenue_contributions() {
        return revenue_contributions;
    }

    public void setRevenue_contributions(double revenue_contributions) {
        this.revenue_contributions = revenue_contributions;
    }

    public double getRevenue_govt_grants() {
        return revenue_govt_grants;
    }

    public void setRevenue_govt_grants(double revenue_govt_grants) {
        this.revenue_govt_grants = revenue_govt_grants;
    }

    public double getRevenue_program_services() {
        return revenue_program_services;
    }

    public void setRevenue_program_services(double revenue_program_services) {
        this.revenue_program_services = revenue_program_services;
    }

    public double getRevenue_investments() {
        return revenue_investments;
    }

    public void setRevenue_investments(double revenue_investments) {
        this.revenue_investments = revenue_investments;
    }

    public double getRevenue_special_events() {
        return revenue_special_events;
    }

    public void setRevenue_special_events(double revenue_special_events) {
        this.revenue_special_events = revenue_special_events;
    }

    public double getRevenue_sales() {
        return revenue_sales;
    }

    public void setRevenue_sales(double revenue_sales) {
        this.revenue_sales = revenue_sales;
    }

    public double getRevenue_other() {
        return revenue_other;
    }

    public void setRevenue_other(double revenue_other) {
        this.revenue_other = revenue_other;
    }

    public double getRevenue_total() {
        return revenue_total;
    }

    public void setRevenue_total(double revenue_total) {
        this.revenue_total = revenue_total;
    }

    public double getAffiliate_net_payments() {
        return affiliate_net_payments;
    }

    public void setAffiliate_net_payments(double affiliate_net_payments) {
        this.affiliate_net_payments = affiliate_net_payments;
    }

    public double getExpense_program_services() {
        return expense_program_services;
    }

    public void setExpense_program_services(double expense_program_services) {
        this.expense_program_services = expense_program_services;
    }

    public double getExpense_administration() {
        return expense_administration;
    }

    public void setExpense_administration(double expense_administration) {
        this.expense_administration = expense_administration;
    }

    public double getExpense_fundraising() {
        return expense_fundraising;
    }

    public void setExpense_fundraising(double expense_fundraising) {
        this.expense_fundraising = expense_fundraising;
    }

    public double getExpenses_total() {
        return expenses_total;
    }

    public void setExpenses_total(double expenses_total) {
        this.expenses_total = expenses_total;
    }

    public double getNet_gain_loss() {
        return net_gain_loss;
    }

    public void setNet_gain_loss(double net_gain_loss) {
        this.net_gain_loss = net_gain_loss;
    }

    public double getExpense_accounting() {
        return expense_accounting;
    }

    public void setExpense_accounting(double expense_accounting) {
        this.expense_accounting = expense_accounting;
    }

    public double getExpense_advertising_promotion() {
        return expense_advertising_promotion;
    }

    public void setExpense_advertising_promotion(double expense_advertising_promotion) {
        this.expense_advertising_promotion = expense_advertising_promotion;
    }

    public double getExpense_info_technology() {
        return expense_info_technology;
    }

    public void setExpense_info_technology(double expense_info_technology) {
        this.expense_info_technology = expense_info_technology;
    }

    public double getExpense_insurance() {
        return expense_insurance;
    }

    public void setExpense_insurance(double expense_insurance) {
        this.expense_insurance = expense_insurance;
    }

    public double getExpense_interest() {
        return expense_interest;
    }

    public void setExpense_interest(double expense_interest) {
        this.expense_interest = expense_interest;
    }

    public double getExpense_investment_management() {
        return expense_investment_management;
    }

    public void setExpense_investment_management(double expense_investment_management) {
        this.expense_investment_management = expense_investment_management;
    }

    public double getExpense_legal() {
        return expense_legal;
    }

    public void setExpense_legal(double expense_legal) {
        this.expense_legal = expense_legal;
    }

    public double getExpense_pension_plan() {
        return expense_pension_plan;
    }

    public void setExpense_pension_plan(double expense_pension_plan) {
        this.expense_pension_plan = expense_pension_plan;
    }

    public double getExpense_publications() {
        return expense_publications;
    }

    public void setExpense_publications(double expense_publications) {
        this.expense_publications = expense_publications;
    }

    public double getExpense_profesional_fundraising() {
        return expense_profesional_fundraising;
    }

    public void setExpense_profesional_fundraising(double expense_profesional_fundraising) {
        this.expense_profesional_fundraising = expense_profesional_fundraising;
    }

    public double getAssets_total() {
        return assets_total;
    }

    public void setAssets_total(double assets_total) {
        this.assets_total = assets_total;
    }

    public double getUnrestricted_net_assets() {
        return unrestricted_net_assets;
    }

    public void setUnrestricted_net_assets(double unrestricted_net_assets) {
        this.unrestricted_net_assets = unrestricted_net_assets;
    }

    public double getNet_fixed_assets_LBE() {
        return net_fixed_assets_LBE;
    }

    public void setNet_fixed_assets_LBE(double net_fixed_assets_LBE) {
        this.net_fixed_assets_LBE = net_fixed_assets_LBE;
    }

    public double getNet_assets_end_of_year() {
        return net_assets_end_of_year;
    }

    public void setNet_assets_end_of_year(double net_assets_end_of_year) {
        this.net_assets_end_of_year = net_assets_end_of_year;
    }

    public double getOther_expense() {
        return other_expense;
    }

    public void setOther_expense(double other_expense) {
        this.other_expense = other_expense;
    }

    public double getNotes_payable_mortgages() {
        return notes_payable_mortgages;
    }

    public void setNotes_payable_mortgages(double notes_payable_mortgages) {
        this.notes_payable_mortgages = notes_payable_mortgages;
    }

    public double getLiabilities_total() {
        return liabilities_total;
    }

    public void setLiabilities_total(double liabilities_total) {
        this.liabilities_total = liabilities_total;
    }

    public String getMonths_of_cash() {
        return months_of_cash;
    }

    public void setMonths_of_cash(String months_of_cash) {
        this.months_of_cash = months_of_cash;
    }

    public PremierPart8Revenue getPart_8_revenue() {
        return part_8_revenue;
    }

    public void setPart_8_revenue(PremierPart8Revenue part_8_revenue) {
        this.part_8_revenue = part_8_revenue;
    }

    public PremierPart9Expenses getPart_9_expenses() {
        return part_9_expenses;
    }

    public void setPart_9_expenses(PremierPart9Expenses part_9_expenses) {
        this.part_9_expenses = part_9_expenses;
    }

    public PremierPart10BalanceSheet getPart_10_balance_sheet() {
        return part_10_balance_sheet;
    }

    public void setPart_10_balance_sheet(PremierPart10BalanceSheet part_10_balance_sheet) {
        this.part_10_balance_sheet = part_10_balance_sheet;
    }
}

public static class PremierFeedbackResponse {
    private String question_text;
    private String response_text;

    public PremierFeedbackResponse() {}

    public PremierFeedbackResponse(String question_text, String response_text) {
        this.question_text = question_text;
        this.response_text = response_text;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getResponse_text() {
        return response_text;
    }

    public void setResponse_text(String response_text) {
        this.response_text = response_text;
    }
}

public static class PremierFinancialDocument {
    private String form990_name;
    private String form990_year;
    private String form990_url;
    private String form990_source;

    public PremierFinancialDocument() {}

    public PremierFinancialDocument(String form990_name, String form990_year, String form990_url, String form990_source) {
        this.form990_name = form990_name;
        this.form990_year = form990_year;
        this.form990_url = form990_url;
        this.form990_source = form990_source;
    }

    public String getForm990_name() {
        return form990_name;
    }

    public void setForm990_name(String form990_name) {
        this.form990_name = form990_name;
    }

    public String getForm990_year() {
        return form990_year;
    }

    public void setForm990_year(String form990_year) {
        this.form990_year = form990_year;
    }

    public String getForm990_url() {
        return form990_url;
    }

    public void setForm990_url(String form990_url) {
        this.form990_url = form990_url;
    }

    public String getForm990_source() {
        return form990_source;
    }

    public void setForm990_source(String form990_source) {
        this.form990_source = form990_source;
    }
}

public static class PremierFinancialStatement {
    private String fiscal_year_begin;
    private String fiscal_year_end;
    private String auditing_company;
    private String doc_name;
    private String document_url;

    public PremierFinancialStatement() {}

    public PremierFinancialStatement(String fiscal_year_begin, String fiscal_year_end, String auditing_company, String doc_name, String document_url) {
        this.fiscal_year_begin = fiscal_year_begin;
        this.fiscal_year_end = fiscal_year_end;
        this.auditing_company = auditing_company;
        this.doc_name = doc_name;
        this.document_url = document_url;
    }

    public String getFiscal_year_begin() {
        return fiscal_year_begin;
    }

    public void setFiscal_year_begin(String fiscal_year_begin) {
        this.fiscal_year_begin = fiscal_year_begin;
    }

    public String getFiscal_year_end() {
        return fiscal_year_end;
    }

    public void setFiscal_year_end(String fiscal_year_end) {
        this.fiscal_year_end = fiscal_year_end;
    }

    public String getAuditing_company() {
        return auditing_company;
    }

    public void setAuditing_company(String auditing_company) {
        this.auditing_company = auditing_company;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDocument_url() {
        return document_url;
    }

    public void setDocument_url(String document_url) {
        this.document_url = document_url;
    }
}

public static class PremierFinancialTrendsAnalysis {
    private String fiscal_year;
    private PremierBusinessModelIndicators business_model_indicators;
    private PremierCapitalStructureIndicators capital_structure_indicators;
    private PremierKeyDataChecks key_data_checks;

    public PremierFinancialTrendsAnalysis() {}

    public PremierFinancialTrendsAnalysis(String fiscal_year, PremierBusinessModelIndicators business_model_indicators, PremierCapitalStructureIndicators capital_structure_indicators, PremierKeyDataChecks key_data_checks) {
        this.fiscal_year = fiscal_year;
        this.business_model_indicators = business_model_indicators;
        this.capital_structure_indicators = capital_structure_indicators;
        this.key_data_checks = key_data_checks;
    }

    public String getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(String fiscal_year) {
        this.fiscal_year = fiscal_year;
    }

    public PremierBusinessModelIndicators getBusiness_model_indicators() {
        return business_model_indicators;
    }

    public void setBusiness_model_indicators(PremierBusinessModelIndicators business_model_indicators) {
        this.business_model_indicators = business_model_indicators;
    }

    public PremierCapitalStructureIndicators getCapital_structure_indicators() {
        return capital_structure_indicators;
    }

    public void setCapital_structure_indicators(PremierCapitalStructureIndicators capital_structure_indicators) {
        this.capital_structure_indicators = capital_structure_indicators;
    }

    public PremierKeyDataChecks getKey_data_checks() {
        return key_data_checks;
    }

    public void setKey_data_checks(PremierKeyDataChecks key_data_checks) {
        this.key_data_checks = key_data_checks;
    }
}

public static class PremierFinancials {
    private PremierMostRecentYearFinancials most_recent_year_financials;
    private List<PremierF990Financial> f990_financials;
    private Object pf990_financials;
    private Object f990ez_financials;
    private List<PremierFinancialTrendsAnalysis> financial_trends_analysis;
    private List<PremierFinancialDocument> financial_documents;
    private List<PremierForms990T> forms_990T;
    private Object funding_needs;
    private List<PremierFundingSource> funding_sources;
    private List<PremierFinancialStatement> financial_statements;
    private List<PremierAnnualReport> annual_reports;
    private List<PremierAccountingRatio> accounting_ratios;

    public PremierFinancials() {}

    public PremierFinancials(PremierMostRecentYearFinancials most_recent_year_financials, List<PremierF990Financial> f990_financials, Object pf990_financials, Object f990ez_financials, List<PremierFinancialTrendsAnalysis> financial_trends_analysis, List<PremierFinancialDocument> financial_documents, List<PremierForms990T> forms_990T, Object funding_needs, List<PremierFundingSource> funding_sources, List<PremierFinancialStatement> financial_statements, List<PremierAnnualReport> annual_reports, List<PremierAccountingRatio> accounting_ratios) {
        this.most_recent_year_financials = most_recent_year_financials;
        this.f990_financials = f990_financials;
        this.pf990_financials = pf990_financials;
        this.f990ez_financials = f990ez_financials;
        this.financial_trends_analysis = financial_trends_analysis;
        this.financial_documents = financial_documents;
        this.forms_990T = forms_990T;
        this.funding_needs = funding_needs;
        this.funding_sources = funding_sources;
        this.financial_statements = financial_statements;
        this.annual_reports = annual_reports;
        this.accounting_ratios = accounting_ratios;
    }

    public PremierMostRecentYearFinancials getMost_recent_year_financials() {
        return most_recent_year_financials;
    }

    public void setMost_recent_year_financials(PremierMostRecentYearFinancials most_recent_year_financials) {
        this.most_recent_year_financials = most_recent_year_financials;
    }

    public List<PremierF990Financial> getF990_financials() {
        return f990_financials;
    }

    public void setF990_financials(List<PremierF990Financial> f990_financials) {
        this.f990_financials = f990_financials;
    }

    public Object getPf990_financials() {
        return pf990_financials;
    }

    public void setPf990_financials(Object pf990_financials) {
        this.pf990_financials = pf990_financials;
    }

    public Object getF990ez_financials() {
        return f990ez_financials;
    }

    public void setF990ez_financials(Object f990ez_financials) {
        this.f990ez_financials = f990ez_financials;
    }

    public List<PremierFinancialTrendsAnalysis> getFinancial_trends_analysis() {
        return financial_trends_analysis;
    }

    public void setFinancial_trends_analysis(List<PremierFinancialTrendsAnalysis> financial_trends_analysis) {
        this.financial_trends_analysis = financial_trends_analysis;
    }

    public List<PremierFinancialDocument> getFinancial_documents() {
        return financial_documents;
    }

    public void setFinancial_documents(List<PremierFinancialDocument> financial_documents) {
        this.financial_documents = financial_documents;
    }

    public List<PremierForms990T> getForms_990T() {
        return forms_990T;
    }

    public void setForms_990T(List<PremierForms990T> forms_990T) {
        this.forms_990T = forms_990T;
    }

    public Object getFunding_needs() {
        return funding_needs;
    }

    public void setFunding_needs(Object funding_needs) {
        this.funding_needs = funding_needs;
    }

    public List<PremierFundingSource> getFunding_sources() {
        return funding_sources;
    }

    public void setFunding_sources(List<PremierFundingSource> funding_sources) {
        this.funding_sources = funding_sources;
    }

    public List<PremierFinancialStatement> getFinancial_statements() {
        return financial_statements;
    }

    public void setFinancial_statements(List<PremierFinancialStatement> financial_statements) {
        this.financial_statements = financial_statements;
    }

    public List<PremierAnnualReport> getAnnual_reports() {
        return annual_reports;
    }

    public void setAnnual_reports(List<PremierAnnualReport> annual_reports) {
        this.annual_reports = annual_reports;
    }

    public List<PremierAccountingRatio> getAccounting_ratios() {
        return accounting_ratios;
    }

    public void setAccounting_ratios(List<PremierAccountingRatio> accounting_ratios) {
        this.accounting_ratios = accounting_ratios;
    }
}

public static class PremierFormerlyKnownA {
    private String former_name;
    private String year;

    public PremierFormerlyKnownA() {}

    public PremierFormerlyKnownA(String former_name, String year) {
        this.former_name = former_name;
        this.year = year;
    }

    public String getFormer_name() {
        return former_name;
    }

    public void setFormer_name(String former_name) {
        this.former_name = former_name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

public static class PremierForms990T {
    private String form990t_name;
    private String form990t_url;

    public PremierForms990T() {}

    public PremierForms990T(String form990t_name, String form990t_url) {
        this.form990t_name = form990t_name;
        this.form990t_url = form990t_url;
    }

    public String getForm990t_name() {
        return form990t_name;
    }

    public void setForm990t_name(String form990t_name) {
        this.form990t_name = form990t_name;
    }

    public String getForm990t_url() {
        return form990t_url;
    }

    public void setForm990t_url(String form990t_url) {
        this.form990t_url = form990t_url;
    }
}

public static class PremierFullCostComponents {
    private int total_expenses_after_depreciation;
    private int one_month_of_savings;
    private int debt_principal_payment;
    private int fixed_asset_additions;
    private int total_full_costs_estimated;

    public PremierFullCostComponents() {}

    public PremierFullCostComponents(int total_expenses_after_depreciation, int one_month_of_savings, int debt_principal_payment, int fixed_asset_additions, int total_full_costs_estimated) {
        this.total_expenses_after_depreciation = total_expenses_after_depreciation;
        this.one_month_of_savings = one_month_of_savings;
        this.debt_principal_payment = debt_principal_payment;
        this.fixed_asset_additions = fixed_asset_additions;
        this.total_full_costs_estimated = total_full_costs_estimated;
    }

    public int getTotal_expenses_after_depreciation() {
        return total_expenses_after_depreciation;
    }

    public void setTotal_expenses_after_depreciation(int total_expenses_after_depreciation) {
        this.total_expenses_after_depreciation = total_expenses_after_depreciation;
    }

    public int getOne_month_of_savings() {
        return one_month_of_savings;
    }

    public void setOne_month_of_savings(int one_month_of_savings) {
        this.one_month_of_savings = one_month_of_savings;
    }

    public int getDebt_principal_payment() {
        return debt_principal_payment;
    }

    public void setDebt_principal_payment(int debt_principal_payment) {
        this.debt_principal_payment = debt_principal_payment;
    }

    public int getFixed_asset_additions() {
        return fixed_asset_additions;
    }

    public void setFixed_asset_additions(int fixed_asset_additions) {
        this.fixed_asset_additions = fixed_asset_additions;
    }

    public int getTotal_full_costs_estimated() {
        return total_full_costs_estimated;
    }

    public void setTotal_full_costs_estimated(int total_full_costs_estimated) {
        this.total_full_costs_estimated = total_full_costs_estimated;
    }
}

public static class PremierFundingSource {
    private String funding_source;
    private String funding_amount;

    public PremierFundingSource() {}

    public PremierFundingSource(String funding_source, String funding_amount) {
        this.funding_source = funding_source;
        this.funding_amount = funding_amount;
    }

    public String getFunding_source() {
        return funding_source;
    }

    public void setFunding_source(String funding_source) {
        this.funding_source = funding_source;
    }

    public String getFunding_amount() {
        return funding_amount;
    }

    public void setFunding_amount(String funding_amount) {
        this.funding_amount = funding_amount;
    }
}

public static class PremierHighestPaidEmployee {
    private String name;
    private String title;
    private List<String> type;
    private double compensation;
    private double related_compensation;
    private double other_compensation;
    private String hours;
    private String benefits;

    public PremierHighestPaidEmployee() {}

    public PremierHighestPaidEmployee(String name, String title, List<String> type, double compensation, double related_compensation, double other_compensation, String hours, String benefits) {
        this.name = name;
        this.title = title;
        this.type = type;
        this.compensation = compensation;
        this.related_compensation = related_compensation;
        this.other_compensation = other_compensation;
        this.hours = hours;
        this.benefits = benefits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public double getRelated_compensation() {
        return related_compensation;
    }

    public void setRelated_compensation(double related_compensation) {
        this.related_compensation = related_compensation;
    }

    public double getOther_compensation() {
        return other_compensation;
    }

    public void setOther_compensation(double other_compensation) {
        this.other_compensation = other_compensation;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}

public static class PremierKeyDataChecks {
    private boolean data_check_errors;

    public PremierKeyDataChecks() {}

    public PremierKeyDataChecks(boolean data_check_errors) {
        this.data_check_errors = data_check_errors;
    }

    public boolean getData_check_errors() {
        return data_check_errors;
    }

    public void setData_check_errors(boolean data_check_errors) {
        this.data_check_errors = data_check_errors;
    }
}

public static class PremierLettersOfDetermination {
    private String letter_of_determination_doc_name;
    private String letter_of_determination_url;

    public PremierLettersOfDetermination() {}

    public PremierLettersOfDetermination(String letter_of_determination_doc_name, String letter_of_determination_url) {
        this.letter_of_determination_doc_name = letter_of_determination_doc_name;
        this.letter_of_determination_url = letter_of_determination_url;
    }

    public String getLetter_of_determination_doc_name() {
        return letter_of_determination_doc_name;
    }

    public void setLetter_of_determination_doc_name(String letter_of_determination_doc_name) {
        this.letter_of_determination_doc_name = letter_of_determination_doc_name;
    }

    public String getLetter_of_determination_url() {
        return letter_of_determination_url;
    }

    public void setLetter_of_determination_url(String letter_of_determination_url) {
        this.letter_of_determination_url = letter_of_determination_url;
    }
}

public static class PremierLiquidity {
    private double months_of_cash;
    private double months_of_cash_and_investments;
    private double months_of_estimated_liquid_unrestricted_net_assets;

    public PremierLiquidity() {}

    public PremierLiquidity(double months_of_cash, double months_of_cash_and_investments, double months_of_estimated_liquid_unrestricted_net_assets) {
        this.months_of_cash = months_of_cash;
        this.months_of_cash_and_investments = months_of_cash_and_investments;
        this.months_of_estimated_liquid_unrestricted_net_assets = months_of_estimated_liquid_unrestricted_net_assets;
    }

    public double getMonths_of_cash() {
        return months_of_cash;
    }

    public void setMonths_of_cash(double months_of_cash) {
        this.months_of_cash = months_of_cash;
    }

    public double getMonths_of_cash_and_investments() {
        return months_of_cash_and_investments;
    }

    public void setMonths_of_cash_and_investments(double months_of_cash_and_investments) {
        this.months_of_cash_and_investments = months_of_cash_and_investments;
    }

    public double getMonths_of_estimated_liquid_unrestricted_net_assets() {
        return months_of_estimated_liquid_unrestricted_net_assets;
    }

    public void setMonths_of_estimated_liquid_unrestricted_net_assets(double months_of_estimated_liquid_unrestricted_net_assets) {
        this.months_of_estimated_liquid_unrestricted_net_assets = months_of_estimated_liquid_unrestricted_net_assets;
    }
}

public static class PremierMostRecentYearFinancials {
    private String period_begin;
    private String period_end;
    private int fiscal_year;
    private String form_type;
    private String data_source;
    private double assets_total;
    private double total_liabilities;
    private double revenue_contributions;
    private double revenue_govt_grants;
    private double revenue_program_services;
    private double revenue_investments;
    private double revenue_special_events;
    private double revenue_sales;
    private double revenue_other;
    private double total_revenue;
    private double expense_administration;
    private double expense_program_services;
    private double expense_fundraising;
    private double expense_accounting;
    private double expense_advertising_promotion;
    private double expense_info_technology;
    private double expense_insurance;
    private double expense_interest;
    private double expense_investment_management;
    private double expense_legal;
    private double expense_pension_plan;
    private double expense_professional_fundraising;
    private double unrestricted_net_assets;
    private double net_fixed_assets_LBE;
    private double notes_payable_mortgages;
    private String months_of_cash;
    private double expense_professional_fees;
    private double expense_publications;
    private double expense_operating_admin;
    private double expense_gifts_grants_paid;
    private double total_expense_disbursements;
    private double expenses_total;
    private double net_gain_loss;
    private double expense_salaries_employee_benefits;
    private double cash_and_equivalent_assets;
    private double investments_us_government;
    private double investments_stock;
    private double investments_bonds;
    private double investments_other;
    private double land_buildings_equipment;
    private double other_assets;

    public PremierMostRecentYearFinancials() {}

    public PremierMostRecentYearFinancials(String period_begin, String period_end, int fiscal_year, String form_type, String data_source, double assets_total, double total_liabilities, double revenue_contributions, double revenue_govt_grants, double revenue_program_services, double revenue_investments, double revenue_special_events, double revenue_sales, double revenue_other, double total_revenue, double expense_administration, double expense_program_services, double expense_fundraising, double expense_accounting, double expense_advertising_promotion, double expense_info_technology, double expense_insurance, double expense_interest, double expense_investment_management, double expense_legal, double expense_pension_plan, double expense_professional_fundraising, double unrestricted_net_assets, double net_fixed_assets_LBE, double notes_payable_mortgages, String months_of_cash, double expense_professional_fees, double expense_publications, double expense_operating_admin, double expense_gifts_grants_paid, double total_expense_disbursements, double expenses_total, double net_gain_loss, double expense_salaries_employee_benefits, double cash_and_equivalent_assets, double investments_us_government, double investments_stock, double investments_bonds, double investments_other, double land_buildings_equipment, double other_assets) {
        this.period_begin = period_begin;
        this.period_end = period_end;
        this.fiscal_year = fiscal_year;
        this.form_type = form_type;
        this.data_source = data_source;
        this.assets_total = assets_total;
        this.total_liabilities = total_liabilities;
        this.revenue_contributions = revenue_contributions;
        this.revenue_govt_grants = revenue_govt_grants;
        this.revenue_program_services = revenue_program_services;
        this.revenue_investments = revenue_investments;
        this.revenue_special_events = revenue_special_events;
        this.revenue_sales = revenue_sales;
        this.revenue_other = revenue_other;
        this.total_revenue = total_revenue;
        this.expense_administration = expense_administration;
        this.expense_program_services = expense_program_services;
        this.expense_fundraising = expense_fundraising;
        this.expense_accounting = expense_accounting;
        this.expense_advertising_promotion = expense_advertising_promotion;
        this.expense_info_technology = expense_info_technology;
        this.expense_insurance = expense_insurance;
        this.expense_interest = expense_interest;
        this.expense_investment_management = expense_investment_management;
        this.expense_legal = expense_legal;
        this.expense_pension_plan = expense_pension_plan;
        this.expense_professional_fundraising = expense_professional_fundraising;
        this.unrestricted_net_assets = unrestricted_net_assets;
        this.net_fixed_assets_LBE = net_fixed_assets_LBE;
        this.notes_payable_mortgages = notes_payable_mortgages;
        this.months_of_cash = months_of_cash;
        this.expense_professional_fees = expense_professional_fees;
        this.expense_publications = expense_publications;
        this.expense_operating_admin = expense_operating_admin;
        this.expense_gifts_grants_paid = expense_gifts_grants_paid;
        this.total_expense_disbursements = total_expense_disbursements;
        this.expenses_total = expenses_total;
        this.net_gain_loss = net_gain_loss;
        this.expense_salaries_employee_benefits = expense_salaries_employee_benefits;
        this.cash_and_equivalent_assets = cash_and_equivalent_assets;
        this.investments_us_government = investments_us_government;
        this.investments_stock = investments_stock;
        this.investments_bonds = investments_bonds;
        this.investments_other = investments_other;
        this.land_buildings_equipment = land_buildings_equipment;
        this.other_assets = other_assets;
    }

    public String getPeriod_begin() {
        return period_begin;
    }

    public void setPeriod_begin(String period_begin) {
        this.period_begin = period_begin;
    }

    public String getPeriod_end() {
        return period_end;
    }

    public void setPeriod_end(String period_end) {
        this.period_end = period_end;
    }

    public int getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(int fiscal_year) {
        this.fiscal_year = fiscal_year;
    }

    public String getForm_type() {
        return form_type;
    }

    public void setForm_type(String form_type) {
        this.form_type = form_type;
    }

    public String getData_source() {
        return data_source;
    }

    public void setData_source(String data_source) {
        this.data_source = data_source;
    }

    public double getAssets_total() {
        return assets_total;
    }

    public void setAssets_total(double assets_total) {
        this.assets_total = assets_total;
    }

    public double getTotal_liabilities() {
        return total_liabilities;
    }

    public void setTotal_liabilities(double total_liabilities) {
        this.total_liabilities = total_liabilities;
    }

    public double getRevenue_contributions() {
        return revenue_contributions;
    }

    public void setRevenue_contributions(double revenue_contributions) {
        this.revenue_contributions = revenue_contributions;
    }

    public double getRevenue_govt_grants() {
        return revenue_govt_grants;
    }

    public void setRevenue_govt_grants(double revenue_govt_grants) {
        this.revenue_govt_grants = revenue_govt_grants;
    }

    public double getRevenue_program_services() {
        return revenue_program_services;
    }

    public void setRevenue_program_services(double revenue_program_services) {
        this.revenue_program_services = revenue_program_services;
    }

    public double getRevenue_investments() {
        return revenue_investments;
    }

    public void setRevenue_investments(double revenue_investments) {
        this.revenue_investments = revenue_investments;
    }

    public double getRevenue_special_events() {
        return revenue_special_events;
    }

    public void setRevenue_special_events(double revenue_special_events) {
        this.revenue_special_events = revenue_special_events;
    }

    public double getRevenue_sales() {
        return revenue_sales;
    }

    public void setRevenue_sales(double revenue_sales) {
        this.revenue_sales = revenue_sales;
    }

    public double getRevenue_other() {
        return revenue_other;
    }

    public void setRevenue_other(double revenue_other) {
        this.revenue_other = revenue_other;
    }

    public double getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_revenue(double total_revenue) {
        this.total_revenue = total_revenue;
    }

    public double getExpense_administration() {
        return expense_administration;
    }

    public void setExpense_administration(double expense_administration) {
        this.expense_administration = expense_administration;
    }

    public double getExpense_program_services() {
        return expense_program_services;
    }

    public void setExpense_program_services(double expense_program_services) {
        this.expense_program_services = expense_program_services;
    }

    public double getExpense_fundraising() {
        return expense_fundraising;
    }

    public void setExpense_fundraising(double expense_fundraising) {
        this.expense_fundraising = expense_fundraising;
    }

    public double getExpense_accounting() {
        return expense_accounting;
    }

    public void setExpense_accounting(double expense_accounting) {
        this.expense_accounting = expense_accounting;
    }

    public double getExpense_advertising_promotion() {
        return expense_advertising_promotion;
    }

    public void setExpense_advertising_promotion(double expense_advertising_promotion) {
        this.expense_advertising_promotion = expense_advertising_promotion;
    }

    public double getExpense_info_technology() {
        return expense_info_technology;
    }

    public void setExpense_info_technology(double expense_info_technology) {
        this.expense_info_technology = expense_info_technology;
    }

    public double getExpense_insurance() {
        return expense_insurance;
    }

    public void setExpense_insurance(double expense_insurance) {
        this.expense_insurance = expense_insurance;
    }

    public double getExpense_interest() {
        return expense_interest;
    }

    public void setExpense_interest(double expense_interest) {
        this.expense_interest = expense_interest;
    }

    public double getExpense_investment_management() {
        return expense_investment_management;
    }

    public void setExpense_investment_management(double expense_investment_management) {
        this.expense_investment_management = expense_investment_management;
    }

    public double getExpense_legal() {
        return expense_legal;
    }

    public void setExpense_legal(double expense_legal) {
        this.expense_legal = expense_legal;
    }

    public double getExpense_pension_plan() {
        return expense_pension_plan;
    }

    public void setExpense_pension_plan(double expense_pension_plan) {
        this.expense_pension_plan = expense_pension_plan;
    }

    public double getExpense_professional_fundraising() {
        return expense_professional_fundraising;
    }

    public void setExpense_professional_fundraising(double expense_professional_fundraising) {
        this.expense_professional_fundraising = expense_professional_fundraising;
    }

    public double getUnrestricted_net_assets() {
        return unrestricted_net_assets;
    }

    public void setUnrestricted_net_assets(double unrestricted_net_assets) {
        this.unrestricted_net_assets = unrestricted_net_assets;
    }

    public double getNet_fixed_assets_LBE() {
        return net_fixed_assets_LBE;
    }

    public void setNet_fixed_assets_LBE(double net_fixed_assets_LBE) {
        this.net_fixed_assets_LBE = net_fixed_assets_LBE;
    }

    public double getNotes_payable_mortgages() {
        return notes_payable_mortgages;
    }

    public void setNotes_payable_mortgages(double notes_payable_mortgages) {
        this.notes_payable_mortgages = notes_payable_mortgages;
    }

    public String getMonths_of_cash() {
        return months_of_cash;
    }

    public void setMonths_of_cash(String months_of_cash) {
        this.months_of_cash = months_of_cash;
    }

    public double getExpense_professional_fees() {
        return expense_professional_fees;
    }

    public void setExpense_professional_fees(double expense_professional_fees) {
        this.expense_professional_fees = expense_professional_fees;
    }

    public double getExpense_publications() {
        return expense_publications;
    }

    public void setExpense_publications(double expense_publications) {
        this.expense_publications = expense_publications;
    }

    public double getExpense_operating_admin() {
        return expense_operating_admin;
    }

    public void setExpense_operating_admin(double expense_operating_admin) {
        this.expense_operating_admin = expense_operating_admin;
    }

    public double getExpense_gifts_grants_paid() {
        return expense_gifts_grants_paid;
    }

    public void setExpense_gifts_grants_paid(double expense_gifts_grants_paid) {
        this.expense_gifts_grants_paid = expense_gifts_grants_paid;
    }

    public double getTotal_expense_disbursements() {
        return total_expense_disbursements;
    }

    public void setTotal_expense_disbursements(double total_expense_disbursements) {
        this.total_expense_disbursements = total_expense_disbursements;
    }

    public double getExpenses_total() {
        return expenses_total;
    }

    public void setExpenses_total(double expenses_total) {
        this.expenses_total = expenses_total;
    }

    public double getNet_gain_loss() {
        return net_gain_loss;
    }

    public void setNet_gain_loss(double net_gain_loss) {
        this.net_gain_loss = net_gain_loss;
    }

    public double getExpense_salaries_employee_benefits() {
        return expense_salaries_employee_benefits;
    }

    public void setExpense_salaries_employee_benefits(double expense_salaries_employee_benefits) {
        this.expense_salaries_employee_benefits = expense_salaries_employee_benefits;
    }

    public double getCash_and_equivalent_assets() {
        return cash_and_equivalent_assets;
    }

    public void setCash_and_equivalent_assets(double cash_and_equivalent_assets) {
        this.cash_and_equivalent_assets = cash_and_equivalent_assets;
    }

    public double getInvestments_us_government() {
        return investments_us_government;
    }

    public void setInvestments_us_government(double investments_us_government) {
        this.investments_us_government = investments_us_government;
    }

    public double getInvestments_stock() {
        return investments_stock;
    }

    public void setInvestments_stock(double investments_stock) {
        this.investments_stock = investments_stock;
    }

    public double getInvestments_bonds() {
        return investments_bonds;
    }

    public void setInvestments_bonds(double investments_bonds) {
        this.investments_bonds = investments_bonds;
    }

    public double getInvestments_other() {
        return investments_other;
    }

    public void setInvestments_other(double investments_other) {
        this.investments_other = investments_other;
    }

    public double getLand_buildings_equipment() {
        return land_buildings_equipment;
    }

    public void setLand_buildings_equipment(double land_buildings_equipment) {
        this.land_buildings_equipment = land_buildings_equipment;
    }

    public double getOther_assets() {
        return other_assets;
    }

    public void setOther_assets(double other_assets) {
        this.other_assets = other_assets;
    }
}

public static class PremierNaicsCode {
    private String naics_code;
    private String naics_description;

    public PremierNaicsCode() {}

    public PremierNaicsCode(String naics_code, String naics_description) {
        this.naics_code = naics_code;
        this.naics_description = naics_description;
    }

    public String getNaics_code() {
        return naics_code;
    }

    public void setNaics_code(String naics_code) {
        this.naics_code = naics_code;
    }

    public String getNaics_description() {
        return naics_description;
    }

    public void setNaics_description(String naics_description) {
        this.naics_description = naics_description;
    }
}

public static class PremierNteeCode {
    private String ntee_code;
    private String primary_code;
    private String primary_description;
    private String sub_code;
    private String sub_description;

    public PremierNteeCode() {}

    public PremierNteeCode(String ntee_code, String primary_code, String primary_description, String sub_code, String sub_description) {
        this.ntee_code = ntee_code;
        this.primary_code = primary_code;
        this.primary_description = primary_description;
        this.sub_code = sub_code;
        this.sub_description = sub_description;
    }

    public String getNtee_code() {
        return ntee_code;
    }

    public void setNtee_code(String ntee_code) {
        this.ntee_code = ntee_code;
    }

    public String getPrimary_code() {
        return primary_code;
    }

    public void setPrimary_code(String primary_code) {
        this.primary_code = primary_code;
    }

    public String getPrimary_description() {
        return primary_description;
    }

    public void setPrimary_description(String primary_description) {
        this.primary_description = primary_description;
    }

    public String getSub_code() {
        return sub_code;
    }

    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
    }

    public String getSub_description() {
        return sub_description;
    }

    public void setSub_description(String sub_description) {
        this.sub_description = sub_description;
    }
}

public static class PremierOfficersDirectorsKeyEmployee {
    private String name;
    private String title;
    private List<String> type;
    private double compensation;
    private double related_compensation;
    private double other_compensation;
    private String hours;
    private String benefits;

    public PremierOfficersDirectorsKeyEmployee() {}

    public PremierOfficersDirectorsKeyEmployee(String name, String title, List<String> type, double compensation, double related_compensation, double other_compensation, String hours, String benefits) {
        this.name = name;
        this.title = title;
        this.type = type;
        this.compensation = compensation;
        this.related_compensation = related_compensation;
        this.other_compensation = other_compensation;
        this.hours = hours;
        this.benefits = benefits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public double getRelated_compensation() {
        return related_compensation;
    }

    public void setRelated_compensation(double related_compensation) {
        this.related_compensation = related_compensation;
    }

    public double getOther_compensation() {
        return other_compensation;
    }

    public void setOther_compensation(double other_compensation) {
        this.other_compensation = other_compensation;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
}

public static class PremierOperations {
    private String leader_name;
    private String leader_profile;
    private String co_leader_name;
    private String co_leader_profile;
    private int no_of_employees;
    private int no_of_volunteers;
    private String organization_email;
    private int organization_details_year;
    private List<PremierOfficersDirectorsKeyEmployee> officers_directors_key_employees;
    private List<PremierHighestPaidEmployee> highest_paid_employees;
    private int employees_greater_than_100K;
    private String board_chair_name;
    private String board_chair_affiliation;
    private String board_chair_term_start;
    private String board_chair_term_end;
    private String board_co_chair_name;
    private String board_co_chair_affiliation;
    private String board_co_chair_term_start;
    private String board_co_chair_term_end;
    private List<PremierBoardOfDirector> board_of_directors;
    private List<PremierBoardLeadershipPractice> board_leadership_practices;
    private PremierOrganizationDemographics organization_demographics;
    private PremierDemographics demographics;
    private List<PremierContractor> contractors;
    private String blog_url;
    private String fundraising_contact_name;
    private String fundraising_contact_title;
    private String fundraising_contact_email;
    private String fundraising_contact_phone;
    private String preparer_firm_name;
    private String preparer_firm_address;
    private String preparer_firm_ein;
    private String preparer_firm_phone;
    private List<Object> senior_staff;
    private List<PremierOtherStaff> other_staff;
    private List<PremierAccreditation> accreditations;

    public PremierOperations() {}

    public PremierOperations(String leader_name, String leader_profile, String co_leader_name, String co_leader_profile, int no_of_employees, int no_of_volunteers, String organization_email, int organization_details_year, List<PremierOfficersDirectorsKeyEmployee> officers_directors_key_employees, List<PremierHighestPaidEmployee> highest_paid_employees, int employees_greater_than_100K, String board_chair_name, String board_chair_affiliation, String board_chair_term_start, String board_chair_term_end, String board_co_chair_name, String board_co_chair_affiliation, String board_co_chair_term_start, String board_co_chair_term_end, List<PremierBoardOfDirector> board_of_directors, List<PremierBoardLeadershipPractice> board_leadership_practices, PremierOrganizationDemographics organization_demographics, PremierDemographics demographics, List<PremierContractor> contractors, String blog_url, String fundraising_contact_name, String fundraising_contact_title, String fundraising_contact_email, String fundraising_contact_phone, String preparer_firm_name, String preparer_firm_address, String preparer_firm_ein, String preparer_firm_phone, List<Object> senior_staff, List<PremierOtherStaff> other_staff, List<PremierAccreditation> accreditations) {
        this.leader_name = leader_name;
        this.leader_profile = leader_profile;
        this.co_leader_name = co_leader_name;
        this.co_leader_profile = co_leader_profile;
        this.no_of_employees = no_of_employees;
        this.no_of_volunteers = no_of_volunteers;
        this.organization_email = organization_email;
        this.organization_details_year = organization_details_year;
        this.officers_directors_key_employees = officers_directors_key_employees;
        this.highest_paid_employees = highest_paid_employees;
        this.employees_greater_than_100K = employees_greater_than_100K;
        this.board_chair_name = board_chair_name;
        this.board_chair_affiliation = board_chair_affiliation;
        this.board_chair_term_start = board_chair_term_start;
        this.board_chair_term_end = board_chair_term_end;
        this.board_co_chair_name = board_co_chair_name;
        this.board_co_chair_affiliation = board_co_chair_affiliation;
        this.board_co_chair_term_start = board_co_chair_term_start;
        this.board_co_chair_term_end = board_co_chair_term_end;
        this.board_of_directors = board_of_directors;
        this.board_leadership_practices = board_leadership_practices;
        this.organization_demographics = organization_demographics;
        this.demographics = demographics;
        this.contractors = contractors;
        this.blog_url = blog_url;
        this.fundraising_contact_name = fundraising_contact_name;
        this.fundraising_contact_title = fundraising_contact_title;
        this.fundraising_contact_email = fundraising_contact_email;
        this.fundraising_contact_phone = fundraising_contact_phone;
        this.preparer_firm_name = preparer_firm_name;
        this.preparer_firm_address = preparer_firm_address;
        this.preparer_firm_ein = preparer_firm_ein;
        this.preparer_firm_phone = preparer_firm_phone;
        this.senior_staff = senior_staff;
        this.other_staff = other_staff;
        this.accreditations = accreditations;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getLeader_profile() {
        return leader_profile;
    }

    public void setLeader_profile(String leader_profile) {
        this.leader_profile = leader_profile;
    }

    public String getCo_leader_name() {
        return co_leader_name;
    }

    public void setCo_leader_name(String co_leader_name) {
        this.co_leader_name = co_leader_name;
    }

    public String getCo_leader_profile() {
        return co_leader_profile;
    }

    public void setCo_leader_profile(String co_leader_profile) {
        this.co_leader_profile = co_leader_profile;
    }

    public int getNo_of_employees() {
        return no_of_employees;
    }

    public void setNo_of_employees(int no_of_employees) {
        this.no_of_employees = no_of_employees;
    }

    public int getNo_of_volunteers() {
        return no_of_volunteers;
    }

    public void setNo_of_volunteers(int no_of_volunteers) {
        this.no_of_volunteers = no_of_volunteers;
    }

    public String getOrganization_email() {
        return organization_email;
    }

    public void setOrganization_email(String organization_email) {
        this.organization_email = organization_email;
    }

    public int getOrganization_details_year() {
        return organization_details_year;
    }

    public void setOrganization_details_year(int organization_details_year) {
        this.organization_details_year = organization_details_year;
    }

    public List<PremierOfficersDirectorsKeyEmployee> getOfficers_directors_key_employees() {
        return officers_directors_key_employees;
    }

    public void setOfficers_directors_key_employees(List<PremierOfficersDirectorsKeyEmployee> officers_directors_key_employees) {
        this.officers_directors_key_employees = officers_directors_key_employees;
    }

    public List<PremierHighestPaidEmployee> getHighest_paid_employees() {
        return highest_paid_employees;
    }

    public void setHighest_paid_employees(List<PremierHighestPaidEmployee> highest_paid_employees) {
        this.highest_paid_employees = highest_paid_employees;
    }

    public int getEmployees_greater_than_100K() {
        return employees_greater_than_100K;
    }

    public void setEmployees_greater_than_100K(int employees_greater_than_100K) {
        this.employees_greater_than_100K = employees_greater_than_100K;
    }

    public String getBoard_chair_name() {
        return board_chair_name;
    }

    public void setBoard_chair_name(String board_chair_name) {
        this.board_chair_name = board_chair_name;
    }

    public String getBoard_chair_affiliation() {
        return board_chair_affiliation;
    }

    public void setBoard_chair_affiliation(String board_chair_affiliation) {
        this.board_chair_affiliation = board_chair_affiliation;
    }

    public String getBoard_chair_term_start() {
        return board_chair_term_start;
    }

    public void setBoard_chair_term_start(String board_chair_term_start) {
        this.board_chair_term_start = board_chair_term_start;
    }

    public String getBoard_chair_term_end() {
        return board_chair_term_end;
    }

    public void setBoard_chair_term_end(String board_chair_term_end) {
        this.board_chair_term_end = board_chair_term_end;
    }

    public String getBoard_co_chair_name() {
        return board_co_chair_name;
    }

    public void setBoard_co_chair_name(String board_co_chair_name) {
        this.board_co_chair_name = board_co_chair_name;
    }

    public String getBoard_co_chair_affiliation() {
        return board_co_chair_affiliation;
    }

    public void setBoard_co_chair_affiliation(String board_co_chair_affiliation) {
        this.board_co_chair_affiliation = board_co_chair_affiliation;
    }

    public String getBoard_co_chair_term_start() {
        return board_co_chair_term_start;
    }

    public void setBoard_co_chair_term_start(String board_co_chair_term_start) {
        this.board_co_chair_term_start = board_co_chair_term_start;
    }

    public String getBoard_co_chair_term_end() {
        return board_co_chair_term_end;
    }

    public void setBoard_co_chair_term_end(String board_co_chair_term_end) {
        this.board_co_chair_term_end = board_co_chair_term_end;
    }

    public List<PremierBoardOfDirector> getBoard_of_directors() {
        return board_of_directors;
    }

    public void setBoard_of_directors(List<PremierBoardOfDirector> board_of_directors) {
        this.board_of_directors = board_of_directors;
    }

    public List<PremierBoardLeadershipPractice> getBoard_leadership_practices() {
        return board_leadership_practices;
    }

    public void setBoard_leadership_practices(List<PremierBoardLeadershipPractice> board_leadership_practices) {
        this.board_leadership_practices = board_leadership_practices;
    }

    public PremierOrganizationDemographics getOrganization_demographics() {
        return organization_demographics;
    }

    public void setOrganization_demographics(PremierOrganizationDemographics organization_demographics) {
        this.organization_demographics = organization_demographics;
    }

    public PremierDemographics getDemographics() {
        return demographics;
    }

    public void setDemographics(PremierDemographics demographics) {
        this.demographics = demographics;
    }

    public List<PremierContractor> getContractors() {
        return contractors;
    }

    public void setContractors(List<PremierContractor> contractors) {
        this.contractors = contractors;
    }

    public String getBlog_url() {
        return blog_url;
    }

    public void setBlog_url(String blog_url) {
        this.blog_url = blog_url;
    }

    public String getFundraising_contact_name() {
        return fundraising_contact_name;
    }

    public void setFundraising_contact_name(String fundraising_contact_name) {
        this.fundraising_contact_name = fundraising_contact_name;
    }

    public String getFundraising_contact_title() {
        return fundraising_contact_title;
    }

    public void setFundraising_contact_title(String fundraising_contact_title) {
        this.fundraising_contact_title = fundraising_contact_title;
    }

    public String getFundraising_contact_email() {
        return fundraising_contact_email;
    }

    public void setFundraising_contact_email(String fundraising_contact_email) {
        this.fundraising_contact_email = fundraising_contact_email;
    }

    public String getFundraising_contact_phone() {
        return fundraising_contact_phone;
    }

    public void setFundraising_contact_phone(String fundraising_contact_phone) {
        this.fundraising_contact_phone = fundraising_contact_phone;
    }

    public String getPreparer_firm_name() {
        return preparer_firm_name;
    }

    public void setPreparer_firm_name(String preparer_firm_name) {
        this.preparer_firm_name = preparer_firm_name;
    }

    public String getPreparer_firm_address() {
        return preparer_firm_address;
    }

    public void setPreparer_firm_address(String preparer_firm_address) {
        this.preparer_firm_address = preparer_firm_address;
    }

    public String getPreparer_firm_ein() {
        return preparer_firm_ein;
    }

    public void setPreparer_firm_ein(String preparer_firm_ein) {
        this.preparer_firm_ein = preparer_firm_ein;
    }

    public String getPreparer_firm_phone() {
        return preparer_firm_phone;
    }

    public void setPreparer_firm_phone(String preparer_firm_phone) {
        this.preparer_firm_phone = preparer_firm_phone;
    }

    public List<Object> getSenior_staff() {
        return senior_staff;
    }

    public void setSenior_staff(List<Object> senior_staff) {
        this.senior_staff = senior_staff;
    }

    public List<PremierOtherStaff> getOther_staff() {
        return other_staff;
    }

    public void setOther_staff(List<PremierOtherStaff> other_staff) {
        this.other_staff = other_staff;
    }

    public List<PremierAccreditation> getAccreditations() {
        return accreditations;
    }

    public void setAccreditations(List<PremierAccreditation> accreditations) {
        this.accreditations = accreditations;
    }
}

public static class PremierOrgDoesNotCollectFor {
    private boolean board_members;
    private boolean full_time_staff;
    private boolean part_time_staff;
    private boolean all_staff;
    private boolean senior_staff;
    private boolean executive_director;

    public PremierOrgDoesNotCollectFor() {}

    public PremierOrgDoesNotCollectFor(boolean board_members, boolean full_time_staff, boolean part_time_staff, boolean all_staff, boolean senior_staff, boolean executive_director) {
        this.board_members = board_members;
        this.full_time_staff = full_time_staff;
        this.part_time_staff = part_time_staff;
        this.all_staff = all_staff;
        this.senior_staff = senior_staff;
        this.executive_director = executive_director;
    }

    public boolean getBoard_members() {
        return board_members;
    }

    public void setBoard_members(boolean board_members) {
        this.board_members = board_members;
    }

    public boolean getFull_time_staff() {
        return full_time_staff;
    }

    public void setFull_time_staff(boolean full_time_staff) {
        this.full_time_staff = full_time_staff;
    }

    public boolean getPart_time_staff() {
        return part_time_staff;
    }

    public void setPart_time_staff(boolean part_time_staff) {
        this.part_time_staff = part_time_staff;
    }

    public boolean getAll_staff() {
        return all_staff;
    }

    public void setAll_staff(boolean all_staff) {
        this.all_staff = all_staff;
    }

    public boolean getSenior_staff() {
        return senior_staff;
    }

    public void setSenior_staff(boolean senior_staff) {
        this.senior_staff = senior_staff;
    }

    public boolean getExecutive_director() {
        return executive_director;
    }

    public void setExecutive_director(boolean executive_director) {
        this.executive_director = executive_director;
    }
}

public static class PremierOrganizationDemographics {
    private Object total_board_members;
    private Object total_fulltime_staff;
    private Object total_parttime_staff;
    private int total_staff;
    private Object total_senior_staff;
    private boolean tracks_staffboardvol_retention;
    private boolean tracks_staffboard_income;
    private boolean tracks_staffboard_age;
    private boolean tracks_vendor_diversity;
    private boolean has_diversity_committee;
    private boolean has_diversity_manager;
    private boolean diversity_manager_fulltime;
    private boolean diversity_plan;
    private boolean supports_diversity_via_other_methods;
    private PremierEquityStrategies equity_strategies;
    private List<PremierCategory> categories;

    public PremierOrganizationDemographics() {}

    public PremierOrganizationDemographics(Object total_board_members, Object total_fulltime_staff, Object total_parttime_staff, int total_staff, Object total_senior_staff, boolean tracks_staffboardvol_retention, boolean tracks_staffboard_income, boolean tracks_staffboard_age, boolean tracks_vendor_diversity, boolean has_diversity_committee, boolean has_diversity_manager, boolean diversity_manager_fulltime, boolean diversity_plan, boolean supports_diversity_via_other_methods, PremierEquityStrategies equity_strategies, List<PremierCategory> categories) {
        this.total_board_members = total_board_members;
        this.total_fulltime_staff = total_fulltime_staff;
        this.total_parttime_staff = total_parttime_staff;
        this.total_staff = total_staff;
        this.total_senior_staff = total_senior_staff;
        this.tracks_staffboardvol_retention = tracks_staffboardvol_retention;
        this.tracks_staffboard_income = tracks_staffboard_income;
        this.tracks_staffboard_age = tracks_staffboard_age;
        this.tracks_vendor_diversity = tracks_vendor_diversity;
        this.has_diversity_committee = has_diversity_committee;
        this.has_diversity_manager = has_diversity_manager;
        this.diversity_manager_fulltime = diversity_manager_fulltime;
        this.diversity_plan = diversity_plan;
        this.supports_diversity_via_other_methods = supports_diversity_via_other_methods;
        this.equity_strategies = equity_strategies;
        this.categories = categories;
    }

    public Object getTotal_board_members() {
        return total_board_members;
    }

    public void setTotal_board_members(Object total_board_members) {
        this.total_board_members = total_board_members;
    }

    public Object getTotal_fulltime_staff() {
        return total_fulltime_staff;
    }

    public void setTotal_fulltime_staff(Object total_fulltime_staff) {
        this.total_fulltime_staff = total_fulltime_staff;
    }

    public Object getTotal_parttime_staff() {
        return total_parttime_staff;
    }

    public void setTotal_parttime_staff(Object total_parttime_staff) {
        this.total_parttime_staff = total_parttime_staff;
    }

    public int getTotal_staff() {
        return total_staff;
    }

    public void setTotal_staff(int total_staff) {
        this.total_staff = total_staff;
    }

    public Object getTotal_senior_staff() {
        return total_senior_staff;
    }

    public void setTotal_senior_staff(Object total_senior_staff) {
        this.total_senior_staff = total_senior_staff;
    }

    public boolean getTracks_staffboardvol_retention() {
        return tracks_staffboardvol_retention;
    }

    public void setTracks_staffboardvol_retention(boolean tracks_staffboardvol_retention) {
        this.tracks_staffboardvol_retention = tracks_staffboardvol_retention;
    }

    public boolean getTracks_staffboard_income() {
        return tracks_staffboard_income;
    }

    public void setTracks_staffboard_income(boolean tracks_staffboard_income) {
        this.tracks_staffboard_income = tracks_staffboard_income;
    }

    public boolean getTracks_staffboard_age() {
        return tracks_staffboard_age;
    }

    public void setTracks_staffboard_age(boolean tracks_staffboard_age) {
        this.tracks_staffboard_age = tracks_staffboard_age;
    }

    public boolean getTracks_vendor_diversity() {
        return tracks_vendor_diversity;
    }

    public void setTracks_vendor_diversity(boolean tracks_vendor_diversity) {
        this.tracks_vendor_diversity = tracks_vendor_diversity;
    }

    public boolean getHas_diversity_committee() {
        return has_diversity_committee;
    }

    public void setHas_diversity_committee(boolean has_diversity_committee) {
        this.has_diversity_committee = has_diversity_committee;
    }

    public boolean getHas_diversity_manager() {
        return has_diversity_manager;
    }

    public void setHas_diversity_manager(boolean has_diversity_manager) {
        this.has_diversity_manager = has_diversity_manager;
    }

    public boolean getDiversity_manager_fulltime() {
        return diversity_manager_fulltime;
    }

    public void setDiversity_manager_fulltime(boolean diversity_manager_fulltime) {
        this.diversity_manager_fulltime = diversity_manager_fulltime;
    }

    public boolean getDiversity_plan() {
        return diversity_plan;
    }

    public void setDiversity_plan(boolean diversity_plan) {
        this.diversity_plan = diversity_plan;
    }

    public boolean getSupports_diversity_via_other_methods() {
        return supports_diversity_via_other_methods;
    }

    public void setSupports_diversity_via_other_methods(boolean supports_diversity_via_other_methods) {
        this.supports_diversity_via_other_methods = supports_diversity_via_other_methods;
    }

    public PremierEquityStrategies getEquity_strategies() {
        return equity_strategies;
    }

    public void setEquity_strategies(PremierEquityStrategies equity_strategies) {
        this.equity_strategies = equity_strategies;
    }

    public List<PremierCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<PremierCategory> categories) {
        this.categories = categories;
    }
}

public static class PremierOrganizationType {
    private String organization_type;
    private String deductibility_limitation;
    private String deductibility_status_description;

    public PremierOrganizationType() {}

    public PremierOrganizationType(String organization_type, String deductibility_limitation, String deductibility_status_description) {
        this.organization_type = organization_type;
        this.deductibility_limitation = deductibility_limitation;
        this.deductibility_status_description = deductibility_status_description;
    }

    public String getOrganization_type() {
        return organization_type;
    }

    public void setOrganization_type(String organization_type) {
        this.organization_type = organization_type;
    }

    public String getDeductibility_limitation() {
        return deductibility_limitation;
    }

    public void setDeductibility_limitation(String deductibility_limitation) {
        this.deductibility_limitation = deductibility_limitation;
    }

    public String getDeductibility_status_description() {
        return deductibility_status_description;
    }

    public void setDeductibility_status_description(String deductibility_status_description) {
        this.deductibility_status_description = deductibility_status_description;
    }
}

public static class PremierOtherDocument {
    private String document_name;
    private String document_year;
    private String otherdocument_contents;
    private String document_url;

    public PremierOtherDocument() {}

    public PremierOtherDocument(String document_name, String document_year, String otherdocument_contents, String document_url) {
        this.document_name = document_name;
        this.document_year = document_year;
        this.otherdocument_contents = otherdocument_contents;
        this.document_url = document_url;
    }

    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }

    public String getDocument_year() {
        return document_year;
    }

    public void setDocument_year(String document_year) {
        this.document_year = document_year;
    }

    public String getOtherdocument_contents() {
        return otherdocument_contents;
    }

    public void setOtherdocument_contents(String otherdocument_contents) {
        this.otherdocument_contents = otherdocument_contents;
    }

    public String getDocument_url() {
        return document_url;
    }

    public void setDocument_url(String document_url) {
        this.document_url = document_url;
    }
}

public static class PremierOtherStaff {
    private String name;
    private String title;
    private String type;

    public PremierOtherStaff() {}

    public PremierOtherStaff(String name, String title, String type) {
        this.name = name;
        this.title = title;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public static class PremierPart10BalanceSheet {
    private double cash_boy;
    private double cash_eoy;
    private double savings_boy;
    private double savings_eoy;
    private double pledges_grants_boy;
    private double pledges_grants_eoy;
    private double accounts_receivable_boy;
    private double accounts_receivable_eoy;
    private double qualified_receivable_boy;
    private double qualified_receivable_eoy;
    private double disqualified_receivable_boy;
    private double disqualified_receivable_eoy;
    private double loans_receivable_boy;
    private double loans_receivable_eoy;
    private double inventory_boy;
    private double inventory_eoy;
    private double prepaid_boy;
    private double prepaid_eoy;
    private double lbe_base;
    private double less_depreciation;
    private double lbe_boy;
    private double lbe_eoy;
    private double public_securities_boy;
    private double public_securities_eoy;
    private double other_securities_boy;
    private double other_securities_eoy;
    private double investment_programs_boy;
    private double investment_programs_eoy;
    private double intangible_assets_boy;
    private double intangible_assets_eoy;
    private double other_assets_boy;
    private double other_assets_eoy;
    private double assets_total_boy;
    private double assets_total_eoy;
    private double accounts_payable_boy;
    private double accounts_payable_eoy;
    private double grants_payable_boy;
    private double grants_payable_eoy;
    private double deferred_revenue_boy;
    private double deferred_revenue_eoy;
    private double tax_exempt_bonds_boy;
    private double tax_exempt_bonds_eoy;
    private double escrow_liability_boy;
    private double escrow_liability_eoy;
    private double payable_officiers_boy;
    private double payable_officiers_eoy;
    private double secured_notes_payable_boy;
    private double secured_notes_payable_eoy;
    private double unsecured_notes_payable_boy;
    private double unsecured_notes_payable_eoy;
    private double liability_other_boy;
    private double liability_other_eoy;
    private double liability_total_boy;
    private double liability_total_eoy;
    private double unrestricted_boy;
    private double unrestricted_eoy;
    private double temporarily_restricted_boy;
    private double temporarily_restricted_eoy;
    private double permanently_restricted_boy;
    private double permanently_restricted_eoy;
    private double restricted_boy;
    private double restricted_eoy;
    private double capital_boy;
    private double capital_eoy;
    private double paid_in_boy;
    private double paid_in_eoy;
    private double retained_boy;
    private double retained_eoy;
    private double net_total_boy;
    private double net_total_eoy;
    private double balances_boy;
    private double balances_eoy;

    public PremierPart10BalanceSheet() {}

    public PremierPart10BalanceSheet(double cash_boy, double cash_eoy, double savings_boy, double savings_eoy, double pledges_grants_boy, double pledges_grants_eoy, double accounts_receivable_boy, double accounts_receivable_eoy, double qualified_receivable_boy, double qualified_receivable_eoy, double disqualified_receivable_boy, double disqualified_receivable_eoy, double loans_receivable_boy, double loans_receivable_eoy, double inventory_boy, double inventory_eoy, double prepaid_boy, double prepaid_eoy, double lbe_base, double less_depreciation, double lbe_boy, double lbe_eoy, double public_securities_boy, double public_securities_eoy, double other_securities_boy, double other_securities_eoy, double investment_programs_boy, double investment_programs_eoy, double intangible_assets_boy, double intangible_assets_eoy, double other_assets_boy, double other_assets_eoy, double assets_total_boy, double assets_total_eoy, double accounts_payable_boy, double accounts_payable_eoy, double grants_payable_boy, double grants_payable_eoy, double deferred_revenue_boy, double deferred_revenue_eoy, double tax_exempt_bonds_boy, double tax_exempt_bonds_eoy, double escrow_liability_boy, double escrow_liability_eoy, double payable_officiers_boy, double payable_officiers_eoy, double secured_notes_payable_boy, double secured_notes_payable_eoy, double unsecured_notes_payable_boy, double unsecured_notes_payable_eoy, double liability_other_boy, double liability_other_eoy, double liability_total_boy, double liability_total_eoy, double unrestricted_boy, double unrestricted_eoy, double temporarily_restricted_boy, double temporarily_restricted_eoy, double permanently_restricted_boy, double permanently_restricted_eoy, double restricted_boy, double restricted_eoy, double capital_boy, double capital_eoy, double paid_in_boy, double paid_in_eoy, double retained_boy, double retained_eoy, double net_total_boy, double net_total_eoy, double balances_boy, double balances_eoy) {
        this.cash_boy = cash_boy;
        this.cash_eoy = cash_eoy;
        this.savings_boy = savings_boy;
        this.savings_eoy = savings_eoy;
        this.pledges_grants_boy = pledges_grants_boy;
        this.pledges_grants_eoy = pledges_grants_eoy;
        this.accounts_receivable_boy = accounts_receivable_boy;
        this.accounts_receivable_eoy = accounts_receivable_eoy;
        this.qualified_receivable_boy = qualified_receivable_boy;
        this.qualified_receivable_eoy = qualified_receivable_eoy;
        this.disqualified_receivable_boy = disqualified_receivable_boy;
        this.disqualified_receivable_eoy = disqualified_receivable_eoy;
        this.loans_receivable_boy = loans_receivable_boy;
        this.loans_receivable_eoy = loans_receivable_eoy;
        this.inventory_boy = inventory_boy;
        this.inventory_eoy = inventory_eoy;
        this.prepaid_boy = prepaid_boy;
        this.prepaid_eoy = prepaid_eoy;
        this.lbe_base = lbe_base;
        this.less_depreciation = less_depreciation;
        this.lbe_boy = lbe_boy;
        this.lbe_eoy = lbe_eoy;
        this.public_securities_boy = public_securities_boy;
        this.public_securities_eoy = public_securities_eoy;
        this.other_securities_boy = other_securities_boy;
        this.other_securities_eoy = other_securities_eoy;
        this.investment_programs_boy = investment_programs_boy;
        this.investment_programs_eoy = investment_programs_eoy;
        this.intangible_assets_boy = intangible_assets_boy;
        this.intangible_assets_eoy = intangible_assets_eoy;
        this.other_assets_boy = other_assets_boy;
        this.other_assets_eoy = other_assets_eoy;
        this.assets_total_boy = assets_total_boy;
        this.assets_total_eoy = assets_total_eoy;
        this.accounts_payable_boy = accounts_payable_boy;
        this.accounts_payable_eoy = accounts_payable_eoy;
        this.grants_payable_boy = grants_payable_boy;
        this.grants_payable_eoy = grants_payable_eoy;
        this.deferred_revenue_boy = deferred_revenue_boy;
        this.deferred_revenue_eoy = deferred_revenue_eoy;
        this.tax_exempt_bonds_boy = tax_exempt_bonds_boy;
        this.tax_exempt_bonds_eoy = tax_exempt_bonds_eoy;
        this.escrow_liability_boy = escrow_liability_boy;
        this.escrow_liability_eoy = escrow_liability_eoy;
        this.payable_officiers_boy = payable_officiers_boy;
        this.payable_officiers_eoy = payable_officiers_eoy;
        this.secured_notes_payable_boy = secured_notes_payable_boy;
        this.secured_notes_payable_eoy = secured_notes_payable_eoy;
        this.unsecured_notes_payable_boy = unsecured_notes_payable_boy;
        this.unsecured_notes_payable_eoy = unsecured_notes_payable_eoy;
        this.liability_other_boy = liability_other_boy;
        this.liability_other_eoy = liability_other_eoy;
        this.liability_total_boy = liability_total_boy;
        this.liability_total_eoy = liability_total_eoy;
        this.unrestricted_boy = unrestricted_boy;
        this.unrestricted_eoy = unrestricted_eoy;
        this.temporarily_restricted_boy = temporarily_restricted_boy;
        this.temporarily_restricted_eoy = temporarily_restricted_eoy;
        this.permanently_restricted_boy = permanently_restricted_boy;
        this.permanently_restricted_eoy = permanently_restricted_eoy;
        this.restricted_boy = restricted_boy;
        this.restricted_eoy = restricted_eoy;
        this.capital_boy = capital_boy;
        this.capital_eoy = capital_eoy;
        this.paid_in_boy = paid_in_boy;
        this.paid_in_eoy = paid_in_eoy;
        this.retained_boy = retained_boy;
        this.retained_eoy = retained_eoy;
        this.net_total_boy = net_total_boy;
        this.net_total_eoy = net_total_eoy;
        this.balances_boy = balances_boy;
        this.balances_eoy = balances_eoy;
    }

    public double getCash_boy() {
        return cash_boy;
    }

    public void setCash_boy(double cash_boy) {
        this.cash_boy = cash_boy;
    }

    public double getCash_eoy() {
        return cash_eoy;
    }

    public void setCash_eoy(double cash_eoy) {
        this.cash_eoy = cash_eoy;
    }

    public double getSavings_boy() {
        return savings_boy;
    }

    public void setSavings_boy(double savings_boy) {
        this.savings_boy = savings_boy;
    }

    public double getSavings_eoy() {
        return savings_eoy;
    }

    public void setSavings_eoy(double savings_eoy) {
        this.savings_eoy = savings_eoy;
    }

    public double getPledges_grants_boy() {
        return pledges_grants_boy;
    }

    public void setPledges_grants_boy(double pledges_grants_boy) {
        this.pledges_grants_boy = pledges_grants_boy;
    }

    public double getPledges_grants_eoy() {
        return pledges_grants_eoy;
    }

    public void setPledges_grants_eoy(double pledges_grants_eoy) {
        this.pledges_grants_eoy = pledges_grants_eoy;
    }

    public double getAccounts_receivable_boy() {
        return accounts_receivable_boy;
    }

    public void setAccounts_receivable_boy(double accounts_receivable_boy) {
        this.accounts_receivable_boy = accounts_receivable_boy;
    }

    public double getAccounts_receivable_eoy() {
        return accounts_receivable_eoy;
    }

    public void setAccounts_receivable_eoy(double accounts_receivable_eoy) {
        this.accounts_receivable_eoy = accounts_receivable_eoy;
    }

    public double getQualified_receivable_boy() {
        return qualified_receivable_boy;
    }

    public void setQualified_receivable_boy(double qualified_receivable_boy) {
        this.qualified_receivable_boy = qualified_receivable_boy;
    }

    public double getQualified_receivable_eoy() {
        return qualified_receivable_eoy;
    }

    public void setQualified_receivable_eoy(double qualified_receivable_eoy) {
        this.qualified_receivable_eoy = qualified_receivable_eoy;
    }

    public double getDisqualified_receivable_boy() {
        return disqualified_receivable_boy;
    }

    public void setDisqualified_receivable_boy(double disqualified_receivable_boy) {
        this.disqualified_receivable_boy = disqualified_receivable_boy;
    }

    public double getDisqualified_receivable_eoy() {
        return disqualified_receivable_eoy;
    }

    public void setDisqualified_receivable_eoy(double disqualified_receivable_eoy) {
        this.disqualified_receivable_eoy = disqualified_receivable_eoy;
    }

    public double getLoans_receivable_boy() {
        return loans_receivable_boy;
    }

    public void setLoans_receivable_boy(double loans_receivable_boy) {
        this.loans_receivable_boy = loans_receivable_boy;
    }

    public double getLoans_receivable_eoy() {
        return loans_receivable_eoy;
    }

    public void setLoans_receivable_eoy(double loans_receivable_eoy) {
        this.loans_receivable_eoy = loans_receivable_eoy;
    }

    public double getInventory_boy() {
        return inventory_boy;
    }

    public void setInventory_boy(double inventory_boy) {
        this.inventory_boy = inventory_boy;
    }

    public double getInventory_eoy() {
        return inventory_eoy;
    }

    public void setInventory_eoy(double inventory_eoy) {
        this.inventory_eoy = inventory_eoy;
    }

    public double getPrepaid_boy() {
        return prepaid_boy;
    }

    public void setPrepaid_boy(double prepaid_boy) {
        this.prepaid_boy = prepaid_boy;
    }

    public double getPrepaid_eoy() {
        return prepaid_eoy;
    }

    public void setPrepaid_eoy(double prepaid_eoy) {
        this.prepaid_eoy = prepaid_eoy;
    }

    public double getLbe_base() {
        return lbe_base;
    }

    public void setLbe_base(double lbe_base) {
        this.lbe_base = lbe_base;
    }

    public double getLess_depreciation() {
        return less_depreciation;
    }

    public void setLess_depreciation(double less_depreciation) {
        this.less_depreciation = less_depreciation;
    }

    public double getLbe_boy() {
        return lbe_boy;
    }

    public void setLbe_boy(double lbe_boy) {
        this.lbe_boy = lbe_boy;
    }

    public double getLbe_eoy() {
        return lbe_eoy;
    }

    public void setLbe_eoy(double lbe_eoy) {
        this.lbe_eoy = lbe_eoy;
    }

    public double getPublic_securities_boy() {
        return public_securities_boy;
    }

    public void setPublic_securities_boy(double public_securities_boy) {
        this.public_securities_boy = public_securities_boy;
    }

    public double getPublic_securities_eoy() {
        return public_securities_eoy;
    }

    public void setPublic_securities_eoy(double public_securities_eoy) {
        this.public_securities_eoy = public_securities_eoy;
    }

    public double getOther_securities_boy() {
        return other_securities_boy;
    }

    public void setOther_securities_boy(double other_securities_boy) {
        this.other_securities_boy = other_securities_boy;
    }

    public double getOther_securities_eoy() {
        return other_securities_eoy;
    }

    public void setOther_securities_eoy(double other_securities_eoy) {
        this.other_securities_eoy = other_securities_eoy;
    }

    public double getInvestment_programs_boy() {
        return investment_programs_boy;
    }

    public void setInvestment_programs_boy(double investment_programs_boy) {
        this.investment_programs_boy = investment_programs_boy;
    }

    public double getInvestment_programs_eoy() {
        return investment_programs_eoy;
    }

    public void setInvestment_programs_eoy(double investment_programs_eoy) {
        this.investment_programs_eoy = investment_programs_eoy;
    }

    public double getIntangible_assets_boy() {
        return intangible_assets_boy;
    }

    public void setIntangible_assets_boy(double intangible_assets_boy) {
        this.intangible_assets_boy = intangible_assets_boy;
    }

    public double getIntangible_assets_eoy() {
        return intangible_assets_eoy;
    }

    public void setIntangible_assets_eoy(double intangible_assets_eoy) {
        this.intangible_assets_eoy = intangible_assets_eoy;
    }

    public double getOther_assets_boy() {
        return other_assets_boy;
    }

    public void setOther_assets_boy(double other_assets_boy) {
        this.other_assets_boy = other_assets_boy;
    }

    public double getOther_assets_eoy() {
        return other_assets_eoy;
    }

    public void setOther_assets_eoy(double other_assets_eoy) {
        this.other_assets_eoy = other_assets_eoy;
    }

    public double getAssets_total_boy() {
        return assets_total_boy;
    }

    public void setAssets_total_boy(double assets_total_boy) {
        this.assets_total_boy = assets_total_boy;
    }

    public double getAssets_total_eoy() {
        return assets_total_eoy;
    }

    public void setAssets_total_eoy(double assets_total_eoy) {
        this.assets_total_eoy = assets_total_eoy;
    }

    public double getAccounts_payable_boy() {
        return accounts_payable_boy;
    }

    public void setAccounts_payable_boy(double accounts_payable_boy) {
        this.accounts_payable_boy = accounts_payable_boy;
    }

    public double getAccounts_payable_eoy() {
        return accounts_payable_eoy;
    }

    public void setAccounts_payable_eoy(double accounts_payable_eoy) {
        this.accounts_payable_eoy = accounts_payable_eoy;
    }

    public double getGrants_payable_boy() {
        return grants_payable_boy;
    }

    public void setGrants_payable_boy(double grants_payable_boy) {
        this.grants_payable_boy = grants_payable_boy;
    }

    public double getGrants_payable_eoy() {
        return grants_payable_eoy;
    }

    public void setGrants_payable_eoy(double grants_payable_eoy) {
        this.grants_payable_eoy = grants_payable_eoy;
    }

    public double getDeferred_revenue_boy() {
        return deferred_revenue_boy;
    }

    public void setDeferred_revenue_boy(double deferred_revenue_boy) {
        this.deferred_revenue_boy = deferred_revenue_boy;
    }

    public double getDeferred_revenue_eoy() {
        return deferred_revenue_eoy;
    }

    public void setDeferred_revenue_eoy(double deferred_revenue_eoy) {
        this.deferred_revenue_eoy = deferred_revenue_eoy;
    }

    public double getTax_exempt_bonds_boy() {
        return tax_exempt_bonds_boy;
    }

    public void setTax_exempt_bonds_boy(double tax_exempt_bonds_boy) {
        this.tax_exempt_bonds_boy = tax_exempt_bonds_boy;
    }

    public double getTax_exempt_bonds_eoy() {
        return tax_exempt_bonds_eoy;
    }

    public void setTax_exempt_bonds_eoy(double tax_exempt_bonds_eoy) {
        this.tax_exempt_bonds_eoy = tax_exempt_bonds_eoy;
    }

    public double getEscrow_liability_boy() {
        return escrow_liability_boy;
    }

    public void setEscrow_liability_boy(double escrow_liability_boy) {
        this.escrow_liability_boy = escrow_liability_boy;
    }

    public double getEscrow_liability_eoy() {
        return escrow_liability_eoy;
    }

    public void setEscrow_liability_eoy(double escrow_liability_eoy) {
        this.escrow_liability_eoy = escrow_liability_eoy;
    }

    public double getPayable_officiers_boy() {
        return payable_officiers_boy;
    }

    public void setPayable_officiers_boy(double payable_officiers_boy) {
        this.payable_officiers_boy = payable_officiers_boy;
    }

    public double getPayable_officiers_eoy() {
        return payable_officiers_eoy;
    }

    public void setPayable_officiers_eoy(double payable_officiers_eoy) {
        this.payable_officiers_eoy = payable_officiers_eoy;
    }

    public double getSecured_notes_payable_boy() {
        return secured_notes_payable_boy;
    }

    public void setSecured_notes_payable_boy(double secured_notes_payable_boy) {
        this.secured_notes_payable_boy = secured_notes_payable_boy;
    }

    public double getSecured_notes_payable_eoy() {
        return secured_notes_payable_eoy;
    }

    public void setSecured_notes_payable_eoy(double secured_notes_payable_eoy) {
        this.secured_notes_payable_eoy = secured_notes_payable_eoy;
    }

    public double getUnsecured_notes_payable_boy() {
        return unsecured_notes_payable_boy;
    }

    public void setUnsecured_notes_payable_boy(double unsecured_notes_payable_boy) {
        this.unsecured_notes_payable_boy = unsecured_notes_payable_boy;
    }

    public double getUnsecured_notes_payable_eoy() {
        return unsecured_notes_payable_eoy;
    }

    public void setUnsecured_notes_payable_eoy(double unsecured_notes_payable_eoy) {
        this.unsecured_notes_payable_eoy = unsecured_notes_payable_eoy;
    }

    public double getLiability_other_boy() {
        return liability_other_boy;
    }

    public void setLiability_other_boy(double liability_other_boy) {
        this.liability_other_boy = liability_other_boy;
    }

    public double getLiability_other_eoy() {
        return liability_other_eoy;
    }

    public void setLiability_other_eoy(double liability_other_eoy) {
        this.liability_other_eoy = liability_other_eoy;
    }

    public double getLiability_total_boy() {
        return liability_total_boy;
    }

    public void setLiability_total_boy(double liability_total_boy) {
        this.liability_total_boy = liability_total_boy;
    }

    public double getLiability_total_eoy() {
        return liability_total_eoy;
    }

    public void setLiability_total_eoy(double liability_total_eoy) {
        this.liability_total_eoy = liability_total_eoy;
    }

    public double getUnrestricted_boy() {
        return unrestricted_boy;
    }

    public void setUnrestricted_boy(double unrestricted_boy) {
        this.unrestricted_boy = unrestricted_boy;
    }

    public double getUnrestricted_eoy() {
        return unrestricted_eoy;
    }

    public void setUnrestricted_eoy(double unrestricted_eoy) {
        this.unrestricted_eoy = unrestricted_eoy;
    }

    public double getTemporarily_restricted_boy() {
        return temporarily_restricted_boy;
    }

    public void setTemporarily_restricted_boy(double temporarily_restricted_boy) {
        this.temporarily_restricted_boy = temporarily_restricted_boy;
    }

    public double getTemporarily_restricted_eoy() {
        return temporarily_restricted_eoy;
    }

    public void setTemporarily_restricted_eoy(double temporarily_restricted_eoy) {
        this.temporarily_restricted_eoy = temporarily_restricted_eoy;
    }

    public double getPermanently_restricted_boy() {
        return permanently_restricted_boy;
    }

    public void setPermanently_restricted_boy(double permanently_restricted_boy) {
        this.permanently_restricted_boy = permanently_restricted_boy;
    }

    public double getPermanently_restricted_eoy() {
        return permanently_restricted_eoy;
    }

    public void setPermanently_restricted_eoy(double permanently_restricted_eoy) {
        this.permanently_restricted_eoy = permanently_restricted_eoy;
    }

    public double getRestricted_boy() {
        return restricted_boy;
    }

    public void setRestricted_boy(double restricted_boy) {
        this.restricted_boy = restricted_boy;
    }

    public double getRestricted_eoy() {
        return restricted_eoy;
    }

    public void setRestricted_eoy(double restricted_eoy) {
        this.restricted_eoy = restricted_eoy;
    }

    public double getCapital_boy() {
        return capital_boy;
    }

    public void setCapital_boy(double capital_boy) {
        this.capital_boy = capital_boy;
    }

    public double getCapital_eoy() {
        return capital_eoy;
    }

    public void setCapital_eoy(double capital_eoy) {
        this.capital_eoy = capital_eoy;
    }

    public double getPaid_in_boy() {
        return paid_in_boy;
    }

    public void setPaid_in_boy(double paid_in_boy) {
        this.paid_in_boy = paid_in_boy;
    }

    public double getPaid_in_eoy() {
        return paid_in_eoy;
    }

    public void setPaid_in_eoy(double paid_in_eoy) {
        this.paid_in_eoy = paid_in_eoy;
    }

    public double getRetained_boy() {
        return retained_boy;
    }

    public void setRetained_boy(double retained_boy) {
        this.retained_boy = retained_boy;
    }

    public double getRetained_eoy() {
        return retained_eoy;
    }

    public void setRetained_eoy(double retained_eoy) {
        this.retained_eoy = retained_eoy;
    }

    public double getNet_total_boy() {
        return net_total_boy;
    }

    public void setNet_total_boy(double net_total_boy) {
        this.net_total_boy = net_total_boy;
    }

    public double getNet_total_eoy() {
        return net_total_eoy;
    }

    public void setNet_total_eoy(double net_total_eoy) {
        this.net_total_eoy = net_total_eoy;
    }

    public double getBalances_boy() {
        return balances_boy;
    }

    public void setBalances_boy(double balances_boy) {
        this.balances_boy = balances_boy;
    }

    public double getBalances_eoy() {
        return balances_eoy;
    }

    public void setBalances_eoy(double balances_eoy) {
        this.balances_eoy = balances_eoy;
    }
}

public static class PremierPart8Revenue {
    private double federated_campaigns;
    private double membership_dues;
    private double fundraising_events;
    private double related_orgs;
    private double government_grants;
    private double contributions_other;
    private double contributions_noncash;
    private double contributions_all;
    private double service_revenue;
    private double income_investment;
    private double income_bonds;
    private double royalties;
    private double rents_real;
    private double rents_personal;
    private double rent_expenses_real;
    private double rent_expenses_personal;
    private double rent_income_real;
    private double rent_income_personal;
    private double net_rental;
    private double gross_securities;
    private double gross_other;
    private double cost_securities;
    private double cost_other;
    private double gain_securities;
    private double gain_other;
    private double net_sales;
    private double contributions;
    private double gross_special;
    private double direct_expenses;
    private double net_special;
    private double gaming_income;
    private double gaming_expenses;
    private double gaming_net;
    private double gross_sales;
    private double cost_goods;
    private double gross_profit;
    private double revenue_other;
    private double revenue_total;
    private String service_description_a;
    private double service_code_a;
    private String service_description_b;
    private double service_amount_a;
    private double service_code_b;
    private double service_amount_b;
    private String service_description_c;
    private double service_code_c;
    private double service_amount_c;
    private String service_description_d;
    private double service_code_d;
    private double service_amount_d;
    private String service_description_e;
    private double service_code_e;
    private double service_amount_e;
    private String service_description_f;
    private double service_code_f;
    private double service_amount_f;

    public PremierPart8Revenue() {}

    public PremierPart8Revenue(double federated_campaigns, double membership_dues, double fundraising_events, double related_orgs, double government_grants, double contributions_other, double contributions_noncash, double contributions_all, double service_revenue, double income_investment, double income_bonds, double royalties, double rents_real, double rents_personal, double rent_expenses_real, double rent_expenses_personal, double rent_income_real, double rent_income_personal, double net_rental, double gross_securities, double gross_other, double cost_securities, double cost_other, double gain_securities, double gain_other, double net_sales, double contributions, double gross_special, double direct_expenses, double net_special, double gaming_income, double gaming_expenses, double gaming_net, double gross_sales, double cost_goods, double gross_profit, double revenue_other, double revenue_total, String service_description_a, double service_code_a, String service_description_b, double service_amount_a, double service_code_b, double service_amount_b, String service_description_c, double service_code_c, double service_amount_c, String service_description_d, double service_code_d, double service_amount_d, String service_description_e, double service_code_e, double service_amount_e, String service_description_f, double service_code_f, double service_amount_f) {
        this.federated_campaigns = federated_campaigns;
        this.membership_dues = membership_dues;
        this.fundraising_events = fundraising_events;
        this.related_orgs = related_orgs;
        this.government_grants = government_grants;
        this.contributions_other = contributions_other;
        this.contributions_noncash = contributions_noncash;
        this.contributions_all = contributions_all;
        this.service_revenue = service_revenue;
        this.income_investment = income_investment;
        this.income_bonds = income_bonds;
        this.royalties = royalties;
        this.rents_real = rents_real;
        this.rents_personal = rents_personal;
        this.rent_expenses_real = rent_expenses_real;
        this.rent_expenses_personal = rent_expenses_personal;
        this.rent_income_real = rent_income_real;
        this.rent_income_personal = rent_income_personal;
        this.net_rental = net_rental;
        this.gross_securities = gross_securities;
        this.gross_other = gross_other;
        this.cost_securities = cost_securities;
        this.cost_other = cost_other;
        this.gain_securities = gain_securities;
        this.gain_other = gain_other;
        this.net_sales = net_sales;
        this.contributions = contributions;
        this.gross_special = gross_special;
        this.direct_expenses = direct_expenses;
        this.net_special = net_special;
        this.gaming_income = gaming_income;
        this.gaming_expenses = gaming_expenses;
        this.gaming_net = gaming_net;
        this.gross_sales = gross_sales;
        this.cost_goods = cost_goods;
        this.gross_profit = gross_profit;
        this.revenue_other = revenue_other;
        this.revenue_total = revenue_total;
        this.service_description_a = service_description_a;
        this.service_code_a = service_code_a;
        this.service_description_b = service_description_b;
        this.service_amount_a = service_amount_a;
        this.service_code_b = service_code_b;
        this.service_amount_b = service_amount_b;
        this.service_description_c = service_description_c;
        this.service_code_c = service_code_c;
        this.service_amount_c = service_amount_c;
        this.service_description_d = service_description_d;
        this.service_code_d = service_code_d;
        this.service_amount_d = service_amount_d;
        this.service_description_e = service_description_e;
        this.service_code_e = service_code_e;
        this.service_amount_e = service_amount_e;
        this.service_description_f = service_description_f;
        this.service_code_f = service_code_f;
        this.service_amount_f = service_amount_f;
    }

    public double getFederated_campaigns() {
        return federated_campaigns;
    }

    public void setFederated_campaigns(double federated_campaigns) {
        this.federated_campaigns = federated_campaigns;
    }

    public double getMembership_dues() {
        return membership_dues;
    }

    public void setMembership_dues(double membership_dues) {
        this.membership_dues = membership_dues;
    }

    public double getFundraising_events() {
        return fundraising_events;
    }

    public void setFundraising_events(double fundraising_events) {
        this.fundraising_events = fundraising_events;
    }

    public double getRelated_orgs() {
        return related_orgs;
    }

    public void setRelated_orgs(double related_orgs) {
        this.related_orgs = related_orgs;
    }

    public double getGovernment_grants() {
        return government_grants;
    }

    public void setGovernment_grants(double government_grants) {
        this.government_grants = government_grants;
    }

    public double getContributions_other() {
        return contributions_other;
    }

    public void setContributions_other(double contributions_other) {
        this.contributions_other = contributions_other;
    }

    public double getContributions_noncash() {
        return contributions_noncash;
    }

    public void setContributions_noncash(double contributions_noncash) {
        this.contributions_noncash = contributions_noncash;
    }

    public double getContributions_all() {
        return contributions_all;
    }

    public void setContributions_all(double contributions_all) {
        this.contributions_all = contributions_all;
    }

    public double getService_revenue() {
        return service_revenue;
    }

    public void setService_revenue(double service_revenue) {
        this.service_revenue = service_revenue;
    }

    public double getIncome_investment() {
        return income_investment;
    }

    public void setIncome_investment(double income_investment) {
        this.income_investment = income_investment;
    }

    public double getIncome_bonds() {
        return income_bonds;
    }

    public void setIncome_bonds(double income_bonds) {
        this.income_bonds = income_bonds;
    }

    public double getRoyalties() {
        return royalties;
    }

    public void setRoyalties(double royalties) {
        this.royalties = royalties;
    }

    public double getRents_real() {
        return rents_real;
    }

    public void setRents_real(double rents_real) {
        this.rents_real = rents_real;
    }

    public double getRents_personal() {
        return rents_personal;
    }

    public void setRents_personal(double rents_personal) {
        this.rents_personal = rents_personal;
    }

    public double getRent_expenses_real() {
        return rent_expenses_real;
    }

    public void setRent_expenses_real(double rent_expenses_real) {
        this.rent_expenses_real = rent_expenses_real;
    }

    public double getRent_expenses_personal() {
        return rent_expenses_personal;
    }

    public void setRent_expenses_personal(double rent_expenses_personal) {
        this.rent_expenses_personal = rent_expenses_personal;
    }

    public double getRent_income_real() {
        return rent_income_real;
    }

    public void setRent_income_real(double rent_income_real) {
        this.rent_income_real = rent_income_real;
    }

    public double getRent_income_personal() {
        return rent_income_personal;
    }

    public void setRent_income_personal(double rent_income_personal) {
        this.rent_income_personal = rent_income_personal;
    }

    public double getNet_rental() {
        return net_rental;
    }

    public void setNet_rental(double net_rental) {
        this.net_rental = net_rental;
    }

    public double getGross_securities() {
        return gross_securities;
    }

    public void setGross_securities(double gross_securities) {
        this.gross_securities = gross_securities;
    }

    public double getGross_other() {
        return gross_other;
    }

    public void setGross_other(double gross_other) {
        this.gross_other = gross_other;
    }

    public double getCost_securities() {
        return cost_securities;
    }

    public void setCost_securities(double cost_securities) {
        this.cost_securities = cost_securities;
    }

    public double getCost_other() {
        return cost_other;
    }

    public void setCost_other(double cost_other) {
        this.cost_other = cost_other;
    }

    public double getGain_securities() {
        return gain_securities;
    }

    public void setGain_securities(double gain_securities) {
        this.gain_securities = gain_securities;
    }

    public double getGain_other() {
        return gain_other;
    }

    public void setGain_other(double gain_other) {
        this.gain_other = gain_other;
    }

    public double getNet_sales() {
        return net_sales;
    }

    public void setNet_sales(double net_sales) {
        this.net_sales = net_sales;
    }

    public double getContributions() {
        return contributions;
    }

    public void setContributions(double contributions) {
        this.contributions = contributions;
    }

    public double getGross_special() {
        return gross_special;
    }

    public void setGross_special(double gross_special) {
        this.gross_special = gross_special;
    }

    public double getDirect_expenses() {
        return direct_expenses;
    }

    public void setDirect_expenses(double direct_expenses) {
        this.direct_expenses = direct_expenses;
    }

    public double getNet_special() {
        return net_special;
    }

    public void setNet_special(double net_special) {
        this.net_special = net_special;
    }

    public double getGaming_income() {
        return gaming_income;
    }

    public void setGaming_income(double gaming_income) {
        this.gaming_income = gaming_income;
    }

    public double getGaming_expenses() {
        return gaming_expenses;
    }

    public void setGaming_expenses(double gaming_expenses) {
        this.gaming_expenses = gaming_expenses;
    }

    public double getGaming_net() {
        return gaming_net;
    }

    public void setGaming_net(double gaming_net) {
        this.gaming_net = gaming_net;
    }

    public double getGross_sales() {
        return gross_sales;
    }

    public void setGross_sales(double gross_sales) {
        this.gross_sales = gross_sales;
    }

    public double getCost_goods() {
        return cost_goods;
    }

    public void setCost_goods(double cost_goods) {
        this.cost_goods = cost_goods;
    }

    public double getGross_profit() {
        return gross_profit;
    }

    public void setGross_profit(double gross_profit) {
        this.gross_profit = gross_profit;
    }

    public double getRevenue_other() {
        return revenue_other;
    }

    public void setRevenue_other(double revenue_other) {
        this.revenue_other = revenue_other;
    }

    public double getRevenue_total() {
        return revenue_total;
    }

    public void setRevenue_total(double revenue_total) {
        this.revenue_total = revenue_total;
    }

    public String getService_description_a() {
        return service_description_a;
    }

    public void setService_description_a(String service_description_a) {
        this.service_description_a = service_description_a;
    }

    public double getService_code_a() {
        return service_code_a;
    }

    public void setService_code_a(double service_code_a) {
        this.service_code_a = service_code_a;
    }

    public String getService_description_b() {
        return service_description_b;
    }

    public void setService_description_b(String service_description_b) {
        this.service_description_b = service_description_b;
    }

    public double getService_amount_a() {
        return service_amount_a;
    }

    public void setService_amount_a(double service_amount_a) {
        this.service_amount_a = service_amount_a;
    }

    public double getService_code_b() {
        return service_code_b;
    }

    public void setService_code_b(double service_code_b) {
        this.service_code_b = service_code_b;
    }

    public double getService_amount_b() {
        return service_amount_b;
    }

    public void setService_amount_b(double service_amount_b) {
        this.service_amount_b = service_amount_b;
    }

    public String getService_description_c() {
        return service_description_c;
    }

    public void setService_description_c(String service_description_c) {
        this.service_description_c = service_description_c;
    }

    public double getService_code_c() {
        return service_code_c;
    }

    public void setService_code_c(double service_code_c) {
        this.service_code_c = service_code_c;
    }

    public double getService_amount_c() {
        return service_amount_c;
    }

    public void setService_amount_c(double service_amount_c) {
        this.service_amount_c = service_amount_c;
    }

    public String getService_description_d() {
        return service_description_d;
    }

    public void setService_description_d(String service_description_d) {
        this.service_description_d = service_description_d;
    }

    public double getService_code_d() {
        return service_code_d;
    }

    public void setService_code_d(double service_code_d) {
        this.service_code_d = service_code_d;
    }

    public double getService_amount_d() {
        return service_amount_d;
    }

    public void setService_amount_d(double service_amount_d) {
        this.service_amount_d = service_amount_d;
    }

    public String getService_description_e() {
        return service_description_e;
    }

    public void setService_description_e(String service_description_e) {
        this.service_description_e = service_description_e;
    }

    public double getService_code_e() {
        return service_code_e;
    }

    public void setService_code_e(double service_code_e) {
        this.service_code_e = service_code_e;
    }

    public double getService_amount_e() {
        return service_amount_e;
    }

    public void setService_amount_e(double service_amount_e) {
        this.service_amount_e = service_amount_e;
    }

    public String getService_description_f() {
        return service_description_f;
    }

    public void setService_description_f(String service_description_f) {
        this.service_description_f = service_description_f;
    }

    public double getService_code_f() {
        return service_code_f;
    }

    public void setService_code_f(double service_code_f) {
        this.service_code_f = service_code_f;
    }

    public double getService_amount_f() {
        return service_amount_f;
    }

    public void setService_amount_f(double service_amount_f) {
        this.service_amount_f = service_amount_f;
    }
}

public static class PremierPart9Expenses {
    private double grants_orgs_us;
    private double grants_individuals_us;
    private double grants_orgs_non_us;
    private double benefits_total;
    private double compensation_current;
    private double compensation_disqualified;
    private double wages_total;
    private double pension_total;
    private double employee_benefits_total;
    private double payroll_tax_total;
    private double fees_management;
    private double fees_legal;
    private double accounting_fees_total;
    private double fees_lobbying;
    private double fundraising_total;
    private double fees_investments;
    private double fees_other;
    private double ads_promo;
    private double office;
    private double information_technology;
    private double expense_royalties;
    private double occupancy_total;
    private double travel_total;
    private double entertain_officials;
    private double meetings_total;
    private double interest_total;
    private double payments;
    private double depreciation_total;
    private double insurance;
    private double expense_a_total;
    private double expense_b_total;
    private double expense_c_total;
    private double expense_d_total;
    private double expense_e_total;
    private double expenses_total;
    private double total_program_services;
    private double total_management;
    private double total_fundraising;
    private double expense_joint_total;
    private double joint_services;
    private double joint_general;
    private double joint_fundraising;
    private double all_other_expenses;
    private String expense_a_description;
    private String expense_b_description;
    private String expense_c_description;
    private String expense_d_description;

    public PremierPart9Expenses() {}

    public PremierPart9Expenses(double grants_orgs_us, double grants_individuals_us, double grants_orgs_non_us, double benefits_total, double compensation_current, double compensation_disqualified, double wages_total, double pension_total, double employee_benefits_total, double payroll_tax_total, double fees_management, double fees_legal, double accounting_fees_total, double fees_lobbying, double fundraising_total, double fees_investments, double fees_other, double ads_promo, double office, double information_technology, double expense_royalties, double occupancy_total, double travel_total, double entertain_officials, double meetings_total, double interest_total, double payments, double depreciation_total, double insurance, double expense_a_total, double expense_b_total, double expense_c_total, double expense_d_total, double expense_e_total, double expenses_total, double total_program_services, double total_management, double total_fundraising, double expense_joint_total, double joint_services, double joint_general, double joint_fundraising, double all_other_expenses, String expense_a_description, String expense_b_description, String expense_c_description, String expense_d_description) {
        this.grants_orgs_us = grants_orgs_us;
        this.grants_individuals_us = grants_individuals_us;
        this.grants_orgs_non_us = grants_orgs_non_us;
        this.benefits_total = benefits_total;
        this.compensation_current = compensation_current;
        this.compensation_disqualified = compensation_disqualified;
        this.wages_total = wages_total;
        this.pension_total = pension_total;
        this.employee_benefits_total = employee_benefits_total;
        this.payroll_tax_total = payroll_tax_total;
        this.fees_management = fees_management;
        this.fees_legal = fees_legal;
        this.accounting_fees_total = accounting_fees_total;
        this.fees_lobbying = fees_lobbying;
        this.fundraising_total = fundraising_total;
        this.fees_investments = fees_investments;
        this.fees_other = fees_other;
        this.ads_promo = ads_promo;
        this.office = office;
        this.information_technology = information_technology;
        this.expense_royalties = expense_royalties;
        this.occupancy_total = occupancy_total;
        this.travel_total = travel_total;
        this.entertain_officials = entertain_officials;
        this.meetings_total = meetings_total;
        this.interest_total = interest_total;
        this.payments = payments;
        this.depreciation_total = depreciation_total;
        this.insurance = insurance;
        this.expense_a_total = expense_a_total;
        this.expense_b_total = expense_b_total;
        this.expense_c_total = expense_c_total;
        this.expense_d_total = expense_d_total;
        this.expense_e_total = expense_e_total;
        this.expenses_total = expenses_total;
        this.total_program_services = total_program_services;
        this.total_management = total_management;
        this.total_fundraising = total_fundraising;
        this.expense_joint_total = expense_joint_total;
        this.joint_services = joint_services;
        this.joint_general = joint_general;
        this.joint_fundraising = joint_fundraising;
        this.all_other_expenses = all_other_expenses;
        this.expense_a_description = expense_a_description;
        this.expense_b_description = expense_b_description;
        this.expense_c_description = expense_c_description;
        this.expense_d_description = expense_d_description;
    }

    public double getGrants_orgs_us() {
        return grants_orgs_us;
    }

    public void setGrants_orgs_us(double grants_orgs_us) {
        this.grants_orgs_us = grants_orgs_us;
    }

    public double getGrants_individuals_us() {
        return grants_individuals_us;
    }

    public void setGrants_individuals_us(double grants_individuals_us) {
        this.grants_individuals_us = grants_individuals_us;
    }

    public double getGrants_orgs_non_us() {
        return grants_orgs_non_us;
    }

    public void setGrants_orgs_non_us(double grants_orgs_non_us) {
        this.grants_orgs_non_us = grants_orgs_non_us;
    }

    public double getBenefits_total() {
        return benefits_total;
    }

    public void setBenefits_total(double benefits_total) {
        this.benefits_total = benefits_total;
    }

    public double getCompensation_current() {
        return compensation_current;
    }

    public void setCompensation_current(double compensation_current) {
        this.compensation_current = compensation_current;
    }

    public double getCompensation_disqualified() {
        return compensation_disqualified;
    }

    public void setCompensation_disqualified(double compensation_disqualified) {
        this.compensation_disqualified = compensation_disqualified;
    }

    public double getWages_total() {
        return wages_total;
    }

    public void setWages_total(double wages_total) {
        this.wages_total = wages_total;
    }

    public double getPension_total() {
        return pension_total;
    }

    public void setPension_total(double pension_total) {
        this.pension_total = pension_total;
    }

    public double getEmployee_benefits_total() {
        return employee_benefits_total;
    }

    public void setEmployee_benefits_total(double employee_benefits_total) {
        this.employee_benefits_total = employee_benefits_total;
    }

    public double getPayroll_tax_total() {
        return payroll_tax_total;
    }

    public void setPayroll_tax_total(double payroll_tax_total) {
        this.payroll_tax_total = payroll_tax_total;
    }

    public double getFees_management() {
        return fees_management;
    }

    public void setFees_management(double fees_management) {
        this.fees_management = fees_management;
    }

    public double getFees_legal() {
        return fees_legal;
    }

    public void setFees_legal(double fees_legal) {
        this.fees_legal = fees_legal;
    }

    public double getAccounting_fees_total() {
        return accounting_fees_total;
    }

    public void setAccounting_fees_total(double accounting_fees_total) {
        this.accounting_fees_total = accounting_fees_total;
    }

    public double getFees_lobbying() {
        return fees_lobbying;
    }

    public void setFees_lobbying(double fees_lobbying) {
        this.fees_lobbying = fees_lobbying;
    }

    public double getFundraising_total() {
        return fundraising_total;
    }

    public void setFundraising_total(double fundraising_total) {
        this.fundraising_total = fundraising_total;
    }

    public double getFees_investments() {
        return fees_investments;
    }

    public void setFees_investments(double fees_investments) {
        this.fees_investments = fees_investments;
    }

    public double getFees_other() {
        return fees_other;
    }

    public void setFees_other(double fees_other) {
        this.fees_other = fees_other;
    }

    public double getAds_promo() {
        return ads_promo;
    }

    public void setAds_promo(double ads_promo) {
        this.ads_promo = ads_promo;
    }

    public double getOffice() {
        return office;
    }

    public void setOffice(double office) {
        this.office = office;
    }

    public double getInformation_technology() {
        return information_technology;
    }

    public void setInformation_technology(double information_technology) {
        this.information_technology = information_technology;
    }

    public double getExpense_royalties() {
        return expense_royalties;
    }

    public void setExpense_royalties(double expense_royalties) {
        this.expense_royalties = expense_royalties;
    }

    public double getOccupancy_total() {
        return occupancy_total;
    }

    public void setOccupancy_total(double occupancy_total) {
        this.occupancy_total = occupancy_total;
    }

    public double getTravel_total() {
        return travel_total;
    }

    public void setTravel_total(double travel_total) {
        this.travel_total = travel_total;
    }

    public double getEntertain_officials() {
        return entertain_officials;
    }

    public void setEntertain_officials(double entertain_officials) {
        this.entertain_officials = entertain_officials;
    }

    public double getMeetings_total() {
        return meetings_total;
    }

    public void setMeetings_total(double meetings_total) {
        this.meetings_total = meetings_total;
    }

    public double getInterest_total() {
        return interest_total;
    }

    public void setInterest_total(double interest_total) {
        this.interest_total = interest_total;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

    public double getDepreciation_total() {
        return depreciation_total;
    }

    public void setDepreciation_total(double depreciation_total) {
        this.depreciation_total = depreciation_total;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getExpense_a_total() {
        return expense_a_total;
    }

    public void setExpense_a_total(double expense_a_total) {
        this.expense_a_total = expense_a_total;
    }

    public double getExpense_b_total() {
        return expense_b_total;
    }

    public void setExpense_b_total(double expense_b_total) {
        this.expense_b_total = expense_b_total;
    }

    public double getExpense_c_total() {
        return expense_c_total;
    }

    public void setExpense_c_total(double expense_c_total) {
        this.expense_c_total = expense_c_total;
    }

    public double getExpense_d_total() {
        return expense_d_total;
    }

    public void setExpense_d_total(double expense_d_total) {
        this.expense_d_total = expense_d_total;
    }

    public double getExpense_e_total() {
        return expense_e_total;
    }

    public void setExpense_e_total(double expense_e_total) {
        this.expense_e_total = expense_e_total;
    }

    public double getExpenses_total() {
        return expenses_total;
    }

    public void setExpenses_total(double expenses_total) {
        this.expenses_total = expenses_total;
    }

    public double getTotal_program_services() {
        return total_program_services;
    }

    public void setTotal_program_services(double total_program_services) {
        this.total_program_services = total_program_services;
    }

    public double getTotal_management() {
        return total_management;
    }

    public void setTotal_management(double total_management) {
        this.total_management = total_management;
    }

    public double getTotal_fundraising() {
        return total_fundraising;
    }

    public void setTotal_fundraising(double total_fundraising) {
        this.total_fundraising = total_fundraising;
    }

    public double getExpense_joint_total() {
        return expense_joint_total;
    }

    public void setExpense_joint_total(double expense_joint_total) {
        this.expense_joint_total = expense_joint_total;
    }

    public double getJoint_services() {
        return joint_services;
    }

    public void setJoint_services(double joint_services) {
        this.joint_services = joint_services;
    }

    public double getJoint_general() {
        return joint_general;
    }

    public void setJoint_general(double joint_general) {
        this.joint_general = joint_general;
    }

    public double getJoint_fundraising() {
        return joint_fundraising;
    }

    public void setJoint_fundraising(double joint_fundraising) {
        this.joint_fundraising = joint_fundraising;
    }

    public double getAll_other_expenses() {
        return all_other_expenses;
    }

    public void setAll_other_expenses(double all_other_expenses) {
        this.all_other_expenses = all_other_expenses;
    }

    public String getExpense_a_description() {
        return expense_a_description;
    }

    public void setExpense_a_description(String expense_a_description) {
        this.expense_a_description = expense_a_description;
    }

    public String getExpense_b_description() {
        return expense_b_description;
    }

    public void setExpense_b_description(String expense_b_description) {
        this.expense_b_description = expense_b_description;
    }

    public String getExpense_c_description() {
        return expense_c_description;
    }

    public void setExpense_c_description(String expense_c_description) {
        this.expense_c_description = expense_c_description;
    }

    public String getExpense_d_description() {
        return expense_d_description;
    }

    public void setExpense_d_description(String expense_d_description) {
        this.expense_d_description = expense_d_description;
    }
}

public static class PremierPcsCode {
    private String pcs_facet;
    private String pcs_code;
    private String pcs_description;
    private String pcs_parent_code;
    private String pcs_parent_description;

    public PremierPcsCode() {}

    public PremierPcsCode(String pcs_facet, String pcs_code, String pcs_description, String pcs_parent_code, String pcs_parent_description) {
        this.pcs_facet = pcs_facet;
        this.pcs_code = pcs_code;
        this.pcs_description = pcs_description;
        this.pcs_parent_code = pcs_parent_code;
        this.pcs_parent_description = pcs_parent_description;
    }

    public String getPcs_facet() {
        return pcs_facet;
    }

    public void setPcs_facet(String pcs_facet) {
        this.pcs_facet = pcs_facet;
    }

    public String getPcs_code() {
        return pcs_code;
    }

    public void setPcs_code(String pcs_code) {
        this.pcs_code = pcs_code;
    }

    public String getPcs_description() {
        return pcs_description;
    }

    public void setPcs_description(String pcs_description) {
        this.pcs_description = pcs_description;
    }

    public String getPcs_parent_code() {
        return pcs_parent_code;
    }

    public void setPcs_parent_code(String pcs_parent_code) {
        this.pcs_parent_code = pcs_parent_code;
    }

    public String getPcs_parent_description() {
        return pcs_parent_description;
    }

    public void setPcs_parent_description(String pcs_parent_description) {
        this.pcs_parent_description = pcs_parent_description;
    }
}

public static class PremierPhoto {
    private String picture_url;
    private String caption;

    public PremierPhoto() {}

    public PremierPhoto(String picture_url, String caption) {
        this.picture_url = picture_url;
        this.caption = caption;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}

public static class PremierPlatinumEvaluationDocument {
    private String document_name;
    private String document_year;
    private String document_url;
    private String document_type;

    public PremierPlatinumEvaluationDocument() {}

    public PremierPlatinumEvaluationDocument(String document_name, String document_year, String document_url, String document_type) {
        this.document_name = document_name;
        this.document_year = document_year;
        this.document_url = document_url;
        this.document_type = document_type;
    }

    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }

    public String getDocument_year() {
        return document_year;
    }

    public void setDocument_year(String document_year) {
        this.document_year = document_year;
    }

    public String getDocument_url() {
        return document_url;
    }

    public void setDocument_url(String document_url) {
        this.document_url = document_url;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }
}

public static class PremierProfileDataChangeDates {
    private String primary_address_last_modified;
    private String payment_address_last_modified;
    private String primary_contact_email_last_modified;
    private String fundraising_contact_email_last_modified;
    private String org_website_last_modified;
    private String seal_last_modified;
    private String dei_last_modified;

    public PremierProfileDataChangeDates() {}

    public PremierProfileDataChangeDates(String primary_address_last_modified, String payment_address_last_modified, String primary_contact_email_last_modified, String fundraising_contact_email_last_modified, String org_website_last_modified, String seal_last_modified, String dei_last_modified) {
        this.primary_address_last_modified = primary_address_last_modified;
        this.payment_address_last_modified = payment_address_last_modified;
        this.primary_contact_email_last_modified = primary_contact_email_last_modified;
        this.fundraising_contact_email_last_modified = fundraising_contact_email_last_modified;
        this.org_website_last_modified = org_website_last_modified;
        this.seal_last_modified = seal_last_modified;
        this.dei_last_modified = dei_last_modified;
    }

    public String getPrimary_address_last_modified() {
        return primary_address_last_modified;
    }

    public void setPrimary_address_last_modified(String primary_address_last_modified) {
        this.primary_address_last_modified = primary_address_last_modified;
    }

    public String getPayment_address_last_modified() {
        return payment_address_last_modified;
    }

    public void setPayment_address_last_modified(String payment_address_last_modified) {
        this.payment_address_last_modified = payment_address_last_modified;
    }

    public String getPrimary_contact_email_last_modified() {
        return primary_contact_email_last_modified;
    }

    public void setPrimary_contact_email_last_modified(String primary_contact_email_last_modified) {
        this.primary_contact_email_last_modified = primary_contact_email_last_modified;
    }

    public String getFundraising_contact_email_last_modified() {
        return fundraising_contact_email_last_modified;
    }

    public void setFundraising_contact_email_last_modified(String fundraising_contact_email_last_modified) {
        this.fundraising_contact_email_last_modified = fundraising_contact_email_last_modified;
    }

    public String getOrg_website_last_modified() {
        return org_website_last_modified;
    }

    public void setOrg_website_last_modified(String org_website_last_modified) {
        this.org_website_last_modified = org_website_last_modified;
    }

    public String getSeal_last_modified() {
        return seal_last_modified;
    }

    public void setSeal_last_modified(String seal_last_modified) {
        this.seal_last_modified = seal_last_modified;
    }

    public String getDei_last_modified() {
        return dei_last_modified;
    }

    public void setDei_last_modified(String dei_last_modified) {
        this.dei_last_modified = dei_last_modified;
    }
}

public static class PremierProfileSdgCode {
    private int id;
    private String description;

    public PremierProfileSdgCode() {}

    public PremierProfileSdgCode(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public static class PremierProfitability {
    private String surplus_as_percent_of_expenses_before_depreciation;
    private String surplus_as_percent_of_expenses_after_depreciation;

    public PremierProfitability() {}

    public PremierProfitability(String surplus_as_percent_of_expenses_before_depreciation, String surplus_as_percent_of_expenses_after_depreciation) {
        this.surplus_as_percent_of_expenses_before_depreciation = surplus_as_percent_of_expenses_before_depreciation;
        this.surplus_as_percent_of_expenses_after_depreciation = surplus_as_percent_of_expenses_after_depreciation;
    }

    public String getSurplus_as_percent_of_expenses_before_depreciation() {
        return surplus_as_percent_of_expenses_before_depreciation;
    }

    public void setSurplus_as_percent_of_expenses_before_depreciation(String surplus_as_percent_of_expenses_before_depreciation) {
        this.surplus_as_percent_of_expenses_before_depreciation = surplus_as_percent_of_expenses_before_depreciation;
    }

    public String getSurplus_as_percent_of_expenses_after_depreciation() {
        return surplus_as_percent_of_expenses_after_depreciation;
    }

    public void setSurplus_as_percent_of_expenses_after_depreciation(String surplus_as_percent_of_expenses_after_depreciation) {
        this.surplus_as_percent_of_expenses_after_depreciation = surplus_as_percent_of_expenses_after_depreciation;
    }
}

public static class PremierProgram {
    private String name;
    private String description;
    private String target_population;
    private String target_population2;
    private String budget;
    private List<String> areas_served;

    public PremierProgram() {}

    public PremierProgram(String name, String description, String target_population, String target_population2, String budget, List<String> areas_served) {
        this.name = name;
        this.description = description;
        this.target_population = target_population;
        this.target_population2 = target_population2;
        this.budget = budget;
        this.areas_served = areas_served;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTarget_population() {
        return target_population;
    }

    public void setTarget_population(String target_population) {
        this.target_population = target_population;
    }

    public String getTarget_population2() {
        return target_population2;
    }

    public void setTarget_population2(String target_population2) {
        this.target_population2 = target_population2;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public List<String> getAreas_served() {
        return areas_served;
    }

    public void setAreas_served(List<String> areas_served) {
        this.areas_served = areas_served;
    }
}

public static class PremierProgramPlatinumMetric {
    private String metric;
    private List<PremierYear> years;
    private List<Object> target_population_served;
    private String type_of_metric;
    private String direction_of_success;

    public PremierProgramPlatinumMetric() {}

    public PremierProgramPlatinumMetric(String metric, List<PremierYear> years, List<Object> target_population_served, String type_of_metric, String direction_of_success) {
        this.metric = metric;
        this.years = years;
        this.target_population_served = target_population_served;
        this.type_of_metric = type_of_metric;
        this.direction_of_success = direction_of_success;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public List<PremierYear> getYears() {
        return years;
    }

    public void setYears(List<PremierYear> years) {
        this.years = years;
    }

    public List<Object> getTarget_population_served() {
        return target_population_served;
    }

    public void setTarget_population_served(List<Object> target_population_served) {
        this.target_population_served = target_population_served;
    }

    public String getType_of_metric() {
        return type_of_metric;
    }

    public void setType_of_metric(String type_of_metric) {
        this.type_of_metric = type_of_metric;
    }

    public String getDirection_of_success() {
        return direction_of_success;
    }

    public void setDirection_of_success(String direction_of_success) {
        this.direction_of_success = direction_of_success;
    }
}

public static class PremierPrograms {
    private List<PremierProgram> programs;
    private List<PremierProgramPlatinumMetric> platinum_metrics;
    private List<PremierChartingImpactAnswer> charting_impact_answers;

    public PremierPrograms() {}

    public PremierPrograms(List<PremierProgram> programs, List<PremierProgramPlatinumMetric> platinum_metrics, List<PremierChartingImpactAnswer> charting_impact_answers) {
        this.programs = programs;
        this.platinum_metrics = platinum_metrics;
        this.charting_impact_answers = charting_impact_answers;
    }

    public List<PremierProgram> getPrograms() {
        return programs;
    }

    public void setPrograms(List<PremierProgram> programs) {
        this.programs = programs;
    }

    public List<PremierProgramPlatinumMetric> getPlatinum_metrics() {
        return platinum_metrics;
    }

    public void setPlatinum_metrics(List<PremierProgramPlatinumMetric> platinum_metrics) {
        this.platinum_metrics = platinum_metrics;
    }

    public List<PremierChartingImpactAnswer> getCharting_impact_answers() {
        return charting_impact_answers;
    }

    public void setCharting_impact_answers(List<PremierChartingImpactAnswer> charting_impact_answers) {
        this.charting_impact_answers = charting_impact_answers;
    }
}

public static class PremierResponse {
    private int code;
    private String message;
    private int took;
    private List<Object> errors;
    private PremierData data;

    public PremierResponse() {}

    public PremierResponse(int code, String message, int took, List<Object> errors, PremierData data) {
        this.code = code;
        this.message = message;
        this.took = took;
        this.errors = errors;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTook() {
        return took;
    }

    public void setTook(int took) {
        this.took = took;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    public PremierData getData() {
        return data;
    }

    public void setData(PremierData data) {
        this.data = data;
    }
}

public static class PremierRevenueComposition {
    private int total_revenue_unrestricted_and_restricted;
    private String total_revenue_percent_change_over_prior_year;
    private double total_revenue_prior;
    private String program_svcs_revenue;
    private String membership_dues;
    private String investment_income;
    private String government_grants;
    private String other_grants_contributions;
    private String other_revenue;

    public PremierRevenueComposition() {}

    public PremierRevenueComposition(int total_revenue_unrestricted_and_restricted, String total_revenue_percent_change_over_prior_year, double total_revenue_prior, String program_svcs_revenue, String membership_dues, String investment_income, String government_grants, String other_grants_contributions, String other_revenue) {
        this.total_revenue_unrestricted_and_restricted = total_revenue_unrestricted_and_restricted;
        this.total_revenue_percent_change_over_prior_year = total_revenue_percent_change_over_prior_year;
        this.total_revenue_prior = total_revenue_prior;
        this.program_svcs_revenue = program_svcs_revenue;
        this.membership_dues = membership_dues;
        this.investment_income = investment_income;
        this.government_grants = government_grants;
        this.other_grants_contributions = other_grants_contributions;
        this.other_revenue = other_revenue;
    }

    public int getTotal_revenue_unrestricted_and_restricted() {
        return total_revenue_unrestricted_and_restricted;
    }

    public void setTotal_revenue_unrestricted_and_restricted(int total_revenue_unrestricted_and_restricted) {
        this.total_revenue_unrestricted_and_restricted = total_revenue_unrestricted_and_restricted;
    }

    public String getTotal_revenue_percent_change_over_prior_year() {
        return total_revenue_percent_change_over_prior_year;
    }

    public void setTotal_revenue_percent_change_over_prior_year(String total_revenue_percent_change_over_prior_year) {
        this.total_revenue_percent_change_over_prior_year = total_revenue_percent_change_over_prior_year;
    }

    public double getTotal_revenue_prior() {
        return total_revenue_prior;
    }

    public void setTotal_revenue_prior(double total_revenue_prior) {
        this.total_revenue_prior = total_revenue_prior;
    }

    public String getProgram_svcs_revenue() {
        return program_svcs_revenue;
    }

    public void setProgram_svcs_revenue(String program_svcs_revenue) {
        this.program_svcs_revenue = program_svcs_revenue;
    }

    public String getMembership_dues() {
        return membership_dues;
    }

    public void setMembership_dues(String membership_dues) {
        this.membership_dues = membership_dues;
    }

    public String getInvestment_income() {
        return investment_income;
    }

    public void setInvestment_income(String investment_income) {
        this.investment_income = investment_income;
    }

    public String getGovernment_grants() {
        return government_grants;
    }

    public void setGovernment_grants(String government_grants) {
        this.government_grants = government_grants;
    }

    public String getOther_grants_contributions() {
        return other_grants_contributions;
    }

    public void setOther_grants_contributions(String other_grants_contributions) {
        this.other_grants_contributions = other_grants_contributions;
    }

    public String getOther_revenue() {
        return other_revenue;
    }

    public void setOther_revenue(String other_revenue) {
        this.other_revenue = other_revenue;
    }
}

public static class PremierSdg {
    private int id;
    private String description;

    public PremierSdg() {}

    public PremierSdg(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public static class PremierSicCode {
    private String sic_code;
    private String sic_description;

    public PremierSicCode() {}

    public PremierSicCode(String sic_code, String sic_description) {
        this.sic_code = sic_code;
        this.sic_description = sic_description;
    }

    public String getSic_code() {
        return sic_code;
    }

    public void setSic_code(String sic_code) {
        this.sic_code = sic_code;
    }

    public String getSic_description() {
        return sic_description;
    }

    public void setSic_description(String sic_description) {
        this.sic_description = sic_description;
    }
}

public static class PremierStaffLevel {
    private String staff_level;
    private Object count;

    public PremierStaffLevel() {}

    public PremierStaffLevel(String staff_level, Object count) {
        this.staff_level = staff_level;
        this.count = count;
    }

    public String getStaff_level() {
        return staff_level;
    }

    public void setStaff_level(String staff_level) {
        this.staff_level = staff_level;
    }

    public Object getCount() {
        return count;
    }

    public void setCount(Object count) {
        this.count = count;
    }
}

public static class PremierStaffLevelTotals {
    private String total_board_members;
    private String total_staff;
    private String total_senior_staff;

    public PremierStaffLevelTotals() {}

    public PremierStaffLevelTotals(String total_board_members, String total_staff, String total_senior_staff) {
        this.total_board_members = total_board_members;
        this.total_staff = total_staff;
        this.total_senior_staff = total_senior_staff;
    }

    public String getTotal_board_members() {
        return total_board_members;
    }

    public void setTotal_board_members(String total_board_members) {
        this.total_board_members = total_board_members;
    }

    public String getTotal_staff() {
        return total_staff;
    }

    public void setTotal_staff(String total_staff) {
        this.total_staff = total_staff;
    }

    public String getTotal_senior_staff() {
        return total_senior_staff;
    }

    public void setTotal_senior_staff(String total_senior_staff) {
        this.total_senior_staff = total_senior_staff;
    }
}

public static class PremierSubcategory {
    private String subcategory;
    private List<PremierStaffLevel> staff_levels;
    private int board_members;
    private int staff;
    private int senior_staff;
    private boolean reported_by_ceo;
    private Object reported_by_coceo;

    public PremierSubcategory() {}

    public PremierSubcategory(String subcategory, List<PremierStaffLevel> staff_levels, int board_members, int staff, int senior_staff, boolean reported_by_ceo, Object reported_by_coceo) {
        this.subcategory = subcategory;
        this.staff_levels = staff_levels;
        this.board_members = board_members;
        this.staff = staff;
        this.senior_staff = senior_staff;
        this.reported_by_ceo = reported_by_ceo;
        this.reported_by_coceo = reported_by_coceo;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public List<PremierStaffLevel> getStaff_levels() {
        return staff_levels;
    }

    public void setStaff_levels(List<PremierStaffLevel> staff_levels) {
        this.staff_levels = staff_levels;
    }

    public int getBoard_members() {
        return board_members;
    }

    public void setBoard_members(int board_members) {
        this.board_members = board_members;
    }

    public int getStaff() {
        return staff;
    }

    public void setStaff(int staff) {
        this.staff = staff;
    }

    public int getSenior_staff() {
        return senior_staff;
    }

    public void setSenior_staff(int senior_staff) {
        this.senior_staff = senior_staff;
    }

    public boolean getReported_by_ceo() {
        return reported_by_ceo;
    }

    public void setReported_by_ceo(boolean reported_by_ceo) {
        this.reported_by_ceo = reported_by_ceo;
    }

    public Object getReported_by_coceo() {
        return reported_by_coceo;
    }

    public void setReported_by_coceo(Object reported_by_coceo) {
        this.reported_by_coceo = reported_by_coceo;
    }
}

public static class PremierSummary {
    private int organization_id;
    private String organization_name;
    private String ein;
    private String bridge_id;
    private String address_line_1;
    private String address_line_2;
    private String city;
    private String state;
    private String zip;
    private String county;
    private String latitude;
    private String longitude;
    private String fax;
    private String govt_registered_name;
    private String also_known_as;
    private String fiscal_year_end;
    private String fiscal_year_start;
    private String affiliation_code;
    private String affiliation_description;
    private String contact_name;
    private String contact_title;
    private String contact_email;
    private String contact_phone;
    private String contact_fax;
    private String gs_profile_update_level;
    private String gs_profile_update_level_logo;
    private String deductibility_code;
    private String deductibility_description;
    private String donation_to_ein;
    private String donation_to_name;
    private String areas_served_narrative;
    private String ruling_year;
    private String gs_public_report;
    private String gs_pro_pdf;
    private String gs_financial_trends_analysis_pdf;
    private String impact_statement;
    private String subsection_code;
    private String subsection_description;
    private String keywords;
    private String logo_url;
    private String mission;
    private String demographics_status;
    private String ntee_code;
    private PremierSdg sdg;
    private String website_url;
    private String year_founded;
    private String year_incorporated;
    private String first_on_bmf_date;
    private String last_on_bmf_date;
    private PremierProfileDataChangeDates profile_data_change_dates;
    private List<PremierAddress> addresses;
    private Object affiliations;
    private Object awards;
    private List<PremierFormerlyKnownA> formerly_known_as;
    private Object forms_1023_1024;
    private List<PremierLettersOfDetermination> letters_of_determination;
    private Object letters_of_dissolution;
    private List<PremierNteeCode> ntee_codes;
    private PremierNaicsCode naics_code;
    private List<PremierSicCode> sic_codes;
    private List<PremierPlatinumEvaluationDocument> platinum_evaluation_documents;
    private List<PremierOtherDocument> other_documents;
    private List<PremierPhoto> photos;
    private List<String> social_media_urls;
    private List<PremierTelephoneNumber> telephone_numbers;
    private List<PremierVideo> videos;
    private boolean org_collect_feedback;
    private String org_feedback_example;
    private boolean org_quiz_interest;
    private boolean org_learn_more;
    private List<PremierFeedbackResponse> feedback_responses;
    private List<PremierPcsCode> pcs_codes;
    private List<PremierProfileSdgCode> profile_sdg_codes;
    private boolean is_national_hq;
    private boolean is_non_bmf_org;

    public PremierSummary() {}

    public PremierSummary(int organization_id, String organization_name, String ein, String bridge_id, String address_line_1, String address_line_2, String city, String state, String zip, String county, String latitude, String longitude, String fax, String govt_registered_name, String also_known_as, String fiscal_year_end, String fiscal_year_start, String affiliation_code, String affiliation_description, String contact_name, String contact_title, String contact_email, String contact_phone, String contact_fax, String gs_profile_update_level, String gs_profile_update_level_logo, String deductibility_code, String deductibility_description, String donation_to_ein, String donation_to_name, String areas_served_narrative, String ruling_year, String gs_public_report, String gs_pro_pdf, String gs_financial_trends_analysis_pdf, String impact_statement, String subsection_code, String subsection_description, String keywords, String logo_url, String mission, String demographics_status, String ntee_code, PremierSdg sdg, String website_url, String year_founded, String year_incorporated, String first_on_bmf_date, String last_on_bmf_date, PremierProfileDataChangeDates profile_data_change_dates, List<PremierAddress> addresses, Object affiliations, Object awards, List<PremierFormerlyKnownA> formerly_known_as, Object forms_1023_1024, List<PremierLettersOfDetermination> letters_of_determination, Object letters_of_dissolution, List<PremierNteeCode> ntee_codes, PremierNaicsCode naics_code, List<PremierSicCode> sic_codes, List<PremierPlatinumEvaluationDocument> platinum_evaluation_documents, List<PremierOtherDocument> other_documents, List<PremierPhoto> photos, List<String> social_media_urls, List<PremierTelephoneNumber> telephone_numbers, List<PremierVideo> videos, boolean org_collect_feedback, String org_feedback_example, boolean org_quiz_interest, boolean org_learn_more, List<PremierFeedbackResponse> feedback_responses, List<PremierPcsCode> pcs_codes, List<PremierProfileSdgCode> profile_sdg_codes, boolean is_national_hq, boolean is_non_bmf_org) {
        this.organization_id = organization_id;
        this.organization_name = organization_name;
        this.ein = ein;
        this.bridge_id = bridge_id;
        this.address_line_1 = address_line_1;
        this.address_line_2 = address_line_2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.county = county;
        this.latitude = latitude;
        this.longitude = longitude;
        this.fax = fax;
        this.govt_registered_name = govt_registered_name;
        this.also_known_as = also_known_as;
        this.fiscal_year_end = fiscal_year_end;
        this.fiscal_year_start = fiscal_year_start;
        this.affiliation_code = affiliation_code;
        this.affiliation_description = affiliation_description;
        this.contact_name = contact_name;
        this.contact_title = contact_title;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.contact_fax = contact_fax;
        this.gs_profile_update_level = gs_profile_update_level;
        this.gs_profile_update_level_logo = gs_profile_update_level_logo;
        this.deductibility_code = deductibility_code;
        this.deductibility_description = deductibility_description;
        this.donation_to_ein = donation_to_ein;
        this.donation_to_name = donation_to_name;
        this.areas_served_narrative = areas_served_narrative;
        this.ruling_year = ruling_year;
        this.gs_public_report = gs_public_report;
        this.gs_pro_pdf = gs_pro_pdf;
        this.gs_financial_trends_analysis_pdf = gs_financial_trends_analysis_pdf;
        this.impact_statement = impact_statement;
        this.subsection_code = subsection_code;
        this.subsection_description = subsection_description;
        this.keywords = keywords;
        this.logo_url = logo_url;
        this.mission = mission;
        this.demographics_status = demographics_status;
        this.ntee_code = ntee_code;
        this.sdg = sdg;
        this.website_url = website_url;
        this.year_founded = year_founded;
        this.year_incorporated = year_incorporated;
        this.first_on_bmf_date = first_on_bmf_date;
        this.last_on_bmf_date = last_on_bmf_date;
        this.profile_data_change_dates = profile_data_change_dates;
        this.addresses = addresses;
        this.affiliations = affiliations;
        this.awards = awards;
        this.formerly_known_as = formerly_known_as;
        this.forms_1023_1024 = forms_1023_1024;
        this.letters_of_determination = letters_of_determination;
        this.letters_of_dissolution = letters_of_dissolution;
        this.ntee_codes = ntee_codes;
        this.naics_code = naics_code;
        this.sic_codes = sic_codes;
        this.platinum_evaluation_documents = platinum_evaluation_documents;
        this.other_documents = other_documents;
        this.photos = photos;
        this.social_media_urls = social_media_urls;
        this.telephone_numbers = telephone_numbers;
        this.videos = videos;
        this.org_collect_feedback = org_collect_feedback;
        this.org_feedback_example = org_feedback_example;
        this.org_quiz_interest = org_quiz_interest;
        this.org_learn_more = org_learn_more;
        this.feedback_responses = feedback_responses;
        this.pcs_codes = pcs_codes;
        this.profile_sdg_codes = profile_sdg_codes;
        this.is_national_hq = is_national_hq;
        this.is_non_bmf_org = is_non_bmf_org;
    }

    public int getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(int organization_id) {
        this.organization_id = organization_id;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getBridge_id() {
        return bridge_id;
    }

    public void setBridge_id(String bridge_id) {
        this.bridge_id = bridge_id;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public void setAddress_line_1(String address_line_1) {
        this.address_line_1 = address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public void setAddress_line_2(String address_line_2) {
        this.address_line_2 = address_line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getGovt_registered_name() {
        return govt_registered_name;
    }

    public void setGovt_registered_name(String govt_registered_name) {
        this.govt_registered_name = govt_registered_name;
    }

    public String getAlso_known_as() {
        return also_known_as;
    }

    public void setAlso_known_as(String also_known_as) {
        this.also_known_as = also_known_as;
    }

    public String getFiscal_year_end() {
        return fiscal_year_end;
    }

    public void setFiscal_year_end(String fiscal_year_end) {
        this.fiscal_year_end = fiscal_year_end;
    }

    public String getFiscal_year_start() {
        return fiscal_year_start;
    }

    public void setFiscal_year_start(String fiscal_year_start) {
        this.fiscal_year_start = fiscal_year_start;
    }

    public String getAffiliation_code() {
        return affiliation_code;
    }

    public void setAffiliation_code(String affiliation_code) {
        this.affiliation_code = affiliation_code;
    }

    public String getAffiliation_description() {
        return affiliation_description;
    }

    public void setAffiliation_description(String affiliation_description) {
        this.affiliation_description = affiliation_description;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_title() {
        return contact_title;
    }

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_fax() {
        return contact_fax;
    }

    public void setContact_fax(String contact_fax) {
        this.contact_fax = contact_fax;
    }

    public String getGs_profile_update_level() {
        return gs_profile_update_level;
    }

    public void setGs_profile_update_level(String gs_profile_update_level) {
        this.gs_profile_update_level = gs_profile_update_level;
    }

    public String getGs_profile_update_level_logo() {
        return gs_profile_update_level_logo;
    }

    public void setGs_profile_update_level_logo(String gs_profile_update_level_logo) {
        this.gs_profile_update_level_logo = gs_profile_update_level_logo;
    }

    public String getDeductibility_code() {
        return deductibility_code;
    }

    public void setDeductibility_code(String deductibility_code) {
        this.deductibility_code = deductibility_code;
    }

    public String getDeductibility_description() {
        return deductibility_description;
    }

    public void setDeductibility_description(String deductibility_description) {
        this.deductibility_description = deductibility_description;
    }

    public String getDonation_to_ein() {
        return donation_to_ein;
    }

    public void setDonation_to_ein(String donation_to_ein) {
        this.donation_to_ein = donation_to_ein;
    }

    public String getDonation_to_name() {
        return donation_to_name;
    }

    public void setDonation_to_name(String donation_to_name) {
        this.donation_to_name = donation_to_name;
    }

    public String getAreas_served_narrative() {
        return areas_served_narrative;
    }

    public void setAreas_served_narrative(String areas_served_narrative) {
        this.areas_served_narrative = areas_served_narrative;
    }

    public String getRuling_year() {
        return ruling_year;
    }

    public void setRuling_year(String ruling_year) {
        this.ruling_year = ruling_year;
    }

    public String getGs_public_report() {
        return gs_public_report;
    }

    public void setGs_public_report(String gs_public_report) {
        this.gs_public_report = gs_public_report;
    }

    public String getGs_pro_pdf() {
        return gs_pro_pdf;
    }

    public void setGs_pro_pdf(String gs_pro_pdf) {
        this.gs_pro_pdf = gs_pro_pdf;
    }

    public String getGs_financial_trends_analysis_pdf() {
        return gs_financial_trends_analysis_pdf;
    }

    public void setGs_financial_trends_analysis_pdf(String gs_financial_trends_analysis_pdf) {
        this.gs_financial_trends_analysis_pdf = gs_financial_trends_analysis_pdf;
    }

    public String getImpact_statement() {
        return impact_statement;
    }

    public void setImpact_statement(String impact_statement) {
        this.impact_statement = impact_statement;
    }

    public String getSubsection_code() {
        return subsection_code;
    }

    public void setSubsection_code(String subsection_code) {
        this.subsection_code = subsection_code;
    }

    public String getSubsection_description() {
        return subsection_description;
    }

    public void setSubsection_description(String subsection_description) {
        this.subsection_description = subsection_description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getDemographics_status() {
        return demographics_status;
    }

    public void setDemographics_status(String demographics_status) {
        this.demographics_status = demographics_status;
    }

    public String getNtee_code() {
        return ntee_code;
    }

    public void setNtee_code(String ntee_code) {
        this.ntee_code = ntee_code;
    }

    public PremierSdg getSdg() {
        return sdg;
    }

    public void setSdg(PremierSdg sdg) {
        this.sdg = sdg;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getYear_founded() {
        return year_founded;
    }

    public void setYear_founded(String year_founded) {
        this.year_founded = year_founded;
    }

    public String getYear_incorporated() {
        return year_incorporated;
    }

    public void setYear_incorporated(String year_incorporated) {
        this.year_incorporated = year_incorporated;
    }

    public String getFirst_on_bmf_date() {
        return first_on_bmf_date;
    }

    public void setFirst_on_bmf_date(String first_on_bmf_date) {
        this.first_on_bmf_date = first_on_bmf_date;
    }

    public String getLast_on_bmf_date() {
        return last_on_bmf_date;
    }

    public void setLast_on_bmf_date(String last_on_bmf_date) {
        this.last_on_bmf_date = last_on_bmf_date;
    }

    public PremierProfileDataChangeDates getProfile_data_change_dates() {
        return profile_data_change_dates;
    }

    public void setProfile_data_change_dates(PremierProfileDataChangeDates profile_data_change_dates) {
        this.profile_data_change_dates = profile_data_change_dates;
    }

    public List<PremierAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<PremierAddress> addresses) {
        this.addresses = addresses;
    }

    public Object getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(Object affiliations) {
        this.affiliations = affiliations;
    }

    public Object getAwards() {
        return awards;
    }

    public void setAwards(Object awards) {
        this.awards = awards;
    }

    public List<PremierFormerlyKnownA> getFormerly_known_as() {
        return formerly_known_as;
    }

    public void setFormerly_known_as(List<PremierFormerlyKnownA> formerly_known_as) {
        this.formerly_known_as = formerly_known_as;
    }

    public Object getForms_1023_1024() {
        return forms_1023_1024;
    }

    public void setForms_1023_1024(Object forms_1023_1024) {
        this.forms_1023_1024 = forms_1023_1024;
    }

    public List<PremierLettersOfDetermination> getLetters_of_determination() {
        return letters_of_determination;
    }

    public void setLetters_of_determination(List<PremierLettersOfDetermination> letters_of_determination) {
        this.letters_of_determination = letters_of_determination;
    }

    public Object getLetters_of_dissolution() {
        return letters_of_dissolution;
    }

    public void setLetters_of_dissolution(Object letters_of_dissolution) {
        this.letters_of_dissolution = letters_of_dissolution;
    }

    public List<PremierNteeCode> getNtee_codes() {
        return ntee_codes;
    }

    public void setNtee_codes(List<PremierNteeCode> ntee_codes) {
        this.ntee_codes = ntee_codes;
    }

    public PremierNaicsCode getNaics_code() {
        return naics_code;
    }

    public void setNaics_code(PremierNaicsCode naics_code) {
        this.naics_code = naics_code;
    }

    public List<PremierSicCode> getSic_codes() {
        return sic_codes;
    }

    public void setSic_codes(List<PremierSicCode> sic_codes) {
        this.sic_codes = sic_codes;
    }

    public List<PremierPlatinumEvaluationDocument> getPlatinum_evaluation_documents() {
        return platinum_evaluation_documents;
    }

    public void setPlatinum_evaluation_documents(List<PremierPlatinumEvaluationDocument> platinum_evaluation_documents) {
        this.platinum_evaluation_documents = platinum_evaluation_documents;
    }

    public List<PremierOtherDocument> getOther_documents() {
        return other_documents;
    }

    public void setOther_documents(List<PremierOtherDocument> other_documents) {
        this.other_documents = other_documents;
    }

    public List<PremierPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PremierPhoto> photos) {
        this.photos = photos;
    }

    public List<String> getSocial_media_urls() {
        return social_media_urls;
    }

    public void setSocial_media_urls(List<String> social_media_urls) {
        this.social_media_urls = social_media_urls;
    }

    public List<PremierTelephoneNumber> getTelephone_numbers() {
        return telephone_numbers;
    }

    public void setTelephone_numbers(List<PremierTelephoneNumber> telephone_numbers) {
        this.telephone_numbers = telephone_numbers;
    }

    public List<PremierVideo> getVideos() {
        return videos;
    }

    public void setVideos(List<PremierVideo> videos) {
        this.videos = videos;
    }

    public boolean getOrg_collect_feedback() {
        return org_collect_feedback;
    }

    public void setOrg_collect_feedback(boolean org_collect_feedback) {
        this.org_collect_feedback = org_collect_feedback;
    }

    public String getOrg_feedback_example() {
        return org_feedback_example;
    }

    public void setOrg_feedback_example(String org_feedback_example) {
        this.org_feedback_example = org_feedback_example;
    }

    public boolean getOrg_quiz_interest() {
        return org_quiz_interest;
    }

    public void setOrg_quiz_interest(boolean org_quiz_interest) {
        this.org_quiz_interest = org_quiz_interest;
    }

    public boolean getOrg_learn_more() {
        return org_learn_more;
    }

    public void setOrg_learn_more(boolean org_learn_more) {
        this.org_learn_more = org_learn_more;
    }

    public List<PremierFeedbackResponse> getFeedback_responses() {
        return feedback_responses;
    }

    public void setFeedback_responses(List<PremierFeedbackResponse> feedback_responses) {
        this.feedback_responses = feedback_responses;
    }

    public List<PremierPcsCode> getPcs_codes() {
        return pcs_codes;
    }

    public void setPcs_codes(List<PremierPcsCode> pcs_codes) {
        this.pcs_codes = pcs_codes;
    }

    public List<PremierProfileSdgCode> getProfile_sdg_codes() {
        return profile_sdg_codes;
    }

    public void setProfile_sdg_codes(List<PremierProfileSdgCode> profile_sdg_codes) {
        this.profile_sdg_codes = profile_sdg_codes;
    }

    public boolean getIs_national_hq() {
        return is_national_hq;
    }

    public void setIs_national_hq(boolean is_national_hq) {
        this.is_national_hq = is_national_hq;
    }

    public boolean getIs_non_bmf_org() {
        return is_non_bmf_org;
    }

    public void setIs_non_bmf_org(boolean is_non_bmf_org) {
        this.is_non_bmf_org = is_non_bmf_org;
    }
}

public static class PremierTelephoneNumber {
    private String telephone_number;
    private String telephone_type;

    public PremierTelephoneNumber() {}

    public PremierTelephoneNumber(String telephone_number, String telephone_type) {
        this.telephone_number = telephone_number;
        this.telephone_type = telephone_type;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getTelephone_type() {
        return telephone_type;
    }

    public void setTelephone_type(String telephone_type) {
        this.telephone_type = telephone_type;
    }
}

public static class PremierVideo {
    private String video_caption;
    private String video_url;

    public PremierVideo() {}

    public PremierVideo(String video_caption, String video_url) {
        this.video_caption = video_caption;
        this.video_url = video_url;
    }

    public String getVideo_caption() {
        return video_caption;
    }

    public void setVideo_caption(String video_caption) {
        this.video_caption = video_caption;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }
}

public static class PremierYear {
    private int year;
    private double value;

    public PremierYear() {}

    public PremierYear(int year, double value) {
        this.year = year;
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

public static class Exception {
    private Throwable cause;
    private List<StackTraceElement> stackTrace;
    private String message;
    private List<Throwable> suppressed;
    private String localizedMessage;

    public Exception() {}

    public Exception(Throwable cause, List<StackTraceElement> stackTrace, String message, List<Throwable> suppressed, String localizedMessage) {
        this.cause = cause;
        this.stackTrace = stackTrace;
        this.message = message;
        this.suppressed = suppressed;
        this.localizedMessage = localizedMessage;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public List<StackTraceElement> getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(List<StackTraceElement> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Throwable> getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(List<Throwable> suppressed) {
        this.suppressed = suppressed;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }
}

public static class Function0 {

    public Function0() {}
}

public static class Function0Object {

    public Function0Object() {}
}

public static class LongRunningTask {
    private String id;
    private String foundationId;
    private Function0Object task;
    public enum TaskStatus {
        PENDING,
        RUNNING,
        COMPLETED,
        FAILED,
    }
    private TaskStatus taskStatus;
    private Object result;
    private Exception error;

    public LongRunningTask() {}

    public LongRunningTask(String id, String foundationId, Function0Object task, TaskStatus taskStatus, Object result, Exception error) {
        this.id = id;
        this.foundationId = foundationId;
        this.task = task;
        this.taskStatus = taskStatus;
        this.result = result;
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public Function0Object getTask() {
        return task;
    }

    public void setTask(Function0Object task) {
        this.task = task;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }
}

public static class LongRunningTaskObject {
    private String id;
    private String foundationId;
    private Function0Object task;
    public enum TaskStatus {
        PENDING,
        RUNNING,
        COMPLETED,
        FAILED,
    }
    private TaskStatus taskStatus;
    private Object result;
    private Exception error;

    public LongRunningTaskObject() {}

    public LongRunningTaskObject(String id, String foundationId, Function0Object task, TaskStatus taskStatus, Object result, Exception error) {
        this.id = id;
        this.foundationId = foundationId;
        this.task = task;
        this.taskStatus = taskStatus;
        this.result = result;
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public Function0Object getTask() {
        return task;
    }

    public void setTask(Function0Object task) {
        this.task = task;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }
}

public static class StackTraceElement {
    private String classLoaderName;
    private String moduleName;
    private String moduleVersion;
    private String methodName;
    private String fileName;
    private int lineNumber;
    private boolean nativeMethod;
    private String className;

    public StackTraceElement() {}

    public StackTraceElement(String classLoaderName, String moduleName, String moduleVersion, String methodName, String fileName, int lineNumber, boolean nativeMethod, String className) {
        this.classLoaderName = classLoaderName;
        this.moduleName = moduleName;
        this.moduleVersion = moduleVersion;
        this.methodName = methodName;
        this.fileName = fileName;
        this.lineNumber = lineNumber;
        this.nativeMethod = nativeMethod;
        this.className = className;
    }

    public String getClassLoaderName() {
        return classLoaderName;
    }

    public void setClassLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean getNativeMethod() {
        return nativeMethod;
    }

    public void setNativeMethod(boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

public static class Throwable {
    private Throwable cause;
    private List<StackTraceElement> stackTrace;
    private String message;
    private List<Throwable> suppressed;
    private String localizedMessage;

    public Throwable() {}

    public Throwable(Throwable cause, List<StackTraceElement> stackTrace, String message, List<Throwable> suppressed, String localizedMessage) {
        this.cause = cause;
        this.stackTrace = stackTrace;
        this.message = message;
        this.suppressed = suppressed;
        this.localizedMessage = localizedMessage;
    }

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public List<StackTraceElement> getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(List<StackTraceElement> stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Throwable> getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(List<Throwable> suppressed) {
        this.suppressed = suppressed;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }
}

public static class IndexRequest {
    private List<String> foundationIds;
    private boolean restartIndex;

    public IndexRequest() {}

    public IndexRequest(List<String> foundationIds, boolean restartIndex) {
        this.foundationIds = foundationIds;
        this.restartIndex = restartIndex;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public boolean getRestartIndex() {
        return restartIndex;
    }

    public void setRestartIndex(boolean restartIndex) {
        this.restartIndex = restartIndex;
    }
}

public static class AggregateDashboardResponse {
    private List<Task> yourTasks;
    private List<Task> granteeTasks;
    private List<AggregateFoundationProposalSummary> foundationProposalSummary;
    private List<GrantPayment> payments;

    public AggregateDashboardResponse() {}

    public AggregateDashboardResponse(List<Task> yourTasks, List<Task> granteeTasks, List<AggregateFoundationProposalSummary> foundationProposalSummary, List<GrantPayment> payments) {
        this.yourTasks = yourTasks;
        this.granteeTasks = granteeTasks;
        this.foundationProposalSummary = foundationProposalSummary;
        this.payments = payments;
    }

    public List<Task> getYourTasks() {
        return yourTasks;
    }

    public void setYourTasks(List<Task> yourTasks) {
        this.yourTasks = yourTasks;
    }

    public List<Task> getGranteeTasks() {
        return granteeTasks;
    }

    public void setGranteeTasks(List<Task> granteeTasks) {
        this.granteeTasks = granteeTasks;
    }

    public List<AggregateFoundationProposalSummary> getFoundationProposalSummary() {
        return foundationProposalSummary;
    }

    public void setFoundationProposalSummary(List<AggregateFoundationProposalSummary> foundationProposalSummary) {
        this.foundationProposalSummary = foundationProposalSummary;
    }

    public List<GrantPayment> getPayments() {
        return payments;
    }

    public void setPayments(List<GrantPayment> payments) {
        this.payments = payments;
    }
}

public static class AggregateFoundationProposalSummary {
    private Foundation foundation;
    private List<PipelineProposalSummary> pipelineProposalSummaries;

    public AggregateFoundationProposalSummary() {}

    public AggregateFoundationProposalSummary(Foundation foundation, List<PipelineProposalSummary> pipelineProposalSummaries) {
        this.foundation = foundation;
        this.pipelineProposalSummaries = pipelineProposalSummaries;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<PipelineProposalSummary> getPipelineProposalSummaries() {
        return pipelineProposalSummaries;
    }

    public void setPipelineProposalSummaries(List<PipelineProposalSummary> pipelineProposalSummaries) {
        this.pipelineProposalSummaries = pipelineProposalSummaries;
    }
}

public static class AggregateGrantAnalysis {
    private double totalAmountRequested;
    private double totalAmountAwarded;

    public AggregateGrantAnalysis() {}

    public AggregateGrantAnalysis(double totalAmountRequested, double totalAmountAwarded) {
        this.totalAmountRequested = totalAmountRequested;
        this.totalAmountAwarded = totalAmountAwarded;
    }

    public double getTotalAmountRequested() {
        return totalAmountRequested;
    }

    public void setTotalAmountRequested(double totalAmountRequested) {
        this.totalAmountRequested = totalAmountRequested;
    }

    public double getTotalAmountAwarded() {
        return totalAmountAwarded;
    }

    public void setTotalAmountAwarded(double totalAmountAwarded) {
        this.totalAmountAwarded = totalAmountAwarded;
    }
}

public static class AnvilPDFFieldResponse {
    private AnvilPDFField anvilPDFField;
    private String response;

    public AnvilPDFFieldResponse() {}

    public AnvilPDFFieldResponse(AnvilPDFField anvilPDFField, String response) {
        this.anvilPDFField = anvilPDFField;
        this.response = response;
    }

    public AnvilPDFField getAnvilPDFField() {
        return anvilPDFField;
    }

    public void setAnvilPDFField(AnvilPDFField anvilPDFField) {
        this.anvilPDFField = anvilPDFField;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

public static class AnvilPDFFieldResponses {
    private List<AnvilPDFFieldResponse> anvilPDfFieldResponses;

    public AnvilPDFFieldResponses() {}

    public AnvilPDFFieldResponses(List<AnvilPDFFieldResponse> anvilPDfFieldResponses) {
        this.anvilPDfFieldResponses = anvilPDfFieldResponses;
    }

    public List<AnvilPDFFieldResponse> getAnvilPDfFieldResponses() {
        return anvilPDfFieldResponses;
    }

    public void setAnvilPDfFieldResponses(List<AnvilPDFFieldResponse> anvilPDfFieldResponses) {
        this.anvilPDfFieldResponses = anvilPDfFieldResponses;
    }
}

public static class AnvilPaymentDetails {
    private String bankName;
    private String accountNumber;
    private String routingNumber;
    private String wireRoutingNumber;
    private String entityName;
    private String submittedDate;
    private String submittedUser;

    public AnvilPaymentDetails() {}

    public AnvilPaymentDetails(String bankName, String accountNumber, String routingNumber, String wireRoutingNumber, String entityName, String submittedDate, String submittedUser) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.wireRoutingNumber = wireRoutingNumber;
        this.entityName = entityName;
        this.submittedDate = submittedDate;
        this.submittedUser = submittedUser;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getWireRoutingNumber() {
        return wireRoutingNumber;
    }

    public void setWireRoutingNumber(String wireRoutingNumber) {
        this.wireRoutingNumber = wireRoutingNumber;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getSubmittedUser() {
        return submittedUser;
    }

    public void setSubmittedUser(String submittedUser) {
        this.submittedUser = submittedUser;
    }
}

public static class Currency {
    private String currencyCode;
    private int defaultFractionDigits;
    private int numericCode;
    private String displayName;
    private String symbol;
    private String numericCodeAsString;

    public Currency() {}

    public Currency(String currencyCode, int defaultFractionDigits, int numericCode, String displayName, String symbol, String numericCodeAsString) {
        this.currencyCode = currencyCode;
        this.defaultFractionDigits = defaultFractionDigits;
        this.numericCode = numericCode;
        this.displayName = displayName;
        this.symbol = symbol;
        this.numericCodeAsString = numericCodeAsString;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getDefaultFractionDigits() {
        return defaultFractionDigits;
    }

    public void setDefaultFractionDigits(int defaultFractionDigits) {
        this.defaultFractionDigits = defaultFractionDigits;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNumericCodeAsString() {
        return numericCodeAsString;
    }

    public void setNumericCodeAsString(String numericCodeAsString) {
        this.numericCodeAsString = numericCodeAsString;
    }
}

public static class DonorActivity {
    private String id;
    private String foundationId;
    private String donorEntityId;
    private String details;
    private DonorActivityAdditionalInfo additionalInfo;
    private String type;
    private String createdAt;
    private List<String> participants;
    private String created;
    private String updated;

    public DonorActivity() {}

    public DonorActivity(String id, String foundationId, String donorEntityId, String details, DonorActivityAdditionalInfo additionalInfo, String type, String createdAt, List<String> participants, String created, String updated) {
        this.id = id;
        this.foundationId = foundationId;
        this.donorEntityId = donorEntityId;
        this.details = details;
        this.additionalInfo = additionalInfo;
        this.type = type;
        this.createdAt = createdAt;
        this.participants = participants;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getDonorEntityId() {
        return donorEntityId;
    }

    public void setDonorEntityId(String donorEntityId) {
        this.donorEntityId = donorEntityId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public DonorActivityAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(DonorActivityAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class DonorActivityAdditionalInfo {
    private TipTapTextBlock note;

    public DonorActivityAdditionalInfo() {}

    public DonorActivityAdditionalInfo(TipTapTextBlock note) {
        this.note = note;
    }

    public TipTapTextBlock getNote() {
        return note;
    }

    public void setNote(TipTapTextBlock note) {
        this.note = note;
    }
}

public static class DonorContribution {
    private String id;
    private String foundationId;
    private String contributedBy;
    private double amount;
    private String contributedAt;
    private String endDate;
    private List<String> submissionIds;
    private List<String> tags;
    private String created;
    private String updated;
    private List<DonorContributionComment> comments;
    private List<DonorTag> tagList;

    public DonorContribution() {}

    public DonorContribution(String id, String foundationId, String contributedBy, double amount, String contributedAt, String endDate, List<String> submissionIds, List<String> tags, String created, String updated, List<DonorContributionComment> comments, List<DonorTag> tagList) {
        this.id = id;
        this.foundationId = foundationId;
        this.contributedBy = contributedBy;
        this.amount = amount;
        this.contributedAt = contributedAt;
        this.endDate = endDate;
        this.submissionIds = submissionIds;
        this.tags = tags;
        this.created = created;
        this.updated = updated;
        this.comments = comments;
        this.tagList = tagList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getContributedBy() {
        return contributedBy;
    }

    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getContributedAt() {
        return contributedAt;
    }

    public void setContributedAt(String contributedAt) {
        this.contributedAt = contributedAt;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<String> getSubmissionIds() {
        return submissionIds;
    }

    public void setSubmissionIds(List<String> submissionIds) {
        this.submissionIds = submissionIds;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public List<DonorContributionComment> getComments() {
        return comments;
    }

    public void setComments(List<DonorContributionComment> comments) {
        this.comments = comments;
    }

    public List<DonorTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<DonorTag> tagList) {
        this.tagList = tagList;
    }
}

public static class DonorContributionComment {
    private String id;
    private String donorContributionId;
    private String foundationId;
    private String comment;
    private String createById;
    private String createdAt;
    private String updatedById;
    private String updatedAt;
    private UserDetails createdByUser;
    private UserDetails updatedByUser;
    private String updated;

    public DonorContributionComment() {}

    public DonorContributionComment(String id, String donorContributionId, String foundationId, String comment, String createById, String createdAt, String updatedById, String updatedAt, UserDetails createdByUser, UserDetails updatedByUser, String updated) {
        this.id = id;
        this.donorContributionId = donorContributionId;
        this.foundationId = foundationId;
        this.comment = comment;
        this.createById = createById;
        this.createdAt = createdAt;
        this.updatedById = updatedById;
        this.updatedAt = updatedAt;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDonorContributionId() {
        return donorContributionId;
    }

    public void setDonorContributionId(String donorContributionId) {
        this.donorContributionId = donorContributionId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateById() {
        return createById;
    }

    public void setCreateById(String createById) {
        this.createById = createById;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserDetails getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(UserDetails createdByUser) {
        this.createdByUser = createdByUser;
    }

    public UserDetails getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(UserDetails updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class DonorData {
    private String label;
    private String value;

    public DonorData() {}

    public DonorData(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public static class DonorEntity {
    private String id;
    private String foundationId;
    private String type;
    private String name;
    private List<DonorData> data;
    private List<String> tagIds;
    private String nonprofitId;
    private String created;
    private String updated;
    private double totalContribution;
    private List<DonorTag> tags;
    private List<DonorRelationship> relationships;
    private List<DonorContribution> contributions;
    private List<DonorActivity> activities;

    public DonorEntity() {}

    public DonorEntity(String id, String foundationId, String type, String name, List<DonorData> data, List<String> tagIds, String nonprofitId, String created, String updated, double totalContribution, List<DonorTag> tags, List<DonorRelationship> relationships, List<DonorContribution> contributions, List<DonorActivity> activities) {
        this.id = id;
        this.foundationId = foundationId;
        this.type = type;
        this.name = name;
        this.data = data;
        this.tagIds = tagIds;
        this.nonprofitId = nonprofitId;
        this.created = created;
        this.updated = updated;
        this.totalContribution = totalContribution;
        this.tags = tags;
        this.relationships = relationships;
        this.contributions = contributions;
        this.activities = activities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DonorData> getData() {
        return data;
    }

    public void setData(List<DonorData> data) {
        this.data = data;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public double getTotalContribution() {
        return totalContribution;
    }

    public void setTotalContribution(double totalContribution) {
        this.totalContribution = totalContribution;
    }

    public List<DonorTag> getTags() {
        return tags;
    }

    public void setTags(List<DonorTag> tags) {
        this.tags = tags;
    }

    public List<DonorRelationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<DonorRelationship> relationships) {
        this.relationships = relationships;
    }

    public List<DonorContribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<DonorContribution> contributions) {
        this.contributions = contributions;
    }

    public List<DonorActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<DonorActivity> activities) {
        this.activities = activities;
    }
}

public static class DonorRelationship {
    private String id;
    private String foundationId;
    private String fromEntityId;
    private String type;
    private String name;
    private List<DonorData> data;
    private String toEntityId;
    private String created;
    private String updated;
    private DonorEntity fromEntity;
    private DonorEntity toEntity;

    public DonorRelationship() {}

    public DonorRelationship(String id, String foundationId, String fromEntityId, String type, String name, List<DonorData> data, String toEntityId, String created, String updated, DonorEntity fromEntity, DonorEntity toEntity) {
        this.id = id;
        this.foundationId = foundationId;
        this.fromEntityId = fromEntityId;
        this.type = type;
        this.name = name;
        this.data = data;
        this.toEntityId = toEntityId;
        this.created = created;
        this.updated = updated;
        this.fromEntity = fromEntity;
        this.toEntity = toEntity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getFromEntityId() {
        return fromEntityId;
    }

    public void setFromEntityId(String fromEntityId) {
        this.fromEntityId = fromEntityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DonorData> getData() {
        return data;
    }

    public void setData(List<DonorData> data) {
        this.data = data;
    }

    public String getToEntityId() {
        return toEntityId;
    }

    public void setToEntityId(String toEntityId) {
        this.toEntityId = toEntityId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public DonorEntity getFromEntity() {
        return fromEntity;
    }

    public void setFromEntity(DonorEntity fromEntity) {
        this.fromEntity = fromEntity;
    }

    public DonorEntity getToEntity() {
        return toEntity;
    }

    public void setToEntity(DonorEntity toEntity) {
        this.toEntity = toEntity;
    }
}

public static class DonorTag {
    private String id;
    private String displayName;
    private String foundationId;
    private String color;
    private String created;
    private String updated;

    public DonorTag() {}

    public DonorTag(String id, String displayName, String foundationId, String color, String created, String updated) {
        this.id = id;
        this.displayName = displayName;
        this.foundationId = foundationId;
        this.color = color;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class EntityDetails {
    private String name;

    public EntityDetails() {}

    public EntityDetails(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public static class FirstFormDetails {
    private String formTitle;
    private boolean internal;

    public FirstFormDetails() {}

    public FirstFormDetails(String formTitle, boolean internal) {
        this.formTitle = formTitle;
        this.internal = internal;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public boolean getInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }
}

public static class FormBuilder {
    private List<FormItem> elements;
    private String title;
    private String submitButtonText;

    public FormBuilder() {}

    public FormBuilder(List<FormItem> elements, String title, String submitButtonText) {
        this.elements = elements;
        this.title = title;
        this.submitButtonText = submitButtonText;
    }

    public List<FormItem> getElements() {
        return elements;
    }

    public void setElements(List<FormItem> elements) {
        this.elements = elements;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubmitButtonText() {
        return submitButtonText;
    }

    public void setSubmitButtonText(String submitButtonText) {
        this.submitButtonText = submitButtonText;
    }
}

public static class FoundationProposalSummary {
    private List<ProposalStageResult> results;

    public FoundationProposalSummary() {}

    public FoundationProposalSummary(List<ProposalStageResult> results) {
        this.results = results;
    }

    public List<ProposalStageResult> getResults() {
        return results;
    }

    public void setResults(List<ProposalStageResult> results) {
        this.results = results;
    }
}

public static class GrantAdditionalInfo {
    private List<GrantAdditionalInfoEntity> entities;
    private GrantRefereeInfo grantRefereeInfo;
    private boolean commentsDisabled;
    private String customGrantTypeId;

    public GrantAdditionalInfo() {}

    public GrantAdditionalInfo(List<GrantAdditionalInfoEntity> entities, GrantRefereeInfo grantRefereeInfo, boolean commentsDisabled, String customGrantTypeId) {
        this.entities = entities;
        this.grantRefereeInfo = grantRefereeInfo;
        this.commentsDisabled = commentsDisabled;
        this.customGrantTypeId = customGrantTypeId;
    }

    public List<GrantAdditionalInfoEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<GrantAdditionalInfoEntity> entities) {
        this.entities = entities;
    }

    public GrantRefereeInfo getGrantRefereeInfo() {
        return grantRefereeInfo;
    }

    public void setGrantRefereeInfo(GrantRefereeInfo grantRefereeInfo) {
        this.grantRefereeInfo = grantRefereeInfo;
    }

    public boolean getCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public String getCustomGrantTypeId() {
        return customGrantTypeId;
    }

    public void setCustomGrantTypeId(String customGrantTypeId) {
        this.customGrantTypeId = customGrantTypeId;
    }
}

public static class GrantAdditionalInfoEntity {
    public enum Type {
        TEXT,
        FILE,
    }
    private Type type;
    private String response;
    private String fileId;

    public GrantAdditionalInfoEntity() {}

    public GrantAdditionalInfoEntity(Type type, String response, String fileId) {
        this.type = type;
        this.response = response;
        this.fileId = fileId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}

public static class GrantAmount {
    private double minAmount;
    private double maxAmount;

    public GrantAmount() {}

    public GrantAmount(double minAmount, double maxAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }
}

public static class GrantDuration {
    private String start;
    private String end;

    public GrantDuration() {}

    public GrantDuration(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}

public static class GrantEligibility {
    private String templateId;
    private List<FormItem> components;

    public GrantEligibility() {}

    public GrantEligibility(String templateId, List<FormItem> components) {
        this.templateId = templateId;
        this.components = components;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }
}

public static class GrantFormAdditionalInfo {
    private GrantRefereeConfig grantRefereeConfig;
    private boolean commentsDisabled;
    private boolean previewDisabled;
    private List<String> eligibleNonprofitTypes;
    private String customGrantTypeId;
    private TipTapTextBlock welcomeText;
    private String openAt;

    public GrantFormAdditionalInfo() {}

    public GrantFormAdditionalInfo(GrantRefereeConfig grantRefereeConfig, boolean commentsDisabled, boolean previewDisabled, List<String> eligibleNonprofitTypes, String customGrantTypeId, TipTapTextBlock welcomeText, String openAt) {
        this.grantRefereeConfig = grantRefereeConfig;
        this.commentsDisabled = commentsDisabled;
        this.previewDisabled = previewDisabled;
        this.eligibleNonprofitTypes = eligibleNonprofitTypes;
        this.customGrantTypeId = customGrantTypeId;
        this.welcomeText = welcomeText;
        this.openAt = openAt;
    }

    public GrantRefereeConfig getGrantRefereeConfig() {
        return grantRefereeConfig;
    }

    public void setGrantRefereeConfig(GrantRefereeConfig grantRefereeConfig) {
        this.grantRefereeConfig = grantRefereeConfig;
    }

    public boolean getCommentsDisabled() {
        return commentsDisabled;
    }

    public void setCommentsDisabled(boolean commentsDisabled) {
        this.commentsDisabled = commentsDisabled;
    }

    public boolean getPreviewDisabled() {
        return previewDisabled;
    }

    public void setPreviewDisabled(boolean previewDisabled) {
        this.previewDisabled = previewDisabled;
    }

    public List<String> getEligibleNonprofitTypes() {
        return eligibleNonprofitTypes;
    }

    public void setEligibleNonprofitTypes(List<String> eligibleNonprofitTypes) {
        this.eligibleNonprofitTypes = eligibleNonprofitTypes;
    }

    public String getCustomGrantTypeId() {
        return customGrantTypeId;
    }

    public void setCustomGrantTypeId(String customGrantTypeId) {
        this.customGrantTypeId = customGrantTypeId;
    }

    public TipTapTextBlock getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(TipTapTextBlock welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getOpenAt() {
        return openAt;
    }

    public void setOpenAt(String openAt) {
        this.openAt = openAt;
    }
}

public static class GrantFormProposal {
    private String id;
    private String name;
    private String description;
    private String foundationId;
    public enum Status {
        DRAFT,
        PUBLISHED,
        INACTIVE,
    }
    private Status status;
    private GrantAmount grantAmount;
    public enum GrantType {
        OPERATING_GRANT,
        PROJECT_GRANT,
        CAPITAL_GRANT,
        FELLOWSHIP,
        IN_KIND_GIVING,
    }
    private GrantType grantType;
    private List<String> tags;
    private String deadline;
    private GrantDuration duration;
    private String foundationOwner;
    private String pipelineId;
    private GrantEligibility eligibility;
    private ScoringCriteria scoringCriteria;
    private GrantFormAdditionalInfo additionalInfo;
    public enum Visibility {
        PUBLIC,
        PRIVATE,
    }
    private Visibility visibility;
    private FormBuilder form;
    private String createdBy;
    private String updatedBy;
    private String created;
    private String updated;
    private Foundation foundation;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;
    private List<FoundationMetadataTag> coloredTags;
    private CustomGrantType customGrantType;
    private boolean eligibilityEnabled;

    public GrantFormProposal() {}

    public GrantFormProposal(String id, String name, String description, String foundationId, Status status, GrantAmount grantAmount, GrantType grantType, List<String> tags, String deadline, GrantDuration duration, String foundationOwner, String pipelineId, GrantEligibility eligibility, ScoringCriteria scoringCriteria, GrantFormAdditionalInfo additionalInfo, Visibility visibility, FormBuilder form, String createdBy, String updatedBy, String created, String updated, Foundation foundation, FoundationUser createdByUser, FoundationUser updatedByUser, List<FoundationMetadataTag> coloredTags, CustomGrantType customGrantType, boolean eligibilityEnabled) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.foundationId = foundationId;
        this.status = status;
        this.grantAmount = grantAmount;
        this.grantType = grantType;
        this.tags = tags;
        this.deadline = deadline;
        this.duration = duration;
        this.foundationOwner = foundationOwner;
        this.pipelineId = pipelineId;
        this.eligibility = eligibility;
        this.scoringCriteria = scoringCriteria;
        this.additionalInfo = additionalInfo;
        this.visibility = visibility;
        this.form = form;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.created = created;
        this.updated = updated;
        this.foundation = foundation;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.coloredTags = coloredTags;
        this.customGrantType = customGrantType;
        this.eligibilityEnabled = eligibilityEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GrantAmount getGrantAmount() {
        return grantAmount;
    }

    public void setGrantAmount(GrantAmount grantAmount) {
        this.grantAmount = grantAmount;
    }

    public GrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantType grantType) {
        this.grantType = grantType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public GrantDuration getDuration() {
        return duration;
    }

    public void setDuration(GrantDuration duration) {
        this.duration = duration;
    }

    public String getFoundationOwner() {
        return foundationOwner;
    }

    public void setFoundationOwner(String foundationOwner) {
        this.foundationOwner = foundationOwner;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public GrantEligibility getEligibility() {
        return eligibility;
    }

    public void setEligibility(GrantEligibility eligibility) {
        this.eligibility = eligibility;
    }

    public ScoringCriteria getScoringCriteria() {
        return scoringCriteria;
    }

    public void setScoringCriteria(ScoringCriteria scoringCriteria) {
        this.scoringCriteria = scoringCriteria;
    }

    public GrantFormAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(GrantFormAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public FormBuilder getForm() {
        return form;
    }

    public void setForm(FormBuilder form) {
        this.form = form;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public List<FoundationMetadataTag> getColoredTags() {
        return coloredTags;
    }

    public void setColoredTags(List<FoundationMetadataTag> coloredTags) {
        this.coloredTags = coloredTags;
    }

    public CustomGrantType getCustomGrantType() {
        return customGrantType;
    }

    public void setCustomGrantType(CustomGrantType customGrantType) {
        this.customGrantType = customGrantType;
    }

    public boolean getEligibilityEnabled() {
        return eligibilityEnabled;
    }

    public void setEligibilityEnabled(boolean eligibilityEnabled) {
        this.eligibilityEnabled = eligibilityEnabled;
    }
}

public static class GrantPayment {
    private String id;
    private String nonprofitId;
    private String foundationId;
    private String assigneeId;
    private double amount;
    public enum Type {
        ACH,
        CHECK,
        WIRE,
        STOCK,
        CREDIT_CARD,
    }
    private Type type;
    private String dueDate;
    private String contingencies;
    private List<String> comments;
    public enum Status {
        NOT_STARTED,
        CONTINGENT,
        SENT,
        ISSUED,
        CLEARED,
    }
    private Status status;
    public enum SourceType {
        GRANT,
        CRM,
    }
    private SourceType sourceType;
    private String sourceId;
    private PaymentAdditionalInfo additionalInfo;
    private boolean active;
    private String createdBy;
    private String updatedBy;
    private String created;
    private String updated;
    private GrantProposalSubmission submission;
    private Nonprofit nonprofit;
    private FoundationUser assignee;

    public GrantPayment() {}

    public GrantPayment(String id, String nonprofitId, String foundationId, String assigneeId, double amount, Type type, String dueDate, String contingencies, List<String> comments, Status status, SourceType sourceType, String sourceId, PaymentAdditionalInfo additionalInfo, boolean active, String createdBy, String updatedBy, String created, String updated, GrantProposalSubmission submission, Nonprofit nonprofit, FoundationUser assignee) {
        this.id = id;
        this.nonprofitId = nonprofitId;
        this.foundationId = foundationId;
        this.assigneeId = assigneeId;
        this.amount = amount;
        this.type = type;
        this.dueDate = dueDate;
        this.contingencies = contingencies;
        this.comments = comments;
        this.status = status;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.additionalInfo = additionalInfo;
        this.active = active;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.created = created;
        this.updated = updated;
        this.submission = submission;
        this.nonprofit = nonprofit;
        this.assignee = assignee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getContingencies() {
        return contingencies;
    }

    public void setContingencies(String contingencies) {
        this.contingencies = contingencies;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public PaymentAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(PaymentAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public FoundationUser getAssignee() {
        return assignee;
    }

    public void setAssignee(FoundationUser assignee) {
        this.assignee = assignee;
    }
}

public static class GrantPaymentSummary {
    private List<GrantPayment> completedGrantPayments;
    private List<GrantPayment> incompleteGrantPayments;
    private double amountPaid;
    private double upcomingAmount;
    private double unallocatedAmount;
    private boolean finishedAllPayments;

    public GrantPaymentSummary() {}

    public GrantPaymentSummary(List<GrantPayment> completedGrantPayments, List<GrantPayment> incompleteGrantPayments, double amountPaid, double upcomingAmount, double unallocatedAmount, boolean finishedAllPayments) {
        this.completedGrantPayments = completedGrantPayments;
        this.incompleteGrantPayments = incompleteGrantPayments;
        this.amountPaid = amountPaid;
        this.upcomingAmount = upcomingAmount;
        this.unallocatedAmount = unallocatedAmount;
        this.finishedAllPayments = finishedAllPayments;
    }

    public List<GrantPayment> getCompletedGrantPayments() {
        return completedGrantPayments;
    }

    public void setCompletedGrantPayments(List<GrantPayment> completedGrantPayments) {
        this.completedGrantPayments = completedGrantPayments;
    }

    public List<GrantPayment> getIncompleteGrantPayments() {
        return incompleteGrantPayments;
    }

    public void setIncompleteGrantPayments(List<GrantPayment> incompleteGrantPayments) {
        this.incompleteGrantPayments = incompleteGrantPayments;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getUpcomingAmount() {
        return upcomingAmount;
    }

    public void setUpcomingAmount(double upcomingAmount) {
        this.upcomingAmount = upcomingAmount;
    }

    public double getUnallocatedAmount() {
        return unallocatedAmount;
    }

    public void setUnallocatedAmount(double unallocatedAmount) {
        this.unallocatedAmount = unallocatedAmount;
    }

    public boolean getFinishedAllPayments() {
        return finishedAllPayments;
    }

    public void setFinishedAllPayments(boolean finishedAllPayments) {
        this.finishedAllPayments = finishedAllPayments;
    }
}

public static class GrantProposalSubmission {
    private String id;
    private String name;
    private String foundationId;
    private String nonprofitId;
    private String grantFormProposal;
    private GrantAmount grantAmount;
    private double awardedAmount;
    private String awardedDate;
    public enum GrantType {
        OPERATING_GRANT,
        PROJECT_GRANT,
        CAPITAL_GRANT,
        FELLOWSHIP,
        IN_KIND_GIVING,
    }
    private GrantType grantType;
    private List<String> tags;
    private String deadline;
    private GrantDuration duration;
    private String foundationOwner;
    private GrantAdditionalInfo additionalInfo;
    private String stage;
    private String pipelineId;
    private List<String> watchers;
    private String createdBy;
    private String updatedBy;
    private String created;
    private String updated;
    private FirstFormDetails firstFormDetails;
    private String purpose;
    private boolean submittable;
    private List<String> assigneesToTask;
    private List<String> externalAssigneesToTask;
    private List<TaskTemplateAssignee> assigneeToTaskTemplates;
    private List<TaskTemplateResponse> taskTemplateResponses;
    private String taskDeadline;
    private String organizationName;
    public enum EntityType {
        ORGANIZATION,
        INDIVIDUAL,
    }
    private EntityType entityType;
    private String recipientEmail;
    private boolean sendProposalCreatedEmail;
    private CustomEmailTemplate customEmailTemplate;
    private boolean disableStageChange;
    private List<FormItemResponseEntity> responses;
    private String submissionIndividual;
    private String submitted;
    private MultipleFormInfo multiForm;
    private List<String> taskIds;
    private List<String> taskAssignees;
    private boolean readyForNextStage;
    private Nonprofit nonprofit;
    private GrantFormProposal formProposal;
    private FoundationUser foundationOwnerUser;
    private List<FoundationUser> foundationTaskAssignees;
    private List<NonprofitUser> nonprofitTaskAssignees;
    private List<FoundationUser> foundationWatchers;
    private List<FoundationMetadataTag> coloredTags;
    private FoundationUser updatedByFoundationUser;
    private NonprofitUser updatedByNonprofitUser;
    private Foundation foundation;
    public enum NonprofitStage {
        VETTING,
        DRAFT,
        SUBMITTED,
        REVIEW,
        PENDING,
        APPROVED,
        CONTRACT,
        PAYMENT,
        REPORTING,
        AWARDED,
        DENIED,
    }
    private NonprofitStage nonprofitStage;
    private Pipeline pipelineInfo;
    private CustomGrantType customGrantType;
    private GrantPaymentSummary paymentSummary;

    public GrantProposalSubmission() {}

    public GrantProposalSubmission(String id, String name, String foundationId, String nonprofitId, String grantFormProposal, GrantAmount grantAmount, double awardedAmount, String awardedDate, GrantType grantType, List<String> tags, String deadline, GrantDuration duration, String foundationOwner, GrantAdditionalInfo additionalInfo, String stage, String pipelineId, List<String> watchers, String createdBy, String updatedBy, String created, String updated, FirstFormDetails firstFormDetails, String purpose, boolean submittable, List<String> assigneesToTask, List<String> externalAssigneesToTask, List<TaskTemplateAssignee> assigneeToTaskTemplates, List<TaskTemplateResponse> taskTemplateResponses, String taskDeadline, String organizationName, EntityType entityType, String recipientEmail, boolean sendProposalCreatedEmail, CustomEmailTemplate customEmailTemplate, boolean disableStageChange, List<FormItemResponseEntity> responses, String submissionIndividual, String submitted, MultipleFormInfo multiForm, List<String> taskIds, List<String> taskAssignees, boolean readyForNextStage, Nonprofit nonprofit, GrantFormProposal formProposal, FoundationUser foundationOwnerUser, List<FoundationUser> foundationTaskAssignees, List<NonprofitUser> nonprofitTaskAssignees, List<FoundationUser> foundationWatchers, List<FoundationMetadataTag> coloredTags, FoundationUser updatedByFoundationUser, NonprofitUser updatedByNonprofitUser, Foundation foundation, NonprofitStage nonprofitStage, Pipeline pipelineInfo, CustomGrantType customGrantType, GrantPaymentSummary paymentSummary) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.grantFormProposal = grantFormProposal;
        this.grantAmount = grantAmount;
        this.awardedAmount = awardedAmount;
        this.awardedDate = awardedDate;
        this.grantType = grantType;
        this.tags = tags;
        this.deadline = deadline;
        this.duration = duration;
        this.foundationOwner = foundationOwner;
        this.additionalInfo = additionalInfo;
        this.stage = stage;
        this.pipelineId = pipelineId;
        this.watchers = watchers;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.created = created;
        this.updated = updated;
        this.firstFormDetails = firstFormDetails;
        this.purpose = purpose;
        this.submittable = submittable;
        this.assigneesToTask = assigneesToTask;
        this.externalAssigneesToTask = externalAssigneesToTask;
        this.assigneeToTaskTemplates = assigneeToTaskTemplates;
        this.taskTemplateResponses = taskTemplateResponses;
        this.taskDeadline = taskDeadline;
        this.organizationName = organizationName;
        this.entityType = entityType;
        this.recipientEmail = recipientEmail;
        this.sendProposalCreatedEmail = sendProposalCreatedEmail;
        this.customEmailTemplate = customEmailTemplate;
        this.disableStageChange = disableStageChange;
        this.responses = responses;
        this.submissionIndividual = submissionIndividual;
        this.submitted = submitted;
        this.multiForm = multiForm;
        this.taskIds = taskIds;
        this.taskAssignees = taskAssignees;
        this.readyForNextStage = readyForNextStage;
        this.nonprofit = nonprofit;
        this.formProposal = formProposal;
        this.foundationOwnerUser = foundationOwnerUser;
        this.foundationTaskAssignees = foundationTaskAssignees;
        this.nonprofitTaskAssignees = nonprofitTaskAssignees;
        this.foundationWatchers = foundationWatchers;
        this.coloredTags = coloredTags;
        this.updatedByFoundationUser = updatedByFoundationUser;
        this.updatedByNonprofitUser = updatedByNonprofitUser;
        this.foundation = foundation;
        this.nonprofitStage = nonprofitStage;
        this.pipelineInfo = pipelineInfo;
        this.customGrantType = customGrantType;
        this.paymentSummary = paymentSummary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getGrantFormProposal() {
        return grantFormProposal;
    }

    public void setGrantFormProposal(String grantFormProposal) {
        this.grantFormProposal = grantFormProposal;
    }

    public GrantAmount getGrantAmount() {
        return grantAmount;
    }

    public void setGrantAmount(GrantAmount grantAmount) {
        this.grantAmount = grantAmount;
    }

    public double getAwardedAmount() {
        return awardedAmount;
    }

    public void setAwardedAmount(double awardedAmount) {
        this.awardedAmount = awardedAmount;
    }

    public String getAwardedDate() {
        return awardedDate;
    }

    public void setAwardedDate(String awardedDate) {
        this.awardedDate = awardedDate;
    }

    public GrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantType grantType) {
        this.grantType = grantType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public GrantDuration getDuration() {
        return duration;
    }

    public void setDuration(GrantDuration duration) {
        this.duration = duration;
    }

    public String getFoundationOwner() {
        return foundationOwner;
    }

    public void setFoundationOwner(String foundationOwner) {
        this.foundationOwner = foundationOwner;
    }

    public GrantAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(GrantAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public List<String> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<String> watchers) {
        this.watchers = watchers;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FirstFormDetails getFirstFormDetails() {
        return firstFormDetails;
    }

    public void setFirstFormDetails(FirstFormDetails firstFormDetails) {
        this.firstFormDetails = firstFormDetails;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean getSubmittable() {
        return submittable;
    }

    public void setSubmittable(boolean submittable) {
        this.submittable = submittable;
    }

    public List<String> getAssigneesToTask() {
        return assigneesToTask;
    }

    public void setAssigneesToTask(List<String> assigneesToTask) {
        this.assigneesToTask = assigneesToTask;
    }

    public List<String> getExternalAssigneesToTask() {
        return externalAssigneesToTask;
    }

    public void setExternalAssigneesToTask(List<String> externalAssigneesToTask) {
        this.externalAssigneesToTask = externalAssigneesToTask;
    }

    public List<TaskTemplateAssignee> getAssigneeToTaskTemplates() {
        return assigneeToTaskTemplates;
    }

    public void setAssigneeToTaskTemplates(List<TaskTemplateAssignee> assigneeToTaskTemplates) {
        this.assigneeToTaskTemplates = assigneeToTaskTemplates;
    }

    public List<TaskTemplateResponse> getTaskTemplateResponses() {
        return taskTemplateResponses;
    }

    public void setTaskTemplateResponses(List<TaskTemplateResponse> taskTemplateResponses) {
        this.taskTemplateResponses = taskTemplateResponses;
    }

    public String getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(String taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public boolean getSendProposalCreatedEmail() {
        return sendProposalCreatedEmail;
    }

    public void setSendProposalCreatedEmail(boolean sendProposalCreatedEmail) {
        this.sendProposalCreatedEmail = sendProposalCreatedEmail;
    }

    public CustomEmailTemplate getCustomEmailTemplate() {
        return customEmailTemplate;
    }

    public void setCustomEmailTemplate(CustomEmailTemplate customEmailTemplate) {
        this.customEmailTemplate = customEmailTemplate;
    }

    public boolean getDisableStageChange() {
        return disableStageChange;
    }

    public void setDisableStageChange(boolean disableStageChange) {
        this.disableStageChange = disableStageChange;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }

    public String getSubmissionIndividual() {
        return submissionIndividual;
    }

    public void setSubmissionIndividual(String submissionIndividual) {
        this.submissionIndividual = submissionIndividual;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public MultipleFormInfo getMultiForm() {
        return multiForm;
    }

    public void setMultiForm(MultipleFormInfo multiForm) {
        this.multiForm = multiForm;
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public List<String> getTaskAssignees() {
        return taskAssignees;
    }

    public void setTaskAssignees(List<String> taskAssignees) {
        this.taskAssignees = taskAssignees;
    }

    public boolean getReadyForNextStage() {
        return readyForNextStage;
    }

    public void setReadyForNextStage(boolean readyForNextStage) {
        this.readyForNextStage = readyForNextStage;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public GrantFormProposal getFormProposal() {
        return formProposal;
    }

    public void setFormProposal(GrantFormProposal formProposal) {
        this.formProposal = formProposal;
    }

    public FoundationUser getFoundationOwnerUser() {
        return foundationOwnerUser;
    }

    public void setFoundationOwnerUser(FoundationUser foundationOwnerUser) {
        this.foundationOwnerUser = foundationOwnerUser;
    }

    public List<FoundationUser> getFoundationTaskAssignees() {
        return foundationTaskAssignees;
    }

    public void setFoundationTaskAssignees(List<FoundationUser> foundationTaskAssignees) {
        this.foundationTaskAssignees = foundationTaskAssignees;
    }

    public List<NonprofitUser> getNonprofitTaskAssignees() {
        return nonprofitTaskAssignees;
    }

    public void setNonprofitTaskAssignees(List<NonprofitUser> nonprofitTaskAssignees) {
        this.nonprofitTaskAssignees = nonprofitTaskAssignees;
    }

    public List<FoundationUser> getFoundationWatchers() {
        return foundationWatchers;
    }

    public void setFoundationWatchers(List<FoundationUser> foundationWatchers) {
        this.foundationWatchers = foundationWatchers;
    }

    public List<FoundationMetadataTag> getColoredTags() {
        return coloredTags;
    }

    public void setColoredTags(List<FoundationMetadataTag> coloredTags) {
        this.coloredTags = coloredTags;
    }

    public FoundationUser getUpdatedByFoundationUser() {
        return updatedByFoundationUser;
    }

    public void setUpdatedByFoundationUser(FoundationUser updatedByFoundationUser) {
        this.updatedByFoundationUser = updatedByFoundationUser;
    }

    public NonprofitUser getUpdatedByNonprofitUser() {
        return updatedByNonprofitUser;
    }

    public void setUpdatedByNonprofitUser(NonprofitUser updatedByNonprofitUser) {
        this.updatedByNonprofitUser = updatedByNonprofitUser;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public NonprofitStage getNonprofitStage() {
        return nonprofitStage;
    }

    public void setNonprofitStage(NonprofitStage nonprofitStage) {
        this.nonprofitStage = nonprofitStage;
    }

    public Pipeline getPipelineInfo() {
        return pipelineInfo;
    }

    public void setPipelineInfo(Pipeline pipelineInfo) {
        this.pipelineInfo = pipelineInfo;
    }

    public CustomGrantType getCustomGrantType() {
        return customGrantType;
    }

    public void setCustomGrantType(CustomGrantType customGrantType) {
        this.customGrantType = customGrantType;
    }

    public GrantPaymentSummary getPaymentSummary() {
        return paymentSummary;
    }

    public void setPaymentSummary(GrantPaymentSummary paymentSummary) {
        this.paymentSummary = paymentSummary;
    }
}

public static class GrantRefereeConfig {
    private List<GrantRefereeRequestConfig> granteeRequestConfigs;

    public GrantRefereeConfig() {}

    public GrantRefereeConfig(List<GrantRefereeRequestConfig> granteeRequestConfigs) {
        this.granteeRequestConfigs = granteeRequestConfigs;
    }

    public List<GrantRefereeRequestConfig> getGranteeRequestConfigs() {
        return granteeRequestConfigs;
    }

    public void setGranteeRequestConfigs(List<GrantRefereeRequestConfig> granteeRequestConfigs) {
        this.granteeRequestConfigs = granteeRequestConfigs;
    }
}

public static class GrantRefereeInfo {
    private List<GrantRefereeRequestDetail> grantRefereeRequestDetails;

    public GrantRefereeInfo() {}

    public GrantRefereeInfo(List<GrantRefereeRequestDetail> grantRefereeRequestDetails) {
        this.grantRefereeRequestDetails = grantRefereeRequestDetails;
    }

    public List<GrantRefereeRequestDetail> getGrantRefereeRequestDetails() {
        return grantRefereeRequestDetails;
    }

    public void setGrantRefereeRequestDetails(List<GrantRefereeRequestDetail> grantRefereeRequestDetails) {
        this.grantRefereeRequestDetails = grantRefereeRequestDetails;
    }
}

public static class GrantRefereeRequestConfig {
    private TaskTemplate taskTemplate;
    private String title;
    private String description;
    private boolean disableLogin;

    public GrantRefereeRequestConfig() {}

    public GrantRefereeRequestConfig(TaskTemplate taskTemplate, String title, String description, boolean disableLogin) {
        this.taskTemplate = taskTemplate;
        this.title = title;
        this.description = description;
        this.disableLogin = disableLogin;
    }

    public TaskTemplate getTaskTemplate() {
        return taskTemplate;
    }

    public void setTaskTemplate(TaskTemplate taskTemplate) {
        this.taskTemplate = taskTemplate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDisableLogin() {
        return disableLogin;
    }

    public void setDisableLogin(boolean disableLogin) {
        this.disableLogin = disableLogin;
    }
}

public static class GrantRefereeRequestDetail {
    private GrantRefereeRequestConfig requestConfig;
    private String recipientEmail;
    private String lastSent;
    private String taskId;
    private boolean sendEmail;

    public GrantRefereeRequestDetail() {}

    public GrantRefereeRequestDetail(GrantRefereeRequestConfig requestConfig, String recipientEmail, String lastSent, String taskId, boolean sendEmail) {
        this.requestConfig = requestConfig;
        this.recipientEmail = recipientEmail;
        this.lastSent = lastSent;
        this.taskId = taskId;
        this.sendEmail = sendEmail;
    }

    public GrantRefereeRequestConfig getRequestConfig() {
        return requestConfig;
    }

    public void setRequestConfig(GrantRefereeRequestConfig requestConfig) {
        this.requestConfig = requestConfig;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getLastSent() {
        return lastSent;
    }

    public void setLastSent(String lastSent) {
        this.lastSent = lastSent;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
}

public static class GrantSubmissionSearchResponse {
    private int totalCount;
    private List<GrantProposalSubmission> responses;
    private AggregateGrantAnalysis aggregateGrantAnalysis;

    public GrantSubmissionSearchResponse() {}

    public GrantSubmissionSearchResponse(int totalCount, List<GrantProposalSubmission> responses, AggregateGrantAnalysis aggregateGrantAnalysis) {
        this.totalCount = totalCount;
        this.responses = responses;
        this.aggregateGrantAnalysis = aggregateGrantAnalysis;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<GrantProposalSubmission> getResponses() {
        return responses;
    }

    public void setResponses(List<GrantProposalSubmission> responses) {
        this.responses = responses;
    }

    public AggregateGrantAnalysis getAggregateGrantAnalysis() {
        return aggregateGrantAnalysis;
    }

    public void setAggregateGrantAnalysis(AggregateGrantAnalysis aggregateGrantAnalysis) {
        this.aggregateGrantAnalysis = aggregateGrantAnalysis;
    }
}

public static class MultiFormResponse {
    private List<FormItemResponseEntity> responses;
    private String formProposalId;
    private String formTitle;
    private String submissionIndividual;
    private String submitted;
    private boolean internal;
    private String deadline;

    public MultiFormResponse() {}

    public MultiFormResponse(List<FormItemResponseEntity> responses, String formProposalId, String formTitle, String submissionIndividual, String submitted, boolean internal, String deadline) {
        this.responses = responses;
        this.formProposalId = formProposalId;
        this.formTitle = formTitle;
        this.submissionIndividual = submissionIndividual;
        this.submitted = submitted;
        this.internal = internal;
        this.deadline = deadline;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }

    public String getFormProposalId() {
        return formProposalId;
    }

    public void setFormProposalId(String formProposalId) {
        this.formProposalId = formProposalId;
    }

    public String getFormTitle() {
        return formTitle;
    }

    public void setFormTitle(String formTitle) {
        this.formTitle = formTitle;
    }

    public String getSubmissionIndividual() {
        return submissionIndividual;
    }

    public void setSubmissionIndividual(String submissionIndividual) {
        this.submissionIndividual = submissionIndividual;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public boolean getInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

public static class MultipleFormInfo {
    private List<MultiFormResponse> multiFormResponses;

    public MultipleFormInfo() {}

    public MultipleFormInfo(List<MultiFormResponse> multiFormResponses) {
        this.multiFormResponses = multiFormResponses;
    }

    public List<MultiFormResponse> getMultiFormResponses() {
        return multiFormResponses;
    }

    public void setMultiFormResponses(List<MultiFormResponse> multiFormResponses) {
        this.multiFormResponses = multiFormResponses;
    }
}

public static class PaymentAdditionalInfo {
    private String budgetCategory;
    private double localCurrencyAmount;
    private Currency localCurrency;
    private String description;
    private List<String> overrideTags;
    public enum OverrideGrantType {
        OPERATING_GRANT,
        PROJECT_GRANT,
        CAPITAL_GRANT,
        FELLOWSHIP,
        IN_KIND_GIVING,
    }
    private OverrideGrantType overrideGrantType;
    private String overrideCustomGrantType;
    private QBPaymentDetails qbPaymentDetails;
    private Object additionalFields;

    public PaymentAdditionalInfo() {}

    public PaymentAdditionalInfo(String budgetCategory, double localCurrencyAmount, Currency localCurrency, String description, List<String> overrideTags, OverrideGrantType overrideGrantType, String overrideCustomGrantType, QBPaymentDetails qbPaymentDetails, Object additionalFields) {
        this.budgetCategory = budgetCategory;
        this.localCurrencyAmount = localCurrencyAmount;
        this.localCurrency = localCurrency;
        this.description = description;
        this.overrideTags = overrideTags;
        this.overrideGrantType = overrideGrantType;
        this.overrideCustomGrantType = overrideCustomGrantType;
        this.qbPaymentDetails = qbPaymentDetails;
        this.additionalFields = additionalFields;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public double getLocalCurrencyAmount() {
        return localCurrencyAmount;
    }

    public void setLocalCurrencyAmount(double localCurrencyAmount) {
        this.localCurrencyAmount = localCurrencyAmount;
    }

    public Currency getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(Currency localCurrency) {
        this.localCurrency = localCurrency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOverrideTags() {
        return overrideTags;
    }

    public void setOverrideTags(List<String> overrideTags) {
        this.overrideTags = overrideTags;
    }

    public OverrideGrantType getOverrideGrantType() {
        return overrideGrantType;
    }

    public void setOverrideGrantType(OverrideGrantType overrideGrantType) {
        this.overrideGrantType = overrideGrantType;
    }

    public String getOverrideCustomGrantType() {
        return overrideCustomGrantType;
    }

    public void setOverrideCustomGrantType(String overrideCustomGrantType) {
        this.overrideCustomGrantType = overrideCustomGrantType;
    }

    public QBPaymentDetails getQbPaymentDetails() {
        return qbPaymentDetails;
    }

    public void setQbPaymentDetails(QBPaymentDetails qbPaymentDetails) {
        this.qbPaymentDetails = qbPaymentDetails;
    }

    public Object getAdditionalFields() {
        return additionalFields;
    }

    public void setAdditionalFields(Object additionalFields) {
        this.additionalFields = additionalFields;
    }
}

public static class PipelineProposalSummary {
    private Pipeline pipeline;
    private FoundationProposalSummary proposalSummary;

    public PipelineProposalSummary() {}

    public PipelineProposalSummary(Pipeline pipeline, FoundationProposalSummary proposalSummary) {
        this.pipeline = pipeline;
        this.proposalSummary = proposalSummary;
    }

    public Pipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public FoundationProposalSummary getProposalSummary() {
        return proposalSummary;
    }

    public void setProposalSummary(FoundationProposalSummary proposalSummary) {
        this.proposalSummary = proposalSummary;
    }
}

public static class ProposalStageResult {
    private GrantStage grantStage;
    private GrantSubmissionSearchResponse response;

    public ProposalStageResult() {}

    public ProposalStageResult(GrantStage grantStage, GrantSubmissionSearchResponse response) {
        this.grantStage = grantStage;
        this.response = response;
    }

    public GrantStage getGrantStage() {
        return grantStage;
    }

    public void setGrantStage(GrantStage grantStage) {
        this.grantStage = grantStage;
    }

    public GrantSubmissionSearchResponse getResponse() {
        return response;
    }

    public void setResponse(GrantSubmissionSearchResponse response) {
        this.response = response;
    }
}

public static class QBPaymentDetails {
    private String billId;
    private String vendorId;

    public QBPaymentDetails() {}

    public QBPaymentDetails(String billId, String vendorId) {
        this.billId = billId;
        this.vendorId = vendorId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
}

public static class SignatureOrder {
    private String id;
    public enum SignatureOrderType {
        FOUNDATION_USER,
        NONPROFIT_USER,
    }
    private SignatureOrderType signatureOrderType;
    private String userId;
    private String signedDocumentFileId;

    public SignatureOrder() {}

    public SignatureOrder(String id, SignatureOrderType signatureOrderType, String userId, String signedDocumentFileId) {
        this.id = id;
        this.signatureOrderType = signatureOrderType;
        this.userId = userId;
        this.signedDocumentFileId = signedDocumentFileId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignatureOrderType getSignatureOrderType() {
        return signatureOrderType;
    }

    public void setSignatureOrderType(SignatureOrderType signatureOrderType) {
        this.signatureOrderType = signatureOrderType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSignedDocumentFileId() {
        return signedDocumentFileId;
    }

    public void setSignedDocumentFileId(String signedDocumentFileId) {
        this.signedDocumentFileId = signedDocumentFileId;
    }
}

public static class SignatureStatusDetails {
    private List<SignatureOrder> orderList;
    private int currentIndex;

    public SignatureStatusDetails() {}

    public SignatureStatusDetails(List<SignatureOrder> orderList, int currentIndex) {
        this.orderList = orderList;
        this.currentIndex = currentIndex;
    }

    public List<SignatureOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<SignatureOrder> orderList) {
        this.orderList = orderList;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}

public static class TaskAdditionalInfo {
    private String envelopeId;
    private String lastRemindTime;
    private TipTapTextBlock agreementDocument;
    private boolean signatureRequired;
    private String signedDocumentFileId;
    private SignatureStatusDetails signatureStatusDetails;
    private String paymentDetailsPDFFileId;
    private AnvilPDFAdditionalInfo anvilPDFAdditionalInfo;
    private String noAuthAssigneeEmail;

    public TaskAdditionalInfo() {}

    public TaskAdditionalInfo(String envelopeId, String lastRemindTime, TipTapTextBlock agreementDocument, boolean signatureRequired, String signedDocumentFileId, SignatureStatusDetails signatureStatusDetails, String paymentDetailsPDFFileId, AnvilPDFAdditionalInfo anvilPDFAdditionalInfo, String noAuthAssigneeEmail) {
        this.envelopeId = envelopeId;
        this.lastRemindTime = lastRemindTime;
        this.agreementDocument = agreementDocument;
        this.signatureRequired = signatureRequired;
        this.signedDocumentFileId = signedDocumentFileId;
        this.signatureStatusDetails = signatureStatusDetails;
        this.paymentDetailsPDFFileId = paymentDetailsPDFFileId;
        this.anvilPDFAdditionalInfo = anvilPDFAdditionalInfo;
        this.noAuthAssigneeEmail = noAuthAssigneeEmail;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getLastRemindTime() {
        return lastRemindTime;
    }

    public void setLastRemindTime(String lastRemindTime) {
        this.lastRemindTime = lastRemindTime;
    }

    public TipTapTextBlock getAgreementDocument() {
        return agreementDocument;
    }

    public void setAgreementDocument(TipTapTextBlock agreementDocument) {
        this.agreementDocument = agreementDocument;
    }

    public boolean getSignatureRequired() {
        return signatureRequired;
    }

    public void setSignatureRequired(boolean signatureRequired) {
        this.signatureRequired = signatureRequired;
    }

    public String getSignedDocumentFileId() {
        return signedDocumentFileId;
    }

    public void setSignedDocumentFileId(String signedDocumentFileId) {
        this.signedDocumentFileId = signedDocumentFileId;
    }

    public SignatureStatusDetails getSignatureStatusDetails() {
        return signatureStatusDetails;
    }

    public void setSignatureStatusDetails(SignatureStatusDetails signatureStatusDetails) {
        this.signatureStatusDetails = signatureStatusDetails;
    }

    public String getPaymentDetailsPDFFileId() {
        return paymentDetailsPDFFileId;
    }

    public void setPaymentDetailsPDFFileId(String paymentDetailsPDFFileId) {
        this.paymentDetailsPDFFileId = paymentDetailsPDFFileId;
    }

    public AnvilPDFAdditionalInfo getAnvilPDFAdditionalInfo() {
        return anvilPDFAdditionalInfo;
    }

    public void setAnvilPDFAdditionalInfo(AnvilPDFAdditionalInfo anvilPDFAdditionalInfo) {
        this.anvilPDFAdditionalInfo = anvilPDFAdditionalInfo;
    }

    public String getNoAuthAssigneeEmail() {
        return noAuthAssigneeEmail;
    }

    public void setNoAuthAssigneeEmail(String noAuthAssigneeEmail) {
        this.noAuthAssigneeEmail = noAuthAssigneeEmail;
    }
}

public static class TaskSourceEntity {
    public enum SourceType {
        CRM,
        GRANT_APPLICATION,
        REPORT,
        AGREEMENT_TEMPLATE,
        DONOR,
    }
    private SourceType sourceType;
    private String sourceId;

    public TaskSourceEntity() {}

    public TaskSourceEntity(SourceType sourceType, String sourceId) {
        this.sourceType = sourceType;
        this.sourceId = sourceId;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }
}

public static class TaskTemplate {
    private String id;
    private String name;
    public enum Type {
        SYSTEM,
        USER,
    }
    private Type type;
    public enum SystemLabel {
        GRANT_AGREEMENT,
        PAYMENT,
        REPORTING,
        REVIEW,
        REMINDER,
        CUSTOM_REMINDER,
        DOCUSIGN,
        PLAID_PAYMENT_DETAILS,
        EXTERNAL,
        EXTERNAL_REVIEWER,
        REFEREE,
        GRANT_UPLOAD,
        GRANT_TEMPLATE,
        MULTI_GRANT_DOCUMENT_REVIEW,
        GRANT_DOCUMENT_REVIEW,
        GRANT_SIGNATURE_REQUEST,
        PLAID_PAYMENT_SECURE_PAYMENT_STORAGE,
        SECURE_PAYMENT_STORAGE,
        PDF,
    }
    private SystemLabel systemLabel;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private List<FormItem> components;
    private TaskTemplateAdditionalInfo additionalInfo;
    private String created;
    private String updated;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;

    public TaskTemplate() {}

    public TaskTemplate(String id, String name, Type type, SystemLabel systemLabel, String foundationId, String createdBy, String updatedBy, List<FormItem> components, TaskTemplateAdditionalInfo additionalInfo, String created, String updated, FoundationUser createdByUser, FoundationUser updatedByUser) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.systemLabel = systemLabel;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.components = components;
        this.additionalInfo = additionalInfo;
        this.created = created;
        this.updated = updated;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SystemLabel getSystemLabel() {
        return systemLabel;
    }

    public void setSystemLabel(SystemLabel systemLabel) {
        this.systemLabel = systemLabel;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }

    public TaskTemplateAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(TaskTemplateAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class TaskTemplateAssignee {
    private String taskTemplateId;
    private List<String> assigneeIds;

    public TaskTemplateAssignee() {}

    public TaskTemplateAssignee(String taskTemplateId, List<String> assigneeIds) {
        this.taskTemplateId = taskTemplateId;
        this.assigneeIds = assigneeIds;
    }

    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    public List<String> getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(List<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }
}

public static class TaskTemplateResponse {
    private String taskTemplateId;
    private List<FormItemResponseEntity> responses;

    public TaskTemplateResponse() {}

    public TaskTemplateResponse(String taskTemplateId, List<FormItemResponseEntity> responses) {
        this.taskTemplateId = taskTemplateId;
        this.responses = responses;
    }

    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }
}

public static class TipTapAttrs {
    private String id;
    private String label;
    private int level;
    private String textAlign;
    private String color;
    private String fontFamily;
    private String fontSize;
    private String src;
    private int height;
    private int width;
    private String alt;
    private String fileId;
    private String _class;
    private String href;
    private String ref;
    private String target;

    public TipTapAttrs() {}

    public TipTapAttrs(String id, String label, int level, String textAlign, String color, String fontFamily, String fontSize, String src, int height, int width, String alt, String fileId, String _class, String href, String ref, String target) {
        this.id = id;
        this.label = label;
        this.level = level;
        this.textAlign = textAlign;
        this.color = color;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.src = src;
        this.height = height;
        this.width = width;
        this.alt = alt;
        this.fileId = fileId;
        this._class = _class;
        this.href = href;
        this.ref = ref;
        this.target = target;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}

public static class TipTapTextBlock {
    private String type;
    private List<TipTapTextBlock> content;
    private String text;
    private List<TipTapTextBlock> marks;
    private TipTapAttrs attrs;

    public TipTapTextBlock() {}

    public TipTapTextBlock(String type, List<TipTapTextBlock> content, String text, List<TipTapTextBlock> marks, TipTapAttrs attrs) {
        this.type = type;
        this.content = content;
        this.text = text;
        this.marks = marks;
        this.attrs = attrs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TipTapTextBlock> getContent() {
        return content;
    }

    public void setContent(List<TipTapTextBlock> content) {
        this.content = content;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<TipTapTextBlock> getMarks() {
        return marks;
    }

    public void setMarks(List<TipTapTextBlock> marks) {
        this.marks = marks;
    }

    public TipTapAttrs getAttrs() {
        return attrs;
    }

    public void setAttrs(TipTapAttrs attrs) {
        this.attrs = attrs;
    }
}

public static class UserDetails {
    private AppUser user;
    public enum EntityType {
        FOUNDATION,
        NONPROFIT,
        EXTERNAL_REVIEWER,
    }
    private EntityType entityType;
    private EntityDetails entityDetails;

    public UserDetails() {}

    public UserDetails(AppUser user, EntityType entityType, EntityDetails entityDetails) {
        this.user = user;
        this.entityType = entityType;
        this.entityDetails = entityDetails;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityDetails getEntityDetails() {
        return entityDetails;
    }

    public void setEntityDetails(EntityDetails entityDetails) {
        this.entityDetails = entityDetails;
    }
}

public static class AggregateDashboardRequest {
    private List<String> foundationIds;

    public AggregateDashboardRequest() {}

    public AggregateDashboardRequest(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }
}

public static class DataColumn {
    public enum ColumnType {
        STRING,
        DATE,
        NUMBER,
        CURRENCY,
    }
    private ColumnType columnType;
    private String headerName;
    private String columnId;
    private SubmissionTableResponseRetriever tableColumnRetriever;

    public DataColumn() {}

    public DataColumn(ColumnType columnType, String headerName, String columnId, SubmissionTableResponseRetriever tableColumnRetriever) {
        this.columnType = columnType;
        this.headerName = headerName;
        this.columnId = columnId;
        this.tableColumnRetriever = tableColumnRetriever;
    }

    public ColumnType getColumnType() {
        return columnType;
    }

    public void setColumnType(ColumnType columnType) {
        this.columnType = columnType;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public SubmissionTableResponseRetriever getTableColumnRetriever() {
        return tableColumnRetriever;
    }

    public void setTableColumnRetriever(SubmissionTableResponseRetriever tableColumnRetriever) {
        this.tableColumnRetriever = tableColumnRetriever;
    }
}

public static class DataRow {
    private Object row;

    public DataRow() {}

    public DataRow(Object row) {
        this.row = row;
    }

    public Object getRow() {
        return row;
    }

    public void setRow(Object row) {
        this.row = row;
    }
}

public static class DataSearchResponse {
    private int totalCount;
    private List<DataColumn> columns;
    private List<DataRow> rows;

    public DataSearchResponse() {}

    public DataSearchResponse(int totalCount, List<DataColumn> columns, List<DataRow> rows) {
        this.totalCount = totalCount;
        this.columns = columns;
        this.rows = rows;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<DataColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DataColumn> columns) {
        this.columns = columns;
    }

    public List<DataRow> getRows() {
        return rows;
    }

    public void setRows(List<DataRow> rows) {
        this.rows = rows;
    }
}

public static class SubmissionTableResponseRetriever {

    public SubmissionTableResponseRetriever() {}
}

public static class AggregateDataSearchRequest {
    private List<String> foundationIds;
    public enum ReportType {
        PAYMENTS,
        SUBMISSIONS,
        DOLLARS_BY_BUDGET_CATEGORY,
        DOLLARS_BY_ORGANIZATION_TAGS,
        FULL_GRANTS_LIST,
        FULL_GRANTEE_CONTACT_LIST,
        ALL_DATA,
        REPORTS,
        REVIEW_TASKS,
        EXTERNAL_REVIEWER_TASKS,
        CONTACT_LIST,
        IRS_990_REPORT,
        CANDID_DEMOGRAPHICS,
        CRM_PROFILE,
        DONOR_MANAGEMENT_REPORT,
        DONOR_CONTRIBUTION,
    }
    private ReportType reportType;

    public AggregateDataSearchRequest() {}

    public AggregateDataSearchRequest(List<String> foundationIds, ReportType reportType) {
        this.foundationIds = foundationIds;
        this.reportType = reportType;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }
}

public static class AwardStatistics {
    private double averageGrantAmount;
    private double medianGrantAmount;
    private GrantPayment smallestGrantAmount;
    private GrantPayment largestGrantAmount;
    private GrantProposalSubmission largestGrant;
    private GrantProposalSubmission smallestGrant;

    public AwardStatistics() {}

    public AwardStatistics(double averageGrantAmount, double medianGrantAmount, GrantPayment smallestGrantAmount, GrantPayment largestGrantAmount, GrantProposalSubmission largestGrant, GrantProposalSubmission smallestGrant) {
        this.averageGrantAmount = averageGrantAmount;
        this.medianGrantAmount = medianGrantAmount;
        this.smallestGrantAmount = smallestGrantAmount;
        this.largestGrantAmount = largestGrantAmount;
        this.largestGrant = largestGrant;
        this.smallestGrant = smallestGrant;
    }

    public double getAverageGrantAmount() {
        return averageGrantAmount;
    }

    public void setAverageGrantAmount(double averageGrantAmount) {
        this.averageGrantAmount = averageGrantAmount;
    }

    public double getMedianGrantAmount() {
        return medianGrantAmount;
    }

    public void setMedianGrantAmount(double medianGrantAmount) {
        this.medianGrantAmount = medianGrantAmount;
    }

    public GrantPayment getSmallestGrantAmount() {
        return smallestGrantAmount;
    }

    public void setSmallestGrantAmount(GrantPayment smallestGrantAmount) {
        this.smallestGrantAmount = smallestGrantAmount;
    }

    public GrantPayment getLargestGrantAmount() {
        return largestGrantAmount;
    }

    public void setLargestGrantAmount(GrantPayment largestGrantAmount) {
        this.largestGrantAmount = largestGrantAmount;
    }

    public GrantProposalSubmission getLargestGrant() {
        return largestGrant;
    }

    public void setLargestGrant(GrantProposalSubmission largestGrant) {
        this.largestGrant = largestGrant;
    }

    public GrantProposalSubmission getSmallestGrant() {
        return smallestGrant;
    }

    public void setSmallestGrant(GrantProposalSubmission smallestGrant) {
        this.smallestGrant = smallestGrant;
    }
}

public static class BudgetCategoryAllocation {
    private String budgetCategory;
    private List<NonprofitAmount> awardedNonprofits;
    private double awardedAmount;
    private double awardedPercentage;
    private List<NonprofitAmount> committedNonprofits;
    private double committedAmount;
    private double committedPercentage;
    private double pendingAmount;
    private double pendingPercentage;
    private double targetAmount;

    public BudgetCategoryAllocation() {}

    public BudgetCategoryAllocation(String budgetCategory, List<NonprofitAmount> awardedNonprofits, double awardedAmount, double awardedPercentage, List<NonprofitAmount> committedNonprofits, double committedAmount, double committedPercentage, double pendingAmount, double pendingPercentage, double targetAmount) {
        this.budgetCategory = budgetCategory;
        this.awardedNonprofits = awardedNonprofits;
        this.awardedAmount = awardedAmount;
        this.awardedPercentage = awardedPercentage;
        this.committedNonprofits = committedNonprofits;
        this.committedAmount = committedAmount;
        this.committedPercentage = committedPercentage;
        this.pendingAmount = pendingAmount;
        this.pendingPercentage = pendingPercentage;
        this.targetAmount = targetAmount;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public List<NonprofitAmount> getAwardedNonprofits() {
        return awardedNonprofits;
    }

    public void setAwardedNonprofits(List<NonprofitAmount> awardedNonprofits) {
        this.awardedNonprofits = awardedNonprofits;
    }

    public double getAwardedAmount() {
        return awardedAmount;
    }

    public void setAwardedAmount(double awardedAmount) {
        this.awardedAmount = awardedAmount;
    }

    public double getAwardedPercentage() {
        return awardedPercentage;
    }

    public void setAwardedPercentage(double awardedPercentage) {
        this.awardedPercentage = awardedPercentage;
    }

    public List<NonprofitAmount> getCommittedNonprofits() {
        return committedNonprofits;
    }

    public void setCommittedNonprofits(List<NonprofitAmount> committedNonprofits) {
        this.committedNonprofits = committedNonprofits;
    }

    public double getCommittedAmount() {
        return committedAmount;
    }

    public void setCommittedAmount(double committedAmount) {
        this.committedAmount = committedAmount;
    }

    public double getCommittedPercentage() {
        return committedPercentage;
    }

    public void setCommittedPercentage(double committedPercentage) {
        this.committedPercentage = committedPercentage;
    }

    public double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public double getPendingPercentage() {
        return pendingPercentage;
    }

    public void setPendingPercentage(double pendingPercentage) {
        this.pendingPercentage = pendingPercentage;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }
}

public static class BudgetCategoryYOYData {
    private String budgetCategory;
    private List<YearlyData> yearlyData;

    public BudgetCategoryYOYData() {}

    public BudgetCategoryYOYData(String budgetCategory, List<YearlyData> yearlyData) {
        this.budgetCategory = budgetCategory;
        this.yearlyData = yearlyData;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public List<YearlyData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<YearlyData> yearlyData) {
        this.yearlyData = yearlyData;
    }
}

public static class CustomGrantTypeAllocation {
    private CustomGrantType grantType;
    private double amount;
    private double percentage;
    private List<NonprofitAmount> nonprofitAmounts;

    public CustomGrantTypeAllocation() {}

    public CustomGrantTypeAllocation(CustomGrantType grantType, double amount, double percentage, List<NonprofitAmount> nonprofitAmounts) {
        this.grantType = grantType;
        this.amount = amount;
        this.percentage = percentage;
        this.nonprofitAmounts = nonprofitAmounts;
    }

    public CustomGrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(CustomGrantType grantType) {
        this.grantType = grantType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public List<NonprofitAmount> getNonprofitAmounts() {
        return nonprofitAmounts;
    }

    public void setNonprofitAmounts(List<NonprofitAmount> nonprofitAmounts) {
        this.nonprofitAmounts = nonprofitAmounts;
    }
}

public static class CustomGrantTypeYOYData {
    private CustomGrantType grantType;
    private List<YearlyData> yearlyData;

    public CustomGrantTypeYOYData() {}

    public CustomGrantTypeYOYData(CustomGrantType grantType, List<YearlyData> yearlyData) {
        this.grantType = grantType;
        this.yearlyData = yearlyData;
    }

    public CustomGrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(CustomGrantType grantType) {
        this.grantType = grantType;
    }

    public List<YearlyData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<YearlyData> yearlyData) {
        this.yearlyData = yearlyData;
    }
}

public static class DashboardResponse {
    private double totalAwardedHistorical;
    private List<FiscalYearData> yearlyData;
    private YOYData yoyData;
    private FiscalYearData customRangeData;

    public DashboardResponse() {}

    public DashboardResponse(double totalAwardedHistorical, List<FiscalYearData> yearlyData, YOYData yoyData, FiscalYearData customRangeData) {
        this.totalAwardedHistorical = totalAwardedHistorical;
        this.yearlyData = yearlyData;
        this.yoyData = yoyData;
        this.customRangeData = customRangeData;
    }

    public double getTotalAwardedHistorical() {
        return totalAwardedHistorical;
    }

    public void setTotalAwardedHistorical(double totalAwardedHistorical) {
        this.totalAwardedHistorical = totalAwardedHistorical;
    }

    public List<FiscalYearData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<FiscalYearData> yearlyData) {
        this.yearlyData = yearlyData;
    }

    public YOYData getYoyData() {
        return yoyData;
    }

    public void setYoyData(YOYData yoyData) {
        this.yoyData = yoyData;
    }

    public FiscalYearData getCustomRangeData() {
        return customRangeData;
    }

    public void setCustomRangeData(FiscalYearData customRangeData) {
        this.customRangeData = customRangeData;
    }
}

public static class FiscalRange {
    private String start;
    private String end;

    public FiscalRange() {}

    public FiscalRange(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}

public static class FiscalYearData {
    private FiscalRange range;
    private int totalGrantsFiscalYear;
    private double totalAwardedFiscalYear;
    private BudgetCategoryAllocation totalYearBudget;
    private List<BudgetCategoryAllocation> categoryYearBudget;
    private List<FoundationTagAllocation> tagAllocations;
    private List<GrantTypeAllocation> grantTypeAllocations;
    private List<CustomGrantTypeAllocation> customGrantTypeAllocations;
    private AwardStatistics awardStatistics;

    public FiscalYearData() {}

    public FiscalYearData(FiscalRange range, int totalGrantsFiscalYear, double totalAwardedFiscalYear, BudgetCategoryAllocation totalYearBudget, List<BudgetCategoryAllocation> categoryYearBudget, List<FoundationTagAllocation> tagAllocations, List<GrantTypeAllocation> grantTypeAllocations, List<CustomGrantTypeAllocation> customGrantTypeAllocations, AwardStatistics awardStatistics) {
        this.range = range;
        this.totalGrantsFiscalYear = totalGrantsFiscalYear;
        this.totalAwardedFiscalYear = totalAwardedFiscalYear;
        this.totalYearBudget = totalYearBudget;
        this.categoryYearBudget = categoryYearBudget;
        this.tagAllocations = tagAllocations;
        this.grantTypeAllocations = grantTypeAllocations;
        this.customGrantTypeAllocations = customGrantTypeAllocations;
        this.awardStatistics = awardStatistics;
    }

    public FiscalRange getRange() {
        return range;
    }

    public void setRange(FiscalRange range) {
        this.range = range;
    }

    public int getTotalGrantsFiscalYear() {
        return totalGrantsFiscalYear;
    }

    public void setTotalGrantsFiscalYear(int totalGrantsFiscalYear) {
        this.totalGrantsFiscalYear = totalGrantsFiscalYear;
    }

    public double getTotalAwardedFiscalYear() {
        return totalAwardedFiscalYear;
    }

    public void setTotalAwardedFiscalYear(double totalAwardedFiscalYear) {
        this.totalAwardedFiscalYear = totalAwardedFiscalYear;
    }

    public BudgetCategoryAllocation getTotalYearBudget() {
        return totalYearBudget;
    }

    public void setTotalYearBudget(BudgetCategoryAllocation totalYearBudget) {
        this.totalYearBudget = totalYearBudget;
    }

    public List<BudgetCategoryAllocation> getCategoryYearBudget() {
        return categoryYearBudget;
    }

    public void setCategoryYearBudget(List<BudgetCategoryAllocation> categoryYearBudget) {
        this.categoryYearBudget = categoryYearBudget;
    }

    public List<FoundationTagAllocation> getTagAllocations() {
        return tagAllocations;
    }

    public void setTagAllocations(List<FoundationTagAllocation> tagAllocations) {
        this.tagAllocations = tagAllocations;
    }

    public List<GrantTypeAllocation> getGrantTypeAllocations() {
        return grantTypeAllocations;
    }

    public void setGrantTypeAllocations(List<GrantTypeAllocation> grantTypeAllocations) {
        this.grantTypeAllocations = grantTypeAllocations;
    }

    public List<CustomGrantTypeAllocation> getCustomGrantTypeAllocations() {
        return customGrantTypeAllocations;
    }

    public void setCustomGrantTypeAllocations(List<CustomGrantTypeAllocation> customGrantTypeAllocations) {
        this.customGrantTypeAllocations = customGrantTypeAllocations;
    }

    public AwardStatistics getAwardStatistics() {
        return awardStatistics;
    }

    public void setAwardStatistics(AwardStatistics awardStatistics) {
        this.awardStatistics = awardStatistics;
    }
}

public static class FoundationTagAllocation {
    private String tag;
    private double amount;
    private double percentage;
    private List<NonprofitAmount> nonprofitAmounts;

    public FoundationTagAllocation() {}

    public FoundationTagAllocation(String tag, double amount, double percentage, List<NonprofitAmount> nonprofitAmounts) {
        this.tag = tag;
        this.amount = amount;
        this.percentage = percentage;
        this.nonprofitAmounts = nonprofitAmounts;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public List<NonprofitAmount> getNonprofitAmounts() {
        return nonprofitAmounts;
    }

    public void setNonprofitAmounts(List<NonprofitAmount> nonprofitAmounts) {
        this.nonprofitAmounts = nonprofitAmounts;
    }
}

public static class GrantTypeAllocation {
    public enum GrantType {
        OPERATING_GRANT,
        PROJECT_GRANT,
        CAPITAL_GRANT,
        FELLOWSHIP,
        IN_KIND_GIVING,
    }
    private GrantType grantType;
    private double amount;
    private double percentage;
    private List<NonprofitAmount> nonprofitAmounts;

    public GrantTypeAllocation() {}

    public GrantTypeAllocation(GrantType grantType, double amount, double percentage, List<NonprofitAmount> nonprofitAmounts) {
        this.grantType = grantType;
        this.amount = amount;
        this.percentage = percentage;
        this.nonprofitAmounts = nonprofitAmounts;
    }

    public GrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantType grantType) {
        this.grantType = grantType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public List<NonprofitAmount> getNonprofitAmounts() {
        return nonprofitAmounts;
    }

    public void setNonprofitAmounts(List<NonprofitAmount> nonprofitAmounts) {
        this.nonprofitAmounts = nonprofitAmounts;
    }
}

public static class GrantTypeYOYData {
    public enum GrantType {
        OPERATING_GRANT,
        PROJECT_GRANT,
        CAPITAL_GRANT,
        FELLOWSHIP,
        IN_KIND_GIVING,
    }
    private GrantType grantType;
    private List<YearlyData> yearlyData;

    public GrantTypeYOYData() {}

    public GrantTypeYOYData(GrantType grantType, List<YearlyData> yearlyData) {
        this.grantType = grantType;
        this.yearlyData = yearlyData;
    }

    public GrantType getGrantType() {
        return grantType;
    }

    public void setGrantType(GrantType grantType) {
        this.grantType = grantType;
    }

    public List<YearlyData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<YearlyData> yearlyData) {
        this.yearlyData = yearlyData;
    }
}

public static class NonprofitAmount {
    private Nonprofit nonprofit;
    private double amount;

    public NonprofitAmount() {}

    public NonprofitAmount(Nonprofit nonprofit, double amount) {
        this.nonprofit = nonprofit;
        this.amount = amount;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public static class TagYOYData {
    private String tag;
    private List<YearlyData> yearlyData;

    public TagYOYData() {}

    public TagYOYData(String tag, List<YearlyData> yearlyData) {
        this.tag = tag;
        this.yearlyData = yearlyData;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<YearlyData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<YearlyData> yearlyData) {
        this.yearlyData = yearlyData;
    }
}

public static class YOYData {
    private List<FiscalRange> years;
    private List<BudgetCategoryYOYData> budgetYOYData;
    private List<TagYOYData> tagYOYData;
    private List<GrantTypeYOYData> grantTypeYOYData;
    private List<CustomGrantTypeYOYData> customGrantTypeYOYData;

    public YOYData() {}

    public YOYData(List<FiscalRange> years, List<BudgetCategoryYOYData> budgetYOYData, List<TagYOYData> tagYOYData, List<GrantTypeYOYData> grantTypeYOYData, List<CustomGrantTypeYOYData> customGrantTypeYOYData) {
        this.years = years;
        this.budgetYOYData = budgetYOYData;
        this.tagYOYData = tagYOYData;
        this.grantTypeYOYData = grantTypeYOYData;
        this.customGrantTypeYOYData = customGrantTypeYOYData;
    }

    public List<FiscalRange> getYears() {
        return years;
    }

    public void setYears(List<FiscalRange> years) {
        this.years = years;
    }

    public List<BudgetCategoryYOYData> getBudgetYOYData() {
        return budgetYOYData;
    }

    public void setBudgetYOYData(List<BudgetCategoryYOYData> budgetYOYData) {
        this.budgetYOYData = budgetYOYData;
    }

    public List<TagYOYData> getTagYOYData() {
        return tagYOYData;
    }

    public void setTagYOYData(List<TagYOYData> tagYOYData) {
        this.tagYOYData = tagYOYData;
    }

    public List<GrantTypeYOYData> getGrantTypeYOYData() {
        return grantTypeYOYData;
    }

    public void setGrantTypeYOYData(List<GrantTypeYOYData> grantTypeYOYData) {
        this.grantTypeYOYData = grantTypeYOYData;
    }

    public List<CustomGrantTypeYOYData> getCustomGrantTypeYOYData() {
        return customGrantTypeYOYData;
    }

    public void setCustomGrantTypeYOYData(List<CustomGrantTypeYOYData> customGrantTypeYOYData) {
        this.customGrantTypeYOYData = customGrantTypeYOYData;
    }
}

public static class YearlyData {
    private FiscalRange range;
    private double amount;
    private double percentage;

    public YearlyData() {}

    public YearlyData(FiscalRange range, double amount, double percentage) {
        this.range = range;
        this.amount = amount;
        this.percentage = percentage;
    }

    public FiscalRange getRange() {
        return range;
    }

    public void setRange(FiscalRange range) {
        this.range = range;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

public static class AggregateExecDashboardRequest {
    private List<String> foundationIds;
    private String startDate;
    private String endDate;

    public AggregateExecDashboardRequest() {}

    public AggregateExecDashboardRequest(List<String> foundationIds, String startDate, String endDate) {
        this.foundationIds = foundationIds;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}

public static class AggregateUniversalFoundationSearchResponse {
    private Foundation foundation;
    private List<FoundationSearchResponseEntity> responses;

    public AggregateUniversalFoundationSearchResponse() {}

    public AggregateUniversalFoundationSearchResponse(Foundation foundation, List<FoundationSearchResponseEntity> responses) {
        this.foundation = foundation;
        this.responses = responses;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<FoundationSearchResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FoundationSearchResponseEntity> responses) {
        this.responses = responses;
    }
}

public static class AggregateUniversalSearchResponse {
    private List<AggregateUniversalFoundationSearchResponse> foundationResults;

    public AggregateUniversalSearchResponse() {}

    public AggregateUniversalSearchResponse(List<AggregateUniversalFoundationSearchResponse> foundationResults) {
        this.foundationResults = foundationResults;
    }

    public List<AggregateUniversalFoundationSearchResponse> getFoundationResults() {
        return foundationResults;
    }

    public void setFoundationResults(List<AggregateUniversalFoundationSearchResponse> foundationResults) {
        this.foundationResults = foundationResults;
    }
}

public static class CRMSubmissionDetails {
    private String submissionName;
    private double awardedAmount;
    private String awardedDate;
    private String purpose;
    private List<String> tags;
    private GrantDuration duration;
    private String stage;
    private String pipelineId;

    public CRMSubmissionDetails() {}

    public CRMSubmissionDetails(String submissionName, double awardedAmount, String awardedDate, String purpose, List<String> tags, GrantDuration duration, String stage, String pipelineId) {
        this.submissionName = submissionName;
        this.awardedAmount = awardedAmount;
        this.awardedDate = awardedDate;
        this.purpose = purpose;
        this.tags = tags;
        this.duration = duration;
        this.stage = stage;
        this.pipelineId = pipelineId;
    }

    public String getSubmissionName() {
        return submissionName;
    }

    public void setSubmissionName(String submissionName) {
        this.submissionName = submissionName;
    }

    public double getAwardedAmount() {
        return awardedAmount;
    }

    public void setAwardedAmount(double awardedAmount) {
        this.awardedAmount = awardedAmount;
    }

    public String getAwardedDate() {
        return awardedDate;
    }

    public void setAwardedDate(String awardedDate) {
        this.awardedDate = awardedDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public GrantDuration getDuration() {
        return duration;
    }

    public void setDuration(GrantDuration duration) {
        this.duration = duration;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }
}

public static class FoundationNonprofitMetadata {
    private String foundationId;
    private String nonprofitId;
    private String dba;
    private String phoneNumber;
    private String mission;
    private String vision;
    private boolean hasFiscalSponsor;
    private FiscalSponsor fiscalSponsor;
    private String orgEmail;
    private String organizationName;
    private double totalAwarded;
    private List<String> tags;
    private List<String> statuses;
    private FoundationUser foundationPOC;
    private String nextPaymentDate;
    private String description;
    private String ein;
    private String legalName;
    public enum EntityType {
        ORGANIZATION,
        INDIVIDUAL,
    }
    private EntityType entityType;
    private NonprofitUser primaryContact;
    private String website;
    private Address headquarters;
    private Address mailingAddress;
    private String facebook;
    private String twitter;
    private String instagram;
    private String linkedIn;
    private String guidestarProfile;
    private String legalStatus;
    private String foundingDate;
    private String irsDeterminationLetter;
    public enum IrsRecipientStatus {
        PF,
        POF,
        EOF,
        PC,
        GOV,
        SO_DP,
        SO_I,
        SO_II,
        SO_III_FI,
        SO_III_NFI,
        TPS,
        NC,
        I,
    }
    private IrsRecipientStatus irsRecipientStatus;
    private Object customFields;
    private InteractionAdditionalInfo interactionAdditionalInfo;
    private List<FoundationMetadataTag> coloredTags;
    private OfacFlags ofacFlags;
    private boolean sendEmail;
    private NonprofitAdditionalInfo additionalInfo;
    private String organizationLogo;
    private List<CRMSubmissionDetails> submissionDetails;

    public FoundationNonprofitMetadata() {}

    public FoundationNonprofitMetadata(String foundationId, String nonprofitId, String dba, String phoneNumber, String mission, String vision, boolean hasFiscalSponsor, FiscalSponsor fiscalSponsor, String orgEmail, String organizationName, double totalAwarded, List<String> tags, List<String> statuses, FoundationUser foundationPOC, String nextPaymentDate, String description, String ein, String legalName, EntityType entityType, NonprofitUser primaryContact, String website, Address headquarters, Address mailingAddress, String facebook, String twitter, String instagram, String linkedIn, String guidestarProfile, String legalStatus, String foundingDate, String irsDeterminationLetter, IrsRecipientStatus irsRecipientStatus, Object customFields, InteractionAdditionalInfo interactionAdditionalInfo, List<FoundationMetadataTag> coloredTags, OfacFlags ofacFlags, boolean sendEmail, NonprofitAdditionalInfo additionalInfo, String organizationLogo, List<CRMSubmissionDetails> submissionDetails) {
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.dba = dba;
        this.phoneNumber = phoneNumber;
        this.mission = mission;
        this.vision = vision;
        this.hasFiscalSponsor = hasFiscalSponsor;
        this.fiscalSponsor = fiscalSponsor;
        this.orgEmail = orgEmail;
        this.organizationName = organizationName;
        this.totalAwarded = totalAwarded;
        this.tags = tags;
        this.statuses = statuses;
        this.foundationPOC = foundationPOC;
        this.nextPaymentDate = nextPaymentDate;
        this.description = description;
        this.ein = ein;
        this.legalName = legalName;
        this.entityType = entityType;
        this.primaryContact = primaryContact;
        this.website = website;
        this.headquarters = headquarters;
        this.mailingAddress = mailingAddress;
        this.facebook = facebook;
        this.twitter = twitter;
        this.instagram = instagram;
        this.linkedIn = linkedIn;
        this.guidestarProfile = guidestarProfile;
        this.legalStatus = legalStatus;
        this.foundingDate = foundingDate;
        this.irsDeterminationLetter = irsDeterminationLetter;
        this.irsRecipientStatus = irsRecipientStatus;
        this.customFields = customFields;
        this.interactionAdditionalInfo = interactionAdditionalInfo;
        this.coloredTags = coloredTags;
        this.ofacFlags = ofacFlags;
        this.sendEmail = sendEmail;
        this.additionalInfo = additionalInfo;
        this.organizationLogo = organizationLogo;
        this.submissionDetails = submissionDetails;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getDba() {
        return dba;
    }

    public void setDba(String dba) {
        this.dba = dba;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public boolean getHasFiscalSponsor() {
        return hasFiscalSponsor;
    }

    public void setHasFiscalSponsor(boolean hasFiscalSponsor) {
        this.hasFiscalSponsor = hasFiscalSponsor;
    }

    public FiscalSponsor getFiscalSponsor() {
        return fiscalSponsor;
    }

    public void setFiscalSponsor(FiscalSponsor fiscalSponsor) {
        this.fiscalSponsor = fiscalSponsor;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public double getTotalAwarded() {
        return totalAwarded;
    }

    public void setTotalAwarded(double totalAwarded) {
        this.totalAwarded = totalAwarded;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public FoundationUser getFoundationPOC() {
        return foundationPOC;
    }

    public void setFoundationPOC(FoundationUser foundationPOC) {
        this.foundationPOC = foundationPOC;
    }

    public String getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(String nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public NonprofitUser getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(NonprofitUser primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Address headquarters) {
        this.headquarters = headquarters;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getGuidestarProfile() {
        return guidestarProfile;
    }

    public void setGuidestarProfile(String guidestarProfile) {
        this.guidestarProfile = guidestarProfile;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public String getIrsDeterminationLetter() {
        return irsDeterminationLetter;
    }

    public void setIrsDeterminationLetter(String irsDeterminationLetter) {
        this.irsDeterminationLetter = irsDeterminationLetter;
    }

    public IrsRecipientStatus getIrsRecipientStatus() {
        return irsRecipientStatus;
    }

    public void setIrsRecipientStatus(IrsRecipientStatus irsRecipientStatus) {
        this.irsRecipientStatus = irsRecipientStatus;
    }

    public Object getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Object customFields) {
        this.customFields = customFields;
    }

    public InteractionAdditionalInfo getInteractionAdditionalInfo() {
        return interactionAdditionalInfo;
    }

    public void setInteractionAdditionalInfo(InteractionAdditionalInfo interactionAdditionalInfo) {
        this.interactionAdditionalInfo = interactionAdditionalInfo;
    }

    public List<FoundationMetadataTag> getColoredTags() {
        return coloredTags;
    }

    public void setColoredTags(List<FoundationMetadataTag> coloredTags) {
        this.coloredTags = coloredTags;
    }

    public OfacFlags getOfacFlags() {
        return ofacFlags;
    }

    public void setOfacFlags(OfacFlags ofacFlags) {
        this.ofacFlags = ofacFlags;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public NonprofitAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(NonprofitAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getOrganizationLogo() {
        return organizationLogo;
    }

    public void setOrganizationLogo(String organizationLogo) {
        this.organizationLogo = organizationLogo;
    }

    public List<CRMSubmissionDetails> getSubmissionDetails() {
        return submissionDetails;
    }

    public void setSubmissionDetails(List<CRMSubmissionDetails> submissionDetails) {
        this.submissionDetails = submissionDetails;
    }
}

public static class FoundationSearchResponseEntity {
    public enum ResponseType {
        NONPROFIT,
        NONPROFIT_USER,
        GRANT_SUBMISSION,
    }
    private ResponseType responseType;
    private FoundationNonprofitMetadata nonprofitMetadata;
    private NonprofitUser nonprofitUser;
    private GrantProposalSubmission submission;

    public FoundationSearchResponseEntity() {}

    public FoundationSearchResponseEntity(ResponseType responseType, FoundationNonprofitMetadata nonprofitMetadata, NonprofitUser nonprofitUser, GrantProposalSubmission submission) {
        this.responseType = responseType;
        this.nonprofitMetadata = nonprofitMetadata;
        this.nonprofitUser = nonprofitUser;
        this.submission = submission;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public FoundationNonprofitMetadata getNonprofitMetadata() {
        return nonprofitMetadata;
    }

    public void setNonprofitMetadata(FoundationNonprofitMetadata nonprofitMetadata) {
        this.nonprofitMetadata = nonprofitMetadata;
    }

    public NonprofitUser getNonprofitUser() {
        return nonprofitUser;
    }

    public void setNonprofitUser(NonprofitUser nonprofitUser) {
        this.nonprofitUser = nonprofitUser;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }
}

public static class AggregateUniversalSearchQuery {
    private List<String> foundationIds;
    private String queryText;

    public AggregateUniversalSearchQuery() {}

    public AggregateUniversalSearchQuery(List<String> foundationIds, String queryText) {
        this.foundationIds = foundationIds;
        this.queryText = queryText;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }
}

public static class AggregateContactResponse {
    private List<AggregateFoundationCRMResponse> foundationContacts;

    public AggregateContactResponse() {}

    public AggregateContactResponse(List<AggregateFoundationCRMResponse> foundationContacts) {
        this.foundationContacts = foundationContacts;
    }

    public List<AggregateFoundationCRMResponse> getFoundationContacts() {
        return foundationContacts;
    }

    public void setFoundationContacts(List<AggregateFoundationCRMResponse> foundationContacts) {
        this.foundationContacts = foundationContacts;
    }
}

public static class AggregateFoundationCRMResponse {
    private Foundation foundation;
    private List<FoundationNonprofitMetadata> responses;

    public AggregateFoundationCRMResponse() {}

    public AggregateFoundationCRMResponse(Foundation foundation, List<FoundationNonprofitMetadata> responses) {
        this.foundation = foundation;
        this.responses = responses;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<FoundationNonprofitMetadata> getResponses() {
        return responses;
    }

    public void setResponses(List<FoundationNonprofitMetadata> responses) {
        this.responses = responses;
    }
}

public static class AggregateContactSearchRequest {
    private List<String> foundationIds;

    public AggregateContactSearchRequest() {}

    public AggregateContactSearchRequest(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }

    public List<String> getFoundationIds() {
        return foundationIds;
    }

    public void setFoundationIds(List<String> foundationIds) {
        this.foundationIds = foundationIds;
    }
}

public static class BoardBook {
    private String id;
    private String name;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private List<String> boardProposalIds;
    private BoardBookSummarySheet summarySheet;
    private boolean active;
    private String created;
    private String updated;
    private Foundation foundation;
    private List<BoardGrantProposal> boardProposals;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;

    public BoardBook() {}

    public BoardBook(String id, String name, String foundationId, String createdBy, String updatedBy, List<String> boardProposalIds, BoardBookSummarySheet summarySheet, boolean active, String created, String updated, Foundation foundation, List<BoardGrantProposal> boardProposals, FoundationUser createdByUser, FoundationUser updatedByUser) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.boardProposalIds = boardProposalIds;
        this.summarySheet = summarySheet;
        this.active = active;
        this.created = created;
        this.updated = updated;
        this.foundation = foundation;
        this.boardProposals = boardProposals;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<String> getBoardProposalIds() {
        return boardProposalIds;
    }

    public void setBoardProposalIds(List<String> boardProposalIds) {
        this.boardProposalIds = boardProposalIds;
    }

    public BoardBookSummarySheet getSummarySheet() {
        return summarySheet;
    }

    public void setSummarySheet(BoardBookSummarySheet summarySheet) {
        this.summarySheet = summarySheet;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<BoardGrantProposal> getBoardProposals() {
        return boardProposals;
    }

    public void setBoardProposals(List<BoardGrantProposal> boardProposals) {
        this.boardProposals = boardProposals;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class BoardBookSummarySheet {
    private List<DocumentItem> columns;

    public BoardBookSummarySheet() {}

    public BoardBookSummarySheet(List<DocumentItem> columns) {
        this.columns = columns;
    }

    public List<DocumentItem> getColumns() {
        return columns;
    }

    public void setColumns(List<DocumentItem> columns) {
        this.columns = columns;
    }
}

public static class BoardGrantProposal {
    private String id;
    private String name;
    private String foundationId;
    private String nonprofitId;
    private String submissionId;
    private String createdBy;
    private String updatedBy;
    private TipTapTextBlock document;
    private BoardGrantProposalAdditionalInfo additionalInfo;
    private String created;
    private String updated;
    private Foundation foundation;
    private Nonprofit nonprofit;
    private GrantProposalSubmission submission;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;
    private BoardBook boardBook;

    public BoardGrantProposal() {}

    public BoardGrantProposal(String id, String name, String foundationId, String nonprofitId, String submissionId, String createdBy, String updatedBy, TipTapTextBlock document, BoardGrantProposalAdditionalInfo additionalInfo, String created, String updated, Foundation foundation, Nonprofit nonprofit, GrantProposalSubmission submission, FoundationUser createdByUser, FoundationUser updatedByUser, BoardBook boardBook) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.submissionId = submissionId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.document = document;
        this.additionalInfo = additionalInfo;
        this.created = created;
        this.updated = updated;
        this.foundation = foundation;
        this.nonprofit = nonprofit;
        this.submission = submission;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.boardBook = boardBook;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public TipTapTextBlock getDocument() {
        return document;
    }

    public void setDocument(TipTapTextBlock document) {
        this.document = document;
    }

    public BoardGrantProposalAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(BoardGrantProposalAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public BoardBook getBoardBook() {
        return boardBook;
    }

    public void setBoardBook(BoardBook boardBook) {
        this.boardBook = boardBook;
    }
}

public static class BoardGeneratorRequest {
    private String templateId;
    private List<String> submissionIds;
    private List<String> nonprofitIds;
    private String boardBookId;

    public BoardGeneratorRequest() {}

    public BoardGeneratorRequest(String templateId, List<String> submissionIds, List<String> nonprofitIds, String boardBookId) {
        this.templateId = templateId;
        this.submissionIds = submissionIds;
        this.nonprofitIds = nonprofitIds;
        this.boardBookId = boardBookId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public List<String> getSubmissionIds() {
        return submissionIds;
    }

    public void setSubmissionIds(List<String> submissionIds) {
        this.submissionIds = submissionIds;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public String getBoardBookId() {
        return boardBookId;
    }

    public void setBoardBookId(String boardBookId) {
        this.boardBookId = boardBookId;
    }
}

public static class BoardProposalValues {
    private String boardProposalId;
    private List<DocumentFieldResponse> documentFieldResponse;

    public BoardProposalValues() {}

    public BoardProposalValues(String boardProposalId, List<DocumentFieldResponse> documentFieldResponse) {
        this.boardProposalId = boardProposalId;
        this.documentFieldResponse = documentFieldResponse;
    }

    public String getBoardProposalId() {
        return boardProposalId;
    }

    public void setBoardProposalId(String boardProposalId) {
        this.boardProposalId = boardProposalId;
    }

    public List<DocumentFieldResponse> getDocumentFieldResponse() {
        return documentFieldResponse;
    }

    public void setDocumentFieldResponse(List<DocumentFieldResponse> documentFieldResponse) {
        this.documentFieldResponse = documentFieldResponse;
    }
}

public static class DocumentFieldResponse {
    private DocumentItem field;
    private String value;

    public DocumentFieldResponse() {}

    public DocumentFieldResponse(DocumentItem field, String value) {
        this.field = field;
        this.value = value;
    }

    public DocumentItem getField() {
        return field;
    }

    public void setField(DocumentItem field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public static class BoardProposalSearchResponse {
    private List<BoardGrantProposal> proposals;
    private int count;

    public BoardProposalSearchResponse() {}

    public BoardProposalSearchResponse(List<BoardGrantProposal> proposals, int count) {
        this.proposals = proposals;
        this.count = count;
    }

    public List<BoardGrantProposal> getProposals() {
        return proposals;
    }

    public void setProposals(List<BoardGrantProposal> proposals) {
        this.proposals = proposals;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public static class BoardProposalSearchQuery {
    private int page;
    private int pageSize;
    private String nonprofitId;

    public BoardProposalSearchQuery() {}

    public BoardProposalSearchQuery(int page, int pageSize, String nonprofitId) {
        this.page = page;
        this.pageSize = pageSize;
        this.nonprofitId = nonprofitId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }
}

public static class AnalyticsField {
    private String key;
    private String displayName;
    public enum Type {
        SUBMISSION,
        NONPROFIT,
        FORM,
        TASK,
    }
    private Type type;
    private AnalyticsFieldSubmissionInfo submissionInfo;
    public enum FormComponentType {
        FILE_UPLOAD,
        FILE_DOWNLOAD,
        SINGLE_RESPONSE,
        MULTI_RESPONSE,
        DROPDOWN_LIST,
        MULTI_DROPDOWN_LIST,
        RATING,
        TEXT,
        SHORT_TEXT,
        FOUNDATION_USER,
        TABLE,
        NUMBER,
        DATE,
        BUDGET_CATEGORY,
        REPORT_TEMPLATE,
        YES_NO_CHECKBOX,
        ORG_LEGAL_NAME,
        ORG_DBA,
        ORG_LEGAL_STATUS,
        ORG_EIN,
        ORG_HQ,
        ORG_HQ_ADDRESS_1,
        ORG_HQ_ADDRESS_2,
        ORG_HQ_CITY,
        ORG_HQ_STATE,
        ORG_HQ_ZIPCODE,
        ORG_HQ_COUNTRY,
        ORG_MAILING_ADDR,
        ORG_MAILING_ADDRESS_1,
        ORG_MAILING_ADDRESS_2,
        ORG_MAILING_CITY,
        ORG_MAILING_STATE,
        ORG_MAILING_ZIPCODE,
        ORG_MAILING_COUNTRY,
        ORG_PHONE_NUMBER,
        ORG_EMAIL,
        ORG_WEBSITE,
        ORG_FISCAL_SPONSOR,
        ORG_HAS_FISCAL_SPONSOR,
        ORG_FISCAL_SPONSOR_NAME,
        ORG_FISCAL_SPONSOR_EIN,
        ORG_FISCAL_SPONSOR_ADDRESS,
        ORG_MISSION,
        ORG_VISION,
        ORG_DEI,
        ORG_FOUNDED_YEAR,
        ORG_EMP_FULL_TIME,
        ORG_EMP_PART_TIME,
        ORG_PRIMARY_CONTACT,
        ORG_PRIMARY_CONTACT_NAME,
        ORG_PRIMARY_CONTACT_EMAIL,
        ORG_PROJECT_DIRECTOR,
        ORG_PROJECT_DIRECTOR_NAME,
        ORG_PROJECT_DIRECTOR_EMAIL,
        ORG_EXECUTIVE,
        ORG_EXECUTIVE_NAME,
        ORG_EXECUTIVE_EMAIL,
        ORG_BUDGET,
        ORG_BUDGET_REVENUE,
        ORG_BUDGET_EXPENDITURES,
        ORG_SOCIAL,
        ORG_SOCIAL_FACEBOOK,
        ORG_SOCIAL_INSTAGRAM,
        ORG_SOCIAL_TWITTER,
        ORG_SOCIAL_LINKEDIN,
        ORG_SOCIAL_GUIDESTAR,
        GRANT_AMOUNT_REQ,
        GRANT_TYPE,
        GRANT_PROJECT_TITLE,
        GRANT_PROJECT_BUDGET,
        GRANT_CO_FUNDING,
        GRANT_PERIOD,
        GRANT_PERIOD_START,
        GRANT_PERIOD_END,
        GRANT_PROP_TITLE,
        GRANT_RELEVANCY,
        GRANT_AREA,
        GRANT_AREA_CITY,
        GRANT_AREA_STATE,
        GRANT_AREA_COUNTRY,
        GRANT_POP_SERVED,
        PAGE_DIVIDER,
        TEXT_DESCRIPTION,
        FORMATTED_TEXT,
        CURRENCY,
        EXTERNAL_REFERENCES,
    }
    private FormComponentType formComponentType;

    public AnalyticsField() {}

    public AnalyticsField(String key, String displayName, Type type, AnalyticsFieldSubmissionInfo submissionInfo, FormComponentType formComponentType) {
        this.key = key;
        this.displayName = displayName;
        this.type = type;
        this.submissionInfo = submissionInfo;
        this.formComponentType = formComponentType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AnalyticsFieldSubmissionInfo getSubmissionInfo() {
        return submissionInfo;
    }

    public void setSubmissionInfo(AnalyticsFieldSubmissionInfo submissionInfo) {
        this.submissionInfo = submissionInfo;
    }

    public FormComponentType getFormComponentType() {
        return formComponentType;
    }

    public void setFormComponentType(FormComponentType formComponentType) {
        this.formComponentType = formComponentType;
    }
}

public static class AnalyticsFieldSubmissionInfo {
    private String formName;
    private String submissionName;

    public AnalyticsFieldSubmissionInfo() {}

    public AnalyticsFieldSubmissionInfo(String formName, String submissionName) {
        this.formName = formName;
        this.submissionName = submissionName;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getSubmissionName() {
        return submissionName;
    }

    public void setSubmissionName(String submissionName) {
        this.submissionName = submissionName;
    }
}

public static class DataSearchQuery {
    public enum ReportType {
        PAYMENTS,
        SUBMISSIONS,
        DOLLARS_BY_BUDGET_CATEGORY,
        DOLLARS_BY_ORGANIZATION_TAGS,
        FULL_GRANTS_LIST,
        FULL_GRANTEE_CONTACT_LIST,
        ALL_DATA,
        REPORTS,
        REVIEW_TASKS,
        EXTERNAL_REVIEWER_TASKS,
        CONTACT_LIST,
        IRS_990_REPORT,
        CANDID_DEMOGRAPHICS,
        CRM_PROFILE,
        DONOR_MANAGEMENT_REPORT,
        DONOR_CONTRIBUTION,
    }
    private ReportType reportType;
    private int page;
    private int pageSize;

    public DataSearchQuery() {}

    public DataSearchQuery(ReportType reportType, int page, int pageSize) {
        this.reportType = reportType;
        this.page = page;
        this.pageSize = pageSize;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

public static class AnalyticsFieldPaymentResponse {
    private List<AnalyticsFieldValue> fieldValues;
    private double total;
    private List<NonprofitAmount> payments;

    public AnalyticsFieldPaymentResponse() {}

    public AnalyticsFieldPaymentResponse(List<AnalyticsFieldValue> fieldValues, double total, List<NonprofitAmount> payments) {
        this.fieldValues = fieldValues;
        this.total = total;
        this.payments = payments;
    }

    public List<AnalyticsFieldValue> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(List<AnalyticsFieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<NonprofitAmount> getPayments() {
        return payments;
    }

    public void setPayments(List<NonprofitAmount> payments) {
        this.payments = payments;
    }
}

public static class AnalyticsFieldValue {
    private AnalyticsField analyticsField;
    private String response;

    public AnalyticsFieldValue() {}

    public AnalyticsFieldValue(AnalyticsField analyticsField, String response) {
        this.analyticsField = analyticsField;
        this.response = response;
    }

    public AnalyticsField getAnalyticsField() {
        return analyticsField;
    }

    public void setAnalyticsField(AnalyticsField analyticsField) {
        this.analyticsField = analyticsField;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

public static class AnalyticsFieldYOYData {
    private List<AnalyticsFieldValue> fieldValues;
    private List<YearlyData> yearlyData;

    public AnalyticsFieldYOYData() {}

    public AnalyticsFieldYOYData(List<AnalyticsFieldValue> fieldValues, List<YearlyData> yearlyData) {
        this.fieldValues = fieldValues;
        this.yearlyData = yearlyData;
    }

    public List<AnalyticsFieldValue> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(List<AnalyticsFieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public List<YearlyData> getYearlyData() {
        return yearlyData;
    }

    public void setYearlyData(List<YearlyData> yearlyData) {
        this.yearlyData = yearlyData;
    }
}

public static class AnalyticsResponse {
    private List<AnalyticsFieldPaymentResponse> payments;
    private AnalyticsPaymentYOYData yoyPayments;

    public AnalyticsResponse() {}

    public AnalyticsResponse(List<AnalyticsFieldPaymentResponse> payments, AnalyticsPaymentYOYData yoyPayments) {
        this.payments = payments;
        this.yoyPayments = yoyPayments;
    }

    public List<AnalyticsFieldPaymentResponse> getPayments() {
        return payments;
    }

    public void setPayments(List<AnalyticsFieldPaymentResponse> payments) {
        this.payments = payments;
    }

    public AnalyticsPaymentYOYData getYoyPayments() {
        return yoyPayments;
    }

    public void setYoyPayments(AnalyticsPaymentYOYData yoyPayments) {
        this.yoyPayments = yoyPayments;
    }
}

public static class AnalyticsRequest {
    public enum Type {
        PAYMENT,
        SUBMISSION,
    }
    private Type type;
    private List<AnalyticsField> fields;

    public AnalyticsRequest() {}

    public AnalyticsRequest(Type type, List<AnalyticsField> fields) {
        this.type = type;
        this.fields = fields;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<AnalyticsField> getFields() {
        return fields;
    }

    public void setFields(List<AnalyticsField> fields) {
        this.fields = fields;
    }
}

public static class DocumentTemplate {
    private String id;
    private String name;
    public enum Type {
        SYSTEM,
        USER,
    }
    private Type type;
    public enum DocumentType {
        BOARD_TEMPLATE,
        AGREEMENT_TEMPLATE,
    }
    private DocumentType documentType;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private TipTapTextBlock document;
    private DocumentTemplateAdditionalInfo additionalInfo;
    private String created;
    private String updated;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;

    public DocumentTemplate() {}

    public DocumentTemplate(String id, String name, Type type, DocumentType documentType, String foundationId, String createdBy, String updatedBy, TipTapTextBlock document, DocumentTemplateAdditionalInfo additionalInfo, String created, String updated, FoundationUser createdByUser, FoundationUser updatedByUser) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.documentType = documentType;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.document = document;
        this.additionalInfo = additionalInfo;
        this.created = created;
        this.updated = updated;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public TipTapTextBlock getDocument() {
        return document;
    }

    public void setDocument(TipTapTextBlock document) {
        this.document = document;
    }

    public DocumentTemplateAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(DocumentTemplateAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class DocumentTemplateAdditionalInfo {
    private PDFDocumentDisplay pdfDocumentDisplay;

    public DocumentTemplateAdditionalInfo() {}

    public DocumentTemplateAdditionalInfo(PDFDocumentDisplay pdfDocumentDisplay) {
        this.pdfDocumentDisplay = pdfDocumentDisplay;
    }

    public PDFDocumentDisplay getPdfDocumentDisplay() {
        return pdfDocumentDisplay;
    }

    public void setPdfDocumentDisplay(PDFDocumentDisplay pdfDocumentDisplay) {
        this.pdfDocumentDisplay = pdfDocumentDisplay;
    }
}

public static class AccountInfo {
    private String accountId;
    private String accountName;
    private String baseURI;
    private boolean _default;

    public AccountInfo() {}

    public AccountInfo(String accountId, String accountName, String baseURI, boolean _default) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.baseURI = baseURI;
        this._default = _default;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public boolean get_default() {
        return _default;
    }

    public void set_default(boolean _default) {
        this._default = _default;
    }
}

public static class DocusignSenderViewResponse {
    private String url;

    public DocusignSenderViewResponse() {}

    public DocusignSenderViewResponse(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class EnvelopeRecipient {
    private String email;
    private String name;

    public EnvelopeRecipient() {}

    public EnvelopeRecipient(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public static class EnvelopeSendRequest {
    private String taskId;
    private String documentTitle;
    private List<EnvelopeRecipient> recipients;
    private String returnUri;

    public EnvelopeSendRequest() {}

    public EnvelopeSendRequest(String taskId, String documentTitle, List<EnvelopeRecipient> recipients, String returnUri) {
        this.taskId = taskId;
        this.documentTitle = documentTitle;
        this.recipients = recipients;
        this.returnUri = returnUri;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDocumentTitle() {
        return documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }

    public List<EnvelopeRecipient> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<EnvelopeRecipient> recipients) {
        this.recipients = recipients;
    }

    public String getReturnUri() {
        return returnUri;
    }

    public void setReturnUri(String returnUri) {
        this.returnUri = returnUri;
    }
}

public static class DocusignAdditionalInfo {

    public DocusignAdditionalInfo() {}
}

public static class DocusignEnvelope {
    private String envelopeId;
    private String accountId;
    private String userId;
    private String foundationId;
    public enum Status {
        CREATED,
        SENT,
        SIGNED,
        DOWNLOADED,
        DECLINED,
    }
    private Status status;
    private List<String> files;
    private Envelope metadata;
    private DocusignAdditionalInfo additionalInfo;
    private String created;
    private String updated;

    public DocusignEnvelope() {}

    public DocusignEnvelope(String envelopeId, String accountId, String userId, String foundationId, Status status, List<String> files, Envelope metadata, DocusignAdditionalInfo additionalInfo, String created, String updated) {
        this.envelopeId = envelopeId;
        this.accountId = accountId;
        this.userId = userId;
        this.foundationId = foundationId;
        this.status = status;
        this.files = files;
        this.metadata = metadata;
        this.additionalInfo = additionalInfo;
        this.created = created;
        this.updated = updated;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    public Envelope getMetadata() {
        return metadata;
    }

    public void setMetadata(Envelope metadata) {
        this.metadata = metadata;
    }

    public DocusignAdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(DocusignAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class Envelope {
    private String status;
    private String documentsUri;
    private String recipientsUri;
    private String attachmentsUri;
    private String envelopeUri;
    private String emailSubject;
    private String emailBlurb;
    private String envelopeId;
    private String signingLocation;
    private String customFieldsUri;
    private String createdDateTime;
    private String lastModifiedDateTime;
    private String deliveredDateTime;
    private String initialSentDateTime;
    private String sentDateTime;
    private String completedDateTime;
    private String voidedDateTime;
    private String voidedReason;
    private String deletedDateTime;
    private String declinedDateTime;
    private String statusChangedDateTime;
    private String documentsCombinedUri;
    private String certificateUri;
    private String templatesUri;
    private Recipients recipients;
    private Sender sender;
    private Object rawData;

    public Envelope() {}

    public Envelope(String status, String documentsUri, String recipientsUri, String attachmentsUri, String envelopeUri, String emailSubject, String emailBlurb, String envelopeId, String signingLocation, String customFieldsUri, String createdDateTime, String lastModifiedDateTime, String deliveredDateTime, String initialSentDateTime, String sentDateTime, String completedDateTime, String voidedDateTime, String voidedReason, String deletedDateTime, String declinedDateTime, String statusChangedDateTime, String documentsCombinedUri, String certificateUri, String templatesUri, Recipients recipients, Sender sender, Object rawData) {
        this.status = status;
        this.documentsUri = documentsUri;
        this.recipientsUri = recipientsUri;
        this.attachmentsUri = attachmentsUri;
        this.envelopeUri = envelopeUri;
        this.emailSubject = emailSubject;
        this.emailBlurb = emailBlurb;
        this.envelopeId = envelopeId;
        this.signingLocation = signingLocation;
        this.customFieldsUri = customFieldsUri;
        this.createdDateTime = createdDateTime;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.deliveredDateTime = deliveredDateTime;
        this.initialSentDateTime = initialSentDateTime;
        this.sentDateTime = sentDateTime;
        this.completedDateTime = completedDateTime;
        this.voidedDateTime = voidedDateTime;
        this.voidedReason = voidedReason;
        this.deletedDateTime = deletedDateTime;
        this.declinedDateTime = declinedDateTime;
        this.statusChangedDateTime = statusChangedDateTime;
        this.documentsCombinedUri = documentsCombinedUri;
        this.certificateUri = certificateUri;
        this.templatesUri = templatesUri;
        this.recipients = recipients;
        this.sender = sender;
        this.rawData = rawData;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocumentsUri() {
        return documentsUri;
    }

    public void setDocumentsUri(String documentsUri) {
        this.documentsUri = documentsUri;
    }

    public String getRecipientsUri() {
        return recipientsUri;
    }

    public void setRecipientsUri(String recipientsUri) {
        this.recipientsUri = recipientsUri;
    }

    public String getAttachmentsUri() {
        return attachmentsUri;
    }

    public void setAttachmentsUri(String attachmentsUri) {
        this.attachmentsUri = attachmentsUri;
    }

    public String getEnvelopeUri() {
        return envelopeUri;
    }

    public void setEnvelopeUri(String envelopeUri) {
        this.envelopeUri = envelopeUri;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBlurb() {
        return emailBlurb;
    }

    public void setEmailBlurb(String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getSigningLocation() {
        return signingLocation;
    }

    public void setSigningLocation(String signingLocation) {
        this.signingLocation = signingLocation;
    }

    public String getCustomFieldsUri() {
        return customFieldsUri;
    }

    public void setCustomFieldsUri(String customFieldsUri) {
        this.customFieldsUri = customFieldsUri;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public String getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(String deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }

    public String getInitialSentDateTime() {
        return initialSentDateTime;
    }

    public void setInitialSentDateTime(String initialSentDateTime) {
        this.initialSentDateTime = initialSentDateTime;
    }

    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }

    public String getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(String completedDateTime) {
        this.completedDateTime = completedDateTime;
    }

    public String getVoidedDateTime() {
        return voidedDateTime;
    }

    public void setVoidedDateTime(String voidedDateTime) {
        this.voidedDateTime = voidedDateTime;
    }

    public String getVoidedReason() {
        return voidedReason;
    }

    public void setVoidedReason(String voidedReason) {
        this.voidedReason = voidedReason;
    }

    public String getDeletedDateTime() {
        return deletedDateTime;
    }

    public void setDeletedDateTime(String deletedDateTime) {
        this.deletedDateTime = deletedDateTime;
    }

    public String getDeclinedDateTime() {
        return declinedDateTime;
    }

    public void setDeclinedDateTime(String declinedDateTime) {
        this.declinedDateTime = declinedDateTime;
    }

    public String getStatusChangedDateTime() {
        return statusChangedDateTime;
    }

    public void setStatusChangedDateTime(String statusChangedDateTime) {
        this.statusChangedDateTime = statusChangedDateTime;
    }

    public String getDocumentsCombinedUri() {
        return documentsCombinedUri;
    }

    public void setDocumentsCombinedUri(String documentsCombinedUri) {
        this.documentsCombinedUri = documentsCombinedUri;
    }

    public String getCertificateUri() {
        return certificateUri;
    }

    public void setCertificateUri(String certificateUri) {
        this.certificateUri = certificateUri;
    }

    public String getTemplatesUri() {
        return templatesUri;
    }

    public void setTemplatesUri(String templatesUri) {
        this.templatesUri = templatesUri;
    }

    public Recipients getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipients recipients) {
        this.recipients = recipients;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Object getRawData() {
        return rawData;
    }

    public void setRawData(Object rawData) {
        this.rawData = rawData;
    }
}

public static class Recipients {
    private List<Signer> signers;

    public Recipients() {}

    public Recipients(List<Signer> signers) {
        this.signers = signers;
    }

    public List<Signer> getSigners() {
        return signers;
    }

    public void setSigners(List<Signer> signers) {
        this.signers = signers;
    }
}

public static class Sender {
    private String userName;
    private String userId;
    private String accountId;
    private String email;

    public Sender() {}

    public Sender(String userName, String userId, String accountId, String email) {
        this.userName = userName;
        this.userId = userId;
        this.accountId = accountId;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public static class Signer {
    private String name;
    private String email;
    private int recipientId;
    private String fullName;
    private String firstName;
    private String lastName;
    private String status;
    private String signedDateTime;
    private String sentDateTime;
    private String deliveredDateTime;
    private String declinedDateTime;

    public Signer() {}

    public Signer(String name, String email, int recipientId, String fullName, String firstName, String lastName, String status, String signedDateTime, String sentDateTime, String deliveredDateTime, String declinedDateTime) {
        this.name = name;
        this.email = email;
        this.recipientId = recipientId;
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.signedDateTime = signedDateTime;
        this.sentDateTime = sentDateTime;
        this.deliveredDateTime = deliveredDateTime;
        this.declinedDateTime = declinedDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSignedDateTime() {
        return signedDateTime;
    }

    public void setSignedDateTime(String signedDateTime) {
        this.signedDateTime = signedDateTime;
    }

    public String getSentDateTime() {
        return sentDateTime;
    }

    public void setSentDateTime(String sentDateTime) {
        this.sentDateTime = sentDateTime;
    }

    public String getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(String deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }

    public String getDeclinedDateTime() {
        return declinedDateTime;
    }

    public void setDeclinedDateTime(String declinedDateTime) {
        this.declinedDateTime = declinedDateTime;
    }
}

public static class DocusignLoginURL {
    private String url;

    public DocusignLoginURL() {}

    public DocusignLoginURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class DocusignLoginRequest {
    private String redirectURI;

    public DocusignLoginRequest() {}

    public DocusignLoginRequest(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    public String getRedirectURI() {
        return redirectURI;
    }

    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }
}

public static class DonorRelationshipType {
    private String name;
    private Object fields;

    public DonorRelationshipType() {}

    public DonorRelationshipType(String name, Object fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFields() {
        return fields;
    }

    public void setFields(Object fields) {
        this.fields = fields;
    }
}

public static class DonorEntityType {
    private String name;
    private Object fields;

    public DonorEntityType() {}

    public DonorEntityType(String name, Object fields) {
        this.name = name;
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getFields() {
        return fields;
    }

    public void setFields(Object fields) {
        this.fields = fields;
    }
}

public static class EligibilityConfiguration {
    private boolean requireLogin;
    private String associatedGrantProposalId;
    private TipTapTextBlock acceptMessage;
    private TipTapTextBlock rejectMessage;
    private boolean saveToDocuments;
    private EligibilityEmailTemplate acceptEmail;
    private EligibilityEmailTemplate rejectEmail;

    public EligibilityConfiguration() {}

    public EligibilityConfiguration(boolean requireLogin, String associatedGrantProposalId, TipTapTextBlock acceptMessage, TipTapTextBlock rejectMessage, boolean saveToDocuments, EligibilityEmailTemplate acceptEmail, EligibilityEmailTemplate rejectEmail) {
        this.requireLogin = requireLogin;
        this.associatedGrantProposalId = associatedGrantProposalId;
        this.acceptMessage = acceptMessage;
        this.rejectMessage = rejectMessage;
        this.saveToDocuments = saveToDocuments;
        this.acceptEmail = acceptEmail;
        this.rejectEmail = rejectEmail;
    }

    public boolean getRequireLogin() {
        return requireLogin;
    }

    public void setRequireLogin(boolean requireLogin) {
        this.requireLogin = requireLogin;
    }

    public String getAssociatedGrantProposalId() {
        return associatedGrantProposalId;
    }

    public void setAssociatedGrantProposalId(String associatedGrantProposalId) {
        this.associatedGrantProposalId = associatedGrantProposalId;
    }

    public TipTapTextBlock getAcceptMessage() {
        return acceptMessage;
    }

    public void setAcceptMessage(TipTapTextBlock acceptMessage) {
        this.acceptMessage = acceptMessage;
    }

    public TipTapTextBlock getRejectMessage() {
        return rejectMessage;
    }

    public void setRejectMessage(TipTapTextBlock rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    public boolean getSaveToDocuments() {
        return saveToDocuments;
    }

    public void setSaveToDocuments(boolean saveToDocuments) {
        this.saveToDocuments = saveToDocuments;
    }

    public EligibilityEmailTemplate getAcceptEmail() {
        return acceptEmail;
    }

    public void setAcceptEmail(EligibilityEmailTemplate acceptEmail) {
        this.acceptEmail = acceptEmail;
    }

    public EligibilityEmailTemplate getRejectEmail() {
        return rejectEmail;
    }

    public void setRejectEmail(EligibilityEmailTemplate rejectEmail) {
        this.rejectEmail = rejectEmail;
    }
}

public static class EligibilityEmailTemplate {
    private String subjectText;
    private String messageText;
    private String ccEmail;

    public EligibilityEmailTemplate() {}

    public EligibilityEmailTemplate(String subjectText, String messageText, String ccEmail) {
        this.subjectText = subjectText;
        this.messageText = messageText;
        this.ccEmail = ccEmail;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }
}

public static class EligibilityForm {
    private String id;
    private String name;
    private String foundationId;
    private List<FormItem> content;
    private EligibilityConfiguration configuration;
    private String created;
    private String updated;
    private String createdBy;
    private String updatedBy;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;
    private Foundation foundation;
    private GrantFormProposal grantFormProposal;

    public EligibilityForm() {}

    public EligibilityForm(String id, String name, String foundationId, List<FormItem> content, EligibilityConfiguration configuration, String created, String updated, String createdBy, String updatedBy, FoundationUser createdByUser, FoundationUser updatedByUser, Foundation foundation, GrantFormProposal grantFormProposal) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.content = content;
        this.configuration = configuration;
        this.created = created;
        this.updated = updated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.foundation = foundation;
        this.grantFormProposal = grantFormProposal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public List<FormItem> getContent() {
        return content;
    }

    public void setContent(List<FormItem> content) {
        this.content = content;
    }

    public EligibilityConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(EligibilityConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public GrantFormProposal getGrantFormProposal() {
        return grantFormProposal;
    }

    public void setGrantFormProposal(GrantFormProposal grantFormProposal) {
        this.grantFormProposal = grantFormProposal;
    }
}

public static class UniversalForm {
    private String id;
    private String foundationId;
    public enum UniversalFormType {
        GRANT_FORM,
        ELIGIBILITY,
    }
    private UniversalFormType universalFormType;
    private String name;
    private GrantFormProposal grantFormProposal;
    private EligibilityForm eligibilityForm;
    private String created;
    private String updated;
    private String createdBy;
    private String updatedBy;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;

    public UniversalForm() {}

    public UniversalForm(String id, String foundationId, UniversalFormType universalFormType, String name, GrantFormProposal grantFormProposal, EligibilityForm eligibilityForm, String created, String updated, String createdBy, String updatedBy, FoundationUser createdByUser, FoundationUser updatedByUser) {
        this.id = id;
        this.foundationId = foundationId;
        this.universalFormType = universalFormType;
        this.name = name;
        this.grantFormProposal = grantFormProposal;
        this.eligibilityForm = eligibilityForm;
        this.created = created;
        this.updated = updated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public UniversalFormType getUniversalFormType() {
        return universalFormType;
    }

    public void setUniversalFormType(UniversalFormType universalFormType) {
        this.universalFormType = universalFormType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GrantFormProposal getGrantFormProposal() {
        return grantFormProposal;
    }

    public void setGrantFormProposal(GrantFormProposal grantFormProposal) {
        this.grantFormProposal = grantFormProposal;
    }

    public EligibilityForm getEligibilityForm() {
        return eligibilityForm;
    }

    public void setEligibilityForm(EligibilityForm eligibilityForm) {
        this.eligibilityForm = eligibilityForm;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class ExternalReviewerDashboard {
    private List<Task> tasks;
    private List<TaskSubmission> taskResponses;

    public ExternalReviewerDashboard() {}

    public ExternalReviewerDashboard(List<Task> tasks, List<TaskSubmission> taskResponses) {
        this.tasks = tasks;
        this.taskResponses = taskResponses;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<TaskSubmission> getTaskResponses() {
        return taskResponses;
    }

    public void setTaskResponses(List<TaskSubmission> taskResponses) {
        this.taskResponses = taskResponses;
    }
}

public static class TaskSubmission {
    private String id;
    private String taskId;
    private String createdBy;
    private String updatedBy;
    private List<FormItemResponseEntity> response;
    private String created;
    private String updated;
    public enum TaskStatus {
        DRAFT,
        OPEN,
        RESOLVED,
        CLOSED,
    }
    private TaskStatus taskStatus;

    public TaskSubmission() {}

    public TaskSubmission(String id, String taskId, String createdBy, String updatedBy, List<FormItemResponseEntity> response, String created, String updated, TaskStatus taskStatus) {
        this.id = id;
        this.taskId = taskId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.response = response;
        this.created = created;
        this.updated = updated;
        this.taskStatus = taskStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<FormItemResponseEntity> getResponse() {
        return response;
    }

    public void setResponse(List<FormItemResponseEntity> response) {
        this.response = response;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}

public static class AssignExternalReviewerRequest {
    private List<String> externalReviewers;
    private List<String> submissionIds;
    private String deadline;
    private boolean createUniqueTasks;
    private String taskTemplateId;

    public AssignExternalReviewerRequest() {}

    public AssignExternalReviewerRequest(List<String> externalReviewers, List<String> submissionIds, String deadline, boolean createUniqueTasks, String taskTemplateId) {
        this.externalReviewers = externalReviewers;
        this.submissionIds = submissionIds;
        this.deadline = deadline;
        this.createUniqueTasks = createUniqueTasks;
        this.taskTemplateId = taskTemplateId;
    }

    public List<String> getExternalReviewers() {
        return externalReviewers;
    }

    public void setExternalReviewers(List<String> externalReviewers) {
        this.externalReviewers = externalReviewers;
    }

    public List<String> getSubmissionIds() {
        return submissionIds;
    }

    public void setSubmissionIds(List<String> submissionIds) {
        this.submissionIds = submissionIds;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public boolean getCreateUniqueTasks() {
        return createUniqueTasks;
    }

    public void setCreateUniqueTasks(boolean createUniqueTasks) {
        this.createUniqueTasks = createUniqueTasks;
    }

    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }
}

public static class FileMeta {
    private String fileId;
    private String fileName;
    private String foundationId;
    private String nonprofitId;
    private String donorEntityId;
    public enum FileSourceType {
        CRM,
        GRANT_APPLICATION,
        GRANT_FORM_PROPOSAL,
        TASK,
        SETTINGS,
    }
    private FileSourceType fileSourceType;
    private String taskId;
    private String fileSourceId;
    private String folderId;
    private boolean active;

    public FileMeta() {}

    public FileMeta(String fileId, String fileName, String foundationId, String nonprofitId, String donorEntityId, FileSourceType fileSourceType, String taskId, String fileSourceId, String folderId, boolean active) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.donorEntityId = donorEntityId;
        this.fileSourceType = fileSourceType;
        this.taskId = taskId;
        this.fileSourceId = fileSourceId;
        this.folderId = folderId;
        this.active = active;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getDonorEntityId() {
        return donorEntityId;
    }

    public void setDonorEntityId(String donorEntityId) {
        this.donorEntityId = donorEntityId;
    }

    public FileSourceType getFileSourceType() {
        return fileSourceType;
    }

    public void setFileSourceType(FileSourceType fileSourceType) {
        this.fileSourceType = fileSourceType;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getFileSourceId() {
        return fileSourceId;
    }

    public void setFileSourceId(String fileSourceId) {
        this.fileSourceId = fileSourceId;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

public static class FileCopyPair {
    private String sourceFileId;
    private String destFileId;

    public FileCopyPair() {}

    public FileCopyPair(String sourceFileId, String destFileId) {
        this.sourceFileId = sourceFileId;
        this.destFileId = destFileId;
    }

    public String getSourceFileId() {
        return sourceFileId;
    }

    public void setSourceFileId(String sourceFileId) {
        this.sourceFileId = sourceFileId;
    }

    public String getDestFileId() {
        return destFileId;
    }

    public void setDestFileId(String destFileId) {
        this.destFileId = destFileId;
    }
}

public static class Folder {
    private String id;
    private String displayName;
    private String foundationId;
    private String nonprofitId;
    private String donorEntityId;
    private boolean active;
    private String createdBy;
    private String updatedBy;
    private String created;
    private String updated;
    private String folderId;

    public Folder() {}

    public Folder(String id, String displayName, String foundationId, String nonprofitId, String donorEntityId, boolean active, String createdBy, String updatedBy, String created, String updated, String folderId) {
        this.id = id;
        this.displayName = displayName;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.donorEntityId = donorEntityId;
        this.active = active;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.created = created;
        this.updated = updated;
        this.folderId = folderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getDonorEntityId() {
        return donorEntityId;
    }

    public void setDonorEntityId(String donorEntityId) {
        this.donorEntityId = donorEntityId;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}

public static class AdditionalFilterInfo {
    public enum DataReportType {
        PAYMENTS,
        SUBMISSIONS,
        DOLLARS_BY_BUDGET_CATEGORY,
        DOLLARS_BY_ORGANIZATION_TAGS,
        FULL_GRANTS_LIST,
        FULL_GRANTEE_CONTACT_LIST,
        ALL_DATA,
        REPORTS,
        REVIEW_TASKS,
        EXTERNAL_REVIEWER_TASKS,
        CONTACT_LIST,
        IRS_990_REPORT,
        CANDID_DEMOGRAPHICS,
        CRM_PROFILE,
        DONOR_MANAGEMENT_REPORT,
        DONOR_CONTRIBUTION,
    }
    private DataReportType dataReportType;

    public AdditionalFilterInfo() {}

    public AdditionalFilterInfo(DataReportType dataReportType) {
        this.dataReportType = dataReportType;
    }

    public DataReportType getDataReportType() {
        return dataReportType;
    }

    public void setDataReportType(DataReportType dataReportType) {
        this.dataReportType = dataReportType;
    }
}

public static class FilterView {
    private String id;
    private String name;
    private String foundationId;
    public enum Page {
        CRM,
        PROPOSALS,
        DATA,
    }
    private Page page;
    private String pipelineId;
    private String stageId;
    private FilterViewSettings settings;
    private String updatedAt;
    private String updatedById;
    private String createdAt;
    private String createdById;
    private double index;

    public FilterView() {}

    public FilterView(String id, String name, String foundationId, Page page, String pipelineId, String stageId, FilterViewSettings settings, String updatedAt, String updatedById, String createdAt, String createdById, double index) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.page = page;
        this.pipelineId = pipelineId;
        this.stageId = stageId;
        this.settings = settings;
        this.updatedAt = updatedAt;
        this.updatedById = updatedById;
        this.createdAt = createdAt;
        this.createdById = createdById;
        this.index = index;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public FilterViewSettings getSettings() {
        return settings;
    }

    public void setSettings(FilterViewSettings settings) {
        this.settings = settings;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }
}

public static class FilterViewCondition {
    private String key;
    private String filterType;
    public enum Type {
        equals,
        notEqual,
        contains,
        notContains,
        blank,
        notBlank,
        startsWith,
        endsWith,
        inRange,
        lessThan,
        lessThanOrEqual,
        greaterThan,
        greaterThanOrEqual,
    }
    private Type type;
    private String filter;
    private String dateFrom;
    private String dateTo;

    public FilterViewCondition() {}

    public FilterViewCondition(String key, String filterType, Type type, String filter, String dateFrom, String dateTo) {
        this.key = key;
        this.filterType = filterType;
        this.type = type;
        this.filter = filter;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
}

public static class FilterViewFilter {
    private String key;
    private String id;
    private String filterType;
    private String operator;
    private List<FilterViewCondition> conditions;

    public FilterViewFilter() {}

    public FilterViewFilter(String key, String id, String filterType, String operator, List<FilterViewCondition> conditions) {
        this.key = key;
        this.id = id;
        this.filterType = filterType;
        this.operator = operator;
        this.conditions = conditions;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<FilterViewCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<FilterViewCondition> conditions) {
        this.conditions = conditions;
    }
}

public static class FilterViewRename {
    private String key;
    private String id;
    private String value;

    public FilterViewRename() {}

    public FilterViewRename(String key, String id, String value) {
        this.key = key;
        this.id = id;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public static class FilterViewSettings {
    private List<FilterViewSorting> sorting;
    private boolean assignedToMe;
    private List<FilterViewVisibility> visibility;
    private List<FilterViewRename> rename;
    private List<FilterViewFilter> filter;
    private AdditionalFilterInfo additionalFilterInfo;

    public FilterViewSettings() {}

    public FilterViewSettings(List<FilterViewSorting> sorting, boolean assignedToMe, List<FilterViewVisibility> visibility, List<FilterViewRename> rename, List<FilterViewFilter> filter, AdditionalFilterInfo additionalFilterInfo) {
        this.sorting = sorting;
        this.assignedToMe = assignedToMe;
        this.visibility = visibility;
        this.rename = rename;
        this.filter = filter;
        this.additionalFilterInfo = additionalFilterInfo;
    }

    public List<FilterViewSorting> getSorting() {
        return sorting;
    }

    public void setSorting(List<FilterViewSorting> sorting) {
        this.sorting = sorting;
    }

    public boolean getAssignedToMe() {
        return assignedToMe;
    }

    public void setAssignedToMe(boolean assignedToMe) {
        this.assignedToMe = assignedToMe;
    }

    public List<FilterViewVisibility> getVisibility() {
        return visibility;
    }

    public void setVisibility(List<FilterViewVisibility> visibility) {
        this.visibility = visibility;
    }

    public List<FilterViewRename> getRename() {
        return rename;
    }

    public void setRename(List<FilterViewRename> rename) {
        this.rename = rename;
    }

    public List<FilterViewFilter> getFilter() {
        return filter;
    }

    public void setFilter(List<FilterViewFilter> filter) {
        this.filter = filter;
    }

    public AdditionalFilterInfo getAdditionalFilterInfo() {
        return additionalFilterInfo;
    }

    public void setAdditionalFilterInfo(AdditionalFilterInfo additionalFilterInfo) {
        this.additionalFilterInfo = additionalFilterInfo;
    }
}

public static class FilterViewSorting {
    private String key;
    private String id;
    private boolean descending;

    public FilterViewSorting() {}

    public FilterViewSorting(String key, String id, boolean descending) {
        this.key = key;
        this.id = id;
        this.descending = descending;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getDescending() {
        return descending;
    }

    public void setDescending(boolean descending) {
        this.descending = descending;
    }
}

public static class FilterViewVisibility {
    private String key;
    private String id;
    private boolean value;

    public FilterViewVisibility() {}

    public FilterViewVisibility(String key, String id, boolean value) {
        this.key = key;
        this.id = id;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}

public static class EligibilityFormResponses {
    private String eligibilityFormId;
    private String nonprofitId;
    private List<FormItemResponseEntity> responses;

    public EligibilityFormResponses() {}

    public EligibilityFormResponses(String eligibilityFormId, String nonprofitId, List<FormItemResponseEntity> responses) {
        this.eligibilityFormId = eligibilityFormId;
        this.nonprofitId = nonprofitId;
        this.responses = responses;
    }

    public String getEligibilityFormId() {
        return eligibilityFormId;
    }

    public void setEligibilityFormId(String eligibilityFormId) {
        this.eligibilityFormId = eligibilityFormId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }
}

public static class NonprofitGrantPair {
    private Nonprofit nonprofit;
    private List<NonprofitGrantSubmission> nonprofitGrantSubmissions;

    public NonprofitGrantPair() {}

    public NonprofitGrantPair(Nonprofit nonprofit, List<NonprofitGrantSubmission> nonprofitGrantSubmissions) {
        this.nonprofit = nonprofit;
        this.nonprofitGrantSubmissions = nonprofitGrantSubmissions;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public List<NonprofitGrantSubmission> getNonprofitGrantSubmissions() {
        return nonprofitGrantSubmissions;
    }

    public void setNonprofitGrantSubmissions(List<NonprofitGrantSubmission> nonprofitGrantSubmissions) {
        this.nonprofitGrantSubmissions = nonprofitGrantSubmissions;
    }
}

public static class NonprofitGrantSubmission {
    private GrantFormProposal formProposal;
    private GrantProposalSubmission submission;
    private String logoFileUrl;
    private String foundationColor;

    public NonprofitGrantSubmission() {}

    public NonprofitGrantSubmission(GrantFormProposal formProposal, GrantProposalSubmission submission, String logoFileUrl, String foundationColor) {
        this.formProposal = formProposal;
        this.submission = submission;
        this.logoFileUrl = logoFileUrl;
        this.foundationColor = foundationColor;
    }

    public GrantFormProposal getFormProposal() {
        return formProposal;
    }

    public void setFormProposal(GrantFormProposal formProposal) {
        this.formProposal = formProposal;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }

    public String getLogoFileUrl() {
        return logoFileUrl;
    }

    public void setLogoFileUrl(String logoFileUrl) {
        this.logoFileUrl = logoFileUrl;
    }

    public String getFoundationColor() {
        return foundationColor;
    }

    public void setFoundationColor(String foundationColor) {
        this.foundationColor = foundationColor;
    }
}

public static class GrantEligibilityResponse {
    private List<FormItemResponseEntity> responses;

    public GrantEligibilityResponse() {}

    public GrantEligibilityResponse(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }

    public List<FormItemResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FormItemResponseEntity> responses) {
        this.responses = responses;
    }
}

public static class GetFoundationNonprofitUsersResponse {
    private Nonprofit nonprofit;
    private List<NonprofitUser> users;

    public GetFoundationNonprofitUsersResponse() {}

    public GetFoundationNonprofitUsersResponse(Nonprofit nonprofit, List<NonprofitUser> users) {
        this.nonprofit = nonprofit;
        this.users = users;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public List<NonprofitUser> getUsers() {
        return users;
    }

    public void setUsers(List<NonprofitUser> users) {
        this.users = users;
    }
}

public static class FoundationPaymentField {
    private String name;
    private String key;
    private boolean visibleInTable;
    public enum Type {
        SYSTEM,
        TEXT,
        NUMBER,
        CURRENCY,
        USER,
        DATE,
        BOOLEAN,
        TAGS,
        MULTI,
    }
    private Type type;

    public FoundationPaymentField() {}

    public FoundationPaymentField(String name, String key, boolean visibleInTable, Type type) {
        this.name = name;
        this.key = key;
        this.visibleInTable = visibleInTable;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean getVisibleInTable() {
        return visibleInTable;
    }

    public void setVisibleInTable(boolean visibleInTable) {
        this.visibleInTable = visibleInTable;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

public static class FoundationProposals {
    private List<ProposalStageResult> results;
    private GrantSubmissionSearchResponse movableResults;

    public FoundationProposals() {}

    public FoundationProposals(List<ProposalStageResult> results, GrantSubmissionSearchResponse movableResults) {
        this.results = results;
        this.movableResults = movableResults;
    }

    public List<ProposalStageResult> getResults() {
        return results;
    }

    public void setResults(List<ProposalStageResult> results) {
        this.results = results;
    }

    public GrantSubmissionSearchResponse getMovableResults() {
        return movableResults;
    }

    public void setMovableResults(GrantSubmissionSearchResponse movableResults) {
        this.movableResults = movableResults;
    }
}

public static class FilteredProposalCell {
    private String value;
    private String link;
    private String tooltip;

    public FilteredProposalCell() {}

    public FilteredProposalCell(String value, String link, String tooltip) {
        this.value = value;
        this.link = link;
        this.tooltip = tooltip;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}

public static class FilteredProposalColumn {
    private String header;
    private String type;
    private String tooltip;

    public FilteredProposalColumn() {}

    public FilteredProposalColumn(String header, String type, String tooltip) {
        this.header = header;
        this.type = type;
        this.tooltip = tooltip;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}

public static class FilteredProposalRow {
    private String id;
    private String nonprofitId;
    private String grantFormProposal;
    private String name;
    private String foundationOwner;
    private List<FilteredProposalCell> data;
    private GrantProposalSubmission submission;

    public FilteredProposalRow() {}

    public FilteredProposalRow(String id, String nonprofitId, String grantFormProposal, String name, String foundationOwner, List<FilteredProposalCell> data, GrantProposalSubmission submission) {
        this.id = id;
        this.nonprofitId = nonprofitId;
        this.grantFormProposal = grantFormProposal;
        this.name = name;
        this.foundationOwner = foundationOwner;
        this.data = data;
        this.submission = submission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getGrantFormProposal() {
        return grantFormProposal;
    }

    public void setGrantFormProposal(String grantFormProposal) {
        this.grantFormProposal = grantFormProposal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationOwner() {
        return foundationOwner;
    }

    public void setFoundationOwner(String foundationOwner) {
        this.foundationOwner = foundationOwner;
    }

    public List<FilteredProposalCell> getData() {
        return data;
    }

    public void setData(List<FilteredProposalCell> data) {
        this.data = data;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }
}

public static class GetFilteredProposalsResponse {
    private String filterId;
    private List<FilteredProposalColumn> columns;
    private List<FilteredProposalRow> rows;

    public GetFilteredProposalsResponse() {}

    public GetFilteredProposalsResponse(String filterId, List<FilteredProposalColumn> columns, List<FilteredProposalRow> rows) {
        this.filterId = filterId;
        this.columns = columns;
        this.rows = rows;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public List<FilteredProposalColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<FilteredProposalColumn> columns) {
        this.columns = columns;
    }

    public List<FilteredProposalRow> getRows() {
        return rows;
    }

    public void setRows(List<FilteredProposalRow> rows) {
        this.rows = rows;
    }
}

public static class GetFilteredBulkProposalsResponse {
    private List<GetFilteredProposalsResponse> responses;
    private GrantSubmissionSearchResponse movableResults;

    public GetFilteredBulkProposalsResponse() {}

    public GetFilteredBulkProposalsResponse(List<GetFilteredProposalsResponse> responses, GrantSubmissionSearchResponse movableResults) {
        this.responses = responses;
        this.movableResults = movableResults;
    }

    public List<GetFilteredProposalsResponse> getResponses() {
        return responses;
    }

    public void setResponses(List<GetFilteredProposalsResponse> responses) {
        this.responses = responses;
    }

    public GrantSubmissionSearchResponse getMovableResults() {
        return movableResults;
    }

    public void setMovableResults(GrantSubmissionSearchResponse movableResults) {
        this.movableResults = movableResults;
    }
}

public static class BulkFilterProposalsRequest {
    private boolean assignedToMe;
    private String pipelineId;
    private List<String> filterIds;

    public BulkFilterProposalsRequest() {}

    public BulkFilterProposalsRequest(boolean assignedToMe, String pipelineId, List<String> filterIds) {
        this.assignedToMe = assignedToMe;
        this.pipelineId = pipelineId;
        this.filterIds = filterIds;
    }

    public boolean getAssignedToMe() {
        return assignedToMe;
    }

    public void setAssignedToMe(boolean assignedToMe) {
        this.assignedToMe = assignedToMe;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public List<String> getFilterIds() {
        return filterIds;
    }

    public void setFilterIds(List<String> filterIds) {
        this.filterIds = filterIds;
    }
}

public static class CreateTaskReviewerRequest {
    private String taskTemplateId;
    private List<String> reviewerIds;
    private String foundationId;
    private String deadline;
    private String submissionId;
    private boolean createUniqueTasks;

    public CreateTaskReviewerRequest() {}

    public CreateTaskReviewerRequest(String taskTemplateId, List<String> reviewerIds, String foundationId, String deadline, String submissionId, boolean createUniqueTasks) {
        this.taskTemplateId = taskTemplateId;
        this.reviewerIds = reviewerIds;
        this.foundationId = foundationId;
        this.deadline = deadline;
        this.submissionId = submissionId;
        this.createUniqueTasks = createUniqueTasks;
    }

    public String getTaskTemplateId() {
        return taskTemplateId;
    }

    public void setTaskTemplateId(String taskTemplateId) {
        this.taskTemplateId = taskTemplateId;
    }

    public List<String> getReviewerIds() {
        return reviewerIds;
    }

    public void setReviewerIds(List<String> reviewerIds) {
        this.reviewerIds = reviewerIds;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public boolean getCreateUniqueTasks() {
        return createUniqueTasks;
    }

    public void setCreateUniqueTasks(boolean createUniqueTasks) {
        this.createUniqueTasks = createUniqueTasks;
    }
}

public static class CRMSearchResponse {
    private int totalCount;
    private List<FoundationNonprofitMetadata> responses;
    private Object options;

    public CRMSearchResponse() {}

    public CRMSearchResponse(int totalCount, List<FoundationNonprofitMetadata> responses, Object options) {
        this.totalCount = totalCount;
        this.responses = responses;
        this.options = options;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<FoundationNonprofitMetadata> getResponses() {
        return responses;
    }

    public void setResponses(List<FoundationNonprofitMetadata> responses) {
        this.responses = responses;
    }

    public Object getOptions() {
        return options;
    }

    public void setOptions(Object options) {
        this.options = options;
    }
}

public static class CRMSearchQuery {
    private int page;
    private int pageSize;
    private String orgName;
    private boolean assignedToMe;
    private List<String> nonprofitIds;
    private String sortKey;
    private boolean asc;
    private List<SortOption> sortOptions;
    private List<FilterOption> filterOptions;

    public CRMSearchQuery() {}

    public CRMSearchQuery(int page, int pageSize, String orgName, boolean assignedToMe, List<String> nonprofitIds, String sortKey, boolean asc, List<SortOption> sortOptions, List<FilterOption> filterOptions) {
        this.page = page;
        this.pageSize = pageSize;
        this.orgName = orgName;
        this.assignedToMe = assignedToMe;
        this.nonprofitIds = nonprofitIds;
        this.sortKey = sortKey;
        this.asc = asc;
        this.sortOptions = sortOptions;
        this.filterOptions = filterOptions;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public boolean getAssignedToMe() {
        return assignedToMe;
    }

    public void setAssignedToMe(boolean assignedToMe) {
        this.assignedToMe = assignedToMe;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public boolean getAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public List<SortOption> getSortOptions() {
        return sortOptions;
    }

    public void setSortOptions(List<SortOption> sortOptions) {
        this.sortOptions = sortOptions;
    }

    public List<FilterOption> getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(List<FilterOption> filterOptions) {
        this.filterOptions = filterOptions;
    }
}

public static class FilterOption {
    private String field;
    private List<String> filters;

    public FilterOption() {}

    public FilterOption(String field, List<String> filters) {
        this.field = field;
        this.filters = filters;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }
}

public static class SortOption {
    private String field;
    public enum SortDirection {
        ASC,
        DESC,
    }
    private SortDirection sortDirection;

    public SortOption() {}

    public SortOption(String field, SortDirection sortDirection) {
        this.field = field;
        this.sortDirection = sortDirection;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public SortDirection getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(SortDirection sortDirection) {
        this.sortDirection = sortDirection;
    }
}

public static class LandingPage {
    private String url;

    public LandingPage() {}

    public LandingPage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class ContactsResponse {
    private List<FoundationCRMField> crmFields;
    private CRMSearchResponse searchResponse;

    public ContactsResponse() {}

    public ContactsResponse(List<FoundationCRMField> crmFields, CRMSearchResponse searchResponse) {
        this.crmFields = crmFields;
        this.searchResponse = searchResponse;
    }

    public List<FoundationCRMField> getCrmFields() {
        return crmFields;
    }

    public void setCrmFields(List<FoundationCRMField> crmFields) {
        this.crmFields = crmFields;
    }

    public CRMSearchResponse getSearchResponse() {
        return searchResponse;
    }

    public void setSearchResponse(CRMSearchResponse searchResponse) {
        this.searchResponse = searchResponse;
    }
}

public static class ContactsRequest {
    private List<FoundationCRMField> fields;
    private CRMSearchQuery searchQuery;

    public ContactsRequest() {}

    public ContactsRequest(List<FoundationCRMField> fields, CRMSearchQuery searchQuery) {
        this.fields = fields;
        this.searchQuery = searchQuery;
    }

    public List<FoundationCRMField> getFields() {
        return fields;
    }

    public void setFields(List<FoundationCRMField> fields) {
        this.fields = fields;
    }

    public CRMSearchQuery getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(CRMSearchQuery searchQuery) {
        this.searchQuery = searchQuery;
    }
}

public static class PaymentSearchResponse {
    private int totalCount;
    private List<GrantPayment> responses;

    public PaymentSearchResponse() {}

    public PaymentSearchResponse(int totalCount, List<GrantPayment> responses) {
        this.totalCount = totalCount;
        this.responses = responses;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<GrantPayment> getResponses() {
        return responses;
    }

    public void setResponses(List<GrantPayment> responses) {
        this.responses = responses;
    }
}

public static class PaymentSearchQuery {
    private int page;
    private int pageSize;
    private List<String> nonprofitIds;
    private List<String> statuses;
    private List<String> grantSubmissionIds;
    private boolean descending;

    public PaymentSearchQuery() {}

    public PaymentSearchQuery(int page, int pageSize, List<String> nonprofitIds, List<String> statuses, List<String> grantSubmissionIds, boolean descending) {
        this.page = page;
        this.pageSize = pageSize;
        this.nonprofitIds = nonprofitIds;
        this.statuses = statuses;
        this.grantSubmissionIds = grantSubmissionIds;
        this.descending = descending;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public List<String> getGrantSubmissionIds() {
        return grantSubmissionIds;
    }

    public void setGrantSubmissionIds(List<String> grantSubmissionIds) {
        this.grantSubmissionIds = grantSubmissionIds;
    }

    public boolean getDescending() {
        return descending;
    }

    public void setDescending(boolean descending) {
        this.descending = descending;
    }
}

public static class BankInfoDownloadRequest {
    private List<String> nonprofitIds;

    public BankInfoDownloadRequest() {}

    public BankInfoDownloadRequest(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }
}

public static class NonprofitMergeRequest {
    private String sourceNonprofitId;
    private String destinationNonprofitId;

    public NonprofitMergeRequest() {}

    public NonprofitMergeRequest(String sourceNonprofitId, String destinationNonprofitId) {
        this.sourceNonprofitId = sourceNonprofitId;
        this.destinationNonprofitId = destinationNonprofitId;
    }

    public String getSourceNonprofitId() {
        return sourceNonprofitId;
    }

    public void setSourceNonprofitId(String sourceNonprofitId) {
        this.sourceNonprofitId = sourceNonprofitId;
    }

    public String getDestinationNonprofitId() {
        return destinationNonprofitId;
    }

    public void setDestinationNonprofitId(String destinationNonprofitId) {
        this.destinationNonprofitId = destinationNonprofitId;
    }
}

public static class FoundationNonprofitGrantSummary {
    private int totalGrantsAwarded;
    private double totalDollarsAwarded;
    private double totalDollarsPaid;

    public FoundationNonprofitGrantSummary() {}

    public FoundationNonprofitGrantSummary(int totalGrantsAwarded, double totalDollarsAwarded, double totalDollarsPaid) {
        this.totalGrantsAwarded = totalGrantsAwarded;
        this.totalDollarsAwarded = totalDollarsAwarded;
        this.totalDollarsPaid = totalDollarsPaid;
    }

    public int getTotalGrantsAwarded() {
        return totalGrantsAwarded;
    }

    public void setTotalGrantsAwarded(int totalGrantsAwarded) {
        this.totalGrantsAwarded = totalGrantsAwarded;
    }

    public double getTotalDollarsAwarded() {
        return totalDollarsAwarded;
    }

    public void setTotalDollarsAwarded(double totalDollarsAwarded) {
        this.totalDollarsAwarded = totalDollarsAwarded;
    }

    public double getTotalDollarsPaid() {
        return totalDollarsPaid;
    }

    public void setTotalDollarsPaid(double totalDollarsPaid) {
        this.totalDollarsPaid = totalDollarsPaid;
    }
}

public static class FoundationNonprofitPaymentSummary {
    private String submissionId;
    private GrantProposalSubmission submission;
    private double totalAwarded;
    private double totalPaid;
    private int totalPayments;
    private int totalPaidPayments;
    private String startDate;
    private String nextDate;

    public FoundationNonprofitPaymentSummary() {}

    public FoundationNonprofitPaymentSummary(String submissionId, GrantProposalSubmission submission, double totalAwarded, double totalPaid, int totalPayments, int totalPaidPayments, String startDate, String nextDate) {
        this.submissionId = submissionId;
        this.submission = submission;
        this.totalAwarded = totalAwarded;
        this.totalPaid = totalPaid;
        this.totalPayments = totalPayments;
        this.totalPaidPayments = totalPaidPayments;
        this.startDate = startDate;
        this.nextDate = nextDate;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }

    public double getTotalAwarded() {
        return totalAwarded;
    }

    public void setTotalAwarded(double totalAwarded) {
        this.totalAwarded = totalAwarded;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public int getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(int totalPayments) {
        this.totalPayments = totalPayments;
    }

    public int getTotalPaidPayments() {
        return totalPaidPayments;
    }

    public void setTotalPaidPayments(int totalPaidPayments) {
        this.totalPaidPayments = totalPaidPayments;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }
}

public static class NumbersACH {
    private String accountId;
    private String account;
    private String routing;
    private String wireRouting;
    private boolean canTransferIn;
    private boolean canTransferOut;

    public NumbersACH() {}

    public NumbersACH(String accountId, String account, String routing, String wireRouting, boolean canTransferIn, boolean canTransferOut) {
        this.accountId = accountId;
        this.account = account;
        this.routing = routing;
        this.wireRouting = wireRouting;
        this.canTransferIn = canTransferIn;
        this.canTransferOut = canTransferOut;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getWireRouting() {
        return wireRouting;
    }

    public void setWireRouting(String wireRouting) {
        this.wireRouting = wireRouting;
    }

    public boolean getCanTransferIn() {
        return canTransferIn;
    }

    public void setCanTransferIn(boolean canTransferIn) {
        this.canTransferIn = canTransferIn;
    }

    public boolean getCanTransferOut() {
        return canTransferOut;
    }

    public void setCanTransferOut(boolean canTransferOut) {
        this.canTransferOut = canTransferOut;
    }
}

public static class FoundationNotes {
    private String id;
    private String foundationId;
    private String nonprofitId;
    public enum Visibility {
        INTERNAL,
        EXTERNAL,
    }
    private Visibility visibility;
    private String createdBy;
    private String message;
    public enum MessageType {
        PHONE_CALL,
        EMAIL,
        IN_PERSON,
    }
    private MessageType messageType;
    public enum SourceType {
        CRM,
        GRANT_APPLICATION,
    }
    private SourceType sourceType;
    private String sourceId;
    private boolean active;
    private String created;
    private FoundationUser createdByUser;

    public FoundationNotes() {}

    public FoundationNotes(String id, String foundationId, String nonprofitId, Visibility visibility, String createdBy, String message, MessageType messageType, SourceType sourceType, String sourceId, boolean active, String created, FoundationUser createdByUser) {
        this.id = id;
        this.foundationId = foundationId;
        this.nonprofitId = nonprofitId;
        this.visibility = visibility;
        this.createdBy = createdBy;
        this.message = message;
        this.messageType = messageType;
        this.sourceType = sourceType;
        this.sourceId = sourceId;
        this.active = active;
        this.created = created;
        this.createdByUser = createdByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }
}

public static class AccountBasedExpenseLineDetail {
    private ReferenceType customerRef;
    private ReferenceType classRef;
    private ReferenceType accountRef;
    public enum BillableStatus {
        BILLABLE,
        NOT_BILLABLE,
        HAS_BEEN_BILLED,
    }
    private BillableStatus billableStatus;
    private MarkupInfo markupInfo;
    private double taxAmount;
    private ReferenceType taxCodeRef;
    private double taxInclusiveAmt;
    private IntuitAnyType expenseDetailLineDetailEx;

    public AccountBasedExpenseLineDetail() {}

    public AccountBasedExpenseLineDetail(ReferenceType customerRef, ReferenceType classRef, ReferenceType accountRef, BillableStatus billableStatus, MarkupInfo markupInfo, double taxAmount, ReferenceType taxCodeRef, double taxInclusiveAmt, IntuitAnyType expenseDetailLineDetailEx) {
        this.customerRef = customerRef;
        this.classRef = classRef;
        this.accountRef = accountRef;
        this.billableStatus = billableStatus;
        this.markupInfo = markupInfo;
        this.taxAmount = taxAmount;
        this.taxCodeRef = taxCodeRef;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.expenseDetailLineDetailEx = expenseDetailLineDetailEx;
    }

    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(ReferenceType customerRef) {
        this.customerRef = customerRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public ReferenceType getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(ReferenceType accountRef) {
        this.accountRef = accountRef;
    }

    public BillableStatus getBillableStatus() {
        return billableStatus;
    }

    public void setBillableStatus(BillableStatus billableStatus) {
        this.billableStatus = billableStatus;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public IntuitAnyType getExpenseDetailLineDetailEx() {
        return expenseDetailLineDetailEx;
    }

    public void setExpenseDetailLineDetailEx(IntuitAnyType expenseDetailLineDetailEx) {
        this.expenseDetailLineDetailEx = expenseDetailLineDetailEx;
    }
}

public static class AttachableRef {
    private ReferenceType entityRef;
    private String lineInfo;
    private boolean includeOnSend;
    private List<CustomField> customField;
    private IntuitAnyType attachableRefEx;

    public AttachableRef() {}

    public AttachableRef(ReferenceType entityRef, String lineInfo, boolean includeOnSend, List<CustomField> customField, IntuitAnyType attachableRefEx) {
        this.entityRef = entityRef;
        this.lineInfo = lineInfo;
        this.includeOnSend = includeOnSend;
        this.customField = customField;
        this.attachableRefEx = attachableRefEx;
    }

    public ReferenceType getEntityRef() {
        return entityRef;
    }

    public void setEntityRef(ReferenceType entityRef) {
        this.entityRef = entityRef;
    }

    public String getLineInfo() {
        return lineInfo;
    }

    public void setLineInfo(String lineInfo) {
        this.lineInfo = lineInfo;
    }

    public boolean getIncludeOnSend() {
        return includeOnSend;
    }

    public void setIncludeOnSend(boolean includeOnSend) {
        this.includeOnSend = includeOnSend;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public IntuitAnyType getAttachableRefEx() {
        return attachableRefEx;
    }

    public void setAttachableRefEx(IntuitAnyType attachableRefEx) {
        this.attachableRefEx = attachableRefEx;
    }
}

public static class Bill {
    private String id;
    private String syncToken;
    private ModificationMetaData metaData;
    private List<CustomField> customField;
    private List<AttachableRef> attachableRef;
    private String domain;
    public enum Status {
        DELETED,
        VOIDED,
        DRAFT,
        PENDING,
        IN_TRANSIT,
        SYNCHRONIZED,
        SYNC_ERROR,
    }
    private Status status;
    private boolean sparse;
    private String docNumber;
    private String txnDate;
    private ReferenceType departmentRef;
    private ReferenceType currencyRef;
    private double exchangeRate;
    private String privateNote;
    private String txnStatus;
    private List<LinkedTxn> linkedTxn;
    private List<Line> line;
    private TxnTaxDetail txnTaxDetail;
    private String txnSource;
    private String taxFormType;
    private String taxFormNum;
    private String transactionLocationType;
    private List<Tag> tag;
    private TxnApprovalInfo txnApprovalInfo;
    private ReferenceType recurDataRef;
    private RecurringInfo recurringInfo;
    private ReferenceType projectRef;
    private ReferenceType vendorRef;
    private double totalAmt;
    private EmailAddress billEmail;
    private EmailAddress replyEmail;
    private String memo;
    public enum GlobalTaxCalculation {
        TAX_INCLUSIVE,
        TAX_EXCLUDED,
        NOT_APPLICABLE,
    }
    private GlobalTaxCalculation globalTaxCalculation;
    private ReferenceType payerRef;
    private ReferenceType salesTermRef;
    private String dueDate;
    private PhysicalAddress remitToAddr;
    private PhysicalAddress shipAddr;
    private PhysicalAddress vendorAddr;
    private double balance;
    private double homeBalance;
    private IntuitAnyType billEx;
    private double lessCIS;
    private boolean includeInAnnualTPAR;
    private ReferenceType apaccountRef;

    public Bill() {}

    public Bill(String id, String syncToken, ModificationMetaData metaData, List<CustomField> customField, List<AttachableRef> attachableRef, String domain, Status status, boolean sparse, String docNumber, String txnDate, ReferenceType departmentRef, ReferenceType currencyRef, double exchangeRate, String privateNote, String txnStatus, List<LinkedTxn> linkedTxn, List<Line> line, TxnTaxDetail txnTaxDetail, String txnSource, String taxFormType, String taxFormNum, String transactionLocationType, List<Tag> tag, TxnApprovalInfo txnApprovalInfo, ReferenceType recurDataRef, RecurringInfo recurringInfo, ReferenceType projectRef, ReferenceType vendorRef, double totalAmt, EmailAddress billEmail, EmailAddress replyEmail, String memo, GlobalTaxCalculation globalTaxCalculation, ReferenceType payerRef, ReferenceType salesTermRef, String dueDate, PhysicalAddress remitToAddr, PhysicalAddress shipAddr, PhysicalAddress vendorAddr, double balance, double homeBalance, IntuitAnyType billEx, double lessCIS, boolean includeInAnnualTPAR, ReferenceType apaccountRef) {
        this.id = id;
        this.syncToken = syncToken;
        this.metaData = metaData;
        this.customField = customField;
        this.attachableRef = attachableRef;
        this.domain = domain;
        this.status = status;
        this.sparse = sparse;
        this.docNumber = docNumber;
        this.txnDate = txnDate;
        this.departmentRef = departmentRef;
        this.currencyRef = currencyRef;
        this.exchangeRate = exchangeRate;
        this.privateNote = privateNote;
        this.txnStatus = txnStatus;
        this.linkedTxn = linkedTxn;
        this.line = line;
        this.txnTaxDetail = txnTaxDetail;
        this.txnSource = txnSource;
        this.taxFormType = taxFormType;
        this.taxFormNum = taxFormNum;
        this.transactionLocationType = transactionLocationType;
        this.tag = tag;
        this.txnApprovalInfo = txnApprovalInfo;
        this.recurDataRef = recurDataRef;
        this.recurringInfo = recurringInfo;
        this.projectRef = projectRef;
        this.vendorRef = vendorRef;
        this.totalAmt = totalAmt;
        this.billEmail = billEmail;
        this.replyEmail = replyEmail;
        this.memo = memo;
        this.globalTaxCalculation = globalTaxCalculation;
        this.payerRef = payerRef;
        this.salesTermRef = salesTermRef;
        this.dueDate = dueDate;
        this.remitToAddr = remitToAddr;
        this.shipAddr = shipAddr;
        this.vendorAddr = vendorAddr;
        this.balance = balance;
        this.homeBalance = homeBalance;
        this.billEx = billEx;
        this.lessCIS = lessCIS;
        this.includeInAnnualTPAR = includeInAnnualTPAR;
        this.apaccountRef = apaccountRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public ModificationMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        this.metaData = metaData;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public List<AttachableRef> getAttachableRef() {
        return attachableRef;
    }

    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getSparse() {
        return sparse;
    }

    public void setSparse(boolean sparse) {
        this.sparse = sparse;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(ReferenceType departmentRef) {
        this.departmentRef = departmentRef;
    }

    public ReferenceType getCurrencyRef() {
        return currencyRef;
    }

    public void setCurrencyRef(ReferenceType currencyRef) {
        this.currencyRef = currencyRef;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getPrivateNote() {
        return privateNote;
    }

    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }

    public String getTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus;
    }

    public List<LinkedTxn> getLinkedTxn() {
        return linkedTxn;
    }

    public void setLinkedTxn(List<LinkedTxn> linkedTxn) {
        this.linkedTxn = linkedTxn;
    }

    public List<Line> getLine() {
        return line;
    }

    public void setLine(List<Line> line) {
        this.line = line;
    }

    public TxnTaxDetail getTxnTaxDetail() {
        return txnTaxDetail;
    }

    public void setTxnTaxDetail(TxnTaxDetail txnTaxDetail) {
        this.txnTaxDetail = txnTaxDetail;
    }

    public String getTxnSource() {
        return txnSource;
    }

    public void setTxnSource(String txnSource) {
        this.txnSource = txnSource;
    }

    public String getTaxFormType() {
        return taxFormType;
    }

    public void setTaxFormType(String taxFormType) {
        this.taxFormType = taxFormType;
    }

    public String getTaxFormNum() {
        return taxFormNum;
    }

    public void setTaxFormNum(String taxFormNum) {
        this.taxFormNum = taxFormNum;
    }

    public String getTransactionLocationType() {
        return transactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        this.transactionLocationType = transactionLocationType;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    public TxnApprovalInfo getTxnApprovalInfo() {
        return txnApprovalInfo;
    }

    public void setTxnApprovalInfo(TxnApprovalInfo txnApprovalInfo) {
        this.txnApprovalInfo = txnApprovalInfo;
    }

    public ReferenceType getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(ReferenceType recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public RecurringInfo getRecurringInfo() {
        return recurringInfo;
    }

    public void setRecurringInfo(RecurringInfo recurringInfo) {
        this.recurringInfo = recurringInfo;
    }

    public ReferenceType getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(ReferenceType projectRef) {
        this.projectRef = projectRef;
    }

    public ReferenceType getVendorRef() {
        return vendorRef;
    }

    public void setVendorRef(ReferenceType vendorRef) {
        this.vendorRef = vendorRef;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public EmailAddress getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(EmailAddress billEmail) {
        this.billEmail = billEmail;
    }

    public EmailAddress getReplyEmail() {
        return replyEmail;
    }

    public void setReplyEmail(EmailAddress replyEmail) {
        this.replyEmail = replyEmail;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public GlobalTaxCalculation getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    public void setGlobalTaxCalculation(GlobalTaxCalculation globalTaxCalculation) {
        this.globalTaxCalculation = globalTaxCalculation;
    }

    public ReferenceType getPayerRef() {
        return payerRef;
    }

    public void setPayerRef(ReferenceType payerRef) {
        this.payerRef = payerRef;
    }

    public ReferenceType getSalesTermRef() {
        return salesTermRef;
    }

    public void setSalesTermRef(ReferenceType salesTermRef) {
        this.salesTermRef = salesTermRef;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public PhysicalAddress getRemitToAddr() {
        return remitToAddr;
    }

    public void setRemitToAddr(PhysicalAddress remitToAddr) {
        this.remitToAddr = remitToAddr;
    }

    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(PhysicalAddress shipAddr) {
        this.shipAddr = shipAddr;
    }

    public PhysicalAddress getVendorAddr() {
        return vendorAddr;
    }

    public void setVendorAddr(PhysicalAddress vendorAddr) {
        this.vendorAddr = vendorAddr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public IntuitAnyType getBillEx() {
        return billEx;
    }

    public void setBillEx(IntuitAnyType billEx) {
        this.billEx = billEx;
    }

    public double getLessCIS() {
        return lessCIS;
    }

    public void setLessCIS(double lessCIS) {
        this.lessCIS = lessCIS;
    }

    public boolean getIncludeInAnnualTPAR() {
        return includeInAnnualTPAR;
    }

    public void setIncludeInAnnualTPAR(boolean includeInAnnualTPAR) {
        this.includeInAnnualTPAR = includeInAnnualTPAR;
    }

    public ReferenceType getApaccountRef() {
        return apaccountRef;
    }

    public void setApaccountRef(ReferenceType apaccountRef) {
        this.apaccountRef = apaccountRef;
    }
}

public static class ContactInfo {
    public enum Type {
        TELEPHONE_NUMBER,
        EMAIL_ADDRESS,
        WEB_SITE_ADDRESS,
        GENERIC_CONTACT_TYPE,
    }
    private Type type;
    private TelephoneNumber telephone;
    private EmailAddress email;
    private WebSiteAddress webSite;
    private GenericContactType otherContact;

    public ContactInfo() {}

    public ContactInfo(Type type, TelephoneNumber telephone, EmailAddress email, WebSiteAddress webSite, GenericContactType otherContact) {
        this.type = type;
        this.telephone = telephone;
        this.email = email;
        this.webSite = webSite;
        this.otherContact = otherContact;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public TelephoneNumber getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneNumber telephone) {
        this.telephone = telephone;
    }

    public EmailAddress getEmail() {
        return email;
    }

    public void setEmail(EmailAddress email) {
        this.email = email;
    }

    public WebSiteAddress getWebSite() {
        return webSite;
    }

    public void setWebSite(WebSiteAddress webSite) {
        this.webSite = webSite;
    }

    public GenericContactType getOtherContact() {
        return otherContact;
    }

    public void setOtherContact(GenericContactType otherContact) {
        this.otherContact = otherContact;
    }
}

public static class CustomField {
    private String definitionId;
    private String name;
    public enum Type {
        STRING_TYPE,
        BOOLEAN_TYPE,
        NUMBER_TYPE,
        DATE_TYPE,
    }
    private Type type;
    private String stringValue;
    private boolean booleanValue;
    private String dateValue;
    private double numberValue;

    public CustomField() {}

    public CustomField(String definitionId, String name, Type type, String stringValue, boolean booleanValue, String dateValue, double numberValue) {
        this.definitionId = definitionId;
        this.name = name;
        this.type = type;
        this.stringValue = stringValue;
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.numberValue = numberValue;
    }

    public String getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }

    public double getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(double numberValue) {
        this.numberValue = numberValue;
    }
}

public static class DepositLineDetail {
    private ReferenceType entity;
    private ReferenceType classRef;
    private ReferenceType accountRef;
    private ReferenceType paymentMethodRef;
    private String checkNum;
    public enum TxnType {
        AP_CREDIT_CARD,
        AR_REFUND_CREDIT_CARD,
        BILL,
        BILL_PAYMENT_CHECK,
        BUILD_ASSEMBLY,
        CARRY_OVER,
        CASH_PURCHASE,
        CHARGE,
        CHECK,
        CREDIT_CARD_PAYMENT,
        CREDIT_MEMO,
        DEPOSIT,
        EFP_LIABILITY_CHECK,
        EFT_BILL_PAYMENT,
        EFT_REFUND,
        ESTIMATE,
        INVENTORY_ADJUSTMENT,
        INVENTORY_TRANSFER,
        INVOICE,
        ITEM_RECEIPT,
        JOURNAL_ENTRY,
        LIABILITY_ADJUSTMENT,
        PAYCHECK,
        PAYROLL_LIABILITY_CHECK,
        PURCHASE_ORDER,
        PRIOR_PAYMENT,
        RECEIVE_PAYMENT,
        REFUND_CHECK,
        REIMBURSE_CHARGE,
        SALES_ORDER,
        SALES_RECEIPT,
        SALES_TAX_PAYMENT_CHECK,
        TRANSFER,
        TIME_ACTIVITY,
        VENDOR_CREDIT,
        YTD_ADJUSTMENT,
    }
    private TxnType txnType;
    private ReferenceType taxCodeRef;
    public enum TaxApplicableOn {
        PURCHASE,
        SALES,
    }
    private TaxApplicableOn taxApplicableOn;
    private IntuitAnyType depositLineDetailEx;

    public DepositLineDetail() {}

    public DepositLineDetail(ReferenceType entity, ReferenceType classRef, ReferenceType accountRef, ReferenceType paymentMethodRef, String checkNum, TxnType txnType, ReferenceType taxCodeRef, TaxApplicableOn taxApplicableOn, IntuitAnyType depositLineDetailEx) {
        this.entity = entity;
        this.classRef = classRef;
        this.accountRef = accountRef;
        this.paymentMethodRef = paymentMethodRef;
        this.checkNum = checkNum;
        this.txnType = txnType;
        this.taxCodeRef = taxCodeRef;
        this.taxApplicableOn = taxApplicableOn;
        this.depositLineDetailEx = depositLineDetailEx;
    }

    public ReferenceType getEntity() {
        return entity;
    }

    public void setEntity(ReferenceType entity) {
        this.entity = entity;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public ReferenceType getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(ReferenceType accountRef) {
        this.accountRef = accountRef;
    }

    public ReferenceType getPaymentMethodRef() {
        return paymentMethodRef;
    }

    public void setPaymentMethodRef(ReferenceType paymentMethodRef) {
        this.paymentMethodRef = paymentMethodRef;
    }

    public String getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public TxnType getTxnType() {
        return txnType;
    }

    public void setTxnType(TxnType txnType) {
        this.txnType = txnType;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public TaxApplicableOn getTaxApplicableOn() {
        return taxApplicableOn;
    }

    public void setTaxApplicableOn(TaxApplicableOn taxApplicableOn) {
        this.taxApplicableOn = taxApplicableOn;
    }

    public IntuitAnyType getDepositLineDetailEx() {
        return depositLineDetailEx;
    }

    public void setDepositLineDetailEx(IntuitAnyType depositLineDetailEx) {
        this.depositLineDetailEx = depositLineDetailEx;
    }
}

public static class DescriptionLineDetail {
    private String serviceDate;
    private ReferenceType taxCodeRef;
    private IntuitAnyType descriptionLineDetailEx;

    public DescriptionLineDetail() {}

    public DescriptionLineDetail(String serviceDate, ReferenceType taxCodeRef, IntuitAnyType descriptionLineDetailEx) {
        this.serviceDate = serviceDate;
        this.taxCodeRef = taxCodeRef;
        this.descriptionLineDetailEx = descriptionLineDetailEx;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public IntuitAnyType getDescriptionLineDetailEx() {
        return descriptionLineDetailEx;
    }

    public void setDescriptionLineDetailEx(IntuitAnyType descriptionLineDetailEx) {
        this.descriptionLineDetailEx = descriptionLineDetailEx;
    }
}

public static class DiscountLineDetail {
    private ReferenceType discountRef;
    private boolean percentBased;
    private double discountPercent;
    private ReferenceType discountAccountRef;
    private String serviceDate;
    private ReferenceType classRef;
    private ReferenceType taxCodeRef;
    private IntuitAnyType discountLineDetailEx;

    public DiscountLineDetail() {}

    public DiscountLineDetail(ReferenceType discountRef, boolean percentBased, double discountPercent, ReferenceType discountAccountRef, String serviceDate, ReferenceType classRef, ReferenceType taxCodeRef, IntuitAnyType discountLineDetailEx) {
        this.discountRef = discountRef;
        this.percentBased = percentBased;
        this.discountPercent = discountPercent;
        this.discountAccountRef = discountAccountRef;
        this.serviceDate = serviceDate;
        this.classRef = classRef;
        this.taxCodeRef = taxCodeRef;
        this.discountLineDetailEx = discountLineDetailEx;
    }

    public ReferenceType getDiscountRef() {
        return discountRef;
    }

    public void setDiscountRef(ReferenceType discountRef) {
        this.discountRef = discountRef;
    }

    public boolean getPercentBased() {
        return percentBased;
    }

    public void setPercentBased(boolean percentBased) {
        this.percentBased = percentBased;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public ReferenceType getDiscountAccountRef() {
        return discountAccountRef;
    }

    public void setDiscountAccountRef(ReferenceType discountAccountRef) {
        this.discountAccountRef = discountAccountRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public IntuitAnyType getDiscountLineDetailEx() {
        return discountLineDetailEx;
    }

    public void setDiscountLineDetailEx(IntuitAnyType discountLineDetailEx) {
        this.discountLineDetailEx = discountLineDetailEx;
    }
}

public static class DiscountOverride {
    private ReferenceType discountRef;
    private boolean percentBased;
    private double discountPercent;
    private ReferenceType discountAccountRef;

    public DiscountOverride() {}

    public DiscountOverride(ReferenceType discountRef, boolean percentBased, double discountPercent, ReferenceType discountAccountRef) {
        this.discountRef = discountRef;
        this.percentBased = percentBased;
        this.discountPercent = discountPercent;
        this.discountAccountRef = discountAccountRef;
    }

    public ReferenceType getDiscountRef() {
        return discountRef;
    }

    public void setDiscountRef(ReferenceType discountRef) {
        this.discountRef = discountRef;
    }

    public boolean getPercentBased() {
        return percentBased;
    }

    public void setPercentBased(boolean percentBased) {
        this.percentBased = percentBased;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public ReferenceType getDiscountAccountRef() {
        return discountAccountRef;
    }

    public void setDiscountAccountRef(ReferenceType discountAccountRef) {
        this.discountAccountRef = discountAccountRef;
    }
}

public static class EmailAddress {
    private String id;
    private String address;
    private String tag;
    private boolean _default;

    public EmailAddress() {}

    public EmailAddress(String id, String address, String tag, boolean _default) {
        this.id = id;
        this.address = address;
        this.tag = tag;
        this._default = _default;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean get_default() {
        return _default;
    }

    public void set_default(boolean _default) {
        this._default = _default;
    }
}

public static class EntityTypeRef {
    public enum Type {
        CUSTOMER,
        EMPLOYEE,
        JOB,
        OTHER,
        VENDOR,
    }
    private Type type;
    private ReferenceType entityRef;

    public EntityTypeRef() {}

    public EntityTypeRef(Type type, ReferenceType entityRef) {
        this.type = type;
        this.entityRef = entityRef;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ReferenceType getEntityRef() {
        return entityRef;
    }

    public void setEntityRef(ReferenceType entityRef) {
        this.entityRef = entityRef;
    }
}

public static class GenericContactType {
    private String id;
    private String name;
    private String value;
    private String type;
    private String tag;
    private boolean _default;

    public GenericContactType() {}

    public GenericContactType(String id, String name, String value, String type, String tag, boolean _default) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.type = type;
        this.tag = tag;
        this._default = _default;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean get_default() {
        return _default;
    }

    public void set_default(boolean _default) {
        this._default = _default;
    }
}

public static class GroupLineDetail {
    private ReferenceType groupItemRef;
    private double quantity;
    private String serviceDate;
    private List<Line> line;
    private IntuitAnyType groupLineDetailEx;
    private UOMRef uomref;

    public GroupLineDetail() {}

    public GroupLineDetail(ReferenceType groupItemRef, double quantity, String serviceDate, List<Line> line, IntuitAnyType groupLineDetailEx, UOMRef uomref) {
        this.groupItemRef = groupItemRef;
        this.quantity = quantity;
        this.serviceDate = serviceDate;
        this.line = line;
        this.groupLineDetailEx = groupLineDetailEx;
        this.uomref = uomref;
    }

    public ReferenceType getGroupItemRef() {
        return groupItemRef;
    }

    public void setGroupItemRef(ReferenceType groupItemRef) {
        this.groupItemRef = groupItemRef;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public List<Line> getLine() {
        return line;
    }

    public void setLine(List<Line> line) {
        this.line = line;
    }

    public IntuitAnyType getGroupLineDetailEx() {
        return groupLineDetailEx;
    }

    public void setGroupLineDetailEx(IntuitAnyType groupLineDetailEx) {
        this.groupLineDetailEx = groupLineDetailEx;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class IntuitAnyType {
    private List<Object> any;

    public IntuitAnyType() {}

    public IntuitAnyType(List<Object> any) {
        this.any = any;
    }

    public List<Object> getAny() {
        return any;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }
}

public static class ItemAdjustmentLineDetail {
    private ReferenceType itemRef;
    private double salesPrice;
    private double qtyDiff;
    private double newQty;
    private ReferenceType classRef;

    public ItemAdjustmentLineDetail() {}

    public ItemAdjustmentLineDetail(ReferenceType itemRef, double salesPrice, double qtyDiff, double newQty, ReferenceType classRef) {
        this.itemRef = itemRef;
        this.salesPrice = salesPrice;
        this.qtyDiff = qtyDiff;
        this.newQty = newQty;
        this.classRef = classRef;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getQtyDiff() {
        return qtyDiff;
    }

    public void setQtyDiff(double qtyDiff) {
        this.qtyDiff = qtyDiff;
    }

    public double getNewQty() {
        return newQty;
    }

    public void setNewQty(double newQty) {
        this.newQty = newQty;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }
}

public static class ItemBasedExpenseLineDetail {
    private ReferenceType itemRef;
    private ReferenceType classRef;
    private double unitPrice;
    private double ratePercent;
    private ReferenceType priceLevelRef;
    private MarkupInfo markupInfo;
    private double qty;
    private ReferenceType itemAccountRef;
    private ReferenceType inventorySiteRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxClassificationRef;
    private ReferenceType customerRef;
    public enum BillableStatus {
        BILLABLE,
        NOT_BILLABLE,
        HAS_BEEN_BILLED,
    }
    private BillableStatus billableStatus;
    private double taxInclusiveAmt;
    private IntuitAnyType itemBasedExpenseLineDetailEx;
    private UOMRef uomref;

    public ItemBasedExpenseLineDetail() {}

    public ItemBasedExpenseLineDetail(ReferenceType itemRef, ReferenceType classRef, double unitPrice, double ratePercent, ReferenceType priceLevelRef, MarkupInfo markupInfo, double qty, ReferenceType itemAccountRef, ReferenceType inventorySiteRef, ReferenceType taxCodeRef, ReferenceType taxClassificationRef, ReferenceType customerRef, BillableStatus billableStatus, double taxInclusiveAmt, IntuitAnyType itemBasedExpenseLineDetailEx, UOMRef uomref) {
        this.itemRef = itemRef;
        this.classRef = classRef;
        this.unitPrice = unitPrice;
        this.ratePercent = ratePercent;
        this.priceLevelRef = priceLevelRef;
        this.markupInfo = markupInfo;
        this.qty = qty;
        this.itemAccountRef = itemAccountRef;
        this.inventorySiteRef = inventorySiteRef;
        this.taxCodeRef = taxCodeRef;
        this.taxClassificationRef = taxClassificationRef;
        this.customerRef = customerRef;
        this.billableStatus = billableStatus;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.itemBasedExpenseLineDetailEx = itemBasedExpenseLineDetailEx;
        this.uomref = uomref;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRatePercent() {
        return ratePercent;
    }

    public void setRatePercent(double ratePercent) {
        this.ratePercent = ratePercent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    public void setItemAccountRef(ReferenceType itemAccountRef) {
        this.itemAccountRef = itemAccountRef;
    }

    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    public void setInventorySiteRef(ReferenceType inventorySiteRef) {
        this.inventorySiteRef = inventorySiteRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    public void setTaxClassificationRef(ReferenceType taxClassificationRef) {
        this.taxClassificationRef = taxClassificationRef;
    }

    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(ReferenceType customerRef) {
        this.customerRef = customerRef;
    }

    public BillableStatus getBillableStatus() {
        return billableStatus;
    }

    public void setBillableStatus(BillableStatus billableStatus) {
        this.billableStatus = billableStatus;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public IntuitAnyType getItemBasedExpenseLineDetailEx() {
        return itemBasedExpenseLineDetailEx;
    }

    public void setItemBasedExpenseLineDetailEx(IntuitAnyType itemBasedExpenseLineDetailEx) {
        this.itemBasedExpenseLineDetailEx = itemBasedExpenseLineDetailEx;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class ItemReceiptLineDetail {
    private IntuitAnyType itemReceiptLineDetailEx;

    public ItemReceiptLineDetail() {}

    public ItemReceiptLineDetail(IntuitAnyType itemReceiptLineDetailEx) {
        this.itemReceiptLineDetailEx = itemReceiptLineDetailEx;
    }

    public IntuitAnyType getItemReceiptLineDetailEx() {
        return itemReceiptLineDetailEx;
    }

    public void setItemReceiptLineDetailEx(IntuitAnyType itemReceiptLineDetailEx) {
        this.itemReceiptLineDetailEx = itemReceiptLineDetailEx;
    }
}

public static class JournalEntryLineDetail {
    public enum PostingType {
        CREDIT,
        DEBIT,
    }
    private PostingType postingType;
    private EntityTypeRef entity;
    private ReferenceType accountRef;
    private ReferenceType classRef;
    private ReferenceType departmentRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxRateRef;
    public enum TaxApplicableOn {
        PURCHASE,
        SALES,
    }
    private TaxApplicableOn taxApplicableOn;
    private double taxAmount;
    private double taxInclusiveAmt;
    public enum BillableStatus {
        BILLABLE,
        NOT_BILLABLE,
        HAS_BEEN_BILLED,
    }
    private BillableStatus billableStatus;
    private ReferenceType journalCodeRef;
    private IntuitAnyType journalEntryLineDetailEx;

    public JournalEntryLineDetail() {}

    public JournalEntryLineDetail(PostingType postingType, EntityTypeRef entity, ReferenceType accountRef, ReferenceType classRef, ReferenceType departmentRef, ReferenceType taxCodeRef, ReferenceType taxRateRef, TaxApplicableOn taxApplicableOn, double taxAmount, double taxInclusiveAmt, BillableStatus billableStatus, ReferenceType journalCodeRef, IntuitAnyType journalEntryLineDetailEx) {
        this.postingType = postingType;
        this.entity = entity;
        this.accountRef = accountRef;
        this.classRef = classRef;
        this.departmentRef = departmentRef;
        this.taxCodeRef = taxCodeRef;
        this.taxRateRef = taxRateRef;
        this.taxApplicableOn = taxApplicableOn;
        this.taxAmount = taxAmount;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.billableStatus = billableStatus;
        this.journalCodeRef = journalCodeRef;
        this.journalEntryLineDetailEx = journalEntryLineDetailEx;
    }

    public PostingType getPostingType() {
        return postingType;
    }

    public void setPostingType(PostingType postingType) {
        this.postingType = postingType;
    }

    public EntityTypeRef getEntity() {
        return entity;
    }

    public void setEntity(EntityTypeRef entity) {
        this.entity = entity;
    }

    public ReferenceType getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(ReferenceType accountRef) {
        this.accountRef = accountRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public ReferenceType getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(ReferenceType departmentRef) {
        this.departmentRef = departmentRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxRateRef() {
        return taxRateRef;
    }

    public void setTaxRateRef(ReferenceType taxRateRef) {
        this.taxRateRef = taxRateRef;
    }

    public TaxApplicableOn getTaxApplicableOn() {
        return taxApplicableOn;
    }

    public void setTaxApplicableOn(TaxApplicableOn taxApplicableOn) {
        this.taxApplicableOn = taxApplicableOn;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public BillableStatus getBillableStatus() {
        return billableStatus;
    }

    public void setBillableStatus(BillableStatus billableStatus) {
        this.billableStatus = billableStatus;
    }

    public ReferenceType getJournalCodeRef() {
        return journalCodeRef;
    }

    public void setJournalCodeRef(ReferenceType journalCodeRef) {
        this.journalCodeRef = journalCodeRef;
    }

    public IntuitAnyType getJournalEntryLineDetailEx() {
        return journalEntryLineDetailEx;
    }

    public void setJournalEntryLineDetailEx(IntuitAnyType journalEntryLineDetailEx) {
        this.journalEntryLineDetailEx = journalEntryLineDetailEx;
    }
}

public static class Line {
    private String id;
    private int lineNum;
    private String description;
    private double amount;
    private double received;
    private List<LinkedTxn> linkedTxn;
    public enum DetailType {
        PAYMENT_LINE_DETAIL,
        DISCOUNT_LINE_DETAIL,
        TAX_LINE_DETAIL,
        SALES_ITEM_LINE_DETAIL,
        ITEM_BASED_EXPENSE_LINE_DETAIL,
        ACCOUNT_BASED_EXPENSE_LINE_DETAIL,
        DEPOSIT_LINE_DETAIL,
        PURCHASE_ORDER_ITEM_LINE_DETAIL,
        ITEM_RECEIPT_LINE_DETAIL,
        JOURNAL_ENTRY_LINE_DETAIL,
        GROUP_LINE_DETAIL,
        DESCRIPTION_ONLY,
        SUB_TOTAL_LINE_DETAIL,
        SALES_ORDER_ITEM_LINE_DETAIL,
        TDS_LINE_DETAIL,
        REIMBURSE_LINE_DETAIL,
        ITEM_ADJUSTMENT_LINE_DETAIL,
    }
    private DetailType detailType;
    private PaymentLineDetail paymentLineDetail;
    private DiscountLineDetail discountLineDetail;
    private TaxLineDetail taxLineDetail;
    private SalesItemLineDetail salesItemLineDetail;
    private DescriptionLineDetail descriptionLineDetail;
    private ItemBasedExpenseLineDetail itemBasedExpenseLineDetail;
    private AccountBasedExpenseLineDetail accountBasedExpenseLineDetail;
    private ReimburseLineDetail reimburseLineDetail;
    private DepositLineDetail depositLineDetail;
    private PurchaseOrderItemLineDetail purchaseOrderItemLineDetail;
    private SalesOrderItemLineDetail salesOrderItemLineDetail;
    private ItemReceiptLineDetail itemReceiptLineDetail;
    private JournalEntryLineDetail journalEntryLineDetail;
    private GroupLineDetail groupLineDetail;
    private SubTotalLineDetail subTotalLineDetail;
    private ItemAdjustmentLineDetail itemAdjustmentLineDetail;
    private List<CustomField> customField;
    private IntuitAnyType lineEx;
    private ReferenceType projectRef;
    private TDSLineDetail tdslineDetail;

    public Line() {}

    public Line(String id, int lineNum, String description, double amount, double received, List<LinkedTxn> linkedTxn, DetailType detailType, PaymentLineDetail paymentLineDetail, DiscountLineDetail discountLineDetail, TaxLineDetail taxLineDetail, SalesItemLineDetail salesItemLineDetail, DescriptionLineDetail descriptionLineDetail, ItemBasedExpenseLineDetail itemBasedExpenseLineDetail, AccountBasedExpenseLineDetail accountBasedExpenseLineDetail, ReimburseLineDetail reimburseLineDetail, DepositLineDetail depositLineDetail, PurchaseOrderItemLineDetail purchaseOrderItemLineDetail, SalesOrderItemLineDetail salesOrderItemLineDetail, ItemReceiptLineDetail itemReceiptLineDetail, JournalEntryLineDetail journalEntryLineDetail, GroupLineDetail groupLineDetail, SubTotalLineDetail subTotalLineDetail, ItemAdjustmentLineDetail itemAdjustmentLineDetail, List<CustomField> customField, IntuitAnyType lineEx, ReferenceType projectRef, TDSLineDetail tdslineDetail) {
        this.id = id;
        this.lineNum = lineNum;
        this.description = description;
        this.amount = amount;
        this.received = received;
        this.linkedTxn = linkedTxn;
        this.detailType = detailType;
        this.paymentLineDetail = paymentLineDetail;
        this.discountLineDetail = discountLineDetail;
        this.taxLineDetail = taxLineDetail;
        this.salesItemLineDetail = salesItemLineDetail;
        this.descriptionLineDetail = descriptionLineDetail;
        this.itemBasedExpenseLineDetail = itemBasedExpenseLineDetail;
        this.accountBasedExpenseLineDetail = accountBasedExpenseLineDetail;
        this.reimburseLineDetail = reimburseLineDetail;
        this.depositLineDetail = depositLineDetail;
        this.purchaseOrderItemLineDetail = purchaseOrderItemLineDetail;
        this.salesOrderItemLineDetail = salesOrderItemLineDetail;
        this.itemReceiptLineDetail = itemReceiptLineDetail;
        this.journalEntryLineDetail = journalEntryLineDetail;
        this.groupLineDetail = groupLineDetail;
        this.subTotalLineDetail = subTotalLineDetail;
        this.itemAdjustmentLineDetail = itemAdjustmentLineDetail;
        this.customField = customField;
        this.lineEx = lineEx;
        this.projectRef = projectRef;
        this.tdslineDetail = tdslineDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getReceived() {
        return received;
    }

    public void setReceived(double received) {
        this.received = received;
    }

    public List<LinkedTxn> getLinkedTxn() {
        return linkedTxn;
    }

    public void setLinkedTxn(List<LinkedTxn> linkedTxn) {
        this.linkedTxn = linkedTxn;
    }

    public DetailType getDetailType() {
        return detailType;
    }

    public void setDetailType(DetailType detailType) {
        this.detailType = detailType;
    }

    public PaymentLineDetail getPaymentLineDetail() {
        return paymentLineDetail;
    }

    public void setPaymentLineDetail(PaymentLineDetail paymentLineDetail) {
        this.paymentLineDetail = paymentLineDetail;
    }

    public DiscountLineDetail getDiscountLineDetail() {
        return discountLineDetail;
    }

    public void setDiscountLineDetail(DiscountLineDetail discountLineDetail) {
        this.discountLineDetail = discountLineDetail;
    }

    public TaxLineDetail getTaxLineDetail() {
        return taxLineDetail;
    }

    public void setTaxLineDetail(TaxLineDetail taxLineDetail) {
        this.taxLineDetail = taxLineDetail;
    }

    public SalesItemLineDetail getSalesItemLineDetail() {
        return salesItemLineDetail;
    }

    public void setSalesItemLineDetail(SalesItemLineDetail salesItemLineDetail) {
        this.salesItemLineDetail = salesItemLineDetail;
    }

    public DescriptionLineDetail getDescriptionLineDetail() {
        return descriptionLineDetail;
    }

    public void setDescriptionLineDetail(DescriptionLineDetail descriptionLineDetail) {
        this.descriptionLineDetail = descriptionLineDetail;
    }

    public ItemBasedExpenseLineDetail getItemBasedExpenseLineDetail() {
        return itemBasedExpenseLineDetail;
    }

    public void setItemBasedExpenseLineDetail(ItemBasedExpenseLineDetail itemBasedExpenseLineDetail) {
        this.itemBasedExpenseLineDetail = itemBasedExpenseLineDetail;
    }

    public AccountBasedExpenseLineDetail getAccountBasedExpenseLineDetail() {
        return accountBasedExpenseLineDetail;
    }

    public void setAccountBasedExpenseLineDetail(AccountBasedExpenseLineDetail accountBasedExpenseLineDetail) {
        this.accountBasedExpenseLineDetail = accountBasedExpenseLineDetail;
    }

    public ReimburseLineDetail getReimburseLineDetail() {
        return reimburseLineDetail;
    }

    public void setReimburseLineDetail(ReimburseLineDetail reimburseLineDetail) {
        this.reimburseLineDetail = reimburseLineDetail;
    }

    public DepositLineDetail getDepositLineDetail() {
        return depositLineDetail;
    }

    public void setDepositLineDetail(DepositLineDetail depositLineDetail) {
        this.depositLineDetail = depositLineDetail;
    }

    public PurchaseOrderItemLineDetail getPurchaseOrderItemLineDetail() {
        return purchaseOrderItemLineDetail;
    }

    public void setPurchaseOrderItemLineDetail(PurchaseOrderItemLineDetail purchaseOrderItemLineDetail) {
        this.purchaseOrderItemLineDetail = purchaseOrderItemLineDetail;
    }

    public SalesOrderItemLineDetail getSalesOrderItemLineDetail() {
        return salesOrderItemLineDetail;
    }

    public void setSalesOrderItemLineDetail(SalesOrderItemLineDetail salesOrderItemLineDetail) {
        this.salesOrderItemLineDetail = salesOrderItemLineDetail;
    }

    public ItemReceiptLineDetail getItemReceiptLineDetail() {
        return itemReceiptLineDetail;
    }

    public void setItemReceiptLineDetail(ItemReceiptLineDetail itemReceiptLineDetail) {
        this.itemReceiptLineDetail = itemReceiptLineDetail;
    }

    public JournalEntryLineDetail getJournalEntryLineDetail() {
        return journalEntryLineDetail;
    }

    public void setJournalEntryLineDetail(JournalEntryLineDetail journalEntryLineDetail) {
        this.journalEntryLineDetail = journalEntryLineDetail;
    }

    public GroupLineDetail getGroupLineDetail() {
        return groupLineDetail;
    }

    public void setGroupLineDetail(GroupLineDetail groupLineDetail) {
        this.groupLineDetail = groupLineDetail;
    }

    public SubTotalLineDetail getSubTotalLineDetail() {
        return subTotalLineDetail;
    }

    public void setSubTotalLineDetail(SubTotalLineDetail subTotalLineDetail) {
        this.subTotalLineDetail = subTotalLineDetail;
    }

    public ItemAdjustmentLineDetail getItemAdjustmentLineDetail() {
        return itemAdjustmentLineDetail;
    }

    public void setItemAdjustmentLineDetail(ItemAdjustmentLineDetail itemAdjustmentLineDetail) {
        this.itemAdjustmentLineDetail = itemAdjustmentLineDetail;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public IntuitAnyType getLineEx() {
        return lineEx;
    }

    public void setLineEx(IntuitAnyType lineEx) {
        this.lineEx = lineEx;
    }

    public ReferenceType getProjectRef() {
        return projectRef;
    }

    public void setProjectRef(ReferenceType projectRef) {
        this.projectRef = projectRef;
    }

    public TDSLineDetail getTdslineDetail() {
        return tdslineDetail;
    }

    public void setTdslineDetail(TDSLineDetail tdslineDetail) {
        this.tdslineDetail = tdslineDetail;
    }
}

public static class LinkedTxn {
    private String txnId;
    private String txnType;
    private String txnLineId;

    public LinkedTxn() {}

    public LinkedTxn(String txnId, String txnType, String txnLineId) {
        this.txnId = txnId;
        this.txnType = txnType;
        this.txnLineId = txnLineId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public String getTxnLineId() {
        return txnLineId;
    }

    public void setTxnLineId(String txnLineId) {
        this.txnLineId = txnLineId;
    }
}

public static class MarkupInfo {
    private boolean percentBased;
    private double value;
    private double percent;
    private ReferenceType priceLevelRef;
    private ReferenceType markUpIncomeAccountRef;

    public MarkupInfo() {}

    public MarkupInfo(boolean percentBased, double value, double percent, ReferenceType priceLevelRef, ReferenceType markUpIncomeAccountRef) {
        this.percentBased = percentBased;
        this.value = value;
        this.percent = percent;
        this.priceLevelRef = priceLevelRef;
        this.markUpIncomeAccountRef = markUpIncomeAccountRef;
    }

    public boolean getPercentBased() {
        return percentBased;
    }

    public void setPercentBased(boolean percentBased) {
        this.percentBased = percentBased;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public ReferenceType getMarkUpIncomeAccountRef() {
        return markUpIncomeAccountRef;
    }

    public void setMarkUpIncomeAccountRef(ReferenceType markUpIncomeAccountRef) {
        this.markUpIncomeAccountRef = markUpIncomeAccountRef;
    }
}

public static class ModificationMetaData {
    private ReferenceType createdByRef;
    private String createTime;
    private ReferenceType lastModifiedByRef;
    private String lastUpdatedTime;
    private String lastChangedInQB;
    private boolean _synchronized;

    public ModificationMetaData() {}

    public ModificationMetaData(ReferenceType createdByRef, String createTime, ReferenceType lastModifiedByRef, String lastUpdatedTime, String lastChangedInQB, boolean _synchronized) {
        this.createdByRef = createdByRef;
        this.createTime = createTime;
        this.lastModifiedByRef = lastModifiedByRef;
        this.lastUpdatedTime = lastUpdatedTime;
        this.lastChangedInQB = lastChangedInQB;
        this._synchronized = _synchronized;
    }

    public ReferenceType getCreatedByRef() {
        return createdByRef;
    }

    public void setCreatedByRef(ReferenceType createdByRef) {
        this.createdByRef = createdByRef;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ReferenceType getLastModifiedByRef() {
        return lastModifiedByRef;
    }

    public void setLastModifiedByRef(ReferenceType lastModifiedByRef) {
        this.lastModifiedByRef = lastModifiedByRef;
    }

    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String getLastChangedInQB() {
        return lastChangedInQB;
    }

    public void setLastChangedInQB(String lastChangedInQB) {
        this.lastChangedInQB = lastChangedInQB;
    }

    public boolean get_synchronized() {
        return _synchronized;
    }

    public void set_synchronized(boolean _synchronized) {
        this._synchronized = _synchronized;
    }
}

public static class PaymentLineDetail {
    private ReferenceType itemRef;
    private String serviceDate;
    private ReferenceType classRef;
    private double balance;
    private double homeBalance;
    private DiscountOverride discount;
    private IntuitAnyType paymentLineEx;

    public PaymentLineDetail() {}

    public PaymentLineDetail(ReferenceType itemRef, String serviceDate, ReferenceType classRef, double balance, double homeBalance, DiscountOverride discount, IntuitAnyType paymentLineEx) {
        this.itemRef = itemRef;
        this.serviceDate = serviceDate;
        this.classRef = classRef;
        this.balance = balance;
        this.homeBalance = homeBalance;
        this.discount = discount;
        this.paymentLineEx = paymentLineEx;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public DiscountOverride getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountOverride discount) {
        this.discount = discount;
    }

    public IntuitAnyType getPaymentLineEx() {
        return paymentLineEx;
    }

    public void setPaymentLineEx(IntuitAnyType paymentLineEx) {
        this.paymentLineEx = paymentLineEx;
    }
}

public static class PhysicalAddress {
    private String id;
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String line5;
    private String city;
    private String country;
    private String countryCode;
    private String county;
    private String countrySubDivisionCode;
    private String postalCode;
    private String postalCodeSuffix;
    private String lat;
    private String tag;
    private String note;
    private String _long;

    public PhysicalAddress() {}

    public PhysicalAddress(String id, String line1, String line2, String line3, String line4, String line5, String city, String country, String countryCode, String county, String countrySubDivisionCode, String postalCode, String postalCodeSuffix, String lat, String tag, String note, String _long) {
        this.id = id;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.line5 = line5;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.county = county;
        this.countrySubDivisionCode = countrySubDivisionCode;
        this.postalCode = postalCode;
        this.postalCodeSuffix = postalCodeSuffix;
        this.lat = lat;
        this.tag = tag;
        this.note = note;
        this._long = _long;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getLine4() {
        return line4;
    }

    public void setLine4(String line4) {
        this.line4 = line4;
    }

    public String getLine5() {
        return line5;
    }

    public void setLine5(String line5) {
        this.line5 = line5;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    public void setCountrySubDivisionCode(String countrySubDivisionCode) {
        this.countrySubDivisionCode = countrySubDivisionCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeSuffix() {
        return postalCodeSuffix;
    }

    public void setPostalCodeSuffix(String postalCodeSuffix) {
        this.postalCodeSuffix = postalCodeSuffix;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String get_long() {
        return _long;
    }

    public void set_long(String _long) {
        this._long = _long;
    }
}

public static class PurchaseOrderItemLineDetail {
    private ReferenceType itemRef;
    private ReferenceType classRef;
    private double unitPrice;
    private double ratePercent;
    private ReferenceType priceLevelRef;
    private MarkupInfo markupInfo;
    private double qty;
    private ReferenceType itemAccountRef;
    private ReferenceType inventorySiteRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxClassificationRef;
    private String serviceDate;
    private double taxInclusiveAmt;
    private double discountRate;
    private double discountAmt;
    private boolean deferredRevenue;
    private IntuitAnyType salesItemLineDetailEx;
    private String manPartNum;
    private boolean manuallyClosed;
    private double openQty;
    private IntuitAnyType purchaseOrderItemLineDetailEx;
    private UOMRef uomref;

    public PurchaseOrderItemLineDetail() {}

    public PurchaseOrderItemLineDetail(ReferenceType itemRef, ReferenceType classRef, double unitPrice, double ratePercent, ReferenceType priceLevelRef, MarkupInfo markupInfo, double qty, ReferenceType itemAccountRef, ReferenceType inventorySiteRef, ReferenceType taxCodeRef, ReferenceType taxClassificationRef, String serviceDate, double taxInclusiveAmt, double discountRate, double discountAmt, boolean deferredRevenue, IntuitAnyType salesItemLineDetailEx, String manPartNum, boolean manuallyClosed, double openQty, IntuitAnyType purchaseOrderItemLineDetailEx, UOMRef uomref) {
        this.itemRef = itemRef;
        this.classRef = classRef;
        this.unitPrice = unitPrice;
        this.ratePercent = ratePercent;
        this.priceLevelRef = priceLevelRef;
        this.markupInfo = markupInfo;
        this.qty = qty;
        this.itemAccountRef = itemAccountRef;
        this.inventorySiteRef = inventorySiteRef;
        this.taxCodeRef = taxCodeRef;
        this.taxClassificationRef = taxClassificationRef;
        this.serviceDate = serviceDate;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.discountRate = discountRate;
        this.discountAmt = discountAmt;
        this.deferredRevenue = deferredRevenue;
        this.salesItemLineDetailEx = salesItemLineDetailEx;
        this.manPartNum = manPartNum;
        this.manuallyClosed = manuallyClosed;
        this.openQty = openQty;
        this.purchaseOrderItemLineDetailEx = purchaseOrderItemLineDetailEx;
        this.uomref = uomref;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRatePercent() {
        return ratePercent;
    }

    public void setRatePercent(double ratePercent) {
        this.ratePercent = ratePercent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    public void setItemAccountRef(ReferenceType itemAccountRef) {
        this.itemAccountRef = itemAccountRef;
    }

    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    public void setInventorySiteRef(ReferenceType inventorySiteRef) {
        this.inventorySiteRef = inventorySiteRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    public void setTaxClassificationRef(ReferenceType taxClassificationRef) {
        this.taxClassificationRef = taxClassificationRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public boolean getDeferredRevenue() {
        return deferredRevenue;
    }

    public void setDeferredRevenue(boolean deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public IntuitAnyType getSalesItemLineDetailEx() {
        return salesItemLineDetailEx;
    }

    public void setSalesItemLineDetailEx(IntuitAnyType salesItemLineDetailEx) {
        this.salesItemLineDetailEx = salesItemLineDetailEx;
    }

    public String getManPartNum() {
        return manPartNum;
    }

    public void setManPartNum(String manPartNum) {
        this.manPartNum = manPartNum;
    }

    public boolean getManuallyClosed() {
        return manuallyClosed;
    }

    public void setManuallyClosed(boolean manuallyClosed) {
        this.manuallyClosed = manuallyClosed;
    }

    public double getOpenQty() {
        return openQty;
    }

    public void setOpenQty(double openQty) {
        this.openQty = openQty;
    }

    public IntuitAnyType getPurchaseOrderItemLineDetailEx() {
        return purchaseOrderItemLineDetailEx;
    }

    public void setPurchaseOrderItemLineDetailEx(IntuitAnyType purchaseOrderItemLineDetailEx) {
        this.purchaseOrderItemLineDetailEx = purchaseOrderItemLineDetailEx;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class QBSearchResponse {
    private int count;
    private List<Object> responses;

    public QBSearchResponse() {}

    public QBSearchResponse(int count, List<Object> responses) {
        this.count = count;
        this.responses = responses;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Object> getResponses() {
        return responses;
    }

    public void setResponses(List<Object> responses) {
        this.responses = responses;
    }
}

public static class QBSearchResponseBill {
    private int count;
    private List<Bill> responses;

    public QBSearchResponseBill() {}

    public QBSearchResponseBill(int count, List<Bill> responses) {
        this.count = count;
        this.responses = responses;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Bill> getResponses() {
        return responses;
    }

    public void setResponses(List<Bill> responses) {
        this.responses = responses;
    }
}

public static class QuickbooksNonprofitDetails {
    private Vendor vendor;
    private QBSearchResponseBill bills;

    public QuickbooksNonprofitDetails() {}

    public QuickbooksNonprofitDetails(Vendor vendor, QBSearchResponseBill bills) {
        this.vendor = vendor;
        this.bills = bills;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public QBSearchResponseBill getBills() {
        return bills;
    }

    public void setBills(QBSearchResponseBill bills) {
        this.bills = bills;
    }
}

public static class RecurringInfo {
    private String name;
    private String recurType;
    private boolean active;
    private RecurringScheduleInfo scheduleInfo;

    public RecurringInfo() {}

    public RecurringInfo(String name, String recurType, boolean active, RecurringScheduleInfo scheduleInfo) {
        this.name = name;
        this.recurType = recurType;
        this.active = active;
        this.scheduleInfo = scheduleInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecurType() {
        return recurType;
    }

    public void setRecurType(String recurType) {
        this.recurType = recurType;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public RecurringScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(RecurringScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }
}

public static class RecurringScheduleInfo {
    private String intervalType;
    private int numInterval;
    private int dayOfMonth;
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
    }
    private DayOfWeek dayOfWeek;
    private int weekOfMonth;
    public enum MonthOfYear {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }
    private MonthOfYear monthOfYear;
    private int remindDays;
    private int daysBefore;
    private int maxOccurrences;
    private String startDate;
    private String endDate;
    private String nextDate;
    private String previousDate;

    public RecurringScheduleInfo() {}

    public RecurringScheduleInfo(String intervalType, int numInterval, int dayOfMonth, DayOfWeek dayOfWeek, int weekOfMonth, MonthOfYear monthOfYear, int remindDays, int daysBefore, int maxOccurrences, String startDate, String endDate, String nextDate, String previousDate) {
        this.intervalType = intervalType;
        this.numInterval = numInterval;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.weekOfMonth = weekOfMonth;
        this.monthOfYear = monthOfYear;
        this.remindDays = remindDays;
        this.daysBefore = daysBefore;
        this.maxOccurrences = maxOccurrences;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nextDate = nextDate;
        this.previousDate = previousDate;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public int getNumInterval() {
        return numInterval;
    }

    public void setNumInterval(int numInterval) {
        this.numInterval = numInterval;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getWeekOfMonth() {
        return weekOfMonth;
    }

    public void setWeekOfMonth(int weekOfMonth) {
        this.weekOfMonth = weekOfMonth;
    }

    public MonthOfYear getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(MonthOfYear monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public int getRemindDays() {
        return remindDays;
    }

    public void setRemindDays(int remindDays) {
        this.remindDays = remindDays;
    }

    public int getDaysBefore() {
        return daysBefore;
    }

    public void setDaysBefore(int daysBefore) {
        this.daysBefore = daysBefore;
    }

    public int getMaxOccurrences() {
        return maxOccurrences;
    }

    public void setMaxOccurrences(int maxOccurrences) {
        this.maxOccurrences = maxOccurrences;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getNextDate() {
        return nextDate;
    }

    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }

    public String getPreviousDate() {
        return previousDate;
    }

    public void setPreviousDate(String previousDate) {
        this.previousDate = previousDate;
    }
}

public static class ReferenceType {
    private String value;
    private String name;
    private String type;

    public ReferenceType() {}

    public ReferenceType(String value, String name, String type) {
        this.value = value;
        this.name = name;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public static class ReimburseLineDetail {
    private ReferenceType itemRef;
    private ReferenceType classRef;
    private double unitPrice;
    private double ratePercent;
    private ReferenceType priceLevelRef;
    private MarkupInfo markupInfo;
    private double qty;
    private ReferenceType itemAccountRef;
    private ReferenceType inventorySiteRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxClassificationRef;
    private UOMRef uomref;

    public ReimburseLineDetail() {}

    public ReimburseLineDetail(ReferenceType itemRef, ReferenceType classRef, double unitPrice, double ratePercent, ReferenceType priceLevelRef, MarkupInfo markupInfo, double qty, ReferenceType itemAccountRef, ReferenceType inventorySiteRef, ReferenceType taxCodeRef, ReferenceType taxClassificationRef, UOMRef uomref) {
        this.itemRef = itemRef;
        this.classRef = classRef;
        this.unitPrice = unitPrice;
        this.ratePercent = ratePercent;
        this.priceLevelRef = priceLevelRef;
        this.markupInfo = markupInfo;
        this.qty = qty;
        this.itemAccountRef = itemAccountRef;
        this.inventorySiteRef = inventorySiteRef;
        this.taxCodeRef = taxCodeRef;
        this.taxClassificationRef = taxClassificationRef;
        this.uomref = uomref;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRatePercent() {
        return ratePercent;
    }

    public void setRatePercent(double ratePercent) {
        this.ratePercent = ratePercent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    public void setItemAccountRef(ReferenceType itemAccountRef) {
        this.itemAccountRef = itemAccountRef;
    }

    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    public void setInventorySiteRef(ReferenceType inventorySiteRef) {
        this.inventorySiteRef = inventorySiteRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    public void setTaxClassificationRef(ReferenceType taxClassificationRef) {
        this.taxClassificationRef = taxClassificationRef;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class SalesItemLineDetail {
    private ReferenceType itemRef;
    private ReferenceType classRef;
    private double unitPrice;
    private double ratePercent;
    private ReferenceType priceLevelRef;
    private MarkupInfo markupInfo;
    private double qty;
    private ReferenceType itemAccountRef;
    private ReferenceType inventorySiteRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxClassificationRef;
    private String serviceDate;
    private double taxInclusiveAmt;
    private double discountRate;
    private double discountAmt;
    private boolean deferredRevenue;
    private IntuitAnyType salesItemLineDetailEx;
    private UOMRef uomref;

    public SalesItemLineDetail() {}

    public SalesItemLineDetail(ReferenceType itemRef, ReferenceType classRef, double unitPrice, double ratePercent, ReferenceType priceLevelRef, MarkupInfo markupInfo, double qty, ReferenceType itemAccountRef, ReferenceType inventorySiteRef, ReferenceType taxCodeRef, ReferenceType taxClassificationRef, String serviceDate, double taxInclusiveAmt, double discountRate, double discountAmt, boolean deferredRevenue, IntuitAnyType salesItemLineDetailEx, UOMRef uomref) {
        this.itemRef = itemRef;
        this.classRef = classRef;
        this.unitPrice = unitPrice;
        this.ratePercent = ratePercent;
        this.priceLevelRef = priceLevelRef;
        this.markupInfo = markupInfo;
        this.qty = qty;
        this.itemAccountRef = itemAccountRef;
        this.inventorySiteRef = inventorySiteRef;
        this.taxCodeRef = taxCodeRef;
        this.taxClassificationRef = taxClassificationRef;
        this.serviceDate = serviceDate;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.discountRate = discountRate;
        this.discountAmt = discountAmt;
        this.deferredRevenue = deferredRevenue;
        this.salesItemLineDetailEx = salesItemLineDetailEx;
        this.uomref = uomref;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRatePercent() {
        return ratePercent;
    }

    public void setRatePercent(double ratePercent) {
        this.ratePercent = ratePercent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    public void setItemAccountRef(ReferenceType itemAccountRef) {
        this.itemAccountRef = itemAccountRef;
    }

    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    public void setInventorySiteRef(ReferenceType inventorySiteRef) {
        this.inventorySiteRef = inventorySiteRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    public void setTaxClassificationRef(ReferenceType taxClassificationRef) {
        this.taxClassificationRef = taxClassificationRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public boolean getDeferredRevenue() {
        return deferredRevenue;
    }

    public void setDeferredRevenue(boolean deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public IntuitAnyType getSalesItemLineDetailEx() {
        return salesItemLineDetailEx;
    }

    public void setSalesItemLineDetailEx(IntuitAnyType salesItemLineDetailEx) {
        this.salesItemLineDetailEx = salesItemLineDetailEx;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class SalesOrderItemLineDetail {
    private ReferenceType itemRef;
    private ReferenceType classRef;
    private double unitPrice;
    private double ratePercent;
    private ReferenceType priceLevelRef;
    private MarkupInfo markupInfo;
    private double qty;
    private ReferenceType itemAccountRef;
    private ReferenceType inventorySiteRef;
    private ReferenceType taxCodeRef;
    private ReferenceType taxClassificationRef;
    private String serviceDate;
    private double taxInclusiveAmt;
    private double discountRate;
    private double discountAmt;
    private boolean deferredRevenue;
    private IntuitAnyType salesItemLineDetailEx;
    private boolean manuallyClosed;
    private UOMRef uomref;

    public SalesOrderItemLineDetail() {}

    public SalesOrderItemLineDetail(ReferenceType itemRef, ReferenceType classRef, double unitPrice, double ratePercent, ReferenceType priceLevelRef, MarkupInfo markupInfo, double qty, ReferenceType itemAccountRef, ReferenceType inventorySiteRef, ReferenceType taxCodeRef, ReferenceType taxClassificationRef, String serviceDate, double taxInclusiveAmt, double discountRate, double discountAmt, boolean deferredRevenue, IntuitAnyType salesItemLineDetailEx, boolean manuallyClosed, UOMRef uomref) {
        this.itemRef = itemRef;
        this.classRef = classRef;
        this.unitPrice = unitPrice;
        this.ratePercent = ratePercent;
        this.priceLevelRef = priceLevelRef;
        this.markupInfo = markupInfo;
        this.qty = qty;
        this.itemAccountRef = itemAccountRef;
        this.inventorySiteRef = inventorySiteRef;
        this.taxCodeRef = taxCodeRef;
        this.taxClassificationRef = taxClassificationRef;
        this.serviceDate = serviceDate;
        this.taxInclusiveAmt = taxInclusiveAmt;
        this.discountRate = discountRate;
        this.discountAmt = discountAmt;
        this.deferredRevenue = deferredRevenue;
        this.salesItemLineDetailEx = salesItemLineDetailEx;
        this.manuallyClosed = manuallyClosed;
        this.uomref = uomref;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public ReferenceType getClassRef() {
        return classRef;
    }

    public void setClassRef(ReferenceType classRef) {
        this.classRef = classRef;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getRatePercent() {
        return ratePercent;
    }

    public void setRatePercent(double ratePercent) {
        this.ratePercent = ratePercent;
    }

    public ReferenceType getPriceLevelRef() {
        return priceLevelRef;
    }

    public void setPriceLevelRef(ReferenceType priceLevelRef) {
        this.priceLevelRef = priceLevelRef;
    }

    public MarkupInfo getMarkupInfo() {
        return markupInfo;
    }

    public void setMarkupInfo(MarkupInfo markupInfo) {
        this.markupInfo = markupInfo;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public ReferenceType getItemAccountRef() {
        return itemAccountRef;
    }

    public void setItemAccountRef(ReferenceType itemAccountRef) {
        this.itemAccountRef = itemAccountRef;
    }

    public ReferenceType getInventorySiteRef() {
        return inventorySiteRef;
    }

    public void setInventorySiteRef(ReferenceType inventorySiteRef) {
        this.inventorySiteRef = inventorySiteRef;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public ReferenceType getTaxClassificationRef() {
        return taxClassificationRef;
    }

    public void setTaxClassificationRef(ReferenceType taxClassificationRef) {
        this.taxClassificationRef = taxClassificationRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    public void setTaxInclusiveAmt(double taxInclusiveAmt) {
        this.taxInclusiveAmt = taxInclusiveAmt;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public boolean getDeferredRevenue() {
        return deferredRevenue;
    }

    public void setDeferredRevenue(boolean deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public IntuitAnyType getSalesItemLineDetailEx() {
        return salesItemLineDetailEx;
    }

    public void setSalesItemLineDetailEx(IntuitAnyType salesItemLineDetailEx) {
        this.salesItemLineDetailEx = salesItemLineDetailEx;
    }

    public boolean getManuallyClosed() {
        return manuallyClosed;
    }

    public void setManuallyClosed(boolean manuallyClosed) {
        this.manuallyClosed = manuallyClosed;
    }

    public UOMRef getUomref() {
        return uomref;
    }

    public void setUomref(UOMRef uomref) {
        this.uomref = uomref;
    }
}

public static class SubTotalLineDetail {
    private ReferenceType itemRef;
    private String serviceDate;

    public SubTotalLineDetail() {}

    public SubTotalLineDetail(ReferenceType itemRef, String serviceDate) {
        this.itemRef = itemRef;
        this.serviceDate = serviceDate;
    }

    public ReferenceType getItemRef() {
        return itemRef;
    }

    public void setItemRef(ReferenceType itemRef) {
        this.itemRef = itemRef;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }
}

public static class TDSLineDetail {
    private int tdssectionTypeId;
    private ReferenceType tdsaccountRef;
    private IntuitAnyType tdslineDetailEx;

    public TDSLineDetail() {}

    public TDSLineDetail(int tdssectionTypeId, ReferenceType tdsaccountRef, IntuitAnyType tdslineDetailEx) {
        this.tdssectionTypeId = tdssectionTypeId;
        this.tdsaccountRef = tdsaccountRef;
        this.tdslineDetailEx = tdslineDetailEx;
    }

    public int getTdssectionTypeId() {
        return tdssectionTypeId;
    }

    public void setTdssectionTypeId(int tdssectionTypeId) {
        this.tdssectionTypeId = tdssectionTypeId;
    }

    public ReferenceType getTdsaccountRef() {
        return tdsaccountRef;
    }

    public void setTdsaccountRef(ReferenceType tdsaccountRef) {
        this.tdsaccountRef = tdsaccountRef;
    }

    public IntuitAnyType getTdslineDetailEx() {
        return tdslineDetailEx;
    }

    public void setTdslineDetailEx(IntuitAnyType tdslineDetailEx) {
        this.tdslineDetailEx = tdslineDetailEx;
    }
}

public static class Tag {
    private String id;
    private String syncToken;
    private ModificationMetaData metaData;
    private List<CustomField> customField;
    private List<AttachableRef> attachableRef;
    private String domain;
    public enum Status {
        DELETED,
        VOIDED,
        DRAFT,
        PENDING,
        IN_TRANSIT,
        SYNCHRONIZED,
        SYNC_ERROR,
    }
    private Status status;
    private boolean sparse;
    private String name;

    public Tag() {}

    public Tag(String id, String syncToken, ModificationMetaData metaData, List<CustomField> customField, List<AttachableRef> attachableRef, String domain, Status status, boolean sparse, String name) {
        this.id = id;
        this.syncToken = syncToken;
        this.metaData = metaData;
        this.customField = customField;
        this.attachableRef = attachableRef;
        this.domain = domain;
        this.status = status;
        this.sparse = sparse;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public ModificationMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        this.metaData = metaData;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public List<AttachableRef> getAttachableRef() {
        return attachableRef;
    }

    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getSparse() {
        return sparse;
    }

    public void setSparse(boolean sparse) {
        this.sparse = sparse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public static class TaxLineDetail {
    private ReferenceType taxRateRef;
    private boolean percentBased;
    private double taxPercent;
    private double netAmountTaxable;
    private double taxInclusiveAmount;
    private double overrideDeltaAmount;
    private String serviceDate;
    private IntuitAnyType taxLineDetailEx;

    public TaxLineDetail() {}

    public TaxLineDetail(ReferenceType taxRateRef, boolean percentBased, double taxPercent, double netAmountTaxable, double taxInclusiveAmount, double overrideDeltaAmount, String serviceDate, IntuitAnyType taxLineDetailEx) {
        this.taxRateRef = taxRateRef;
        this.percentBased = percentBased;
        this.taxPercent = taxPercent;
        this.netAmountTaxable = netAmountTaxable;
        this.taxInclusiveAmount = taxInclusiveAmount;
        this.overrideDeltaAmount = overrideDeltaAmount;
        this.serviceDate = serviceDate;
        this.taxLineDetailEx = taxLineDetailEx;
    }

    public ReferenceType getTaxRateRef() {
        return taxRateRef;
    }

    public void setTaxRateRef(ReferenceType taxRateRef) {
        this.taxRateRef = taxRateRef;
    }

    public boolean getPercentBased() {
        return percentBased;
    }

    public void setPercentBased(boolean percentBased) {
        this.percentBased = percentBased;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double getNetAmountTaxable() {
        return netAmountTaxable;
    }

    public void setNetAmountTaxable(double netAmountTaxable) {
        this.netAmountTaxable = netAmountTaxable;
    }

    public double getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    public void setTaxInclusiveAmount(double taxInclusiveAmount) {
        this.taxInclusiveAmount = taxInclusiveAmount;
    }

    public double getOverrideDeltaAmount() {
        return overrideDeltaAmount;
    }

    public void setOverrideDeltaAmount(double overrideDeltaAmount) {
        this.overrideDeltaAmount = overrideDeltaAmount;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public IntuitAnyType getTaxLineDetailEx() {
        return taxLineDetailEx;
    }

    public void setTaxLineDetailEx(IntuitAnyType taxLineDetailEx) {
        this.taxLineDetailEx = taxLineDetailEx;
    }
}

public static class TelephoneNumber {
    private String id;
    private String deviceType;
    private String countryCode;
    private String areaCode;
    private String exchangeCode;
    private String extension;
    private String freeFormNumber;
    private String tag;
    private boolean _default;

    public TelephoneNumber() {}

    public TelephoneNumber(String id, String deviceType, String countryCode, String areaCode, String exchangeCode, String extension, String freeFormNumber, String tag, boolean _default) {
        this.id = id;
        this.deviceType = deviceType;
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.exchangeCode = exchangeCode;
        this.extension = extension;
        this.freeFormNumber = freeFormNumber;
        this.tag = tag;
        this._default = _default;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFreeFormNumber() {
        return freeFormNumber;
    }

    public void setFreeFormNumber(String freeFormNumber) {
        this.freeFormNumber = freeFormNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean get_default() {
        return _default;
    }

    public void set_default(boolean _default) {
        this._default = _default;
    }
}

public static class TxnApprovalInfo {
    private String approvalStatus;
    private String approvalStatusDetail;
    private String lastChangedByUser;
    private String lastChangedDate;

    public TxnApprovalInfo() {}

    public TxnApprovalInfo(String approvalStatus, String approvalStatusDetail, String lastChangedByUser, String lastChangedDate) {
        this.approvalStatus = approvalStatus;
        this.approvalStatusDetail = approvalStatusDetail;
        this.lastChangedByUser = lastChangedByUser;
        this.lastChangedDate = lastChangedDate;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatusDetail() {
        return approvalStatusDetail;
    }

    public void setApprovalStatusDetail(String approvalStatusDetail) {
        this.approvalStatusDetail = approvalStatusDetail;
    }

    public String getLastChangedByUser() {
        return lastChangedByUser;
    }

    public void setLastChangedByUser(String lastChangedByUser) {
        this.lastChangedByUser = lastChangedByUser;
    }

    public String getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(String lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}

public static class TxnTaxDetail {
    private ReferenceType defaultTaxCodeRef;
    private ReferenceType txnTaxCodeRef;
    private double totalTax;
    public enum TaxReviewStatus {
        NON_AST_TAX,
        AST_TAX_OVERRIDE,
    }
    private TaxReviewStatus taxReviewStatus;
    private List<Line> taxLine;
    private boolean useAutomatedSalesTax;

    public TxnTaxDetail() {}

    public TxnTaxDetail(ReferenceType defaultTaxCodeRef, ReferenceType txnTaxCodeRef, double totalTax, TaxReviewStatus taxReviewStatus, List<Line> taxLine, boolean useAutomatedSalesTax) {
        this.defaultTaxCodeRef = defaultTaxCodeRef;
        this.txnTaxCodeRef = txnTaxCodeRef;
        this.totalTax = totalTax;
        this.taxReviewStatus = taxReviewStatus;
        this.taxLine = taxLine;
        this.useAutomatedSalesTax = useAutomatedSalesTax;
    }

    public ReferenceType getDefaultTaxCodeRef() {
        return defaultTaxCodeRef;
    }

    public void setDefaultTaxCodeRef(ReferenceType defaultTaxCodeRef) {
        this.defaultTaxCodeRef = defaultTaxCodeRef;
    }

    public ReferenceType getTxnTaxCodeRef() {
        return txnTaxCodeRef;
    }

    public void setTxnTaxCodeRef(ReferenceType txnTaxCodeRef) {
        this.txnTaxCodeRef = txnTaxCodeRef;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    public TaxReviewStatus getTaxReviewStatus() {
        return taxReviewStatus;
    }

    public void setTaxReviewStatus(TaxReviewStatus taxReviewStatus) {
        this.taxReviewStatus = taxReviewStatus;
    }

    public List<Line> getTaxLine() {
        return taxLine;
    }

    public void setTaxLine(List<Line> taxLine) {
        this.taxLine = taxLine;
    }

    public boolean getUseAutomatedSalesTax() {
        return useAutomatedSalesTax;
    }

    public void setUseAutomatedSalesTax(boolean useAutomatedSalesTax) {
        this.useAutomatedSalesTax = useAutomatedSalesTax;
    }
}

public static class UOMRef {
    private String unit;
    private ReferenceType uomsetRef;

    public UOMRef() {}

    public UOMRef(String unit, ReferenceType uomsetRef) {
        this.unit = unit;
        this.uomsetRef = uomsetRef;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ReferenceType getUomsetRef() {
        return uomsetRef;
    }

    public void setUomsetRef(ReferenceType uomsetRef) {
        this.uomsetRef = uomsetRef;
    }
}

public static class Vendor {
    private String id;
    private String syncToken;
    private ModificationMetaData metaData;
    private List<CustomField> customField;
    private List<AttachableRef> attachableRef;
    private String domain;
    public enum Status {
        DELETED,
        VOIDED,
        DRAFT,
        PENDING,
        IN_TRANSIT,
        SYNCHRONIZED,
        SYNC_ERROR,
    }
    private Status status;
    private boolean sparse;
    private String intuitId;
    private boolean organization;
    private String title;
    private String givenName;
    private String middleName;
    private String familyName;
    private String suffix;
    private String fullyQualifiedName;
    private String companyName;
    private String displayName;
    private String printOnCheckName;
    private String userId;
    private boolean active;
    private String v4IDPseudonym;
    private TelephoneNumber primaryPhone;
    private TelephoneNumber alternatePhone;
    private TelephoneNumber mobile;
    private TelephoneNumber fax;
    private EmailAddress primaryEmailAddr;
    private WebSiteAddress webAddr;
    private List<ContactInfo> otherContactInfo;
    private ReferenceType defaultTaxCodeRef;
    private String contactName;
    private String altContactName;
    private String notes;
    private PhysicalAddress billAddr;
    private PhysicalAddress shipAddr;
    private List<PhysicalAddress> otherAddr;
    private String taxCountry;
    private String taxIdentifier;
    private String taxIdEffectiveDate;
    private String businessNumber;
    private ReferenceType parentRef;
    private ReferenceType vendorTypeRef;
    private ReferenceType termRef;
    private ReferenceType prefillAccountRef;
    private double balance;
    private double billRate;
    private String openBalanceDate;
    private double creditLimit;
    private String acctNum;
    private boolean vendor1099;
    private boolean t4AEligible;
    private boolean t5018Eligible;
    private ReferenceType currencyRef;
    private String taxReportingBasis;
    private IntuitAnyType vendorEx;
    private String gstin;
    private boolean isSubContractor;
    private String subcontractorType;
    private boolean hasTPAR;
    private VendorBankAccountDetail vendorPaymentBankDetail;
    private String source;
    private double costRate;
    private boolean tdsenabled;
    private int tdsentityTypeId;
    private int tdssectionTypeId;
    private boolean tdsoverrideThreshold;
    private ReferenceType apaccountRef;
    private String gstregistrationType;
    private String cisrate;

    public Vendor() {}

    public Vendor(String id, String syncToken, ModificationMetaData metaData, List<CustomField> customField, List<AttachableRef> attachableRef, String domain, Status status, boolean sparse, String intuitId, boolean organization, String title, String givenName, String middleName, String familyName, String suffix, String fullyQualifiedName, String companyName, String displayName, String printOnCheckName, String userId, boolean active, String v4IDPseudonym, TelephoneNumber primaryPhone, TelephoneNumber alternatePhone, TelephoneNumber mobile, TelephoneNumber fax, EmailAddress primaryEmailAddr, WebSiteAddress webAddr, List<ContactInfo> otherContactInfo, ReferenceType defaultTaxCodeRef, String contactName, String altContactName, String notes, PhysicalAddress billAddr, PhysicalAddress shipAddr, List<PhysicalAddress> otherAddr, String taxCountry, String taxIdentifier, String taxIdEffectiveDate, String businessNumber, ReferenceType parentRef, ReferenceType vendorTypeRef, ReferenceType termRef, ReferenceType prefillAccountRef, double balance, double billRate, String openBalanceDate, double creditLimit, String acctNum, boolean vendor1099, boolean t4AEligible, boolean t5018Eligible, ReferenceType currencyRef, String taxReportingBasis, IntuitAnyType vendorEx, String gstin, boolean isSubContractor, String subcontractorType, boolean hasTPAR, VendorBankAccountDetail vendorPaymentBankDetail, String source, double costRate, boolean tdsenabled, int tdsentityTypeId, int tdssectionTypeId, boolean tdsoverrideThreshold, ReferenceType apaccountRef, String gstregistrationType, String cisrate) {
        this.id = id;
        this.syncToken = syncToken;
        this.metaData = metaData;
        this.customField = customField;
        this.attachableRef = attachableRef;
        this.domain = domain;
        this.status = status;
        this.sparse = sparse;
        this.intuitId = intuitId;
        this.organization = organization;
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.suffix = suffix;
        this.fullyQualifiedName = fullyQualifiedName;
        this.companyName = companyName;
        this.displayName = displayName;
        this.printOnCheckName = printOnCheckName;
        this.userId = userId;
        this.active = active;
        this.v4IDPseudonym = v4IDPseudonym;
        this.primaryPhone = primaryPhone;
        this.alternatePhone = alternatePhone;
        this.mobile = mobile;
        this.fax = fax;
        this.primaryEmailAddr = primaryEmailAddr;
        this.webAddr = webAddr;
        this.otherContactInfo = otherContactInfo;
        this.defaultTaxCodeRef = defaultTaxCodeRef;
        this.contactName = contactName;
        this.altContactName = altContactName;
        this.notes = notes;
        this.billAddr = billAddr;
        this.shipAddr = shipAddr;
        this.otherAddr = otherAddr;
        this.taxCountry = taxCountry;
        this.taxIdentifier = taxIdentifier;
        this.taxIdEffectiveDate = taxIdEffectiveDate;
        this.businessNumber = businessNumber;
        this.parentRef = parentRef;
        this.vendorTypeRef = vendorTypeRef;
        this.termRef = termRef;
        this.prefillAccountRef = prefillAccountRef;
        this.balance = balance;
        this.billRate = billRate;
        this.openBalanceDate = openBalanceDate;
        this.creditLimit = creditLimit;
        this.acctNum = acctNum;
        this.vendor1099 = vendor1099;
        this.t4AEligible = t4AEligible;
        this.t5018Eligible = t5018Eligible;
        this.currencyRef = currencyRef;
        this.taxReportingBasis = taxReportingBasis;
        this.vendorEx = vendorEx;
        this.gstin = gstin;
        this.isSubContractor = isSubContractor;
        this.subcontractorType = subcontractorType;
        this.hasTPAR = hasTPAR;
        this.vendorPaymentBankDetail = vendorPaymentBankDetail;
        this.source = source;
        this.costRate = costRate;
        this.tdsenabled = tdsenabled;
        this.tdsentityTypeId = tdsentityTypeId;
        this.tdssectionTypeId = tdssectionTypeId;
        this.tdsoverrideThreshold = tdsoverrideThreshold;
        this.apaccountRef = apaccountRef;
        this.gstregistrationType = gstregistrationType;
        this.cisrate = cisrate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public ModificationMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        this.metaData = metaData;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public List<AttachableRef> getAttachableRef() {
        return attachableRef;
    }

    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getSparse() {
        return sparse;
    }

    public void setSparse(boolean sparse) {
        this.sparse = sparse;
    }

    public String getIntuitId() {
        return intuitId;
    }

    public void setIntuitId(String intuitId) {
        this.intuitId = intuitId;
    }

    public boolean getOrganization() {
        return organization;
    }

    public void setOrganization(boolean organization) {
        this.organization = organization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPrintOnCheckName() {
        return printOnCheckName;
    }

    public void setPrintOnCheckName(String printOnCheckName) {
        this.printOnCheckName = printOnCheckName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getV4IDPseudonym() {
        return v4IDPseudonym;
    }

    public void setV4IDPseudonym(String v4IDPseudonym) {
        this.v4IDPseudonym = v4IDPseudonym;
    }

    public TelephoneNumber getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(TelephoneNumber primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public TelephoneNumber getAlternatePhone() {
        return alternatePhone;
    }

    public void setAlternatePhone(TelephoneNumber alternatePhone) {
        this.alternatePhone = alternatePhone;
    }

    public TelephoneNumber getMobile() {
        return mobile;
    }

    public void setMobile(TelephoneNumber mobile) {
        this.mobile = mobile;
    }

    public TelephoneNumber getFax() {
        return fax;
    }

    public void setFax(TelephoneNumber fax) {
        this.fax = fax;
    }

    public EmailAddress getPrimaryEmailAddr() {
        return primaryEmailAddr;
    }

    public void setPrimaryEmailAddr(EmailAddress primaryEmailAddr) {
        this.primaryEmailAddr = primaryEmailAddr;
    }

    public WebSiteAddress getWebAddr() {
        return webAddr;
    }

    public void setWebAddr(WebSiteAddress webAddr) {
        this.webAddr = webAddr;
    }

    public List<ContactInfo> getOtherContactInfo() {
        return otherContactInfo;
    }

    public void setOtherContactInfo(List<ContactInfo> otherContactInfo) {
        this.otherContactInfo = otherContactInfo;
    }

    public ReferenceType getDefaultTaxCodeRef() {
        return defaultTaxCodeRef;
    }

    public void setDefaultTaxCodeRef(ReferenceType defaultTaxCodeRef) {
        this.defaultTaxCodeRef = defaultTaxCodeRef;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAltContactName() {
        return altContactName;
    }

    public void setAltContactName(String altContactName) {
        this.altContactName = altContactName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public PhysicalAddress getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(PhysicalAddress billAddr) {
        this.billAddr = billAddr;
    }

    public PhysicalAddress getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(PhysicalAddress shipAddr) {
        this.shipAddr = shipAddr;
    }

    public List<PhysicalAddress> getOtherAddr() {
        return otherAddr;
    }

    public void setOtherAddr(List<PhysicalAddress> otherAddr) {
        this.otherAddr = otherAddr;
    }

    public String getTaxCountry() {
        return taxCountry;
    }

    public void setTaxCountry(String taxCountry) {
        this.taxCountry = taxCountry;
    }

    public String getTaxIdentifier() {
        return taxIdentifier;
    }

    public void setTaxIdentifier(String taxIdentifier) {
        this.taxIdentifier = taxIdentifier;
    }

    public String getTaxIdEffectiveDate() {
        return taxIdEffectiveDate;
    }

    public void setTaxIdEffectiveDate(String taxIdEffectiveDate) {
        this.taxIdEffectiveDate = taxIdEffectiveDate;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public ReferenceType getParentRef() {
        return parentRef;
    }

    public void setParentRef(ReferenceType parentRef) {
        this.parentRef = parentRef;
    }

    public ReferenceType getVendorTypeRef() {
        return vendorTypeRef;
    }

    public void setVendorTypeRef(ReferenceType vendorTypeRef) {
        this.vendorTypeRef = vendorTypeRef;
    }

    public ReferenceType getTermRef() {
        return termRef;
    }

    public void setTermRef(ReferenceType termRef) {
        this.termRef = termRef;
    }

    public ReferenceType getPrefillAccountRef() {
        return prefillAccountRef;
    }

    public void setPrefillAccountRef(ReferenceType prefillAccountRef) {
        this.prefillAccountRef = prefillAccountRef;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBillRate() {
        return billRate;
    }

    public void setBillRate(double billRate) {
        this.billRate = billRate;
    }

    public String getOpenBalanceDate() {
        return openBalanceDate;
    }

    public void setOpenBalanceDate(String openBalanceDate) {
        this.openBalanceDate = openBalanceDate;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public boolean getVendor1099() {
        return vendor1099;
    }

    public void setVendor1099(boolean vendor1099) {
        this.vendor1099 = vendor1099;
    }

    public boolean getT4AEligible() {
        return t4AEligible;
    }

    public void setT4AEligible(boolean t4AEligible) {
        this.t4AEligible = t4AEligible;
    }

    public boolean getT5018Eligible() {
        return t5018Eligible;
    }

    public void setT5018Eligible(boolean t5018Eligible) {
        this.t5018Eligible = t5018Eligible;
    }

    public ReferenceType getCurrencyRef() {
        return currencyRef;
    }

    public void setCurrencyRef(ReferenceType currencyRef) {
        this.currencyRef = currencyRef;
    }

    public String getTaxReportingBasis() {
        return taxReportingBasis;
    }

    public void setTaxReportingBasis(String taxReportingBasis) {
        this.taxReportingBasis = taxReportingBasis;
    }

    public IntuitAnyType getVendorEx() {
        return vendorEx;
    }

    public void setVendorEx(IntuitAnyType vendorEx) {
        this.vendorEx = vendorEx;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public boolean getIsSubContractor() {
        return isSubContractor;
    }

    public void setIsSubContractor(boolean isSubContractor) {
        this.isSubContractor = isSubContractor;
    }

    public String getSubcontractorType() {
        return subcontractorType;
    }

    public void setSubcontractorType(String subcontractorType) {
        this.subcontractorType = subcontractorType;
    }

    public boolean getHasTPAR() {
        return hasTPAR;
    }

    public void setHasTPAR(boolean hasTPAR) {
        this.hasTPAR = hasTPAR;
    }

    public VendorBankAccountDetail getVendorPaymentBankDetail() {
        return vendorPaymentBankDetail;
    }

    public void setVendorPaymentBankDetail(VendorBankAccountDetail vendorPaymentBankDetail) {
        this.vendorPaymentBankDetail = vendorPaymentBankDetail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getCostRate() {
        return costRate;
    }

    public void setCostRate(double costRate) {
        this.costRate = costRate;
    }

    public boolean getTdsenabled() {
        return tdsenabled;
    }

    public void setTdsenabled(boolean tdsenabled) {
        this.tdsenabled = tdsenabled;
    }

    public int getTdsentityTypeId() {
        return tdsentityTypeId;
    }

    public void setTdsentityTypeId(int tdsentityTypeId) {
        this.tdsentityTypeId = tdsentityTypeId;
    }

    public int getTdssectionTypeId() {
        return tdssectionTypeId;
    }

    public void setTdssectionTypeId(int tdssectionTypeId) {
        this.tdssectionTypeId = tdssectionTypeId;
    }

    public boolean getTdsoverrideThreshold() {
        return tdsoverrideThreshold;
    }

    public void setTdsoverrideThreshold(boolean tdsoverrideThreshold) {
        this.tdsoverrideThreshold = tdsoverrideThreshold;
    }

    public ReferenceType getApaccountRef() {
        return apaccountRef;
    }

    public void setApaccountRef(ReferenceType apaccountRef) {
        this.apaccountRef = apaccountRef;
    }

    public String getGstregistrationType() {
        return gstregistrationType;
    }

    public void setGstregistrationType(String gstregistrationType) {
        this.gstregistrationType = gstregistrationType;
    }

    public String getCisrate() {
        return cisrate;
    }

    public void setCisrate(String cisrate) {
        this.cisrate = cisrate;
    }
}

public static class VendorBankAccountDetail {
    private String bankBranchIdentifier;
    private String bankAccountNumber;
    private String bankAccountName;
    private String statementText;

    public VendorBankAccountDetail() {}

    public VendorBankAccountDetail(String bankBranchIdentifier, String bankAccountNumber, String bankAccountName, String statementText) {
        this.bankBranchIdentifier = bankBranchIdentifier;
        this.bankAccountNumber = bankAccountNumber;
        this.bankAccountName = bankAccountName;
        this.statementText = statementText;
    }

    public String getBankBranchIdentifier() {
        return bankBranchIdentifier;
    }

    public void setBankBranchIdentifier(String bankBranchIdentifier) {
        this.bankBranchIdentifier = bankBranchIdentifier;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getStatementText() {
        return statementText;
    }

    public void setStatementText(String statementText) {
        this.statementText = statementText;
    }
}

public static class WebSiteAddress {
    private String id;
    private String uri;
    private String tag;
    private boolean _default;

    public WebSiteAddress() {}

    public WebSiteAddress(String id, String uri, String tag, boolean _default) {
        this.id = id;
        this.uri = uri;
        this.tag = tag;
        this._default = _default;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean get_default() {
        return _default;
    }

    public void set_default(boolean _default) {
        this._default = _default;
    }
}

public static class AccountBalance {
    private double available;
    private double current;
    private double limit;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;
    private String lastUpdatedDatetime;

    public AccountBalance() {}

    public AccountBalance(double available, double current, double limit, String isoCurrencyCode, String unofficialCurrencyCode, String lastUpdatedDatetime) {
        this.available = available;
        this.current = current;
        this.limit = limit;
        this.isoCurrencyCode = isoCurrencyCode;
        this.unofficialCurrencyCode = unofficialCurrencyCode;
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    public void setIsoCurrencyCode(String isoCurrencyCode) {
        this.isoCurrencyCode = isoCurrencyCode;
    }

    public String getUnofficialCurrencyCode() {
        return unofficialCurrencyCode;
    }

    public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
        this.unofficialCurrencyCode = unofficialCurrencyCode;
    }

    public String getLastUpdatedDatetime() {
        return lastUpdatedDatetime;
    }

    public void setLastUpdatedDatetime(String lastUpdatedDatetime) {
        this.lastUpdatedDatetime = lastUpdatedDatetime;
    }
}

public static class AccountBase {
    private String accountId;
    private AccountBalance balances;
    private String mask;
    private String name;
    private String officialName;
    public enum Type {
        INVESTMENT,
        CREDIT,
        DEPOSITORY,
        LOAN,
        BROKERAGE,
        OTHER,
        ENUM_UNKNOWN,
    }
    private Type type;
    public enum Subtype {
        _401A,
        _401K,
        _403B,
        _457B,
        _529,
        BROKERAGE,
        CASH_ISA,
        CRYPTO_EXCHANGE,
        EDUCATION_SAVINGS_ACCOUNT,
        EBT,
        FIXED_ANNUITY,
        GIC,
        HEALTH_REIMBURSEMENT_ARRANGEMENT,
        HSA,
        ISA,
        IRA,
        LIF,
        LIFE_INSURANCE,
        LIRA,
        LRIF,
        LRSP,
        NON_CUSTODIAL_WALLET,
        NON_TAXABLE_BROKERAGE_ACCOUNT,
        OTHER,
        OTHER_INSURANCE,
        OTHER_ANNUITY,
        PRIF,
        RDSP,
        RESP,
        RLIF,
        RRIF,
        PENSION,
        PROFIT_SHARING_PLAN,
        RETIREMENT,
        ROTH,
        ROTH_401K,
        RRSP,
        SEP_IRA,
        SIMPLE_IRA,
        SIPP,
        STOCK_PLAN,
        THRIFT_SAVINGS_PLAN,
        TFSA,
        TRUST,
        UGMA,
        UTMA,
        VARIABLE_ANNUITY,
        CREDIT_CARD,
        PAYPAL,
        CD,
        CHECKING,
        SAVINGS,
        MONEY_MARKET,
        PREPAID,
        AUTO,
        BUSINESS,
        COMMERCIAL,
        CONSTRUCTION,
        CONSUMER,
        HOME_EQUITY,
        LOAN,
        MORTGAGE,
        OVERDRAFT,
        LINE_OF_CREDIT,
        STUDENT,
        CASH_MANAGEMENT,
        KEOGH,
        MUTUAL_FUND,
        RECURRING,
        REWARDS,
        SAFE_DEPOSIT,
        SARSEP,
        PAYROLL,
        NULL,
        ENUM_UNKNOWN,
    }
    private Subtype subtype;
    public enum VerificationStatus {
        AUTOMATICALLY_VERIFIED,
        PENDING_AUTOMATIC_VERIFICATION,
        PENDING_MANUAL_VERIFICATION,
        MANUALLY_VERIFIED,
        VERIFICATION_EXPIRED,
        VERIFICATION_FAILED,
    }
    private VerificationStatus verificationStatus;

    public AccountBase() {}

    public AccountBase(String accountId, AccountBalance balances, String mask, String name, String officialName, Type type, Subtype subtype, VerificationStatus verificationStatus) {
        this.accountId = accountId;
        this.balances = balances;
        this.mask = mask;
        this.name = name;
        this.officialName = officialName;
        this.type = type;
        this.subtype = subtype;
        this.verificationStatus = verificationStatus;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AccountBalance getBalances() {
        return balances;
    }

    public void setBalances(AccountBalance balances) {
        this.balances = balances;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Subtype getSubtype() {
        return subtype;
    }

    public void setSubtype(Subtype subtype) {
        this.subtype = subtype;
    }

    public VerificationStatus getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
}

public static class AuthMetadata {
    private AuthSupportedMethods supportedMethods;

    public AuthMetadata() {}

    public AuthMetadata(AuthSupportedMethods supportedMethods) {
        this.supportedMethods = supportedMethods;
    }

    public AuthSupportedMethods getSupportedMethods() {
        return supportedMethods;
    }

    public void setSupportedMethods(AuthSupportedMethods supportedMethods) {
        this.supportedMethods = supportedMethods;
    }
}

public static class AuthSupportedMethods {
    private boolean instantAuth;
    private boolean instantMatch;
    private boolean automatedMicroDeposits;

    public AuthSupportedMethods() {}

    public AuthSupportedMethods(boolean instantAuth, boolean instantMatch, boolean automatedMicroDeposits) {
        this.instantAuth = instantAuth;
        this.instantMatch = instantMatch;
        this.automatedMicroDeposits = automatedMicroDeposits;
    }

    public boolean getInstantAuth() {
        return instantAuth;
    }

    public void setInstantAuth(boolean instantAuth) {
        this.instantAuth = instantAuth;
    }

    public boolean getInstantMatch() {
        return instantMatch;
    }

    public void setInstantMatch(boolean instantMatch) {
        this.instantMatch = instantMatch;
    }

    public boolean getAutomatedMicroDeposits() {
        return automatedMicroDeposits;
    }

    public void setAutomatedMicroDeposits(boolean automatedMicroDeposits) {
        this.automatedMicroDeposits = automatedMicroDeposits;
    }
}

public static class BankAccountDetail {
    private NumbersACH bankNumber;
    private AccountBase bankAccount;
    private Institution institution;

    public BankAccountDetail() {}

    public BankAccountDetail(NumbersACH bankNumber, AccountBase bankAccount, Institution institution) {
        this.bankNumber = bankNumber;
        this.bankAccount = bankAccount;
        this.institution = institution;
    }

    public NumbersACH getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(NumbersACH bankNumber) {
        this.bankNumber = bankNumber;
    }

    public AccountBase getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(AccountBase bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Institution getInstitution() {
        return institution;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
}

public static class HealthIncident {
    private String startDate;
    private String endDate;
    private String title;
    private List<IncidentUpdate> incidentUpdates;

    public HealthIncident() {}

    public HealthIncident(String startDate, String endDate, String title, List<IncidentUpdate> incidentUpdates) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.incidentUpdates = incidentUpdates;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<IncidentUpdate> getIncidentUpdates() {
        return incidentUpdates;
    }

    public void setIncidentUpdates(List<IncidentUpdate> incidentUpdates) {
        this.incidentUpdates = incidentUpdates;
    }
}

public static class IncidentUpdate {
    private String description;
    public enum Status {
        INVESTIGATING,
        IDENTIFIED,
        SCHEDULED,
        RESOLVED,
        UNKNOWN,
    }
    private Status status;
    private String updatedDate;

    public IncidentUpdate() {}

    public IncidentUpdate(String description, Status status, String updatedDate) {
        this.description = description;
        this.status = status;
        this.updatedDate = updatedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
}

public static class Institution {
    private String institutionId;
    private String name;
    private List<String> products;
    private List<String> countryCodes;
    private String url;
    private String primaryColor;
    private String logo;
    private List<String> routingNumbers;
    private boolean oauth;
    private InstitutionStatus status;
    private PaymentInitiationMetadata paymentInitiationMetadata;
    private AuthMetadata authMetadata;

    public Institution() {}

    public Institution(String institutionId, String name, List<String> products, List<String> countryCodes, String url, String primaryColor, String logo, List<String> routingNumbers, boolean oauth, InstitutionStatus status, PaymentInitiationMetadata paymentInitiationMetadata, AuthMetadata authMetadata) {
        this.institutionId = institutionId;
        this.name = name;
        this.products = products;
        this.countryCodes = countryCodes;
        this.url = url;
        this.primaryColor = primaryColor;
        this.logo = logo;
        this.routingNumbers = routingNumbers;
        this.oauth = oauth;
        this.status = status;
        this.paymentInitiationMetadata = paymentInitiationMetadata;
        this.authMetadata = authMetadata;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<String> getRoutingNumbers() {
        return routingNumbers;
    }

    public void setRoutingNumbers(List<String> routingNumbers) {
        this.routingNumbers = routingNumbers;
    }

    public boolean getOauth() {
        return oauth;
    }

    public void setOauth(boolean oauth) {
        this.oauth = oauth;
    }

    public InstitutionStatus getStatus() {
        return status;
    }

    public void setStatus(InstitutionStatus status) {
        this.status = status;
    }

    public PaymentInitiationMetadata getPaymentInitiationMetadata() {
        return paymentInitiationMetadata;
    }

    public void setPaymentInitiationMetadata(PaymentInitiationMetadata paymentInitiationMetadata) {
        this.paymentInitiationMetadata = paymentInitiationMetadata;
    }

    public AuthMetadata getAuthMetadata() {
        return authMetadata;
    }

    public void setAuthMetadata(AuthMetadata authMetadata) {
        this.authMetadata = authMetadata;
    }
}

public static class InstitutionStatus {
    private ProductStatus itemLogins;
    private ProductStatus transactionsUpdates;
    private ProductStatus auth;
    private ProductStatus identity;
    private ProductStatus investmentsUpdates;
    private ProductStatus liabilitiesUpdates;
    private ProductStatus liabilities;
    private ProductStatus investments;
    private List<HealthIncident> healthIncidents;

    public InstitutionStatus() {}

    public InstitutionStatus(ProductStatus itemLogins, ProductStatus transactionsUpdates, ProductStatus auth, ProductStatus identity, ProductStatus investmentsUpdates, ProductStatus liabilitiesUpdates, ProductStatus liabilities, ProductStatus investments, List<HealthIncident> healthIncidents) {
        this.itemLogins = itemLogins;
        this.transactionsUpdates = transactionsUpdates;
        this.auth = auth;
        this.identity = identity;
        this.investmentsUpdates = investmentsUpdates;
        this.liabilitiesUpdates = liabilitiesUpdates;
        this.liabilities = liabilities;
        this.investments = investments;
        this.healthIncidents = healthIncidents;
    }

    public ProductStatus getItemLogins() {
        return itemLogins;
    }

    public void setItemLogins(ProductStatus itemLogins) {
        this.itemLogins = itemLogins;
    }

    public ProductStatus getTransactionsUpdates() {
        return transactionsUpdates;
    }

    public void setTransactionsUpdates(ProductStatus transactionsUpdates) {
        this.transactionsUpdates = transactionsUpdates;
    }

    public ProductStatus getAuth() {
        return auth;
    }

    public void setAuth(ProductStatus auth) {
        this.auth = auth;
    }

    public ProductStatus getIdentity() {
        return identity;
    }

    public void setIdentity(ProductStatus identity) {
        this.identity = identity;
    }

    public ProductStatus getInvestmentsUpdates() {
        return investmentsUpdates;
    }

    public void setInvestmentsUpdates(ProductStatus investmentsUpdates) {
        this.investmentsUpdates = investmentsUpdates;
    }

    public ProductStatus getLiabilitiesUpdates() {
        return liabilitiesUpdates;
    }

    public void setLiabilitiesUpdates(ProductStatus liabilitiesUpdates) {
        this.liabilitiesUpdates = liabilitiesUpdates;
    }

    public ProductStatus getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(ProductStatus liabilities) {
        this.liabilities = liabilities;
    }

    public ProductStatus getInvestments() {
        return investments;
    }

    public void setInvestments(ProductStatus investments) {
        this.investments = investments;
    }

    public List<HealthIncident> getHealthIncidents() {
        return healthIncidents;
    }

    public void setHealthIncidents(List<HealthIncident> healthIncidents) {
        this.healthIncidents = healthIncidents;
    }
}

public static class PaymentInitiationMetadata {
    private boolean supportsInternationalPayments;
    private boolean supportsSepaInstant;
    private Object maximumPaymentAmount;
    private boolean supportsRefundDetails;
    private PaymentInitiationStandingOrderMetadata standingOrderMetadata;

    public PaymentInitiationMetadata() {}

    public PaymentInitiationMetadata(boolean supportsInternationalPayments, boolean supportsSepaInstant, Object maximumPaymentAmount, boolean supportsRefundDetails, PaymentInitiationStandingOrderMetadata standingOrderMetadata) {
        this.supportsInternationalPayments = supportsInternationalPayments;
        this.supportsSepaInstant = supportsSepaInstant;
        this.maximumPaymentAmount = maximumPaymentAmount;
        this.supportsRefundDetails = supportsRefundDetails;
        this.standingOrderMetadata = standingOrderMetadata;
    }

    public boolean getSupportsInternationalPayments() {
        return supportsInternationalPayments;
    }

    public void setSupportsInternationalPayments(boolean supportsInternationalPayments) {
        this.supportsInternationalPayments = supportsInternationalPayments;
    }

    public boolean getSupportsSepaInstant() {
        return supportsSepaInstant;
    }

    public void setSupportsSepaInstant(boolean supportsSepaInstant) {
        this.supportsSepaInstant = supportsSepaInstant;
    }

    public Object getMaximumPaymentAmount() {
        return maximumPaymentAmount;
    }

    public void setMaximumPaymentAmount(Object maximumPaymentAmount) {
        this.maximumPaymentAmount = maximumPaymentAmount;
    }

    public boolean getSupportsRefundDetails() {
        return supportsRefundDetails;
    }

    public void setSupportsRefundDetails(boolean supportsRefundDetails) {
        this.supportsRefundDetails = supportsRefundDetails;
    }

    public PaymentInitiationStandingOrderMetadata getStandingOrderMetadata() {
        return standingOrderMetadata;
    }

    public void setStandingOrderMetadata(PaymentInitiationStandingOrderMetadata standingOrderMetadata) {
        this.standingOrderMetadata = standingOrderMetadata;
    }
}

public static class PaymentInitiationStandingOrderMetadata {
    private boolean supportsStandingOrderEndDate;
    private boolean supportsStandingOrderNegativeExecutionDays;
    private List<String> validStandingOrderIntervals;

    public PaymentInitiationStandingOrderMetadata() {}

    public PaymentInitiationStandingOrderMetadata(boolean supportsStandingOrderEndDate, boolean supportsStandingOrderNegativeExecutionDays, List<String> validStandingOrderIntervals) {
        this.supportsStandingOrderEndDate = supportsStandingOrderEndDate;
        this.supportsStandingOrderNegativeExecutionDays = supportsStandingOrderNegativeExecutionDays;
        this.validStandingOrderIntervals = validStandingOrderIntervals;
    }

    public boolean getSupportsStandingOrderEndDate() {
        return supportsStandingOrderEndDate;
    }

    public void setSupportsStandingOrderEndDate(boolean supportsStandingOrderEndDate) {
        this.supportsStandingOrderEndDate = supportsStandingOrderEndDate;
    }

    public boolean getSupportsStandingOrderNegativeExecutionDays() {
        return supportsStandingOrderNegativeExecutionDays;
    }

    public void setSupportsStandingOrderNegativeExecutionDays(boolean supportsStandingOrderNegativeExecutionDays) {
        this.supportsStandingOrderNegativeExecutionDays = supportsStandingOrderNegativeExecutionDays;
    }

    public List<String> getValidStandingOrderIntervals() {
        return validStandingOrderIntervals;
    }

    public void setValidStandingOrderIntervals(List<String> validStandingOrderIntervals) {
        this.validStandingOrderIntervals = validStandingOrderIntervals;
    }
}

public static class ProductStatus {
    public enum Status {
        HEALTHY,
        DEGRADED,
        DOWN,
    }
    private Status status;
    private String lastStatusChange;
    private ProductStatusBreakdown breakdown;

    public ProductStatus() {}

    public ProductStatus(Status status, String lastStatusChange, ProductStatusBreakdown breakdown) {
        this.status = status;
        this.lastStatusChange = lastStatusChange;
        this.breakdown = breakdown;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getLastStatusChange() {
        return lastStatusChange;
    }

    public void setLastStatusChange(String lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    public ProductStatusBreakdown getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(ProductStatusBreakdown breakdown) {
        this.breakdown = breakdown;
    }
}

public static class ProductStatusBreakdown {
    private double success;
    private double errorPlaid;
    private double errorInstitution;
    public enum RefreshInterval {
        NORMAL,
        DELAYED,
        STOPPED,
    }
    private RefreshInterval refreshInterval;

    public ProductStatusBreakdown() {}

    public ProductStatusBreakdown(double success, double errorPlaid, double errorInstitution, RefreshInterval refreshInterval) {
        this.success = success;
        this.errorPlaid = errorPlaid;
        this.errorInstitution = errorInstitution;
        this.refreshInterval = refreshInterval;
    }

    public double getSuccess() {
        return success;
    }

    public void setSuccess(double success) {
        this.success = success;
    }

    public double getErrorPlaid() {
        return errorPlaid;
    }

    public void setErrorPlaid(double errorPlaid) {
        this.errorPlaid = errorPlaid;
    }

    public double getErrorInstitution() {
        return errorInstitution;
    }

    public void setErrorInstitution(double errorInstitution) {
        this.errorInstitution = errorInstitution;
    }

    public RefreshInterval getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(RefreshInterval refreshInterval) {
        this.refreshInterval = refreshInterval;
    }
}

public static class BulkNonprofitUserUpdate {
    private List<NonprofitUser> users;
    private boolean sendEmail;

    public BulkNonprofitUserUpdate() {}

    public BulkNonprofitUserUpdate(List<NonprofitUser> users, boolean sendEmail) {
        this.users = users;
        this.sendEmail = sendEmail;
    }

    public List<NonprofitUser> getUsers() {
        return users;
    }

    public void setUsers(List<NonprofitUser> users) {
        this.users = users;
    }

    public boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }
}

public static class FoundationNonprofitActivity {
    private List<FoundationNotes> notes;
    private List<Task> completedTasks;
    private List<GrantSubmissionStatusChange> submissions;
    private List<NylasThreadGroup> threads;

    public FoundationNonprofitActivity() {}

    public FoundationNonprofitActivity(List<FoundationNotes> notes, List<Task> completedTasks, List<GrantSubmissionStatusChange> submissions, List<NylasThreadGroup> threads) {
        this.notes = notes;
        this.completedTasks = completedTasks;
        this.submissions = submissions;
        this.threads = threads;
    }

    public List<FoundationNotes> getNotes() {
        return notes;
    }

    public void setNotes(List<FoundationNotes> notes) {
        this.notes = notes;
    }

    public List<Task> getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(List<Task> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public List<GrantSubmissionStatusChange> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<GrantSubmissionStatusChange> submissions) {
        this.submissions = submissions;
    }

    public List<NylasThreadGroup> getThreads() {
        return threads;
    }

    public void setThreads(List<NylasThreadGroup> threads) {
        this.threads = threads;
    }
}

public static class GrantSubmissionStatusChange {
    private String id;
    private String submissionId;
    public enum ChangeType {
        STAGE,
    }
    private ChangeType changeType;
    private StatusChangeData previousData;
    private StatusChangeData newData;
    private String createdBy;
    private String created;
    private FoundationUser createdByFoundationUser;
    private NonprofitUser createdByNonprofitUser;
    private GrantProposalSubmission submission;

    public GrantSubmissionStatusChange() {}

    public GrantSubmissionStatusChange(String id, String submissionId, ChangeType changeType, StatusChangeData previousData, StatusChangeData newData, String createdBy, String created, FoundationUser createdByFoundationUser, NonprofitUser createdByNonprofitUser, GrantProposalSubmission submission) {
        this.id = id;
        this.submissionId = submissionId;
        this.changeType = changeType;
        this.previousData = previousData;
        this.newData = newData;
        this.createdBy = createdBy;
        this.created = created;
        this.createdByFoundationUser = createdByFoundationUser;
        this.createdByNonprofitUser = createdByNonprofitUser;
        this.submission = submission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public ChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeType changeType) {
        this.changeType = changeType;
    }

    public StatusChangeData getPreviousData() {
        return previousData;
    }

    public void setPreviousData(StatusChangeData previousData) {
        this.previousData = previousData;
    }

    public StatusChangeData getNewData() {
        return newData;
    }

    public void setNewData(StatusChangeData newData) {
        this.newData = newData;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public FoundationUser getCreatedByFoundationUser() {
        return createdByFoundationUser;
    }

    public void setCreatedByFoundationUser(FoundationUser createdByFoundationUser) {
        this.createdByFoundationUser = createdByFoundationUser;
    }

    public NonprofitUser getCreatedByNonprofitUser() {
        return createdByNonprofitUser;
    }

    public void setCreatedByNonprofitUser(NonprofitUser createdByNonprofitUser) {
        this.createdByNonprofitUser = createdByNonprofitUser;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }
}

public static class NylasFolder {
    private String displayName;
    private String id;
    private String name;

    public NylasFolder() {}

    public NylasFolder(String displayName, String id, String name) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public static class NylasLabel {
    private String displayName;
    private String id;
    private String name;
    private String providerId;

    public NylasLabel() {}

    public NylasLabel(String displayName, String id, String name, String providerId) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.providerId = providerId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}

public static class NylasParticipant {
    private String name;
    private String email;

    public NylasParticipant() {}

    public NylasParticipant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public static class NylasThread {
    private String accountId;
    private String firstMessageTimestamp;
    private List<NylasFolder> folders;
    private boolean hasAttachments;
    private String id;
    private String lastMessageReceivedTimestamp;
    private String lastMessageSentTimestamp;
    private String lastMessageTimestamp;
    private String object;
    private List<NylasParticipant> participants;
    private String snippet;
    private boolean starred;
    private String subject;
    private boolean unread;
    private int version;
    private List<NylasLabel> labels;
    private List<String> draftIds;
    private List<String> messageIds;

    public NylasThread() {}

    public NylasThread(String accountId, String firstMessageTimestamp, List<NylasFolder> folders, boolean hasAttachments, String id, String lastMessageReceivedTimestamp, String lastMessageSentTimestamp, String lastMessageTimestamp, String object, List<NylasParticipant> participants, String snippet, boolean starred, String subject, boolean unread, int version, List<NylasLabel> labels, List<String> draftIds, List<String> messageIds) {
        this.accountId = accountId;
        this.firstMessageTimestamp = firstMessageTimestamp;
        this.folders = folders;
        this.hasAttachments = hasAttachments;
        this.id = id;
        this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
        this.lastMessageSentTimestamp = lastMessageSentTimestamp;
        this.lastMessageTimestamp = lastMessageTimestamp;
        this.object = object;
        this.participants = participants;
        this.snippet = snippet;
        this.starred = starred;
        this.subject = subject;
        this.unread = unread;
        this.version = version;
        this.labels = labels;
        this.draftIds = draftIds;
        this.messageIds = messageIds;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFirstMessageTimestamp() {
        return firstMessageTimestamp;
    }

    public void setFirstMessageTimestamp(String firstMessageTimestamp) {
        this.firstMessageTimestamp = firstMessageTimestamp;
    }

    public List<NylasFolder> getFolders() {
        return folders;
    }

    public void setFolders(List<NylasFolder> folders) {
        this.folders = folders;
    }

    public boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastMessageReceivedTimestamp() {
        return lastMessageReceivedTimestamp;
    }

    public void setLastMessageReceivedTimestamp(String lastMessageReceivedTimestamp) {
        this.lastMessageReceivedTimestamp = lastMessageReceivedTimestamp;
    }

    public String getLastMessageSentTimestamp() {
        return lastMessageSentTimestamp;
    }

    public void setLastMessageSentTimestamp(String lastMessageSentTimestamp) {
        this.lastMessageSentTimestamp = lastMessageSentTimestamp;
    }

    public String getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    public void setLastMessageTimestamp(String lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<NylasParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<NylasParticipant> participants) {
        this.participants = participants;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public boolean getStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean getUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<NylasLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NylasLabel> labels) {
        this.labels = labels;
    }

    public List<String> getDraftIds() {
        return draftIds;
    }

    public void setDraftIds(List<String> draftIds) {
        this.draftIds = draftIds;
    }

    public List<String> getMessageIds() {
        return messageIds;
    }

    public void setMessageIds(List<String> messageIds) {
        this.messageIds = messageIds;
    }
}

public static class NylasThreadGroup {
    private String id;
    private String userId;
    private String nonprofitId;
    private String foundationId;
    private NylasThread threadData;
    private String lastMessageTimestamp;
    private String created;
    private String updated;

    public NylasThreadGroup() {}

    public NylasThreadGroup(String id, String userId, String nonprofitId, String foundationId, NylasThread threadData, String lastMessageTimestamp, String created, String updated) {
        this.id = id;
        this.userId = userId;
        this.nonprofitId = nonprofitId;
        this.foundationId = foundationId;
        this.threadData = threadData;
        this.lastMessageTimestamp = lastMessageTimestamp;
        this.created = created;
        this.updated = updated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public NylasThread getThreadData() {
        return threadData;
    }

    public void setThreadData(NylasThread threadData) {
        this.threadData = threadData;
    }

    public String getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    public void setLastMessageTimestamp(String lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class StatusChangeData {
    private String stage;

    public StatusChangeData() {}

    public StatusChangeData(String stage) {
        this.stage = stage;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}

public static class PostmarkMessage {
    private String tag;
    private String messageId;
    private String messageStream;
    private List<PostmarkRecipient> to;
    private List<PostmarkRecipient> cc;
    private List<PostmarkRecipient> bcc;
    private List<String> recipients;
    private String receivedAt;
    private String from;
    private String subject;
    private List<String> attachments;
    private String status;
    private boolean trackOpens;
    private String trackLinks;
    private Object metadata;
    private boolean sandboxed;
    private String textBody;
    private String htmlBody;
    private String body;
    private List<PostmarkMessageEvent> messageEvents;

    public PostmarkMessage() {}

    public PostmarkMessage(String tag, String messageId, String messageStream, List<PostmarkRecipient> to, List<PostmarkRecipient> cc, List<PostmarkRecipient> bcc, List<String> recipients, String receivedAt, String from, String subject, List<String> attachments, String status, boolean trackOpens, String trackLinks, Object metadata, boolean sandboxed, String textBody, String htmlBody, String body, List<PostmarkMessageEvent> messageEvents) {
        this.tag = tag;
        this.messageId = messageId;
        this.messageStream = messageStream;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.recipients = recipients;
        this.receivedAt = receivedAt;
        this.from = from;
        this.subject = subject;
        this.attachments = attachments;
        this.status = status;
        this.trackOpens = trackOpens;
        this.trackLinks = trackLinks;
        this.metadata = metadata;
        this.sandboxed = sandboxed;
        this.textBody = textBody;
        this.htmlBody = htmlBody;
        this.body = body;
        this.messageEvents = messageEvents;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageStream() {
        return messageStream;
    }

    public void setMessageStream(String messageStream) {
        this.messageStream = messageStream;
    }

    public List<PostmarkRecipient> getTo() {
        return to;
    }

    public void setTo(List<PostmarkRecipient> to) {
        this.to = to;
    }

    public List<PostmarkRecipient> getCc() {
        return cc;
    }

    public void setCc(List<PostmarkRecipient> cc) {
        this.cc = cc;
    }

    public List<PostmarkRecipient> getBcc() {
        return bcc;
    }

    public void setBcc(List<PostmarkRecipient> bcc) {
        this.bcc = bcc;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
        this.attachments = attachments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getTrackOpens() {
        return trackOpens;
    }

    public void setTrackOpens(boolean trackOpens) {
        this.trackOpens = trackOpens;
    }

    public String getTrackLinks() {
        return trackLinks;
    }

    public void setTrackLinks(String trackLinks) {
        this.trackLinks = trackLinks;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public boolean getSandboxed() {
        return sandboxed;
    }

    public void setSandboxed(boolean sandboxed) {
        this.sandboxed = sandboxed;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<PostmarkMessageEvent> getMessageEvents() {
        return messageEvents;
    }

    public void setMessageEvents(List<PostmarkMessageEvent> messageEvents) {
        this.messageEvents = messageEvents;
    }
}

public static class PostmarkMessageEvent {
    private String recipient;
    private String type;
    private String receivedAt;
    private PostmarkMessageEventDetails details;

    public PostmarkMessageEvent() {}

    public PostmarkMessageEvent(String recipient, String type, String receivedAt, PostmarkMessageEventDetails details) {
        this.recipient = recipient;
        this.type = type;
        this.receivedAt = receivedAt;
        this.details = details;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public PostmarkMessageEventDetails getDetails() {
        return details;
    }

    public void setDetails(PostmarkMessageEventDetails details) {
        this.details = details;
    }
}

public static class PostmarkMessageEventDetails {
    private String deliveryMessage;
    private String destinationServer;
    private String destinationIp;

    public PostmarkMessageEventDetails() {}

    public PostmarkMessageEventDetails(String deliveryMessage, String destinationServer, String destinationIp) {
        this.deliveryMessage = deliveryMessage;
        this.destinationServer = destinationServer;
        this.destinationIp = destinationIp;
    }

    public String getDeliveryMessage() {
        return deliveryMessage;
    }

    public void setDeliveryMessage(String deliveryMessage) {
        this.deliveryMessage = deliveryMessage;
    }

    public String getDestinationServer() {
        return destinationServer;
    }

    public void setDestinationServer(String destinationServer) {
        this.destinationServer = destinationServer;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }
}

public static class PostmarkOutboundSearchResponse {
    private int totalCount;
    private List<PostmarkMessage> messages;

    public PostmarkOutboundSearchResponse() {}

    public PostmarkOutboundSearchResponse(int totalCount, List<PostmarkMessage> messages) {
        this.totalCount = totalCount;
        this.messages = messages;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<PostmarkMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<PostmarkMessage> messages) {
        this.messages = messages;
    }
}

public static class PostmarkRecipient {
    private String email;
    private String name;

    public PostmarkRecipient() {}

    public PostmarkRecipient(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public static class HTMLRequest {
    private String html;
    private List<String> documentHtmls;

    public HTMLRequest() {}

    public HTMLRequest(String html, List<String> documentHtmls) {
        this.html = html;
        this.documentHtmls = documentHtmls;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public List<String> getDocumentHtmls() {
        return documentHtmls;
    }

    public void setDocumentHtmls(List<String> documentHtmls) {
        this.documentHtmls = documentHtmls;
    }
}

public static class SubmissionRequest {
    private String htmlRequest;
    private String submissionId;
    private String boardDocumentId;
    private int formIndex;
    private boolean merged;
    private boolean moveSubmissionToBottom;

    public SubmissionRequest() {}

    public SubmissionRequest(String htmlRequest, String submissionId, String boardDocumentId, int formIndex, boolean merged, boolean moveSubmissionToBottom) {
        this.htmlRequest = htmlRequest;
        this.submissionId = submissionId;
        this.boardDocumentId = boardDocumentId;
        this.formIndex = formIndex;
        this.merged = merged;
        this.moveSubmissionToBottom = moveSubmissionToBottom;
    }

    public String getHtmlRequest() {
        return htmlRequest;
    }

    public void setHtmlRequest(String htmlRequest) {
        this.htmlRequest = htmlRequest;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getBoardDocumentId() {
        return boardDocumentId;
    }

    public void setBoardDocumentId(String boardDocumentId) {
        this.boardDocumentId = boardDocumentId;
    }

    public int getFormIndex() {
        return formIndex;
    }

    public void setFormIndex(int formIndex) {
        this.formIndex = formIndex;
    }

    public boolean getMerged() {
        return merged;
    }

    public void setMerged(boolean merged) {
        this.merged = merged;
    }

    public boolean getMoveSubmissionToBottom() {
        return moveSubmissionToBottom;
    }

    public void setMoveSubmissionToBottom(boolean moveSubmissionToBottom) {
        this.moveSubmissionToBottom = moveSubmissionToBottom;
    }
}

public static class GrantTemplate {
    private String id;
    private String templateName;
    public enum TemplateType {
        SYSTEM,
        USER,
    }
    private TemplateType templateType;
    public enum FormatType {
        GRANT_FORM,
        ELIGIBILITY,
    }
    private FormatType formatType;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private List<FormItem> components;
    private String created;
    private String updated;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;

    public GrantTemplate() {}

    public GrantTemplate(String id, String templateName, TemplateType templateType, FormatType formatType, String foundationId, String createdBy, String updatedBy, List<FormItem> components, String created, String updated, FoundationUser createdByUser, FoundationUser updatedByUser) {
        this.id = id;
        this.templateName = templateName;
        this.templateType = templateType;
        this.formatType = formatType;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.components = components;
        this.created = created;
        this.updated = updated;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TemplateType getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
    }

    public FormatType getFormatType() {
        return formatType;
    }

    public void setFormatType(FormatType formatType) {
        this.formatType = formatType;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class BulkActionRequest {
    private List<String> submissionIds;
    private List<BulkCreatePaymentRequest> bulkCreatePaymentRequest;
    private List<BulkCreateReportRequest> bulkCreateReportRequest;
    private List<BulkCreateReminderRequest> bulkCreateReminderRequest;

    public BulkActionRequest() {}

    public BulkActionRequest(List<String> submissionIds, List<BulkCreatePaymentRequest> bulkCreatePaymentRequest, List<BulkCreateReportRequest> bulkCreateReportRequest, List<BulkCreateReminderRequest> bulkCreateReminderRequest) {
        this.submissionIds = submissionIds;
        this.bulkCreatePaymentRequest = bulkCreatePaymentRequest;
        this.bulkCreateReportRequest = bulkCreateReportRequest;
        this.bulkCreateReminderRequest = bulkCreateReminderRequest;
    }

    public List<String> getSubmissionIds() {
        return submissionIds;
    }

    public void setSubmissionIds(List<String> submissionIds) {
        this.submissionIds = submissionIds;
    }

    public List<BulkCreatePaymentRequest> getBulkCreatePaymentRequest() {
        return bulkCreatePaymentRequest;
    }

    public void setBulkCreatePaymentRequest(List<BulkCreatePaymentRequest> bulkCreatePaymentRequest) {
        this.bulkCreatePaymentRequest = bulkCreatePaymentRequest;
    }

    public List<BulkCreateReportRequest> getBulkCreateReportRequest() {
        return bulkCreateReportRequest;
    }

    public void setBulkCreateReportRequest(List<BulkCreateReportRequest> bulkCreateReportRequest) {
        this.bulkCreateReportRequest = bulkCreateReportRequest;
    }

    public List<BulkCreateReminderRequest> getBulkCreateReminderRequest() {
        return bulkCreateReminderRequest;
    }

    public void setBulkCreateReminderRequest(List<BulkCreateReminderRequest> bulkCreateReminderRequest) {
        this.bulkCreateReminderRequest = bulkCreateReminderRequest;
    }
}

public static class BulkCreatePaymentRequest {
    private String assigneeId;
    private double amount;
    public enum Type {
        ACH,
        CHECK,
        WIRE,
        STOCK,
        CREDIT_CARD,
    }
    private Type type;
    public enum Status {
        NOT_STARTED,
        CONTINGENT,
        SENT,
        ISSUED,
        CLEARED,
    }
    private Status status;
    private String dueDate;
    private String budgetCategory;
    private String contingencies;
    private String description;

    public BulkCreatePaymentRequest() {}

    public BulkCreatePaymentRequest(String assigneeId, double amount, Type type, Status status, String dueDate, String budgetCategory, String contingencies, String description) {
        this.assigneeId = assigneeId;
        this.amount = amount;
        this.type = type;
        this.status = status;
        this.dueDate = dueDate;
        this.budgetCategory = budgetCategory;
        this.contingencies = contingencies;
        this.description = description;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public String getContingencies() {
        return contingencies;
    }

    public void setContingencies(String contingencies) {
        this.contingencies = contingencies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

public static class BulkCreateReminderRequest {
    private String dueDate;
    private String assigneeId;
    private String reminderDescription;

    public BulkCreateReminderRequest() {}

    public BulkCreateReminderRequest(String dueDate, String assigneeId, String reminderDescription) {
        this.dueDate = dueDate;
        this.assigneeId = assigneeId;
        this.reminderDescription = reminderDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getReminderDescription() {
        return reminderDescription;
    }

    public void setReminderDescription(String reminderDescription) {
        this.reminderDescription = reminderDescription;
    }
}

public static class BulkCreateReportRequest {
    private String reportId;
    private String dueDate;
    private String viewer;
    private List<SubmissionGranteePair> submissionGranteePairs;

    public BulkCreateReportRequest() {}

    public BulkCreateReportRequest(String reportId, String dueDate, String viewer, List<SubmissionGranteePair> submissionGranteePairs) {
        this.reportId = reportId;
        this.dueDate = dueDate;
        this.viewer = viewer;
        this.submissionGranteePairs = submissionGranteePairs;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getViewer() {
        return viewer;
    }

    public void setViewer(String viewer) {
        this.viewer = viewer;
    }

    public List<SubmissionGranteePair> getSubmissionGranteePairs() {
        return submissionGranteePairs;
    }

    public void setSubmissionGranteePairs(List<SubmissionGranteePair> submissionGranteePairs) {
        this.submissionGranteePairs = submissionGranteePairs;
    }
}

public static class SubmissionGranteePair {
    private String submissionId;
    private String nonprofitUser;

    public SubmissionGranteePair() {}

    public SubmissionGranteePair(String submissionId, String nonprofitUser) {
        this.submissionId = submissionId;
        this.nonprofitUser = nonprofitUser;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getNonprofitUser() {
        return nonprofitUser;
    }

    public void setNonprofitUser(String nonprofitUser) {
        this.nonprofitUser = nonprofitUser;
    }
}

public static class GrantSubmissionSearchQuery {
    private int page;
    private int pageSize;
    private String queryText;
    private String pipelineId;
    private List<String> nonprofitIds;
    private List<String> formProposalIds;
    private List<String> tags;
    private List<String> foundationOwners;
    private List<String> stages;
    private String assignedToMe;
    private List<String> assignees;
    private List<String> watchers;
    private boolean movableStages;
    private boolean allPipelines;

    public GrantSubmissionSearchQuery() {}

    public GrantSubmissionSearchQuery(int page, int pageSize, String queryText, String pipelineId, List<String> nonprofitIds, List<String> formProposalIds, List<String> tags, List<String> foundationOwners, List<String> stages, String assignedToMe, List<String> assignees, List<String> watchers, boolean movableStages, boolean allPipelines) {
        this.page = page;
        this.pageSize = pageSize;
        this.queryText = queryText;
        this.pipelineId = pipelineId;
        this.nonprofitIds = nonprofitIds;
        this.formProposalIds = formProposalIds;
        this.tags = tags;
        this.foundationOwners = foundationOwners;
        this.stages = stages;
        this.assignedToMe = assignedToMe;
        this.assignees = assignees;
        this.watchers = watchers;
        this.movableStages = movableStages;
        this.allPipelines = allPipelines;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public List<String> getNonprofitIds() {
        return nonprofitIds;
    }

    public void setNonprofitIds(List<String> nonprofitIds) {
        this.nonprofitIds = nonprofitIds;
    }

    public List<String> getFormProposalIds() {
        return formProposalIds;
    }

    public void setFormProposalIds(List<String> formProposalIds) {
        this.formProposalIds = formProposalIds;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getFoundationOwners() {
        return foundationOwners;
    }

    public void setFoundationOwners(List<String> foundationOwners) {
        this.foundationOwners = foundationOwners;
    }

    public List<String> getStages() {
        return stages;
    }

    public void setStages(List<String> stages) {
        this.stages = stages;
    }

    public String getAssignedToMe() {
        return assignedToMe;
    }

    public void setAssignedToMe(String assignedToMe) {
        this.assignedToMe = assignedToMe;
    }

    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public List<String> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<String> watchers) {
        this.watchers = watchers;
    }

    public boolean getMovableStages() {
        return movableStages;
    }

    public void setMovableStages(boolean movableStages) {
        this.movableStages = movableStages;
    }

    public boolean getAllPipelines() {
        return allPipelines;
    }

    public void setAllPipelines(boolean allPipelines) {
        this.allPipelines = allPipelines;
    }
}

public static class SubmissionComment {
    private String id;
    private String submissionId;
    private String createdBy;
    private String updatedBy;
    public enum Visibility {
        INTERNAL,
        EXTERNAL,
    }
    private Visibility visibility;
    private String comment;
    private String created;
    private String updated;
    private FoundationUser createdByFoundationUser;
    private NonprofitUser createdByNonprofitUser;
    private FoundationUser updatedByFoundationUser;
    private NonprofitUser updatedByNonprofitUser;
    private UserDetails createdByUser;
    private UserDetails updatedByUser;
    private GrantProposalSubmission submission;

    public SubmissionComment() {}

    public SubmissionComment(String id, String submissionId, String createdBy, String updatedBy, Visibility visibility, String comment, String created, String updated, FoundationUser createdByFoundationUser, NonprofitUser createdByNonprofitUser, FoundationUser updatedByFoundationUser, NonprofitUser updatedByNonprofitUser, UserDetails createdByUser, UserDetails updatedByUser, GrantProposalSubmission submission) {
        this.id = id;
        this.submissionId = submissionId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.visibility = visibility;
        this.comment = comment;
        this.created = created;
        this.updated = updated;
        this.createdByFoundationUser = createdByFoundationUser;
        this.createdByNonprofitUser = createdByNonprofitUser;
        this.updatedByFoundationUser = updatedByFoundationUser;
        this.updatedByNonprofitUser = updatedByNonprofitUser;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.submission = submission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByFoundationUser() {
        return createdByFoundationUser;
    }

    public void setCreatedByFoundationUser(FoundationUser createdByFoundationUser) {
        this.createdByFoundationUser = createdByFoundationUser;
    }

    public NonprofitUser getCreatedByNonprofitUser() {
        return createdByNonprofitUser;
    }

    public void setCreatedByNonprofitUser(NonprofitUser createdByNonprofitUser) {
        this.createdByNonprofitUser = createdByNonprofitUser;
    }

    public FoundationUser getUpdatedByFoundationUser() {
        return updatedByFoundationUser;
    }

    public void setUpdatedByFoundationUser(FoundationUser updatedByFoundationUser) {
        this.updatedByFoundationUser = updatedByFoundationUser;
    }

    public NonprofitUser getUpdatedByNonprofitUser() {
        return updatedByNonprofitUser;
    }

    public void setUpdatedByNonprofitUser(NonprofitUser updatedByNonprofitUser) {
        this.updatedByNonprofitUser = updatedByNonprofitUser;
    }

    public UserDetails getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(UserDetails createdByUser) {
        this.createdByUser = createdByUser;
    }

    public UserDetails getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(UserDetails updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }
}

public static class ReviewEntity {
    private FormItem component;
    private List<UserReviewResponse> reviewResponses;

    public ReviewEntity() {}

    public ReviewEntity(FormItem component, List<UserReviewResponse> reviewResponses) {
        this.component = component;
        this.reviewResponses = reviewResponses;
    }

    public FormItem getComponent() {
        return component;
    }

    public void setComponent(FormItem component) {
        this.component = component;
    }

    public List<UserReviewResponse> getReviewResponses() {
        return reviewResponses;
    }

    public void setReviewResponses(List<UserReviewResponse> reviewResponses) {
        this.reviewResponses = reviewResponses;
    }
}

public static class ReviewScores {
    private List<ReviewEntity> reviewEntities;

    public ReviewScores() {}

    public ReviewScores(List<ReviewEntity> reviewEntities) {
        this.reviewEntities = reviewEntities;
    }

    public List<ReviewEntity> getReviewEntities() {
        return reviewEntities;
    }

    public void setReviewEntities(List<ReviewEntity> reviewEntities) {
        this.reviewEntities = reviewEntities;
    }
}

public static class UserReviewResponse {
    private String userId;
    private FormComponentSubmission submission;
    private FoundationUser user;

    public UserReviewResponse() {}

    public UserReviewResponse(String userId, FormComponentSubmission submission, FoundationUser user) {
        this.userId = userId;
        this.submission = submission;
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FormComponentSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(FormComponentSubmission submission) {
        this.submission = submission;
    }

    public FoundationUser getUser() {
        return user;
    }

    public void setUser(FoundationUser user) {
        this.user = user;
    }
}

public static class BulkDownloadRequest {
    private List<String> submissionIds;
    private boolean mergedFiles;
    private int formIndex;
    private boolean includeInternalReviewTasks;
    private boolean includeExternalReviewTasks;
    private boolean inlineImages;

    public BulkDownloadRequest() {}

    public BulkDownloadRequest(List<String> submissionIds, boolean mergedFiles, int formIndex, boolean includeInternalReviewTasks, boolean includeExternalReviewTasks, boolean inlineImages) {
        this.submissionIds = submissionIds;
        this.mergedFiles = mergedFiles;
        this.formIndex = formIndex;
        this.includeInternalReviewTasks = includeInternalReviewTasks;
        this.includeExternalReviewTasks = includeExternalReviewTasks;
        this.inlineImages = inlineImages;
    }

    public List<String> getSubmissionIds() {
        return submissionIds;
    }

    public void setSubmissionIds(List<String> submissionIds) {
        this.submissionIds = submissionIds;
    }

    public boolean getMergedFiles() {
        return mergedFiles;
    }

    public void setMergedFiles(boolean mergedFiles) {
        this.mergedFiles = mergedFiles;
    }

    public int getFormIndex() {
        return formIndex;
    }

    public void setFormIndex(int formIndex) {
        this.formIndex = formIndex;
    }

    public boolean getIncludeInternalReviewTasks() {
        return includeInternalReviewTasks;
    }

    public void setIncludeInternalReviewTasks(boolean includeInternalReviewTasks) {
        this.includeInternalReviewTasks = includeInternalReviewTasks;
    }

    public boolean getIncludeExternalReviewTasks() {
        return includeExternalReviewTasks;
    }

    public void setIncludeExternalReviewTasks(boolean includeExternalReviewTasks) {
        this.includeExternalReviewTasks = includeExternalReviewTasks;
    }

    public boolean getInlineImages() {
        return inlineImages;
    }

    public void setInlineImages(boolean inlineImages) {
        this.inlineImages = inlineImages;
    }
}

public static class GrantProposalSubmissionDeltaResponse {
    private String stage;
    private List<FormItemResponseEntity> oldResponse;
    private List<FormItemResponseEntity> deltaResponse;
    private String created;
    private FoundationUser createdByFoundationUser;
    private NonprofitUser createdByNonprofitUser;

    public GrantProposalSubmissionDeltaResponse() {}

    public GrantProposalSubmissionDeltaResponse(String stage, List<FormItemResponseEntity> oldResponse, List<FormItemResponseEntity> deltaResponse, String created, FoundationUser createdByFoundationUser, NonprofitUser createdByNonprofitUser) {
        this.stage = stage;
        this.oldResponse = oldResponse;
        this.deltaResponse = deltaResponse;
        this.created = created;
        this.createdByFoundationUser = createdByFoundationUser;
        this.createdByNonprofitUser = createdByNonprofitUser;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public List<FormItemResponseEntity> getOldResponse() {
        return oldResponse;
    }

    public void setOldResponse(List<FormItemResponseEntity> oldResponse) {
        this.oldResponse = oldResponse;
    }

    public List<FormItemResponseEntity> getDeltaResponse() {
        return deltaResponse;
    }

    public void setDeltaResponse(List<FormItemResponseEntity> deltaResponse) {
        this.deltaResponse = deltaResponse;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public FoundationUser getCreatedByFoundationUser() {
        return createdByFoundationUser;
    }

    public void setCreatedByFoundationUser(FoundationUser createdByFoundationUser) {
        this.createdByFoundationUser = createdByFoundationUser;
    }

    public NonprofitUser getCreatedByNonprofitUser() {
        return createdByNonprofitUser;
    }

    public void setCreatedByNonprofitUser(NonprofitUser createdByNonprofitUser) {
        this.createdByNonprofitUser = createdByNonprofitUser;
    }
}

public static class GrantSubmissionChange {
    public enum Type {
        STAGE_CHANGE,
        PROPOSAL_UPDATE,
    }
    private Type type;
    private GrantSubmissionStatusChange statusChange;
    private GrantProposalSubmissionDeltaResponse response;

    public GrantSubmissionChange() {}

    public GrantSubmissionChange(Type type, GrantSubmissionStatusChange statusChange, GrantProposalSubmissionDeltaResponse response) {
        this.type = type;
        this.statusChange = statusChange;
        this.response = response;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public GrantSubmissionStatusChange getStatusChange() {
        return statusChange;
    }

    public void setStatusChange(GrantSubmissionStatusChange statusChange) {
        this.statusChange = statusChange;
    }

    public GrantProposalSubmissionDeltaResponse getResponse() {
        return response;
    }

    public void setResponse(GrantProposalSubmissionDeltaResponse response) {
        this.response = response;
    }
}

public static class SubmissionTasks {
    private String submissionId;
    private List<Task> tasks;

    public SubmissionTasks() {}

    public SubmissionTasks(String submissionId, List<Task> tasks) {
        this.submissionId = submissionId;
        this.tasks = tasks;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

public static class ManualGrantLog {
    private String foundationId;
    private String formProposalId;
    private GrantProposalSubmission grantProposalSubmission;
    private List<GrantPayment> grantPayments;

    public ManualGrantLog() {}

    public ManualGrantLog(String foundationId, String formProposalId, GrantProposalSubmission grantProposalSubmission, List<GrantPayment> grantPayments) {
        this.foundationId = foundationId;
        this.formProposalId = formProposalId;
        this.grantProposalSubmission = grantProposalSubmission;
        this.grantPayments = grantPayments;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getFormProposalId() {
        return formProposalId;
    }

    public void setFormProposalId(String formProposalId) {
        this.formProposalId = formProposalId;
    }

    public GrantProposalSubmission getGrantProposalSubmission() {
        return grantProposalSubmission;
    }

    public void setGrantProposalSubmission(GrantProposalSubmission grantProposalSubmission) {
        this.grantProposalSubmission = grantProposalSubmission;
    }

    public List<GrantPayment> getGrantPayments() {
        return grantPayments;
    }

    public void setGrantPayments(List<GrantPayment> grantPayments) {
        this.grantPayments = grantPayments;
    }
}

public static class GrantProposalSubmissionReminder {
    private String submissionId;
    private String nonprofitUserId;
    private CustomEmailTemplate customEmailTemplate;

    public GrantProposalSubmissionReminder() {}

    public GrantProposalSubmissionReminder(String submissionId, String nonprofitUserId, CustomEmailTemplate customEmailTemplate) {
        this.submissionId = submissionId;
        this.nonprofitUserId = nonprofitUserId;
        this.customEmailTemplate = customEmailTemplate;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getNonprofitUserId() {
        return nonprofitUserId;
    }

    public void setNonprofitUserId(String nonprofitUserId) {
        this.nonprofitUserId = nonprofitUserId;
    }

    public CustomEmailTemplate getCustomEmailTemplate() {
        return customEmailTemplate;
    }

    public void setCustomEmailTemplate(CustomEmailTemplate customEmailTemplate) {
        this.customEmailTemplate = customEmailTemplate;
    }
}

public static class NonprofitGrantRefereeStatus {
    private String email;
    private String taskId;
    public enum TaskStatus {
        DRAFT,
        OPEN,
        RESOLVED,
        CLOSED,
    }
    private TaskStatus taskStatus;
    private String updated;

    public NonprofitGrantRefereeStatus() {}

    public NonprofitGrantRefereeStatus(String email, String taskId, TaskStatus taskStatus, String updated) {
        this.email = email;
        this.taskId = taskId;
        this.taskStatus = taskStatus;
        this.updated = updated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}

public static class EntitySuggestionResponse {
    private SuggestionResponseSource source;
    private String answerText;
    private double similarityScore;

    public EntitySuggestionResponse() {}

    public EntitySuggestionResponse(SuggestionResponseSource source, String answerText, double similarityScore) {
        this.source = source;
        this.answerText = answerText;
        this.similarityScore = similarityScore;
    }

    public SuggestionResponseSource getSource() {
        return source;
    }

    public void setSource(SuggestionResponseSource source) {
        this.source = source;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public double getSimilarityScore() {
        return similarityScore;
    }

    public void setSimilarityScore(double similarityScore) {
        this.similarityScore = similarityScore;
    }
}

public static class ResponseEntitySuggestion {
    private FormItemResponseEntity formItemResponseEntity;
    private List<EntitySuggestionResponse> suggestionResponses;

    public ResponseEntitySuggestion() {}

    public ResponseEntitySuggestion(FormItemResponseEntity formItemResponseEntity, List<EntitySuggestionResponse> suggestionResponses) {
        this.formItemResponseEntity = formItemResponseEntity;
        this.suggestionResponses = suggestionResponses;
    }

    public FormItemResponseEntity getFormItemResponseEntity() {
        return formItemResponseEntity;
    }

    public void setFormItemResponseEntity(FormItemResponseEntity formItemResponseEntity) {
        this.formItemResponseEntity = formItemResponseEntity;
    }

    public List<EntitySuggestionResponse> getSuggestionResponses() {
        return suggestionResponses;
    }

    public void setSuggestionResponses(List<EntitySuggestionResponse> suggestionResponses) {
        this.suggestionResponses = suggestionResponses;
    }
}

public static class SubmissionSuggestionResponses {
    private List<ResponseEntitySuggestion> responseEntitySuggestions;

    public SubmissionSuggestionResponses() {}

    public SubmissionSuggestionResponses(List<ResponseEntitySuggestion> responseEntitySuggestions) {
        this.responseEntitySuggestions = responseEntitySuggestions;
    }

    public List<ResponseEntitySuggestion> getResponseEntitySuggestions() {
        return responseEntitySuggestions;
    }

    public void setResponseEntitySuggestions(List<ResponseEntitySuggestion> responseEntitySuggestions) {
        this.responseEntitySuggestions = responseEntitySuggestions;
    }
}

public static class SuggestionResponseSource {
    public enum SourceType {
        HISTORICAL_SUBMISSION,
        PDF,
    }
    private SourceType sourceType;
    private FormItemResponseEntity sourceResponse;

    public SuggestionResponseSource() {}

    public SuggestionResponseSource(SourceType sourceType, FormItemResponseEntity sourceResponse) {
        this.sourceType = sourceType;
        this.sourceResponse = sourceResponse;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public FormItemResponseEntity getSourceResponse() {
        return sourceResponse;
    }

    public void setSourceResponse(FormItemResponseEntity sourceResponse) {
        this.sourceResponse = sourceResponse;
    }
}

public static class QuestionAnswerPair {
    private String question;
    private String answer;

    public QuestionAnswerPair() {}

    public QuestionAnswerPair(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

public static class SuggestedResponsesRequest {
    private boolean includeSubmissions;
    private List<QuestionAnswerPair> questionAnswerResponses;

    public SuggestedResponsesRequest() {}

    public SuggestedResponsesRequest(boolean includeSubmissions, List<QuestionAnswerPair> questionAnswerResponses) {
        this.includeSubmissions = includeSubmissions;
        this.questionAnswerResponses = questionAnswerResponses;
    }

    public boolean getIncludeSubmissions() {
        return includeSubmissions;
    }

    public void setIncludeSubmissions(boolean includeSubmissions) {
        this.includeSubmissions = includeSubmissions;
    }

    public List<QuestionAnswerPair> getQuestionAnswerResponses() {
        return questionAnswerResponses;
    }

    public void setQuestionAnswerResponses(List<QuestionAnswerPair> questionAnswerResponses) {
        this.questionAnswerResponses = questionAnswerResponses;
    }
}

public static class MailChimpAuthUrl {
    private String url;

    public MailChimpAuthUrl() {}

    public MailChimpAuthUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class MailChimpAddress {
    private String address2;
    private String state;
    private String zip;
    private String phone;
    private String company;
    private String address1;
    private String city;
    private String country;

    public MailChimpAddress() {}

    public MailChimpAddress(String address2, String state, String zip, String phone, String company, String address1, String city, String country) {
        this.address2 = address2;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.company = company;
        this.address1 = address1;
        this.city = city;
        this.country = country;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public static class MailChimpCampaign {
    private String from_name;
    private String from_email;
    private String subject;
    private String language;

    public MailChimpCampaign() {}

    public MailChimpCampaign(String from_name, String from_email, String subject, String language) {
        this.from_name = from_name;
        this.from_email = from_email;
        this.subject = subject;
        this.language = language;
    }

    public String getFrom_name() {
        return from_name;
    }

    public void setFrom_name(String from_name) {
        this.from_name = from_name;
    }

    public String getFrom_email() {
        return from_email;
    }

    public void setFrom_email(String from_email) {
        this.from_email = from_email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

public static class MailChimpList {
    private String id;
    private String name;
    private MailChimpAddress contact;
    private String permission_reminder;
    private MailChimpCampaign campaign_defaults;
    private boolean email_type_option;

    public MailChimpList() {}

    public MailChimpList(String id, String name, MailChimpAddress contact, String permission_reminder, MailChimpCampaign campaign_defaults, boolean email_type_option) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.permission_reminder = permission_reminder;
        this.campaign_defaults = campaign_defaults;
        this.email_type_option = email_type_option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MailChimpAddress getContact() {
        return contact;
    }

    public void setContact(MailChimpAddress contact) {
        this.contact = contact;
    }

    public String getPermission_reminder() {
        return permission_reminder;
    }

    public void setPermission_reminder(String permission_reminder) {
        this.permission_reminder = permission_reminder;
    }

    public MailChimpCampaign getCampaign_defaults() {
        return campaign_defaults;
    }

    public void setCampaign_defaults(MailChimpCampaign campaign_defaults) {
        this.campaign_defaults = campaign_defaults;
    }

    public boolean getEmail_type_option() {
        return email_type_option;
    }

    public void setEmail_type_option(boolean email_type_option) {
        this.email_type_option = email_type_option;
    }
}

public static class NonprofitCreateRequest {
    private String legalName;
    private String ein;
    public enum EntityType {
        ORGANIZATION,
        INDIVIDUAL,
    }
    private EntityType entityType;
    private boolean hasFiscalSponsor;
    private FiscalSponsor fiscalSponsor;

    public NonprofitCreateRequest() {}

    public NonprofitCreateRequest(String legalName, String ein, EntityType entityType, boolean hasFiscalSponsor, FiscalSponsor fiscalSponsor) {
        this.legalName = legalName;
        this.ein = ein;
        this.entityType = entityType;
        this.hasFiscalSponsor = hasFiscalSponsor;
        this.fiscalSponsor = fiscalSponsor;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public boolean getHasFiscalSponsor() {
        return hasFiscalSponsor;
    }

    public void setHasFiscalSponsor(boolean hasFiscalSponsor) {
        this.hasFiscalSponsor = hasFiscalSponsor;
    }

    public FiscalSponsor getFiscalSponsor() {
        return fiscalSponsor;
    }

    public void setFiscalSponsor(FiscalSponsor fiscalSponsor) {
        this.fiscalSponsor = fiscalSponsor;
    }
}

public static class Notification {
    private String id;
    private NotificationUser recipient;
    public enum NotificationType {
        NONPROFIT_METADATA_UPDATED,
        TASK_COMMENT_MENTIONED,
        TASK_CREATED,
        TASK_VIEWER_CHANGED,
        TASK_COMMENT_ADDED,
        TASK_ASSIGNEE_CHANGED,
        TASK_STATUS_CHANGED,
        TASK_DEADLINE_CHANGED,
        TASK_REMINDER,
        SUBMISSION_CREATED,
        SUBMISSION_STATUS_CHANGED,
        SUBMISSION_COMMENT_ADDED,
        SUBMISSION_COMMENT_MENTIONED,
        SUBMISSION_ASSIGNEE_CHANGED,
        SUBMISSION_WATCHER_CHANGED,
        SUBMISSION_DEADLINE_CHANGED,
        SUBMISSION_PROPOSAL_CHANGED,
        SUBMISSION_ALL_TASKS_COMPLETED,
        TASK_DEADLINE_UPCOMING,
        SUBMISSION_DEADLINE_UPCOMING,
        PAYMENT_DEADLINE_UPCOMING,
        UPDATE_NONPROFIT_SETTINGS,
    }
    private NotificationType notificationType;
    private NotificationContent content;
    private String created;
    private String viewed;

    public Notification() {}

    public Notification(String id, NotificationUser recipient, NotificationType notificationType, NotificationContent content, String created, String viewed) {
        this.id = id;
        this.recipient = recipient;
        this.notificationType = notificationType;
        this.content = content;
        this.created = created;
        this.viewed = viewed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NotificationUser getRecipient() {
        return recipient;
    }

    public void setRecipient(NotificationUser recipient) {
        this.recipient = recipient;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationContent getContent() {
        return content;
    }

    public void setContent(NotificationContent content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getViewed() {
        return viewed;
    }

    public void setViewed(String viewed) {
        this.viewed = viewed;
    }
}

public static class NotificationContent {
    private String actionUser;
    private String actionOrg;
    public enum NotificationOrgType {
        NONPROFIT,
        FOUNDATION,
    }
    private NotificationOrgType notificationOrgType;
    private String prevStage;
    private String currStage;
    public enum PrevStatus {
        DRAFT,
        OPEN,
        RESOLVED,
        CLOSED,
    }
    private PrevStatus prevStatus;
    public enum CurrStatus {
        DRAFT,
        OPEN,
        RESOLVED,
        CLOSED,
    }
    private CurrStatus currStatus;
    private String taskId;
    private String submissionId;
    private String paymentId;
    private NonprofitMetadata prevMetadata;
    private NonprofitMetadata currMetadata;
    private FoundationUser foundationActionUser;
    private NonprofitUser nonprofitActionUser;
    private Foundation foundationActionOrg;
    private Nonprofit nonprofitActionOrg;
    private Task task;
    private GrantProposalSubmission submission;

    public NotificationContent() {}

    public NotificationContent(String actionUser, String actionOrg, NotificationOrgType notificationOrgType, String prevStage, String currStage, PrevStatus prevStatus, CurrStatus currStatus, String taskId, String submissionId, String paymentId, NonprofitMetadata prevMetadata, NonprofitMetadata currMetadata, FoundationUser foundationActionUser, NonprofitUser nonprofitActionUser, Foundation foundationActionOrg, Nonprofit nonprofitActionOrg, Task task, GrantProposalSubmission submission) {
        this.actionUser = actionUser;
        this.actionOrg = actionOrg;
        this.notificationOrgType = notificationOrgType;
        this.prevStage = prevStage;
        this.currStage = currStage;
        this.prevStatus = prevStatus;
        this.currStatus = currStatus;
        this.taskId = taskId;
        this.submissionId = submissionId;
        this.paymentId = paymentId;
        this.prevMetadata = prevMetadata;
        this.currMetadata = currMetadata;
        this.foundationActionUser = foundationActionUser;
        this.nonprofitActionUser = nonprofitActionUser;
        this.foundationActionOrg = foundationActionOrg;
        this.nonprofitActionOrg = nonprofitActionOrg;
        this.task = task;
        this.submission = submission;
    }

    public String getActionUser() {
        return actionUser;
    }

    public void setActionUser(String actionUser) {
        this.actionUser = actionUser;
    }

    public String getActionOrg() {
        return actionOrg;
    }

    public void setActionOrg(String actionOrg) {
        this.actionOrg = actionOrg;
    }

    public NotificationOrgType getNotificationOrgType() {
        return notificationOrgType;
    }

    public void setNotificationOrgType(NotificationOrgType notificationOrgType) {
        this.notificationOrgType = notificationOrgType;
    }

    public String getPrevStage() {
        return prevStage;
    }

    public void setPrevStage(String prevStage) {
        this.prevStage = prevStage;
    }

    public String getCurrStage() {
        return currStage;
    }

    public void setCurrStage(String currStage) {
        this.currStage = currStage;
    }

    public PrevStatus getPrevStatus() {
        return prevStatus;
    }

    public void setPrevStatus(PrevStatus prevStatus) {
        this.prevStatus = prevStatus;
    }

    public CurrStatus getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(CurrStatus currStatus) {
        this.currStatus = currStatus;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public NonprofitMetadata getPrevMetadata() {
        return prevMetadata;
    }

    public void setPrevMetadata(NonprofitMetadata prevMetadata) {
        this.prevMetadata = prevMetadata;
    }

    public NonprofitMetadata getCurrMetadata() {
        return currMetadata;
    }

    public void setCurrMetadata(NonprofitMetadata currMetadata) {
        this.currMetadata = currMetadata;
    }

    public FoundationUser getFoundationActionUser() {
        return foundationActionUser;
    }

    public void setFoundationActionUser(FoundationUser foundationActionUser) {
        this.foundationActionUser = foundationActionUser;
    }

    public NonprofitUser getNonprofitActionUser() {
        return nonprofitActionUser;
    }

    public void setNonprofitActionUser(NonprofitUser nonprofitActionUser) {
        this.nonprofitActionUser = nonprofitActionUser;
    }

    public Foundation getFoundationActionOrg() {
        return foundationActionOrg;
    }

    public void setFoundationActionOrg(Foundation foundationActionOrg) {
        this.foundationActionOrg = foundationActionOrg;
    }

    public Nonprofit getNonprofitActionOrg() {
        return nonprofitActionOrg;
    }

    public void setNonprofitActionOrg(Nonprofit nonprofitActionOrg) {
        this.nonprofitActionOrg = nonprofitActionOrg;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public GrantProposalSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(GrantProposalSubmission submission) {
        this.submission = submission;
    }
}

public static class NotificationResponse {
    private int totalCount;
    private int unviewedCount;
    private List<Notification> responses;

    public NotificationResponse() {}

    public NotificationResponse(int totalCount, int unviewedCount, List<Notification> responses) {
        this.totalCount = totalCount;
        this.unviewedCount = unviewedCount;
        this.responses = responses;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getUnviewedCount() {
        return unviewedCount;
    }

    public void setUnviewedCount(int unviewedCount) {
        this.unviewedCount = unviewedCount;
    }

    public List<Notification> getResponses() {
        return responses;
    }

    public void setResponses(List<Notification> responses) {
        this.responses = responses;
    }
}

public static class NotificationUser {
    private String userId;
    private String orgId;
    public enum OrgType {
        NONPROFIT,
        FOUNDATION,
    }
    private OrgType orgType;
    private FoundationUser foundationUser;
    private NonprofitUser nonprofitUser;

    public NotificationUser() {}

    public NotificationUser(String userId, String orgId, OrgType orgType, FoundationUser foundationUser, NonprofitUser nonprofitUser) {
        this.userId = userId;
        this.orgId = orgId;
        this.orgType = orgType;
        this.foundationUser = foundationUser;
        this.nonprofitUser = nonprofitUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    public FoundationUser getFoundationUser() {
        return foundationUser;
    }

    public void setFoundationUser(FoundationUser foundationUser) {
        this.foundationUser = foundationUser;
    }

    public NonprofitUser getNonprofitUser() {
        return nonprofitUser;
    }

    public void setNonprofitUser(NonprofitUser nonprofitUser) {
        this.nonprofitUser = nonprofitUser;
    }
}

public static class NotificationQuery {
    private int page;
    private int pageSize;
    private boolean allNotifications;

    public NotificationQuery() {}

    public NotificationQuery(int page, int pageSize, boolean allNotifications) {
        this.page = page;
        this.pageSize = pageSize;
        this.allNotifications = allNotifications;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getAllNotifications() {
        return allNotifications;
    }

    public void setAllNotifications(boolean allNotifications) {
        this.allNotifications = allNotifications;
    }
}

public static class NylasFile {
    private String contentType;
    private String fileName;
    private String object;
    private int size;
    private String id;
    private String contentId;

    public NylasFile() {}

    public NylasFile(String contentType, String fileName, String object, int size, String id, String contentId) {
        this.contentType = contentType;
        this.fileName = fileName;
        this.object = object;
        this.size = size;
        this.id = id;
        this.contentId = contentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}

public static class NylasMessage {
    private String accountId;
    private List<NylasParticipant> bcc;
    private String body;
    private List<NylasParticipant> cc;
    private String date;
    private List<NylasFile> files;
    private NylasFolder folder;
    private List<NylasParticipant> from;
    private String id;
    private String object;
    private List<NylasParticipant> replyTo;
    private String snippet;
    private boolean starred;
    private String subject;
    private String threadId;
    private List<NylasParticipant> to;
    private boolean unread;
    private List<NylasLabel> labels;
    private Object metadata;

    public NylasMessage() {}

    public NylasMessage(String accountId, List<NylasParticipant> bcc, String body, List<NylasParticipant> cc, String date, List<NylasFile> files, NylasFolder folder, List<NylasParticipant> from, String id, String object, List<NylasParticipant> replyTo, String snippet, boolean starred, String subject, String threadId, List<NylasParticipant> to, boolean unread, List<NylasLabel> labels, Object metadata) {
        this.accountId = accountId;
        this.bcc = bcc;
        this.body = body;
        this.cc = cc;
        this.date = date;
        this.files = files;
        this.folder = folder;
        this.from = from;
        this.id = id;
        this.object = object;
        this.replyTo = replyTo;
        this.snippet = snippet;
        this.starred = starred;
        this.subject = subject;
        this.threadId = threadId;
        this.to = to;
        this.unread = unread;
        this.labels = labels;
        this.metadata = metadata;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<NylasParticipant> getBcc() {
        return bcc;
    }

    public void setBcc(List<NylasParticipant> bcc) {
        this.bcc = bcc;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<NylasParticipant> getCc() {
        return cc;
    }

    public void setCc(List<NylasParticipant> cc) {
        this.cc = cc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<NylasFile> getFiles() {
        return files;
    }

    public void setFiles(List<NylasFile> files) {
        this.files = files;
    }

    public NylasFolder getFolder() {
        return folder;
    }

    public void setFolder(NylasFolder folder) {
        this.folder = folder;
    }

    public List<NylasParticipant> getFrom() {
        return from;
    }

    public void setFrom(List<NylasParticipant> from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<NylasParticipant> getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(List<NylasParticipant> replyTo) {
        this.replyTo = replyTo;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public boolean getStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public List<NylasParticipant> getTo() {
        return to;
    }

    public void setTo(List<NylasParticipant> to) {
        this.to = to;
    }

    public boolean getUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public List<NylasLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NylasLabel> labels) {
        this.labels = labels;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }
}

public static class NylasLoginURL {
    private String url;

    public NylasLoginURL() {}

    public NylasLoginURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class NylasFileRequest {
    private String threadId;
    private String messageId;
    private String fileId;

    public NylasFileRequest() {}

    public NylasFileRequest(String threadId, String messageId, String fileId) {
        this.threadId = threadId;
        this.messageId = messageId;
        this.fileId = fileId;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}

public static class PlaidLinkTokenResponse {
    private String linkToken;

    public PlaidLinkTokenResponse() {}

    public PlaidLinkTokenResponse(String linkToken) {
        this.linkToken = linkToken;
    }

    public String getLinkToken() {
        return linkToken;
    }

    public void setLinkToken(String linkToken) {
        this.linkToken = linkToken;
    }
}

public static class PlaidTokenExchangeResponse {
    private String accessToken;
    private String itemId;

    public PlaidTokenExchangeResponse() {}

    public PlaidTokenExchangeResponse(String accessToken, String itemId) {
        this.accessToken = accessToken;
        this.itemId = itemId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}

public static class PlaidTokenExchangeRequest {
    private String publicToken;

    public PlaidTokenExchangeRequest() {}

    public PlaidTokenExchangeRequest(String publicToken) {
        this.publicToken = publicToken;
    }

    public String getPublicToken() {
        return publicToken;
    }

    public void setPublicToken(String publicToken) {
        this.publicToken = publicToken;
    }
}

public static class QuickbooksLoginURL {
    private String url;

    public QuickbooksLoginURL() {}

    public QuickbooksLoginURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

public static class QuickbooksLoginRequest {
    private String redirectURI;

    public QuickbooksLoginRequest() {}

    public QuickbooksLoginRequest(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    public String getRedirectURI() {
        return redirectURI;
    }

    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }
}

public static class Account {
    private String id;
    private String syncToken;
    private ModificationMetaData metaData;
    private List<CustomField> customField;
    private List<AttachableRef> attachableRef;
    private String domain;
    public enum Status {
        DELETED,
        VOIDED,
        DRAFT,
        PENDING,
        IN_TRANSIT,
        SYNCHRONIZED,
        SYNC_ERROR,
    }
    private Status status;
    private boolean sparse;
    private String name;
    private boolean subAccount;
    private ReferenceType parentRef;
    private String description;
    private String fullyQualifiedName;
    private String accountAlias;
    private String txnLocationType;
    private boolean active;
    public enum Classification {
        ASSET,
        EQUITY,
        EXPENSE,
        LIABILITY,
        REVENUE,
    }
    private Classification classification;
    public enum AccountType {
        BANK,
        ACCOUNTS_RECEIVABLE,
        OTHER_CURRENT_ASSET,
        FIXED_ASSET,
        OTHER_ASSET,
        ACCOUNTS_PAYABLE,
        CREDIT_CARD,
        OTHER_CURRENT_LIABILITY,
        LONG_TERM_LIABILITY,
        EQUITY,
        INCOME,
        COST_OF_GOODS_SOLD,
        EXPENSE,
        OTHER_INCOME,
        OTHER_EXPENSE,
        NON_POSTING,
    }
    private AccountType accountType;
    private String accountSubType;
    private List<ReferenceType> accountPurposes;
    private String acctNum;
    private String acctNumExtn;
    private String bankNum;
    private double openingBalance;
    private String openingBalanceDate;
    private double currentBalance;
    private double currentBalanceWithSubAccounts;
    private ReferenceType currencyRef;
    private boolean taxAccount;
    private ReferenceType taxCodeRef;
    private boolean onlineBankingEnabled;
    private ReferenceType journalCodeRef;
    private IntuitAnyType accountEx;
    private String finame;

    public Account() {}

    public Account(String id, String syncToken, ModificationMetaData metaData, List<CustomField> customField, List<AttachableRef> attachableRef, String domain, Status status, boolean sparse, String name, boolean subAccount, ReferenceType parentRef, String description, String fullyQualifiedName, String accountAlias, String txnLocationType, boolean active, Classification classification, AccountType accountType, String accountSubType, List<ReferenceType> accountPurposes, String acctNum, String acctNumExtn, String bankNum, double openingBalance, String openingBalanceDate, double currentBalance, double currentBalanceWithSubAccounts, ReferenceType currencyRef, boolean taxAccount, ReferenceType taxCodeRef, boolean onlineBankingEnabled, ReferenceType journalCodeRef, IntuitAnyType accountEx, String finame) {
        this.id = id;
        this.syncToken = syncToken;
        this.metaData = metaData;
        this.customField = customField;
        this.attachableRef = attachableRef;
        this.domain = domain;
        this.status = status;
        this.sparse = sparse;
        this.name = name;
        this.subAccount = subAccount;
        this.parentRef = parentRef;
        this.description = description;
        this.fullyQualifiedName = fullyQualifiedName;
        this.accountAlias = accountAlias;
        this.txnLocationType = txnLocationType;
        this.active = active;
        this.classification = classification;
        this.accountType = accountType;
        this.accountSubType = accountSubType;
        this.accountPurposes = accountPurposes;
        this.acctNum = acctNum;
        this.acctNumExtn = acctNumExtn;
        this.bankNum = bankNum;
        this.openingBalance = openingBalance;
        this.openingBalanceDate = openingBalanceDate;
        this.currentBalance = currentBalance;
        this.currentBalanceWithSubAccounts = currentBalanceWithSubAccounts;
        this.currencyRef = currencyRef;
        this.taxAccount = taxAccount;
        this.taxCodeRef = taxCodeRef;
        this.onlineBankingEnabled = onlineBankingEnabled;
        this.journalCodeRef = journalCodeRef;
        this.accountEx = accountEx;
        this.finame = finame;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public ModificationMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        this.metaData = metaData;
    }

    public List<CustomField> getCustomField() {
        return customField;
    }

    public void setCustomField(List<CustomField> customField) {
        this.customField = customField;
    }

    public List<AttachableRef> getAttachableRef() {
        return attachableRef;
    }

    public void setAttachableRef(List<AttachableRef> attachableRef) {
        this.attachableRef = attachableRef;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean getSparse() {
        return sparse;
    }

    public void setSparse(boolean sparse) {
        this.sparse = sparse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSubAccount() {
        return subAccount;
    }

    public void setSubAccount(boolean subAccount) {
        this.subAccount = subAccount;
    }

    public ReferenceType getParentRef() {
        return parentRef;
    }

    public void setParentRef(ReferenceType parentRef) {
        this.parentRef = parentRef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    public String getTxnLocationType() {
        return txnLocationType;
    }

    public void setTxnLocationType(String txnLocationType) {
        this.txnLocationType = txnLocationType;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getAccountSubType() {
        return accountSubType;
    }

    public void setAccountSubType(String accountSubType) {
        this.accountSubType = accountSubType;
    }

    public List<ReferenceType> getAccountPurposes() {
        return accountPurposes;
    }

    public void setAccountPurposes(List<ReferenceType> accountPurposes) {
        this.accountPurposes = accountPurposes;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getAcctNumExtn() {
        return acctNumExtn;
    }

    public void setAcctNumExtn(String acctNumExtn) {
        this.acctNumExtn = acctNumExtn;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public String getOpeningBalanceDate() {
        return openingBalanceDate;
    }

    public void setOpeningBalanceDate(String openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalanceWithSubAccounts() {
        return currentBalanceWithSubAccounts;
    }

    public void setCurrentBalanceWithSubAccounts(double currentBalanceWithSubAccounts) {
        this.currentBalanceWithSubAccounts = currentBalanceWithSubAccounts;
    }

    public ReferenceType getCurrencyRef() {
        return currencyRef;
    }

    public void setCurrencyRef(ReferenceType currencyRef) {
        this.currencyRef = currencyRef;
    }

    public boolean getTaxAccount() {
        return taxAccount;
    }

    public void setTaxAccount(boolean taxAccount) {
        this.taxAccount = taxAccount;
    }

    public ReferenceType getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(ReferenceType taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }

    public boolean getOnlineBankingEnabled() {
        return onlineBankingEnabled;
    }

    public void setOnlineBankingEnabled(boolean onlineBankingEnabled) {
        this.onlineBankingEnabled = onlineBankingEnabled;
    }

    public ReferenceType getJournalCodeRef() {
        return journalCodeRef;
    }

    public void setJournalCodeRef(ReferenceType journalCodeRef) {
        this.journalCodeRef = journalCodeRef;
    }

    public IntuitAnyType getAccountEx() {
        return accountEx;
    }

    public void setAccountEx(IntuitAnyType accountEx) {
        this.accountEx = accountEx;
    }

    public String getFiname() {
        return finame;
    }

    public void setFiname(String finame) {
        this.finame = finame;
    }
}

public static class QBSearchResponseAccount {
    private int count;
    private List<Account> responses;

    public QBSearchResponseAccount() {}

    public QBSearchResponseAccount(int count, List<Account> responses) {
        this.count = count;
        this.responses = responses;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Account> getResponses() {
        return responses;
    }

    public void setResponses(List<Account> responses) {
        this.responses = responses;
    }
}

public static class QBBillSearchRequest {
    private int page;
    private int pageSize;
    private String vendorId;
    private String metadataLastUpdatedTime;

    public QBBillSearchRequest() {}

    public QBBillSearchRequest(int page, int pageSize, String vendorId, String metadataLastUpdatedTime) {
        this.page = page;
        this.pageSize = pageSize;
        this.vendorId = vendorId;
        this.metadataLastUpdatedTime = metadataLastUpdatedTime;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getMetadataLastUpdatedTime() {
        return metadataLastUpdatedTime;
    }

    public void setMetadataLastUpdatedTime(String metadataLastUpdatedTime) {
        this.metadataLastUpdatedTime = metadataLastUpdatedTime;
    }
}

public static class QBSearchResponseVendor {
    private int count;
    private List<Vendor> responses;

    public QBSearchResponseVendor() {}

    public QBSearchResponseVendor(int count, List<Vendor> responses) {
        this.count = count;
        this.responses = responses;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Vendor> getResponses() {
        return responses;
    }

    public void setResponses(List<Vendor> responses) {
        this.responses = responses;
    }
}

public static class QBVendorSearchRequest {
    private int page;
    private int pageSize;
    private String text;

    public QBVendorSearchRequest() {}

    public QBVendorSearchRequest(int page, int pageSize, String text) {
        this.page = page;
        this.pageSize = pageSize;
        this.text = text;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public static class Report {
    private String id;
    private String name;
    private String foundationId;
    private String createdBy;
    private String updatedBy;
    private List<FormItem> components;
    private String created;
    private String updated;
    private FoundationUser createdByUser;
    private FoundationUser updatedByUser;
    private List<ReportSubmission> submissionReports;
    private int completedReports;
    private int pendingReports;

    public Report() {}

    public Report(String id, String name, String foundationId, String createdBy, String updatedBy, List<FormItem> components, String created, String updated, FoundationUser createdByUser, FoundationUser updatedByUser, List<ReportSubmission> submissionReports, int completedReports, int pendingReports) {
        this.id = id;
        this.name = name;
        this.foundationId = foundationId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.components = components;
        this.created = created;
        this.updated = updated;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
        this.submissionReports = submissionReports;
        this.completedReports = completedReports;
        this.pendingReports = pendingReports;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<FormItem> getComponents() {
        return components;
    }

    public void setComponents(List<FormItem> components) {
        this.components = components;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(FoundationUser createdByUser) {
        this.createdByUser = createdByUser;
    }

    public FoundationUser getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(FoundationUser updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

    public List<ReportSubmission> getSubmissionReports() {
        return submissionReports;
    }

    public void setSubmissionReports(List<ReportSubmission> submissionReports) {
        this.submissionReports = submissionReports;
    }

    public int getCompletedReports() {
        return completedReports;
    }

    public void setCompletedReports(int completedReports) {
        this.completedReports = completedReports;
    }

    public int getPendingReports() {
        return pendingReports;
    }

    public void setPendingReports(int pendingReports) {
        this.pendingReports = pendingReports;
    }
}

public static class ReportSubmission {
    private Task task;
    private TaskSubmission taskSubmission;

    public ReportSubmission() {}

    public ReportSubmission(Task task, TaskSubmission taskSubmission) {
        this.task = task;
        this.taskSubmission = taskSubmission;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskSubmission getTaskSubmission() {
        return taskSubmission;
    }

    public void setTaskSubmission(TaskSubmission taskSubmission) {
        this.taskSubmission = taskSubmission;
    }
}

public static class SubmissionEntity {
    private FormItem component;
    private List<SubmissionResponse> submissionResponses;

    public SubmissionEntity() {}

    public SubmissionEntity(FormItem component, List<SubmissionResponse> submissionResponses) {
        this.component = component;
        this.submissionResponses = submissionResponses;
    }

    public FormItem getComponent() {
        return component;
    }

    public void setComponent(FormItem component) {
        this.component = component;
    }

    public List<SubmissionResponse> getSubmissionResponses() {
        return submissionResponses;
    }

    public void setSubmissionResponses(List<SubmissionResponse> submissionResponses) {
        this.submissionResponses = submissionResponses;
    }
}

public static class SubmissionResponse {
    private String userId;
    private FormComponentSubmission submission;
    private Nonprofit nonprofit;
    private Foundation foundation;
    private List<PresignedFile> files;

    public SubmissionResponse() {}

    public SubmissionResponse(String userId, FormComponentSubmission submission, Nonprofit nonprofit, Foundation foundation, List<PresignedFile> files) {
        this.userId = userId;
        this.submission = submission;
        this.nonprofit = nonprofit;
        this.foundation = foundation;
        this.files = files;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FormComponentSubmission getSubmission() {
        return submission;
    }

    public void setSubmission(FormComponentSubmission submission) {
        this.submission = submission;
    }

    public Nonprofit getNonprofit() {
        return nonprofit;
    }

    public void setNonprofit(Nonprofit nonprofit) {
        this.nonprofit = nonprofit;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public void setFoundation(Foundation foundation) {
        this.foundation = foundation;
    }

    public List<PresignedFile> getFiles() {
        return files;
    }

    public void setFiles(List<PresignedFile> files) {
        this.files = files;
    }
}

public static class CommunicationEmailTemplate {
    private String id;
    private String subject;
    private String message;
    private String foundationId;
    private String created_at;
    private String created_by;
    private String updated_at;
    private String updated_by;

    public CommunicationEmailTemplate() {}

    public CommunicationEmailTemplate(String id, String subject, String message, String foundationId, String created_at, String created_by, String updated_at, String updated_by) {
        this.id = id;
        this.subject = subject;
        this.message = message;
        this.foundationId = foundationId;
        this.created_at = created_at;
        this.created_by = created_by;
        this.updated_at = updated_at;
        this.updated_by = updated_by;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
}

public static class CommunicationPortalEmail {
    private String id;
    private String subject;
    private String message;
    private CommunicationPortalEmailRecipients recipients;
    private String createdAt;
    private String createdById;
    private String updatedAt;
    private String updatedById;
    private String sentAt;
    private String sentById;
    private String replyTo;
    private String foundationId;
    private List<CommunicationPortalEmailNonprofit> nonprofits;
    private Object tokens;

    public CommunicationPortalEmail() {}

    public CommunicationPortalEmail(String id, String subject, String message, CommunicationPortalEmailRecipients recipients, String createdAt, String createdById, String updatedAt, String updatedById, String sentAt, String sentById, String replyTo, String foundationId, List<CommunicationPortalEmailNonprofit> nonprofits, Object tokens) {
        this.id = id;
        this.subject = subject;
        this.message = message;
        this.recipients = recipients;
        this.createdAt = createdAt;
        this.createdById = createdById;
        this.updatedAt = updatedAt;
        this.updatedById = updatedById;
        this.sentAt = sentAt;
        this.sentById = sentById;
        this.replyTo = replyTo;
        this.foundationId = foundationId;
        this.nonprofits = nonprofits;
        this.tokens = tokens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommunicationPortalEmailRecipients getRecipients() {
        return recipients;
    }

    public void setRecipients(CommunicationPortalEmailRecipients recipients) {
        this.recipients = recipients;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(String updatedById) {
        this.updatedById = updatedById;
    }

    public String getSentAt() {
        return sentAt;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    public String getSentById() {
        return sentById;
    }

    public void setSentById(String sentById) {
        this.sentById = sentById;
    }

    public String getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public List<CommunicationPortalEmailNonprofit> getNonprofits() {
        return nonprofits;
    }

    public void setNonprofits(List<CommunicationPortalEmailNonprofit> nonprofits) {
        this.nonprofits = nonprofits;
    }

    public Object getTokens() {
        return tokens;
    }

    public void setTokens(Object tokens) {
        this.tokens = tokens;
    }
}

public static class CommunicationPortalEmailNonprofit {
    private String nonprofitId;
    private List<String> selectUserIds;

    public CommunicationPortalEmailNonprofit() {}

    public CommunicationPortalEmailNonprofit(String nonprofitId, List<String> selectUserIds) {
        this.nonprofitId = nonprofitId;
        this.selectUserIds = selectUserIds;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public List<String> getSelectUserIds() {
        return selectUserIds;
    }

    public void setSelectUserIds(List<String> selectUserIds) {
        this.selectUserIds = selectUserIds;
    }
}

public static class CommunicationPortalEmailRecipients {
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;

    public CommunicationPortalEmailRecipients() {}

    public CommunicationPortalEmailRecipients(List<String> to, List<String> cc, List<String> bcc) {
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }
}

public static class CommunicationPortalGetFoundationEmailsResponse {
    private List<CommunicationPortalEmail> emails;
    private int totalCount;

    public CommunicationPortalGetFoundationEmailsResponse() {}

    public CommunicationPortalGetFoundationEmailsResponse(List<CommunicationPortalEmail> emails, int totalCount) {
        this.emails = emails;
        this.totalCount = totalCount;
    }

    public List<CommunicationPortalEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<CommunicationPortalEmail> emails) {
        this.emails = emails;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}

public static class CommunicationPortalGetFoundationEmailsRequest {
    private List<String> statuses;
    private int page;
    private int pageSize;

    public CommunicationPortalGetFoundationEmailsRequest() {}

    public CommunicationPortalGetFoundationEmailsRequest(List<String> statuses, int page, int pageSize) {
        this.statuses = statuses;
        this.page = page;
        this.pageSize = pageSize;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}

public static class CommunicationPortalGetFoundationEmailResponse {
    private CommunicationPortalEmail email;

    public CommunicationPortalGetFoundationEmailResponse() {}

    public CommunicationPortalGetFoundationEmailResponse(CommunicationPortalEmail email) {
        this.email = email;
    }

    public CommunicationPortalEmail getEmail() {
        return email;
    }

    public void setEmail(CommunicationPortalEmail email) {
        this.email = email;
    }
}

public static class DocumentItemResponse {
    private String foundationId;
    private DocumentItem documentItem;
    private String response;

    public DocumentItemResponse() {}

    public DocumentItemResponse(String foundationId, DocumentItem documentItem, String response) {
        this.foundationId = foundationId;
        this.documentItem = documentItem;
        this.response = response;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public DocumentItem getDocumentItem() {
        return documentItem;
    }

    public void setDocumentItem(DocumentItem documentItem) {
        this.documentItem = documentItem;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

public static class TaskWithSubmission {
    private Task task;
    private TaskSubmission taskSubmission;
    private FoundationNonprofitMetadata foundationNonprofitMetadata;
    private List<FoundationCRMField> crmFields;
    private List<CRMConfigurationField> crmConfigurationFields;
    private List<DocumentItemResponse> foundationFieldResponses;

    public TaskWithSubmission() {}

    public TaskWithSubmission(Task task, TaskSubmission taskSubmission, FoundationNonprofitMetadata foundationNonprofitMetadata, List<FoundationCRMField> crmFields, List<CRMConfigurationField> crmConfigurationFields, List<DocumentItemResponse> foundationFieldResponses) {
        this.task = task;
        this.taskSubmission = taskSubmission;
        this.foundationNonprofitMetadata = foundationNonprofitMetadata;
        this.crmFields = crmFields;
        this.crmConfigurationFields = crmConfigurationFields;
        this.foundationFieldResponses = foundationFieldResponses;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskSubmission getTaskSubmission() {
        return taskSubmission;
    }

    public void setTaskSubmission(TaskSubmission taskSubmission) {
        this.taskSubmission = taskSubmission;
    }

    public FoundationNonprofitMetadata getFoundationNonprofitMetadata() {
        return foundationNonprofitMetadata;
    }

    public void setFoundationNonprofitMetadata(FoundationNonprofitMetadata foundationNonprofitMetadata) {
        this.foundationNonprofitMetadata = foundationNonprofitMetadata;
    }

    public List<FoundationCRMField> getCrmFields() {
        return crmFields;
    }

    public void setCrmFields(List<FoundationCRMField> crmFields) {
        this.crmFields = crmFields;
    }

    public List<CRMConfigurationField> getCrmConfigurationFields() {
        return crmConfigurationFields;
    }

    public void setCrmConfigurationFields(List<CRMConfigurationField> crmConfigurationFields) {
        this.crmConfigurationFields = crmConfigurationFields;
    }

    public List<DocumentItemResponse> getFoundationFieldResponses() {
        return foundationFieldResponses;
    }

    public void setFoundationFieldResponses(List<DocumentItemResponse> foundationFieldResponses) {
        this.foundationFieldResponses = foundationFieldResponses;
    }
}

public static class SalesforceLoginURL {
    private String loginURL;

    public SalesforceLoginURL() {}

    public SalesforceLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }

    public String getLoginURL() {
        return loginURL;
    }

    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }
}

public static class SalesforceLoginRequest {
    private String redirectURI;

    public SalesforceLoginRequest() {}

    public SalesforceLoginRequest(String redirectURI) {
        this.redirectURI = redirectURI;
    }

    public String getRedirectURI() {
        return redirectURI;
    }

    public void setRedirectURI(String redirectURI) {
        this.redirectURI = redirectURI;
    }
}

public static class FoundationSearchResponse {
    private int totalCount;
    private List<FoundationSearchResponseEntity> responses;

    public FoundationSearchResponse() {}

    public FoundationSearchResponse(int totalCount, List<FoundationSearchResponseEntity> responses) {
        this.totalCount = totalCount;
        this.responses = responses;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<FoundationSearchResponseEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<FoundationSearchResponseEntity> responses) {
        this.responses = responses;
    }
}

public static class FoundationSearchQuery {
    private int page;
    private int pageSize;
    private String queryText;
    private boolean searchPeople;
    private boolean searchSubmissions;

    public FoundationSearchQuery() {}

    public FoundationSearchQuery(int page, int pageSize, String queryText, boolean searchPeople, boolean searchSubmissions) {
        this.page = page;
        this.pageSize = pageSize;
        this.queryText = queryText;
        this.searchPeople = searchPeople;
        this.searchSubmissions = searchSubmissions;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public boolean getSearchPeople() {
        return searchPeople;
    }

    public void setSearchPeople(boolean searchPeople) {
        this.searchPeople = searchPeople;
    }

    public boolean getSearchSubmissions() {
        return searchSubmissions;
    }

    public void setSearchSubmissions(boolean searchSubmissions) {
        this.searchSubmissions = searchSubmissions;
    }
}

public static class NonprofitSearchEntity {
    private String sourceId;
    public enum Source {
        EVERY,
        PROPUBLICA,
        TEMELIO,
    }
    private Source source;
    private String name;
    private String description;
    private String location;
    private String ein;
    private boolean hasFiscalSponsor;
    private String fiscalSponsorEIN;
    private String imageURL;
    private List<String> tags;
    private String nteeCode;
    private String nteeCodeDescription;
    private int legalStatusCode;
    private String legalStatusDescription;

    public NonprofitSearchEntity() {}

    public NonprofitSearchEntity(String sourceId, Source source, String name, String description, String location, String ein, boolean hasFiscalSponsor, String fiscalSponsorEIN, String imageURL, List<String> tags, String nteeCode, String nteeCodeDescription, int legalStatusCode, String legalStatusDescription) {
        this.sourceId = sourceId;
        this.source = source;
        this.name = name;
        this.description = description;
        this.location = location;
        this.ein = ein;
        this.hasFiscalSponsor = hasFiscalSponsor;
        this.fiscalSponsorEIN = fiscalSponsorEIN;
        this.imageURL = imageURL;
        this.tags = tags;
        this.nteeCode = nteeCode;
        this.nteeCodeDescription = nteeCodeDescription;
        this.legalStatusCode = legalStatusCode;
        this.legalStatusDescription = legalStatusDescription;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public boolean getHasFiscalSponsor() {
        return hasFiscalSponsor;
    }

    public void setHasFiscalSponsor(boolean hasFiscalSponsor) {
        this.hasFiscalSponsor = hasFiscalSponsor;
    }

    public String getFiscalSponsorEIN() {
        return fiscalSponsorEIN;
    }

    public void setFiscalSponsorEIN(String fiscalSponsorEIN) {
        this.fiscalSponsorEIN = fiscalSponsorEIN;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getNteeCode() {
        return nteeCode;
    }

    public void setNteeCode(String nteeCode) {
        this.nteeCode = nteeCode;
    }

    public String getNteeCodeDescription() {
        return nteeCodeDescription;
    }

    public void setNteeCodeDescription(String nteeCodeDescription) {
        this.nteeCodeDescription = nteeCodeDescription;
    }

    public int getLegalStatusCode() {
        return legalStatusCode;
    }

    public void setLegalStatusCode(int legalStatusCode) {
        this.legalStatusCode = legalStatusCode;
    }

    public String getLegalStatusDescription() {
        return legalStatusDescription;
    }

    public void setLegalStatusDescription(String legalStatusDescription) {
        this.legalStatusDescription = legalStatusDescription;
    }
}

public static class NonprofitSearchResponse {
    private List<NonprofitSearchEntity> responses;

    public NonprofitSearchResponse() {}

    public NonprofitSearchResponse(List<NonprofitSearchEntity> responses) {
        this.responses = responses;
    }

    public List<NonprofitSearchEntity> getResponses() {
        return responses;
    }

    public void setResponses(List<NonprofitSearchEntity> responses) {
        this.responses = responses;
    }
}

public static class NonprofitSearchQuery {
    private int page;
    private int pageSize;
    private String queryText;
    private String ein;
    private String fiscalEIN;

    public NonprofitSearchQuery() {}

    public NonprofitSearchQuery(int page, int pageSize, String queryText, String ein, String fiscalEIN) {
        this.page = page;
        this.pageSize = pageSize;
        this.queryText = queryText;
        this.ein = ein;
        this.fiscalEIN = fiscalEIN;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getFiscalEIN() {
        return fiscalEIN;
    }

    public void setFiscalEIN(String fiscalEIN) {
        this.fiscalEIN = fiscalEIN;
    }
}

public static class UniversalSearchDocument {
    private String id;
    private String foundationId;
    private String name;
    public enum Type {
        NONPROFIT,
        SUBMISSION,
        TASK,
        ADDITIONAL_CONTACT,
        NONPROFIT_USER,
        NOTES,
        TASK_COMMENT,
        SUBMISSION_COMMENT,
        FILE,
        DONOR_ENTITY,
        DONOR_ACTIVITY,
    }
    private Type type;
    private String alternativeText;
    private String email;
    private String userId;
    private String nonprofitName;
    private String nonprofitId;
    private String taskId;
    private String taskName;
    private String submissionId;
    private String submissionName;
    private String created;
    private String updated;
    private String updatedUser;
    private String fileId;
    private String donorEntityId;

    public UniversalSearchDocument() {}

    public UniversalSearchDocument(String id, String foundationId, String name, Type type, String alternativeText, String email, String userId, String nonprofitName, String nonprofitId, String taskId, String taskName, String submissionId, String submissionName, String created, String updated, String updatedUser, String fileId, String donorEntityId) {
        this.id = id;
        this.foundationId = foundationId;
        this.name = name;
        this.type = type;
        this.alternativeText = alternativeText;
        this.email = email;
        this.userId = userId;
        this.nonprofitName = nonprofitName;
        this.nonprofitId = nonprofitId;
        this.taskId = taskId;
        this.taskName = taskName;
        this.submissionId = submissionId;
        this.submissionName = submissionName;
        this.created = created;
        this.updated = updated;
        this.updatedUser = updatedUser;
        this.fileId = fileId;
        this.donorEntityId = donorEntityId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoundationId() {
        return foundationId;
    }

    public void setFoundationId(String foundationId) {
        this.foundationId = foundationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getAlternativeText() {
        return alternativeText;
    }

    public void setAlternativeText(String alternativeText) {
        this.alternativeText = alternativeText;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNonprofitName() {
        return nonprofitName;
    }

    public void setNonprofitName(String nonprofitName) {
        this.nonprofitName = nonprofitName;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getSubmissionName() {
        return submissionName;
    }

    public void setSubmissionName(String submissionName) {
        this.submissionName = submissionName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getDonorEntityId() {
        return donorEntityId;
    }

    public void setDonorEntityId(String donorEntityId) {
        this.donorEntityId = donorEntityId;
    }
}

public static class UniversalSearchResponse {
    private int hits;
    private List<UniversalSearchDocument> responses;

    public UniversalSearchResponse() {}

    public UniversalSearchResponse(int hits, List<UniversalSearchDocument> responses) {
        this.hits = hits;
        this.responses = responses;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public List<UniversalSearchDocument> getResponses() {
        return responses;
    }

    public void setResponses(List<UniversalSearchDocument> responses) {
        this.responses = responses;
    }
}

public static class UniversalSearchQuery {
    private String query;
    private int numResults;
    private List<String> typeFilterSet;
    private List<String> nonprofitFilterSet;
    private List<String> submissionFilterSet;
    private boolean includeAll;

    public UniversalSearchQuery() {}

    public UniversalSearchQuery(String query, int numResults, List<String> typeFilterSet, List<String> nonprofitFilterSet, List<String> submissionFilterSet, boolean includeAll) {
        this.query = query;
        this.numResults = numResults;
        this.typeFilterSet = typeFilterSet;
        this.nonprofitFilterSet = nonprofitFilterSet;
        this.submissionFilterSet = submissionFilterSet;
        this.includeAll = includeAll;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getNumResults() {
        return numResults;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public List<String> getTypeFilterSet() {
        return typeFilterSet;
    }

    public void setTypeFilterSet(List<String> typeFilterSet) {
        this.typeFilterSet = typeFilterSet;
    }

    public List<String> getNonprofitFilterSet() {
        return nonprofitFilterSet;
    }

    public void setNonprofitFilterSet(List<String> nonprofitFilterSet) {
        this.nonprofitFilterSet = nonprofitFilterSet;
    }

    public List<String> getSubmissionFilterSet() {
        return submissionFilterSet;
    }

    public void setSubmissionFilterSet(List<String> submissionFilterSet) {
        this.submissionFilterSet = submissionFilterSet;
    }

    public boolean getIncludeAll() {
        return includeAll;
    }

    public void setIncludeAll(boolean includeAll) {
        this.includeAll = includeAll;
    }
}

public static class FoundationSearchBarQuery {
    private int page;
    private int pageSize;
    private String query;

    public FoundationSearchBarQuery() {}

    public FoundationSearchBarQuery(int page, int pageSize, String query) {
        this.page = page;
        this.pageSize = pageSize;
        this.query = query;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}

public static class TaskSearchResponse {
    private List<Task> tasks;
    private int count;

    public TaskSearchResponse() {}

    public TaskSearchResponse(List<Task> tasks, int count) {
        this.tasks = tasks;
        this.count = count;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

public static class TaskSearchQuery {
    private int page;
    private int pageSize;
    private String queryText;
    private List<String> foundationGranteeOwners;
    private String nonprofitId;
    public enum Type {
        CRM,
        GRANT_APPLICATION,
        REPORT,
        AGREEMENT_TEMPLATE,
        DONOR,
    }
    private Type type;
    private List<String> sourceIds;
    private List<String> sourceTypes;
    private List<String> taskStatus;
    public enum TaskType {
        INTERNAL,
        EXTERNAL,
    }
    private TaskType taskType;
    private List<String> systemLabels;
    private List<String> assignees;
    private List<String> neAssignees;
    private List<String> watchers;
    private boolean foundationOnlyAssigned;
    private boolean granteeOnlyAssigned;
    private boolean unassigned;
    private List<TaskSourceEntity> additionalSources;

    public TaskSearchQuery() {}

    public TaskSearchQuery(int page, int pageSize, String queryText, List<String> foundationGranteeOwners, String nonprofitId, Type type, List<String> sourceIds, List<String> sourceTypes, List<String> taskStatus, TaskType taskType, List<String> systemLabels, List<String> assignees, List<String> neAssignees, List<String> watchers, boolean foundationOnlyAssigned, boolean granteeOnlyAssigned, boolean unassigned, List<TaskSourceEntity> additionalSources) {
        this.page = page;
        this.pageSize = pageSize;
        this.queryText = queryText;
        this.foundationGranteeOwners = foundationGranteeOwners;
        this.nonprofitId = nonprofitId;
        this.type = type;
        this.sourceIds = sourceIds;
        this.sourceTypes = sourceTypes;
        this.taskStatus = taskStatus;
        this.taskType = taskType;
        this.systemLabels = systemLabels;
        this.assignees = assignees;
        this.neAssignees = neAssignees;
        this.watchers = watchers;
        this.foundationOnlyAssigned = foundationOnlyAssigned;
        this.granteeOnlyAssigned = granteeOnlyAssigned;
        this.unassigned = unassigned;
        this.additionalSources = additionalSources;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public List<String> getFoundationGranteeOwners() {
        return foundationGranteeOwners;
    }

    public void setFoundationGranteeOwners(List<String> foundationGranteeOwners) {
        this.foundationGranteeOwners = foundationGranteeOwners;
    }

    public String getNonprofitId() {
        return nonprofitId;
    }

    public void setNonprofitId(String nonprofitId) {
        this.nonprofitId = nonprofitId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getSourceIds() {
        return sourceIds;
    }

    public void setSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
    }

    public List<String> getSourceTypes() {
        return sourceTypes;
    }

    public void setSourceTypes(List<String> sourceTypes) {
        this.sourceTypes = sourceTypes;
    }

    public List<String> getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(List<String> taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public List<String> getSystemLabels() {
        return systemLabels;
    }

    public void setSystemLabels(List<String> systemLabels) {
        this.systemLabels = systemLabels;
    }

    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public List<String> getNeAssignees() {
        return neAssignees;
    }

    public void setNeAssignees(List<String> neAssignees) {
        this.neAssignees = neAssignees;
    }

    public List<String> getWatchers() {
        return watchers;
    }

    public void setWatchers(List<String> watchers) {
        this.watchers = watchers;
    }

    public boolean getFoundationOnlyAssigned() {
        return foundationOnlyAssigned;
    }

    public void setFoundationOnlyAssigned(boolean foundationOnlyAssigned) {
        this.foundationOnlyAssigned = foundationOnlyAssigned;
    }

    public boolean getGranteeOnlyAssigned() {
        return granteeOnlyAssigned;
    }

    public void setGranteeOnlyAssigned(boolean granteeOnlyAssigned) {
        this.granteeOnlyAssigned = granteeOnlyAssigned;
    }

    public boolean getUnassigned() {
        return unassigned;
    }

    public void setUnassigned(boolean unassigned) {
        this.unassigned = unassigned;
    }

    public List<TaskSourceEntity> getAdditionalSources() {
        return additionalSources;
    }

    public void setAdditionalSources(List<TaskSourceEntity> additionalSources) {
        this.additionalSources = additionalSources;
    }
}

public static class TaskComment {
    private String id;
    private String taskId;
    private String createdBy;
    private String updatedBy;
    public enum Visibility {
        INTERNAL,
        EXTERNAL,
    }
    private Visibility visibility;
    private String comment;
    private String created;
    private String updated;
    private FoundationUser createdByFoundationUser;
    private NonprofitUser createdByNonprofitUser;
    private FoundationUser updatedByFoundationUser;
    private NonprofitUser updatedByNonprofitUser;
    private UserDetails createdByUser;
    private UserDetails updatedByUser;

    public TaskComment() {}

    public TaskComment(String id, String taskId, String createdBy, String updatedBy, Visibility visibility, String comment, String created, String updated, FoundationUser createdByFoundationUser, NonprofitUser createdByNonprofitUser, FoundationUser updatedByFoundationUser, NonprofitUser updatedByNonprofitUser, UserDetails createdByUser, UserDetails updatedByUser) {
        this.id = id;
        this.taskId = taskId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.visibility = visibility;
        this.comment = comment;
        this.created = created;
        this.updated = updated;
        this.createdByFoundationUser = createdByFoundationUser;
        this.createdByNonprofitUser = createdByNonprofitUser;
        this.updatedByFoundationUser = updatedByFoundationUser;
        this.updatedByNonprofitUser = updatedByNonprofitUser;
        this.createdByUser = createdByUser;
        this.updatedByUser = updatedByUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public FoundationUser getCreatedByFoundationUser() {
        return createdByFoundationUser;
    }

    public void setCreatedByFoundationUser(FoundationUser createdByFoundationUser) {
        this.createdByFoundationUser = createdByFoundationUser;
    }

    public NonprofitUser getCreatedByNonprofitUser() {
        return createdByNonprofitUser;
    }

    public void setCreatedByNonprofitUser(NonprofitUser createdByNonprofitUser) {
        this.createdByNonprofitUser = createdByNonprofitUser;
    }

    public FoundationUser getUpdatedByFoundationUser() {
        return updatedByFoundationUser;
    }

    public void setUpdatedByFoundationUser(FoundationUser updatedByFoundationUser) {
        this.updatedByFoundationUser = updatedByFoundationUser;
    }

    public NonprofitUser getUpdatedByNonprofitUser() {
        return updatedByNonprofitUser;
    }

    public void setUpdatedByNonprofitUser(NonprofitUser updatedByNonprofitUser) {
        this.updatedByNonprofitUser = updatedByNonprofitUser;
    }

    public UserDetails getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(UserDetails createdByUser) {
        this.createdByUser = createdByUser;
    }

    public UserDetails getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(UserDetails updatedByUser) {
        this.updatedByUser = updatedByUser;
    }
}

public static class BulkTaskSubmissionRequest {
    private List<String> taskIds;

    public BulkTaskSubmissionRequest() {}

    public BulkTaskSubmissionRequest(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }
}

public static class UserBearer {
    private String bearer;

    public UserBearer() {}

    public UserBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }
}

public static class GetNonprofitResult {
    private int total;
    private List<Nonprofit> data;

    public GetNonprofitResult() {}

    public GetNonprofitResult(int total, List<Nonprofit> data) {
        this.total = total;
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Nonprofit> getData() {
        return data;
    }

    public void setData(List<Nonprofit> data) {
        this.data = data;
    }
}

public static class GetNonprofitMetadataResult {
    private List<NonprofitMetadata> data;
    private int total;

    public GetNonprofitMetadataResult() {}

    public GetNonprofitMetadataResult(List<NonprofitMetadata> data, int total) {
        this.data = data;
        this.total = total;
    }

    public List<NonprofitMetadata> getData() {
        return data;
    }

    public void setData(List<NonprofitMetadata> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

public static class GetNonprofitUserResult {
    private List<NonprofitUser> data;
    private int total;

    public GetNonprofitUserResult() {}

    public GetNonprofitUserResult(List<NonprofitUser> data, int total) {
        this.data = data;
        this.total = total;
    }

    public List<NonprofitUser> getData() {
        return data;
    }

    public void setData(List<NonprofitUser> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

public static class AnalyticsPaymentYOYData {
    private List<FiscalRange> years;
    private List<AnalyticsFieldYOYData> paymentYOYData;

    public AnalyticsPaymentYOYData() {}

    public AnalyticsPaymentYOYData(List<FiscalRange> years, List<AnalyticsFieldYOYData> paymentYOYData) {
        this.years = years;
        this.paymentYOYData = paymentYOYData;
    }

    public List<FiscalRange> getYears() {
        return years;
    }

    public void setYears(List<FiscalRange> years) {
        this.years = years;
    }

    public List<AnalyticsFieldYOYData> getPaymentYOYData() {
        return paymentYOYData;
    }

    public void setPaymentYOYData(List<AnalyticsFieldYOYData> paymentYOYData) {
        this.paymentYOYData = paymentYOYData;
    }
}

public static class PDFDocumentDisplay {
    private List<DocumentItem> displayFields;

    public PDFDocumentDisplay() {}

    public PDFDocumentDisplay(List<DocumentItem> displayFields) {
        this.displayFields = displayFields;
    }

    public List<DocumentItem> getDisplayFields() {
        return displayFields;
    }

    public void setDisplayFields(List<DocumentItem> displayFields) {
        this.displayFields = displayFields;
    }
}

public static class BoardGrantProposalAdditionalInfo {
    private PDFDocumentDisplay pdfDocumentDisplay;

    public BoardGrantProposalAdditionalInfo() {}

    public BoardGrantProposalAdditionalInfo(PDFDocumentDisplay pdfDocumentDisplay) {
        this.pdfDocumentDisplay = pdfDocumentDisplay;
    }

    public PDFDocumentDisplay getPdfDocumentDisplay() {
        return pdfDocumentDisplay;
    }

    public void setPdfDocumentDisplay(PDFDocumentDisplay pdfDocumentDisplay) {
        this.pdfDocumentDisplay = pdfDocumentDisplay;
    }
}

}
