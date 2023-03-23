package com.training.programs;

public class CallByValue {

	int num = 10;
	int n=200;

	static void display(int num) {
		num += 10;
		System.out.println(num);
	}
	
	void changeNumber(CallByValue obj) {
		obj.n+=30;
		System.out.println(obj.n);
	}

	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		System.out.println("Call by value");
		System.out.println("Number before calling method : "+obj.num);
		display(obj.num);
		System.out.println("Number after calling method : "+obj.num);
		
		System.out.println("\nCall by reference");
		System.out.println("Number before calling method : "+obj.n);
		obj.changeNumber(obj);
		System.out.println("Number after calling method : "+obj.n);
	}
}
