package pl.sda.project.coach.beans;

public class TrackCoach implements Coach {
    private FortuneService fortune;

    TrackCoach(){
        System.out.println("no arguments constructor called");
    }

    public void setFortune(FortuneService fortune) {
        this.fortune = fortune;
    }
//    public FortuneService getFortune() {
//        return fortune;
//    }

    @Override
    public String getDailyWorkout() {
        return "Run a har 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getForutne();
    }


}
