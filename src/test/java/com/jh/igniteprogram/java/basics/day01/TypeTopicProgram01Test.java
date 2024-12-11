package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTopicProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly calculates the sum of two integers,
     *  and returns the expected result.
     * Input: intVar1 = 10, intVar2 = 5
     * Expected Output: "The sum of 10 and 5 is 15"
     */

    @Test
    public void testRun() {
        int intVar1 = 10, intVar2 = 5;
        // Run the method and capture the result
        String result = TypeTopicProgram01.run(intVar1, intVar2);

        // Assert the expected result
        String expected = "The sum of " + intVar1 + " and " + intVar2 + " is " + (intVar1 + intVar2);
        assertEquals(expected, result);
    }
}