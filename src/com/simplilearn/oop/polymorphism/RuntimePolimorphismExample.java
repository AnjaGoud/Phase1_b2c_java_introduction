package com.simplilearn.oop.polymorphism;

class A {

	public void test() {
		System.out.println("Inside A");
	}
}

class B extends A {

	public void test() {
		System.out.println("Inside B");
	}

}

public class RuntimePolimorphismExample {

	public static void main(String[] args) {
		B objB = new B();
		objB.test();
		
		A objA = new B();
		objA.test();
		
		A objA1 = new A();
		objA1.test();
	}
}
