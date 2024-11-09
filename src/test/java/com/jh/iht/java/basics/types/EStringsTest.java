package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Concatenate two strings and return uppercase of concatenated string.
 * Input: String a = "Hello" , String b = "World"
 * Expected Output: The concatenated string "HelloWorld"
 */
public class EStringsTest {

    @Test
    public void testConcatenate() {
        EStrings str = new EStrings();
        String a = "Hello";
        String b = "World";
        String expected = "HELLOWORLD";  // Expected result: "HelloWorld"
        Assertions.assertEquals(expected, str.concatenate(a, b));
    }
}