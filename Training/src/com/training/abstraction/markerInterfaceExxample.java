package com.training.abstraction;

interface testInterface {

}

public class markerInterfaceExxample implements testInterface {

	public void display() {
		System.out.println("Hello, I am display method.");
	}

	public static void main(String[] args) {
		markerInterfaceExxample obj = new markerInterfaceExxample();
		if (obj instanceof testInterface) {
			obj.display();
		} else {
			System.out.println("Class not implemented interface");
		}
	}
}
