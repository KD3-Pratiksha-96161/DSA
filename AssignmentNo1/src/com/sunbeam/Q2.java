package com.sunbeam;

class linkedList {
      static class Node {
        int data;
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public linkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void addFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
    }

    public void insertAfterData(int data, int value) {
        if (head == null) 
        	return;

        Node trav = head;
        while (trav != null && trav.data != data) {
            trav = trav.next;
        }

        if (trav != null) {
            Node newnode = new Node(value);
            newnode.next = trav.next;
            trav.next = newnode;
        } else {
            System.out.println("Data " + data + " not found.");
        }
    }

    public void insertBeforeData(int Data, int value) {
        if (head == null) return;

        if (head.data == Data) {
            addFirst(value);
            return;
        }

        Node trav = head;
        while (trav.next != null && trav.next.data != Data) {
            trav = trav.next;
        }

        if (trav.next != null) {
            Node newNode = new Node(value);
            newNode.next = trav.next;
            trav.next = newNode;
        } else {
            System.out.println("Data " + Data + " not found.");
        }
    }

    public void display() {
        Node trav = head;
        System.out.print("List : ");
        while (trav != null) {
            System.out.print(" " + trav.data);
            trav = trav.next;
        }
        System.out.println("");
    }
}

public class Q2 {
   
    public static void main(String[] args) {
        linkedList list = new linkedList(); 
        
        list.addFirst(30);
        list.addFirst(10);
        
        System.out.println("Initial List:");
        
        list.display();

       list.insertAfterData(10, 20);
       list.insertBeforeData(30, 60);
       
       list.display(); 
    }
}


