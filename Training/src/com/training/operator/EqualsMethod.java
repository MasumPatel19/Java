package com.training.operator;

public class EqualsMethod {

	public static void main(String[] args) {
		EqualsMethod obj1 = new EqualsMethod();
		EqualsMethod obj2 = new EqualsMethod();
		EqualsMethod obj3 = obj1;

		String s1 = "XXX";
		String s2 = "XXX";
		String s3 = "xxx";
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
