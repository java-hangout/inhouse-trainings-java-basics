package com.jh.igniteprogram.java.advance.day02;

import java.util.concurrent.CompletableFuture;

public class ExecutiveFramework03 {

    // Run method demonstrates asynchronous programming using CompletableFuture
    public static String run(String taskDescription) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Executing task asynchronously: " + taskDescription);
        });

        // Wait for the task to complete
        future.join();
        return "Task executed asynchronously: " + taskDescription;
    }
}
