package pl.sda.project.coach.beans;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private String[] predictions;
    private String prediction;

    RandomFortuneService(){
        fillPredictions();
        prediction = drowPredictions();
    }

    @Override
    public String getForutne() {
        return prediction;
    }

    private void fillPredictions() {
        predictions = new String[]{
                "Its your lucky day",
                "Unfortunately bad luck",
                "We will see"};
    }

    private String drowPredictions() {
        Random random = new Random();
        return predictions[random.nextInt(predictions.length)];
    }

}
