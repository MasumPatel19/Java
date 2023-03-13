package com.training.inheritance;

class Parent {

	int num;
	Parent() {
		System.out.println("Parent constuctor");
	}

	// overload constructor
	Parent(int num) {
		this.num=num;
		System.out.println(num);
	}

	public void display() {
		System.out.println("Parent class method");
	}
}

class Child extends Parent {

	public Child() {
		super(5);
		System.out.println("Child constructor");
	}

	public void print() {
		System.out.println("Child class method");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {

		Child obj = new Child();
		obj.display();
		obj.print();

	}

}
