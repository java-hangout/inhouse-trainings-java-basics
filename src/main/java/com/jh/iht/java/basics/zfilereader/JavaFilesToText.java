package com.jh.iht.java.basics.zfilereader;

import java.io.*;

public class JavaFilesToText {

    public static void main(String[] args) {
        String folderName = "regex";
        // Folder containing .java files
        String folderPath = "D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\java\\com\\jh\\iht\\java\\basics\\"+folderName;  // Change this to the folder path containing .java files
        
        // Output file where the content of all .java files will be written
        String outputFile = "D:\\workspace\\inhouse-trainings-java-basics\\src\\main\\resources\\output\\"+folderName+"_output.txt";  // Change this to your desired output file
        
        try {
            writeJavaFilesToSingleFile(folderPath, outputFile);
            System.out.println("Java files have been successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void writeJavaFilesToSingleFile(String folderPath, String outputFile) throws IOException {
        // Create a BufferedWriter to write to the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        // Get all .java files in the directory (excluding subdirectories)
        File folder = new File(folderPath);
        File[] javaFiles = folder.listFiles((dir, name) -> name.endsWith(".java"));

        if (javaFiles == null || javaFiles.length == 0) {
            System.out.println("No .java files found in the specified folder.");
            return;
        }

        // Loop through each .java file and write its contents into the output file
        for (File javaFile : javaFiles) {
            BufferedReader reader = null;
            try {
                // Create a BufferedReader to read the content of the current .java file
                reader = new BufferedReader(new FileReader(javaFile));
                String line;

                // Write the file name as a header (optional)
                writer.write("### Contents of " + javaFile.getName() + " ###");
                writer.newLine();
                
                // Write the content of the current .java file into the output file
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                
                writer.newLine(); // Adds an extra newline between files
            } catch (IOException e) {
                System.out.println("Error reading file: " + javaFile.getName());
                throw e; // Rethrow the exception to stop further execution
            } finally {
                // Close the BufferedReader after processing the current file
                if (reader != null) {
                    reader.close();
                }
            }
        }

        // Close the BufferedWriter to finalize writing to the output file
        writer.close();
    }
}
