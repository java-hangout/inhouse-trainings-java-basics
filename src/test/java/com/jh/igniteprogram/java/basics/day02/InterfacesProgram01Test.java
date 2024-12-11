package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesProgram01Test {

    /*
     * Problem Statement:
     * Verify that the program implements the interface correctly and returns the expected greeting message.
     * The method should greet the input name with "Hello, <name>!".
     *
     * Input:
     * name = "Alice"
     *
     * Expected Output:
     * "Hello, Alice!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = InterfacesProgram01.run("Alice");

        // Assert the expected result
        String expected = "Hello, Alice!";
        assertEquals(expected, result);
    }
}