package org.jh.iht.java.basics.day04;

import org.jh.iht.java.basics.day04.RegexProgram02;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RegexProgram02Test {

    /*
     * Problem Statement:
     * Verify that the method handles invalid regular expressions correctly and catches PatternSyntaxException.
     *
     * Input:
     * "Sample Text"
     * 
     * Expected Output:
     * "Pattern Syntax Error: Unclosed character class"
     */
    
    @Test
    public void testRun() {
        // Run the method with input string that causes a pattern syntax error
        String input = "Sample Text";
        String result = RegexProgram02.run(input);
        
        // Expected output due to invalid regex
        String expected = "Pattern Syntax Error: Unclosed character class";
        
        // Assert the expected result
        assertEquals(expected, result);
    }
}