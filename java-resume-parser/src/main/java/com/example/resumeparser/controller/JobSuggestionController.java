package com.example.resumeparser.controller;

import com.example.resumeparser.dto.JobSuggestionDTO;
import com.example.resumeparser.service.matching.MatcherService;
import com.example.resumeparser.service.ranking.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobSuggestionController {

    private final MatcherService matcherService;
    private final RankingService rankingService;

    @Autowired
    public JobSuggestionController(MatcherService matcherService, RankingService rankingService) {
        this.matcherService = matcherService;
        this.rankingService = rankingService;
    }

    @GetMapping("/suggestions/{resumeId}")
    public List<JobSuggestionDTO> getJobSuggestions(@PathVariable String resumeId) {
        List<JobSuggestionDTO> suggestions = matcherService.matchResumeWithJobListings(resumeId);
        return rankingService.rankJobSuggestions(suggestions);
    }
}