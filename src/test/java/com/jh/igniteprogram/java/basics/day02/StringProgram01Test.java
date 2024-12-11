package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProgram01Test {

    /*
     * Problem Statement:
     * Verify that the program correctly concatenates a greeting message with the input string.
     * The program should return "Hello, <input>!".
     *
     * Input:
     * input = "John"
     *
     * Expected Output:
     * "Hello, John!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = StringProgram01.run("John");

        // Assert the expected result
        String expected = "Hello, John!";
        assertEquals(expected, result);
    }
}