package com.dp;

import java.util.Arrays;

public class GenericBubbleSort {
	 public static <T extends Comparable<T>> void bubbleSort(T[] array) {
	        int n = array.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j].compareTo(array[j + 1]) > 0) {
	                    // Swap array[j] and array[j+1]
	                    T temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) break;
	        }
	    }

	 public static void main(String[] args) {
	        // Test with Integer array
	        Integer[] intArray = {5, 2, 9, 1, 5, 6};
	        System.out.println("Original Integer array: " + Arrays.toString(intArray));
	        bubbleSort(intArray);
	        System.out.println("Sorted Integer array: " + Arrays.toString(intArray));

	        // Test with Double array
	        Double[] doubleArray = {3.14, 2.71, 1.41, 1.73};
	        System.out.println("Original Double array: " + Arrays.toString(doubleArray));
	        bubbleSort(doubleArray);
	        System.out.println("Sorted Double array: " + Arrays.toString(doubleArray));

	        // Test with String array
	        String[] strArray = {"apple", "orange", "banana", "pear"};
	        System.out.println("Original String array: " + Arrays.toString(strArray));
	        bubbleSort(strArray);
	        System.out.println("Sorted String array: " + Arrays.toString(strArray));
	    }
	}

