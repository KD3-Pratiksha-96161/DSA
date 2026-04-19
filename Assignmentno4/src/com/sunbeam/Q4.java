package com.sunbeam;

public class Q4 {
	
	    public static int linearSearchLast(int[] arr, int key) {
	        
	        for (int i = arr.length - 1; i >= 0; i--) {
	            if (arr[i] == key) {
	                return i; 
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {5, 8, 12, 8, 3};
	        int key = 8;
	        System.out.println("Last index: " + linearSearchLast(numbers, key)); // Output: 3
	    }
	}
