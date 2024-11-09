package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the order of operations in arithmetic expressions.
 * 
 * Input:
 * - Expression: 5 + 3 * 2
 * 
 * Expected Output:
 * - (5 + 3 * 2) = 5 + (3 * 2) = 5 + 6 = 11
 */
public class KOrderOfOperationsTest {

    @Test
    public void testCalculateOrderOfOperations() {
        KOrderOfOperations oo = new KOrderOfOperations();
        int expected = 11;  // Expected result: 5 + (3 * 2) = 5 + 6 = 11
        Assertions.assertEquals(expected, oo.calculateOrderOfOperations());
    }
}