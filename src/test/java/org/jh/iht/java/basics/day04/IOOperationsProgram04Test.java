package org.jh.iht.java.basics.day04;

import org.jh.iht.java.basics.day04.IOOperationsProgram04;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOOperationsProgram04Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates Buffered I/O by writing and reading data from a file.
     *
     * Input:
     * Data "Buffered I/O in Java" written to "buffered_example.txt"
     * 
     * Expected Output:
     * "Read from file: Buffered I/O in Java"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = IOOperationsProgram04.run();
        
        // Expected output
        String expected = "Read from file: Buffered I/O in Java";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}