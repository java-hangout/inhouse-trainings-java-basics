package com.jh.iht.java.basics.co;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Implementing procedural programming by summing an array of numbers.
 * Input:- Array of numbers {1, 2, 3, 4, 5}
 * Expected Output: - Sum = 15
 */
public class BProceduralProgrammingTest {

    @Test
    public void testSumArray() {
        BProceduralProgramming pp = new BProceduralProgramming();
        int[] numbers = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        Assertions.assertEquals(expectedSum, pp.sumArray(numbers));
    }
}