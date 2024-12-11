package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Collections1Program04Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates the Queue interface by adding items to the queue and removing one.
     *
     * Input:
     * Queue with elements ["Apple", "Banana", "Cherry"]
     * 
     * Expected Output:
     * "Removed item: Apple, Remaining queue: [Banana, Cherry]"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = Collections1Program04.run();
        
        // Expected output
        String expected = "Removed item: Apple, Remaining queue: [Banana, Cherry]";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}