package com.training.innerclass;

interface Test {
	void show();
}

public class AnonymousInnerClassWithInterface {

	public static void main(String[] args) {
		Test obj = new Test() {

			@Override
			public void show() {
				System.out.println("Show method of Test interface");
			}
		};
		obj.show();

		// With Lambda expression
//		Test obj = () -> System.out.println("Show method of Test interface");
//		obj.show();

	}

}
