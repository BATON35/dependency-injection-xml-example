package pl.sda.project.sportConfiguration.beans;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getForutne();
    }
}
