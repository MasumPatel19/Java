package com.training.wrapper;

public class Autoboxing {

	public static void main(String[] args) {
		int num = 50;
		Integer no = Integer.valueOf(num); //	explicitly conversion 
		Integer n = num; // Autoboxing
		System.out.println(n);
		System.out.println(no);
	}
}
