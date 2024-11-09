package com.jh.iht.java.basics.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * This test checks if FileReader and FileWriter can correctly read and write character data to a file.
 * 
 * Input:
 * - File name: test-file.txt
 * - Data: "Java File I/O"
 * 
 * Expected Output:
 * - File content: "Java File I/O"
 */
public class CFileIOExampleTest {

    @Test
    public void testFileIO() throws Exception {
        FileIOExample fileIOExample = new FileIOExample();
        String fileName = "test-file.txt";
        String data = "Java File I/O";

        // Write data to file
        fileIOExample.writeFile(fileName, data);

        // Read back the file content and verify
        String fileContent = fileIOExample.readFile(fileName);
        Assertions.assertEquals("Java File I/O", fileContent.trim());
    }
}