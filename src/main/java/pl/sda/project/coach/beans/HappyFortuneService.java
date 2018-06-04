package pl.sda.project.coach.beans;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getForutne() {
        return "Today is yor lucky day!";
    }
}
