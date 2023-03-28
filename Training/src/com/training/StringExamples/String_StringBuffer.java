package com.training.StringExamples;

public class String_StringBuffer {

	public static void main(String[] args) {

		System.out.println("String Example : ");
		String str = new String("abc");
		str.concat("def");
		System.out.println(str);

		System.out.println("\nStringBuffer Example : ");
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);

	}

}
