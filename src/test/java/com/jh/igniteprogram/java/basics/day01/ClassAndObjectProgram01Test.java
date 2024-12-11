package com.jh.igniteprogram.java.basics.day01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassAndObjectProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly creates a Person object and retrieves its details.
     *
     * Input:
     * name = "John", age = 25
     *
     * Expected Output:
     * "Name: John, Age: 25"
     */

    @Test
    public void testRun() {
        String name = "John";
        int age = 25;
        // Run the method with input values
        String result = ClassAndObjectProgram01.run(name, age);

        // Assert the expected result
        String expected = "Name: " + name + ", " + "Age: " + age;
        assertEquals(expected, result);
    }
}