package com.training.exceptionhandling;

class MyException extends Exception {

	MyException(String msg) {
//		super(msg);
		System.out.println(msg);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {

		int i = 2;
		try {
			if (i < 5) {
				throw new MyException("Error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
