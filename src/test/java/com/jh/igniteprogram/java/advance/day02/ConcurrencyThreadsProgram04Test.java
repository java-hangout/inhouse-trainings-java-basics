package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcurrencyThreadsProgram04Test {

    /*
     * Problem Statement:
     * Verify that the run method starts a new thread and interrupts it immediately.
     * Input: "Interrupting thread"
     * Expected Output: "Thread has been interrupted with input: Interrupting thread"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Interrupting thread";

        // Run the method and capture the result
        String result = ConcurrencyThreadsProgram04.run(input);

        // Assert the expected result
        String expected = "Thread has been interrupted with input: Interrupting thread";
        assertEquals(expected, result);
    }
}
