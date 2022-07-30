package com.simplilearn.exceptionhandling;

public class ExceptionHandling1 {

	public void test() {
		
	}
	
	public static void main(String[] args) {
		ExceptionHandling1 obj = null;
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		int a1 = 5;
		int b1 = 0;
		

		if(obj!=null)
		obj.test();
		

		if (b1 != 0) {
			int a = a1 / b1;
		}
		
		int[] arr = new int[3];
		
		try {
			arr[7] =7;	
		} catch(ArrayIndexOutOfBoundsException e) {
			
		}catch(Exception e) {
			
		}
		
		

		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

	}

}
