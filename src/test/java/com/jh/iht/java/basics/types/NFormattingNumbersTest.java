package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Format a double number to two decimal places.
 * 
 * Input:
 * - double number = 3.14159
 * 
 * Expected Output:
 * - The formatted number is "3.14"
 */
public class NFormattingNumbersTest {

    @Test
    public void testFormatToTwoDecimalPlaces() {
        NFormattingNumbers fn = new NFormattingNumbers();
        double number = 3.14159;
        String expected = "3.14";  // Expected formatted result: "3.14"
        Assertions.assertEquals(expected, fn.formatToTwoDecimalPlaces(number));
    }
}