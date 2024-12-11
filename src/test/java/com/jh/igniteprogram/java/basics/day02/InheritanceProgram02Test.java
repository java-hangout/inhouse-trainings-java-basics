package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method demonstrates upcasting and downcasting,
     * and compares objects based on their actual types.
     *
     * Input:
     * animalType = "Dog"
     *
     * Expected Output:
     * "It's a dog! Sound: Woof!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = InheritanceProgram02.run("Dog");

        // Assert the expected result
        String expected = "It's a dog! Sound: Woof!";
        assertEquals(expected, result);
    }
}