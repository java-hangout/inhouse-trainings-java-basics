package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method demonstrates inheritance, constructor usage, and access modifiers
     * by creating a Dog object and calling its describe method.
     *
     * Input:
     * name = "Buddy"
     *
     * Expected Output:
     * "I am a dog, and my name is Buddy"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = InheritanceProgram01.run("Buddy");

        // Assert the expected result
        String expected = "I am a dog, and my name is Buddy";
        assertEquals(expected, result);
    }
}