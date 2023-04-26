package com.training.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> (num1 + num2);
		System.out.println(biFunction.apply(10, 20));
		System.out.println(biFunction.apply(200, 10));
	}

}
