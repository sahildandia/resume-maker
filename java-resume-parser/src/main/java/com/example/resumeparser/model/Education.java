package com.example.resumeparser.model;

public class Education {
    private String degree;
    private String institution;
    private String startDate;
    private String endDate;

    public Education() {
    }

    public Education(String degree, String institution, String startDate, String endDate) {
        this.degree = degree;
        this.institution = institution;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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