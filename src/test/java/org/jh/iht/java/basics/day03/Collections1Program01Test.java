package org.jh.iht.java.basics.day03;

import org.jh.iht.java.basics.day03.Collections1Program01;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Collections1Program01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly adds elements to a collection (List) and returns the correct output.
     *
     * Input:
     * A list of strings ["Apple", "Banana", "Cherry"]
     * 
     * Expected Output:
     * "Items in collection: [Apple, Banana, Cherry]"
     */
    
    @Test
    public void testRun() {
        // Run the method
        String result = Collections1Program01.run();
        
        // Expected output
        String expected = "Items in collection: [Apple, Banana, Cherry]";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}