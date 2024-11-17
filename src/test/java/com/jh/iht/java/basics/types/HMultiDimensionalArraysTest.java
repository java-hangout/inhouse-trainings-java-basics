package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Calculate the sum of all elements in a 2D array.
 * Input: - int[][] array = {{1, 2}, {3, 4}}
 * Expected Output: - The sum of the elements (1 + 2 + 3 + 4) = 10
 */
public class HMultiDimensionalArraysTest {

    @Test
    public void testSum2DArray() {
        HMultiDimensionalArrays mda = new HMultiDimensionalArrays();
        int[][] inputArray = {{1, 2}, {3, 4}};
        int expected = 10;  // Expected sum: 1 + 2 + 3 + 4 = 10
        Assertions.assertEquals(expected, mda.sum2DArray(inputArray));
    }
}