package com.training.operator;

public class ShortCircuit_Logical {

	public static boolean checkNumber(int i) {
		if (i < 5) {
			System.out.println("i < 5");
			return true;
		} else {
			System.out.println("i >= 5");
			return false;
		}
	}

	public static void main(String[] args) {
		if ((checkNumber(2)) || (checkNumber(7))) {
			System.out.println("Result is true");
		}
		if ((checkNumber(6)) || (checkNumber(8))) {
			System.out.println("Result is false");
		}
	}

}
