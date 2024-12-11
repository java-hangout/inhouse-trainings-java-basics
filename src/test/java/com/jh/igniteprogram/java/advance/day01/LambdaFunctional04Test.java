package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LambdaFunctional04Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly applies different functional interfaces such as Function, 
     * Predicate, BinaryOperator, and UnaryOperator to manipulate an integer and return the correct result.
     * Input: 5
     * Expected Output: 225 (Doubled to 10, added 10 to get 20, squared to get 225)
     */

    @Test
    public void testRun() {
        // Input value
        int input = 5;

        // Run the method and capture the result
        int result = LambdaFunctional04.run(input);

        // Assert the expected result
        int expected = 400; // (5 * 2 = 10), (10 + 10 = 20), (20 * 20 = 225)
        assertEquals(expected, result);
    }
}
