package com.training.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<String, String> biPredicate = (str1, str2) -> str1.equals(str2);
		System.out.println(biPredicate.test("Masum", "masum"));
		System.out.println(biPredicate.test("Masum", "Masum"));

	}
}
