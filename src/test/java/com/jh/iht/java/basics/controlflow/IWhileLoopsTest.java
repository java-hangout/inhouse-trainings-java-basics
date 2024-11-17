package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Sum numbers from 1 to n using a while loop.
 * Input:
 * - int n = 4
 * Expected Output:
 * - 10 (1 + 2 + 3 + 4 = 10)
 */
public class IWhileLoopsTest {

    @Test
    public void testSumUsingWhileLoop() {
        IWhileLoops wl = new IWhileLoops();
        int n = 4;
        int expected = 10;  // Expected result: 10
        Assertions.assertEquals(expected, wl.sumUsingWhileLoop(n));
    }
}