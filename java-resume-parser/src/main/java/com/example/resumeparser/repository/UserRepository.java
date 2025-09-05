package com.example.resumeparser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.resumeparser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}