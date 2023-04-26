package com.training.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		/*
		 * Anonymous Implementation of consumer interface
		 */

//		Consumer<String> consumerTest = new Consumer<String>() {
//
//			@Override
//			public void accept(String str) {
//				System.out.println(str);
//			}
//		};
//		consumerTest.accept("Hello World");

		/*
		 * Anonymous Implementation of consumer interface with the lambda expression
		 */

		Consumer<String> consumerTest = (str) -> System.out.println(str);

		consumerTest.accept("Hello");

//		example=3 [andThen method]
		Consumer<String> consumer1 = (str) -> System.out.println(str + " World");
		Consumer<String> consumer2 = (str) -> System.out.println(str + " Java");
		consumer1.andThen(consumer2).accept("Hello");

		System.out.println();
//		example = 4 
		List<String> myList = Arrays.asList("A", "B", "C");
		Consumer<String> letter = l -> System.out.println(l);
		myList.forEach(letter);

	}
}
