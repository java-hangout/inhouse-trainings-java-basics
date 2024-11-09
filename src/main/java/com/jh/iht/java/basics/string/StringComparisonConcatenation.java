package com.jh.iht.java.basics.string;

public class StringComparisonConcatenation {

    // Method to compare strings using == and equals()
    public String compareStrings(String str1, String str2, String str3) {
        boolean comparison1 = (str1 == str2);  // Reference comparison
        boolean comparison2 = str1.equals(str3);  // Value comparison
        boolean comparison3 = (str1 == str3);  // Reference comparison

        return comparison1 + ";" + comparison2 + ";" + comparison3;  // return the comparison results
    }

    // Method to concatenate strings using + and concat()
    public String concatenateStrings(String str1, String additionalText) {
        String concatenatedWithPlus = str1 + additionalText;
        String concatenatedWithConcat = str1.concat(additionalText);
        return concatenatedWithPlus + ";" + concatenatedWithConcat;  // return concatenated results
    }
}
