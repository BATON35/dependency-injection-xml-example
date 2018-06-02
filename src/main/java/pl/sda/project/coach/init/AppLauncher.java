package pl.sda.project.coach.init;

import pl.sda.project.coach.beans.Coach;
import pl.sda.project.coach.beans.TrackCoach;

public class AppLauncher {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyworkout());
    }
}
