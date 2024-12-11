package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class StreamProgram03Test {

    /*
     * Problem Statement:
     * Verify that the run method partitions numbers into even and odd numbers using Collectors.partitioningBy.
     * Input: [1, 2, 3, 4, 5, 6]
     * Expected Output: {false=[1, 3, 5], true=[2, 4, 6]}
     */

    @Test
    public void testRun() {
        // Input list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Run the method and capture the result
        Map<Boolean, List<Integer>> result = StreamProgram03.run(numbers);

        // Assert the expected result
        Map<Boolean, List<Integer>> expected = Map.of(
                false, Arrays.asList(1, 3, 5),
                true, Arrays.asList(2, 4, 6)
        );
        assertEquals(expected, result);
    }
}
