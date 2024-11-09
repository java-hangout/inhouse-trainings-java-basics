package com.jh.iht.java.basics.collection1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public Queue<String> getQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        return queue;
    }
}