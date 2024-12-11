package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControlFlowProgram01Test {

    /*
     * Problem Statement:
     * Verify that the run method correctly compares two integers and returns the correct comparison result.
     *
     * Input:
     * a = 5, b = 10
     *
     * Expected Output:
     * "5 is smaller than 10"
     */

    @Test
    public void testRun() {
        int a = 5, b = 10;
        // Run the method with input values
        String result = ControlFlowProgram01.run(a, b);
        // Assert the expected result
        String expected = a + " is smaller than " + b;

//        String expected = a + " is greater than " + b;
//        String expected = a + " is equal to " + b;


        assertEquals(expected, result);
    }
}