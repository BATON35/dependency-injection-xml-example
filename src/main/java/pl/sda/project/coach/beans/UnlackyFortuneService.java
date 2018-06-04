package pl.sda.project.coach.beans;

public class UnlackyFortuneService implements FortuneService {
    @Override
    public String getForutne() {
        return "Today you are jinx";
    }
}
