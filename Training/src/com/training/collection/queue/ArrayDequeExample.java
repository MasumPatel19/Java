package com.training.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> myArrayDeque = new ArrayDeque<>();

		myArrayDeque.add(11);
		myArrayDeque.add(2);
		myArrayDeque.add(6);
		myArrayDeque.add(3);

		System.out.println(myArrayDeque);

		myArrayDeque.remove();
		System.out.println(myArrayDeque);

		myArrayDeque.addFirst(200);
		System.out.println(myArrayDeque);

		myArrayDeque.addLast(90);
		System.out.println(myArrayDeque);

		System.out.println("First element is : " + myArrayDeque.getFirst());
		System.out.println("Last element is : " + myArrayDeque.getLast());
		
		System.out.println(myArrayDeque);
		myArrayDeque.clear();
		System.out.println(myArrayDeque);

	}

}
