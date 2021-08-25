package com.javaproject;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        int x = 4;
        int y = 7;

        // Comparison Operators:
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println( x < y);
        System.out.println( x <= y);
        System.out.println( x > y);
        System.out.println( x >= y);

        System.out.println("\n");

        // Logical Operators:
        int temperature = 20;
        boolean isWarm = temperature >= 20 && temperature <= 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasHighCredit = false;
        boolean isEligible = hasHighIncome || hasHighCredit;
        System.out.println(isEligible);
    }
}
