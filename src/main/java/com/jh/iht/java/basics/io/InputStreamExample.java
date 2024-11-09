package com.jh.iht.java.basics.io;

import java.io.*;

public class InputStreamExample {
    public String readDataFromFile(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName);
        StringBuilder data = new StringBuilder();
        int byteData;
        while ((byteData = inputStream.read()) != -1) {
            data.append((char) byteData);
        }
        inputStream.close();
        return data.toString();
    }
}