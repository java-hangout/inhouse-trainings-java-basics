package org.jh.iht.java.basics.day04;

import java.io.*;

public class IOOperationsProgram04 {

    // Run method to demonstrate Data, Buffer, Byte I/O
    public static String run() {
        String data = "Buffered I/O in Java";
        String filename = "buffered_example.txt";

        // Write to file using BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
        } catch (IOException e) {
            return "Error writing to file: " + e.getMessage();
        }

        // Read from file using BufferedReader
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        } catch (IOException e) {
            return "Error reading from file: " + e.getMessage();
        }

        return "Read from file: " + result.toString();
    }
}