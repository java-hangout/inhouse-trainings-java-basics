package com.jh.iht.java.basics.exceptions;

// Base class Exception
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

// Derived class for specific type of exception
class SpecificException extends BaseException {
    public SpecificException(String message) {
        super(message);
    }
}

// Class demonstrating exception hierarchy
class Demo {
    public String performAction(int value) throws SpecificException {
        if (value < 0) {
            throw new SpecificException("Negative value is not allowed.");
        } else {
            String result = "Action performed with value: " + value;
            System.out.println(result);
            return result;
        }
    }
}

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        Demo demo = new Demo();

        try {
            demo.performAction(10);  // Expected output: Action performed with value: 10
            demo.performAction(-5);  // Should throw SpecificException
        } catch (SpecificException e) {
            System.out.println(e.getMessage());  // Expected output: Negative value is not allowed.
        }
    }
}