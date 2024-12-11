package com.jh.igniteprogram.java.basics.day04;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOOperationsProgram01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly reads data from an InputStream and returns the correct string.
     *
     * Input:
     * InputStream with data "Hello, Java!"
     * 
     * Expected Output:
     * "Read from InputStream: Hello, Java!"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = IOOperationsProgram01.run();
        
        // Expected output
        String expected = "Read from InputStream: Hello, Java!";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}