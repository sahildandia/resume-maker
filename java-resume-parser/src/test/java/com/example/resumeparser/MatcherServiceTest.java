import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.model.Resume;
import com.example.resumeparser.service.matching.MatcherService;
import com.example.resumeparser.service.matching.RuleEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MatcherServiceTest {

    private MatcherService matcherService;
    private RuleEngine ruleEngine;

    @BeforeEach
    void setUp() {
        ruleEngine = mock(RuleEngine.class);
        matcherService = new MatcherService(ruleEngine);
    }

    @Test
    void testMatchResumesWithJobListings() {
        Resume resume = new Resume();
        resume.setSkills(Arrays.asList("Java", "Spring", "SQL"));

        JobListing jobListing1 = new JobListing();
        jobListing1.setRequiredSkills(Arrays.asList("Java", "Spring"));

        JobListing jobListing2 = new JobListing();
        jobListing2.setRequiredSkills(Arrays.asList("Python", "Django"));

        when(ruleEngine.match(resume, jobListing1)).thenReturn(true);
        when(ruleEngine.match(resume, jobListing2)).thenReturn(false);

        List<JobListing> jobListings = Arrays.asList(jobListing1, jobListing2);
        List<JobListing> matchedListings = matcherService.matchResumesWithJobListings(resume, jobListings);

        assertEquals(1, matchedListings.size());
        assertTrue(matchedListings.contains(jobListing1));
        assertFalse(matchedListings.contains(jobListing2));
    }

    @Test
    void testNoMatchesFound() {
        Resume resume = new Resume();
        resume.setSkills(Arrays.asList("Java", "Spring"));

        JobListing jobListing = new JobListing();
        jobListing.setRequiredSkills(Arrays.asList("Python", "Django"));

        when(ruleEngine.match(resume, jobListing)).thenReturn(false);

        List<JobListing> jobListings = Arrays.asList(jobListing);
        List<JobListing> matchedListings = matcherService.matchResumesWithJobListings(resume, jobListings);

        assertTrue(matchedListings.isEmpty());
    }
}