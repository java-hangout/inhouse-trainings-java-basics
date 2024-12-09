package com.jh.iht.javabasics;

public class TypesTopic {

    // 1. Static method to sum two variables (Arithmetic Operations)
    public static int sumVariables(int a, int b) {
        return a + b;  // Return the sum of the two variables
    }

    // 2. Static method to concatenate two strings and return the result in uppercase (String Operations)
    public static String concatenate(String a, String b) {
        return (a + b).toUpperCase();  // Concatenate and convert to uppercase
    }

    // 3. Static method to double the values in an array (Array Operations)
    public static int[] doubleArrayValues(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i] * 2;  // Double each value in the array
        }
        return doubledArray;
    }

    // 4. Static method to return a constant value (Constants and Static Final Variables)
    public static int getConstantValue() {
        final int CONSTANT_VALUE = 100;  // Constant value
        return CONSTANT_VALUE;  // Return the constant value
    }
}
