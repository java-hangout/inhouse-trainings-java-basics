package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Cast two double values to integers and return their sum.
 * Input:
 * - double a = 5.7
 * - double b = 3.4
 * Expected Output:
 * - The sum of the casted integers (5 + 3) = 8
 */
public class LCastingTest {

    @Test
    public void testCastAndAdd() {
        LCasting casting = new LCasting();
        double a = 5.7, b = 3.4;
        int expected = 8;  // Expected result: (5 + 3) = 8 after casting
        Assertions.assertEquals(expected, casting.castAndAdd(a, b));
    }
}