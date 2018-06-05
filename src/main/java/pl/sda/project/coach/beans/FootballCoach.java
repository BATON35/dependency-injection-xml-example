package pl.sda.project.coach.beans;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;
    private String  name;
    private String email;

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

    public void setName(String  name) {
        this.name = name;
    }

    public String  getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
