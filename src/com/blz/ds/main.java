package com.blz.ds;

public class main {
    public static void main(String[] args) {
        System.out.println("Welcome To Linked list !!!!");
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(56);
        linkedList.addLast(70);
        linkedList.addMiddle(30,56);
        linkedList.display();
        linkedList.searchElement(30);
    }

}
