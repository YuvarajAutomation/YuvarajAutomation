package com.java.basic.day3.assignments;

import java.util.Arrays;

public class Anagram {

	/*
	 * Pseudo Code

	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2="potss";
		int a =text1.length();
		int b= text2.length();
		char text3[]=text1.toCharArray();
		char text4[] =text2.toCharArray();
		Arrays.sort(text3);
		Arrays.sort(text4);

		if(text3[a-1] == text4[b-1]) {
			System.out.println("true");
		}

	}

}
