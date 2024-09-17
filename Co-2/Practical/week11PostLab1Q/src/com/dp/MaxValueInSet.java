package com.dp;
import java.util.*;

public class MaxValueInSet {
	 public static void main(String[] args) {
	        // Create a Set of integers
	        Set<Integer> numbers = new HashSet<>();

	        // Adding values to the set
	        numbers.add(10);
	        numbers.add(56);
	        numbers.add(22);
	        numbers.add(89);
	        numbers.add(34);
	        
	        System.out.println("Numbers in the set: " + numbers);

	        // Find the maximum value using Collections.max()
	        int maxValue = Collections.max(numbers);

	        // Print the maximum value
	        System.out.println("The maximum value in the set is: " + maxValue);
	    }

}
