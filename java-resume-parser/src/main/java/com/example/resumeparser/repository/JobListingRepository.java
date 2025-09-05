package com.example.resumeparser.repository;

import com.example.resumeparser.model.JobListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobListingRepository extends JpaRepository<JobListing, Long> {
    // Custom query methods can be defined here if needed
}