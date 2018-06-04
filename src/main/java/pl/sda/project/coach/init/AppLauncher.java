package pl.sda.project.coach.init;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.project.coach.beans.Coach;
import pl.sda.project.coach.beans.FootballCoach;

public class AppLauncher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("coachConfig.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        FootballCoach greedyCoach = context.getBean("greedyCoach",FootballCoach.class);

        System.out.println(greedyCoach.getDailyWorkout() + " " + greedyCoach.getDailyFortune());
        System.out.println("The coach " + greedyCoach.getName() + " says : " + theCoach.getDailyWorkout() + " " + theCoach.getDailyFortune());
        System.out.println("trener email is " + greedyCoach.getEmail());

        context.close();

    }
}


