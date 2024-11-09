package com.jh.iht.java.basics.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * This test verifies the functionality of FileWriter and FileReader in Java.
 * It checks if data can be written to and read from a file using these classes.
 * <p>
 * Input:
 * - File name: filewriterreader.txt
 * - Data: "FileWriter and FileReader"
 * <p>
 * Expected
 * <p>
 * Output:
 * - File content: "FileWriter and FileReader"
 */
public class FFileWriterReaderExampleTest {

    @Test
    public void testFileWriterReader() throws Exception {
        FileWriterReaderExample fileWriterReaderExample = new FileWriterReaderExample();
        String fileName = "filewriterreader.txt";
        String data = "FileWriter and FileReader";

        // Write data to file
        fileWriterReaderExample.writeFile(fileName, data);

        // Read back the file content and verify
        String fileContent = fileWriterReaderExample.readFile(fileName);
        Assertions.assertEquals("FileWriter and FileReader", fileContent);
    }
}