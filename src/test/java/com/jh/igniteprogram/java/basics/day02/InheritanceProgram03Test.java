package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceProgram03Test {

    /*
     * Problem Statement:
     * Verify that the method demonstrates the usage of abstract classes, final classes,
     * and multiple inheritance by creating Dog and Cat objects and calling their methods.
     *
     * Input:
     * animalType = "Cat"
     *
     * Expected Output:
     * "Meow!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = InheritanceProgram03.run("Cat");

        // Assert the expected result
        String expected = "Meow!";
        assertEquals(expected, result);
    }
}