package com.jh.iht.java.basics.cee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * Exception chaining allows the original exception to be preserved while throwing a new exception.
 * This example demonstrates the use of exception chaining for database connection failure.
 * Input: - SQLException (causing a DatabaseConnectionException)
 * Expected Output:
 * - "Database connection failed."
 * - "Cause: Unable to connect to the database."
 */

public class ChainingExceptionsTest {

    @Test
    public void testChainingExceptions() {
        try {
            ChainingExceptions.connectToDatabase();
        } catch (DatabaseConnectionException e) {
            Assertions.assertEquals("Database connection failed.", e.getMessage());
            Assertions.assertEquals("Unable to connect to the database.", e.getCause().getMessage());
        }
    }
}