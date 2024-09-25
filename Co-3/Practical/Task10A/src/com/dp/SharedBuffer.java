package com.dp;
import java.util.*;

public class SharedBuffer {
	private Queue<String> buffer = new LinkedList<>();
    private final int CAPACITY = 5;
    private boolean stopProducing = false;  // Flag to stop producer

    // Synchronized method to add a message to the buffer
    public synchronized void produce(String message) throws InterruptedException {
        while (buffer.size() == CAPACITY) {
            wait();  // Wait until space is available
        }
        buffer.add(message);
        System.out.println("Produced: " + message);
        notifyAll();  // Notify consumers that a message is available
    }

    // Synchronized method to consume a message from the buffer
    public synchronized String consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            if (stopProducing && buffer.isEmpty()) {
                return "END";  // Stop if no more messages to consume
            }
            wait();  // Wait until a message is available
        }
        String message = buffer.poll();
        System.out.println("Consumed: " + message);
        notifyAll();  // Notify producers that space is available
        return message;
    }

    // Method to stop production of messages
    public synchronized void stopProduction() {
        stopProducing = true;
        notifyAll();  // Notify all waiting consumers
    }

    public boolean isStopProducing() {
        return stopProducing;
    }
}

