package com.training.polymorphism;


public class Method_Overloading {

	static void display()
	{
		System.out.println("Good Morning");
	}
	
	static void display(String fname)
	{
		System.out.println("Good Morning "+fname);
	}
	
//	ERROR : changing return type is not valid
//	static String display(String name)
//	{
//		
//	}
	
	
	public static void main(String[] args) {
		display();
		display("Masum");
		
	}

	
}
