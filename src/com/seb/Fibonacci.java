package com.seb;

/**
 * Created by curland on 7/10/2016.
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(9));
    }

    public static int fibo(int n){
        System.out.println("Calculating fibo for " + n);
        if (n==0) return 0;
        if (n==1) return 1;

        return fibo(n-1) + fibo(n-2);
    }

}
