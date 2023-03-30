package com.training.programs;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> checkNumbers = (x) -> (x % 2 == 0);

		System.out.printf("Number is even : " + checkNumbers.test(20));
		System.out.printf("\nNumber is even : " + checkNumbers.test(21));
	}

}
