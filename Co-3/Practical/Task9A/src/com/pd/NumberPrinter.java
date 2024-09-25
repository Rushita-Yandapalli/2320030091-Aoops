package com.pd;

public class NumberPrinter {
	
	private static final int MAX_NUMBER = 15;

    public static void main(String[] args) {
        
        Runnable printTwo = () -> {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 2 == 0) {
                    System.out.println("Divisible by 2: " + i);
                }
            }
        };

        Runnable printThree = () -> {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 3 == 0) {
                    System.out.println("Divisible by 3: " + i);
                }
            }
        };

        Runnable printFour = () -> {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 4 == 0) {
                    System.out.println("Divisible by 4: " + i);
                }
            }
        };

        Runnable printFive = () -> {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 5 == 0) {
                    System.out.println("Divisible by 5: " + i);
                }
            }
        };

        Runnable printNumber = () -> {
            for (int i = 1; i <= MAX_NUMBER; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
                    System.out.println("Number: " + i);
                }
            }
        };

        // Create threads
        Thread thread1 = new Thread(printTwo);
        Thread thread2 = new Thread(printThree);
        Thread thread3 = new Thread(printFour);
        Thread thread4 = new Thread(printFive);
        Thread thread5 = new Thread(printNumber);

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All numbers processed.");
    }
}

