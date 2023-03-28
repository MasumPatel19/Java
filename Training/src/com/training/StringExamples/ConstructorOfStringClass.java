package com.training.StringExamples;

public class ConstructorOfStringClass {

	public static void main(String[] args) {

		char[] ch = { 'H', 'E', 'L', 'L', 'O' };
		String str = new String(ch);
		System.out.println(str);

		byte[] b = { 97, 98, 99 };
		String str1 = new String(b);
		System.out.println(str1);

	}
}
