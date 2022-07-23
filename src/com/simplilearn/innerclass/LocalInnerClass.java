package com.simplilearn.innerclass;

public class LocalInnerClass {

	private String msg = "Simplilearn";	
	
	void test() {
		int a = 5;
		
		class LocalInner {
			void hello() {
				System.out.println(msg);
			}
		}
		
		LocalInner in = new LocalInner();
		in.hello();
	}
	
	
	public static void main(String[] arg) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.test();
	}
}
