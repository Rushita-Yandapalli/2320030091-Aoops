package com.dp;

public class BoundedBufferApp {
		    public static void main(String[] args) {
		        BoundedBuffer buffer = new BoundedBuffer();

		        int maxItems = 20;  // Limit the number of items to produce/consume
		        Thread producerThread = new Thread(new Producer(buffer, maxItems), "Producer");
		        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

		        // Start the threads
		        producerThread.start();
		        consumerThread.start();
		        
		        // Optionally join threads if needed
		        try {
		            producerThread.join();
		            consumerThread.join();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        System.out.println("Bounded buffer application finished.");
		    }

}
