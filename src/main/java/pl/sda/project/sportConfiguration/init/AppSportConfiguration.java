package pl.sda.project.sportConfiguration.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.project.sportConfiguration.beans.Coach;
import pl.sda.project.sportConfiguration.beans.SportConfig;

//uncomment annotation @ComponentScan int SportConfig class

public class AppSportConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println("BaseballCoach " + theCoach.getFortune());
        Coach theTennisCoach = context.getBean("OptionalNameForTennisCoach", Coach.class);
        System.out.println("TennisCoach " + theTennisCoach.getFortune());
        Coach theTrackCoach = context.getBean("trackCoach", Coach.class);
        System.out.println("TrackCoach " + theTrackCoach.getFortune());
        context.close();
    }
}
