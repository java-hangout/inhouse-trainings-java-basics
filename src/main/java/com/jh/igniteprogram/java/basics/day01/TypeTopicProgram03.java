package com.jh.igniteprogram.java.basics.day01;

public class TypeTopicProgram03 {
    /*
     * Method to calculate the sum of the squares of an array of integers
     * and then compute the square root of the sum.
     *
     * @param numbers Array of integers
     * @return A string that includes the sum of the squares and its square root
     */
    public static String run(int[] numbers) {
        int sum = 0;
        
        // Calculate sum of squares
        for (int number : numbers) {
            sum += number * number;
        }
        
        // Calculate square root of the sum
        double sqrtSum = Math.sqrt(sum);
        
        // Return the result as a formatted string
        return String.format("Sum of square of array elements: %d\nSquare root of sum: %f", sum, sqrtSum);
    }
}
