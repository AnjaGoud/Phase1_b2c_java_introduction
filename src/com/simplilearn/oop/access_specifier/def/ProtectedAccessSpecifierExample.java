package com.simplilearn.oop.access_specifier.def;

import com.simplilearn.oop.access_specifier.A2;

public class ProtectedAccessSpecifierExample extends A2{

	void test1() {
		test();
		System.out.println(this.a);
		
		
		A2 a2 = new A2();
		a2.test();
	}

}
