package com.training.StringExamples;

public class OwnImmutableClass {

	private int i;

	OwnImmutableClass(int i) {
		this.i = i;
	}

	public OwnImmutableClass change(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new OwnImmutableClass(i);
		}
	}

	public static void main(String[] args) {

		OwnImmutableClass obj1 = new OwnImmutableClass(20);
		OwnImmutableClass obj2 = obj1.change(30);
		OwnImmutableClass obj3 = obj1.change(20);

		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);

	}
}
