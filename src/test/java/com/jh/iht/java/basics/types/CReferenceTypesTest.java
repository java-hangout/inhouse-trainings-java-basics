package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Implement a method to concatenate two Strings and return the result.
 * Input: String a = "Hello, ", String b = "World!"
 * Expected Output: The sum of the variables is 7 + 3 = 10.
 */
public class CReferenceTypesTest {

    @Test
    public void testConcatenateStrings() {
        CReferenceTypes rt = new CReferenceTypes();
        String a = "Hello, ";
        String b = "World!";
        String expected = "Hello, World!";  // Expected result: "Hello, World!"
        Assertions.assertEquals(expected, rt.concatenateStrings(a, b));
    }
}