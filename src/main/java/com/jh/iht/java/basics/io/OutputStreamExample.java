package com.jh.iht.java.basics.io;

import java.io.*;

public class OutputStreamExample {
    public void writeDataToFile(String fileName, String data) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(data.getBytes());
        outputStream.close();
    }
}