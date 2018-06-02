package pl.sda.project.data.init;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.project.data.beans.LoggerPrinter;

public class AppLauncher {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

        LoggerPrinter loggerPrinter = context.getBean("loggerPrinterddd", LoggerPrinter.class);
        loggerPrinter.printLog("Spring Dependency Injection");

        context.close();
    }
}
