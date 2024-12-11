package com.jh.igniteprogram.java.basics.day03;

import java.util.LinkedList;
import java.util.Queue;

public class Collections1Program04 {

    // Run method to demonstrate Queue interface
    public static String run() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        // Removing elements from the queue
        String removedItem = queue.poll();

        return "Removed item: " + removedItem + ", Remaining queue: " + queue;
    }
}