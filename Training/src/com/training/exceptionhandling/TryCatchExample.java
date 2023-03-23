package com.training.exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {

		int a, b, c;
		a = 6;
		b = 0;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero." + e);
		}
	}

}
