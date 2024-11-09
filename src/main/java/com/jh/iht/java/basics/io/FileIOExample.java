package com.jh.iht.java.basics.io;

import java.io.*;

public class FileIOExample {
    public String readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder data = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            data.append(line).append("\n");
        }
        bufferedReader.close();
        return data.toString();
    }

    public void writeFile(String fileName, String data) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(data);
        fileWriter.close();
    }
}