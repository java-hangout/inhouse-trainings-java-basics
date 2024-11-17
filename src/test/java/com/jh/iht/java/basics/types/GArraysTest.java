package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Double the values of each element in an array and return the modified array.
 * Input: - int[] array = {1, 2, 3}
 * Expected Output:- The modified array should be {2, 4, 6}.
 */
public class GArraysTest {

    @Test
    public void testDoubleArrayValues() {
        GArrays arr = new GArrays();
        int[] inputArray = {1, 2, 3};
        int[] expectedArray = {2, 4, 6};  // Expected result: {2, 4, 6}
        Assertions.assertArrayEquals(expectedArray, arr.doubleArrayValues(inputArray));
    }
}