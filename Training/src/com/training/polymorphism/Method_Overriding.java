package com.training.polymorphism;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	@Override
	int getRateOfInterest() {
		return 8;
	}
}

class BOB extends Bank {
	@Override
	int getRateOfInterest() {
		return 5;
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		SBI s = new SBI();
		BOB b = new BOB();

		System.out.println(s.getRateOfInterest());
		System.out.println(b.getRateOfInterest());
	}

}
