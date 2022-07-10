package com.simplilearn.oop.polymorphism;



class Calculator {
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
}





public class PolymorphismExample {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int res = calc.add(5, 6);
		int res1 = calc.add(5, 6,1);
		
		System.out.println(res);
		System.out.println(res1);
		
	}
}
