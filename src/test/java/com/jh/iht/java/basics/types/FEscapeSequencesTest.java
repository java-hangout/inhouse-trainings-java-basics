package com.jh.iht.java.basics.types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem: Demonstrate the use of escape sequences in strings.
 * Input:
 * - String containing escape sequences: newline (\n), tab (\t), backslash (\\)
 * Expected Output:
 * - The string should display the escape sequences correctly.
 *   Result: "Hello\nWorld!\tTab\\Backslash"
 *   Should print below output on console.
 *   Hello
 *         World!	Tab\Backslash
 */
public class FEscapeSequencesTest {

    @Test
    public void testDemonstrateEscapeSequences() {
        FEscapeSequences es = new FEscapeSequences();
        String expected = "Hello\nWorld!\tTab\\Backslash";  // Expected result with escape sequences

        System.out.println(expected); // Should print below output on console.
        /*Hello
        World!	Tab\Backslash*/
        Assertions.assertEquals(expected, es.demonstrateEscapeSequences());
    }
}