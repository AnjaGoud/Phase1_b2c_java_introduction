package com.simplilearn.collectionframework;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Dhruvik");
		treeSet.add("Pritham");
		treeSet.add("Tanvi");
		treeSet.add("Kalyan");
		treeSet.add("Dhruvik");
		treeSet.add("Atiya");

		for (String s : treeSet) {
			System.out.println(s);
		}
	}

}
