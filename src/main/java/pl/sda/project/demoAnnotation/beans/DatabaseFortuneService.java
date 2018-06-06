package pl.sda.project.demoAnnotation.beans;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
    @Override
    public String getForutne() {
        return null;
    }
}
