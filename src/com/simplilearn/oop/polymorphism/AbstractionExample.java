package com.simplilearn.oop.polymorphism;


// Incomplete class
abstract class Car {
	abstract void drive();
	
	void test() {
		System.out.println("Test method invoked");
	}
}

class Jaguar extends Car {
	void drive() {
		System.out.println("Jaguar drive is called");
	}
}

class RangeRover extends Car {
	
	void drive() {
		System.out.println("RangeRover drive is called");
	}
}


public class AbstractionExample {

	public static void main(String[] args) {
		Car car = new Jaguar();
		car.drive();
		
		Car car1 = new RangeRover();
		car1.drive();
	
		
	
		car.test();
	}
	

}
