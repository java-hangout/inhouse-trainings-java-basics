package com.jh.iht.java.basics.collection1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;

/**
 * Problem Statement:
 * The Queue interface allows elements to be processed in FIFO order. 
 * This test checks if elements are correctly removed from the queue in the same order they were added.
 * 
 * Input:
 * - Queue of tasks ["Task 1

", "Task 2", "Task 3"]
 * 
 * Expected Output:
 * - Task 1, Task 2, Task 3 removed in that order.
 */
public class GQueueInterfaceTest {

    @Test
    public void testQueueMethods() {
        QueueInterface queueInterface = new QueueInterface();
        Queue<String> tasks = queueInterface.getQueue();

        // Remove tasks from the queue (FIFO order)
        Assertions.assertEquals("Task 1", tasks.poll());
        Assertions.assertEquals("Task 2", tasks.poll());
        Assertions.assertEquals("Task 3", tasks.poll());
    }
}