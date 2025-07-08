package creationalPatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger logger;
    private final List<String> logHistory;

    private Logger() {
        System.out.println("Logger has ben initialized");
        logHistory = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public static synchronized Logger getInstanceSynchronized() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        String log = "{LOG}" + message;
        logHistory.add(log);
        System.out.println(log);
    }

    public List<String> getLogHistory() {
        return logHistory;
    }
}
