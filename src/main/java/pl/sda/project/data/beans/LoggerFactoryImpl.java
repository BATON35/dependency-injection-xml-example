package pl.sda.project.data.beans;

import java.time.LocalDate;

public class LoggerFactoryImpl implements LoggerFactory {
    @Override
    public String getLog(String message) {
        return LocalDate.now() + ": " + message;
    }
}
