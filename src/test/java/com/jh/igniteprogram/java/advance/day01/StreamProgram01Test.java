package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class StreamProgram01Test {

    /*
     * Problem Statement:
     * Verify that the run method filters positive numbers, doubles them, and sorts them in ascending order.
     * Input: [3, -1, 4, 0, 5]
     * Expected Output: [6, 8, 10]
     */

    @Test
    public void testRun() {
        // Input list
        List<Integer> numbers = Arrays.asList(3, -1, 4, 0, 5);

        // Run the method and capture the result
        List<Integer> result = StreamProgram01.run(numbers);

        // Assert the expected result
        List<Integer> expected = Arrays.asList(6, 8, 10);
        assertEquals(expected, result);
    }
}
