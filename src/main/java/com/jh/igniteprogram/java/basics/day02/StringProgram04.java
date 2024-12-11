package com.jh.igniteprogram.java.basics.day02;

public class StringProgram04 {

    public static String run() {
        // Using StringBuffer (synchronized)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");

        // Using StringBuilder (not synchronized)
        StringBuilder sbuilder = new StringBuilder("Goodbye");
        sbuilder.append(" World!");

        return "StringBuffer: " + sb.toString() + ", StringBuilder: " + sbuilder.toString();
    }
}