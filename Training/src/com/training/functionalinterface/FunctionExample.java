package com.training.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

//		example = 1
		Function<String, Integer> functionTest = (t) -> t.length();
		System.out.println(functionTest.apply("Hello World"));

//		example = 2
		Function<Integer, String> function1 = (num) -> {
			if (num % 2 == 0) {
				return "Number " + num + " is even.";
			} else {
				return "Number " + num + " is odd.";
			}
		};
		System.out.println(function1.apply(11));
	}

}
