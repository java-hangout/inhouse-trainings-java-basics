package org.jh.iht.java.basics.day01;

public class ControlFlowProgram04 {

    public static String run(int limit) {
        StringBuilder result = new StringBuilder();
        
        // Using for loop
        for (int i = 0; i < limit; i++) {
            result.append(i).append(" ");
        }

        // Using while loop
        int j = 0;
        while (j < limit) {
            result.append(j).append(" ");
            j++;
        }

        // Using do-while loop
        int k = 0;
        do {
            result.append(k).append(" ");
            k++;
        } while (k < limit);
        
        return result.toString().trim();
    }
}