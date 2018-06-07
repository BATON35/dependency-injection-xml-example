package pl.sda.project.sportConfiguration.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.project.sportConfiguration.beans.Coach;
import pl.sda.project.sportConfiguration.beans.SportConfig;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout() + " " + theCoach.getFortune());

    }

}
