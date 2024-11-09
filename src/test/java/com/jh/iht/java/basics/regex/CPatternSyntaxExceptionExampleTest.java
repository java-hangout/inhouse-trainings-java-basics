package com.jh.iht.java.basics.regex;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Problem Statement:
 * Test that a `PatternSyntaxException` is thrown when an invalid regular expression is passed to `Pattern.compile()`.
 * The test will focus on the invalid regex `[a-z`, which is an incomplete character class.
 * Expected Behavior:
 * The invalid regex should throw a `PatternSyntaxException` and we need to check the exception message to ensure it indicates an unclosed character class.
 * Steps to Implement:
 * 1. Compile the invalid regex.
 * 2. Catch the `PatternSyntaxException`.
 * 3. Verify the exception is correctly thrown.
 * Test Scenario:
 * Test with the invalid regex `[a-z` to ensure that a `PatternSyntaxException` is thrown.
 */

public class CPatternSyntaxExceptionExampleTest {

    @Test
    public void testPatternSyntaxException() {
        String invalidRegex = "[a-z";  // This is an invalid regex

        // Check that a PatternSyntaxException is thrown
        PatternSyntaxException exception = assertThrows(PatternSyntaxException.class, () -> {
            Pattern.compile(invalidRegex);
        });

        // Verify the message indicates that the character class is unclosed
        assertTrue(exception.getMessage().contains("Unclosed character class"));
    }
}
