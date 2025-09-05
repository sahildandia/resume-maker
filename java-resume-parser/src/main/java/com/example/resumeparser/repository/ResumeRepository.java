package com.example.resumeparser.repository;

import com.example.resumeparser.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
    // Custom query methods can be defined here if needed
}