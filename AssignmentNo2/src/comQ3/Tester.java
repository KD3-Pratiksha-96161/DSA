package com.Q3;

public class Tester {

	public static void main(String[] args) {
Queue q = new Queue();
		
		q.push(10);
		q.push(20);
		q.push(30);
		
		System.out.println("Peeked data = " + q.peek());	
		
		System.out.println("Poped data = " + q.pop()); 	
		System.out.println("Poped data = " + q.pop()); 	
		
		q.push(40);
		q.push(50);
		
		System.out.println("Peeked data = " + q.peek());	
		
		while(!q.isEmpty())
			System.out.println("Poped data = " + q.pop());

	}

}
