package com.training.inheritance;

class Parent2 {
	public void display() {
		System.out.println("Parent method");
	}
}

class Childx extends Parent2 {
	public void show() {
		System.out.println("First Child method");
	}
}

class Childy extends Parent2 {
	public void print() {
		System.out.println("Second Child method");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Childy obj = new Childy();
		obj.print();
		obj.display();
//		obj.show();	// Show error

	}

}
