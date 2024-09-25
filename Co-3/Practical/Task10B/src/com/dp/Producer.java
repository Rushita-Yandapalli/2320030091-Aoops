package com.dp;

public class Producer implements Runnable{
	private BoundedBuffer buffer;
    private final int maxItems;

    public Producer(BoundedBuffer buffer, int maxItems) {
        this.buffer = buffer;
        this.maxItems = maxItems;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int item = 0;
        try {
            while (item < maxItems) {
                buffer.produce(++item);
                Thread.sleep(500);  // Simulate time to produce an item
            }
            buffer.stopProduction();  // Notify consumer that production has stopped
            System.out.println("Production stopped.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		
	}

}
