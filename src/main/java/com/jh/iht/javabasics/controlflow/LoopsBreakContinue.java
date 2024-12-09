package com.jh.iht.javabasics.controlflow;

public class LoopsBreakContinue {

    // For Loop: Sum the first N numbers
    public static int sumForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // While Loop: Sum the first N numbers
    public static int sumWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Do-While Loop: Sum the first N numbers
    public static int sumDoWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        return sum;
    }

    // Break and Continue: Skip the number 2 using continue in a loop
    public static String breakAndContinueExample(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 2) {
                continue;  // Skip number 2
            }
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
}
