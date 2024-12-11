package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Collections2Program01Test {

    /*
     * Problem Statement:
     * Verify that the method correctly demonstrates the Set interface by adding elements
     * to a HashSet. Ensure that duplicate elements are not added to the set.
     *
     * Input:
     * A HashSet with elements ["Apple", "Banana", "Cherry", "Apple"]
     *
     * Expected Output:
     * "Set contains: [Apple, Banana, Cherry]"
     */

    @Test
    public void testRun() {
        // Run the method
        String result = Collections2Program01.run();

        // Expected output
        String expected = "Set contains: [Apple, Cherry, Banana]";

        // Assert the expected result
        assertEquals(expected, result);
    }
}