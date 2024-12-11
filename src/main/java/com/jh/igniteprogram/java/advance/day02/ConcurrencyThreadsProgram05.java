package com.jh.igniteprogram.java.advance.day02;

public class ConcurrencyThreadsProgram05 {

    private static int counter = 0;

    // Run method demonstrates race condition and thread safety using synchronization
    public static String run() throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (ConcurrencyThreadsProgram05.class) {
                    counter++;
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        return "Counter value after both threads have finished: " + counter;
    }
}
