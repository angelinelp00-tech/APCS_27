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
		int[] arr = new int[10];
		int count = 9;
		int count2 = 0;
		while(count > -1){
			arr[count2] = count;
			System.out.println(arr[count2]);
			count--;
			count2++;
		}
	}
}
