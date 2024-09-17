package week8PostLabcom.dp;


public class Test {
	    public static void main(String[] args) {
	     
	        PriorityQueue<Integer> intQueue = new PriorityQueue<>();
	        intQueue.add(5);
	        intQueue.add(3);
	        intQueue.add(8);
	        intQueue.add(1);

	        System.out.println("Integer PriorityQueue:");
	        while (!intQueue.isEmpty()) {
	            System.out.println(intQueue.remove());
	        }

	       
	        PriorityQueue<Double> doubleQueue = new PriorityQueue<>();
	        doubleQueue.add(5.5);
	        doubleQueue.add(3.3);
	        doubleQueue.add(8.8);
	        doubleQueue.add(1.1);

	        System.out.println("\nDouble PriorityQueue:");
	        while (!doubleQueue.isEmpty()) {
	            System.out.println(doubleQueue.remove());
	        }

	        
	        PriorityQueue<String> stringQueue = new PriorityQueue<>();
	        stringQueue.add("apple");
	        stringQueue.add("banana");
	        stringQueue.add("cherry");
	        stringQueue.add("date");

	        System.out.println("\nString PriorityQueue:");
	        while (!stringQueue.isEmpty()) {
	            System.out.println(stringQueue.remove());
	        }
	    }
	}
