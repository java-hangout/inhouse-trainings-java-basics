package com.jh.iht.java.basics.types;

import java.text.DecimalFormat;

public class NFormattingNumbers {
    // Method to format a number to two decimal places
    public String formatToTwoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(number);
    }
}