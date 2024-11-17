package com.jh.iht.java.basics.exceptions;

class FinallyBlockDemo {
    public String demonstrateFinallyBlock(int a, int b) {
        try {
            int result = a / b;  // This will throw ArithmeticException
            return "Result: " + result;
        } catch (ArithmeticException e) {
            return "Caught ArithmeticException: " + e.getMessage();
        } finally {
            return "Finally block always runs";  // Finally block always runs
        }
    }
}

public class FinallyBlockExample {
    public static void main(String[] args) {
        FinallyBlockDemo demo = new FinallyBlockDemo();
        System.out.println(demo.demonstrateFinallyBlock(10,10));
    }
}