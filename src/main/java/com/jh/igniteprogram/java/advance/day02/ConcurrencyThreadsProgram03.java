package com.jh.igniteprogram.java.advance.day02;

public class ConcurrencyThreadsProgram03 {

    // Run method demonstrates using the join() method to wait for a thread to complete
    public static String run(String input) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running with input: " + input);
        });

        try {
            thread.start(); // Start the thread
            thread.join();  // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Thread has completed its task with input: " + input;
    }
}
