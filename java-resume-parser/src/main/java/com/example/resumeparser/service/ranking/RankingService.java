package com.example.resumeparser.service.ranking;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.model.Suggestion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RankingService {

    public List<Suggestion> rankJobSuggestions(List<Suggestion> suggestions, List<JobListing> jobListings) {
        return suggestions.stream()
                .map(suggestion -> {
                    JobListing matchedJob = findMatchingJob(suggestion, jobListings);
                    suggestion.setJobListing(matchedJob);
                    return suggestion;
                })
                .filter(suggestion -> suggestion.getJobListing() != null)
                .sorted(this::compareSuggestions)
                .collect(Collectors.toList());
    }

    private JobListing findMatchingJob(Suggestion suggestion, List<JobListing> jobListings) {
        // Logic to find the matching job listing based on the suggestion
        return jobListings.stream()
                .filter(job -> job.getId().equals(suggestion.getJobId()))
                .findFirst()
                .orElse(null);
    }

    private int compareSuggestions(Suggestion s1, Suggestion s2) {
        // Logic to compare two suggestions based on relevance
        return Integer.compare(s2.getRelevanceScore(), s1.getRelevanceScore());
    }
}