package com.training.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<String> supplierTest = () -> new String("Hello");
		System.out.println(supplierTest.get());
	}

}
