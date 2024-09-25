package com.dp;

public class Producer implements Runnable{

	private SharedBuffer buffer;
    private final int maxMessages;

    public Producer(SharedBuffer buffer, int maxMessages) {
        this.buffer = buffer;
        this.maxMessages = maxMessages;
    }

    @Override
    public void run() {
        int messageCount = 0;
        try {
            while (messageCount < maxMessages) {
                String message = "Message " + (++messageCount);
                buffer.produce(message);
                Thread.sleep(1000);  // Simulate time to produce a message
            }
            buffer.stopProduction();  // Notify that production has stopped
            System.out.println("Production stopped.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
