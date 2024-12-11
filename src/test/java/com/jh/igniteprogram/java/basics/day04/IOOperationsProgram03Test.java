package com.jh.igniteprogram.java.basics.day04;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOOperationsProgram03Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates File I/O by writing and then reading data from a file.
     *
     * Input:
     * Data "File I/O in Java" written to "example.txt"
     * 
     * Expected Output:
     * "Read from file: File I/O in Java"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = IOOperationsProgram03.run();
        
        // Expected output
        String expected = "Read from file: File I/O in Java";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}