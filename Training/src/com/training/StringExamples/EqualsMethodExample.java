package com.training.StringExamples;

public class EqualsMethodExample {

	public static void main(String[] args) {

		System.out.println("== and equals() difference in String");
		String str1 = new String("masum");
		String str2 = new String("masum");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(str2));

		System.out.println("\n== and equals() difference in StringBuffer");
		StringBuffer sb1 = new StringBuffer("masum");
		StringBuffer sb2 = new StringBuffer("masum");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));

	}

}
