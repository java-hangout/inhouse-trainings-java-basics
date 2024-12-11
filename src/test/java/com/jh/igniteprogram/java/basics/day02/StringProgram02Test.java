package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProgram02Test {

    /*
     * Problem Statement:
     * Verify that the string is immutable. When we concatenate a string,
     * the original string remains unchanged.
     *
     * Input:
     * input = "World"
     *
     * Expected Output:
     * "Hello Hello, World!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = StringProgram02.run("World");

        // Assert the expected result
        String expected = "Hello Hello, World!";
        assertEquals(expected, result);
    }
}