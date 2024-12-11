package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GenericsProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method correctly compares two different types using generics,
     * and the Comparable interface. The method should print whether the first value is
     * greater than, less than, or equal to the second value.
     * Input: firstValue = 5, secondValue = 10 (Integer and Integer)
     * Expected Output: "Comparison of 5 and 10: 5 is less than 10"
     */

    @Test
    public void testRun() {
        Integer firstValue = 5;
        Integer secondValue = 10;

        // Run the method and capture the result
        String result = GenericsProgram02.run(firstValue, secondValue);

        // Assert the expected result
        String expected = "Comparison of 5 and 10: 5 is less than 10";
        assertEquals(expected, result);
    }
}
