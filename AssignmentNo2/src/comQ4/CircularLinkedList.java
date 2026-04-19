package comQ4;

public class CircularLinkedList {
	
	static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        data = data;
	    }
	}

	
	   private Node head = null;
	    private Node tail = null;

	    // add to an empty list or at the end
	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head;
	        }
	    }

	    // 1. Add at specific position
	    public void addAtPosition(int data, int pos) {
	        Node newNode = new Node(data);
	        
	        // If adding at first position
	        if (pos == 1) {
	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	                newNode.next = head;
	            } else {
	                newNode.next = head;
	                head = newNode;
	                tail.next = head; 
	            }
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
	            temp = temp.next;
	        }

	        newNode.next = temp.next;
	        temp.next = newNode;
	        if (newNode.next == head) {
	            tail = newNode; 
	        }
	    }

	    // 2. Delete at specific position
	    public void deleteAtPosition(int pos) {
	        if (head == null) return;

	        // If deleting the first node
	        if (pos == 1) {
	            if (head == tail) { 
	                head = null;
	                tail = null;
	            } else {
	                head = head.next;
	                tail.next = head; 
	            }
	            return;
	        }

	        Node temp = head;
	        Node prev = null;
	        for (int i = 1; i < pos && temp.next != head; i++) {
	            prev = temp;
	            temp = temp.next;
	        }

	        if (temp == head) return; 

	        prev.next = temp.next;
	        if (temp == tail) {
	            tail = prev; 
	        }
	    }

	    public void display() {
	        if (head == null) return;
	        Node temp = head;
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(head)");
	    }

	    public static void main(String[] args) {
	        CircularLinkedList list = new CircularLinkedList();
	        list.addLast(10);
	        list.addLast(30);
	        
	        list.addAtPosition(20, 2);
	        list.display(); 
	        
	        list.deleteAtPosition(1);
	        list.display(); 
	    }
	}



