package com.training.constructor;

class Student {

	int rno;
	String name;
	static String clgName;

	public void show() {

		System.out.println("Rollno : " + rno + "\nName : " + name + "\nClg name : " + clgName);
	}
}

public class StaticKeyword {

//	int i = 1; //show an error 
	static int i = 1;

	
	public static void main(String[] args) {

		System.out.println(i+"\n");
		
		Student student1 = new Student();
		student1.rno = 1;
		student1.name = "Masum";
		Student.clgName = "KS";

		Student student2 = new Student();
		student2.rno = 2;
		student2.name = "XYZ";
		Student.clgName = "KS";

		Student.clgName="BK";

		student1.show();
		student2.show();
	}
}
