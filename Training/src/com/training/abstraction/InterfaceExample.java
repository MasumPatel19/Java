package com.training.abstraction;

interface Bank {

	int rateOfInterest();
}

class SBI implements Bank {

	@Override
	public int rateOfInterest() {
		return 7;
	}
}

class BOB implements Bank {
	@Override
	public int rateOfInterest() {
		return 5;
	}
}

public class InterfaceExample {

	public static void main(String[] args) {

		Bank bank = new BOB();
//		Bank bank = new SBI();

		System.out.println("Rate of interest is : " + bank.rateOfInterest());
	}

}
