package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveFramework05Test {

    /*
     * Problem Statement:
     * Verify that the run method handles timeouts or exceptions properly.
     * Input: "timeout"
     * Expected Output: "Task timed out or encountered an exception."
     */

    @Test
    public void testRun() {
        // Input value
        String input = "timeout";

        // Run the method and capture the result
        String result = ExecutiveFramework05.run(input);

        // Assert the expected result
        String expected = "Task timed out or encountered an exception.";
        assertEquals(expected, result);
    }
}
