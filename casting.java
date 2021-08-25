package com.javaproject;


import java.util.Arrays;
import java.util.Locale;

public class casting {

    public static void main(String[] args) {

        // Implicit Casting

        short x = 3;
        int y = 2;
        System.out.println(x + y);

        // Implicit Casting using float

        double z = 4.0;
        System.out.println(y + z);

        // Explicit Casting
        double a =7.9;
        int b = (int)a + 7;
        System.out.println(b);

        // Wrapper Class

        String c = "1.2";
        double d = Double.parseDouble(c) + 7.9;
        System.out.println(d);




    }
}
