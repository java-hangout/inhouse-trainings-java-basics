package com.jh.igniteprogram.java.basics.day01;

public class ControlFlowProgram01 {

    public static String run(int a, int b) {
        if (a > b) {
            return a + " is greater than " + b;
        } else if (a < b) {
            return a + " is smaller than " + b;
        } else {
            return a + " is equal to " + b;
        }
    }
}