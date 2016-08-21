package com.seb;

import java.util.Random;

/**
 * Created by curland on 8/15/2016.
 */
public class RandomNumbers {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        fisherYates(arr);
        printArr(arr);
    }

    /**
     * An improved version (Durstenfeld) of the Fisher-Yates algorithm with O(n) time complexity
     * Permutes the given array
     * @param array array to be shuffled
     */
    public static void fisherYates(int[] array) {
        Random r = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = r.nextInt(i);
            //swap
            int tmp = array[index];
            array[index] = array[i];
            array[i] = tmp;
        }
    }

    public static void printArr(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
