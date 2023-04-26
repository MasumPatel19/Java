package com.training.innerclass;

import java.util.function.Predicate;

abstract class Employee {
	abstract void show();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Employee obj = new Employee() {

			@Override
			void show() {
				System.out.println("abstract method of Employee class");
			}
		};

		obj.show();
			
	}
}
