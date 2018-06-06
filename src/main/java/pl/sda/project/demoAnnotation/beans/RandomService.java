package pl.sda.project.demoAnnotation.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService {
    private String[] predictions = {"Today is your lucky day ", "Today you are jinx ", "We will see "};
    private String prediction;

    RandomService() {
        prediction = drawPrediction();
    }

    @Override
    public String getForutne() {
        return prediction;
    }

    private String drawPrediction() {
        Random random = new Random();
        return predictions[random.nextInt(predictions.length)];
    }
}
