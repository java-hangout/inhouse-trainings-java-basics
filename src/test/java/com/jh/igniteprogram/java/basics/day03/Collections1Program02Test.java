package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Collections1Program02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly iterates through a collection using the Iterable interface.
     *
     * Input:
     * A list of strings ["Apple", "Banana", "Cherry"]
     * 
     * Expected Output:
     * "Items: Apple Banana Cherry"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = Collections1Program02.run();
        
        // Expected output
        String expected = "Items: Apple Banana Cherry";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}