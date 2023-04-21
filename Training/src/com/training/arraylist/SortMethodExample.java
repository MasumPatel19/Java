package com.training.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethodExample {

	public static void main(String[] args) {
		ArrayList<String> myaArrayList = new ArrayList<String>();

		myaArrayList.add("A");
		myaArrayList.add("X");
		myaArrayList.add("D");
		myaArrayList.add("P");

		System.out.println(myaArrayList);

		Collections.sort(myaArrayList);

		System.out.println(myaArrayList);

		ArrayList<Integer> myInt = new ArrayList<>();
		myInt.add(11);
		myInt.add(300);
		myInt.add(55);

		System.out.println(myInt);
		Collections.sort(myInt);
		System.out.println(myInt);

	}

}
