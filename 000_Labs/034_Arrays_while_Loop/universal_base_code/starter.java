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
		int[] arr = new int[1000];
		int count = 0;
		while(count < 1000){
			arr[count] = (int)(Math.random() * 100);
			System.out.println(arr[count]);
			count++;
		}
		
	}
}
