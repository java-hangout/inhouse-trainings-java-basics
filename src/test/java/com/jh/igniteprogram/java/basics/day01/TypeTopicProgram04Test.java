package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTopicProgram04Test {

    /*
     * Problem Statement:
     * Verify that the method increments the static counter correctly and
     * returns the constant value correctly.
     * Input:
     * increment = 5
     * Expected Output:
     * "Counter: 5\nConstant Value: 100"
     */

    @Test
    public void testRun() {
        // Run the method with an increment of 5
        String result = TypeTopicProgram04.run(5);
//        System.out.println("result : " + result);
        // Assert the expected result
        String expected = "Counter: 5\nConstant Value: 100";
//        System.out.println("expected : " + expected);
        assertEquals(expected, result);
    }
}