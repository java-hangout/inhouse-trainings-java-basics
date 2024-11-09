package com.jh.iht.java.basics.exceptions;

class ReThrowingDemo {
    public String process() throws Exception {
        try {
            throw new Exception("Initial exception");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw

                    e;  // Re-throwing the caught exception
        }
    }
}

public class ReThrowingExceptionsExample {
    public static void main(String[] args) {
        ReThrowingDemo demo = new ReThrowingDemo();

        try {
            demo.process();  // Will re-throw the exception after catching it
        } catch (Exception e) {
            System.out.println("Final caught exception: " + e.getMessage());
        }
    }
}