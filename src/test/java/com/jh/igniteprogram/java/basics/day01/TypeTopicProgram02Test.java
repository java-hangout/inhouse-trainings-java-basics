package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeTopicProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly concatenates the name with a greeting,
     * converts the concatenated string to uppercase, and returns the correct result.
     * Input:
     * name = "OSBIndia"
     * Expected Output:
     * "HELLO, OSBINDIA!"
     */

    @Test
    public void testRun() {
        // Run the method with input "OSBIndia" and capture the result
        String name = "OSBIndia";
        String result = TypeTopicProgram02.run(name);

        // Assert the expected result
        String expected = "HELLO, OSBINDIA!";
        assertEquals(expected, result);
    }
}
