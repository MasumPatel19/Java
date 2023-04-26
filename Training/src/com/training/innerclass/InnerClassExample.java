package com.training.innerclass;

import com.training.innerclass.Outer.Inner;

class Outer {
	int x = 100;
	private int y = 33;

	class Inner {
		public void show() {
			System.out.println("I am inner class method ");
			System.out.println("X : " + x);
			System.out.println("Y : " + y);
		}
	}
	
}

public class InnerClassExample {

	public static void main(String[] args) {
		Outer obj = new Outer();
		Inner objInner = obj.new Inner();
		objInner.show();

	}

}
