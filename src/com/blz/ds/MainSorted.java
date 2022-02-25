package com.blz.ds;

public class MainSorted {

    public static void main(String[] args) {
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        for (int i : new int[]{56,30,40, 70}) {
            sortedLinkedList.addSorted(i);
        }
        sortedLinkedList.displaySorted();
    }
}
