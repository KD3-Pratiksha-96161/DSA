package com.Q1;

public class CircularList {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node tail;

    // Constructor
    public CircularList() {
        tail = null;
    }


    public void insert(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            tail = newNode;
            tail.next = tail; 
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println();
    }

   
    public void deleteFirst() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;

        if (tail == tail.next) { // only one node
            tail = null;
        } else {
            tail.next = temp.next;
        }
    }

    
    public static void main(String[] args) {

        CircularList cl = new CircularList();

        cl.insert(10);
        cl.insert(20);
        cl.insert(30);

        System.out.println("Circular List:");
        cl.display();

        cl.deleteFirst();

        System.out.println("After deleting first:");
        cl.display();
    }
}
