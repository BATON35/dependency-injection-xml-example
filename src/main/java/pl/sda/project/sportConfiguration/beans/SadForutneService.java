package pl.sda.project.sportConfiguration.beans;

public class SadForutneService implements FortuneService {
    @Override
    public String getForutne() {
        return "Today is bad day!";
    }
}
