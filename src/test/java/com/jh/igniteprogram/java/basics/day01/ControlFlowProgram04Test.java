package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowProgram04Test {

    /*
     * Problem Statement:
     * Verify that the method correctly uses the for loop, while loop, and do-while loop to print numbers up to a given limit.
     *
     * Input:
     * limit = 3
     *
     * Expected Output:
     * "0 1 2 0 1 2 0 1 2"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = ControlFlowProgram04.run(3);
        // Assert the expected result
        String expected = "0 1 2 0 1 2 0 1 2";
        assertEquals(expected, result);
    }
}