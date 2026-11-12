/*
 *	Author:  Angeline Peng
 *  Date: 11/10/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] arr = new int[(int)(Math.random() * 150 + 51)];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int length = arr.length;
		int total = 0;

		for(int i = 0; i < length; i++){
			arr[i] = (int)(Math.random() * 100 + 1);
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
			total = total + arr[i];
		}
		System.out.println("There are " + length + " elements.");
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Average: " + (total / length));
		
	}
}
