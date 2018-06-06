package pl.sda.project.demoAnnotation.beans;

import com.sun.tracing.dtrace.ModuleName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("OptionalNameForTennisCoach")
public class TennisCoach implements Coach {
    @Autowired
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return fortuneService.getForutne();
    }


}
