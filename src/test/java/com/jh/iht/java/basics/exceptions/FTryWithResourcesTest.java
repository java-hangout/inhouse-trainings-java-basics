package com.jh.iht.java.basics.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Problem Statement: Use try-with-resources to automatically close resources like BufferedReader after use.

Steps to Implement:
1. Try-with-Resources: Implement a method where a file is read using a BufferedReader within a try-with-resources block.
2. Test exception handling when the file does not exist (IOException).

Test Scenarios:
1. Test reading a file that exists.
2. Test reading a file that does not exist, ensuring an IOException is thrown.

Expected Output:
1. If the file exists, it should print the first line of the file.
2. If the file does not exist, it should print "IOException: ..." error message.
*/

public class FTryWithResourcesTest {
    @Test
    public void testReadFileWithFile() {
        String filePath = "D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\resources\\testfile.txt";
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        // Simulate file read error for the test
        String result = demo.readFile(filePath);
        assertTrue(result.startsWith("Read line: Test"));  // Expected to start with IOException message
    }

    @Test
    public void testReadFileWithOutFile() {
        String filePath = "";
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        // Simulate file read error for the test
        String result = demo.readFile(filePath);
        assertTrue(result.startsWith("IOException:"));  // Expected to start with IOException message
    }
}