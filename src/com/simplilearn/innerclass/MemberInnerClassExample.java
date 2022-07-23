package com.simplilearn.innerclass;

public class MemberInnerClassExample {

	private String msg = "simplilearn";

	public class Inner {
		void hello() {
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		MemberInnerClassExample obj1 = new MemberInnerClassExample();
		MemberInnerClassExample.Inner innerObj = obj1.new Inner();
		innerObj.hello();
	}
}