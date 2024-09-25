package com.dp;

public class Consumer implements Runnable{
	private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = buffer.consume();
                if ("END".equals(message)) {
                    System.out.println("No more messages. Consumer exiting.");
                    break;  // Exit the loop if no more messages
                }
                Thread.sleep(1500);  // Simulate time to consume a message
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}