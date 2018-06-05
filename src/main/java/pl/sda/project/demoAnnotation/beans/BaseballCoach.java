package pl.sda.project.demoAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Bounce a ball for 30 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getForutne();
    }
}
