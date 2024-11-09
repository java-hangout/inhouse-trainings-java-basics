package com.jh.iht.java.basics.regex;

import java.util.regex.*;

public class CPatternSyntaxExceptionExample {
    public static void main(String[] args) {
        try {
            // This regex is invalid because the character class [a-z is not closed
            String regex = "[a-z"; // Invalid regex pattern
            Pattern pattern = Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            System.out.println("PatternSyntaxException caught: " + e.getMessage());
        }
    }
}
