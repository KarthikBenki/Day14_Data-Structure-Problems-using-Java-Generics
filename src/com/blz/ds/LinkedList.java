package com.blz.ds;

public class LinkedList  {
    Node head =null;
    class Node{
        Object data;
        Node Next=null;//next is a reference

        public Node(Object data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Linked list !!!!");

    }
}
