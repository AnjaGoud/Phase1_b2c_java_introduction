package com.simplilearn.oop.inheritance;

class A {
	int a;

}

class B extends A {
	int b;
}

public class InheritanceExample {

	public static void main(String[] main) {

		B objB = new B();
		objB.b = 7;
		objB.a = 1;
		
		A objA = new A();
		objA.a = 8;
		
		
	}

}
