package org.jh.iht.java.basics.day02;

public class StringProgram02 {

    public static String run(String input) {
        // Creating an immutable string
        String str1 = "Hello";
        String str2 = str1.concat(", " + input + "!");
        
        // str1 remains unchanged as strings are immutable
        return str1 + " " + str2;
    }
}