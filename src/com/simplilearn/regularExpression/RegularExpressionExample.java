package com.simplilearn.regularExpression;

import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		String pattern = ".s";
		String input = "ds";

		boolean b = Pattern.matches(pattern, input);
		System.out.println(b);
		System.out.println(Pattern.matches("a{2,5}s", "aaaas"));
		
		
		
		String regex = "^([a-zA-Z0-9_.-]+)@(.+)$";
		
		System.out.println(Pattern.matches(regex, "dhruvik@simplilean.com"));
		System.out.println(Pattern.matches(regex, "dhruvik#simplilean.com"));
		
		System.out.println(Pattern.matches(regex, "dhr_uvik@simplilean.com"));
	}

}
