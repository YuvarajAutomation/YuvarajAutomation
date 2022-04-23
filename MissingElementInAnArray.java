package com.java.basic.day2.assignments;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MissingElementInAnArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Here is the input
 int[] arr = {1,2,3,4,5,6,7};

		// Sort the array	
			
			Arrays.sort(arr);	
			System.out.println(arr[0]);
			System.out.println(arr.length);
			
			// loop through the array (start i from arr[0] till the length of the array)
			for(int i=arr[0]; i<=arr.length-1;i++) {
				System.out.println("arr"+arr[i]);
				System.out.println("i"+i);
			//	System.out.println("arr"+arr[0]);
				// check if the iterator variable is not equal to the array values respectively
				

				if(i != arr[i-1]) {
					// print the number
					System.out.println("in"+i);
					break;
				}
				// once printed break the iteration
				}
			}
				
		

	}


