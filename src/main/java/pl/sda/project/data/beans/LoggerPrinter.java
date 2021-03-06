package pl.sda.project.data.beans;

public class LoggerPrinter {

    private LoggerFactory factory;

    public LoggerPrinter(LoggerFactory factory) {
        this.factory = factory;
    }

    public LoggerPrinter() {
    }

    public void printLog(String message) {
        String log = factory.getLog(message);
        System.out.println(log);
    }
}
