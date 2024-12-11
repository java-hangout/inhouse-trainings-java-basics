package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DesignPattern02Test {

    /*
     * Problem Statement:
     * Verify that the Adapter pattern allows compatibility between old and new systems.
     * The run method should use the adapter to play an old media type.
     * Input: "VHS"
     * Expected Output: "Playing old media type: VHS"
     */

    @Test
    public void testRun() {
        // Input media type
        String mediaType = "VHS";

        // Run the method and capture the result
        String result = DesignPattern02.run(mediaType);

        // Assert the expected result
        String expected = "Playing old media type: VHS";
        assertEquals(expected, result);
    }
}
