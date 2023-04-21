package com.training.collection;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> myVectorList = new Vector<Integer>();

		System.out.println(myVectorList.capacity());
		myVectorList.add(22);
		myVectorList.add(4);
		myVectorList.add(52);

		System.out.println(myVectorList);
		System.out.println(myVectorList.capacity());
		
		myVectorList.add(0);
		myVectorList.add(1);
		myVectorList.add(532);
		myVectorList.add(272);
		myVectorList.add(49);
		myVectorList.add(502);
		myVectorList.add(2662);
		myVectorList.add(48);
		myVectorList.addElement(2);
		
		System.out.println(myVectorList);
		System.out.println("vector list capacity : "+myVectorList.capacity());
		System.out.println("vector list size : "+myVectorList.size());
	}
}
