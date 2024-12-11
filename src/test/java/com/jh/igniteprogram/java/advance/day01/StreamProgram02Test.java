package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StreamProgram02Test {

    /*
     * Problem Statement:
     * Verify that the run method filters even numbers, skips the first one, and limits the result to 3 elements.
     * Input: [1, 2, 3, 4, 5, 6]
     * Expected Output: [4, 6]
     */

    @Test
    public void testRun() {
        // Input list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Run the method and capture the result
        List<Integer> result = StreamProgram02.run(numbers);

        // Assert the expected result
        List<Integer> expected = Arrays.asList(4, 6);
        assertEquals(expected, result);
    }
}
