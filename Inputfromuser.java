package com.javaproject;


import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Inputfromuser {

    public static void main(String[] args) {
        System.out.print("Age:");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("Your Age is " + age );

        System.out.print("Name: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("Your Name is " + name);

    }
}
