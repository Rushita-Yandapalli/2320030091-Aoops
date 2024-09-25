package com.dp;
import java.util.*;

public class BoundedBuffer {
	private Queue<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 10;  // Maximum capacity of the buffer
    private boolean stopProducing = false;  // Flag to stop production

    // Synchronized method to add items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (buffer.size() == CAPACITY) {
            System.out.println("Buffer full. Producer waiting...");
            wait();  // Wait if buffer is full
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll();  // Notify consumer that an item is available
    }

    // Synchronized method to remove items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            if (stopProducing && buffer.isEmpty()) {
                return -1;  // Special signal to stop consumer
            }
            System.out.println("Buffer empty. Consumer waiting...");
            wait();  // Wait if buffer is empty
        }
        int item = buffer.poll();
        System.out.println("Consumed: " + item);
        notifyAll();  // Notify producer that space is available
        return item;
    }

    // Method to stop production
    public synchronized void stopProduction() {
        stopProducing = true;
        notifyAll();  // Notify consumers to stop waiting
    }

    public boolean isStopProducing() {
        return stopProducing;
    }
}


