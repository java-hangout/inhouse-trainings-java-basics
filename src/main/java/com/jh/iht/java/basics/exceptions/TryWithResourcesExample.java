package com.jh.iht.java.basics.exceptions;

import java.io.*;

class TryWithResourcesDemo {
    public String readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            return "Read line: " + line;
        } catch (IOException e) {
            return "IOException: " + e.getMessage();
        }
    }
}

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String filePath = "D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\resources\\testfile.txt";
        TryWithResourcesDemo demo = new TryWithResourcesDemo();
        System.out.println(demo.readFile(filePath));  // Will throw IOException if the file is not found
    }
}