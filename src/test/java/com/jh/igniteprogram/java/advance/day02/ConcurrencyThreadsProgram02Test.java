package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcurrencyThreadsProgram02Test {

    /*
     * Problem Statement:
     * Verify that the run method starts a new thread, pauses it for 2 seconds, and resumes it.
     * Input: "Pausing for 2 seconds"
     * Expected Output: "Thread started with input: Pausing for 2 seconds"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Pausing for 2 seconds";

        // Run the method and capture the result
        String result = ConcurrencyThreadsProgram02.run(input);

        // Assert the expected result
        String expected = "Thread started with input: Pausing for 2 seconds";
        assertEquals(expected, result);
    }
}
