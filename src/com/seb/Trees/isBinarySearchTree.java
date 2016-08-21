package com.seb.Trees;

import com.seb.utils.TreeNode;

/**
 * Created by curland on 8/1/2016.
 */
public class isBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = createBST();

        System.out.println("********* In Order *********");
        inOrder(root);

        System.out.println("********* IS BST *********");
        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        System.out.println(maxHeight(root));
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

    public static boolean isBST(TreeNode node, int min, int max){

        if(node == null){
            return true;
        }

        if(node.val < min || node.val > max){
            return false;
        }

        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
    }

    public static int maxHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        return Math.max(maxHeight(node.left), maxHeight(node.right)) + 1;
    }
}
