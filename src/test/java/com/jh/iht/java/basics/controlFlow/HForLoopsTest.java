package com.jh.iht.java.basics.controlFlow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Sum numbers from 1 to n using a for loop.
 * <p>
 * Input:
 * - int n = 5
 * <p>
 * Expected Output:
 * - 15 (1 + 2 + 3 + 4 + 5 = 15)
 */
public class HForLoopsTest {

    @Test
    public void testSumUsingForLoop() {
        HForLoops fl = new HForLoops();
        int n = 5;
        int expected = 15;  // Expected result: 15
        Assertions.assertEquals(expected, fl.sumUsingForLoop(n));
    }
}