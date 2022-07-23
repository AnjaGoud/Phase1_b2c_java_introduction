package com.simplilearn.collectionframework;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> list = new HashSet<>();
		list.add("Dhruvik");
		list.add("Pritham");
		list.add("Tanvi");
		list.add("Kalyan");
		list.add("Dhruvik");

		for (String s : list) {
			System.out.println(s);
		}
	}
}
