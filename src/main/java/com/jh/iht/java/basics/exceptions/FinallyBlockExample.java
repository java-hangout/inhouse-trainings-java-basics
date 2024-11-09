package com.jh.iht.java.basics.exceptions;

class FinallyBlockDemo {
    public String demonstrateFinallyBlock() {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
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
        System.out.println(demo.demonstrateFinallyBlock());
    }
}