package com.training.inheritance;

class Parent1
{
	public void display() {
		System.out.println("Parent method");
	}
}
class Child1 extends Parent{
	public void print() {
		System.out.println("First Child ");
	}
}
class Child2 extends Child1{
	public void show() {
		System.out.println("Second child");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.show();
		obj.display();
		obj.print();
	}

}
