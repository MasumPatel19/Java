package com.training.abstraction;

abstract class Test {
	abstract void calculate(int a, int b);
}

class Add extends Test {

	@Override
	void calculate(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of a number is : " + sum);
	}
}

class Sub extends Test {
	@Override
	void calculate(int a, int b) {
		int sub = a - b;
		System.out.println("Subtraction of a number is : " + sub);
	}
}

public class AbstractClass {

	public static void main(String[] args) {

		Add add = new Add();
		Sub sub = new Sub();

		add.calculate(20, 30);
		sub.calculate(30, 20);

	}

}
