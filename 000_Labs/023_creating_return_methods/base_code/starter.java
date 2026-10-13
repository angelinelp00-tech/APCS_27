/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.print("First whole number: ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("Second whole number: ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.println(pow(a,b));
	}
	public static int pow(int a, int b){
		int x = a;
		int y = b;
		int count = 1;
		while(y >= count){
			x = x * x;
		}
		return x;
	}
}
