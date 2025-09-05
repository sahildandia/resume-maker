import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.model.Suggestion;
import com.example.resumeparser.service.ranking.RankingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RankingServiceTest {

    private RankingService rankingService;

    @BeforeEach
    public void setUp() {
        rankingService = new RankingService();
    }

    @Test
    public void testRankJobSuggestions() {
        JobListing job1 = new JobListing("Software Engineer", "Develop software applications", Arrays.asList("Java", "Spring"));
        JobListing job2 = new JobListing("Data Scientist", "Analyze data and build models", Arrays.asList("Python", "Machine Learning"));
        JobListing job3 = new JobListing("Web Developer", "Build and maintain websites", Arrays.asList("HTML", "CSS", "JavaScript"));

        Suggestion suggestion1 = new Suggestion(job1, 0);
        Suggestion suggestion2 = new Suggestion(job2, 0);
        Suggestion suggestion3 = new Suggestion(job3, 0);

        List<Suggestion> suggestions = Arrays.asList(suggestion1, suggestion2, suggestion3);

        // Simulate ranking based on some criteria
        suggestions = rankingService.rankJobSuggestions(suggestions, Arrays.asList("Java", "Spring", "HTML"));

        assertEquals("Software Engineer", suggestions.get(0).getJobListing().getTitle());
        assertEquals("Web Developer", suggestions.get(1).getJobListing().getTitle());
        assertEquals("Data Scientist", suggestions.get(2).getJobListing().getTitle());
    }
}