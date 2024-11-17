package com.jh.iht.java.basics.zfilereader;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class JavaFileFetcher {

    public static void main(String[] args) {
        // Directory to start searching (change this to your target directory)
        Path startDir = Paths.get("D:\\workspace\\inhouse-trainings-java-basics\\src\\test\\java\\com\\jh\\iht\\java\\basics");

        // Fetch all Java files from the directory and its subfolders
        try {
            Files.walkFileTree(startDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    // Check if the file has a .java extension
                    if (file.toString().endsWith(".java")) {
                        System.out.println(file);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    // Handle any failure while accessing a file (e.g., permissions)
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
