package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveFramework03Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly executes a task asynchronously and returns the expected message.
     * Input: "Task 3"
     * Expected Output: "Task executed asynchronously: Task 3"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Task 3";

        // Run the method and capture the result
        String result = ExecutiveFramework03.run(input);

        // Assert the expected result
        String expected = "Task executed asynchronously: Task 3";
        assertEquals(expected, result);
    }
}
