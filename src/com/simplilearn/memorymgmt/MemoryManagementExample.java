package com.simplilearn.memorymgmt;


class A {
	
	void test() {
		B b = new B();
		b.test();
	}
}

class B {
	
	void test() {
		C c = new C();
		c.test();
	}
}


class C {
	
	void test() {
		System.out.println("In c");
	}
	
}

public class MemoryManagementExample {

	public static void main(String[] args) {
		System.out.println("abc");
		
		
		A a = new A();
		a.test();
	}

}
