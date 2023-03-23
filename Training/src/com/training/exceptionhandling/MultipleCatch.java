package com.training.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a, b, c;
		a = 6;
		b = 0;
		int arr[] = new int[5];
		try {
			c = a / b;
			System.out.println(c);
			for (int i = 0; i <= 5; i++) {
				arr[i] = i + 1;
			}
			for (int result : arr) {
				System.out.println(result);
			}

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero." + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You can store only 5 numbers in array");
		}
	}

}
