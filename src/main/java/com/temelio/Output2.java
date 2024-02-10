package org.com;

import java.util.List;

public class Output2 {
    public class Address {
        private String street;
        private String city;
        private String state;
        private String zip;

        public Address() {}

        public Address(String street, String city, String state, String zip) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
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
    }

    public class Duration {
        private String grantStart;
        private String grantEnd;

        public Duration() {}

        public Duration(String grantStart, String grantEnd) {
            this.grantStart = grantStart;
            this.grantEnd = grantEnd;
        }

        public String getGrantStart() {
            return grantStart;
        }

        public void setGrantStart(String grantStart) {
            this.grantStart = grantStart;
        }

        public String getGrantEnd() {
            return grantEnd;
        }

        public void setGrantEnd(String grantEnd) {
            this.grantEnd = grantEnd;
        }
    }

    public class GrantSubmission {
        private int nonprofitId;
        private String grantName;
        private double requestedAmount;
        private double awardedAmount;
        public enum GrantType {
            OPERATING_GRANT,
            PROJECT_GRANT,
            OTHER,
        }
        private GrantType grantType;
        private List<String> tags;
        private Duration duration;

        public GrantSubmission() {}

        public GrantSubmission(int nonprofitId, String grantName, double requestedAmount, double awardedAmount, GrantType grantType, List<String> tags, Duration duration) {
            this.nonprofitId = nonprofitId;
            this.grantName = grantName;
            this.requestedAmount = requestedAmount;
            this.awardedAmount = awardedAmount;
            this.grantType = grantType;
            this.tags = tags;
            this.duration = duration;
        }

        public int getNonprofitId() {
            return nonprofitId;
        }

        public void setNonprofitId(int nonprofitId) {
            this.nonprofitId = nonprofitId;
        }

        public String getGrantName() {
            return grantName;
        }

        public void setGrantName(String grantName) {
            this.grantName = grantName;
        }

        public double getRequestedAmount() {
            return requestedAmount;
        }

        public void setRequestedAmount(double requestedAmount) {
            this.requestedAmount = requestedAmount;
        }

        public double getAwardedAmount() {
            return awardedAmount;
        }

        public void setAwardedAmount(double awardedAmount) {
            this.awardedAmount = awardedAmount;
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

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }
    }

    public class Nonprofit {
        private String legalName;
        private String ein;
        private String mission;
        private Address address;
        private List<GrantSubmission> grantSubmissions;

        public Nonprofit() {}

        public Nonprofit(String legalName, String ein, String mission, Address address, List<GrantSubmission> grantSubmissions) {
            this.legalName = legalName;
            this.ein = ein;
            this.mission = mission;
            this.address = address;
            this.grantSubmissions = grantSubmissions;
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

        public String getMission() {
            return mission;
        }

        public void setMission(String mission) {
            this.mission = mission;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public List<GrantSubmission> getGrantSubmissions() {
            return grantSubmissions;
        }

        public void setGrantSubmissions(List<GrantSubmission> grantSubmissions) {
            this.grantSubmissions = grantSubmissions;
        }
    }


}
