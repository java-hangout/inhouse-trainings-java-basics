package org.jh.iht.java.basics.day01;

public class ControlFlowProgram02 {

    public static String run(boolean a, boolean b) {
        if (a && b) {
            return "Both are true";
        } else if (a || b) {
            return "One of them is true";
        } else {
            return "Both are false";
        }
    }
}