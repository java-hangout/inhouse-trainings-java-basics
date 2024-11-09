package com.jh.iht.java.basics.cee;

import java.sql.SQLException;

/**
 * @author Veeresh N
 * @version 1.0
 */
class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }

    // Constructor to chain exceptions
    public DatabaseConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * @author Veeresh N
 * @version 1.0
 */

public class ChainingExceptions {
    public static void connectToDatabase() throws DatabaseConnectionException {
        try {
            // Simulate a database connection failure (e.g., SQLException)
            throw new SQLException("Unable to connect to the database.");
        } catch (SQLException e) {
            // Wrapping the SQLException in a custom exception
            throw new DatabaseConnectionException("Database connection failed.", e);
        }
    }

    public static void main(String[] args) {
        try {
            connectToDatabase();
        } catch (DatabaseConnectionException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }
}