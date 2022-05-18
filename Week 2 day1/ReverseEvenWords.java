package com.java.basic.day3.assignments;

import java.util.Arrays;

public class ReverseEvenWords {


	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)



	/* Pseudo Code:

	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)

	d)split the words and have it in an array

	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).


	 */


	public static void main(String[] args) {
		String test ="I am a software tester";
		//		int c;
		//		StringBuilder str = new StringBuilder();
		//		String val = null;
		//		System.out.println(test.split(" "));
		//		String[] odd=test.split(" ");
		//
		//
		//
		//		for(int i=0;i<odd.length;i++) {
		//			System.out.println(i);
		//			String b =Arrays.toString(odd);
		//			System.out.println("print::"+b);
		//			 if(i%2 != 0) {
		//val =val+str.reverse().append(odd);
		//			}
		//		
		//			 else {
		//				 val =val+odd[i]+"";
		//			 }
		//			 val =val.trim();
		//			 System.out.println("outer"+val);
		//		}
		String[] t = test.split(" ");

		String val = "";
		for (int i = 0; i < t.length; i++) {

			if (i % 2 == 1)
				val = val + new StringBuilder(t[i]).reverse().toString() + " ";
			else
				val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println(val);

	}

}

