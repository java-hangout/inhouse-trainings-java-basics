package com.jh.iht.java.basics.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement: Demonstrate the difference between String and StringBuffer.
Input:
    - String "Hello".
    - Modify both the String and StringBuffer by appending " World".
Expected Output:
    - The String will result in a new string, "Hello World".
    - The StringBuffer will result in "Hello World" directly (modified in place).
*/

public class FStringVsStringBufferTest {

    @Test
    void testStringVsStringBuffer() {
        StringVsStringBuffer example = new StringVsStringBuffer();
        
        // Call method to compare String and StringBuffer
        String result = example.demonstrateStringVsStringBuffer();
        
        // Validate the results
        String[] values = result.split(";");
        assertEquals("Hello World", values[0]);  // String (creates new object)
        assertEquals("Hello World", values[1]);  // StringBuffer (modifies in place)
    }
}
