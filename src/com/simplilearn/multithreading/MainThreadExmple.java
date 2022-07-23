package com.simplilearn.multithreading;


class A {
	void test() {
		System.out.println("Hello world!");
	}
}


public class MainThreadExmple {

	public static void main(String[] args) {
		A a = new A();
		a.test();
		
	}

}