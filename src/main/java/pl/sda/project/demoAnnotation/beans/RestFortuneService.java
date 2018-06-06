package pl.sda.project.demoAnnotation.beans;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getForutne() {
        return "FestFortuneService";
    }
}
