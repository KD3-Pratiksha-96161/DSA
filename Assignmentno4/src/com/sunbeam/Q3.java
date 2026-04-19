package com.sunbeam;


public class Q3 {
	
	    public static int linearSearchNth(int[] arr, int target, int n) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                count++;
	                if (count == n) {
	                    return i; 
	                }
	            }
	        }
	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 20, 40, 20, 50};
	        int target = 20;
	        int n = 3;
	        System.out.println("Index: " + linearSearchNth(numbers, target, n)); // Output: 5
	    }
	}



	

