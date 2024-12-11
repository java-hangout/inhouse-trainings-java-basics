package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LambdaFunctional02Test {

    /*
     * Problem Statement:
     * Verify that the run method demonstrates the use of method references and lambda expressions 
     * for multiplying two integers and returns the correct results.
     * Input: 3, 4
     * Expected Output: 24 (12 from method reference + 12 from lambda expression)
     */

    @Test
    public void testRun() {
        // Input values
        int a = 3;
        int b = 4;

        // Run the method and capture the result
        int result = LambdaFunctional02.run(a, b);

        // Assert the expected result
        int expected = 24; // 12 + 12
        assertEquals(expected, result);
    }
}
