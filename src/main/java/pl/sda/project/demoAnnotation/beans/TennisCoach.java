package pl.sda.project.demoAnnotation.beans;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
