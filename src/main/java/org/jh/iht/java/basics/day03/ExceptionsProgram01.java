package org.jh.iht.java.basics.day03;

public class ExceptionsProgram01 {

    public static String run(int a, int b) {
        String result = "";
        try {
            // Attempting division, which may throw an exception
            result = "Result: " + (a / b);
        } catch (ArithmeticException e) {
            result = "Error: Division by zero!";
        } finally {
            // This block always executes regardless of exception
            result += " - Finally block executed.";
        }
        return result;
    }
}