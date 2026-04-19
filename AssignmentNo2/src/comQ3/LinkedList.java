package com.Q3;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void addLast(int value){
	
		Node newnode = new Node(value);
		
		if(head == null) {
	
			head = newnode;
			
			newnode.next = newnode.prev = newnode;
		}
		
		else {
			
			newnode.next = head;
			
			newnode.prev = head.prev;
			
			head.prev.next = newnode;
			
			head.prev = newnode;
		}
	}
	
	
	public int deleteFirst() {
		
		if(head == null)
			return -1;
		int temp = head.data;
	
		if(head == head.next)
			head = null;
		
		else {
	
			head.prev.next = head.next;
			
			head.next.prev = head.prev;
			
			head = head.next;
		}
		return temp;
	}
	
	public int getFirst() {
		
		if(head == null)
			return -1;
		
		return head.data;
	}

	
	
}