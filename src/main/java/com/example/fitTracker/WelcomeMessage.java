package com.example.fitTracker;
import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Welcome to FitTracker!";
    }
}
