package com.jh.igniteprogram.java.basics.day02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfacesProgram02Test {

    /*
     * Problem Statement:
     * Verify that the program correctly sends an email message.
     * The method should return a confirmation message indicating that the email has been sent.
     *
     * Input:
     * email = "test@example.com", message = "Hello!"
     *
     * Expected Output:
     * "Email sent to test@example.com with message: Hello!"
     */

    @Test
    public void testRun() {
        // Run the method with input values
        String result = InterfacesProgram02.run("test@example.com", "Hello!");

        // Assert the expected result
        String expected = "Email sent to test@example.com with message: Hello!";
        assertEquals(expected, result);
    }
}