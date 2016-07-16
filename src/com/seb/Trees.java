package com.seb;

import com.seb.utils.TreeNode;

/**
 * Created by curland on 7/10/2016.
 */
public class Trees {

    public static void main(String[] args) {
        TreeNode root = createBST();

        System.out.println("********* In Order *********");
        inOrder(root);

        System.out.println("********* Pre Order *********");
        preOrder(root);

        System.out.println("********* Post Order *********");
        postOrder(root);
    }

    public static void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.left);
            node.print();
            inOrder(node.right);
        }
    }

    public static void preOrder(TreeNode node){
        if(node != null){
            node.print();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            node.print();
        }
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

        return n4;
    }

}
