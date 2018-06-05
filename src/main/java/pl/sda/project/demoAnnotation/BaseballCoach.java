package pl.sda.project.demoAnnotation;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Bounce a ball for 30 minutes";
    }

    @Override
    public String getFortune() {
        return null;
    }
}
