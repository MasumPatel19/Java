package com.training.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throw_Throws {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a, b, c;
		a = 3;
		System.out.println("Enter Number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			b = Integer.parseInt(br.readLine());
			c = a + b;
			if (c < 5) {
				throw new ArithmeticException();
			}
			System.out.println("Output is : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Please enter the valid input because the minimum number for the output is 5");
		}
	}
}