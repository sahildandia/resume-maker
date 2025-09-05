package com.example.resumeparser.service.job;

import com.example.resumeparser.model.JobListing;
import com.example.resumeparser.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobListingService {

    private final JobListingRepository jobListingRepository;

    @Autowired
    public JobListingService(JobListingRepository jobListingRepository) {
        this.jobListingRepository = jobListingRepository;
    }

    public List<JobListing> getAllJobListings() {
        return jobListingRepository.findAll();
    }

    public JobListing getJobListingById(Long id) {
        return jobListingRepository.findById(id).orElse(null);
    }

    public JobListing createJobListing(JobListing jobListing) {
        return jobListingRepository.save(jobListing);
    }

    public void deleteJobListing(Long id) {
        jobListingRepository.deleteById(id);
    }
}