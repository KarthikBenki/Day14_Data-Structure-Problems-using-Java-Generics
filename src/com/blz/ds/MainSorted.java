package com.blz.ds;

public class MainSorted {

    public static void main(String[] args) {
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.addSorted(10);
        sortedLinkedList.addSorted(20);
        sortedLinkedList.addSorted(5);
        sortedLinkedList.displaySorted();
    }
}
