package org.jh.iht.java.basics.day04;

import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class IOOperationsProgram02 {

    // Run method to demonstrate OutputStream and writing data
    public static String run() {
        String data = "Java I/O";
        OutputStream outputStream = new ByteArrayOutputStream();

        try {
            outputStream.write(data.getBytes());
        } catch (Exception e) {
            return "Error writing data: " + e.getMessage();
        }

        return "Written to OutputStream: " + data;
    }
}