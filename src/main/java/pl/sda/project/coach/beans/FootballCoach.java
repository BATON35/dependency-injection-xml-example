package pl.sda.project.coach.beans;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    FootballCoach(){
    }
    FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Let's do some commercial";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getForutne();
    }
}
