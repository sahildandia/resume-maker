import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.example.resumeparser.model.Resume;
import com.example.resumeparser.service.parsing.ResumeParserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResumeParserServiceTest {

    private ResumeParserService resumeParserService;

    @BeforeEach
    void setUp() {
        resumeParserService = new ResumeParserService();
    }

    @Test
    void testParseResume() {
        String resumeText = "John Doe\nSkills: Java, Spring\nEducation: BSc Computer Science\nExperience: 5 years at XYZ Corp";
        Resume parsedResume = resumeParserService.parseResume(resumeText);

        assertNotNull(parsedResume);
        assertEquals("John Doe", parsedResume.getName());
        assertTrue(parsedResume.getSkills().stream().anyMatch(skill -> skill.getName().equals("Java")));
        assertEquals("BSc Computer Science", parsedResume.getEducation().get(0).getDegree());
        assertEquals(5, parsedResume.getExperience().get(0).getYears());
    }

    @Test
    void testParseEmptyResume() {
        String resumeText = "";
        Resume parsedResume = resumeParserService.parseResume(resumeText);

        assertNotNull(parsedResume);
        assertTrue(parsedResume.getSkills().isEmpty());
        assertTrue(parsedResume.getEducation().isEmpty());
        assertTrue(parsedResume.getExperience().isEmpty());
    }
}