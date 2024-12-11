package com.jh.igniteprogram.java.basics.day03;

public class CustomExceptionsAndErrorsProgram02 {

    public static String run(int age) throws UserInputException {
        try {
            if (age < 0) {
                // Throwing an AgeException if age is negative
                throw new AgeException("Age cannot be negative!");
            } else if (age < 18) {
                // Throwing an AgeException for underage
                throw new AgeException("Age must be 18 or older!");
            }
            return "Valid age: " + age;
        } catch (AgeException e) {
            // Chaining the exception to a UserInputException with a custom message
            throw new UserInputException("Invalid user input", e);
        }
    }
}