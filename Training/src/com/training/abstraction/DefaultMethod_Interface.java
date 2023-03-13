package com.training.abstraction;
/*

//	one default method

interface Student {
	void display();

	default void print() {
		System.out.println("Hello, I am default method of student interface.");
	}
}

class Data implements Student {
	@Override
	public void display() {
		System.out.println("Display method of class");
	}
}
*/

// 	multiple default method

interface Student {
	void display();

	default void print() {
		System.out.println("Hello, I am default method of student interface.");
	}
}

interface StudentData {
	default void print() {
		System.out.println("I am default method of studentdata interface.");
	}
}

class Data implements Student, StudentData {

	@Override
	public void display() {
		System.out.println("Display method of class");
	}
	
	/*
	 * // First solution is to create an own method that overrides the default
	 * implementation.
	 * 
	 * public void print() { System.out.println("I am print method of data class");
	 * }
	 */

//	Second solution is to call the default method of the specified interface using super.

	@Override
	public void print() {
		Student.super.print();
	}
}

public class DefaultMethod_Interface {

	public static void main(String[] args) {

		Data obj = new Data();
		obj.display();
		obj.print();

	}

}
