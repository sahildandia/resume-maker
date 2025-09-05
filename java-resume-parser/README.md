# Java Resume Parser Project

## Overview
The Java Resume Parser project is designed to extract relevant information from uploaded resumes, including skills, education, and work experience. It matches the parsed data with job listings using rule-based logic and provides ranked job suggestions to users. Additionally, the application notifies users of matching job opportunities.

## Features
- **Resume Parsing**: Extracts skills, education, and experience from resumes.
- **Job Matching**: Matches parsed resumes with job listings using a rule-based engine.
- **Job Ranking**: Ranks job suggestions based on relevance to the user's profile.
- **User Notifications**: Notifies users of matching job opportunities.

## Project Structure
```
java-resume-parser
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── resumeparser
│   │   │               ├── ResumeParserApplication.java
│   │   │               ├── controller
│   │   │               │   ├── UploadController.java
│   │   │               │   └── JobSuggestionController.java
│   │   │               ├── model
│   │   │               │   ├── Resume.java
│   │   │               │   ├── Skill.java
│   │   │               │   ├── Education.java
│   │   │               │   ├── Experience.java
│   │   │               │   ├── JobListing.java
│   │   │               │   └── Suggestion.java
│   │   │               ├── dto
│   │   │               │   ├── JobSuggestionDTO.java
│   │   │               │   └── UploadResponse.java
│   │   │               ├── service
│   │   │               │   ├── parsing
│   │   │               │   │   └── ResumeParserService.java
│   │   │               │   ├── matching
│   │   │               │   │   ├── MatcherService.java
│   │   │               │   │   └── RuleEngine.java
│   │   │               │   ├── ranking
│   │   │               │   │   └── RankingService.java
│   │   │               │   ├── notification
│   │   │               │   │   └── NotificationService.java
│   │   │               │   └── job
│   │   │               │       └── JobListingService.java
│   │   │               ├── repository
│   │   │               │   ├── JobListingRepository.java
│   │   │               │   ├── ResumeRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               ├── util
│   │   │               │   └── TextExtractionUtil.java
│   │   │               ├── config
│   │   │               │   └── AppConfig.java
│   │   │               └── events
│   │   │                   ├── NotificationEvent.java
│   │   │                   └── listeners
│   │   │                       └── NotificationListener.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── rules
│   │           └── rules.yml
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── resumeparser
│                       ├── MatcherServiceTest.java
│                       ├── RankingServiceTest.java
│                       └── ResumeParserServiceTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Getting Started
1. **Clone the repository**: 
   ```
   git clone <repository-url>
   ```
2. **Navigate to the project directory**:
   ```
   cd java-resume-parser
   ```
3. **Build the project**:
   ```
   mvn clean install
   ```
4. **Run the application**:
   ```
   mvn spring-boot:run
   ```

## Dependencies
This project uses Maven for dependency management. The required dependencies are specified in the `pom.xml` file.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License - see the LICENSE file for details.