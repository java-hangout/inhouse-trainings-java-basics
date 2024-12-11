package com.jh.igniteprogram.java.basics.day04;

import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class IOOperationsProgram01 {

    // Run method to demonstrate InputStream and reading data
    public static String run() {
        String data = "Hello, Java!";
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());

        StringBuilder result = new StringBuilder();
        int byteRead;
        try {
            while ((byteRead = inputStream.read()) != -1) {
                result.append((char) byteRead);
            }
        } catch (Exception e) {
            return "Error reading data: " + e.getMessage();
        }

        return "Read from InputStream: " + result.toString();
    }
}