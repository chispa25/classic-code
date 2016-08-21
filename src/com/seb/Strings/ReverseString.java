package com.seb.Strings;

/**
 * Created by curland on 7/10/2016.
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "hello world";

        System.out.println("********* Reverse by Recursion *********");
        System.out.println(reverseRecursive(str));

        System.out.println("********* Reverse by Iteration *********");
        System.out.println(reverseIterative(str));
    }

    public static String reverseRecursive(String str){
        if(str == null){
            return "";
        }

        if(str.length() == 1){
            return str;
        }

        return reverseRecursive(str.substring(1)) + str.charAt(0);

    }

    public static String reverseIterative(String str){
        if(str == null){
            return "";
        }

        StringBuffer sb = new StringBuffer();

        for(int i=str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
