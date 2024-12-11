package com.jh.igniteprogram.java.advance.day02;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveFramework04Test {

    /*
     * Problem Statement:
     * Verify that the run method creates a CompletableFuture, applies a transformation, and returns the final result.
     * Input: "Task 4"
     * Expected Output: "Task result: Task 4 (processed)"
     */

    @Test
    public void testRun() {
        // Input value
        String input = "Task 4";

        // Run the method and capture the result
        String result = ExecutiveFramework04.run(input);

        // Assert the expected result
        String expected = "Task result: Task 4 (processed)";
        assertEquals(expected, result);
    }
}
