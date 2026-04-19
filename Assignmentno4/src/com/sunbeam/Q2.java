package com.sunbeam;

public class Q2 {
	public static int FibonacciSeries(int n){
		    if (n <= 1) 
		    return n;
		    return FibonacciSeries(n - 1) + FibonacciSeries(n - 2); 

		
	}

	public static void main(String[] args) {
		int res = FibonacciSeries(10);
		System.out.println(res);
	}

}
