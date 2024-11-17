package com.jh.iht.java.basics.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Problem Statement:
 * The OutputStream class is used to write bytes to a destination. 
 * Check if the OutputStream can correctly write data to a file.
 * Input:
 * - File: test-output.txt
 * - Data: "Test data"
 * Expected Output:
 * - File content: "Test data"
 */
public class BOutputStreamExampleTest {

    @Test
    public void testWriteDataToFile() throws Exception {
        OutputStreamExample outputStreamExample = new OutputStreamExample();
        String fileName = "D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\resources\\test-output.txt";
        String data = "Test data";
        
        // Write data to file
        outputStreamExample.writeDataToFile(fileName, data);

        // Read back the file content and verify
        String fileContent = new String(Files.readAllBytes(Paths.get(fileName)));
        Assertions.assertEquals("Test data", fileContent);
    }
}