package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of Java keywords such as 'public', 'private', 'static', and 'final'.
 * 
 * Input:
 * - MAX_VALUE = 100 (final static variable)
 * - value = 25 (instance variable)
 * 
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