package com.java.basic.day3.assignments;

public class Palindrome {

	//Build a logic to find the given string is palindrome or not

	/*
	 * Pseudo Code

	 * a) Declare A String value as"madam"

	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A ="madamte";
		String rev= "";

		char a[]= A.toCharArray();
		int c =a.length;
		System.out.println(c);
		for(int i=0;i<a.length;i++) {
			// System.out.println(a[i]);
		}
		for(int i=c-1;i>=0;i--) {
			//System.out.println(A.charAt(i)); 
			System.out.println("test"+a[i]);
			rev = rev+A.charAt(i);
			System.out.println(rev);

		}
		if(A.equalsIgnoreCase(rev)) {
			System.out.println("palinDrome");

		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
