package com.example.resumeparser.model;

public class JobListing {
    private String title;
    private String company;
    private String location;
    private String description;
    private String requirements;

    public JobListing(String title, String company, String location, String description, String requirements) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.description = description;
        this.requirements = requirements;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}