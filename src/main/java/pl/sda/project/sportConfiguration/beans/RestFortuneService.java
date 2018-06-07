package pl.sda.project.sportConfiguration.beans;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    @Override
    public String getForutne() {
        return "FestFortuneService";
    }
}
