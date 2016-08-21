package com.seb.LinkedLists;

import com.seb.LinkedLists.LinkedList;

/**
 * Created by curland on 8/1/2016.
 */
public class ReverseLinkedList {

    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        linkedList.appendIntoTail(new LinkedList.Node("1"));
        linkedList.appendIntoTail(new LinkedList.Node("2"));
        linkedList.appendIntoTail(new LinkedList.Node("3"));
        linkedList.appendIntoTail(new LinkedList.Node("4"));
        linkedList.appendIntoTail(new LinkedList.Node("5"));
        linkedList.appendIntoTail(new LinkedList.Node("6"));

        System.out.println("Linked List : " + linkedList);

        reverseList(linkedList);

        System.out.println("Linked List : " + linkedList);
    }

    public static void reverseList(LinkedList list){

        LinkedList.Node p1 = list.head().next();
        LinkedList.Node p2 = p1.next();

        p1.setNext(null);

        while(p2.next() != null){
            LinkedList.Node p3 = p2.next();
            p2.setNext(p1);
            p1 = p2;
            p2 = p3;
        }

        p2.setNext(p1);
        list.head.setNext(p2);
    }

}
