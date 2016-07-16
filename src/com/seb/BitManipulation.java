package com.seb;

public class BitManipulation {

    public static void main(String[] args) {
        bitManipulation();
    }



    public static void bitManipulation(){
        int x = 12;
        int y = 8;
        System.out.println("x: " + Integer.toBinaryString(x));
        System.out.println("y:" + Integer.toBinaryString(y));

        System.out.println("x OR y: " + Integer.toBinaryString(x|y));
        System.out.println("x AND y: " + Integer.toBinaryString(x&y));
        System.out.println("x XOR y: " + Integer.toBinaryString(x^y));
    }
}
