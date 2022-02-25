package com.blz.ds;

import java.util.Scanner;

public class LinkedList {
    Scanner scanner = new Scanner(System.in);

    Node head;

    class Node {
        Object data;
        Node next;//next is a reference

        public Node(Object data) {
            this.data = data;
        }
    }

    /*
    Ability to create Linked
List by adding 30 and 56
to 70
- Node with data 70 is First Created
- Next 30 is added to 70
- Finally 56 is added to 30
- LinkedList Sequence: 56->30->70
     */
            /*
        add first method
         */
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    /*
    display linked list method
     */
    public void display() {
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
    /*
    Ability to create Linked List by appending 30 and 70 to 56 Node with data 56 is First Created
-   Next Append 30 to 56 Finally Append 70 to 30 LinkedList Sequence: 56->30->70
     */
    /*
    Add last method
     */
    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else if (head.next == null)
            head.next = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /*
    add middle method
     */

    public void addMiddle(Object data){
        Node newNode = new Node(data);

        if (head==null)
            head=newNode;
        else{
            Node temp =head;
            System.out.println("Enter the data after which new data should be added");
            Object data1 = scanner.nextInt();
            while(temp.data!=data1){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next=newNode;
        }
    }

}
