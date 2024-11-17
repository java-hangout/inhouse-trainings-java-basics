package com.jh.iht.java.basics.zfilereader;

import java.io.*;

public class WriteFilesIntoOne {

    public static void main(String[] args) {
        // Specify the input files (multiple files)
        String[] inputFiles = {"file1.txt", "file2.txt", "file3.txt"};
        // Specify the output file
        String outputFile = "output.txt";

        // Call the method to write the content of all input files to one output file
        try {
            writeFilesToSingleFile(inputFiles, outputFile);
            System.out.println("Content has been successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing files: " + e.getMessage());
        }
    }

    public static void writeFilesToSingleFile(String[] inputFiles, String outputFile) throws IOException {
        // Create a BufferedWriter to write into the output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        // Loop through each input file and read its contents
        for (String inputFile : inputFiles) {
            BufferedReader reader = null;
            try {
                // Create a BufferedReader to read the current input file
                reader = new BufferedReader(new FileReader(inputFile));
                String line;
                
                // Write the content of the current input file into the output file
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine(); // Adds a newline after each line of content
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + inputFile);
                throw e; // Rethrow the exception to stop further execution
            } finally {
                // Close the reader for the current file
                if (reader != null) {
                    reader.close();
                }
            }
        }

        // Close the BufferedWriter to finalize writing to the output file
        writer.close();
    }
}
