package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Problem Statement:
Demonstrate **throwing exceptions** in Java. The task is to throw a custom exception `InvalidAgeException` when an invalid age is provided.

Steps to Implement:
1. **Custom Exception**: Implement a custom exception `InvalidAgeException` to be thrown when an invalid age is encountered.
2. **SetAge Method**: Implement a method `setAge()` in the `User` class that throws `InvalidAgeException` if the age is negative.

Test Scenarios:
1. Test setting a valid age.
2. Test setting an invalid age, ensuring that `InvalidAgeException` is thrown.

Expected Output:
1. For valid age, the age should be set.
2. For invalid age, an exception should be thrown with the message: "Age cannot be negative."
*/

public class GThrowingExceptionsTest {

    @Test
    public void testSetValidAge() throws InvalidAgeException1 {
        User user = new User();
        user.setAge(25);  // Expected: No exception, age is set
        assertEquals(25, user.getAge());  // Verify that age is set correctly
    }

    @Test
    public void testSetInvalidAge() {
        User user = new User();
        try {
            user.setAge(-1);  // Expected: InvalidAgeException is thrown
            fail("Expected InvalidAgeException to be thrown");
        } catch (InvalidAgeException1 e) {
            assertEquals("Age cannot be negative", e.getMessage());
        }
    }
}