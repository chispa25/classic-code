package com.seb.utils;

/**
 * Created by curland on 7/10/2016.
 */
public class TreeNode {
    public  int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public void print(){
        System.out.println(this.data);
    }

}
