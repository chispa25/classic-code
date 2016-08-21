package com.seb.utils;

/**
 * Created by curland on 7/10/2016.
 */
public class TreeNode {
    public int val;
    public TreeNode left, right;
    public boolean visited;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }

    public void print(){
        System.out.println(this.val);
    }

}
