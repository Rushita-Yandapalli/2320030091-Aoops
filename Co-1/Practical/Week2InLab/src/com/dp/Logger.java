package com.dp;

public class Logger {
private static Logger loggerInstance;
    
    // Step 2: Make the constructor private to prevent instantiation
    private Logger() {
        System.out.println("Logger initialized.");
    }
    
    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    // Logging method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}



