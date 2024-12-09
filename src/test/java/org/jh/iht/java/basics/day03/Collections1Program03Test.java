package org.jh.iht.java.basics.day03;

import org.jh.iht.java.basics.day03.Collections1Program03;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Collections1Program03Test {

    /*
     * Problem Statement:
     * Verify that the method correctly sorts the list using a custom Comparator that compares strings by their length.
     *
     * Input:
     * A list of strings ["Apple", "Banana", "Cherry"]
     *
     * Expected Output:
     * "Sorted fruits by length: [Apple, Cherry, Banana]"
     */

    @Test
    public void testRun() {
        // Run the method
        String result = Collections1Program03.run();

        // Expected output
        String expected = "Sorted fruits by length: [Apple, Banana, Cherry]";

        // Assert the expected result
        assertEquals(expected, result);
    }
}