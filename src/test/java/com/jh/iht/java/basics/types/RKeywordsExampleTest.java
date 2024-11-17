package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of Java keywords such as 'public', 'private', 'static', and 'final'.
 * Create a class with public static final (MAX_VALUE = 100 (final static variable)) and private variables, setter and getter methods for private variable.
 * Input: value = 30 (instance variable)
 * Expected Output:
 * - After setting the value, it should be 25.
 * - MAX_VALUE is static and final, so it should always return 100.
 */
public class RKeywordsExampleTest {

    @Test
    public void testKeywords() {
        RKeywordsExample example = new RKeywordsExample(25);
        example.setValue(30);
        int expectedValue = 30;
        Assertions.assertEquals(expectedValue, example.getValue());

        int expectedMaxValue = 100;
        Assertions.assertEquals(expectedMaxValue, RKeywordsExample.getMaxValue());
    }
}