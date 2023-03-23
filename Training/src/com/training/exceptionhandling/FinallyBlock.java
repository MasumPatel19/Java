package com.training.exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {

		int a, b, c;
		a = 6;
		b = 2;
		try {
			c = a / b;
			System.out.println(c);
//			System.out.println("End of execution");	// it will not printed if exception occurred
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("End of execution");
		}
	}
}
