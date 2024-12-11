package com.jh.igniteprogram.java.advance.day02;

import java.util.concurrent.CompletableFuture;

public class ExecutiveFramework04 {

    // Run method demonstrates creating and composing Completable Futures
    public static String run(String taskDescription) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Task result: " + taskDescription;
        });

        future = future.thenApplyAsync(result -> {
            return result + " (processed)";
        });

        String finalResult = future.join();  // Wait for the result to be processed
        return finalResult;
    }
}
