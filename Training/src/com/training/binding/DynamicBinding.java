package com.training.binding;

class A{
	
	void display() {
		System.out.println("Display method of A class");
	}
}

public class DynamicBinding extends A{

	void display() {
		System.out.println("Display method");
	}
	
	public static void main(String[] args) {
		// object is determined at run-time
		A obj = new DynamicBinding();
		obj.display();
	}

}
