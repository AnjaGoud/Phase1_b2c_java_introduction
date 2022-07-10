package com.simplilearn.oop.encapsulation;



class A {
	// This property is property accessible within class only
	private int a;
	

	public void setA(int valOfA) {
		a = valOfA;
	}
	
	public int getA() {
		return a;
	}
	
	
}


public class EncapsulationExample {

	
	
	public static void main(String[] args) {
		A objA = new A();
		
		objA.setA(19);
		System.out.println(objA.getA());
		
	}
}
