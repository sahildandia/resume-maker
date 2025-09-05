package com.example.resumeparser.events;

public class NotificationEvent {
    private String userId;
    private String jobId;
    private String message;

    public NotificationEvent(String userId, String jobId, String message) {
        this.userId = userId;
        this.jobId = jobId;
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public String getJobId() {
        return jobId;
    }

    public String getMessage() {
        return message;
    }
}