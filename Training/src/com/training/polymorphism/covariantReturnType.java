package com.training.polymorphism;

class Test {
	Test print() {
		System.out.println("Test class method");
		return this;
	}
}

class Test1 extends Test {
	Test1 print() {
		super.print();
		System.out.println("Test1 class method");
		return this;
	}
}

public class covariantReturnType {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.print();
	}

}
