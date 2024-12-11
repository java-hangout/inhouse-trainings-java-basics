package com.jh.igniteprogram.java.basics.day02;

public class StringProgram03 {

    public static String run(String str1, String str2) {
        // String comparison using equals() and concatenation using "+"
        boolean isEqual = str1.equals(str2);
        String concatenated = str1 + " " + str2;

        return "Equality: " + isEqual + ", Concatenation: " + concatenated;
    }
}