package com.jh.iht.java.basics.dda;

public class CDebuggingExample {

    // Method that contains a bug (returns incorrect sum)
    public int addNumbers(int a, int b) {
        int sum = a * b; // Bug: multiplication instead of addition
        return sum;
    }

    // Method to simulate a logical error to debug
    public int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max; // Bug: This will cause an IndexOutOfBoundsException if the array is empty
    }
}