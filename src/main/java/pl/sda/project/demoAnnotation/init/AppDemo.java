package pl.sda.project.demoAnnotation.init;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.project.demoAnnotation.beans.Coach;

public class AppDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("DemoAnnotationConfig.xml");
        Coach theCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println("the Coach " + theCoach.getFortune());
        Coach theTennisCoach = context.getBean("OptionalNameForTennisCoach", Coach.class);
        System.out.println(theTennisCoach.getFortune());
        context.close();
    }
}
