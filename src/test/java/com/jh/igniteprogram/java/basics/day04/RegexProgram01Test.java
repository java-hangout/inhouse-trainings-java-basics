package com.jh.igniteprogram.java.basics.day04;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegexProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly finds and returns words starting with "Ja" in the input string.
     *
     * Input:
     * "Java is a great language. Javalin is also interesting."
     * 
     * Expected Output:
     * "Found match: Java\nFound match: Javalin"
     */
    
    @Test
    public void testRun() {
        // Run the method with input string
        String input = "Java is a great language. Javalin is also interesting.";
        String result = RegexProgram01.run(input);
        
        // Expected output
        String expected = "Found match: Java\nFound match: Javalin\n";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}