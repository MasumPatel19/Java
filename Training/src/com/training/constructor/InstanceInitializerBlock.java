package com.training.constructor;

public class InstanceInitializerBlock {

	InstanceInitializerBlock(){
		System.out.println("Hello, I am default constructor.");
	}
	
	// instance block
	{
		System.out.println();
		System.out.println("I am 1st Instance initializer block.");
	}
	
	{
		System.out.println("I am a 2nd instance initializer block");
	}
	
	public static void main(String[] args) {
		InstanceInitializerBlock obj = new InstanceInitializerBlock();
		
		System.out.println();
		System.out.println("I am a main method");
	
	}

}
