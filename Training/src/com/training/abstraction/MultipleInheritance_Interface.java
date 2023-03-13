package com.training.abstraction;

interface Test1 {

	void show();
}

interface Test2 {
	void print();
}

class Display implements Test1, Test2 {
	@Override
	public void show() {
		System.out.println("Show method of first interface. ");
	}

	@Override
	public void print() {
		System.out.println("Print method of second interface. ");
	}
}

public class MultipleInheritance_Interface {

	public static void main(String[] args) {
		Display obj = new Display();
		obj.show();
		obj.print();
	}

}
