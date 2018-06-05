package pl.sda.project.demoAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FortuneTest implements FortuneService {

    @Override
    public String getForutne() {
        return "Today is your lucky day";
    }
}
