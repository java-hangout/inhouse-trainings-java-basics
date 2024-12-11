package com.jh.igniteprogram.java.basics.day03;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CustomExceptionsAndErrorsProgram02Test {

    /*
     * Problem Statement:
     * Verify that the program correctly chains exceptions when an invalid age is provided.
     * The program should throw a UserInputException with the original AgeException as the cause.
     *
     * Input:
     * age = 15
     * 
     * Expected Output:
     * Exception should be thrown with message "Invalid user input" and the cause should be "Age must be 18 or older!"
     */
    
    @Test
    public void testRun() {
        try {
            // Run the method with input values
            CustomExceptionsAndErrorsProgram02.run(15);
        } catch (UserInputException e) {
            // Assert that the exception message is correct and the cause is an AgeException
            assertTrue(e.getMessage().contains("Invalid user input"));
            assertTrue(e.getCause() instanceof AgeException);
            assertTrue(e.getCause().getMessage().contains("Age must be 18 or older!"));
        }
    }
}