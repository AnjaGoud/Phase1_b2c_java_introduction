package com.simplilearn.arrays;

public class ArraysExample {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		// Extended for loop
		/*
		 * for(int i: arr) { System.out.print(arr[i-1]); }
		 */

		int[] arr2 = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		
		int[][] arr3 = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		System.out.println("2D Array Example...");
		System.out.println(arr3.length);
		
		
		for (int i=0; i< arr3.length; i++) {
			int[] innerArray = arr3[i];
			
			for(int j=0; j<innerArray.length; j++) {
				System.out.print(arr3[i][j]);
			}
		}
		

	}
}
