package com.example.resumeparser.model;

import java.util.List;

public class Suggestion {
    private String jobTitle;
    private String companyName;
    private String location;
    private List<String> requiredSkills;
    private String description;
    private double relevanceScore;

    public Suggestion(String jobTitle, String companyName, String location, List<String> requiredSkills, String description, double relevanceScore) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.location = location;
        this.requiredSkills = requiredSkills;
        this.description = description;
        this.relevanceScore = relevanceScore;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRelevanceScore() {
        return relevanceScore;
    }

    public void setRelevanceScore(double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }
}