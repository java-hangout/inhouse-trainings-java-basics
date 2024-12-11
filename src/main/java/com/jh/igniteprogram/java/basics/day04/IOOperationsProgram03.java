package com.jh.igniteprogram.java.basics.day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOOperationsProgram03 {

    // Run method to demonstrate File I/O
    public static String run() {
        String filename = "example.txt";
        String data = "File I/O in Java";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(data);
        } catch (IOException e) {
            return "Error writing to file: " + e.getMessage();
        }

        // Read from file
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