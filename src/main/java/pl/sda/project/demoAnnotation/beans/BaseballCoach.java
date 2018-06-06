package pl.sda.project.demoAnnotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype" +
        "")
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
   // @Qualifier("randomService") error!!!!!!!!!!!!!!!!!
    BaseballCoach(@Qualifier("randomService") FortuneService fortuneService) {

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
