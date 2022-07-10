package com.simplilearn.oop.access_specifier;

class A {

	private int a;

	public void setA() {
		this.a = 5;
	}
}

public class PrivateAccessSpecifier {

	public static void main(String[] args) {

		A objA = new A();
		// System.out.println(objA.a);
	
	
	
		A1 a1 = new A1();
		a1.test();
	}

}
