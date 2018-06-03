package pl.sda.project.coach.beans;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do something";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
