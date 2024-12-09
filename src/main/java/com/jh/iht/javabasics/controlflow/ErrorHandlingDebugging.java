package com.jh.iht.javabasics.controlflow;

public class ErrorHandlingDebugging {

    // Division method that throws an exception if division by zero occurs
    public static int divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Try-Catch Block: Catching division by zero error
    public static String safeDivide(int a, int b) {
        try {
            int result = divideNumbers(a, b);
            return "Result: " + result;
        } catch (ArithmeticException e) {
            return "Error: " + e.getMessage();
        }
    }


}
