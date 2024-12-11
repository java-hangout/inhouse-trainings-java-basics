package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcurrencyThreadsProgram03Test {

    /*
     * Problem Statement:
     * Verify that the run method starts a new thread, waits for it to complete using join(), and then returns a message.
     * Input: "Joining thread task"
     * Expected Output: "Thread has completed its task with input: Joining thread task"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Joining thread task";

        // Run the method and capture the result
        String result = ConcurrencyThreadsProgram03.run(input);

        // Assert the expected result
        String expected = "Thread has completed its task with input: Joining thread task";
        assertEquals(expected, result);
    }
}
