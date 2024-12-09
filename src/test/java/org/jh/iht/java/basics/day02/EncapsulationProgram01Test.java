package org.jh.iht.java.basics.day02;

import org.jh.iht.java.basics.day02.EncapsulationProgram01;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationProgram01Test {

    /*
     * Problem Statement:
     * Verify that the program correctly demonstrates EncapsulationProgram01 and access modifiers.
     * The name and age should be encapsulated and accessed via getters and setters.
     * The method should return the formatted user information.
     *
     * Input:
     * name = "John", age = 25
     *
     * Expected Output:
     * "Name: John, Age: 25"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = EncapsulationProgram01.run("John", 25);

        // Assert the expected result
        String expected = "Name: John, Age: 25";
        assertEquals(expected, result);
    }
}