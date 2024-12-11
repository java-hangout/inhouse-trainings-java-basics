package com.jh.igniteprogram.java.advance.day01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DesignPattern01Test {

    /*
     * Problem Statement:
     * Verify that the Singleton pattern ensures only one instance of the class.
     * The instance must return the expected output when run method is invoked.
     * Input: "TestInput"
     * Expected Output: "Singleton instance received: TestInput"
     */

    @Test
    public void testRun() {
        // Get Singleton instance
        DesignPattern01 singletonInstance = DesignPattern01.getInstance();

        // Run the method and capture the result
        String result = singletonInstance.run("TestInput");

        // Assert the expected result
        String expected = "Singleton instance received: TestInput";
        assertEquals(expected, result);
    }
}
