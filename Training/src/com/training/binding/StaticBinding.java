package com.training.binding;

public class StaticBinding {

	private void show() {
		System.out.println("Hello, I am private method");
	}

	public static void main(String[] args) {
		// object is determined at compiled time
		StaticBinding obj = new StaticBinding();
		obj.show();
	}

}
