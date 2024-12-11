package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProgram04Test {

    /*
     * Problem Statement:
     * Verify that the program correctly demonstrates the usage of StringBuffer and StringBuilder.
     * StringBuffer is synchronized, while StringBuilder is not.
     *
     * Input:
     * None (uses default data)
     *
     * Expected Output:
     * "StringBuffer: Hello World!, StringBuilder: Goodbye World!"
     */

    @Test
    public void testRun() {
        // Run the method
        String result = StringProgram04.run();

        // Assert the expected result
        String expected = "StringBuffer: Hello World!, StringBuilder: Goodbye World!";
        assertEquals(expected, result);
    }
}