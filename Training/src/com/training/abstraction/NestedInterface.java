package com.training.abstraction;

interface Showable {
	void show();

	interface Message {
		void msg();
	}
}

class Show implements Showable.Message {
	public void msg() {
		System.out.println("Hello, I am nested interface");
	}
}

public class NestedInterface {

	public static void main(String[] args) {
//		Showable.Message message = new Show(); // upcasting
		Show message = new Show();
		message.msg();
	}
}
