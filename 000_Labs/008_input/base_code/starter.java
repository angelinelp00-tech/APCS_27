/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your name here: ");
		String name = sc.nextLine();
		System.out.print("Enter your age (one whole number): ");
		int age = sc.nextLine();
		System.out.print("Enter your birth month (one whole number): ");
		int month = sc.nextLine();
		System.out.print("Enter your birth date (one whole number): ");
		int day = sc.nextLine();
		System.out.print("Enter your birth year (one whole number): ");
		int year = sc.nextLine();
		System.out.print("How much is a buck fifty?: ");
		String buck = sc.nextLine();
		
		System.out.print("Hello " + name + "")
	}
}
