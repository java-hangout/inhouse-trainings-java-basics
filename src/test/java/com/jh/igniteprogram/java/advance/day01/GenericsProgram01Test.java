package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GenericsProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly calculates the sum of two numbers using generics
     * and constraints. The method should work with any type extending Number.
     * Input: num1 = 5.5, num2 = 10.2 (Double values)
     * Expected Output: "The sum of 5.5 and 10.2 is 15.7"
     */

    @Test
    public void testRun() {
        Double num1 = 5.5, num2 = 10.2;

        // Run the method and capture the result
        String result = GenericsProgram01.run(num1, num2);

        // Assert the expected result
        String expected = "The sum of 5.5 and 10.2 is " + (num1 + num2);
        assertEquals(expected, result);
    }
}
