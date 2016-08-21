package com.seb.Trees;

import com.seb.utils.TreeNode;

/**
 * Created by curland on 8/1/2016.
 */
public class InsertToBST {

    public static void main(String[] args) {
        TreeNode root = createBST();

        System.out.println("********* In Order *********");
        inOrder(root);

        TreeNode newNode = new TreeNode(7);
        TreeNode newRoot = insert(root, newNode);
        inOrder(newRoot);
    }


    public static TreeNode createBST(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        n2.left = n1;
        n2.right = n3;
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        n4.left = n2;
        n4.right = n5;

        TreeNode n6 = new TreeNode(10);
        n5.right = n6;

        TreeNode n7 = new TreeNode(15);
        n6.right = n7;

        return n4;
    }

    public static void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.left);
            node.print();
            inOrder(node.right);
        }
    }

    public static TreeNode insert(TreeNode root, TreeNode newNode){

        if(root == null){
            root = newNode;
        }
        else if(newNode.val < root.val){
            root.left = insert(root.left, newNode);

        }else if(newNode.val > root.val){
            root.right= insert(root.right, newNode);
        }

        return root;
    }
}
