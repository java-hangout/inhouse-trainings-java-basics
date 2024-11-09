package com.jh.iht.java.basics.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Problem Statement:
 * The InputStream class is used to read bytes from a source.
 * This test checks if the InputStream can correctly read data from a file.
 * Input: - File with content: "Hello, world!"
 * Expected Output: - "Hello, world!"
 */
public class AInputStreamExampleTest {

    @Test
    public void testReadDataFromFile() throws Exception {
        InputStreamExample inputStreamExample = new InputStreamExample();
        String data = inputStreamExample.readDataFromFile("D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\resources\\test.txt");
        Assertions.assertEquals("Hello, world!", data);
    }
}