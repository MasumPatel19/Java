package com.training.innerclass;

public class LocalInnerClass {

	private int num = 10;

	void show() {
		class Local {
			void print() {
				System.out.println(num);
			}
		}
		Local obj = new Local();
		obj.print();
	}

	public static void main(String[] args) {
		LocalInnerClass obj1 = new LocalInnerClass();
		obj1.show();
	}
}
