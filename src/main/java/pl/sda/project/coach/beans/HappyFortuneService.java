package pl.sda.project.coach.beans;

public class HappyFortuneService implements FortuneService {
    @Override
    public String GetForutne() {
        return "Today is yor lucky day!";
    }
}
