package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcurrencyThreadsProgram05Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly synchronizes access to the counter variable to avoid race conditions.
     * Input: No input, counter will be incremented by two threads.
     * Expected Output: "Counter value after both threads have finished: 2000"
     */

    @Test
    public void testRun() throws InterruptedException {
        // Run the method and capture the result
        String result = ConcurrencyThreadsProgram05.run();

        // Assert the expected result
        String expected = "Counter value after both threads have finished: 2000";
        assertEquals(expected, result);
    }
}
