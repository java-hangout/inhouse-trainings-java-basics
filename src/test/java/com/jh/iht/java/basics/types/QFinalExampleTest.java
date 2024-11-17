package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of the final keyword for constants. Create a class with a constant as final int CONSTANT_VALUE = 50
 * and a method which will return that constant value.
 * Expected Output: - The constant value should be 50
 */
public class QFinalExampleTest {

    @Test
    public void testFinalValue() {
        QFinalExample finalExample = new QFinalExample();
        int expected = 50;  // Expected constant value: 50
        Assertions.assertEquals(expected, finalExample.getFinalValue());
    }
}