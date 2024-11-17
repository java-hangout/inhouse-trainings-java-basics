package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Sum elements in an array using the for-each loop.
 * Input:
 * - int[] numbers = {1, 2, 3, 4}
 * Expected Output:
 * - 10 (1 + 2 + 3 + 4 = 10)
 */
public class LForEachLoopTest {

    @Test
    public void testSumUsingForEachLoop() {
        LForEachLoop fel = new LForEachLoop();
        int[] numbers = {1, 2, 3, 4};
        int expected = 10;  // Expected result: 10
        Assertions.assertEquals(expected, fel.sumUsingForEachLoop(numbers));
    }
}