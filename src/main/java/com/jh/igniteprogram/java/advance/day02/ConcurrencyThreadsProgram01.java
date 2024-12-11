package com.jh.igniteprogram.java.advance.day02;

public class ConcurrencyThreadsProgram01 {

    // Run method demonstrates starting a thread using the Thread class
    public static String run(String input) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread is running with input: " + input);
        });
        thread.start(); // Start the thread
        return "Thread started with input: " + input;
    }
}
