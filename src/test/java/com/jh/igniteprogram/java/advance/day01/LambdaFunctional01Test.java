package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LambdaFunctional01Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly uses an anonymous inner class and a lambda expression 
     * to implement the Greeting interface and return the expected greeting message.
     * Input: "Alice"
     * Expected Output: "Hello, Alice | Hello, Alice"
     */

    @Test
    public void testRun() {
        // Input value
        String name = "Alice";

        // Run the method and capture the result
        String result = LambdaFunctional01.run(name);

        // Assert the expected result
        String expected = "Hello, Alice | Hello, Alice";
        assertEquals(expected, result);
    }
}
