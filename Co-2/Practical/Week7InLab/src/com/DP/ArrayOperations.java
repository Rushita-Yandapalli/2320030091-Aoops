package com.DP;

public class ArrayOperations<T extends Comparable<T>> implements MinMax<T> {
	private T[] array;

    public ArrayOperations(T[] array) {
        this.array = array;
    }

	@Override
	public T min() {
		// TODO Auto-generated method stub
		 T minVal = array[0];
	        for (T element : array) {
	            if (element.compareTo(minVal) < 0) {
	                minVal = element;
	            }
	        }
	        return minVal;
		
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		T maxVal = array[0];
        for (T element : array) {
            if (element.compareTo(maxVal) > 0) {
                maxVal = element;
            }
        }
        return maxVal;
		
	}

}
