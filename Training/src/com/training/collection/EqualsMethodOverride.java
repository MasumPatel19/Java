package com.training.collection;

class Test {
	private int testValue;

	Test(int testValue) {
		this.testValue = testValue;
	}

	public int getValue() {
		return testValue;
	}

	public boolean equals(Object obj) {
		if ((obj instanceof Test) && (((Test) obj).getValue() == this.testValue)) {
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsMethodOverride {

	public static void main(String[] args) {
		Test obj1 = new Test(11);
		Test obj2 = new Test(11);

		if (obj1.equals(obj2)) {
			System.out.println("Both objects are equals.");
		} else {
			System.out.println("Both objects are not equals.");
		}
	}
}
