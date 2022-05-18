package com.java.basic.day1.assignments;

public class primenumber {
	/*

	 * Goal: To find whether a number is a Prime number or not

	 * 

	 * input: 13

	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:

	 * 1) Print : type: syso, followed by: ctrl + space + enter

	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter

	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter

	 *   
	 * What are my learnings from this code?

	 * 1)

	 * 2)

	 * 3) 
	 * 
	 */

	/*
	 *Output
	 * print whole number1
Prime number
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13

		// Declare a boolean variable flag as false

		// Iterate from 2 to half of the input
		// Divide the input with each for loop variable and check the remainder
		// Set the flag as true when there is no remainder			
		// break the iterator
		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match 
		int a =13;
		boolean b= false;

		for(int i=1;i<=a;i++) {
			System.out.println("print whole number"+i);

			if(a%2==0) {
				b= true;

			}
			break;	
		}


		if(b) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a Prime");
		}

	}

}
