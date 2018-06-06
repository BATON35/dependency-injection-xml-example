package pl.sda.project.demoAnnotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")    // spring does not call the @PreDestroy method for "prototype"
public class RandomService implements FortuneService {
    @Value("${foo.1Prediction}")
    private String prediction1;
    @Value("${foo.2Prediction}")
    private String prediction2;
    @Value("${foo.3Prediction}")
    private String prediction3;

    RandomService() {
    }
    @PostConstruct
    private void doSomething(){
        System.out.println("post!!!!!!!!!!!!!!");
    }
    @PreDestroy
    private void doSomethingElse() {
        System.out.println("Destroy!!!!!!!!!!!!!!");
    }
    @Override
    public String getForutne() {
        String[] predictions = setupData();
        return predictions[drawNumber(predictions.length)];
    }

    private String[]  setupData() {
        return new String []{prediction1, prediction2, prediction3};
    }

    private int drawNumber(int length) {
        Random random = new Random();
        return random.nextInt(length);
    }
}
