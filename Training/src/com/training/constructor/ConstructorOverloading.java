package com.training.constructor;

public class ConstructorOverloading {

	int id;
	String name;
	int mark;

	ConstructorOverloading() {
		System.out.println("Hello i am default constructor.");
	}

	ConstructorOverloading(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ConstructorOverloading(int id, String name, int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public void display() {
		System.out.println("Student id : " + id + "\nStudent name : " + name + "\nStudent Mark : " + mark);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(101, "Masum");
		ConstructorOverloading obj2 = new ConstructorOverloading(102, "XYZ", 79);

		obj1.display();
		obj2.display();

	}
}
