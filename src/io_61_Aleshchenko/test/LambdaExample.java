package io_61_Aleshchenko.test;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        String[] arr = {"ba", "ab", "aa"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(a -> {
            System.out.println(a);
            return a.charAt(0);
        }));
        System.out.println(Arrays.toString(arr));

        /*int[] arr = {1, 2, 3, 6, 5};
        *//*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*//*
        System.out.println(Arrays.toString(arr));
        //sort by Array.sort
        *//*java.util.*//*
        Arrays.sort(arr);
        System.out.println("____");
        *//*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*//*
        System.out.println(Arrays.toString(arr));*/
    }
}
