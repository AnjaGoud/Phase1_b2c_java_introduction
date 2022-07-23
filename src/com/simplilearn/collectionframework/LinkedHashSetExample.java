package com.simplilearn.collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> linkedHahSet = new LinkedHashSet<>();
		linkedHahSet.add("Dhruvik");
		linkedHahSet.add("Pritham");
		linkedHahSet.add("Tanvi");
		linkedHahSet.add("Kalyan");
		linkedHahSet.add("Dhruvik");

		for (String s : linkedHahSet) {
			System.out.println(s);
		}
	}

}
