package com.jh.igniteprogram.java.basics.day03;

// Custom exception class for user input issues
public class UserInputException extends Exception {
    public UserInputException(String message, Throwable cause) {
        super(message, cause);
    }
}
