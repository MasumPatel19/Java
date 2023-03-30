package com.training.programs;

interface Test {
	public void display();
}

public class LambdaExample {

	public static void main(String[] args) {

		int num = 100;

		Test t1 = () -> {
			System.out.println("Number is :  " + num);
		};
		t1.display();
	}
}
