package com.training.wrapper;

public class Unboxing {

	public static void main(String[] args) {
		Integer num = 10;
		int no = num.intValue();
		int n = num; // Unboxing
		System.out.println(n);
		System.out.println(no);
	}
}
