package com.simplilearn.collectionframework;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
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
