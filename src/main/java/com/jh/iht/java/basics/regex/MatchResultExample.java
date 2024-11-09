package com.jh.iht.java.basics.regex;

import java.util.regex.*;

public class MatchResultExample {
    public void printMatchDetails(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            MatchResult result = matcher.toMatchResult();
            System.out.println("Matched: " + result.group());
            System.out.println("Start index: " + result.start());
            System.out.println("End index: " + result.end());
        }
    }
}