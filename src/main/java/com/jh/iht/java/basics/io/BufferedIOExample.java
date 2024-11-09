package com.jh.iht.java.basics.io;

import java.io.*;

public class BufferedIOExample {
    public void writeDataWithBuffer(String fileName, String data) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName));
        bufferedOutputStream.write(data.getBytes());
        bufferedOutputStream.close();
    }

    public String readDataWithBuffer(String fileName) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName));
        StringBuilder data = new StringBuilder();
        int byteData;
        while ((byteData = bufferedInputStream.read()) != -1) {
            data.append((char) byteData);
        }
        bufferedInputStream.close();
        return data.toString();
    }
}