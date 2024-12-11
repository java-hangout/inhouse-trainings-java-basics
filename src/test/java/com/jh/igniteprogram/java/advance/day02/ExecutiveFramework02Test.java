package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveFramework02Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly executes a callable task and returns the expected result.
     * Input: "Task 2"
     * Expected Output: "Task result: Task 2"
     */

    @Test
    public void testRun() throws Exception {
        // Input value
        String input = "Task 2";

        // Run the method and capture the result
        String result = ExecutiveFramework02.run(input);

        // Assert the expected result
        String expected = "Task result: Task 2";
        assertEquals(expected, result);
    }
}
