package com.jh.iht.javabasics.controlflow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Loops and Break/Continue statements.
 */
public class LoopsBreakContinueTest {

    /**
     * Test Case: Test sumForLoop method.
     * Problem: Sum the first N numbers using a for loop.
     * Input: n = 5
     * Expected Output: 15
     */
    @Test
    public void testSumForLoop() {
        int result = LoopsBreakContinue.sumForLoop(5);
        assertEquals(15, result);
    }

    /**
     * Test Case: Test sumWhileLoop method.
     * Problem: Sum the first N numbers using a while loop.
     * Input: n = 3
     * Expected Output: 6
     */
    @Test
    public void testSumWhileLoop() {
        int result = LoopsBreakContinue.sumWhileLoop(3);
        assertEquals(6, result);
    }

    /**
     * Test Case: Test breakAndContinueExample method.
     * Problem: Skip number 2 using continue in a loop.
     * Input: n = 5
     * Expected Output: "1 3 4 5"
     */
    @Test
    public void testBreakAndContinueExample() {
        String result = LoopsBreakContinue.breakAndContinueExample(5);
        assertEquals("1 3 4 5", result);
    }
}
