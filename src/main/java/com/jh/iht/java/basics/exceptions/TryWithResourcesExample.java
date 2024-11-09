package com.jh.iht.java.basics.exceptions;

import java.io.*;

class TryWithResourcesDemo {
    public String readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("testfile.txt"))) {
            String line = reader.readLine();
            return "Read line: " + line;
        } catch (IOException e) {
            return "IOException: " + e.getMessage();
        }
    }
}

public class TryWithResourcesExample {
    public static void main(String[] args) {
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        System.out.println(demo.readFile());  // Will throw IOException if the file is not found
    }
}