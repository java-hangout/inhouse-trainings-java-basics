package org.jh.iht.java.basics.day03;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionsAndErrorsProgram01 {

    public static String run(int age) {
        try {
            // Throwing a custom exception if age is less than 18
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older!");
            }
            return "Valid age: " + age;
        } catch (InvalidAgeException e) {
            return e.getMessage();
        }
    }
}