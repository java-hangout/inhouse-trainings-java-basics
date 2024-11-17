package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * Create a method called `calculateSquare(int number)` which calculates the square of the
 * given integer number. The method should return the square of the input number.
 * The test cases will check the following scenarios:
 * 1. A positive integer (e.g., 5).
 * 2. A negative integer (e.g., -4).
 * 3. Zero (e.g., 0).
 *
 * The expected behavior is that the method returns the square of the input integer in each case.
 */
public class OReadingInputTest {
    
    // Test case for calculateSquare() method
    @Test
    public void testCalculateSquare() {
        // Creating an object of SquareCalculator
        OReadingInput calculator = new OReadingInput();

        // Test Case 1: Input 5, Expected Output: 25
        int input = 5;
        int expectedOutput = 25;
        int actualOutput = calculator.calculateSquare(input);
        Assertions.assertEquals( expectedOutput, actualOutput);

        // Test Case 2: Input -4, Expected Output: 16
        input = -4;
        expectedOutput = 16;
        actualOutput = calculator.calculateSquare(input);
        Assertions.assertEquals( expectedOutput, actualOutput);

        // Test Case 3: Input 0, Expected Output: 0
        input = 0;
        expectedOutput = 0;
        actualOutput = calculator.calculateSquare(input);
        Assertions.assertEquals( expectedOutput, actualOutput);
    }
}