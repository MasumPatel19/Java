package com.training.StringExamples;

public class ChainedMethods {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = str1.concat("de").toUpperCase().replace('C', 'x');
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
	}
}
