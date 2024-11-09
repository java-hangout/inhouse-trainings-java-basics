package com.jh.iht.java.basics.exceptions;

/**
Problem Statement:
Demonstrate **Types of Exception** in Java by creating a custom exception `InvalidAgeException` and throwing it when an invalid age is provided.

Steps to Implement:
1. **Create a custom exception** `InvalidAgeException` that extends the `Exception` class.
2. **Person class**: The constructor of `Person` class throws the `InvalidAgeException` if the age is negative.
3. **Test the exception handling** for valid and invalid input.

Test Scenarios:
1. Test valid age creation.
2. Test invalid age creation, ensuring that `InvalidAgeException` is thrown.

Expected Output:
1. For valid age, the age should be returned.
2. For invalid age (negative), the exception should be thrown with the message "Age cannot be negative."
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AExceptionTypesTest {

    @Test
    public void testValidAge() throws InvalidAgeException {
        Person person = new Person("John", 30);
        Assertions.assertEquals(30, person.getAge());  // Expected: 30
    }

    @Test
    public void testInvalidAge() {
        try {
            Person person = new Person("Alice", -5);
            Assertions.fail("Expected InvalidAgeException to be thrown");
        } catch (InvalidAgeException e) {
            Assertions.assertEquals("Age cannot be negative.", e.getMessage());
        }
    }
}