package com.seb.Strings;

/**
 * Created by curland on 8/3/2016.
 */
public class LongestPalindrom {

    public static void main(String[] args) {

        System.out.println(longestPalindrom("AAAA"));

    }

    public static int longestPalindrom(String str){

        char[] chars = str.toCharArray();
        int max = 0;

        for(int i=1; i<str.length(); i++){
            int size1 = palindrom(chars, 0, i-1, i+1);
            int size2 = palindrom(chars, 0, i, i+1);

            if(size1 > max) max = size1;
            if(size2 > max) max = size2;
        }

        return max;
    }

    public static int palindrom(char[] chars, int size, int pos1, int pos2){

        if(pos1 < 0 || pos2 >= chars.length || chars[pos1] != chars[pos2])
            return size;

        return palindrom(chars, size+1, pos1-1, pos2+1);
    }
}
