package com.example.resumeparser.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextExtractionUtil {

    public static List<String> extractSkills(String resumeText) {
        List<String> skills = new ArrayList<>();
        String skillPattern = "(?i)\\b(java|python|javascript|c\\+\\+|c#|html|css|sql|ruby|php|swift|kotlin|go|rust|typescript|react|angular|node.js|machine learning|data analysis|cloud computing|devops|agile|scrum|project management)\\b";
        Matcher matcher = Pattern.compile(skillPattern).matcher(resumeText);
        
        while (matcher.find()) {
            skills.add(matcher.group().toLowerCase());
        }
        
        return skills;
    }

    public static List<String> extractEducation(String resumeText) {
        List<String> education = new ArrayList<>();
        String educationPattern = "(?i)(bachelor's|master's|phd|associate's|diploma|degree|certification|coursework)";
        Matcher matcher = Pattern.compile(educationPattern).matcher(resumeText);
        
        while (matcher.find()) {
            education.add(matcher.group().toLowerCase());
        }
        
        return education;
    }

    public static List<String> extractExperience(String resumeText) {
        List<String> experience = new ArrayList<>();
        String experiencePattern = "(?i)(\\d+\\s+years?|\\d+\\s+months?|internship|freelance|contract|full-time|part-time)";
        Matcher matcher = Pattern.compile(experiencePattern).matcher(resumeText);
        
        while (matcher.find()) {
            experience.add(matcher.group().toLowerCase());
        }
        
        return experience;
    }
}