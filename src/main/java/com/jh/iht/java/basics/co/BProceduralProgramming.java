package com.jh.iht.java.basics.co;

/**
 * @author Veeresh N
 * @version 1.0
 */

public class BProceduralProgramming {

    // Method to sum the elements of an array
    public int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        BProceduralProgramming pp = new BProceduralProgramming();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = pp.sumArray(numbers);
        System.out.println("Sum of array: " + result);
    }
}