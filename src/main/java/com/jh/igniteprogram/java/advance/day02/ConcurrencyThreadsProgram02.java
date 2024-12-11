package com.jh.igniteprogram.java.advance.day02;

public class ConcurrencyThreadsProgram02 {

    // Run method demonstrates pausing a thread using Thread.sleep()
    public static String run(String input) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread is running with input: " + input);
                Thread.sleep(2000); // Pause for 2 seconds
                System.out.println("Thread resumed after pause.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start(); // Start the thread
        return "Thread started with input: " + input;
    }
}
