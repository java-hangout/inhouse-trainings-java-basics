package org.jh.iht.java.basics.day01;

public class TypeTopicProgram01 {
    public static String run(int intVar1, int intVar2) {
        // Calculate sum of integers and double multiplication
        int sum = intVar1 + intVar2;

        // Append a greeting to the input string
        String result = "The sum of " + intVar1 + " and " + intVar2 + " is " + sum;
        System.out.println("result: " + result);
        // Return the formatted output as a string
        return result;
    }
}