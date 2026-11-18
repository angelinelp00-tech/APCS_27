/*
 *	Author:  Angeline Peng
 *  Date: 11/17/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] arr = new int[1000];
		for(int e = 0; e < arr.length; e++){
			arr[e] = (int)(Math.random() * 100 + 1);
		}
		toStringArray(arr);
		System.out.println("The average of 1000 random numers is: " + getArrayAverage(arr));
		System.out.println("The maximum of 1000 random numers is: " + getArrayMax(arr));
		System.out.println("The minimum of 1000 random numers is: " + getArrayMin(arr));
	}
	public static void toStringArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		return;
	}
	public static int getArrayAverage(int[] arr){
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		return total/arr.length;
	}
	public static int getArrayMax(int[] arr){
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] arr){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
