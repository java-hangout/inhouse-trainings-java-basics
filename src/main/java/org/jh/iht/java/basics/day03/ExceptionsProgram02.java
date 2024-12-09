package org.jh.iht.java.basics.day03;

public class ExceptionsProgram02 {

    public static String run(int a) throws Exception {
        try {
            if (a < 0) {
                // Throwing a custom exception
                throw new IllegalArgumentException("Negative number is not allowed!");
            }
            return "Valid input: " + a;
        } catch (IllegalArgumentException e) {
            // Catching the exception and re-throwing it
            throw new Exception("Caught and rethrown: " + e.getMessage());
        }
    }
}