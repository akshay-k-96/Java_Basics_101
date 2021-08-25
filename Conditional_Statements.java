package com.javaproject;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Conditional_Statements {

    public static void main(String[] args) {
        int temperature = 20;
        if (temperature > 30) {
            System.out.println("It is a hot day");
            System.out.println("Drink Plenty of water");
        } else if (temperature > 20)
            System.out.println("It is a Nice day");
        else
            System.out.println("It is a cold Day");

        // Ternary Operators:
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        // Switch :
        String role = "moderator";
        switch (role) {
            case "admin":
                System.out.println("He is the admin");
                break;
            case "moderator":
                System.out.println("He is the Moderator");
                break;
            default:
                System.out.println("He is the guest");


        }
    }
}

