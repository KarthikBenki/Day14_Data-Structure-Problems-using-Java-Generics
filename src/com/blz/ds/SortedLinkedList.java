package com.blz.ds;

public class SortedLinkedList<T extends Comparable<T>>{
    T swap;

    Node head;

    class Node<T extends Comparable<T>>{
        T data;
        Node next;


        public Node(T data) {
            this.data = data;
        }
    }

    public <T>void addSorted(T data){
        Node newNode= new Node((Comparable) data);

        if(head == null)
            head = newNode;
        else{
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
            sorting();
        }
    }

    /*
    sorting using bubble
     */
    public <T>void sorting(){
        Node current=head,index=null;
        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.data.compareTo(index.data) > 0) {
                    T swap = (T) current.data;
                    current.data = index.data;
                    index.data = (Comparable) swap;
                }
                index = index.next;
            }
            current = current.next;
        }

    }

    /*
    display linked list method
     */
    public <T>void displaySorted() {
        if (head == null)
            System.out.println("No elements to display");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }


}
