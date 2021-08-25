package com.javaproject;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class numberformatting{

    public static void main(String[] args) {
        int result = java.lang.Math.round(3.1F);
        System.out.println(result);

        // Printing Random Number:
        int random = (int) (java.lang.Math.random() * 100);
        System.out.println(random);

        // Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String amount = currency.format(1234567.567);
        System.out.println(amount);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String number = percent.format(0.1);
        System.out.println(number);
    }
}
