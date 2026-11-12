/*
 *	Author: Angeline Peng
 *  Date: 11/12/26
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[20];
		System.out.println("These are the 20 numbers: ");
		for(int i = 0; i < 20; i++){
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n----------------------------------------------------------");
		int target = (int)(Math.random() * 10 + 1);
		System.out.println("The random number to look for is " + target);
		int duplicates = 0;
		int ee = 1;
		String two = "";
		for(int e = 0; e < 20; e++){
			if(arr[e] == target){
				System.out.println("Duplicate found at index " + e);
				duplicates++;
			}
			if(e < 19){
				if(arr[e] + 1 == arr[ee]){
				two = two + "Two in a row found at indexes " + e + " and " + ee + ". The numbers are " + arr[e] + " and " + arr[ee] + "\n";
				}
			}
			ee++;
		}
		if(two.equals("")){
			two = "There are no two in a row.";
		}
		System.out.println("The total number of duplicates for " + target + " is " + duplicates);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		System.out.println(two);
	}
}
