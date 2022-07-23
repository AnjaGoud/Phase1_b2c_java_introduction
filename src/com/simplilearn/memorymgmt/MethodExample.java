package com.simplilearn.memorymgmt;



class B1 {
	int a ;
	
}


class A1 {

	// Pass by Value
	int add(int a, int b) {
		a= a+10;
		System.out.println(a);
		return a + b;
	}
	
	// Copy of object reference	
	void test(B1 b1) {
		b1.a=10;
		
		B1 b2 = new B1();
	}

}

public class MethodExample {

	public static void main(String[] args) {
		A1 a1 = new A1();
		int a =1;
		int b = 1;
		int result = a1.add(a,b);
		System.out.println(a);
		System.out.println(result);
		
		//=======================================
		B1 b1 = new B1();					// 3 
		b1.a = 15;
		System.out.println(b1.a);			//15
		a1.test(b1);						
		System.out.println(b1.a);			//10
		
		
		//====================================
		
		A1 aa1 = new A1();	
		B1 bb1 = new B1();
		aa1.test(bb1);

		// How many objects in heap?				--> 3
		// How many local reference creaed?			--> 2 main stack , 1 under test (b) stack
	}
}