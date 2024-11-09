package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Return the constant value defined in the class.
 * 
 * Input:
 * - CONSTANT_VALUE = 100
 * 
 * Expected Output:
 * - Return 100
 */
public class IConstantsTest {

    @Test
    public void testConstantValue() {
        IConstants constant = new IConstants();
        int expected = 100;  // Expected constant value
        Assertions.assertEquals(expected, constant.getConstantValue());
    }
}