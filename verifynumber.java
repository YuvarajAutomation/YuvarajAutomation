package com.java.basic.day1.assignments;

public class verifynumber {
	/*1. Initialize a number, say, int number= 35;
	 2. If a number is positive, print "The number is positive"
	    If a number is negative, print "The number is negative"
	    If it nether negative nor positive, print as "The number is neither positive nor negative" */
	
public static void main(String[] args) {
	
	int number = 35;
//	int number= -35;
	//int number =-0;
	
	if(number > 0) {
		System.out.println("the number is positive");
	}
	else if(number < 0) {
		System.out.println("the number is negative");
	}
	else {
		System.out.println("The number is neither positive nor negative");
	}
}	

}
