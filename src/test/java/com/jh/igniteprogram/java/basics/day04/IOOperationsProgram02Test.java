package com.jh.igniteprogram.java.basics.day04;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOOperationsProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly writes data to an OutputStream.
     *
     * Input:
     * Data "Java I/O"
     * 
     * Expected Output:
     * "Written to OutputStream: Java I/O"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = IOOperationsProgram02.run();
        
        // Expected output
        String expected = "Written to OutputStream: Java I/O";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}