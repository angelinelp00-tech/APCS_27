/*
 *	Author:  Angeline Peng
 *  Date: 10/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String one = sc.nextLine();
		System.out.print("Enter another word: ");
		String two = sc.nextLine();
		toString(one);
		toStringCombined(one, two);

		
	}
	public static void toString(String a){
			System.out.println(a);
			return;
	}
	public static void toStringCombined(String a, String b){
		System.out.println(a + " " + b);
		return;
	}
}
