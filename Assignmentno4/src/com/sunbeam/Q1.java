package com.sunbeam;

public class Q1 {
	public static void binaryToDecimal(int n) {
		if(n==0) {
			return;
	}
		
		
		binaryToDecimal(n/2);
		System.out.print(n % 2);
	}

	public static void main(String[] args) {
		binaryToDecimal(11);

	}

}
