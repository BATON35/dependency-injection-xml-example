package pl.sda.project.sportConfiguration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    //@Qualifier("restFortuneService") this way is proper
    public void SetFortuneService(@Qualifier("restFortuneService") FortuneService fortuneService) {
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
