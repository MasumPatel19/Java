package com.training.StringExamples;

public class StringBufferCapacity {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer(500);
		System.out.println(sb2.capacity());

		StringBuffer sb3 = new StringBuffer("Masum");
		System.out.println(sb3.capacity());

	}

}
