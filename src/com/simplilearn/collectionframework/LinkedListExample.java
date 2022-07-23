package com.simplilearn.collectionframework;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Dhruvik");
		list.add("Pritham");
		list.add("Tanvi");
		list.add("Kalyan");
		list.add("Dhruvik");
		
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
