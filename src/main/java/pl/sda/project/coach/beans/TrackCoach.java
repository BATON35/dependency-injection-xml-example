package pl.sda.project.coach.beans;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a har 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }


}
