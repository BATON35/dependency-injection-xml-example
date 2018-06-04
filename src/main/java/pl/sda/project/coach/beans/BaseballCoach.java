package pl.sda.project.coach.beans;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Do something";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getForutne();
    }
}
