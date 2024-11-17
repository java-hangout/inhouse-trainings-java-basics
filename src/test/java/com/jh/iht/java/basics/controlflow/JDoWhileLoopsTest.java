package com.jh.iht.java.basics.controlflow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Sum numbers from 1 to n using a do-while loop.
 * 
 * Input:
 * - int n = 3
 * 
 * Expected Output:
 * - 6 (1 + 2 + 3 = 6)
 */
public class JDoWhileLoopsTest {

    @Test
    public void testSumUsingDoWhileLoop() {
        JDoWhileLoops dwl = new JDoWhileLoops();
        int n = 3;
        int expected = 6;  // Expected result: 6
        Assertions.assertEquals(expected, dwl.sumUsingDoWhileLoop(n));
    }
}