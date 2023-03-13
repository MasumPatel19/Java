package com.training.typecasting;

class Parent1 {
	String name;

	void display() {
		System.out.println("This is parent method");
	}
}

class Child1 extends Parent1 {
	int age;

	@Override
	void display() {
		System.out.println("This is child method");
	}
}

public class Downcasting {

	public static void main(String[] args) {

		Parent1 parent = new Child1();
		parent.name = "Masum";

		Child1 child = (Child1) parent;
		child.age = 22;

		System.out.println(child.name);
		System.out.println(child.age);
		child.display();

	}

}
