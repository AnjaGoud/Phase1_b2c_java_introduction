package com.simplilearn.collectionframework;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Dhruvik");
		queue.add("Atiya");
		queue.add("James");
		queue.add("Bond");
		queue.add("Raj");

		System.out.println(queue.poll());
		System.out.println(queue.element());
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.poll());	
	}
}