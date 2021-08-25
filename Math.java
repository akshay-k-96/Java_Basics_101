package com.javaproject;


import java.util.Arrays;
import java.util.Locale;

public class Math {

    public static void main(String[] args) {
        int result = java.lang.Math.round(3.1F);
        System.out.println(result);

        // Printing Random Number:
        int random = (int) (java.lang.Math.random() * 100);
        System.out.println(random);
    }
}
