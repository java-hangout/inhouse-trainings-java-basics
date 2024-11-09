package com.jh.iht.java.basics.io;

import java.io.*;

public class FileWriterReaderExample {
    public void writeFile(String fileName, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(data);
        fileWriter.close();
    }

    public String readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        StringBuilder data = new StringBuilder();
        int charData;
        while ((charData = fileReader.read()) != -1) {
            data.append((char) charData);
        }
        fileReader.close();
        return data.toString();
    }
}