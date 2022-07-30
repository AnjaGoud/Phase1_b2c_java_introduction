package com.simplilearn.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


class B {
	public void b() throws FileNotFoundException  {
		//throw new FileNotFoundException();	
	}
}

class A {
	
	public void a() throws FileNotFoundException  {
		B b = new B();
		b.b();
	}
}


class Pen {
	StringBuilder refill = null;
	
	public void write() throws IntNotFoundException {
		
		if(refill == null) {
			throw new IntNotFoundException();
		}
		
		refill.append("test");
	}
}

public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		try {
			p.write();
		} catch (IntNotFoundException e1) {
			System.out.println("Please refill your ink");
		}
		
		
		
		A a = new A();
		try {
			a.a();
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File is not available, please contact your administrator");
		} finally {
			System.out.println("Hey Finally called");
		}

		System.out.println("Program completed");
	}

}
