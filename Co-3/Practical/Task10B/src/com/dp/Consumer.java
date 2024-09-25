package com.dp;

public class Consumer implements Runnable{
	private BoundedBuffer buffer;

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
            while (true) {
                int item = buffer.consume();
                if (item == -1) {
                    System.out.println("No more items. Consumer exiting.");
                    break;  // Exit loop if no more items
                }
                Thread.sleep(1000);  // Simulate time to consume an item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}

}
