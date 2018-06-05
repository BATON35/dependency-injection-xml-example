package pl.sda.project.coach.beans;

public class TrackCoach implements Coach {
    private FortuneService fortune;

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
    public void hello(){
        System.out.println("Hello ");
    }
    public void bay(){
        System.out.println("Bay bay");
    }


}
