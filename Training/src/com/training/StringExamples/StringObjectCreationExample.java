package com.training.StringExamples;

public class StringObjectCreationExample {

	public static void main(String[] args) {

		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		System.out.println(str1 == str2);

		String str3 = "Hello World";
		System.out.println(str1 == str3);

		String str4 = "Hello World";
		System.out.println(str3 == str4);

		String str5 = "Hello " + "World";
		System.out.println(str4 == str5);

		String str6 = "Hello";
		String str7 = str6 + " World";
		System.out.println(str4 == str7);

		final String str8 = "Hello";
		String str9 = str8 + " World";
		System.out.println(str4 == str9);

	}

}
