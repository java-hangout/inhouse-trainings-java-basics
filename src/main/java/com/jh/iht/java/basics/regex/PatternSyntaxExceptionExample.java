package com.jh.iht.java.basics.regex;

import java.util.regex.*;

public class PatternSyntaxExceptionExample {
    public void validatePattern(String regex) {
        try {
            // Attempt to compile the regex
            Pattern.compile(regex);
        } catch (PatternSyntaxException e) {
            System.out.println("Regex syntax error: " + e.getDescription());
            System.out.println("Pattern: " + e.getPattern());
            System.out.println("Index: " + e.getIndex());
        }
    }
}