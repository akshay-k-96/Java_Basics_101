package com.javaproject;


import java.util.Locale;

public class strings{

    public static void main(String[] args) {

        // Strings
        String message = "   Hello to the world" + "!!";
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.endsWith("!!"));
        System.out.println(message.trim());

        // Escape Sequences:
        String word = "printing with a double \"quote\" ";
        System.out.println(word);
        String letter = "printing \t with a double \"quote\" ";
        System.out.println(letter);
        String nextline = "printing \t with a \ndouble \"quote\" ";
        System.out.println(nextline);

    }
}
