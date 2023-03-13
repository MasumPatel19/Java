package com.training.constructor;

class Parent {

	Parent() {
		System.out.println("Hello , I am parent constructor");
	}
	
	Parent(int num)
	{
		System.out.println("I am a parameterized constructor");
	}
}

public class initializerblock_aftersuper extends Parent {

	initializerblock_aftersuper() {
		super();
		System.out.println("I am a constructor of child.");
	}

//	instance initialized block
	{
		System.out.println("I am instance initialized constructor1");
	}
	
//	static initialized block
	static {
		System.out.println("I am a static instance initialized block1");
	}
	
//	instance initialized block
	{
		System.out.println("I am instance initialized constructor2");
	}
//	static initialized block
	static {
		System.out.println("I am a static instance initialized block2");
	}

	public static void main(String[] args) {

		initializerblock_aftersuper obj = new initializerblock_aftersuper();
		
		System.out.println("Hello, I am main method");
		
		initializerblock_aftersuper obj1 = new initializerblock_aftersuper();

	}

}
