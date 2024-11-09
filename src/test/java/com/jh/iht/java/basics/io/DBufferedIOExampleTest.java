package com.jh.iht.java.basics.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * This test checks if BufferedInputStream and BufferedOutputStream can efficiently read and write byte data to a file.
 * 
 * Input:
 * - File name: buffered-file.txt
 * - Data: "Buffered I/O"
 * 
 * Expected Output:
 * - File content: "Buffered I/O"
 */
public class DBufferedIOExampleTest {

    @Test
    public void testBufferedIO() throws Exception {
        BufferedIOExample bufferedIOExample = new BufferedIOExample();
        String fileName = "buffered-file.txt";
        String data = "Buffered I/O";

        // Write data to file using buffered output
        bufferedIOExample.writeDataWithBuffer(fileName, data);

        // Read back the file content using buffered input
        String fileContent = bufferedIOExample.readDataWithBuffer(fileName);
        Assertions.assertEquals("Buffered I/O", fileContent);
    }
}