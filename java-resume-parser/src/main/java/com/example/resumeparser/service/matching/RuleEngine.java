package com.example.resumeparser.service.matching;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.model.Resume;
import com.example.resumeparser.model.Suggestion;

import java.util.List;
import java.util.stream.Collectors;

public class RuleEngine {

    public List<Suggestion> matchResumesWithJobListings(List<Resume> resumes, List<JobListing> jobListings) {
        return resumes.stream()
                .flatMap(resume -> jobListings.stream()
                        .filter(jobListing -> isMatch(resume, jobListing))
                        .map(jobListing -> createSuggestion(resume, jobListing)))
                .collect(Collectors.toList());
    }

    private boolean isMatch(Resume resume, JobListing jobListing) {
        // Implement rule-based matching logic here
        return resume.getSkills().stream().anyMatch(skill -> jobListing.getRequiredSkills().contains(skill.getName())) &&
               resume.getEducation().stream().anyMatch(edu -> edu.getDegree().equals(jobListing.getRequiredDegree())) &&
               resume.getExperience().stream().anyMatch(exp -> exp.getYears() >= jobListing.getRequiredExperienceYears());
    }

    private Suggestion createSuggestion(Resume resume, JobListing jobListing) {
        Suggestion suggestion = new Suggestion();
        suggestion.setResumeId(resume.getId());
        suggestion.setJobListingId(jobListing.getId());
        suggestion.setJobTitle(jobListing.getTitle());
        suggestion.setMatchScore(calculateMatchScore(resume, jobListing));
        return suggestion;
    }

    private int calculateMatchScore(Resume resume, JobListing jobListing) {
        // Implement scoring logic based on matching criteria
        return 0; // Placeholder for actual score calculation
    }
}