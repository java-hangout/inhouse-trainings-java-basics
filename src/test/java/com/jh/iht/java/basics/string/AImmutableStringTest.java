package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate that Strings in Java are immutable. When a string is modified, 
a new string object is created, and the original string remains unchanged.

Input:
    - String str1 initialized with "Hello".
    - Modify str1 by concatenating " World".

Expected Output:
    - str1 should contain "Hello World".
    - str2 should still contain "Hello".
*/

public class AImmutableStringTest {

    @Test
    void testImmutableString() {
        ImmutableStringExample example = new ImmutableStringExample();
        
        // Call the method to demonstrate immutability
        String result = example.demonstrateImmutableString();
        
        // Validate the result
        String[] values = result.split(";");
        String str1 = values[0];  // Expected "Hello World"
        String str2 = values[1];  // Expected "Hello"
        
        assertEquals("Hello World", str1);
        assertEquals("Hello", str2); // str2 should remain "Hello"
    }
}
