package com.jh.iht.java.basics.exceptions;

class MultipleExceptionHandling {
    public String divide(int numerator, int denominator) {
        try {
            int result = numerator / denominator;  // Division by zero could occur
            return "Result: " + result;
        } catch (ArithmeticException e) {
            return "Error: Division by zero.";
        } catch (Exception e) {
            return "General error: " + e.getMessage();
        }
    }
}

public class CatchMultipleExceptionsExample {
    public static void main(String[] args) {
        MultipleExceptionHandling handler = new MultipleExceptionHandling();
        System.out.println(handler.divide(10, 0));  // Should catch ArithmeticException
        System.out.println(handler.divide(10, 2));  // Should not throw any exception
    }
}