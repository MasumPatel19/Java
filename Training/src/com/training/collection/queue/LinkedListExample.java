package com.training.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {

		Queue<Integer> myQueue = new LinkedList<>();

		myQueue.offer(11);
		myQueue.offer(22);
		myQueue.offer(33);

		System.out.println(myQueue);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.element());

		System.out.println(myQueue.poll());

		System.out.println(myQueue);

		System.out.println(myQueue.remove());

		System.out.println(myQueue);

	}

}
