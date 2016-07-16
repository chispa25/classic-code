package com.seb;

/**
 * Created by curland on 7/10/2016.
 */
public class SwapInPlace {
    public static void main(String[] args) {
        swap(5, 3);
        swap_opt(5, 3);
    }

    public static void swap(int a, int b) {
        a = b - a; // 9 - 5 = 4
        b = b - a; // 9 - 4 = 5
        a = a + b; // 4 + 5 = 9

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void swap_opt(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
