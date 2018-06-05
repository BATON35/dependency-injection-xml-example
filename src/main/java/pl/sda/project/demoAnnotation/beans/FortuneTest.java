package pl.sda.project.demoAnnotation.beans;

import org.springframework.stereotype.Component;

@Component
public class FortuneTest implements FortuneService {

    @Override
    public String getForutne() {
        return "Today is your lucky day";
    }
}
