package com.dp;

public class LoggingSystem {
	public static void main(String[] args) {
        // Step 4: Access the single instance of Logger
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");

        // Attempt to create another instance, but it returns the same instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");

        // Check if logger1 and logger2 are the same
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }

}
