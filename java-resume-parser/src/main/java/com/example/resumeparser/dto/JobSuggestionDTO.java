package com.example.resumeparser.dto;

import java.util.List;

public class JobSuggestionDTO {
    private String jobTitle;
    private String companyName;
    private String location;
    private List<String> requiredSkills;
    private String jobDescription;
    private double matchScore;

    public JobSuggestionDTO(String jobTitle, String companyName, String location, List<String> requiredSkills, String jobDescription, double matchScore) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.requiredSkills = requiredSkills;
        this.jobDescription = jobDescription;
        this.matchScore = matchScore;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(double matchScore) {
        this.matchScore = matchScore;
    }
}