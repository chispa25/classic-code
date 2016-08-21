package com.seb;

import com.seb.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by curland on 7/10/2016.
 */

/**
 DFS
 Step 1: Push the root node in the Stack.
 Step 2: Loop until stack is empty.
 Step 3: Peek the node of the stack.
 Step 4: If the node has unvisited child nodes, get the unvisited child node, mark it as traversed and push it on stack.
 Step 5: If the node does not have any unvisited child nodes, pop the node from the stack.
 */


/**
 BFS
 Step 1: Push the root node in the Queue.
 Step 2: Loop until the queue is empty.
 Step 3: Remove the node from the Queue.
 Step 4: If the removed node has unvisited child nodes, mark them as visited and insert the unvisited children in the queue.
 */

public class DFS_BFS {

    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(10);
        TreeNode d = new TreeNode(2);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;


        System.out.println("********** BFS *************");
        BFS(root);

        clearNodes(root);

        System.out.println("********** DFS *************");
        DFS(root);
    }

     /**
     * returns the left child if not visited, then right child if not visited
     */
    private static TreeNode getUnvisitedChildNode(TreeNode node) {
        if (node.left != null) {
            if (!node.left.visited) {
                return node.left;
            }
        }
        if (node.right != null) {
            if (!node.right.visited) {
                return  node.right;
            }
        }
        return null;
    }

    public static void BFS(TreeNode root) {
        // BFS uses Queue
        Queue<TreeNode> queue = new LinkedList<>();
        root.visited = true;
        queue.add(root);
        System.out.println(root.val);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();  // remove the head of queue
            TreeNode child = null;
            while ((child = getUnvisitedChildNode(node)) != null) {
                child.visited = true;
                System.out.println(child.val);
                queue.add(child);
            }
        }
    }

    public static void DFS(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        root.visited = true;
        System.out.println(root.val);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();   // top of the stack without removing
            TreeNode child = getUnvisitedChildNode(node);
            if(child != null) {
                child.visited = true;
                System.out.println(child.val);
                stack.push(child);
            } else {
                stack.pop();
            }
        }
    }

    public static void clearNodes(TreeNode node){
        if(node != null) {
            clearNodes(node.left);
            node.visited = false;
            clearNodes(node.right);
        }
    }

    public static void printNodes(TreeNode node, boolean showVisited){
        if(node != null) {
            printNodes(node.left, showVisited);
            System.out.println(node.val + (showVisited ? " Visited:" + node.visited : ""));
            printNodes(node.right, showVisited);
        }
    }
}
