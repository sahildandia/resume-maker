package com.example.resumeparser.model;

import java.util.List;

public class Resume {
    private List<Skill> skills;
    private List<Education> education;
    private List<Experience> experience;

    public Resume(List<Skill> skills, List<Education> education, List<Experience> experience) {
        this.skills = skills;
        this.education = education;
        this.experience = experience;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Education> getEducation() {
        return education;
    }

    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }
}