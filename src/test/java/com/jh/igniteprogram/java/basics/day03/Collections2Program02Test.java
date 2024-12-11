package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Collections2Program02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates the Map interface by adding key-value pairs
     * to a HashMap. Ensure the correct retrieval of values using keys.
     *
     * Input:
     * A HashMap with elements {"Apple" -> 5, "Banana" -> 3, "Cherry" -> 7}
     * 
     * Expected Output:
     * "Apple count: 5, Map contains: {Apple=5, Banana=3, Cherry=7}"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = Collections2Program02.run();
        
        // Expected output
        String expected = "Apple count: 5, Map contains: {Apple=5, Cherry=7, Banana=3}";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}