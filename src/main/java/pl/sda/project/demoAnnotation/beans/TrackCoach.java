package pl.sda.project.demoAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public void SetFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Move your ass!!!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getForutne();
    }
}
