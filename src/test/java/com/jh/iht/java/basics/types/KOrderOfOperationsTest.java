package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the order of operations in arithmetic expressions.
 * Input: - integers a, b, c
 * Expected Output: - (5 + 3 * 2) = 5 + (3 * 2) = 5 + 6 = 11
 */
public class KOrderOfOperationsTest {

    @Test
    public void testCalculateOrderOfOperations() {
        KOrderOfOperations oo = new KOrderOfOperations();
        int a = 5;
        int b = 3;
        int c = 2;
        int expected = 11;  // Expected result: 5 + (3 * 2) = 5 + 6 = 11
        Assertions.assertEquals(expected, oo.calculateOrderOfOperations(a,b,c));
    }
}