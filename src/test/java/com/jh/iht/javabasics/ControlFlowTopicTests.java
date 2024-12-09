package com.jh.iht.javabasics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ControlFlowTopicTests {

    // Test Case 1: Test for Comparison Operators & Logical Operators
    /*
     * Problem Statement: 
     * Classify the number as Positive, Negative, or Zero based on the input number.
     * 
     * Input: 5
     * Expected Value: "Positive"
     * Explanation: The method checks if the number is greater than 0 (positive),
     * less than 0 (negative), or exactly 0 (zero).
     */
    @Test
    public void testProcessNumber() {
        // Test for Positive number
        {
            int num = 5;  // Input number is 5
            String result = ControlFlowTopic.processNumber(num);  // Call the method
            assertEquals("Positive", result);  // Expected: "Positive"
        }

        // Test for Negative number
        {
            int num = -3;  // Input number is -3
            String result = ControlFlowTopic.processNumber(num);  // Call the method
            assertEquals("Negative", result);  // Expected: "Negative"
        }

        // Test for Zero
        {
            int num = 0;  // Input number is 0
            String result = ControlFlowTopic.processNumber(num);  // Call the method
            assertEquals("Zero", result);      // Expected: "Zero"
        }
    }

    // Test Case 2: Test for FizzBuzz using the Static Method
    /*
     * Problem Statement:
     * Implement the FizzBuzz logic:
     * Return "Fizz" if the number is divisible by 3,
     * "Buzz" if the number is divisible by 5,
     * "FizzBuzz" if divisible by both 3 and 5, or the number itself if neither.
     * 
     * Input: 15
     * Expected Value: "FizzBuzz"
     * Explanation: Since 15 is divisible by both 3 and 5, it should return "FizzBuzz".
     */
    @Test
    public void testFizzBuzz() {
        // Test for FizzBuzz (multiples of both 3 and 5)
        {
            int num = 15;  // Input number is 15
            String result = ControlFlowTopic.fizzBuzz(num);  // Call the method
            assertEquals("FizzBuzz", result);  // Expected: "FizzBuzz"
        }

        // Test for Fizz (multiples of 3 only)
        {
            int num = 6;  // Input number is 6
            String result = ControlFlowTopic.fizzBuzz(num);  // Call the method
            assertEquals("Fizz", result);      // Expected: "Fizz"
        }

        // Test for Buzz (multiples of 5 only)
        {
            int num = 10;  // Input number is 10
            String result = ControlFlowTopic.fizzBuzz(num);  // Call the method
            assertEquals("Buzz", result);      // Expected: "Buzz"
        }

        // Test for a number that is not divisible by 3 or 5
        {
            int num = 7;  // Input number is 7
            String result = ControlFlowTopic.fizzBuzz(num);  // Call the method
            assertEquals("7", result);         // Expected: "7" (since it's neither divisible by 3 nor 5)
        }
    }

    // Test Case 3: Test for Loops with Break and Continue
    /*
     * Problem Statement:
     * Sum all even numbers from 1 to 20, but stop if the sum exceeds 100.
     * 
     * Input: No direct input as the method loops from 1 to 20
     * Expected Value: 90
     * Explanation: The sum of even numbers (2 + 4 + 6 + ... + 20) is 90.
     * The method should stop once the sum exceeds 100, which doesn't happen here.
     */
    @Test
    public void testSumEvenNumbers() {
        // Test for sum of even numbers
        {
            int expectedSum = 90;  // Sum of even numbers from 1 to 20
            int result = ControlFlowTopic.sumEvenNumbers();  // Call the method
            assertEquals(expectedSum, result);  // Expected: 90
        }
    }

    // Test Case 4: Test for For-Each Loop without ByteArrayOutputStream
    /*
     * Problem Statement:
     * Print the elements of the given array using a for-each loop.
     *
     * Input: Array [1, 2, 3, 4, 5]
     * Expected Value: "1 2 3 4 5"
     * Explanation: The method should print the elements of the array in sequence,
     * separated by a space.
     */
    @Test
    public void testPrintNumbers() {
        // Prepare the array
        {
            int[] numbers = {1, 2, 3, 4, 5};  // Input array

            // Call the method to print the numbers
            String result = ControlFlowTopic.printNumbers(numbers);  // Print the numbers from the array

            // Call the method to print the numbers
            ControlFlowTopic.printNumbers(numbers);  // Print the numbers from the array

            // Check if the output is correct
            assertEquals("1 2 3 4 5", result);  // Expected output: "1 2 3 4 5 "
        }
    }
}
