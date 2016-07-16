package com.seb;

/**
 * Created by curland on 7/10/2016.
 */
public class Factorial {
    public static void main(String args[]) {

        //finding factorial of a number in Java using recursion - Example
        System.out.println("factorial of 5 using recursion in Java is: " + factorial(5));

        //finding factorial of a number in Java using Iteration - Example
        System.out.println("factorial of 6 using iteration in Java is: " + fact(6));
    }

    public static int factorial(int number){
        //base case
        if(number == 0){
            return 1;
        }
        return number*factorial(number -1); //is this tail-recursion?
    }

    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }

        return result;
    }
}
