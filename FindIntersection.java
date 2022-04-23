package com.java.basic.day2.assignments;

public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	/*output
	 * 
 first arrya2
first arrya4
first arrya7
	 */
	
	public static void main(String[] args) {
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		

		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				
			/*System.out.println("arraysi"+ a[i]);
			System.out.println("arrays j"+b[j]);
			System.out.println("iteratori"+i);
			System.out.println("iteratorj"+j);*/
				
			if(a[i] ==b[j]) {
				
				System.out.println("first arrya"+a[i]);
					
				}
				
			}
		}
	}
}

	