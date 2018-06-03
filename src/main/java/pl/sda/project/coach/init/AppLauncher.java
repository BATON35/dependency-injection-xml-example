package pl.sda.project.coach.init;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.project.coach.beans.Coach;

public class AppLauncher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("coachConfig.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach greedyCoach = context.getBean("greedyCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout() + " " + greedyCoach.getDailyWorkout());

        context.close();

    }
}
