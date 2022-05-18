package com.java.basic.day3.assignments;

public class FindTypes {

	// Here is the input

	static // Here is what the count you need to find
	int  letter = 0;

	static int space = 0;

	static int num = 0;

	static int specialChar = 0;

	// Build the logic to find the count of each
	/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
	 */

	// Print the count here



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test1 = "$$ Welcome to 2nd Class of Automation $$ ";
		int count =0;
		int count1 =0;
		int count2 =0;
		int count3=0;
		char a[] =test1.toCharArray();
		System.out.println(a.length);
		for(int i=0; i<a.length;i++) {
			//	System.out.println("in"+a[i]);
			//System.out.println(Character.isLetter(a[i]));

			if(Character.isLetter(a[i])) {
				count =count+1;

			}

			if(Character.isDigit(a[i])) {
				count1 =count1+1;
			}

			if(Character.isSpace(a[i])) {
				count2 =count2+1;
			}
			else if(!(Character.isLetter(a[i]) || Character.isDigit(a[i]) || Character.isSpace(a[i]))) {

				count3 =count3+1;
			}		
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
	}
}

