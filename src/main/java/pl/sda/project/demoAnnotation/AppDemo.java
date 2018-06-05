package pl.sda.project.demoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class AppDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DemoAnnotationConfig.xml");
        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
