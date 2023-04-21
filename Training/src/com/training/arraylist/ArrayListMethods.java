package com.training.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		List<String> myArrayList = new ArrayList<String>();
		myArrayList.add("X");
		myArrayList.add("Y");
		myArrayList.add(1, "W");
		myArrayList.add(0, "Z");
		System.out.println(myArrayList);

		myArrayList.clear();

		myArrayList.add("A");
		myArrayList.add("B");
		myArrayList.add("C");
		System.out.println(myArrayList);

		myArrayList.set(1, "X");
		System.out.println(myArrayList);

		System.out.println(myArrayList.contains("A"));
		System.out.println(myArrayList.contains("Y"));

		System.out.println("At index of 1 : " + myArrayList.get(1));

		System.out.println("Index of C is : " + myArrayList.indexOf("C"));

		myArrayList.remove(1);

		System.out.println("ArrayList size : " + myArrayList.size() + " And contents is : " + myArrayList);

	}

}
