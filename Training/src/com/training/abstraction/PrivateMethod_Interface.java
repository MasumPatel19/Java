package com.training.abstraction;

interface TestPrivateMethod {

	private void show() {
		System.out.println("Hello,I am private method of interface");
	}

	private static void print() {
		System.out.println("I am static private method");
	}

	default void call() {
		show();
		print();
	}
}

public class PrivateMethod_Interface implements TestPrivateMethod {

	public static void main(String[] args) {

		TestPrivateMethod obj = new PrivateMethod_Interface();
		obj.call();
		
	}
}
