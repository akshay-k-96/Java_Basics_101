package com.javaproject;


import java.util.Arrays;
import java.util.Locale;

public class arrays {

    public static void main(String[] args) {

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 19;
        System.out.println(Arrays.toString(numbers));

        // Another way

        int[] list = {2, 5, 7, 19 ,30};
        System.out.println(list.length);
        System.out.println(Arrays.toString(list));

        // Multidimensional Array

        int[] [] array_numbers = new int [2] [4];
        array_numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(array_numbers));

        int[] [] random_numbers = { { 2, 3, 5}, {4, 7, 9}};
        System.out.println(Arrays.deepToString(random_numbers));



    }
}
