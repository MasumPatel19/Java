package com.training.programs;

public class Recursion {

	static int factorial(int n) {
		if (n >= 1) {
			return (n * factorial(n - 1));
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Factorial of number 4 is : " + factorial(4));
	}

}
