package com.training.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	static void myPredicateFunction(int num, Predicate<Integer> myPredicate) {
		if (myPredicate.test(num)) {
			System.out.println(num);
			System.out.println("Number is > 5");
		} else {
			System.out.println("Number is < 5");
		}
	}

	public static void main(String[] args) {

//		Predicate<Integer> myPredicate = num -> (num > 18);
//		System.out.println(myPredicate.test(22));

//		myPredicateFunction(2, (i) -> i > 5);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Predicate<Integer> even = i -> i % 2 == 0;

		Predicate<Integer> odd = Predicate.not(even);

		// filtering the even number using even predicate
		List<Integer> evenNumbers = list.stream().filter(even).collect(Collectors.toList());

		// filtering the odd number using odd predicate
		List<Integer> oddNumbers = list.stream().filter(odd).collect(Collectors.toList());
		// Print the Lists
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);

	}

}
