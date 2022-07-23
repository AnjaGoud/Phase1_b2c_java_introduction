package com.simplilearn.innerclass;


abstract class A {
	abstract void hello();
}



public class AnnonymousExample {

	public static void main(String[] args) {
		
		A objA = new A() {
			void hello() {
				System.out.println("Hello World");
			}
		};
		
		objA.hello();
	}

}
