package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of escape sequences in strings.
 * 
 * Input:
 * - String containing escape sequences: newline (\n), tab (\t), backslash (\\)
 * 
 * Expected Output:
 * - The string should display the escape sequences correctly.
 *   Result: "Hello\nWorld!\tTab\\Backslash"
 */
public class FEscapeSequencesTest {

    @Test
    public void testDemonstrateEscapeSequences() {
        FEscapeSequences es = new FEscapeSequences();
        String expected = "Hello\nWorld!\tTab\\Backslash";  // Expected result with escape sequences
        Assertions.assertEquals(expected, es.demonstrateEscapeSequences());
    }
}