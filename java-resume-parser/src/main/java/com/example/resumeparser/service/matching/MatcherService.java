package com.example.resumeparser.service.matching;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.model.Resume;
import com.example.resumeparser.model.Suggestion;
import com.example.resumeparser.service.ranking.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatcherService {

    private final RuleEngine ruleEngine;
    private final RankingService rankingService;

    @Autowired
    public MatcherService(RuleEngine ruleEngine, RankingService rankingService) {
        this.ruleEngine = ruleEngine;
        this.rankingService = rankingService;
    }

    public List<Suggestion> matchResumesWithJobListings(Resume resume, List<JobListing> jobListings) {
        List<Suggestion> suggestions = new ArrayList<>();

        for (JobListing jobListing : jobListings) {
            if (ruleEngine.matches(resume, jobListing)) {
                Suggestion suggestion = new Suggestion();
                suggestion.setJobListing(jobListing);
                suggestions.add(suggestion);
            }
        }

        return rankingService.rankSuggestions(suggestions);
    }
}