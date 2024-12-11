package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolymorphismProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method demonstrates method overriding and dynamic binding.
     * The `sound` method should behave differently based on the object type (Dog or Cat).
     *
     * Input:
     * animalType = "Dog"
     *
     * Expected Output:
     * "Woof!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = PolymorphismProgram01.run("Dog");

        // Assert the expected result
        String expected = "Woof!";
        assertEquals(expected, result);
    }
}