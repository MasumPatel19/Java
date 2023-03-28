package com.training.StringExamples;

public class StringExample {

	public static void main(String[] args) {

		String str = "abc";
		String str2 = str;

		System.out.println(str);
		System.out.println(str2);

		// create new object and now str is a reference variable of that object
//		str = str.concat("def");	
//		System.out.println(str);
//		System.out.println(str2);
		
		//	create a new object but no reference variable is created to access the "def" string
		System.out.println(str.concat("def"));	// 
		System.out.println(str);
		System.out.println(str2);
	}

}
