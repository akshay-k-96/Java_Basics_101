package com.javaproject;

import java.awt.*;
import java.util.Date;

public class datatypes {

    public static void main(String[] args) {
        // write your code here
        // Primitive Datatypes
        byte age = 20;
        int madrid = 13;
        long billion = 1_234_234_000_000L;
        float weight = 57.5F;
        double height = 3000.678D;
        char initial = 'S';
        boolean learning = true;
        System.out.println(learning);

        // Reference Datatypes

        Date now = new Date();
        System.out.println(now);

        // Allocation of memory in Primitive and Reference Datatypes

        // Primitive Datatypes
        int x = 1;
        int y = x;
        x = 2;
        System.out.println(y);

        // Reference Datatypes

        Point point1 = new Point(x = 1, y = 3);
        Point point2 = point1;
        point1.x = 5;
        System.out.println(point2);



    }
}
