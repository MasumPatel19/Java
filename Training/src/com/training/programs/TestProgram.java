package com.training.programs;

public class TestProgram {

	private String str;

	public String get() {
		return str;
	}

	public static void main(String[] args) {

		TestProgram obj = new TestProgram();
		String s = obj.get();
		String s1 = s.toLowerCase(); // error
		System.out.println(s1);		
	}
}