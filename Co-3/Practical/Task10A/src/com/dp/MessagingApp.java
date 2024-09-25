package com.dp;

public class MessagingApp {
	public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        int maxMessages = 10;  // Limit the number of messages
        Thread producerThread = new Thread(new Producer(buffer, maxMessages), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        producerThread.start();
        consumerThread.start();
        
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Messaging application finished.");
    }
}
