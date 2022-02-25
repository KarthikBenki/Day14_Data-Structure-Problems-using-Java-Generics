package com.blz.ds;

public class MainSorted {

    public static void main(String[] args) {
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.addSorted(56);
        sortedLinkedList.addSorted(30);
        sortedLinkedList.addSorted(40);
        sortedLinkedList.addSorted(70);
        sortedLinkedList.displaySorted();
    }
}
