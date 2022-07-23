package com.simplilearn.innerclass;

public class StaticNestedClassExample {

	private static String msg = "Simplilearn";

	static class Inner {
		void hello() {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		StaticNestedClassExample.Inner innerObje = new StaticNestedClassExample.Inner();
		innerObje.hello();
	}

}
