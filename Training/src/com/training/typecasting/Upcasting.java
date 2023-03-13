package com.training.typecasting;

class Parent {
	void display() {
		System.out.println("This is parent method");
	}
}

class Child extends Parent {
	@Override
	void display() {
		System.out.println("This is child method");
	}
}

public class Upcasting {

	public static void main(String[] args) {

		Parent obj1 = new Child();
		Parent obj2 = (Parent) new Child();
		obj1.display();
		obj2.display();
	}

}
