package com.jh.igniteprogram.java.advance.day02;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ExecutiveFramework05 {

    // Run method demonstrates handling exceptions and timeouts with CompletableFuture
    public static String run(String taskDescription) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (taskDescription.equals("timeout")) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Task result: " + taskDescription;
        });

        try {
            return future.get(2, TimeUnit.SECONDS);  // Set a timeout of 2 seconds
        } catch (Exception e) {
            return "Task timed out or encountered an exception.";
        }
    }
}
