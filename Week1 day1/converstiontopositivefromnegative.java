package com.java.basic.day1.assignments;

public class converstiontopositivefromnegative {

	/*1. Initialize an integer with a negative number
	   like, int number = -40;
	2. Check if the number is a negative number 
	   Hint : any number that is lesser than zero is a negative number
	3. If so, convert the number to a positive numer

	4. Print as below
	        "The number -40 is converted to 40" */
	public static void main(String[] args) {
		int number = -40;

		//single number print
		if(number <0) {

			int positive = number*-1;
			System.out.println("The number"+number+"converted"+positive);

		}
		//iterative 40 numbers conversion		
		/*	for(number=-40;number<0;number++) {
			int positive = number*-1;
			if(positive>0) {

			System.out.println("The number "+number+"is converted to "+positive);
		}
	} */
	}
}


