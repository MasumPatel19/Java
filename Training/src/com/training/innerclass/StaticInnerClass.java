package com.training.innerclass;

class Outer1 {

	static int x = 10;

	static class Inner1 {
		public void display() {
			System.out.println("I am a static inner class " + x);
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {

		Outer1.Inner1 obj = new Outer1.Inner1();
		obj.display();

	}

}
