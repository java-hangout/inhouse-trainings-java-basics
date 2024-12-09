package org.jh.iht.java.basics.day02;

import org.jh.iht.java.basics.day02.StringProgram03;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProgram03Test {

    /*
     * Problem Statement:
     * Verify that the method correctly compares two strings and concatenates them.
     * It should check string equality and return the concatenated result.
     *
     * Input:
     * str1 = "Hello", str2 = "Hello"
     *
     * Expected Output:
     * "Equality: true, Concatenation: Hello Hello"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = StringProgram03.run("Hello", "Hello");

        // Assert the expected result
        String expected = "Equality: true, Concatenation: Hello Hello";
        assertEquals(expected, result);
    }
}