package com.simplilearn.string;

public class StringExample {

	public static void main(String[] args) {
		/*String s = "abc";					// 1 R, 0 H, 1 C
		String s1 = new String("abc"); 		// 2 R, 1H, 1C
		String s2 = "bcd";					// 3R, 1H, 2C
		s2 = new String("efg");				// 3R, 2H, 3C
		String s3 = new String("abc");		// 4R, 3H, 3C
		*/
		String s = "Hello World!";
		System.out.println(s.length());
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 5));		
		
		System.out.println(s.isEmpty());
	
	
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String s1 = "heldo";
		System.out.println(s.equals(s1));

		// Can you string, dynamically?
		
		StringBuffer sb = new StringBuffer();
		sb.append("Dhruvik");						//"Dhruvik"
		
		int marks = 60;
		
		if(marks<80) {
			sb.append(" is a bad programmer");		//"is a bad programmer"
		} else {	
			sb.append(" is a good programmer");
		}
		
		System.out.println(sb.toString());			// Dhruvik is a bad programmer
		
		
		
		
		
	}
}
