package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveFramework01Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly submits a task to the thread pool and returns the expected message.
     * Input: "Task 1"
     * Expected Output: "Task submitted to the thread pool: Task 1"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Task 1";

        // Run the method and capture the result
        String result = ExecutiveFramework01.run(input);

        // Assert the expected result
        String expected = "Task submitted to the thread pool: Task 1";
        assertEquals(expected, result);
    }
}
