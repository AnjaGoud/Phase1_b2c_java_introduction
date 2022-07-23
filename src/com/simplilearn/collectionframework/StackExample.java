package com.simplilearn.collectionframework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Dhruvik");
		stack.push("Atiya");
		stack.push("Ashok");
		stack.push("Anil");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
