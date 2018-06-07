package pl.sda.project.sportConfiguration.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("pl.sda.project.sportConfiguration")
@PropertySource("classpath:sport.properties")
public class SportConfig {
}
