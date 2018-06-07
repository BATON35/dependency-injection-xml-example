package pl.sda.project.sportConfiguration.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("pl.sda.project.sportConfiguration") //uncomment it to use AppSportConfiguration
@PropertySource("classpath:sport.properties")
public class SportConfig {
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());//Way it doesn't work in other package
    }
}
