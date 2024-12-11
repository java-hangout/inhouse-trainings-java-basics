package com.jh.igniteprogram.java.advance.day02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutiveFramework01 {

    // Run method demonstrates the use of Thread Pools and Executors
    public static String run(String taskDescription) {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // Create thread pool with 2 threads

        executorService.submit(() -> {
            System.out.println("Executing task: " + taskDescription);
        });

        executorService.shutdown();  // Shut down the executor service after task completion
        return "Task submitted to the thread pool: " + taskDescription;
    }
}
