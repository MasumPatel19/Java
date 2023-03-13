package com.training.abstraction;

interface ShowStatic{
	static void display()
	{
		System.out.println("I am static method of interface");
	}
}

public class StaticMethod_Interface {

	public static void main(String[] args) {
		ShowStatic.display();
	}

}
