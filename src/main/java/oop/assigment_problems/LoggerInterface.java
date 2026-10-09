package oop.assigment_problems;

interface AppLogger {
    void log(String message);
}

class ConsoleLogger implements AppLogger {
    public void log(String message) {
        System.out.println("[CONSOLE] " + message);
    }
}

class FileLogger implements AppLogger {
    public void log(String message) {
        System.out.println("[FILE_LOG] Appending to log.txt: " + message);
    }
}

public class LoggerInterface {
    public static void main(String[] args) {
        AppLogger l1 = new ConsoleLogger();
        AppLogger l2 = new FileLogger();
        l1.log("System initialized.");
        l2.log("User logged in successfully.");
    }
}
