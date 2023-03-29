package com.training.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> city = new ArrayList<String>();
		city.add("Ahmedabad");
		city.add("Surat");
		city.add("Rajkot");

		int index = city.indexOf("Surat");
		System.out.println("City names : " + city);
		System.out.println("Surat city index is : " + index);

		city.add(index, "Baroda");
		System.out.println(city);

	}

}
