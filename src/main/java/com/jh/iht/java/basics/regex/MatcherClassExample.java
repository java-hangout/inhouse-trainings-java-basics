package com.jh.iht.java.basics.regex;

import java.util.regex.*;

public class MatcherClassExample {
    public boolean containsPattern(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find(); // Checks if the pattern is found in the text
    }
}