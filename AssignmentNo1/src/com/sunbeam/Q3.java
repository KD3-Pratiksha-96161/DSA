package com.sunbeam;

public class Q3 {

    
static class SortedLinkedList {
 
   class Node {
       int data;
       Node next;

       Node(int d) {
       data = d;
       next = null;
       }
  }

 private Node head;

 public SortedLinkedList() {
    head = null;
 }


public void sortedInsert(int data) {
    Node newNode = new Node(data);

if (head == null || head.data >= newNode.data) {
            newNode.next = head;
             head = newNode;
             return;
            }  
                Node trav = head;
              
                while (trav.next != null && trav.next.data < newNode.data) {
                    trav = trav.next;
                }

                newNode.next = trav.next;
                trav.next = newNode;
            }

            public void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }

            public static void main(String[] args) {
                SortedLinkedList list = new SortedLinkedList();
                
                list.sortedInsert(20);
                list.sortedInsert(10);
                list.sortedInsert(40);
                list.sortedInsert(30);
                list.sortedInsert(5);

                list.display(); 
                
            }
        }
}