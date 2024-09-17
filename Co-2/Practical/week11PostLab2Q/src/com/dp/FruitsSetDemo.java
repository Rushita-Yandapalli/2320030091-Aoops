package com.dp;
import java.util.*;

public class FruitsSetDemo {
	public static void main(String[] args) {
        // Create a TreeSet to store fruits
        Set<String> fruits = new TreeSet<>();

        // Add some fruits to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");
        fruits.add("Grape");

        // Print out the fruits in alphabetical order
        System.out.println("Fruits in alphabetical order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
	}

}
