package com.training.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<>();

		myPriorityQueue.add(101);
		myPriorityQueue.add(22);
		myPriorityQueue.add(303);
		myPriorityQueue.offer(44);
		myPriorityQueue.offer(55);

		System.out.println(myPriorityQueue);

		myPriorityQueue.remove();

		System.out.println(myPriorityQueue);

		System.out.println(myPriorityQueue.peek());
		myPriorityQueue.remove();
		System.out.println(myPriorityQueue);
		System.out.println(myPriorityQueue.size());
		
		System.out.println(myPriorityQueue.remove(101));
		System.out.println(myPriorityQueue);
				
	}

}
