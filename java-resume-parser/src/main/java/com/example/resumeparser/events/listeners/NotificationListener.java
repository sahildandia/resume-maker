package com.example.resumeparser.events.listeners;

import com.example.resumeparser.events.NotificationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

    @EventListener
    public void handleNotificationEvent(NotificationEvent event) {
        // Logic to handle the notification event, such as sending an email or a message to the user
        System.out.println("Notification received: " + event.getMessage());
    }
}