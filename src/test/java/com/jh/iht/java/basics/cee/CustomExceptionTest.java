package com.jh.iht.java.basics.cee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * Define a custom exceptions allow to define specific error conditions tailored to the application.
 * Testing a custom exception to validate age restrictions.
 * Input:
 * - Age value (e.g., 15)
 * Expected Output:
 * - "Age must be 18 or older."
 */
public class CustomExceptionTest {

    @Test
    public void testCustomException() {
        try {
            CustomException.validateAge(15);  // Age less than 18, should throw exception
        } catch (InvalidAgeException e) {
            Assertions.assertEquals("Age must be 18 or older.", e.getMessage());
        }
    }
}