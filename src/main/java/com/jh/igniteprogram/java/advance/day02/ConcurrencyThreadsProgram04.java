package com.jh.igniteprogram.java.advance.day02;

public class ConcurrencyThreadsProgram04 {

    // Run method demonstrates interrupting a thread
    public static String run(String input) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread started with input: " + input);
                Thread.sleep(5000); // Simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });

        thread.start();
        thread.interrupt();  // Interrupt the thread immediately
        return "Thread has been interrupted with input: " + input;
    }
}
