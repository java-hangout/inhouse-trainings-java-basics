package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcurrencyThreadsProgram01Test {

    /*
     * Problem Statement:
     * Verify that the run method starts a new thread and passes the correct input.
     * Input: "Hello from thread!"
     * Expected Output: "Thread started with input: Hello from thread!"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Hello from thread!";

        // Run the method and capture the result
        String result = ConcurrencyThreadsProgram01.run(input);

        // Assert the expected result
        String expected = "Thread started with input: Hello from thread!";
        assertEquals(expected, result);
    }
}
