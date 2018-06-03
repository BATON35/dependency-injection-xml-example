package pl.sda.project.coach.beans;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Let's do some commercial";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
