package com.jh.igniteprogram.java.advance.day02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutiveFramework02 {

    // Run method demonstrates the use of Callable and Future
    public static String run(String taskDescription) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        Callable<String> callableTask = () -> {
            return "Task result: " + taskDescription;
        };

        Future<String> future = executorService.submit(callableTask);
        String result = future.get();  // Get the result of the task

        executorService.shutdown();  // Shutdown the executor service
        return result;
    }
}
