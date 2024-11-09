package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the usage of StringBuffer and StringBuilder.
Input:
    - String "Hello".
    - Append " World" and insert " Java" at index 5.
Expected Output:
    - The result should be "Hello Java World".
*/

public class EStringBufferBuilderTest {

    @Test
    void testStringBuffer() {
        StringBufferBuilderExample example = new StringBufferBuilderExample();
        
        // Call method for StringBuffer
        String result = example.useStringBuffer();
        
        // Validate the result
        assertEquals("Hello Java World", result);  // StringBuffer should result in "Hello Java World"
    }

    @Test
    void testStringBuilder() {
        StringBufferBuilderExample example = new StringBufferBuilderExample();
        
        // Call method for StringBuilder
        String result = example.useStringBuilder();
        
        // Validate the result
        assertEquals("Hello Java World", result);  // StringBuilder should result in "Hello Java World"
    }
}
