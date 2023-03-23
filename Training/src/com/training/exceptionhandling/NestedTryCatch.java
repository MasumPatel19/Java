package com.training.exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {

		try {
			try {
				int i = 5 / 0;
				System.out.println(i);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int arr[] = new int[5];
				arr[5] = 70;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
