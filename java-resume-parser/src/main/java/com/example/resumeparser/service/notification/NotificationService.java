package com.example.resumeparser.service.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private JavaMailSender mailSender;

    public void notifyUser(String email, String jobTitle, String jobLink) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Job Opportunity: " + jobTitle);
        message.setText("We found a job that matches your profile: " + jobTitle + "\nApply here: " + jobLink);
        mailSender.send(message);
    }
}