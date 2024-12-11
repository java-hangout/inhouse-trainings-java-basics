package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LambdaFunctional03Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly uses the Consumer interface to print a value 
     * and the Supplier interface to return a value.
     * Input: "Hello, World!"
     * Expected Output: "Hello from Supplier!"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Hello, World!";

        // Run the method and capture the result
        String result = LambdaFunctional03.run(input);

        // Assert the expected result
        String expected = "Hello from Supplier!";
        assertEquals(expected, result);
    }
}
