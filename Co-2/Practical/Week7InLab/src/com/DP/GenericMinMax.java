package com.DP;

public class GenericMinMax {
	public static void main(String[] args) {
       
        Integer[] intArray = {3, 5, 1, 7, 9};
        ArrayOperations<Integer> intOps = new ArrayOperations<>(intArray);
        System.out.println("Integer Array - Min: " + intOps.min() + ", Max: " + intOps.max());

        
        String[] strArray = {"apple", "orange", "banana", "mango"};
        ArrayOperations<String> strOps = new ArrayOperations<>(strArray);
        System.out.println("String Array - Min: " + strOps.min() + ", Max: " + strOps.max());

       
        Character[] charArray = {'a', 'z', 'g', 'r'};
        ArrayOperations<Character> charOps = new ArrayOperations<>(charArray);
        System.out.println("Character Array - Min: " + charOps.min() + ", Max: " + charOps.max());

       
        Float[] floatArray = {1.5f, 3.7f, 0.2f, 4.8f};
        ArrayOperations<Float> floatOps = new ArrayOperations<>(floatArray);
        System.out.println("Float Array - Min: " + floatOps.min() + ", Max: " + floatOps.max());
    }

}
