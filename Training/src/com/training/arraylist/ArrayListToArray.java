package com.training.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> subject = new ArrayList<String>();
		subject.add("C");
		subject.add("C++");
		subject.add("PHP");
		subject.add("Java");

		System.out.println(subject);

		String[] arr = new String[subject.size()];
//		convert arraylist to array
		subject.toArray(arr);

		System.out.println("\nArray : ");
		for (String result : arr) {
			System.out.print(result + " , ");
		}
//		convert array to arraylist
		System.out.println("\n\nArrayList : ");
		ArrayList<String> newArrayList = new ArrayList<>(Arrays.asList(arr));
		System.out.println(newArrayList);

//		convert arraylist to string
		System.out.println("\nString : ");
		String str = newArrayList.toString();
		System.out.println(str);
		
//		Sorting ArrayList in ascending order
		System.out.println("\nArrayList in ascending order");
		Collections.sort(newArrayList);
		System.out.println(newArrayList);
		
	}
}
